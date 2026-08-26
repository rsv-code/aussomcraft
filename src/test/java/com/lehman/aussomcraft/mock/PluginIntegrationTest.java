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

package com.lehman.aussomcraft.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockbukkit.mockbukkit.MockBukkit;
import org.mockbukkit.mockbukkit.ServerMock;
import org.mockbukkit.mockbukkit.entity.PlayerMock;

import com.lehman.aussomcraft.AussomCraftPlugin;
import com.lehman.aussomcraft.script.ScriptContext;
import com.lehman.aussomcraft.trust.TrustStore;
import com.lehman.aussomcraft.profile.Profile;

/**
 * The plumbing, against a fake server in process.
 *
 * This is the layer that reaches what plain JUnit cannot: registering and
 * firing events, running commands, the scheduler, and whether unload really
 * detaches. Both bugs found on the real server would have been caught here.
 *
 * What it cannot say anything about is the class loader. MockBukkit runs on
 * the ordinary app loader, where getSystemClassLoader can see org.bukkit,
 * which is not true on a real Paper server. Nothing here may be read as
 * covering that.
 */
public class PluginIntegrationTest {

    private ServerMock server;
    private AussomCraftPlugin plugin;

    @BeforeEach
    public void setUp() {
        this.server = MockBukkit.mock();
        this.plugin = MockBukkit.load(AussomCraftPlugin.class);
    }

    @AfterEach
    public void tearDown() {
        MockBukkit.unmock();
    }

    /** Writes a script into the plugin's scripts directory. */
    private Path script(String Name, String Body) throws Exception {
        File dir = this.plugin.getScriptDir();
        dir.mkdirs();
        Path p = dir.toPath().resolve(Name);
        Files.write(p, Body.getBytes(StandardCharsets.UTF_8));
        return p;
    }

    private ScriptContext loadOnly(String Name, String Body) throws Exception {
        script(Name, Body);
        this.plugin.reloadScripts();
        return this.plugin.getScripts().get(Name);
    }

    @Test
    public void thePluginEnables() {
        assertTrue(this.plugin.isEnabled());
        assertNotNull(this.plugin.getRunner());
        assertNotNull(this.plugin.getTrustStore());
    }

    /** A script loads untrusted and its main runs. */
    @Test
    public void aScriptLoadsUntrusted() throws Exception {
        ScriptContext ctx = loadOnly("hello.aus",
            "class Main { public main() { return 0; } }\n");
        assertNotNull(ctx, "the script should have loaded");
        assertEquals(Profile.UNTRUSTED, ctx.getProfile());
    }

    /** An event handler registers and fires, and the event arrives as a shim. */
    @Test
    public void anEventHandlerFiresAndGetsAShim() throws Exception {
        loadOnly("join.aus",
            "class Main {\n"
          + "  public main() { events.on(\"PlayerJoinEvent\", ::onJoin); return 0; }\n"
          + "  public onJoin(Evt) {\n"
          + "    p = Evt.getPlayer();\n"
          + "    store.set(\"who\", p.getName());\n"
          + "  }\n"
          + "}\n");

        PlayerMock player = this.server.addPlayer("Steve");
        ScriptContext ctx = this.plugin.getScripts().get("join.aus");
        assertNotNull(ctx);
        assertEquals("Steve", ctx.getStore().get("who"),
            "the handler must have run and read the player through its shim");
    }

    /** A command registers and runs. */
    @Test
    public void aCommandRegistersAndRuns() throws Exception {
        loadOnly("cmd.aus",
            "class Main {\n"
          + "  public main() { cmd.register(\"ping\", ::onPing); return 0; }\n"
          + "  public onPing(Sender, Args) { store.set(\"ran\", true); }\n"
          + "}\n");

        PlayerMock player = this.server.addPlayer("Alex");
        this.server.dispatchCommand(player, "ping");
        ScriptContext ctx = this.plugin.getScripts().get("cmd.aus");
        assertEquals(Boolean.TRUE, ctx.getStore().get("ran"),
            "the command handler must have run");
    }

    /** A scheduled task runs when the scheduler ticks. */
    @Test
    public void aScheduledTaskRuns() throws Exception {
        loadOnly("tick.aus",
            "class Main {\n"
          + "  public main() { sched.later(5, ::soon); return 0; }\n"
          + "  public soon() { store.set(\"fired\", true); }\n"
          + "}\n");

        this.server.getScheduler().performTicks(10L);
        ScriptContext ctx = this.plugin.getScripts().get("tick.aus");
        assertEquals(Boolean.TRUE, ctx.getStore().get("fired"),
            "the scheduled callback must have run");
    }

