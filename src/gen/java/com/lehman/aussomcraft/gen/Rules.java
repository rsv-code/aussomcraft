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

package com.lehman.aussomcraft.gen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.TreeSet;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * Which types are generated, and which tier each method belongs to.
 *
 * Everything here is a rule about shapes rather than a list of members, so a
 * new Paper release classifies itself. See design/aussomcraft-design-2.md
 * section 3.
 *
 * @author Austin Lehman
 */
public final class Rules {

    /** Packages the generator reads types from. */
    public static final String[] API_PACKAGES = {
        "org.bukkit.", "io.papermc.", "com.destroystokyo.",
    };

    /** Packages never generated, because they are not stable public API. */
    private static final String[] NEVER = {
        "net.minecraft.", "org.bukkit.craftbukkit.",
        // The pre-1.13 material API, deprecated in Bukkit since the
        // flattening and replaced by org.bukkit.block.data. Excluded rather
        // than generated: 67 types nobody should call, and because a simple
        // name is the Aussom class name, they collided with the modern types
        // that replaced them. 26 of the 69 name collisions were this package
        // alone, and alphabetical tie breaking handed it the bare name, so
        // 'Bed' meant the deprecated material rather than the block.
        "org.bukkit.material.",
    };

    /**
     * The server control plane, and the types that register callbacks or
     * schedule work. Both go to the dangerous tier: the first because they
     * are the server rather than the game, the second because registration
     * has to stay with the host externs or unload cannot stop a script.
     */
    /**
     * Package trees that belong to the dangerous tier entirely.
     *
     * Naming types one at a time loses to simple name collisions: denying
     * org.bukkit.plugin.PluginLoader left io.papermc.paper.plugin.loader.PluginLoader
     * reachable, and the same trap waits behind every plugin and class
     * loading type Paper adds. These trees are plugin machinery and class
     * loading; no script has business in either.
     */
    private static final String[] DANGEROUS_PACKAGES = {
        "org.bukkit.plugin.",
        "io.papermc.paper.plugin.",
        "org.bukkit.command.defaults.",
    };

    private static final Set<String> DANGEROUS_TYPES = new HashSet<String>(Arrays.asList(
        "org.bukkit.Server", "org.bukkit.Bukkit",
        "org.bukkit.plugin.PluginManager", "org.bukkit.plugin.Plugin",
        "org.bukkit.plugin.ServicesManager", "org.bukkit.plugin.PluginLoader",
        "org.bukkit.command.CommandMap", "org.bukkit.command.SimpleCommandMap",
        "org.bukkit.command.ConsoleCommandSender",
        "org.bukkit.UnsafeValues", "org.bukkit.plugin.messaging.Messenger",
        // Freezes, steps and re-rates the whole server tick. A trusted
        // script stopping the server for everyone is a denial of service
        // however politely the API is worded.
        "org.bukkit.ServerTickManager",
        // deserializeObject builds whatever class a map names, which is a
        // deserialization gadget, and unregisterClass can break another
        // plugin's serialization.
        "org.bukkit.configuration.serialization.ConfigurationSerialization",
        // Permissions are the server's authorization, so changing them is
        // control plane whatever tier the types sit in.
        //
        // These register permission nodes globally, through static methods.
        // A static needs no receiver, so the usual protection that a shim a
        // script builds for itself wraps nothing does not apply: a trusted
        // script could instantiate one and register a node, and nothing
        // tracked it, so unloading the script left it behind.
        "org.bukkit.util.permissions.DefaultPermissions",
        "org.bukkit.util.permissions.BroadcastPermissions",
        "org.bukkit.util.permissions.CommandPermissions",
        // Permission carries setDefault, addParent and recalculatePermissibles,
        // and its static loadPermission hands one back, so the mutators were
        // reachable without holding one to begin with.
        "org.bukkit.permissions.Permission",
        // Worse than registering a node: setPermission grants one to a live
        // player. An attachment was reachable from any tier that could read
        // getEffectivePermissions, through PermissionAttachmentInfo.
        "org.bukkit.permissions.PermissionAttachment",
        "org.bukkit.permissions.PermissibleBase",
        // The console and RCON command events. setCommand replaces what the
        // console is about to run, so a handler can turn any command an
        // operator types into one of its own choosing, and setCancelled can
        // stop them running commands at all. Reading them discloses whatever
        // an operator typed as an argument.
        "org.bukkit.event.server.ServerCommandEvent",
        "org.bukkit.event.server.RemoteServerCommandEvent",
        // The player and sign forms of the same thing. setMessage replaces
        // the command a player is about to run and setPlayer changes who the
        // event says ran it, so a handler can wait for an operator and turn
        // whatever they typed into a command of its own.
        //
        // Denied as whole types rather than by method name. The console
        // events were denied as types and these were missed because they
        // spell the same capability setMessage instead of setCommand, and
        // setMessage cannot be denied by name without also stopping a chat
        // filter, which is a fair thing for trusted to do.
        "org.bukkit.event.player.PlayerCommandPreprocessEvent",
        "io.papermc.paper.event.player.PlayerSignCommandPreprocessEvent",
        "org.bukkit.scheduler.BukkitScheduler", "org.bukkit.scheduler.BukkitRunnable",
        "org.bukkit.scheduler.BukkitTask",
        "org.bukkit.plugin.EventExecutor", "org.bukkit.plugin.RegisteredListener",
        // Handing a command to something else is registration too, and it
        // can take another plugin's command away as well as add one.
        "org.bukkit.command.CommandExecutor", "org.bukkit.command.TabCompleter",
        "org.bukkit.command.TabExecutor", "org.bukkit.command.PluginCommand",
        "org.bukkit.event.HandlerList", "org.bukkit.event.Listener",
        "io.papermc.paper.threadedregions.scheduler.RegionScheduler",
        "io.papermc.paper.threadedregions.scheduler.GlobalRegionScheduler",
        "io.papermc.paper.threadedregions.scheduler.EntityScheduler",
        "io.papermc.paper.threadedregions.scheduler.AsyncScheduler"
    ));

