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
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockbukkit.mockbukkit.MockBukkit;
import org.mockbukkit.mockbukkit.ServerMock;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.server.ServerCommandEvent;
import org.mockbukkit.mockbukkit.entity.PlayerMock;

import com.lehman.aussomcraft.AussomCraftPlugin;
import com.lehman.aussomcraft.profile.Profile;
import com.lehman.aussomcraft.script.ScriptContext;
import com.lehman.aussomcraft.trust.TrustStore;

/**
 * Escalation against a live object, which is the case the escape tests miss.
 *
 * EscapeTest declares its own class against PaperApi and shows it wraps
 * nothing. That is true and worth having, but it means every escape test so
 * far ran against an empty shim. The tier model's real claim is about the
 * shims the host builds and hands to a handler: a Player that genuinely
 * wraps a Player, reached the way a script actually reaches one.
 *
 * Every Paper method exists in Java on every shim, because they all bind the
 * one shared PaperApi. The only thing standing between an untrusted script
 * and setOp is that the generated untrusted module does not declare it. So
 * that is what these tests attack.
 */
public class TierEscalationTest {

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

    private ScriptContext load(String Name, String Body) throws Exception {
        File dir = this.plugin.getScriptDir();
        dir.mkdirs();
        Path p = dir.toPath().resolve(Name);
        Files.write(p, Body.getBytes(StandardCharsets.UTF_8));
        this.plugin.reloadScripts();
        return this.plugin.getScripts().get(Name);
    }

    /**
     * Runs a handler body against a real joining player and reports what the
     * script recorded. The handler is wrapped in try/catch so a refusal is
     * recorded rather than thrown, which is how a script would see it.
     */
    private ScriptContext onJoin(String Name, String Decls, String Body) throws Exception {
        ScriptContext ctx = load(Name,
            Decls
          + "class Main {\n"
          + "  public main() { events.on(\"PlayerJoinEvent\", ::go); return 0; }\n"
          + "  public go(Evt) {\n"
          + "    try {\n"
          + "      p = Evt.getPlayer();\n"
          + "      " + Body + "\n"
          + "    } catch (e) {\n"
          + "      store.set(\"err\", e.getMessage());\n"
          + "    }\n"
          + "    return 0;\n"
          + "  }\n"
          + "}\n");
        // A null context is a refusal at load, which is one correct answer
        // here. The other is loading and then failing to reach the method.
        this.server.addPlayer("Steve");
        return ctx;
    }

    /**
     * Whether the handler reached the escalated call. A refused script never
     * got a context, and that counts as not reaching it.
     */
    private void mustNotHaveEscalated(ScriptContext Ctx, String What) {
        if (Ctx == null) {
            return;
        }
        Object done = Ctx.getStore().get("escalated");
        assertFalse(Boolean.TRUE.equals(done),
            What + " must not be reachable from an untrusted script.");
    }

    /**
     * The control. The shim really is attached and really does work, so a
     * failure below means the escalation was refused rather than that the
     * handler never ran.
     */
    @Test
    public void theShimIsGenuinelyAttached() throws Exception {
        ScriptContext ctx = onJoin("ok.aus", "",
            "store.set(\"who\", p.getName());");
        assertNotNull(ctx, "the control script must load");
        assertEquals("Steve", ctx.getStore().get("who"),
            "the handler must receive a shim wrapping a real Player.");
    }

    /**
     * The direct attempt: call a method the tier withheld on an object the
     * host attached. PaperApi.setOp exists in Java on this very object.
     */
    @Test
    public void untrustedCannotCallAWithheldMethodOnALiveShim() throws Exception {
        ScriptContext ctx = onJoin("op.aus", "",
            "p.setOp(true); store.set(\"escalated\", true);");
        mustNotHaveEscalated(ctx, "Player.setOp");
        assertFalse(this.server.getPlayer("Steve").isOp(),
            "the player must not have been opped.");
    }

    /** The same, for the console door. */
    @Test
    public void untrustedCannotRunACommandOnALiveShim() throws Exception {
        ScriptContext ctx = onJoin("cmd.aus", "",
            "p.performCommand(\"op Steve\"); store.set(\"escalated\", true);");
        mustNotHaveEscalated(ctx, "Player.performCommand");
        assertFalse(this.server.getPlayer("Steve").isOp(),
            "the player must not have been opped.");
    }

