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

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import com.aussom.LoggingInt;
import com.aussom.SecurityManagerInt;
import com.aussom.ast.astClass;
import com.aussom.ast.astFunctDef;

import com.lehman.aussomcraft.aji.AjiGate;
import com.lehman.aussomcraft.paper.PaperModules;
import com.lehman.aussomcraft.profile.Profile;
import com.lehman.aussomcraft.trust.TrustStore;

/**
 * Finds scripts, builds an engine for each, and runs it.
 *
 * One engine per script file, built once here and reused for every run.
 * Construction costs a few milliseconds, which is fine at load and would not
 * be fine on a tick, so it never happens on the run path.
 *
 * @author Austin Lehman
 */
public class ScriptLoader {

    /** Suffix a file must have to be loaded. */
    private static final String SUFFIX = ".aus";

    /** Where scripts live. */
    private final Path scriptDir;

    /** Which script bytes have been elevated. */
    private final TrustStore trust;

    /** Where load messages go. */
    private final Logger log;

    /**
     * Builds a loader.
     *
     * @param ScriptDir is the directory scripts are read from.
     * @param Trust is the grant store.
     * @param Log is where load messages go.
     * @param Dog is the watchdog bounding the one run of main.
     * @param LoadBudgetMs is how long main may take.
     */
    public ScriptLoader(Path ScriptDir, TrustStore Trust,
            Logger Log, Watchdog Dog, long LoadBudgetMs) {
        this.scriptDir = ScriptDir;
        this.trust = Trust;
        this.log = Log;
        this.watchdog = Dog;
        this.loadBudgetMs = LoadBudgetMs;
    }

    /**
     * Bounds the one run of main, which happens here rather than through the
     * Runner.
     */
    private final Watchdog watchdog;

    /**
     * How long main may take. Deliberately larger than a handler's budget: a
     * script legitimately does its setup here, once, and the point is only
     * that it must end. Loading runs on the server thread, so without this a
     * loop in main hangs the server and nothing is watching to stop it.
     */
    private final long loadBudgetMs;

