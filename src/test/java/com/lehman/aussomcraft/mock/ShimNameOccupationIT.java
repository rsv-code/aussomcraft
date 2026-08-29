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
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.mockbukkit.mockbukkit.MockBukkit;
import org.mockbukkit.mockbukkit.ServerMock;
import org.mockbukkit.mockbukkit.world.WorldMock;

import com.lehman.aussomcraft.AussomCraftPlugin;
import com.lehman.aussomcraft.profile.Profile;
import com.lehman.aussomcraft.script.ScriptContext;
import com.lehman.aussomcraft.trust.TrustStore;

/**
 * A script naming one of its own classes after a generated shim type its
 * tier does not have.
 *
 * The host names a shim from the runtime class of the object it is
 * marshalling, so an object arriving as a Villager is looked up under
 * "Villager". Untrusted has no Villager module, so ordinarily that lookup
 * fails and the script gets null. A script that declares its own class
 * called Villager makes the lookup succeed, and the host attaches the real
 * entity to it.
 *
 * ScriptLoader used to refuse that at load. The check was removed after it
 * could not be shown to gate any capability: the class the script binds is
 * still one its own tier allows, and the methods it can call are still only
 * the ones that tier grants. These tests pin what is actually reachable, so
 * that if the answer ever changes it is visible rather than assumed.
 *
 * @author Austin Lehman
 */
public class ShimNameOccupationIT {

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

    /** The same, granted trusted before it loads. */
    private ScriptContext loadTrusted(String Name, String Body) throws Exception {
        File dir = this.plugin.getScriptDir();
        dir.mkdirs();
        Path p = dir.toPath().resolve(Name);
        Files.write(p, Body.getBytes(StandardCharsets.UTF_8));
        this.plugin.getTrustStore().grant(TrustStore.hashOf(p), Profile.TRUSTED,
            Name, "test");
        this.plugin.reloadScripts();
        return this.plugin.getScripts().get(Name);
    }

    /**
     * Subscribing to an event resolves its module by binary name.
     *
     * Six Paper event types share a simple name with a Bukkit one. Asking
     * for the module by simple name would define the wrong type's, so
     * subscribing to Paper's BellRingEvent would define Bukkit's. Both
     * HostEvents and Marshal ask by binary name for that reason, and this
     * pins it: the module that gets defined is the renamed one.
     */
    @Test
    public void subscribingToARenamedEventDefinesTheRenamedModule() throws Exception {
        ScriptContext ctx = loadTrusted("ring.aus",
            "class Main {\n"
          + "  public main() {\n"
          + "    try {\n"
          + "      events.on(\"io.papermc.paper.event.block.BellRingEvent\", ::go);\n"
          + "      store.set(\"registered\", true);\n"
          + "    } catch (e) { store.set(\"refused\", e.getText()); }\n"
          + "    return 0;\n"
          + "  }\n"
          + "  public go(Evt) { return 0; }\n"
          + "}\n");
        assertNotNull(ctx, "the script must load");
        assertEquals(Boolean.TRUE, ctx.getStore().get("registered"),
            "trusted grants Paper's BellRingEvent, so the subscription must be"
            + " accepted. Refused with: " + ctx.getStore().get("refused"));
        assertTrue(ctx.getHost().containsClass("BlockBellRingEvent"),
            "the module defined must be the one this type was renamed to");
        assertFalse(ctx.getHost().containsClass("BellRingEvent"),
            "and not Bukkit's, which merely shares the simple name");
    }

    /**
     * A withheld event stays withheld even when the script has already
     * defined a class under its name.
     *
     * PaperModules.includeType returns true early when the engine already
     * has a class of that name, without consulting the tier. That is safe
     * only because both callers check the tier first, by binary name. This
     * is the test that fails if either stops doing so.
     */
    @Test
    public void aWithheldEventStaysWithheldWhenItsNameIsOccupied() throws Exception {
        ScriptContext ctx = load("fish.aus",
            "extern class PlayerFishEvent :"
          + " com.lehman.aussomcraft.paper.gen.untrusted.EntityShim {\n"
          + "    public extern getName();\n"
          + "}\n"
          + "class Main {\n"
          + "  public main() {\n"
          + "    try {\n"
          + "      events.on(\"org.bukkit.event.player.PlayerFishEvent\", ::go);\n"
          + "      store.set(\"registered\", true);\n"
          + "    } catch (e) { store.set(\"refused\", true); }\n"
          + "    return 0;\n"
          + "  }\n"
          + "  public go(Evt) { return 0; }\n"
          + "}\n");
        assertNotNull(ctx, "the declaration is legal, so the script loads");
        assertFalse(Boolean.TRUE.equals(ctx.getStore().get("registered")),
            "PlayerFishEvent is not an untrusted type. Occupying its name must"
            + " not make it subscribable: the tier is checked on the Paper"
            + " class before the engine is asked for a class by name.");
        assertEquals(Boolean.TRUE, ctx.getStore().get("refused"),
            "and the refusal must reach the script");
    }