    /** And for the route off the server entirely. */
    @Test
    public void untrustedCannotReachTheServerFromALiveShim() throws Exception {
        ScriptContext ctx = onJoin("srv.aus", "",
            "s = p.getServer(); store.set(\"escalated\", true);");
        mustNotHaveEscalated(ctx, "Player.getServer");
    }

    /**
     * Inheriting the shim and declaring the withheld method on the subclass.
     * If this parsed and the host's object were reachable through it, the
     * generated module would stop being the gate.
     */
    @Test
    public void untrustedCannotAddMethodsByExtendingAShim() throws Exception {
        ScriptContext ctx = onJoin("inherit.aus",
            "include paper.untrusted.Player;\n"
          + "extern class Wider : com.lehman.aussomcraft.paper.gen.PaperApi {\n"
          + "    public extern setOp(A0);\n"
          + "}\n",
            "w = new Wider(); w.setOp(true); store.set(\"escalated\", true);");
        mustNotHaveEscalated(ctx, "a widened subclass");
        assertFalse(this.server.getPlayer("Steve").isOp(),
            "the player must not have been opped.");
    }

    /**
     * Declaring a class into the shim's own namespace. The host picks the
     * shim class by name, so a script that could occupy that name would
     * choose its own method list for every object the host wraps.
     */
    @Test
    public void untrustedCannotOccupyTheShimsName() throws Exception {
        ScriptContext ctx = onJoin("shadow.aus",
            "extern class Player : com.lehman.aussomcraft.paper.gen.PaperApi {\n"
          + "    public extern setOp(A0);\n"
          + "}\n",
            "p.setOp(true); store.set(\"escalated\", true);");
        assertNull(ctx, "a script that occupies a shim's name must be refused at load,"
            + " because the host attaches live objects to shim classes by name.");
        mustNotHaveEscalated(ctx, "a shadowing Player declaration");
        assertFalse(this.server.getPlayer("Steve").isOp(),
            "the player must not have been opped.");
    }

    /**
     * The dispatch helper is in an allowlisted package, so a script may name
     * it. Its methods are not in the extern calling convention, so none of
     * them should bind.
     */
    @Test
    public void untrustedCannotBindTheDispatchHelper() throws Exception {
        ScriptContext ctx = onJoin("invoke.aus",
            "extern class Reach : com.lehman.aussomcraft.paper.Invoke {\n"
          + "    public extern call(A0, A1, A2);\n"
          + "}\n",
            "r = new Reach(); r.call(p, \"setOp\", true); store.set(\"escalated\", true);");
        mustNotHaveEscalated(ctx, "Invoke.call");
    }

    /** The same for the marshaller, which can unwrap a shim to raw Java. */
    @Test
    public void untrustedCannotBindTheMarshaller() throws Exception {
        ScriptContext ctx = onJoin("marshal.aus",
            "extern class Reach : com.lehman.aussomcraft.paper.Marshal {\n"
          + "    public extern unwrap(A0);\n"
          + "}\n",
            "r = new Reach(); store.set(\"raw\", \"\" + r.unwrap(p)); store.set(\"escalated\", true);");
        mustNotHaveEscalated(ctx, "Marshal.unwrap");
    }

    /**
     * Trusted is a real tier boundary too, not just a bigger untrusted. The
     * control plane has to stay out of it on a live object.
     */
    @Test
    public void trustedCannotEscalateOnALiveShim() throws Exception {
        File dir = this.plugin.getScriptDir();
        dir.mkdirs();
        String body =
            "class Main {\n"
          + "  public main() { events.on(\"PlayerJoinEvent\", ::go); return 0; }\n"
          + "  public go(Evt) {\n"
          + "    try {\n"
          + "      p = Evt.getPlayer();\n"
          + "      p.setOp(true); store.set(\"escalated\", true);\n"
          + "    } catch (e) { store.set(\"err\", e.getMessage()); }\n"
          + "    return 0;\n"
          + "  }\n"
          + "}\n";
        Path p = dir.toPath().resolve("t.aus");
        Files.write(p, body.getBytes(StandardCharsets.UTF_8));
        this.plugin.getTrustStore().grant(TrustStore.hashOf(p), Profile.TRUSTED, "t.aus", "test");
        this.plugin.reloadScripts();
        ScriptContext ctx = this.plugin.getScripts().get("t.aus");
        assertNotNull(ctx, "the script should have loaded");
        assertEquals(Profile.TRUSTED, ctx.getProfile(),
            "the script should be trusted for this test to mean anything");
        this.server.addPlayer("Steve");
        mustNotHaveEscalated(ctx, "Player.setOp at trusted");
        assertFalse(this.server.getPlayer("Steve").isOp(),
            "the player must not have been opped.");
    }

