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

package com.lehman.aussomcraft;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;

import com.aussom.types.AussomNull;
import com.aussom.types.AussomType;

import com.lehman.aussomcraft.aji.AjiGate;
import com.lehman.aussomcraft.command.AcraftCommand;
import com.lehman.aussomcraft.host.Host;
import com.lehman.aussomcraft.paper.Marshal;
import com.lehman.aussomcraft.profile.Profile;
import com.lehman.aussomcraft.script.Runner;
import com.lehman.aussomcraft.script.ScriptContext;
import com.lehman.aussomcraft.script.ScriptLoader;
import com.lehman.aussomcraft.script.Watchdog;
import com.lehman.aussomcraft.trust.TrustStore;

/**
 * The plugin.
 *
 * @author Austin Lehman
 */
public class AussomCraftPlugin extends JavaPlugin implements ScriptLoader.ModuleSource {

    /** Directory under the plugin's data folder where scripts live. */
    private static final String SCRIPT_DIR = "scripts";

    /** File under the plugin's data folder holding trust grants. */
    private static final String TRUST_FILE = "trust.yml";

    /** File under the plugin's data folder holding script stores. */
    private static final String STORE_FILE = "store.yml";

    /**
     * How long one run may take, in milliseconds, when config.yml does not
     * say. One tick is 50, and this is deliberately larger: a script's first
     * run costs around 44ms in class loading and reflection before the JIT
     * has seen it, so a tick-sized budget cancels handlers doing nothing
     * wrong. Must match the default written in config.yml, or deleting the
     * key changes behaviour rather than restoring it.
     */
    private static final long DEFAULT_BUDGET_MS = 250L;

    /** How many overruns a script gets before it is switched off. */
    private static final int DEFAULT_MAX_CANCELS = 20;

    /**
     * How long a script's main may take, in milliseconds. Larger than a
     * handler's budget because setup happens once and may legitimately be
     * slower, but finite because loading holds the server thread.
     */
    private static final long DEFAULT_LOAD_BUDGET_MS = 5000L;

    /**
     * How much one script may keep in its store, in bytes. Generous enough
     * for per-player data on a large server, small enough that a script
     * cannot fill a disk.
     */
    private static final long DEFAULT_STORE_MAX_BYTES = 1024L * 1024L;

    /** Loaded scripts by file name. */
    private final Map<String, ScriptContext> scripts =
        new ConcurrentHashMap<String, ScriptContext>();

    /** How much one script may keep in its store, in bytes. */
    private long storeMaxBytes = DEFAULT_STORE_MAX_BYTES;

    /**
     * Command names no script below the dangerous tier may register.
     *
     * Bukkit refuses a name something else owns, and scripts load after
     * every plugin, so a real owner always wins. This covers the case
     * neither settles: a sensitive name nobody happens to own right now. A
     * script can take `login` on a server whose authentication plugin is
     * absent and be handed what players type at it.
     */
    private final Set<String> protectedCommands = new HashSet<String>();

    private TrustStore trust = null;
    private ScriptLoader loader = null;
    private Runner runner = null;
    private Watchdog watchdog = null;

    /** Cached module source, read from the jar once. */
    private String craftSource = null;
    private String ajiSource = null;