    /**
     * The declaration itself loads. It binds untrusted's own EntityShim,
     * which its allowlist permits, and the class name is just an identifier.
     */
    @Test
    public void anUntrustedScriptMayNameAClassAfterAWithheldType() throws Exception {
        ScriptContext ctx = load("occupy.aus",
            "extern class Villager : com.lehman.aussomcraft.paper.gen.untrusted.EntityShim {\n"
          + "    public extern getName();\n"
          + "    public extern getLocation();\n"
          + "}\n"
          + "class Main { public main() { return 0; } }\n");
        assertNotNull(ctx, "the declaration binds this tier's own shim, so it loads");
    }

    /**
     * Naming another tier's shim is still refused, by the extern allowlist
     * rather than by anything about the class name.
     */
    @Test
    public void namingAnotherTiersShimIsStillRefused() throws Exception {
        ScriptContext ctx = load("reach.aus",
            "extern class Villager : com.lehman.aussomcraft.paper.gen.trusted.EntityShim {\n"
          + "    public extern getName();\n"
          + "}\n"
          + "class Main { public main() { return 0; } }\n");
        assertNull(ctx, "untrusted must not bind a trusted shim, whatever the class"
            + " is called");
    }

    /**
     * The whole point, end to end: a live villager does not reach an
     * untrusted script even though the script occupied the name and the
     * call it made is allowlisted.
     *
     * This is the test that would have caught the old behaviour. Before
     * Marshal checked the Paper class against the tier, declaring a class
     * called Villager was enough to have real villagers routed into it.
     */
    @Test
    public void aLiveVillagerDoesNotReachTheScriptThroughAnOccupiedName() throws Exception {
        ScriptContext ctx = load("live.aus",
            "extern class Villager : com.lehman.aussomcraft.paper.gen.untrusted.EntityShim {\n"
          + "    public extern getName();\n"
          + "    public extern getUniqueId();\n"
          + "    public extern getType();\n"
          + "}\n"
          + "class Main {\n"
          + "  public main() { events.on(\"EntityDamageByEntityEvent\", ::go); return 0; }\n"
          + "  public go(Evt) {\n"
          + "    try {\n"
          + "      v = Evt.getEntity();\n"
          + "      if (v == null) { store.set(\"got\", \"null\"); }\n"
          + "      else {\n"
          + "        store.set(\"got\", \"object\");\n"
          + "        store.set(\"name\", v.getName());\n"
          + "        store.set(\"type\", v.getType());\n"
          + "      }\n"
          + "    } catch (e) { store.set(\"threw\", e.getText()); }\n"
          + "  }\n"
          + "}\n");
        assertNotNull(ctx, "the script must load");

        WorldMock world = this.server.addSimpleWorld("w");
        Entity villager = world.spawnEntity(new Location(world, 0, 64, 0), EntityType.VILLAGER);
        Player attacker = this.server.addPlayer("Attacker");
        this.server.getPluginManager().callEvent(new EntityDamageByEntityEvent(
            attacker, villager, EntityDamageEvent.DamageCause.ENTITY_ATTACK, 1.0));

        // This is the exposure, stated rather than prevented. An untrusted
        // script can observe an entity of a type its tier does not model, at
        // the level of the shim it bound. Everything here is state any player
        // standing next to the villager can see, and every method used is one
        // untrusted already grants on entities it is given legitimately.
        assertNull(ctx.getStore().get("threw"),
            "the handler must not have thrown: " + ctx.getStore().get("threw"));
        assertEquals("null", ctx.getStore().get("got"),
            "occupying the name must not route a withheld type to the script."
            + " Marshal asks the tier what a Villager may be wrapped in and"
            + " gets no answer, before any class is looked up by name, so it"
            + " does not matter what the script called its own classes.");

        // Nothing was read off it, because nothing arrived.
        assertNull(ctx.getStore().get("name"),
            "no value arrived, so nothing can have been read from one");
    }

    /**
     * A method the bound shim does not have is not reachable by declaring
     * it, which is what keeps this from being an escalation.
     */
    @Test
    public void aWithheldMethodIsStillNotReachable() throws Exception {
        ScriptContext ctx = load("methods.aus",
            "extern class Villager : com.lehman.aussomcraft.paper.gen.untrusted.EntityShim {\n"
          + "    public extern setOp(A0);\n"
          + "}\n"
          + "class Main {\n"
          + "  public main() {\n"
          + "    v = new Villager();\n"
          + "    try { v.setOp(true); store.set(\"called\", true); }\n"
          + "    catch (e) { store.set(\"refused\", e.getText()); }\n"
          + "    return 0;\n"
          + "  }\n"
          + "}\n");
        assertNotNull(ctx, "the script loads; the refusal is at call time");
        assertNull(ctx.getStore().get("called"),
            "setOp must not be callable: untrusted's EntityShim has no such method");
        Object why = ctx.getStore().get("refused");
        assertNotNull(why, "the call must have been refused");
        assertTrue(String.valueOf(why).contains("EXTERN_NO_SUCH_METHOD")
                || String.valueOf(why).toLowerCase().contains("no such method"),
            "must fail because the shim has no setOp, not for some other reason."
            + " Got: " + why);
    }
}