    /**
     * Bukkit task ids are server wide and sequential, so a script can name a
     * task it never scheduled just by counting from zero. Cancelling one
     * would stop another plugin's work, or the server's own.
     */
    @Test
    public void aScriptCannotCancelAnotherPluginsTask() throws Exception {
        final boolean[] ran = { false };
        int foreign = this.server.getScheduler().runTaskLater(
            this.plugin, () -> ran[0] = true, 3L).getTaskId();

        ScriptContext ctx = onJoin("cancel.aus", "",
            "sched.cancel(" + foreign + "); store.set(\"escalated\", true);");
        mustNotHaveEscalated(ctx, "sched.cancel on a task the script does not own");

        this.server.getScheduler().performTicks(6L);
        assertTrue(ran[0], "another owner's task must still have run.");
    }

    /** The script's own task is still cancellable, or the fix broke the feature. */
    @Test
    public void aScriptCanStillCancelItsOwnTask() throws Exception {
        ScriptContext ctx = onJoin("own.aus", "",
            "id = sched.later(3, ::never); sched.cancel(id); store.set(\"ok\", true);");
        assertNotNull(ctx, "the script must load");
        assertEquals(Boolean.TRUE, ctx.getStore().get("ok"),
            "a script must still be able to cancel a task it scheduled.");
    }

    /**
     * A loop in main must not hang the server.
     *
     * main is run by the loader, not by the Runner, so it does not pass
     * through the watchdog the way an event handler does. Loading happens on
     * the server thread, from enable and from /acraft reload, so an
     * unbounded main is a permanent freeze rather than a slow script.
     */
    @Test
    public void aLoopInMainIsStopped() throws Exception {
        assertTimeoutPreemptively(Duration.ofSeconds(30), () -> {
            ScriptContext ctx = load("spin.aus",
                "class Main { public main() {\n"
              + "  x = 0;\n"
              + "  while (true) { x = x + 1; }\n"
              + "  return 0;\n"
              + "} }\n");
            assertNull(ctx, "a script whose main never returns must not load.");
        });
    }

    /** Ordinary setup in main is untouched, or the bound is useless. */
    @Test
    public void normalStartupStillLoads() throws Exception {
        ScriptContext ctx = load("fine.aus",
            "class Main { public main() {\n"
          + "  total = 0;\n"
          + "  for (i : [1, 2, 3, 4, 5]) { total = total + i; }\n"
          + "  store.set(\"total\", total);\n"
          + "  return 0;\n"
          + "} }\n");
        assertNotNull(ctx, "an ordinary main must still load");
        assertEquals(15L, ((Number) ctx.getStore().get("total")).longValue(),
            "and must have run");
    }

    /**
     * A script cannot fill the disk through its store.
     *
     * Nothing else bounds this. A handler stays well inside its time budget
     * while writing a little more each run, and the store is held in memory
     * and written to store.yml on every save.
     */
    @Test
    public void aScriptCannotGrowItsStoreWithoutLimit() throws Exception {
        ScriptContext ctx = load("fill.aus",
            "class Main { public main() {\n"
          + "  chunk = \"\";\n"
          + "  for (i : [1,2,3,4,5,6,7,8,9,10]) { chunk = chunk + \"0123456789012345678901234567890123456789\"; }\n"
          + "  wrote = 0;\n"
          + "  for (i : [1,2,3,4,5,6,7,8,9,10]) {\n"
          + "    for (j : [1,2,3,4,5,6,7,8,9,10]) {\n"
          + "      for (k : [1,2,3,4,5,6,7,8,9,10]) {\n"
          + "        r = store.set(\"k\" + i + \"_\" + j + \"_\" + k, chunk);\n"
          + "        if (r == true) { wrote = wrote + 1; }\n"
          + "      }\n"
          + "    }\n"
          + "  }\n"
          + "  store.set(\"wrote\", wrote);\n"
          + "  return 0;\n"
          + "} }\n");
        assertNotNull(ctx, "the script should still load; a full store is not a crash");
        long held = ctx.getStoreBytes();
        assertTrue(held <= this.plugin.getStoreMaxBytes(),
            "the store must not exceed its cap, held " + held
            + " cap " + this.plugin.getStoreMaxBytes());
    }

