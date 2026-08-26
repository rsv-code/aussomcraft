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

import java.util.logging.Logger;

import com.aussom.CallStack;
import com.aussom.Environment;
import com.aussom.ThreadScope;
import com.aussom.ast.aussomException;
import com.aussom.types.AussomCallback;
import com.aussom.types.AussomList;
import com.aussom.types.AussomObject;
import com.aussom.types.AussomType;
import com.aussom.types.AussomTypeInt;
import com.aussom.types.Members;

/**
 * The one place a script callback is called.
 *
 * Events, commands and scheduled tasks all funnel through here, so budget
 * accounting, cancellation and error reporting are written once.
 *
 * A fresh Environment, Members and CallStack per run discards less than it
 * looks like. astClass.call builds its own fresh Members and Environment for
 * every function call, so the Members passed here is only the enclosing
 * scope, read solely to seed a closure's captured locals. Script state lives
 * on the object the callback is bound to, so this.counter survives every run
 * while a bare local does not.
 *
 * The fresh CallStack matters because events re-enter: a handler can trigger
 * an event, and one shared stack would interleave two traces.
 *
 * @author Austin Lehman
 */
public class Runner {

    /** Bounds how long one run may take. */
    private final Watchdog watchdog;

    /** Where handler failures are reported. */
    private final Logger log;

    /**
     * Builds a runner.
     *
     * @param Dog is the watchdog bounding runs.
     * @param Log is where handler failures are reported.
     */
    public Runner(Watchdog Dog, Logger Log) {
        this.watchdog = Dog;
        this.log = Log;
    }

    /**
     * Calls a script callback.
     *
     * Never throws. A handler that fails must not take the event, the
     * command or the tick with it, so every failure is logged against the
     * script that caused it and swallowed here.
     *
     * @param Context is the script to run.
     * @param Callback is the script function to call.
     * @param Args is the argument list to pass.
     * @param What names the handler, for log messages.
     * @return The AussomType the callback returned, or null on failure.
     */
    public AussomType run(ScriptContext Context, AussomCallback Callback,
            AussomList Args, String What) {
        if (Context.isDisabled()) {
            return null;
        }

        ScriptEngineHost host = Context.getHost();
        Environment env = new Environment(host);

        // The ci passed here is not what decides the receiver:
        // callWithException overrides curObj and classInstance with the
        // object the callback was bound to. It is set anyway so the
        // environment is coherent if anything reads it before the call.
        AussomObject bound = Callback.getObj();
        env.setEnvironment(bound, new Members(), new CallStack());

        // Pick up any limit the host changed since the last run.
        host.refreshLimits();

        this.watchdog.enter(Context);
        AussomType ret = null;
        try (ThreadScope scope = host.enterInterpreterThread()) {
            ret = Callback.callWithException(env, Args);
        } catch (aussomException e) {
            this.log.warning("Script '" + Context.getName() + "' failed in "
                + What + ": " + e.getMessage() + "\n" + e.getAussomStackTrace());
        } catch (StackOverflowError e) {
            this.log.warning("Script '" + Context.getName() + "' overflowed the stack in "
                + What + ".");
        } catch (Throwable e) {
            this.log.warning("Script '" + Context.getName() + "' threw in "
                + What + ": " + e);
        } finally {
            if (this.watchdog.exit(Context)) {
                this.watchdog.recordCancellation(Context, What);
                ret = null;
            }
        }

        // An Aussom exception can also come back as a value rather than be
        // thrown, and a handler that returns one has failed just the same.
        if (ret != null && ret.isEx()) {
            this.log.warning("Script '" + Context.getName() + "' returned an exception from "
                + What + ": " + ((AussomTypeInt) ret).str());
        }
        return ret;
    }
}
