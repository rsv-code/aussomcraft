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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import com.lehman.aussomcraft.profile.Profile;
import com.lehman.aussomcraft.profile.ScriptPolicy;
import com.lehman.aussomcraft.trust.TrustStore;

/**
 * A script including another script from its own directory.
 *
 * Trusted and dangerous get their script's directory on the include path.
 * Untrusted gets none, so a script at that tier is whatever is in its own
 * file and nothing else.
 *
 * These go through ScriptLoader rather than an Engine built by hand, so
 * they exercise the wiring and not just the helper that names the paths.
 * They are filesystem includes, so unlike the generated Paper modules they
 * resolve from target/classes and stay ordinary unit tests.
 *
 * @author Austin Lehman
 */
public class ScriptIncludeIT {

    /** A helper a script may include. Defines a class nothing else does. */
    private static final String HELPER =
        "class SideKick {\n"
      + "    public who() { return \"sidekick\"; }\n"
      + "}\n";

    /** A script that includes the helper and uses it. */
    private static final String USES_HELPER =
        "include helper;\n"
      + "class Main {\n"
      + "    public main() { s = new SideKick(); return 0; }\n"
      + "}\n";

    /** Captures what the loader logged, so a refusal can be told from a typo. */
    private static class Capture extends Handler {
        private final List<String> lines = new ArrayList<String>();

        @Override
        public void publish(LogRecord record) {
            this.lines.add(record.getLevel() + " " + record.getMessage());
        }

        @Override
        public void flush() { }

        @Override
        public void close() { }

        String text() {
            return String.join("\n", this.lines);
        }
    }

    /** Builds a loader over a directory, with a logger that records. */
    private ScriptLoader loaderFor(Path Dir, Capture Log) throws Exception {
        Logger log = Logger.getLogger("ScriptIncludeIT-" + Dir.hashCode());
        log.setUseParentHandlers(false);
        log.setLevel(Level.ALL);
        for (Handler h : log.getHandlers()) {
            log.removeHandler(h);
        }
        log.addHandler(Log);

        TrustStore trust = new TrustStore(new File(Dir.toFile(), "trust.yml"));
        trust.load();
        Watchdog dog = new Watchdog(5000L, 5, log);
        dog.start();
        return new ScriptLoader(Dir, trust, log, dog, 5000L);
    }

    private static Path write(Path Dir, String Name, String Body) throws Exception {
        Path p = Dir.resolve(Name);
        Files.write(p, Body.getBytes(StandardCharsets.UTF_8));
        return p;
    }

    // ------------------------------------------------------------------
    // The paths themselves
    // ------------------------------------------------------------------

    /** Untrusted is given no script directory at all. */
    @Test
    public void untrustedGetsNoScriptDirectory() {
        assertNull(IncludePaths.scriptDir(Profile.UNTRUSTED, Path.of("/s/a.aus")),
            "untrusted must not be given a script include path");
    }

    /** The other two are given the directory holding the script. */
    @ParameterizedTest
    @EnumSource(value = Profile.class, names = { "TRUSTED", "DANGEROUS" })
    public void higherTiersGetTheScriptsOwnDirectory(Profile p) {
        Path got = IncludePaths.scriptDir(p, Path.of("s", "a.aus"));
        assertNotNull(got, p.getId() + " must be given a script include path");
        assertEquals(Path.of("s").toAbsolutePath(), got,
            p.getId() + " must get the directory holding the script");
    }

    /** Each tier's resource path names that tier and no other. */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void eachTierResourcePathNamesOnlyItself(Profile p) {
        String path = IncludePaths.paperResource(p);
        assertTrue(path.endsWith("/" + p.getId() + "/"),
            p.getId() + " resource path must end in its own tier: " + path);
        for (Profile other : Profile.values()) {
            if (other != p) {
                assertFalse(path.contains("/" + other.getId() + "/"),
                    p.getId() + " resource path must not name " + other.getId()
                    + ": " + path);
            }
        }
    }

    // ------------------------------------------------------------------
    // Loading for real
    // ------------------------------------------------------------------