    /**
     * Java types allowed in a signature without being a Paper type. Anything
     * outside this set and the generated types means the method leaves the
     * game world.
     */
    private static final Set<Class<?>> VALUES = new HashSet<Class<?>>(Arrays.asList(
        void.class, boolean.class, byte.class, short.class, int.class,
        long.class, float.class, double.class, char.class,
        Boolean.class, Byte.class, Short.class, Integer.class, Long.class,
        Float.class, Double.class, Character.class, String.class,
        CharSequence.class, UUID.class, Number.class, Object.class,
        Date.class, java.time.Instant.class, java.time.Duration.class,
        // Adventure's Component marshals to and from a plain string, so a
        // method taking one is expressible without a shim for it.
        net.kyori.adventure.text.Component.class,
        net.kyori.adventure.text.ComponentLike.class
    ));

    /** Collection types marshalled element by element. */
    private static final Set<Class<?>> COLLECTIONS = new HashSet<Class<?>>(Arrays.asList(
        java.util.List.class, java.util.Set.class, java.util.Collection.class,
        java.util.Map.class, Iterable.class
    ));

    /**
     * The untrusted type list, curated because it is what strangers run.
     *
     * Player's supertypes are here because events hand them out: a damage
     * event gives an Entity, not a Player. PlayerInventory is here because
     * getInventory returns one, and without it that call answers null.
     */
    private static final Set<String> UNTRUSTED_TYPES = new HashSet<String>(Arrays.asList(
        "org.bukkit.entity.Player", "org.bukkit.entity.Entity",
        "org.bukkit.entity.LivingEntity", "org.bukkit.entity.HumanEntity",
        "org.bukkit.World", "org.bukkit.block.Block", "org.bukkit.Location",
        "org.bukkit.inventory.ItemStack",
        "org.bukkit.inventory.Inventory", "org.bukkit.inventory.PlayerInventory"
    ));