    // ------------------------------------------------------------------
    // Lifecycle, which is what the host externs exist to make possible
    // ------------------------------------------------------------------

    /** Unloading detaches the handler, so a later event does not reach it. */
    @Test
    public void unloadDetachesTheHandler() throws Exception {
        loadOnly("count.aus",
            "class Main {\n"
          + "  public main() { events.on(\"PlayerJoinEvent\", ::onJoin); return 0; }\n"
          + "  public onJoin(Evt) {\n"
          + "    n = store.get(\"joins\");\n"
          + "    if (n == null) { n = 0; }\n"
          + "    store.set(\"joins\", n + 1);\n"
          + "  }\n"
          + "}\n");

        this.server.addPlayer("First");
        ScriptContext ctx = this.plugin.getScripts().get("count.aus");
        assertEquals(1L, ((Number) ctx.getStore().get("joins")).longValue());

        assertTrue(this.plugin.unloadScript("count.aus"), "unload should report success");
        assertNull(this.plugin.getScripts().get("count.aus"), "it must be gone");

        this.server.addPlayer("Second");
        assertEquals(1L, ((Number) ctx.getStore().get("joins")).longValue(),
            "an unloaded script must not keep handling events");
        assertTrue(ctx.isDisabled(), "the context must be disabled");
    }

    /** Reload replaces the handler rather than adding a second one. */
    @Test
    public void reloadDoesNotDoubleRegister() throws Exception {
        loadOnly("once.aus",
            "class Main {\n"
          + "  public main() { events.on(\"PlayerJoinEvent\", ::onJoin); return 0; }\n"
          + "  public onJoin(Evt) {\n"
          + "    n = store.get(\"hits\");\n"
          + "    if (n == null) { n = 0; }\n"
          + "    store.set(\"hits\", n + 1);\n"
          + "  }\n"
          + "}\n");

        this.plugin.reloadScripts();
        this.server.addPlayer("Once");

        ScriptContext ctx = this.plugin.getScripts().get("once.aus");
        assertEquals(1L, ((Number) ctx.getStore().get("hits")).longValue(),
            "a reloaded script must handle each event once, not twice");
    }

    /**
     * A command must still answer its bare name after a reload.
     *
     * Command.unregister only clears the command's own flag, so the map kept
     * its entries and the name stayed taken. The reloaded script then
     * registered under its fallback prefix, and the bare name went on
     * pointing at a command whose script had been unloaded, so typing it did
     * nothing at all. The sibling test above covers events, which is why
     * this went unnoticed.
     */
    @Test
    public void aCommandStillAnswersAfterReload() throws Exception {
        loadOnly("cmdreload.aus",
            "class Main {\n"
          + "  public main() { cmd.register(\"pingx\", ::onPing); return 0; }\n"
          + "  public onPing(Sender, Args) {\n"
          + "    n = store.get(\"hits\");\n"
          + "    if (n == null) { n = 0; }\n"
          + "    store.set(\"hits\", n + 1);\n"
          + "  }\n"
          + "}\n");

        PlayerMock player = this.server.addPlayer("Steve");
        this.server.dispatchCommand(player, "pingx");
        assertEquals(1L, ((Number) this.plugin.getScripts().get("cmdreload.aus")
            .getStore().get("hits")).longValue(), "the command must answer once loaded");

        this.plugin.reloadScripts();
        this.server.dispatchCommand(player, "pingx");
        assertEquals(2L, ((Number) this.plugin.getScripts().get("cmdreload.aus")
            .getStore().get("hits")).longValue(),
            "a reloaded script must still answer its bare command name");

        this.plugin.reloadScripts();
        this.server.dispatchCommand(player, "pingx");
        assertEquals(3L, ((Number) this.plugin.getScripts().get("cmdreload.aus")
            .getStore().get("hits")).longValue(),
            "a second reload must not break the command either");
    }