    @Override
    public void onEnable() {
        // Every class name AJI resolves goes through this loader. The system
        // class loader holds Paperclip and nothing else: it is a sibling of
        // the server loader rather than an ancestor, so it cannot see
        // org.bukkit at all. Getting this wrong does not fail loudly, it
        // makes every allowlist entry silently unresolvable.
        AjiGate.setClassLoader(this.getClass().getClassLoader());

        Host.setPlugin(this);

        this.getDataFolder().mkdirs();
        new File(this.getDataFolder(), SCRIPT_DIR).mkdirs();

        this.trust = new TrustStore(new File(this.getDataFolder(), TRUST_FILE));
        try {
            this.trust.load();
        } catch (IOException e) {
            this.getLogger().severe("Could not read " + TRUST_FILE
                + ", so every script will load untrusted: " + e.getMessage());
        }

        this.saveDefaultConfig();
        long budget = this.getConfig().getLong("watchdog.budget-ms", DEFAULT_BUDGET_MS);
        int maxCancels = this.getConfig().getInt("watchdog.max-cancels", DEFAULT_MAX_CANCELS);
        this.watchdog = new Watchdog(budget, maxCancels, this.getLogger());
        this.watchdog.start();
        this.runner = new Runner(this.watchdog, this.getLogger());

        long loadBudget = this.getConfig().getLong("watchdog.load-budget-ms",
            DEFAULT_LOAD_BUDGET_MS);
        this.storeMaxBytes = this.getConfig().getLong("store.max-bytes",
            DEFAULT_STORE_MAX_BYTES);
        this.protectedCommands.clear();
        for (String c : this.getConfig().getStringList("commands.protected")) {
            this.protectedCommands.add(c.trim().toLowerCase(Locale.ROOT));
        }

        // This plugin's own command and its alias are protected whatever the
        // config says. Which names a server wants to reserve is a matter of
        // preference; these two are not. A script answering /acraft could
        // report a tier it does not have and a trust store that is not
        // there, which is the one lie this plugin cannot afford. Adding them
        // here rather than relying on the file also covers every install
        // whose config.yml was written before they were listed in it.
        this.protectedCommands.add("acraft");
        this.protectedCommands.add("ac");
        Path scriptDir = new File(this.getDataFolder(), SCRIPT_DIR).toPath();
        this.loader = new ScriptLoader(scriptDir, this.trust, this, this.getLogger(),
            this.watchdog, loadBudget);

        AcraftCommand cmd = new AcraftCommand(this);
        if (this.getCommand("acraft") != null) {
            this.getCommand("acraft").setExecutor(cmd);
            this.getCommand("acraft").setTabCompleter(cmd);
        }

        // Loaded on the first tick rather than here, so every other plugin
        // has enabled and claimed its commands first.
        //
        // Bukkit gives a bare command label to whoever registers it first.
        // Loading during our own enable meant a script could register
        // "login" before the authentication plugin that owns it, and be
        // handed whatever players typed after it. Going last means a real
        // plugin always wins its own name and the script falls back to
        // script:name, which is what the fallback prefix is for.
        Bukkit.getScheduler().runTask(this, () -> this.reloadScripts());
    }

    @Override
    public void onDisable() {
        for (ScriptContext ctx : this.scripts.values()) {
            ctx.unregisterAll();
        }
        this.saveStores();
        this.scripts.clear();
        if (this.watchdog != null) {
            this.watchdog.stop();
        }
        Host.setPlugin(null);
    }

    /**
     * Drops every loaded script and loads the script directory again.
     *
     * @return A List of messages describing what happened, for the console.
     */
    public List<String> reloadScripts() {
        List<String> out = new ArrayList<String>();

        this.saveStores();
        for (ScriptContext ctx : this.scripts.values()) {
            ctx.unregisterAll();
        }
        this.scripts.clear();

        List<Path> found;
        try {
            found = this.loader.discover();
        } catch (IOException e) {
            out.add("Could not read the scripts directory: " + e.getMessage());
            return out;
        }

        Map<String, Object> stores = this.readStores();
        for (Path p : found) {
            ScriptContext ctx = this.loader.load(p, null,
                storeFor(p.getFileName().toString(), stores));
            if (ctx == null) {
                out.add(p.getFileName() + ": failed to load, see the log");
                continue;
            }
            this.scripts.put(ctx.getName(), ctx);
            out.add(ctx.getName() + ": " + ctx.getProfile().getId());
        }
        if (found.isEmpty()) {
            out.add("No scripts found in " + SCRIPT_DIR + "/");
        }
        return out;
    }

    /**
     * Reloads one script under whatever its bytes are currently granted.
     * Used after a grant changes, so an operator does not have to reload
     * everything to see the effect of one command.
     *
     * @param ScriptPath is the file to reload.
     * @return A ScriptContext, or null on failure.
     */
    public ScriptContext reloadScript(Path ScriptPath) {
        return this.runOnce(ScriptPath, null);
    }

    /**
     * Detaches a script and stops it.
     *
     * @param Name is the script file name.
     * @return A boolean with true when a script was loaded to unload.
     */
    public boolean unloadScript(String Name) {
        ScriptContext ctx = this.scripts.get(Name);
        if (ctx == null) {
            return false;
        }
        // Saved while the script is still in the map. saveStores walks that
        // map, so removing first meant an unloaded script's store was never
        // written and its data was dropped.
        this.saveStores();
        this.scripts.remove(Name);
        ctx.unregisterAll();
        return true;
    }