    /**
     * The events untrusted may see, named one at a time.
     *
     * This used to be every type under org.bukkit.event, 287 of them. Paper
     * has around 200 documented events and small scripts use about a dozen,
     * so the rest were surface with no demand behind them, and two of the
     * findings in this project were events nobody had asked for.
     *
     * Adding one is a decision, not a consequence of where Paper happened to
     * put a class. See design/untrusted-api-research.md for where this list
     * came from.
     */
    private static final Set<String> UNTRUSTED_EVENTS = new HashSet<String>(Arrays.asList(
        "org.bukkit.event.player.PlayerJoinEvent",
        "org.bukkit.event.player.PlayerQuitEvent",
        // Both chat events. The Bukkit one is deprecated in favour of the
        // Paper one but still fires, and a script written against either
        // should keep working when that stops being true.
        "org.bukkit.event.player.AsyncPlayerChatEvent",
        "io.papermc.paper.event.player.AsyncChatEvent",
        "org.bukkit.event.entity.PlayerDeathEvent",
        "org.bukkit.event.player.PlayerRespawnEvent",
        "org.bukkit.event.block.BlockBreakEvent",
        "org.bukkit.event.block.BlockPlaceEvent",
        "org.bukkit.event.player.PlayerInteractEvent",
        "org.bukkit.event.entity.EntityDamageByEntityEvent",
        "org.bukkit.event.player.PlayerMoveEvent",
        "org.bukkit.event.inventory.InventoryClickEvent",
        "org.bukkit.event.player.PlayerTeleportEvent"
    ));

    /**
     * Whether untrusted may see this type at all.
     *
     * @param Type is the Paper type.
     * @return A boolean with true when untrusted has it.
     */
    private static boolean untrustedType(Class<?> Type) {
        return UNTRUSTED_TYPES.contains(Type.getName())
            || UNTRUSTED_EVENTS.contains(Type.getName());
    }

    /**
     * Methods no tier gets, because generated code for them will not compile.
     *
     * Keyed on the declaring class, so a method inherited by twenty types is
     * named once.
     *
     * These are not security decisions. They are places where Java's own
     * rules defeat the generator, and the honest answer is to leave them out
     * and say so rather than emit something that does not build.
     *
     * `DataComponentHolder.setData` has the forms `setData(Valued<T>,
     * DataComponentBuilder<T>)` and `setData(Valued<T>, T)`. The generated
     * call goes through the raw declaring type, so T erases to Object and a
     * builder argument fits both. Nothing lost: a script cannot build a
     * DataComponentBuilder, so no form of it was ever callable.
     */
    private static final Set<String> UNGENERATABLE = new HashSet<String>(Arrays.asList(
        "DataComponentHolder.setData",
        // ItemStack declares its own forms of the same shape rather than
        // inheriting them, so it needs naming separately.
        "ItemStack.setData"
    ));

    /**
     * Whether a method cannot be generated at all.
     *
     * @param M is the method.
     * @return A boolean with true when it must be left out.
     */
    public static boolean ungeneratable(Method M) {
        return UNGENERATABLE.contains(
            M.getDeclaringClass().getSimpleName() + "." + M.getName());
    }

    /**
     * The methods untrusted may call, read from untrusted-allowlist.txt.
     *
     * The untrusted tier is a list, not a rule. Rules match on name shape
     * and type, and what matters is capability, which a name does not carry:
     * `getSeed`, `sendRichMessage`, `chat` and `getMessage` all read like
     * ordinary getters and senders and every one was a finding.
     *
     * The structural rules still run, so this narrows rather than widens. A
     * name here is granted only on a type untrusted already has, and only in
     * the shape the rules already allow.
     */
    private static final Set<String> UNTRUSTED_ALLOWED = loadAllowlist();

    /** Names the rules would admit that the allowlist does not. */
    private static final Set<String> UNTRUSTED_CANDIDATES = new TreeSet<String>();

    /**
     * Reads the allowlist. A missing or unreadable file yields an empty set,
     * which grants nothing: failing closed is the only safe direction for a
     * file that decides what a stranger's script may call.
     *
     * Every entry is a fully qualified class and a method name. An entry
     * with no package would never match anything, and would fail closed so
     * quietly that the only symptom is a method missing from the tier, so
     * one is reported rather than kept.
     */
    private static Set<String> loadAllowlist() {
        Set<String> out = new HashSet<String>();
        InputStream in = Rules.class.getResourceAsStream("/untrusted-allowlist.txt");
        if (in == null) {
            System.err.println("untrusted-allowlist.txt not found;"
                + " the untrusted tier will be empty");
            return out;
        }
        try (BufferedReader r = new BufferedReader(
                new InputStreamReader(in, StandardCharsets.UTF_8))) {
            String line = r.readLine();
            while (line != null) {
                String t = line.trim();
                if (!t.isEmpty() && !t.startsWith("#")) {
                    if (t.indexOf('.') < 0) {
                        System.err.println("untrusted-allowlist.txt: '" + t
                            + "' names no class, so it can never match."
                            + " Entries are 'fully.qualified.Type.method'.");
                    } else {
                        out.add(t);
                    }
                }
                line = r.readLine();
            }
        } catch (IOException e) {
            System.err.println("could not read untrusted-allowlist.txt: " + e.getMessage());
            return new HashSet<String>();
        }
        return out;
    }