    /** A refused write must not have changed the store. */
    @Test
    public void arefusedWriteLeavesTheStoreAlone() throws Exception {
        ScriptContext ctx = load("refuse.aus",
            "class Main { public main() {\n"
          + "  store.set(\"keep\", \"here\");\n"
          + "  big = \"x\";\n"
          + "  for (i : [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21]) { big = big + big; }\n"
          + "  try {\n"
          + "    store.set(\"toobig\", big);\n"
          + "  } catch (e) {\n"
          + "    store.set(\"refused\", true);\n"
          + "  }\n"
          + "  return 0;\n"
          + "} }\n");
        assertNotNull(ctx, "the script should still load");
        assertEquals("here", ctx.getStore().get("keep"),
            "a refused write must not disturb what was already there");
        // Presence, not value: printing a refused two megabyte string on
        // failure buries the rest of the run.
        assertFalse(ctx.getStore().containsKey("toobig"),
            "a refused write must not store anything");
        assertTrue(ctx.getStoreBytes() < this.plugin.getStoreMaxBytes(),
            "the tracked size must not have counted the refused value");
    }

    /** Ordinary use is untouched. */
    @Test
    public void ordinaryStoreUseStillWorks() throws Exception {
        ScriptContext ctx = load("normal.aus",
            "class Main { public main() {\n"
          + "  store.set(\"a\", \"one\");\n"
          + "  store.set(\"b\", 2);\n"
          + "  store.remove(\"a\");\n"
          + "  return 0;\n"
          + "} }\n");
        assertNotNull(ctx);
        assertNull(ctx.getStore().get("a"), "remove should work");
        assertEquals(2L, ((Number) ctx.getStore().get("b")).longValue());
        assertTrue(ctx.getStoreBytes() > 0 && ctx.getStoreBytes() < 1000,
            "the tracked size should be small and positive, was " + ctx.getStoreBytes());
    }

    /**
     * A tier may only subscribe to events it was given.
     *
     * Resolving a name proves the class is a Bukkit event, not that this
     * tier has it. Without a check a script could subscribe to anything on
     * the class path: the handler receives null, because a tier with no
     * module for a type gets no shim, but the script still learns the event
     * fired and how often. That is a way around the generated surface.
     */
    @Test
    public void untrustedCannotSubscribeToAnEventItWasNotGiven() throws Exception {
        ScriptContext ctx = load("sub.aus",
            "class Main {\n"
          + "  public main() {\n"
          + "    try {\n"
          + "      events.on(\"org.bukkit.event.player.PlayerFishEvent\", ::go);\n"
          + "      store.set(\"registered\", true);\n"
          + "    } catch (e) { store.set(\"refused\", true); }\n"
          + "    return 0;\n"
          + "  }\n"
          + "  public go(Evt) { return 0; }\n"
          + "}\n");
        assertNotNull(ctx, "the script should load; a refused subscription is not a crash");
        assertFalse(Boolean.TRUE.equals(ctx.getStore().get("registered")),
            "PlayerFishEvent is not one of the events untrusted was given, so it"
            + " must not be subscribable there.");
        assertEquals(Boolean.TRUE, ctx.getStore().get("refused"),
            "and the refusal should reach the script");
    }

    /** Events the tier does have still work, or the gate is too tight. */
    @Test
    public void untrustedCanStillSubscribeToItsOwnEvents() throws Exception {
        ScriptContext ctx = onJoin("ok2.aus", "",
            "store.set(\"who\", p.getName());");
        assertNotNull(ctx, "an ordinary event script must still load");
        assertEquals("Steve", ctx.getStore().get("who"),
            "PlayerJoinEvent has an untrusted module and must still fire");
    }

    /**
     * A trusted script must not be able to register a global permission.
     *
     * It could. DefaultPermissions is a static utility, so the shim had no
     * receiver to check, and a script could build a detached one and call
     * it. The node was registered server wide and survived unloading the
     * script, because nothing recorded that a script had done it.
     */
    @Test
    public void trustedCannotRegisterAGlobalPermission() throws Exception {
        File dir = this.plugin.getScriptDir();
        dir.mkdirs();
        String body =
            "include paper.trusted.DefaultPermissions;\n"
          + "class Main { public main() {\n"
          + "  try {\n"
          + "    d = new DefaultPermissions();\n"
          + "    d.registerPermission(\"aussomcraft.test.injected\", \"injected\");\n"
          + "    store.set(\"registered\", true);\n"
          + "  } catch (e) { store.set(\"refused\", true); }\n"
          + "  return 0;\n"
          + "} }\n";
        Path p = dir.toPath().resolve("perm.aus");
        Files.write(p, body.getBytes(StandardCharsets.UTF_8));
        this.plugin.getTrustStore().grant(TrustStore.hashOf(p), Profile.TRUSTED,
            "perm.aus", "test");
        this.plugin.reloadScripts();

        assertNull(Bukkit.getPluginManager().getPermission("aussomcraft.test.injected"),
            "a trusted script must not be able to register a permission server wide.");
    }