    /**
     * The hint an ungranted AJI script prints has to name the tier that will
     * actually work. aji.aus is added at the dangerous tier only, so a hint
     * saying 'trusted' sends an operator round a loop: grant, reload, read
     * the same line again.
     */
    @Test
    public void theElevationHintNamesTheTierThatWorks() throws Exception {
        List<String> lines = new ArrayList<String>();
        Handler capture = new Handler() {
            @Override public void publish(LogRecord r) { lines.add(r.getMessage()); }
            @Override public void flush() { }
            @Override public void close() { }
        };
        this.plugin.getLogger().addHandler(capture);
        try {
            loadOnly("needsaji.aus",
                "include aji;\n"
              + "class Main { public main() { return 0; } }\n");
        } finally {
            this.plugin.getLogger().removeHandler(capture);
        }

        String said = String.join("\n", lines);
        assertTrue(said.contains("needsaji.aus"), "the script should be named. Got: " + said);
        assertTrue(said.contains("dangerous"),
            "the hint must name the dangerous tier. Got: " + said);
        assertFalse(said.contains("needs the trusted profile"),
            "the hint must not send an operator to a grant that cannot work. Got: " + said);
    }

    /** Unloading a script takes its command out of the map, not just off. */
    @Test
    public void unloadClearsTheCommandFromTheMap() throws Exception {
        loadOnly("mapcheck.aus",
            "class Main {\n"
          + "  public main() { cmd.register(\"mapx\", ::onX); return 0; }\n"
          + "  public onX(Sender, Args) { }\n"
          + "}\n");
        assertNotNull(org.bukkit.Bukkit.getCommandMap().getCommand("mapx"),
            "the command should be in the map once registered");

        this.plugin.getScripts().get("mapcheck.aus").unregisterAll();

        assertFalse(org.bukkit.Bukkit.getCommandMap().getKnownCommands().containsKey("mapx"),
            "the bare name must be free again after unload");
        assertFalse(org.bukkit.Bukkit.getCommandMap().getKnownCommands()
            .containsKey("mapcheck:mapx"),
            "the prefixed name must be free again after unload");
    }

    /**
     * 'load --as <tier>' applies a tier to one load and writes no grant.
     *
     * This replaced a separate 'run' command. The two were the same call
     * when no tier was named, and 'run' had no matching way to stop what it
     * started, so it read as a second way to start a script rather than as
     * what it is: a modifier on load.
     */
    @Test
    public void loadAsAppliesATierWithoutGrantingIt() throws Exception {
        script("temp.aus", "include aji;\n"
            + "class Main { public main() { return 0; } }\n");
        this.plugin.reloadScripts();
        assertNull(this.plugin.getScripts().get("temp.aus"),
            "an ungranted aji script must not load");

        this.server.dispatchCommand(this.server.getConsoleSender(),
            "acraft load temp.aus --as dangerous");
        ScriptContext ctx = this.plugin.getScripts().get("temp.aus");
        assertNotNull(ctx, "--as dangerous should have loaded it");
        assertEquals(Profile.DANGEROUS, ctx.getProfile());
        assertTrue(this.plugin.getTrustStore().hashes().isEmpty(),
            "--as must not write a grant; that is what trust is for");
    }

    /** What --as applied lasts until the next reload, and no longer. */
    @Test
    public void loadAsDoesNotSurviveAReload() throws Exception {
        script("temp.aus", "include aji;\n"
            + "class Main { public main() { return 0; } }\n");
        this.server.dispatchCommand(this.server.getConsoleSender(),
            "acraft load temp.aus --as dangerous");
        assertNotNull(this.plugin.getScripts().get("temp.aus"));

        this.plugin.reloadScripts();
        assertNull(this.plugin.getScripts().get("temp.aus"),
            "reload reads the trust store, so an ungranted script drops back out");
    }

    /** A grant is the durable form, and it does survive a reload. */
    @Test
    public void aGrantSurvivesAReload() throws Exception {
        script("temp.aus", "include aji;\n"
            + "class Main { public main() { return 0; } }\n");
        this.server.dispatchCommand(this.server.getConsoleSender(),
            "acraft trust temp.aus dangerous");
        this.plugin.reloadScripts();

        ScriptContext ctx = this.plugin.getScripts().get("temp.aus");
        assertNotNull(ctx, "a granted script must come back after a reload");
        assertEquals(Profile.DANGEROUS, ctx.getProfile());
    }

    /** The command that was removed is really gone. */
    @Test
    public void thereIsNoRunSubcommand() throws Exception {
        loadOnly("plain.aus", "class Main { public main() { return 0; } }\n");
        this.plugin.unloadScript("plain.aus");
        this.server.dispatchCommand(this.server.getConsoleSender(),
            "acraft run plain.aus");
        assertNull(this.plugin.getScripts().get("plain.aus"),
            "'run' must not still start a script under another name");

        // The control. Without it this test would also pass if the script
        // had simply stopped being loadable, which is not what it claims.
        this.server.dispatchCommand(this.server.getConsoleSender(),
            "acraft load plain.aus");
        assertNotNull(this.plugin.getScripts().get("plain.aus"),
            "'load' must still start the very same script");
    }