    /**
     * A script over the source limit is refused before it is read.
     *
     * ScriptLoader hands the script to Engine.parseString rather than
     * parseFile, so the engine never measures it: parseString takes what it
     * is given. The limit has to be applied here or it applies nowhere, and
     * an oversized file would be read whole into memory before anything
     * objected.
     */
    @Test
    public void aScriptOverTheSourceLimitIsRefused(@TempDir Path dir) throws Exception {
        StringBuilder body = new StringBuilder("class Main {\n  public main() {\n");
        while (body.length() <= ScriptPolicy.maxSourceBytes()) {
            body.append("    // padding padding padding padding padding padding\n");
        }
        body.append("    return 0;\n  }\n}\n");
        Path big = write(dir, "big.aus", body.toString());
        assertTrue(Files.size(big) > ScriptPolicy.maxSourceBytes(), "the fixture must be over the limit");

        Capture log = new Capture();
        assertNull(this.loaderFor(dir, log).load(big, Profile.UNTRUSTED, null),
            "a script over the limit must not load");
        assertTrue(log.text().contains("over the limit"),
            "and must be refused for its size, not for something else. Log was:\n"
            + log.text());
    }

    /**
     * The paired positive. A script just under the limit loads, so the
     * refusal above is the size and not the loader failing on large input.
     */
    @Test
    public void aScriptUnderTheSourceLimitLoads(@TempDir Path dir) throws Exception {
        StringBuilder body = new StringBuilder("class Main {\n  public main() {\n");
        while (body.length() < ScriptPolicy.maxSourceBytes() - 4096) {
            body.append("    // padding padding padding padding padding padding\n");
        }
        body.append("    return 0;\n  }\n}\n");
        Path ok = write(dir, "ok.aus", body.toString());
        assertTrue(Files.size(ok) < ScriptPolicy.maxSourceBytes(), "the fixture must be under the limit");

        Capture log = new Capture();
        assertNotNull(this.loaderFor(dir, log).load(ok, Profile.UNTRUSTED, null),
            "a large but permitted script must still load. Log was:\n" + log.text());
    }

    /** Trusted and dangerous can include a helper sitting beside them. */
    @ParameterizedTest
    @EnumSource(value = Profile.class, names = { "TRUSTED", "DANGEROUS" })
    public void aScriptCanIncludeASiblingAboveUntrusted(Profile p, @TempDir Path dir)
            throws Exception {
        write(dir, "helper.aus", HELPER);
        Path main = write(dir, "main.aus", USES_HELPER);

        Capture log = new Capture();
        ScriptContext ctx = this.loaderFor(dir, log).load(main, p, null);

        assertNotNull(ctx, p.getId() + " must load a script that includes a"
            + " sibling. Log was:\n" + log.text());
        assertTrue(ctx.getHost().containsClass("SideKick"),
            p.getId() + " must have the included class defined. Log was:\n"
            + log.text());
    }

    /**
     * Untrusted cannot, and fails on the missing include rather than on
     * anything else.
     *
     * The message is asserted because a script that failed to load for some
     * other reason would also return null, and that would pass a test that
     * only checked for null.
     */
    @Test
    public void untrustedCannotIncludeASibling(@TempDir Path dir) throws Exception {
        write(dir, "helper.aus", HELPER);
        Path main = write(dir, "main.aus", USES_HELPER);

        Capture log = new Capture();
        ScriptContext ctx = this.loaderFor(dir, log).load(main, Profile.UNTRUSTED, null);

        assertNull(ctx, "untrusted must not load a script that includes a sibling");
        assertTrue(log.text().contains("helper.aus"),
            "untrusted must fail on the missing include, naming it. Log was:\n"
            + log.text());
    }

    /**
     * The same script loads at untrusted once the include is removed.
     *
     * Proves the test above refuses the include rather than the script, so
     * a loader that refused everything could not pass this file quietly.
     */
    @Test
    public void untrustedStillLoadsAScriptWithNoInclude(@TempDir Path dir)
            throws Exception {
        Path main = write(dir, "main.aus",
            "class Main { public main() { return 0; } }\n");

        Capture log = new Capture();
        ScriptContext ctx = this.loaderFor(dir, log).load(main, Profile.UNTRUSTED, null);

        assertNotNull(ctx, "untrusted must still load an ordinary script. Log was:\n"
            + log.text());
    }
}