    /**
     * A script must not take a command another plugin owns.
     *
     * Bukkit gives a bare label to whoever registers first, and scripts used
     * to load during this plugin's own enable, before other plugins had
     * enabled at all. So a script could register "login" ahead of the
     * authentication plugin that owns it and be handed whatever players
     * typed after it, which is the disclosure removed from the event side
     * arriving by another door.
     *
     * Scripts now load on the first tick, after every plugin has claimed its
     * commands, so a real owner always wins and the script falls back to
     * script:name.
     */
    @Test
    public void aScriptCannotTakeACommandAnotherPluginOwns() throws Exception {
        // Stand in for the plugin that owns /login, registered first.
        Command owner = new Command("login") {
            @Override
            public boolean execute(CommandSender s, String label, String[] a) {
                return true;
            }
        };
        Bukkit.getCommandMap().register("authplugin", owner);

        ScriptContext ctx = load("squat.aus",
            "class Main {\n"
          + "  public main() { cmd.register(\"login\", ::go); return 0; }\n"
          + "  public go(Sender, Args) {\n"
          + "    if (#Args > 0) { store.set(\"captured\", Args[0]); }\n"
          + "    return 0;\n"
          + "  }\n"
          + "}\n");
        assertNotNull(ctx, "the script should still load");
        assertSame(owner, Bukkit.getCommandMap().getCommand("login"),
            "the plugin that registered first must keep the bare name.");

        this.server.getConsoleSender().getServer().dispatchCommand(
            this.server.getConsoleSender(), "login hunter2");
        assertNull(ctx.getStore().get("captured"),
            "and the script must not receive what was typed after it.");
    }

    /**
     * A script may not register a name that carries a secret.
     *
     * Bukkit keeps a name with whoever registered it first, and scripts load
     * after every plugin, so a real owner always wins. Neither settles a
     * sensitive name nobody owns right now: a script could take `login` on a
     * server with no authentication plugin, ask players to use it, and be
     * handed what they type. No script has a reason to answer that.
     */
    @Test
    public void aScriptCannotRegisterAProtectedName() throws Exception {
        ScriptContext ctx = load("squat.aus",
            "class Main {\n"
          + "  public main() {\n"
          + "    try {\n"
          + "      cmd.register(\"login\", ::go);\n"
          + "      store.set(\"registered\", true);\n"
          + "    } catch (e) { store.set(\"refused\", true); }\n"
          + "    return 0;\n"
          + "  }\n"
          + "  public go(Sender, Args) {\n"
          + "    if (#Args > 0) { store.set(\"captured\", Args[0]); }\n"
          + "    return 0;\n"
          + "  }\n"
          + "}\n");
        assertNotNull(ctx, "the script should still load");
        assertNull(Bukkit.getCommandMap().getCommand("login"),
            "no command named login should have been registered at all.");
        assertFalse(Boolean.TRUE.equals(ctx.getStore().get("registered")),
            "and the script should have been told no.");

        this.server.getConsoleSender().getServer().dispatchCommand(
            this.server.getConsoleSender(), "login hunter2");
        assertNull(ctx.getStore().get("captured"),
            "so nothing it typed can reach the script.");
    }

    /** An ordinary name still works bare, which is what the guide teaches. */
    @Test
    public void aScriptStillGetsAnOrdinaryCommandName() throws Exception {
        ScriptContext ctx = load("mine.aus",
            "class Main {\n"
          + "  public main() { cmd.register(\"somethingordinary\", ::go); return 0; }\n"
          + "  public go(Sender, Args) { store.set(\"ran\", true); return 0; }\n"
          + "}\n");
        assertNotNull(ctx);
        assertNotNull(Bukkit.getCommandMap().getCommand("somethingordinary"),
            "an ordinary name should be registered bare.");
        this.server.getConsoleSender().getServer().dispatchCommand(
            this.server.getConsoleSender(), "somethingordinary");
        assertEquals(Boolean.TRUE, ctx.getStore().get("ran"),
            "and running it should reach the script.");
    }