    /**
     * Every .aus file in the script directory, sorted by name so load order
     * is the same on every server.
     *
     * @return A List of paths.
     * @throws IOException when the directory cannot be read.
     */
    public List<Path> discover() throws IOException {
        List<Path> out = new ArrayList<Path>();
        if (!Files.isDirectory(this.scriptDir)) {
            return out;
        }
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(this.scriptDir)) {
            for (Path p : ds) {
                if (Files.isRegularFile(p) && p.getFileName().toString().endsWith(SUFFIX)) {
                    out.add(p);
                }
            }
        }
        Collections.sort(out);
        return out;
    }

    /**
     * Loads a script with its persisted store already in place.
     *
     * The store is seeded before the script runs rather than after. A script
     * reads its own store in main to pick up where it left off, which is
     * what the guide teaches, and restoring afterwards meant main always saw
     * an empty one and any change it made was then overwritten.
     *
     * @param ScriptPath is the file to load.
     * @param Forced is a profile to force, or null to use its grant.
     * @param InitialStore is the persisted store, or null for none.
     * @return A ScriptContext, or null when the script failed to load.
     */
    public ScriptContext load(Path ScriptPath, Profile Forced,
            Map<String, Object> InitialStore) {
        String name = ScriptPath.getFileName().toString();
        String hash;
        String source;
        try {
            byte[] bytes = Files.readAllBytes(ScriptPath);
            hash = TrustStore.hashOf(bytes);
            source = new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            this.log.warning("Could not read script '" + name + "': " + e.getMessage());
            return null;
        }

        Profile profile = this.trust.profileFor(hash);
        if (Forced != null) {
            profile = Forced;
        }

        ScriptEngineHost host;
        try {
            SecurityManagerInt policy = profile.newPolicy(AjiGate.getClassLoader());
            host = new ScriptEngineHost(policy);
            this.warnOnUnresolvableAllowlist(name, policy);
        } catch (Exception e) {
            this.log.warning("Could not build an engine for '" + name + "': " + e.getMessage());
            return null;
        }

        host.setLogger(new ScriptLogger(this.log, name));

        // Modules are registered one at a time rather than through a shared
        // resource include path. A shared path would make aji.aus findable
        // on an untrusted engine, and the point is that it is not there.
        host.addModule("craft.aus", module("craft.aus"));
        if (profile == Profile.DANGEROUS) {
            host.addModule("aji.aus", module("aji.aus"));
        }

        // The generated Paper API for this tier. Registering is cheap; only
        // the core types below and whatever the script includes are parsed.
        try {
            PaperModules.install(host, profile.getId());
        } catch (Exception e) {
            this.log.warning("Could not install the Paper API for '" + name
                + "': " + e.getMessage());
            return null;
        }

        ScriptContext ctx = new ScriptContext(name, ScriptPath, hash, profile, host);
        host.setContext(ctx);
        if (InitialStore != null) {
            ctx.getStore().putAll(InitialStore);
            ctx.recountStore();
        }

        try {
            // Both modules are included for the script rather than left to
            // it. craft.aus is the base API, and aji.aus has to be defined on
            // a trusted engine whether the script asked for it or not,
            // because the host wraps Java objects with AussomJavaObject
            // before the script ever sees them. A script may still write
            // 'include aji;' and it costs nothing: addInclude is idempotent.
            host.addInclude("craft.aus");
            if (profile == Profile.DANGEROUS) {
                host.addInclude("aji.aus");
            }
            host.parseString(ScriptPath.toString(), source);
            if (host.hasParseErrors()) {
                this.log.warning("Script '" + name + "' has parse errors and was not run.");
                return null;
            }

            // Checked after parsing, because that is when the script's own
            // classes exist, and before running, because main registers the
            // handlers that would receive the hijacked shims.
            String stolen = this.shimCollision(host, profile.getId());
            if (stolen != null) {
                this.log.warning("Script '" + name + "' declares a class named '"
                    + stolen + "', which is a generated Paper shim. The host attaches"
                    + " live server objects to shim classes by name, so this would"
                    + " hand the script an API its tier does not grant. Not run."
                    + " Rename the class.");
                ctx.unregisterAll();
                return null;
            }

            // main runs here and not through the Runner, so the watchdog has
            // to be entered by hand. Without it a loop in main is unbounded.
            this.watchdog.enterWith(ctx, this.loadBudgetMs);
            boolean stopped = false;
            try {
                host.run();
            } finally {
                stopped = this.watchdog.exit(ctx);
            }
            if (stopped) {
                this.log.warning("Script '" + name + "' was stopped after taking"
                    + " longer than " + this.loadBudgetMs + "ms to start up."
                    + " Its main is probably looping. Not run.");
                ctx.unregisterAll();
                return null;
            }
        } catch (Exception e) {
            if (this.needsTrust(e, profile)) {
                // Not a failure. The script ships needing Java access and has
                // not been granted any, which is the default state of every
                // script until an operator says otherwise.
                this.log.info("'" + name + "' includes aji, which exists only at"
                    + " the dangerous tier, so it is not running. To elevate:"
                    + " /acraft trust " + name + " dangerous");
            } else {
                this.log.warning("Script '" + name + "' failed to run: " + e.getMessage());
            }
            // The script may have registered handlers before it failed, and
            // those would fire against a half-initialized script.
            ctx.unregisterAll();
            return null;
        }

        this.log.info("'" + name + "' loaded " + profile.getId()
            + " (sha256 " + TrustStore.shortHash(hash) + ")"
            + this.elevationHint(profile, name));
        return ctx;
    }

    /**
     * Whether the script has taken over the name of a generated shim.
     *
     * Shim classes live in one flat namespace under their simple name, and
     * the host wraps a Java object by asking the engine for that name. A
     * script parsed after the modules were installed can define its own
     * class under the same name, and then the host itself attaches a real
     * Player to a class the script wrote, with whatever methods the script
     * chose to declare. That is a full tier bypass, so it is refused rather
     * than resolved.
     *
     * The comparison is against the methods the tier's module declares, not
     * against where the class came from. The interpreter does not record a
     * class's origin, and the method set is the stronger test anyway: it
     * fails a class carrying anything the tier did not grant, whatever route
     * defined it.
     *
     * @param Eng is the parsed engine.
     * @param Tier is the tier id, which names the module directory.
     * @return The stolen name, or null when nothing was taken.
     */
    private String shimCollision(ScriptEngineHost Eng, String Tier) {
        for (String type : PaperModules.allTypeNames()) {
            if (!Eng.containsClass(type)) {
                continue;
            }
            astClass def = Eng.getClassByName(type);
            if (def == null) {
                continue;
            }
            Set<String> granted = PaperModules.allowedMethods(Tier, type);
            if (granted == null) {
                // This tier has no module for the type, so nothing legitimate
                // can have defined a class under that name.
                return type;
            }
            List<astFunctDef> have = def.getAllFunctions();
            if (have == null) {
                continue;
            }
            for (astFunctDef f : have) {
                if (!granted.contains(f.getName())) {
                    return type;
                }
            }
        }
        return null;
    }

    /** Reports allowlist entries that will never match, since a silent denial is hard to debug. */
    private void warnOnUnresolvableAllowlist(String Name, SecurityManagerInt Policy) {
        for (String miss : AjiGate.unresolvable(Policy)) {
            this.log.warning("Script '" + Name + "': allowlist entry '" + miss
                + "' does not resolve through " + AjiGate.getClassLoader()
                + " and will never match.");
        }
    }

    /**
     * Whether a load failure is just an ungranted script reaching for AJI.
     * The interpreter reports a missing module, which is true but says
     * nothing about why it is missing, and is not a fault worth a warning.
     *
     * The message this produces has to name the dangerous tier. aji.aus is
     * added only at that tier, so a trusted grant leaves the module just as
     * missing, and an operator following a hint that said 'trusted' would
     * grant it, reload, and read the very same line again.
     */
    private boolean needsTrust(Exception E, Profile P) {
        return P != Profile.DANGEROUS
            && String.valueOf(E.getMessage()).contains("'aji.aus'");
    }

    private String elevationHint(Profile P, String Name) {
        if (P == Profile.UNTRUSTED) {
            return ". To elevate: /acraft trust " + Name;
        }
        return "";
    }

    /**
     * The Aussom source of a host module, read from this jar.
     *
     * @param Name is the module file name, such as craft.aus.
     * @return A String with its source, or an empty one when it is missing.
     */
    private String module(String Name) {
        String path = "/com/lehman/aussomcraft/aus/" + Name;
        try (InputStream in = ScriptLoader.class.getResourceAsStream(path)) {
            if (in == null) {
                this.log.severe("Missing bundled module '" + Name + "'.");
                return "";
            }
            return new String(in.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            this.log.severe("Could not read bundled module '" + Name + "': "
                + e.getMessage());
            return "";
        }
    }

    /**
     * Routes a script engine's output to the server log, tagged with the script
     * that produced it.
     */
    public static class ScriptLogger implements LoggingInt {

        private final Logger log;
        private final String prefix;

        /**
         * Builds a logger for one script.
         *
         * @param Log is the server log.
         * @param ScriptName is the script's file name.
         */
        public ScriptLogger(Logger Log, String ScriptName) {
            this.log = Log;
            this.prefix = "[" + ScriptName + "] ";
        }

        @Override
        public void log(String Str) {
            this.log.info(this.prefix + Str);
        }

        @Override
        public void trc(String Str) {
            this.log.finest(this.prefix + Str);
        }

        @Override
        public void dbg(String Str) {
            this.log.fine(this.prefix + Str);
        }

        @Override
        public void info(String Str) {
            this.log.info(this.prefix + Str);
        }

        @Override
        public void warn(String Str) {
            this.log.warning(this.prefix + Str);
        }

        @Override
        public void err(String Str) {
            this.log.severe(this.prefix + Str);
        }

        @Override
        public void print(String Text) {
            this.log.info(this.prefix + Text);
        }

        @Override
        public void println(String Text) {
            this.log.info(this.prefix + Text);
        }
    }

    /** @return the directory scripts are read from. */
    public File getScriptDir() {
        return this.scriptDir.toFile();
    }
}