    /**
     * Command arguments reach a script, and a missing one is survivable.
     *
     * Run against the shipped example rather than a script written here, so
     * the example cannot drift away from the behaviour it is meant to show.
     * Nothing else covered arguments at all, which is how the examples ended
     * up declaring Args and never reading it.
     */
    @Test
    public void commandArgumentsReachAScript() throws Exception {
        File dir = this.plugin.getScriptDir();
        dir.mkdirs();
        Files.write(dir.toPath().resolve("07-nickname.aus"),
            Files.readAllBytes(Paths.get("examples", "07-nickname.aus")));
        this.plugin.reloadScripts();
        assertNotNull(this.plugin.getScripts().get("07-nickname.aus"),
            "the example should load untrusted");

        PlayerMock player = this.server.addPlayer("Steve");
        player.nextMessage();

        // No argument. The guard is what keeps this from throwing.
        this.server.dispatchCommand(player, "nick");
        assertTrue(String.valueOf(player.nextMessage()).contains("no nickname"),
            "a command with no arguments must answer, not fail silently");

        // Several arguments, kept whole.
        this.server.dispatchCommand(player, "nick Sir Robin");
        assertEquals("Your nickname is now Sir Robin.", player.nextMessage(),
            "every argument should arrive, not just the first");

        this.server.dispatchCommand(player, "nick");
        assertEquals("Your nickname is Sir Robin.", player.nextMessage());

        // The first argument read as a keyword.
        this.server.dispatchCommand(player, "nick clear");
        assertEquals("Nickname cleared.", player.nextMessage());
        this.server.dispatchCommand(player, "nick");
        assertTrue(String.valueOf(player.nextMessage()).contains("no nickname"));
    }

    /**
     * A file dropped in while the server runs is picked up by naming it.
     *
     * Nothing watches the directory and nothing rescans it on a timer, so a
     * new file sits there doing nothing until somebody says so. 'load' takes
     * a file that was never loaded, which saves reloading every other script
     * to pick up one new one.
     */
    @Test
    public void aNewFileLoadsWithoutReloadingEverything() throws Exception {
        loadOnly("already.aus",
            "class Main { public main() { store.set(\"v\", 1); return 0; } }\n");
        ScriptContext before = this.plugin.getScripts().get("already.aus");
        assertNotNull(before);

        // Dropped in after the plugin has already scanned the directory.
        script("dropped.aus",
            "class Main { public main() { cmd.register(\"dropped\", ::go); }\n"
          + "  public go(Sender, Args) { store.set(\"ran\", true); } }\n");
        assertNull(this.plugin.getScripts().get("dropped.aus"),
            "nothing watches the directory, so it must not load on its own");

        this.server.dispatchCommand(this.server.getConsoleSender(),
            "acraft load dropped.aus");
        assertNotNull(this.plugin.getScripts().get("dropped.aus"),
            "naming the file should load it");
        assertSame(before, this.plugin.getScripts().get("already.aus"),
            "loading one script must not disturb the others");
    }

    /** A failed reload leaves nothing running rather than the old version. */
    @Test
    public void aFailedReloadStopsTheOldVersion() throws Exception {
        Path p = script("broken.aus",
            "class Main {\n"
          + "  public main() { events.on(\"PlayerJoinEvent\", ::onJoin); return 0; }\n"
          + "  public onJoin(Evt) { store.set(\"ran\", true); }\n"
          + "}\n");
        this.plugin.reloadScripts();
        assertNotNull(this.plugin.getScripts().get("broken.aus"));

        Files.write(p, "class Main { this is not aussom".getBytes(StandardCharsets.UTF_8));
        this.plugin.reloadScript(p);

        assertNull(this.plugin.getScripts().get("broken.aus"),
            "a script that fails to parse must not leave its old self attached");
        this.server.addPlayer("Nobody");
    }

    // ------------------------------------------------------------------
    // Tiers, end to end
    // ------------------------------------------------------------------

