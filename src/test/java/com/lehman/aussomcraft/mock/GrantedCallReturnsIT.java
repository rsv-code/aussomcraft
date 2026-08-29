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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockbukkit.mockbukkit.MockBukkit;
import org.mockbukkit.mockbukkit.ServerMock;
import org.mockbukkit.mockbukkit.world.WorldMock;

import com.lehman.aussomcraft.AussomCraftPlugin;
import com.lehman.aussomcraft.script.ScriptContext;

/**
 * A method the tier grants must return something the tier can hold.
 *
 * EntityDamageByEntityEvent.getEntity is on the untrusted allowlist and
 * Paper declares it returning Entity, a type untrusted has. So a script
 * calling it must get an Entity back.
 *
 * The shim a value is wrapped in is chosen by Marshal.shimNameOf, which
 * returns the most specific Paper interface the object implements and knows
 * nothing about tiers. A villager resolves to "Villager", untrusted has no
 * module of that name, and the value is dropped. Nothing in the tier model
 * asked for that: the allowlist granted the call and the tier has the
 * declared return type.
 *
 * @author Austin Lehman
 */
public class GrantedCallReturnsIT {

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

    /** An ordinary untrusted script. No declared classes, no tricks. */
    private ScriptContext hitBy(EntityType Type) throws Exception {
        ScriptContext ctx = load("hurt.aus",
            "class Main {\n"
          + "  public main() { events.on(\"EntityDamageByEntityEvent\", ::go); return 0; }\n"
          + "  public go(Evt) {\n"
          + "    try {\n"
          + "      v = Evt.getEntity();\n"
          + "      if (v == null) { store.set(\"got\", \"null\"); }\n"
          + "      else { store.set(\"got\", \"object\"); store.set(\"name\", v.getName()); }\n"
          + "    } catch (e) { store.set(\"got\", \"threw: \" + e.getText()); }\n"
          + "  }\n"
          + "}\n");
        assertNotNull(ctx, "the script must load");

        WorldMock world = this.server.addSimpleWorld("w" + Type.name());
        Entity victim = world.spawnEntity(new Location(world, 0, 64, 0), Type);
        Player attacker = this.server.addPlayer("Attacker" + Type.name());
        this.server.getPluginManager().callEvent(new EntityDamageByEntityEvent(
            attacker, victim, EntityDamageEvent.DamageCause.ENTITY_ATTACK, 1.0));
        return ctx;
    }

    /**
     * A script never writes 'include PlayerMoveEvent;' and does not have to.
     *
     * Only the eight types in PaperModules.CORE are defined up front.
     * Everything else is read when it is first needed, and for an event that
     * is at subscribe time: HostEvents.on includes the event's module before
     * registering, so the dispatch path never parses and a handler never
     * sees a missing class.
     */
    @Test
    public void anEventTypeIsIncludedWithoutTheScriptAskingForIt() throws Exception {
        ScriptContext ctx = load("move.aus",
            "class Main {\n"
          + "  public main() { events.on(\"PlayerMoveEvent\", ::go); return 0; }\n"
          + "  public go(Evt) {\n"
          + "    try { store.set(\"who\", Evt.getPlayer().getName()); }\n"
          + "    catch (e) { store.set(\"threw\", e.getText()); }\n"
          + "  }\n"
          + "}\n");
        assertNotNull(ctx, "the script must load with no include line");
        assertTrue(ctx.getHost().containsClass("PlayerMoveEvent"),
            "subscribing must have defined the event's class, so the dispatch"
            + " path never has to parse one");

        WorldMock world = this.server.addSimpleWorld("wmove");
        Player p = this.server.addPlayer("Walker");
        this.server.getPluginManager().callEvent(new PlayerMoveEvent(p,
            new Location(world, 0, 64, 0), new Location(world, 1, 64, 0)));

        assertNull(ctx.getStore().get("threw"),
            "the handler must not have thrown: " + ctx.getStore().get("threw"));
        assertEquals("Walker", ctx.getStore().get("who"),
            "the handler must have received a real event");
    }

    /**
     * The paired positive. A player victim does arrive, so the null above
     * is the tier refusing a type rather than getEntity being broken.
     */
    @Test
    public void aPlayerVictimArrives() throws Exception {
        ScriptContext ctx = load("hurt.aus",
            "class Main {\n"
          + "  public main() { events.on(\"EntityDamageByEntityEvent\", ::go); return 0; }\n"
          + "  public go(Evt) {\n"
          + "    v = Evt.getEntity();\n"
          + "    if (v == null) { store.set(\"got\", \"null\"); }\n"
          + "    else { store.set(\"got\", \"object\"); store.set(\"name\", v.getName()); }\n"
          + "  }\n"
          + "}\n");
        assertNotNull(ctx, "the script must load");
        this.server.addSimpleWorld("wp");
        Player victim = this.server.addPlayer("Victim");
        Player attacker = this.server.addPlayer("Attacker");
        this.server.getPluginManager().callEvent(new EntityDamageByEntityEvent(
            attacker, victim, EntityDamageEvent.DamageCause.ENTITY_ATTACK, 1.0));
        assertEquals("object", ctx.getStore().get("got"),
            "a player victim is an untrusted type and must arrive");
        assertEquals("Victim", ctx.getStore().get("name"),
            "and must be the player who was hit");
    }

    /**
     * A villager is not an untrusted type, so it does not arrive.
     *
     * getEntity is allowlisted and Paper declares it returning Entity, but
     * the object is a Villager and untrusted's manifest does not list one.
     * Marshal decides from the Paper class, so the value is dropped rather
     * than narrowed to Entity. That keeps the tier's type list exact, and
     * it is why a script has to check for null here.
     */
    @Test
    public void aGrantedGetterReturnsAnEntityForAVillager() throws Exception {
        ScriptContext ctx = hitBy(EntityType.VILLAGER);
        assertEquals("null", ctx.getStore().get("got"),
            "untrusted has no Villager type, so the value is dropped rather"
            + " than wrapped in a supertype's shim. Strict: a tier holds"
            + " exactly the types its manifest lists.");
    }

    /** A zombie, to show it is not one type but every non-player entity. */
    @Test
    public void aGrantedGetterReturnsAnEntityForAZombie() throws Exception {
        ScriptContext ctx = hitBy(EntityType.ZOMBIE);
        assertEquals("null", ctx.getStore().get("got"),
            "same for a zombie, and for every entity untrusted was not given");
    }
}