    /**
     * Loads one script, optionally under an explicitly named profile and
     * without touching the grant store. This is what /acraft load uses,
     * with and without its --as override.
     *
     * @param ScriptPath is the file to run.
     * @param Forced is the profile to run it under, or null for its grant.
     * @return A ScriptContext, or null on failure.
     */
    public ScriptContext runOnce(Path ScriptPath, Profile Forced) {
        String name = ScriptPath.getFileName().toString();

        // Detach what is running for this file BEFORE attempting the load.
        // Doing it afterwards, only on success, left a failed reload with the
        // previous engine still registered and its handlers still attached.
        // After an untrust that meant the trusted script kept running with
        // full Java access, which is the opposite of what was asked for.
        this.saveStores();
        ScriptContext old = this.scripts.remove(name);
        Map<String, Object> carried = null;
        if (old != null) {
            carried = new ConcurrentHashMap<String, Object>(old.getStore());
            old.unregisterAll();
        }

        if (carried == null) {
            // Not currently loaded, so its store is whatever is on disk.
            carried = storeFor(name, this.readStores());
        }
        ScriptContext ctx = this.loader.load(ScriptPath, Forced, carried);
        if (ctx != null) {
            this.scripts.put(ctx.getName(), ctx);
        }
        return ctx;
    }

    /**
     * Wraps a Bukkit event for the script side.
     *
     * The event arrives as its generated shim, the same as any other Bukkit
     * object. The shape deliberately does not change between profiles: only
     * the method list on the shim differs, so a script written untrusted
     * keeps working verbatim when it is elevated.
     *
     * @param Context the script the event is going to.
     * @param TheEvent the event.
     * @return An AussomType representing the event.
     */
    public AussomType wrapEvent(ScriptContext Context, Event TheEvent) {
        return this.shimFor(Context, TheEvent);
    }

    /**
     * Wraps a Bukkit object in its generated shim.
     *
     * The shim is looked up by the object's simple type name, which is what
     * the generator names its classes after. A tier that does not have that
     * shim gets null, which is the same answer as a method the tier does not
     * have: it cannot hold what it was not given.
     *
     * @param Context is the script the object is going to.
     * @param Obj is the Bukkit object.
     * @return An AussomType holding the shim, or null.
     */
    public AussomType shimFor(ScriptContext Context, Object Obj) {
        if (Obj == null) {
            return new AussomNull();
        }
        return Marshal.shim(Context.getHost(), Obj, Marshal.shimNameOf(Obj));
    }

    /**
     * Whether a command name is one scripts may not register.
     *
     * @param Name is the command name, without a leading slash.
     * @return A boolean with true when it is protected.
     */
    public boolean isProtectedCommand(String Name) {
        if (Name == null) {
            return false;
        }
        // Locale.ROOT because Bukkit uses it to normalise a command label.
        // Under a Turkish default locale "LOGIN" lowercases to "logın" with
        // a dotless i, which would miss the protected name here and then be
        // normalised back to "login" by Bukkit, handing the script the very
        // command this refuses.
        return this.protectedCommands.contains(Name.trim().toLowerCase(Locale.ROOT));
    }

    /** @return how much one script may keep in its store, in bytes. */
    public long getStoreMaxBytes() {
        return this.storeMaxBytes;
    }

    /** @return the runner every callback goes through. */
    public Runner getRunner() {
        return this.runner;
    }

    /** @return the grant store. */
    public TrustStore getTrustStore() {
        return this.trust;
    }

    /** @return the script loader. */
    public ScriptLoader getLoader() {
        return this.loader;
    }

    /** @return the watchdog bounding runs. */
    public Watchdog getWatchdog() {
        return this.watchdog;
    }

    /** @return the loaded scripts by file name. */
    public Map<String, ScriptContext> getScripts() {
        return Collections.unmodifiableMap(this.scripts);
    }

    /** @return the directory scripts are read from. */
    public File getScriptDir() {
        return new File(this.getDataFolder(), SCRIPT_DIR);
    }

    @Override
    public String craft() {
        if (this.craftSource == null) {
            this.craftSource = this.resource("/com/lehman/aussomcraft/aus/craft.aus");
        }
        return this.craftSource;
    }

    @Override
    public String aji() {
        if (this.ajiSource == null) {
            this.ajiSource = this.resource("/com/lehman/aussomcraft/aus/aji.aus");
        }
        return this.ajiSource;
    }