    /**
     * Names the rules would have admitted to untrusted but the allowlist did
     * not, so a Paper upgrade is a short review rather than a silent
     * widening.
     *
     * @return An unmodifiable Set of method names awaiting a decision.
     */
    public static Set<String> untrustedCandidates() {
        return Collections.unmodifiableSet(UNTRUSTED_CANDIDATES);
    }

    /** @return how many names the allowlist holds. */
    public static int untrustedAllowedCount() {
        return UNTRUSTED_ALLOWED.size();
    }

    /**
     * Message methods untrusted may call.
     *
     * `sendRichMessage` is deliberately absent. It parses MiniMessage, which
     * is not only colour: `<click:run_command:'...'>` produces a message that
     * runs a command when the recipient clicks it, with the recipient's own
     * permissions. Sent to an operator that is a route from untrusted to
     * whatever they can do, `/acraft trust ... dangerous` included.
     * `<click:open_url:'...'>` is a way off the server as well, since a
     * recipient's browser will fetch whatever the query string carries.
     *
     * The other three do not parse anything. A String reaching a Component
     * parameter becomes `Component.text`, which is literal, so no route
     * through them produces an event.
     */
    private static final Set<String> UNTRUSTED_MESSAGE = new HashSet<String>(Arrays.asList(
        "sendMessage", "sendActionBar", "sendPlainMessage"
    ));

    /**
     * Names that confer privilege or reach the host, whatever they sit on.
     *
     * callEvent and fireEvent are here because Event.callEvent() pushes a
     * synthetic event through the plugin manager. Its signature gives
     * nothing away, it takes no arguments and returns a boolean, but it
     * lets a script make every other plugin on the server act on an event
     * that never happened.
     */
    private static final Set<String> HARMFUL_NAMES = new HashSet<String>(Arrays.asList(
        // The console door. These run a command line as the server or as a
        // player, which is every control plane method at once.
        //
        // `chat` is here because Paper says what it does: "Says a message
        // (or runs a command)." A string beginning with a slash is run as
        // that player, with that player's permissions, so a script calling
        // it while an operator is online has the operator's authority. It
        // does not read like a command method, which is why it was missed
        // when `performCommand` was denied.
        "performCommand", "dispatchCommand", "chat",
        // Stopping and re-reading the server.
        "shutdown", "restart", "saveAll",
        "reload", "reloadCommandAliases", "reloadConfig", "reloadData",
        "reloadPermissions", "reloadWhitelist",
        // Granting operator is granting the console door to a person, so it
        // is escalation rather than in-game administration.
        "setOp",
        // Who may join at all is server access control, not gameplay.
        "setWhitelist", "setWhitelistEnforced", "setWhitelisted",
        // Synthetic events, see the comment above.
        "callEvent", "fireEvent",
        // Command registration outside our tracking.
        "setExecutor", "setTabCompleter",
        // Replacing the command something is about to run. On the console
        // and RCON events that is the operator's command; on a command block
        // or minecart it is one the world will run when powered.
        "setCommand",
        // A static cache on a Paper utility, shared by everything that
        // renders a map.
        "setMapColorCache"
    ));

    /**
     * Methods that take a file path as a String, which no type rule can see.
     *
     * FileConfiguration.save writes wherever it is told, and load reads the
     * same way. The signature is (String), so nothing about it says
     * filesystem. This is the override list section 3.3 of the design
     * describes, and these are the entries it needs.
     */
    private static final Set<String> PATH_AS_STRING = new HashSet<String>(Arrays.asList(
        "FileConfiguration.save", "FileConfiguration.load",
        "YamlConfiguration.save", "YamlConfiguration.load",
        "MemoryConfiguration.save", "MemoryConfiguration.load",
        "Configuration.save", "Configuration.load"
    ));

