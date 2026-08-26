/*
 * Copyright 2026 Austin Lehman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lehman.aussomcraft.script;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.lehman.aussomcraft.profile.Profile;

/**
 * The wall clock budget, which is what stops a runaway handler stalling the
 * server for good.
 *
 * The watchdog and the interpreter's cancellation are exercised for real
 * here: a script that loops forever is started and has to stop.
 */
public class WatchdogTest {

    private static final ClassLoader LOADER = WatchdogTest.class.getClassLoader();
    private static final Logger LOG = Logger.getLogger("WatchdogTest");

    private ScriptContext contextFor(String Name) throws Exception {
        ScriptEngineHost host = new ScriptEngineHost(
            Profile.UNTRUSTED.newPolicy(LOADER));
        Path p = Paths.get(Name);
        ScriptContext ctx = new ScriptContext(Name, p, "hash", Profile.UNTRUSTED, host);
        host.setContext(ctx);
        return ctx;
    }

    /** A script that loops forever must be stopped, not merely noticed. */
    @Test
    @Timeout(20)
    public void aRunawayScriptIsCancelled() throws Exception {
        ScriptContext ctx = contextFor("spin.aus");
        ctx.getHost().parseString("spin.aus",
            "class Main { public main() {\n"
          + "  i = 0;\n"
          + "  while (true) { i = i + 1; }\n"
          + "  return 0;\n} }\n");
        assertFalse(ctx.getHost().hasParseErrors());

        Watchdog dog = new Watchdog(50L, 3, LOG);
        dog.start();
        try {
            long began = System.nanoTime();
            dog.enter(ctx);
            try {
                ctx.getHost().run();
            } catch (Exception stopped) {
                // Cancellation surfaces as an exception, which is a pass.
            }
            long tookMs = (System.nanoTime() - began) / 1000000L;

            assertTrue(dog.exit(ctx), "the watchdog must report the run cancelled");
            assertTrue(tookMs < 15000L,
                "an endless loop must be stopped promptly, took " + tookMs + "ms");
        } finally {
            dog.stop();
        }
    }

    /** A run inside its budget is left alone. */
    @Test
    @Timeout(20)
    public void aWellBehavedScriptIsNotTouched() throws Exception {
        ScriptContext ctx = contextFor("quick.aus");
        ctx.getHost().parseString("quick.aus",
            "class Main { public main() {\n"
          + "  i = 0;\n"
          + "  while (i < 1000) { i = i + 1; }\n"
          + "  return 0;\n} }\n");

        Watchdog dog = new Watchdog(5000L, 3, LOG);
        dog.start();
        try {
            dog.enter(ctx);
            assertEquals(0, ctx.getHost().run(), "a short run must finish");
            assertFalse(dog.exit(ctx), "a run inside its budget is not cancelled");
        } finally {
            dog.stop();
        }
    }

    /** Overrunning repeatedly switches the script off rather than costing a tick each time. */
    @Test
    public void repeatedOverrunsDisableTheScript() throws Exception {
        ScriptContext ctx = contextFor("bad.aus");
        Watchdog dog = new Watchdog(50L, 3, LOG);

        dog.recordCancellation(ctx, "test");
        assertFalse(ctx.isDisabled(), "one overrun is a bug, not a pattern");
        dog.recordCancellation(ctx, "test");
        assertFalse(ctx.isDisabled());
        dog.recordCancellation(ctx, "test");
        assertTrue(ctx.isDisabled(), "a script that always overruns must be switched off");
    }

    /** A disabled script is never called into again. */
    @Test
    public void aDisabledScriptIsNotRun() throws Exception {
        ScriptContext ctx = contextFor("off.aus");
        ctx.disable();
        Runner runner = new Runner(new Watchdog(50L, 3, LOG), LOG);
        assertEquals(null, runner.run(ctx, null, new com.aussom.types.AussomList(), "test"),
            "the runner must refuse a disabled context before touching the callback");
    }

    /** Exit clears the cancel, so the engine is usable for the next event. */
    @Test
    public void cancelIsClearedBetweenRuns() throws Exception {
        ScriptContext ctx = contextFor("reuse.aus");
        Watchdog dog = new Watchdog(50L, 3, LOG);

        ctx.getHost().cancel();
        assertTrue(dog.exit(ctx), "a cancelled run is reported");
        assertFalse(ctx.getHost().isCancelled(),
            "the engine must be usable for the next event");
    }

    /**
     * A nested run must not take the outer run's watch with it.
     *
     * Handlers re-enter: a handler does something that fires an event, and
     * that event reaches the same script. When one entry per script was
     * kept, the inner run's exit removed it, and whatever the outer handler
     * did afterwards was never watched again. Looping there hung the server
     * with nothing left to stop it.
     */
    @Test
    public void aNestedRunDoesNotUnwatchTheOuterOne() throws Exception {
        Watchdog dog = new Watchdog(20L, 0, LOG);
        dog.start();
        try {
            ScriptContext ctx = contextFor("nested.aus");

            dog.enter(ctx);                 // outer handler starts
            dog.enter(ctx);                 // it fires an event, same script
            assertFalse(dog.exit(ctx),      // the inner handler returns
                "the inner run was well inside the budget");

            // The outer handler is still running. Past its budget it has to
            // be cancelled, exactly as if nothing had nested inside it.
            long waited = 0L;
            while (!ctx.getHost().isCancelled() && waited < 2000L) {
                Thread.sleep(10L);
                waited += 10L;
            }
            assertTrue(ctx.getHost().isCancelled(),
                "the outer run must still be watched after a nested run ends.");
        } finally {
            dog.stop();
        }
    }
}