    /**
     * A store survives a restart, which is the only reason it exists.
     *
     * Script names end in .aus, and a dot is a configuration path separator
     * by default, so a store written under "counter.aus" used to land nested
     * under "counter" then "aus" and was never found again.
     */
    @Test
    public void aStoreSurvivesAReload() throws Exception {
        loadOnly("keeper.aus",
            "class Main {\n"
          + "  public main() { cmd.register(\"remember\", ::onRemember); }\n"
          + "  public onRemember(Sender, Args) {\n"
          + "    store.set(\"kept\", \"yes\");\n"
          + "    store.set(\"Steve.home.world\", \"overworld\");\n"
          + "  }\n"
          + "}\n");

        PlayerMock player = this.server.addPlayer("Keeper");
        this.server.dispatchCommand(player, "remember");
        assertEquals("yes", this.plugin.getScripts().get("keeper.aus").getStore().get("kept"));

        // A reload writes the stores out and reads them back, which is the
        // same path a restart takes.
        this.plugin.reloadScripts();

        ScriptContext after = this.plugin.getScripts().get("keeper.aus");
        assertNotNull(after, "the script should have loaded again");
        assertEquals("yes", after.getStore().get("kept"),
            "a stored value must survive, or store is pointless");
        assertEquals("overworld", after.getStore().get("Steve.home.world"),
            "a dotted key must survive too, since the guide teaches that shape");
    }

    /** A granted script comes back at the tier it was granted. */
    @Test
    public void aGrantedScriptLoadsAtItsTier() throws Exception {
        Path p = script("worker.aus", "class Main { public main() { return 0; } }\n");
        String hash = TrustStore.hashOf(p);
        this.plugin.getTrustStore().grant(hash, Profile.TRUSTED, "worker.aus", "test");

        ScriptContext ctx = this.plugin.reloadScript(p);
        assertNotNull(ctx);
        assertEquals(Profile.TRUSTED, ctx.getProfile());
    }

    /** Editing a granted script revokes it, on the next load. */
    @Test
    public void editingRevokesTheGrant() throws Exception {
        Path p = script("edited.aus", "class Main { public main() { return 0; } }\n");
        this.plugin.getTrustStore().grant(TrustStore.hashOf(p), Profile.TRUSTED,
            "edited.aus", "test");
        assertEquals(Profile.TRUSTED, this.plugin.reloadScript(p).getProfile());

        Files.write(p, "class Main { public main() { return 1; } }\n"
            .getBytes(StandardCharsets.UTF_8));
        assertEquals(Profile.UNTRUSTED, this.plugin.reloadScript(p).getProfile(),
            "an edited script must fall back to untrusted");
    }

    /** An untrusted script cannot reach a method its tier withholds. */
    @Test
    public void anUntrustedScriptCannotReachAWithheldMethod() throws Exception {
        loadOnly("nosy.aus",
            "class Main {\n"
          + "  public main() { events.on(\"PlayerJoinEvent\", ::onJoin); return 0; }\n"
          + "  public onJoin(Evt) {\n"
          + "    try { Evt.getPlayer().performCommand(\"op me\"); store.set(\"ran\", true); }\n"
          + "    catch (e) { store.set(\"denied\", true); }\n"
          + "  }\n"
          + "}\n");

        PlayerMock player = this.server.addPlayer("Mallory");
        ScriptContext ctx = this.plugin.getScripts().get("nosy.aus");
        assertNull(ctx.getStore().get("ran"),
            "untrusted must not be able to run commands as the player");
        assertFalse(player.isOp(), "and it certainly must not have opped anyone");
    }

    /**
     * Emptying a store has to reach the disk. Writing only non-empty stores
     * left the previous section in the file, so a script that deleted a key
     * was handed it back on the next start.
     */
    @Test
    public void clearingAStorePersists() throws Exception {
        ScriptContext ctx = loadOnly("clear.aus",
            "class Main { public main() { store.set(\"k\", \"v\"); return 0; } }\n");
        assertNotNull(ctx);
        assertEquals("v", ctx.getStore().get("k"));
        this.plugin.reloadScripts();

        ScriptContext after = loadOnly("clear.aus",
            "class Main { public main() { store.remove(\"k\"); return 0; } }\n");
        assertNotNull(after);
        this.plugin.reloadScripts();

        ScriptContext back = this.plugin.getScripts().get("clear.aus");
        assertNotNull(back);
        assertNull(back.getStore().get("k"),
            "a removed key must not come back after a reload.");
    }