    private String resource(String Name) {
        try (InputStream in = this.getClass().getResourceAsStream(Name)) {
            if (in == null) {
                this.getLogger().severe("Missing bundled module '" + Name + "'.");
                return "";
            }
            return new String(in.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            this.getLogger().severe("Could not read bundled module '" + Name + "'.");
            return "";
        }
    }

    /**
     * A configuration whose keys are literal.
     *
     * Script names end in '.aus', and a dot is the default path separator in
     * a Bukkit configuration, so a store written under 'counter.aus' became
     * a section 'counter' holding a section 'aus' and was never found again.
     * A forward slash cannot appear in a file name on any platform this runs
     * on, so it is the one safe separator.
     *
     * @return A YamlConfiguration with a separator no key can contain.
     */
    private static YamlConfiguration flatConfig() {
        YamlConfiguration cfg = new YamlConfiguration();
        cfg.options().pathSeparator('/');
        return cfg;
    }

    /**
     * Every script's persisted store, as read from disk.
     *
     * @return A Map from script file name to its stored values.
     */
    private Map<String, Object> readStores() {
        Map<String, Object> out = new ConcurrentHashMap<String, Object>();
        File f = new File(this.getDataFolder(), STORE_FILE);
        if (!f.exists()) {
            return out;
        }
        YamlConfiguration cfg = flatConfig();
        try {
            cfg.load(f);
        } catch (Exception e) {
            this.getLogger().warning("Could not read " + STORE_FILE + ": " + e.getMessage());
            return out;
        }
        for (String key : cfg.getKeys(false)) {
            Object v = cfg.get(key);
            if (v != null) {
                out.put(key, v);
            }
        }
        return out;
    }

    /**
     * One script's persisted store, as a plain map.
     *
     * @param Name is the script file name.
     * @param Stores is everything read from the store file.
     * @return A Map of its values, empty when it has none.
     */
    @SuppressWarnings("unchecked")
    private static Map<String, Object> storeFor(String Name, Map<String, Object> Stores) {
        Map<String, Object> out = new ConcurrentHashMap<String, Object>();
        Object mine = Stores.get(Name);
        if (mine instanceof ConfigurationSection) {
            out.putAll(plain(((ConfigurationSection) mine).getValues(false)));
        } else if (mine instanceof Map) {
            out.putAll((Map<String, Object>) mine);
        }
        return out;
    }

    /**
     * A configuration's values as plain Java, all the way down.
     *
     * `getValues(false)` hands back the section objects for anything nested,
     * so a script that stored a map read one of those back instead. It has
     * no representation on the script side, so it arrived as the text of its
     * toString: `MemorySection[path='counter.aus/data', root='YamlConfiguration']`.
     * The store's contract is plain types, and this is what keeps it true.
     *
     * @param In is the values read from a configuration.
     * @return A Map holding only strings, numbers, bools, lists and maps.
     */
    @SuppressWarnings("unchecked")
    private static Map<String, Object> plain(Map<String, Object> In) {
        Map<String, Object> out = new java.util.LinkedHashMap<String, Object>();
        for (Map.Entry<String, Object> e : In.entrySet()) {
            Object v = e.getValue();
            if (v instanceof ConfigurationSection) {
                out.put(e.getKey(), plain(((ConfigurationSection) v).getValues(false)));
            } else if (v instanceof Map) {
                out.put(e.getKey(), plain((Map<String, Object>) v));
            } else {
                out.put(e.getKey(), v);
            }
        }
        return out;
    }

    private void saveStores() {
        File f = new File(this.getDataFolder(), STORE_FILE);

        // Read first, then update only the scripts that are loaded. Writing
        // just the loaded ones would drop every other script's data, and a
        // script is not loaded for plenty of ordinary reasons: it was
        // unloaded, or it failed to parse this time round.
        YamlConfiguration cfg = flatConfig();
        if (f.exists()) {
            try {
                cfg.load(f);
            } catch (Exception e) {
                this.getLogger().warning("Could not read " + STORE_FILE
                    + " before writing it: " + e.getMessage());
            }
        }

        boolean any = false;
        for (ScriptContext ctx : this.scripts.values()) {
            ctx.clearStoreDirty();
            // Cleared unconditionally, so emptying a store persists. Writing
            // only non-empty stores left the old section on disk, and a
            // script that deleted a key got it back after a restart.
            cfg.set(ctx.getName(), null);
            if (!ctx.getStore().isEmpty()) {
                cfg.createSection(ctx.getName(), ctx.getStore());
            }
            any = true;
        }

        // Nothing loaded means nothing to say about any script, which is the
        // state at startup before the first load. Writing here would empty
        // the file every time the server came up.
        if (!any) {
            return;
        }
        try {
            cfg.save(f);
        } catch (IOException e) {
            this.getLogger().warning("Could not write " + STORE_FILE + ": " + e.getMessage());
        }
    }
}