    /**
     * A trusted script must not be able to rewrite what the console runs.
     *
     * It could: a handler on ServerCommandEvent called setCommand and turned
     * an operator's command into one of its own, which is console authority
     * and therefore the dangerous tier by another name.
     */
    @Test
    public void trustedCannotRewriteAConsoleCommand() throws Exception {
        File dir = this.plugin.getScriptDir();
        dir.mkdirs();
        String body =
            "class Main {\n"
          + "  public main() {\n"
          + "    try { events.on(\"ServerCommandEvent\", ::go); } catch (e) { }\n"
          + "    return 0;\n"
          + "  }\n"
          + "  public go(Evt) {\n"
          + "    try { Evt.setCommand(\"op Mallory\"); } catch (e) { }\n"
          + "    return 0;\n"
          + "  }\n"
          + "}\n";
        Path p = dir.toPath().resolve("rewrite.aus");
        Files.write(p, body.getBytes(StandardCharsets.UTF_8));
        this.plugin.getTrustStore().grant(TrustStore.hashOf(p), Profile.TRUSTED,
            "rewrite.aus", "test");
        this.plugin.reloadScripts();

        ServerCommandEvent e =
            new ServerCommandEvent(this.server.getConsoleSender(), "list");
        Bukkit.getPluginManager().callEvent(e);
        assertEquals("list", e.getCommand(),
            "the console's command must be what the console typed.");
    }

    /**
     * An event is authorised by its binary name, not its simple name.
     *
     * Modules are named after a type's simple name, and the check used that,
     * so any class sharing a name with an approved event was accepted
     * whatever package it came from. A subclass is worse than a collision:
     * the shim's cast to the Bukkit superclass succeeds, so the whole module
     * works against somebody else's event.
     *
     * The fixture stands in for another plugin's staff channel built on
     * Bukkit's chat event. An untrusted script could subscribe to it by
     * fully qualified name and read messages that were never public chat.
     */
    @Test
    public void anotherPluginsEventWithAnApprovedSimpleNameIsRefused() throws Exception {
        ScriptContext ctx = load("sneak.aus",
            "class Main {\n"
          + "  public main() {\n"
          + "    try {\n"
          + "      events.on(\"com.lehman.aussomcraft.mock.otherplugin.AsyncPlayerChatEvent\", ::go);\n"
          + "      store.set(\"subscribed\", true);\n"
          + "    } catch (e) { store.set(\"refused\", true); }\n"
          + "    return 0;\n"
          + "  }\n"
          + "  public go(Evt) {\n"
          + "    store.set(\"fired\", true);\n"
          + "    try { store.set(\"read\", Evt.getMessage()); } catch (e) { }\n"
          + "    return 0;\n"
          + "  }\n"
          + "}\n");
        assertNotNull(ctx, "the script should still load");
        assertFalse(Boolean.TRUE.equals(ctx.getStore().get("subscribed")),
            "a class merely sharing a simple name with an approved event is not"
            + " that event and must be refused.");

        PlayerMock staff = this.server.addPlayer("Admin");
        Bukkit.getPluginManager().callEvent(
            new com.lehman.aussomcraft.mock.otherplugin.AsyncPlayerChatEvent(
                staff, "STAFF ONLY: the vault code is 4815",
                new java.util.HashSet<org.bukkit.entity.Player>()));

        assertNull(ctx.getStore().get("fired"),
            "and no handler should have been attached to it.");
        assertNull(ctx.getStore().get("read"),
            "so nothing it carried can reach the script.");
    }

    /** Bukkit's own chat event still works, or the check is too tight. */
    @Test
    public void theRealChatEventIsStillSubscribable() throws Exception {
        ScriptContext ctx = load("chat.aus",
            "class Main {\n"
          + "  public main() {\n"
          + "    events.on(\"AsyncPlayerChatEvent\", ::go);\n"
          + "    store.set(\"subscribed\", true);\n"
          + "    return 0;\n"
          + "  }\n"
          + "  public go(Evt) { return 0; }\n"
          + "}\n");
        assertNotNull(ctx);
        assertEquals(Boolean.TRUE, ctx.getStore().get("subscribed"),
            "the granted chat event must still be subscribable.");
    }
}