    /**
     * Unloading a script must not throw its data away. saveStores walks the
     * loaded map, so removing the script before saving dropped it.
     */
    @Test
    public void unloadKeepsTheStore() throws Exception {
        ScriptContext ctx = loadOnly("keep.aus",
            "class Main { public main() { store.set(\"n\", 7); return 0; } }\n");
        assertNotNull(ctx);
        assertTrue(this.plugin.unloadScript("keep.aus"), "unload should succeed");

        this.plugin.reloadScripts();
        ScriptContext back = this.plugin.getScripts().get("keep.aus");
        assertNotNull(back, "the script should load again");
        assertEquals(7L, ((Number) back.getStore().get("n")).longValue(),
            "an unloaded script's store must survive to the next load.");
    }

    /**
     * main must see the store the last run left behind.
     *
     * The guide teaches reading the store to pick up where a script left
     * off, and a counter that starts from nothing every restart is not a
     * counter. Restoring after the load meant main always saw an empty
     * store, and handlers hid it because they run later.
     */
    @Test
    public void mainSeesThePersistedStore() throws Exception {
        String body =
            "class Main { public main() {\n"
          + "  n = store.get(\"runs\");\n"
          + "  if (n == null) { n = 0; }\n"
          + "  store.set(\"runs\", n + 1);\n"
          + "  store.set(\"sawOnStart\", n);\n"
          + "  return 0;\n"
          + "} }\n";

        ScriptContext first = loadOnly("count.aus", body);
        assertNotNull(first);
        assertEquals(1L, ((Number) first.getStore().get("runs")).longValue(),
            "the first run starts from nothing");

        this.plugin.reloadScripts();
        ScriptContext second = this.plugin.getScripts().get("count.aus");
        assertNotNull(second);
        assertEquals(1L, ((Number) second.getStore().get("sawOnStart")).longValue(),
            "main must have read the value the previous run stored.");
        assertEquals(2L, ((Number) second.getStore().get("runs")).longValue(),
            "the counter must advance across a reload.");
    }

    /**
     * A stored map has to come back a map.
     *
     * The guide says a script can store text, numbers, bools, lists and
     * maps. Maps were the one that did not survive: written to store.yml as
     * a nested section, they were read back as the section object itself,
     * which has no representation on the script side and arrived as the text
     * of its own toString. A script that saved
     * `{"alpha": 1}` got back the string
     * `MemorySection[path='x.aus/data', root='YamlConfiguration']`.
     */
    @Test
    public void aStoredMapSurvivesAReload() throws Exception {
        loadOnly("mapstore.aus",
            "class Main { public main() {\n"
          + "  store.set(\"data\", {\"alpha\": 1, \"beta\": 2});\n"
          + "  store.set(\"list\", [\"x\", \"y\"]);\n"
          + "  return 0;\n"
          + "} }\n");
        this.plugin.reloadScripts();

        ScriptContext back = loadOnly("mapstore.aus",
            "class Main { public main() {\n"
          + "  d = store.get(\"data\");\n"
          + "  store.set(\"alphaBack\", d[\"alpha\"]);\n"
          + "  l = store.get(\"list\");\n"
          + "  store.set(\"firstBack\", l[0]);\n"
          + "  return 0;\n"
          + "} }\n");
        assertNotNull(back);
        assertEquals(1L, ((Number) back.getStore().get("alphaBack")).longValue(),
            "a stored map must come back as a map, readable by key");
        assertEquals("x", back.getStore().get("firstBack"),
            "and a stored list must come back as a list");
    }

    /** Nothing internal may reach a script through its own store. */
    @Test
    public void theStoreNeverHandsBackAnInternalObject() throws Exception {
        loadOnly("deep.aus",
            "class Main { public main() {\n"
          + "  store.set(\"nested\", {\"a\": {\"b\": {\"c\": 3}}});\n"
          + "  return 0;\n"
          + "} }\n");
        this.plugin.reloadScripts();

        ScriptContext back = loadOnly("deep.aus",
            "class Main { public main() {\n"
          + "  n = store.get(\"nested\");\n"
          + "  store.set(\"seen\", \"\" + n);\n"
          + "  return 0;\n"
          + "} }\n");
        assertNotNull(back);
        String seen = String.valueOf(back.getStore().get("seen"));
        assertFalse(seen.contains("MemorySection") || seen.contains("YamlConfiguration"),
            "a configuration object must never be described to a script: " + seen);
        assertTrue(seen.contains("3"), "the nested value should still be there: " + seen);
    }
}