    private Rules() { }

    /**
     * Whether a type is one the generator produces a shim for.
     *
     * @param Type is the class to test.
     * @return A boolean with true when it is generated.
     */
    public static boolean isGenerated(Class<?> Type) {
        if (Type == null || Type.isArray() || Type.isPrimitive()) {
            return false;
        }
        String n = Type.getName();
        for (String p : NEVER) {
            if (n.startsWith(p)) {
                return false;
            }
        }
        if (!inApi(n)) {
            return false;
        }
        if (Type.isAnonymousClass() || Type.isSynthetic()) {
            return false;
        }
        return Modifier.isPublic(Type.getModifiers()) && !isInternal(Type);
    }

    /**
     * Whether a class is marked internal by Paper. Paper maintains this, so
     * it is free upkeep.
     *
     * @param Type is the class to test.
     * @return A boolean with true when it is internal.
     */
    public static boolean isInternal(Class<?> Type) {
        for (java.lang.annotation.Annotation a : Type.getAnnotations()) {
            if (a.annotationType().getName().endsWith("ApiStatus$Internal")) {
                return true;
            }
        }
        return false;
    }

    /** @return true when the name is inside the API packages. */
    public static boolean inApi(String ClassName) {
        for (String p : API_PACKAGES) {
            if (ClassName.startsWith(p)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Whether a type may appear in a signature at the given tier.
     *
     * @param Type is the type from the signature.
     * @param At is the tier being generated.
     * @return A boolean with true when the tier can express this type.
     */
    public static boolean typeAllowed(Class<?> Type, Tier At) {
        if (Type == null) {
            return false;
        }
        if (VALUES.contains(Type) || Type.isPrimitive()) {
            return true;
        }
        if (Type.isEnum()) {
            return isGenerated(Type) || inApi(Type.getName());
        }
        if (COLLECTIONS.contains(Type)) {
            return true;
        }
        if (!isGenerated(Type)) {
            return false;
        }
        return At.includes(tierOfType(Type));
    }

    /** DANGEROUS_TYPES resolved to classes, for assignability checks. */
    private static volatile List<Class<?>> dangerousResolved = null;

    /**
     * Whether a type is, or descends from, one of the control plane types.
     *
     * Assignability rather than an exact name. Matching names alone let
     * JavaPlugin and PluginBase through while denying the Plugin interface
     * they implement, and JavaPlugin reaches a FileConfiguration, which
     * writes files. Any implementation of a denied type is denied.
     *
     * @param Type is the class to test.
     * @return A boolean with true when it belongs to the dangerous tier.
     */
    public static boolean isDangerousType(Class<?> Type) {
        if (Type == null) {
            return false;
        }
        if (DANGEROUS_TYPES.contains(Type.getName())) {
            return true;
        }
        for (String pkg : DANGEROUS_PACKAGES) {
            if (Type.getName().startsWith(pkg)) {
                return true;
            }
        }
        for (Class<?> d : resolvedDangerous()) {
            if (d.isAssignableFrom(Type)) {
                return true;
            }
        }
        return false;
    }

    private static List<Class<?>> resolvedDangerous() {
        List<Class<?>> hit = dangerousResolved;
        if (hit != null) {
            return hit;
        }
        List<Class<?>> out = new ArrayList<Class<?>>();
        for (String n : DANGEROUS_TYPES) {
            try {
                out.add(Class.forName(n, false, Rules.class.getClassLoader()));
            } catch (Throwable absent) {
                // A type this build of Paper does not have.
            }
        }
        dangerousResolved = out;
        return out;
    }

    /**
     * The lowest tier a type is available at.
     *
     * @param Type is the class.
     * @return The Tier.
     */
    public static Tier tierOfType(Class<?> Type) {
        if (isDangerousType(Type)) {
            return Tier.DANGEROUS;
        }
        if (untrustedType(Type)) {
            return Tier.UNTRUSTED;
        }
        return Tier.TRUSTED;
    }

    /**
     * The lowest tier a method is available at, or null when it is never
     * generated.
     *
     * @param Owner is the declaring type.
     * @param M is the method.
     * @return The Tier, or null.
     */
    public static Tier tierOf(Class<?> Owner, Method M) {
        if (!Modifier.isPublic(M.getModifiers()) || M.isSynthetic()) {
            return null;
        }
        if (M.getDeclaringClass() == Object.class) {
            return null;
        }
        if (ungeneratable(M)) {
            return null;
        }
        if (harmful(Owner, M)) {
            return Tier.DANGEROUS;
        }
        if (untrusted(Owner, M)) {
            return Tier.UNTRUSTED;
        }
        return Tier.TRUSTED;
    }

    /**
     * Whether a method reaches outside the game or confers privilege.
     *
     * A method is harmful when it names a type the game does not deal in, or
     * carries a privilege verb, or is declared on a control plane type.
     */
    private static boolean harmful(Class<?> Owner, Method M) {
        if (isDangerousType(Owner)) {
            return true;
        }
        if (PATH_AS_STRING.contains(Owner.getSimpleName() + "." + M.getName())) {
            return true;
        }
        // Matched whole, never by prefix. A prefix test on "op" also catches
        // openInventory and every other open* method, and a script that
        // cannot open an inventory is broken rather than secured.
        if (HARMFUL_NAMES.contains(M.getName())) {
            return true;
        }
        if (!typeAllowed(M.getReturnType(), Tier.TRUSTED)) {
            return true;
        }
        for (Class<?> p : M.getParameterTypes()) {
            if (!typeAllowed(p, Tier.TRUSTED)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Whether the structural rules alone would have granted this to
     * untrusted. Only used to report what the allowlist is holding back.
     */
    private static boolean allowedByShape(Class<?> Owner, Method M) {
        if (UNTRUSTED_MESSAGE.contains(M.getName())) {
            return true;
        }
        if (M.getParameterCount() != 0) {
            return false;
        }
        return typeAllowed(M.getReturnType(), Tier.UNTRUSTED);
    }

    /**
     * Whether a name reads by the JavaBeans convention.
     *
     * The prefix has to end on a word boundary. A bare startsWith on "can"
     * also matches cancel and cancelMessage, and cancel is a mutator: on an
     * event it stops the event happening, which is not something untrusted
     * is granted. The same shape of mistake put every open* method in the
     * dangerous tier, so it is worth spelling out.
     *
     * @param Name is the method name.
     * @return A boolean with true when the name reads.
     */
    private static boolean isReaderName(String Name) {
        for (String p : new String[] { "get", "is", "has", "can" }) {
            if (Name.length() > p.length() && Name.startsWith(p)
                    && Character.isUpperCase(Name.charAt(p.length()))) {
                return true;
            }
        }
        return false;
    }

    private static boolean untrusted(Class<?> Owner, Method M) {
        if (!untrustedType(Owner)) {
            return false;
        }
        String n = M.getName();

        // Keyed on the type being generated, not on the declaring class, so
        // an inherited method is a separate decision on every type that
        // exposes it. Player.getName and World.getName are two lines, and
        // one can be refused without the other.
        if (!UNTRUSTED_ALLOWED.contains(Owner.getName() + "." + n)) {
            // Would have been admitted by shape. Recorded so the generator
            // can report it rather than quietly leaving it out.
            if (allowedByShape(Owner, M)) {
                UNTRUSTED_CANDIDATES.add(Owner.getName() + "." + n);
            }
            return false;
        }
        if (UNTRUSTED_MESSAGE.contains(n)) {
            return true;
        }
        // The allowlist is the gate, so the shape rule no longer has to
        // guess a method's nature from its name. It reaches here only
        // because somebody put it on the list.
        //
        // The prefix test used to be that guess, and it excluded Paper's
        // modern fluent accessors: AsyncChatEvent carries its text as
        // message(), not getMessage(), so a script could see chat happen
        // and not read it. Requiring a name to be listed is a stronger
        // check than requiring it to start with "get", and it is one a
        // person made rather than a rule inferred.
        //
        // What stays is what the name cannot tell us: a reader takes no
        // arguments, and it has to return something this tier can express.
        if (M.getParameterCount() != 0) {
            return false;
        }
        return typeAllowed(M.getReturnType(), Tier.UNTRUSTED);
    }

}
