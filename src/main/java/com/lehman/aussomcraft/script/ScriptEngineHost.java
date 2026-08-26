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

import com.aussom.Engine;
import com.aussom.SecurityManagerInt;

import com.lehman.aussomcraft.AussomCraftPlugin;
import com.lehman.aussomcraft.host.Host;
import com.lehman.aussomcraft.paper.TierAware;

/**
 * An Engine that knows which script it is running.
 *
 * The host externs get an Environment and nothing else, so this is how
 * events.on and friends find their script: env.getEngine() is this, and
 * getContext() is the rest. Same pattern as UnitTestRunner in aussom-base.
 *
 * @author Austin Lehman
 */
public class ScriptEngineHost extends Engine implements TierAware {

    /**
     * The script this engine runs. Set once, right after construction,
     * because the context needs the engine and the engine needs the
     * context.
     */
    private ScriptContext context = null;

    /**
     * Builds an engine under the provided policy.
     *
     * @param SecMan is the profile's security manager.
     * @throws Exception on failure to build the engine.
     */
    public ScriptEngineHost(SecurityManagerInt SecMan) throws Exception {
        super(SecMan);
    }

    /**
     * The tier this engine runs at, so the marshaller can include a type's
     * module the first time a value of that type comes back.
     *
     * @return A String with the tier id.
     */
    @Override
    public String getTierId() {
        if (this.context == null) {
            return "untrusted";
        }
        return this.context.getProfile().getId();
    }

    /**
     * Restarts the budget clock for the run in flight, because the time just
     * spent was the host's work rather than the script's.
     */
    @Override
    public void hostWorkDone() {
        AussomCraftPlugin plugin = Host.plugin();
        if (plugin != null && plugin.getWatchdog() != null && this.context != null) {
            plugin.getWatchdog().excuse(this.context);
        }
    }

    /**
     * Gets the script this engine runs.
     *
     * @return A ScriptContext, or null before the loader has set one.
     */
    public ScriptContext getContext() {
        return this.context;
    }

    /**
     * Sets the script this engine runs. Called once by the loader.
     *
     * @param Context is the ScriptContext to attach.
     */
    public void setContext(ScriptContext Context) {
        this.context = Context;
    }
}
