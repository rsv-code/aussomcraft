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

package com.lehman.aussomcraft.audit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Where the audit put things, asserted against the generated output.
 *
 * Every case here was found by reading the generated API rather than by
 * reasoning about the rules, so each one is a decision the rules happened to
 * get right or wrong on a particular day. Asserting the output means a rule
 * change that moves any of them shows up as a failing test rather than as a
 * quiet difference in eighty thousand generated lines.
 */
public class TierPlacementTest {

    private static final Path PAPER =
        Paths.get("src", "main", "resources", "com", "lehman", "aussomcraft", "aus", "paper");

    /** Reads a generated module, or an empty string when the tier has no such type. */
    private static String module(String Tier, String Type) throws IOException {
        Path p = PAPER.resolve(Tier).resolve(Type + ".aus");
        if (!Files.exists(p)) {
            return "";
        }
        return new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
    }

    private static boolean has(String Tier, String Type, String Method) throws IOException {
        return module(Tier, Type).contains("public extern " + Method + "(");
    }

    /**
     * The server control plane, which only the dangerous tier may touch.
     *
     * performCommand and dispatchCommand are the console door in method form,
     * setOp hands that door to a person, and the whitelist setters decide who
     * may connect at all. None of them name a type that leaves the game
     * world, so nothing but an explicit list keeps them out of trusted.
     */
    @ParameterizedTest
    @CsvSource({
        "Player,performCommand", "Player,setOp", "Player,setWhitelisted",
        "Server,dispatchCommand", "Server,shutdown", "Server,setWhitelist",
        "Plugin,reloadConfig", "Event,callEvent", "PluginCommand,setExecutor",
        "PluginCommand,setTabCompleter"
    })
    public void controlPlaneIsDangerousOnly(String Type, String Method) throws IOException {
        assertFalse(has("untrusted", Type, Method),
            Type + "." + Method + " must not be reachable from an untrusted script.");
        assertFalse(has("trusted", Type, Method),
            Type + "." + Method + " is server control plane and must not be in trusted.");
    }

    /**
     * In-game administration, which section 3.3 of design 2 places in trusted.
     *
     * These were briefly lost to a prefix match and the loss was invisible,
     * because a missing method reads exactly like a method the tier never had.
     */
    @ParameterizedTest
    @CsvSource({
        "Player,kick", "Player,kickPlayer", "Player,ban", "Player,banPlayer"
    })
    public void inGameAdminIsTrusted(String Type, String Method) throws IOException {
        assertTrue(has("trusted", Type, Method),
            Type + "." + Method + " is in-game administration and belongs in trusted.");
    }

    /**
     * Ordinary gameplay that a prefix match on "op" swept up with opping.
     * Eighteen open* methods went to dangerous, so no trusted script could
     * show a player an inventory.
     */
    @ParameterizedTest
    @ValueSource(strings = {"openInventory", "openBook", "openWorkbench", "openAnvil"})
    public void openMethodsAreTrusted(String Method) throws IOException {
        assertTrue(has("trusted", "Player", Method),
            "Player." + Method + " is gameplay, not opping, and belongs in trusted.");
    }

    /** Reading a state is not changing it, so the readers stay available. */
    @ParameterizedTest
    @ValueSource(strings = {"isOp", "isWhitelisted", "isBanned"})
    public void readersStayInTrusted(String Method) throws IOException {
        assertTrue(has("trusted", "Player", Method),
            "Player." + Method + " only reads and belongs in trusted.");
    }

    /**
     * Types that reach past the game entirely. A plugin handle leads to
     * getConfig().save(path), a class loader loads code, and the tick manager
     * can stop the server for everyone.
     */
    @ParameterizedTest
    @ValueSource(strings = {
        "JavaPlugin", "PluginBase", "PluginClassLoader", "PluginCommand",
        "ServerTickManager", "ConfigurationSerialization"
    })
    public void dangerousTypesAreAbsentBelowDangerous(String Type) throws IOException {
        assertTrue(module("untrusted", Type).isEmpty(),
            Type + " must not have an untrusted shim.");
        assertTrue(module("trusted", Type).isEmpty(),
            Type + " must not have a trusted shim.");
    }

    /**
     * The path-as-a-String hole. These take a file name, so no rule about
     * types can see them, and save writes wherever it is told.
     */
    @ParameterizedTest
    @ValueSource(strings = {"FileConfiguration", "YamlConfiguration", "MemoryConfiguration"})
    public void configurationCannotTouchTheFilesystem(String Type) throws IOException {
        assertFalse(has("trusted", Type, "save"),
            Type + ".save writes to an arbitrary path and must not be in trusted.");
        assertFalse(has("trusted", Type, "load"),
            Type + ".load reads an arbitrary path and must not be in trusted.");
    }

    /** The in-memory round trip is the safe half, and it stays. */
    @Test
    public void configurationKeepsItsStringRoundTrip() throws IOException {
        assertTrue(has("trusted", "YamlConfiguration", "saveToString"),
            "saveToString never names a file and is how a script persists through the store.");
        assertTrue(has("trusted", "YamlConfiguration", "loadFromString"),
            "loadFromString never names a file.");
    }

    /**
     * Untrusted observes and talks. A mutator reaching it would be a tier
     * break, and these are the ones nearest the line.
     */
    @ParameterizedTest
    @CsvSource({
        "ServerCommandEvent,setCommand", "PlayerCommandPreprocessEvent,setMessage",
        "Player,setOp", "Player,kick", "Player,ban", "Player,setHealth"
    })
    public void untrustedCannotMutate(String Type, String Method) throws IOException {
        assertFalse(has("untrusted", Type, Method),
            "untrusted/" + Type + "." + Method + " changes state and breaks the tier.");
    }

    /**
     * The untrusted tier observes and talks, and does nothing else.
     *
     * Asserted over the whole tier rather than method by method, because the
     * ways in are rules and a rule admits things nobody listed. A bare
     * startsWith on "can" let cancelMessage through as a reader, and the
     * same rule would have handed an event's zero argument cancel() to
     * untrusted had one existed.
     */
    @Test
    public void everyUntrustedMethodOnlyReadsOrSends() throws IOException {
        Set<String> sends = new HashSet<String>(Arrays.asList(
            "sendMessage", "sendActionBar", "sendPlainMessage", "sendRichMessage"));
        Set<String> operators = new HashSet<String>(Arrays.asList(
            "__opEq__", "hashCode", "toString"));
        // Paper's newer API reads without a get prefix. These are readers,
        // named one at a time so the test still fails on a mutator.
        Set<String> fluentReaders = new HashSet<String>(Arrays.asList("message"));
        Pattern decl = Pattern.compile("public\\s+extern\\s+(\\w+)\\s*\\(");
        Pattern reader = Pattern.compile("^(get|is|has|can)[A-Z]");

        List<String> bad = new ArrayList<String>();
        int seen = 0;
        try (DirectoryStream<Path> dir =
                Files.newDirectoryStream(PAPER.resolve("untrusted"), "*.aus")) {
            for (Path f : dir) {
                String src = new String(Files.readAllBytes(f), StandardCharsets.UTF_8);
                Matcher m = decl.matcher(src);
                while (m.find()) {
                    String name = m.group(1);
                    seen++;
                    if (operators.contains(name) || fluentReaders.contains(name)
                            || reader.matcher(name).find()) {
                        continue;
                    }
                    // A mangled overload is still the method it was named
                    // after. sendMessage_Component sends a message.
                    boolean sending = false;
                    for (String snd : sends) {
                        if (name.equals(snd) || name.startsWith(snd + "_")) {
                            sending = true;
                        }
                    }
                    if (sending) {
                        continue;
                    }
                    bad.add(f.getFileName() + ": " + name);
                }
            }
        }
        assertTrue(seen > 150, "the untrusted tier should have been scanned, saw " + seen);
        assertTrue(bad.isEmpty(),
            "untrusted may only read and send. Found: " + bad);
    }

    /**
     * Text a person typed, and the address they typed it from.
     *
     * These all read, so the untrusted rule admitted them and the tier-wide
     * reader invariant still passes with them present. Reading is the whole
     * problem: a command line carries whatever the command took, which on a
     * server running an authentication plugin is a password, and on any
     * server is every private message. The console and RCON forms carry an
     * operator's typing.
     *
     * An untrusted script needs no filesystem and no network to use this. It
     * has server.tell, so it can hand what it reads to a player.
     */
    @ParameterizedTest
    @CsvSource({

        "TabCompleteEvent,getBuffer",
        "UnknownCommandEvent,getCommandLine",
        "PlayerLoginEvent,getHostname",
        "AsyncPlayerPreLoginEvent,getHostname",
        "ServerListPingEvent,getHostname"
    })
    public void untrustedCannotReadWhatPeopleTyped(String Type, String Method)
            throws IOException {
        assertFalse(has("untrusted", Type, Method),
            "untrusted/" + Type + "." + Method + " discloses typed input or a"
            + " connection address and must not be at untrusted.");
        assertTrue(has("trusted", Type, Method),
            Type + "." + Method + " should still be available to trusted.");
    }

    /**
     * Every command event is dangerous in full, not just its readers.
     *
     * setCommand on the console and RCON forms, and setMessage on the player
     * and sign forms, all replace the command something is about to run.
     * setPlayer changes who the event says ran it. Denying them by method
     * name missed the player form, because it spells the same capability
     * with a different word, so the types go whole.
     */
    @ParameterizedTest
    @ValueSource(strings = {"ServerCommandEvent", "RemoteServerCommandEvent",
        "PlayerCommandPreprocessEvent", "PlayerSignCommandPreprocessEvent"})
    public void consoleCommandEventsAreDangerousOnly(String Type) throws IOException {
        assertTrue(module("untrusted", Type).isEmpty(),
            Type + " must not be at untrusted.");
        assertTrue(module("trusted", Type).isEmpty(),
            Type + " carries setCommand, which rewrites what the console runs,"
            + " so it must not be at trusted either.");
    }

    /**
     * Chat stays. It is public to everyone in range already, so reading it
     * discloses nothing that standing there would not, and reacting to chat
     * is a normal thing for a script to do.
     */
    @ParameterizedTest
    @ValueSource(strings = {"AsyncPlayerChatEvent"})
    public void untrustedCanStillReadPublicChat(String Type) throws IOException {
        assertTrue(has("untrusted", Type, "getMessage"),
            Type + ".getMessage is public chat and should stay at untrusted.");
    }


    /**
     * Permissions are the server's authorization, so changing them is
     * control plane wherever the types happen to live.
     *
     * These reached trusted through static methods. A static needs no
     * receiver, so the protection the design leans on, that a shim a script
     * builds for itself wraps nothing, does not apply: a trusted script
     * could instantiate DefaultPermissions and register a global node, and
     * nothing tracked it, so unloading the script left it behind.
     */
    @ParameterizedTest
    @ValueSource(strings = {
        "DefaultPermissions", "BroadcastPermissions", "CommandPermissions",
        "Permission", "PermissionAttachment", "PermissibleBase"
    })
    public void permissionControlIsDangerousOnly(String Type) throws IOException {
        assertTrue(module("untrusted", Type).isEmpty(),
            Type + " must not have an untrusted shim.");
        assertTrue(module("trusted", Type).isEmpty(),
            Type + " changes authorization and must not be in trusted.");
    }

    /**
     * The route to a live player's permissions, which was worse than
     * registering a node. getEffectivePermissions is readable, and an
     * attachment reached through it carries setPermission.
     */
    @Test
    public void trustedCannotReachAPermissionAttachment() throws IOException {
        assertFalse(has("trusted", "PermissionAttachmentInfo", "getAttachment"),
            "an attachment carries setPermission, which grants a permission to a"
            + " live player, so trusted must not be able to reach one.");
        assertTrue(has("trusted", "PermissionAttachmentInfo", "getPermission"),
            "reading which permission it is stays available.");
    }

    /** Reading permissions is not changing them, so the checks stay. */
    @ParameterizedTest
    @ValueSource(strings = {"hasPermission", "isPermissionSet", "isOp",
        "getEffectivePermissions"})
    public void permissionChecksStayInTrusted(String Method) throws IOException {
        assertTrue(has("trusted", "Player", Method),
            "Player." + Method + " only reads and belongs in trusted.");
    }

    /** A static global cache shared by everything that renders a map. */
    @Test
    public void mapPaletteCacheIsNotTrusted() throws IOException {
        assertFalse(has("trusted", "MapPalette", "setMapColorCache"),
            "setMapColorCache mutates a static shared by the whole server.");
    }

    /**
     * Untrusted may send a message, but not one that acts.
     *
     * `sendRichMessage` parses MiniMessage, and MiniMessage is not only
     * colour. `<click:run_command:'...'>` produces a message that runs a
     * command when the recipient clicks it, with the recipient's own
     * permissions, so one sent to an operator is a route out of the tier.
     * `<click:open_url:'...'>` gets data off the server through the
     * recipient's browser.
     */
    @ParameterizedTest
    @ValueSource(strings = {"Player", "Entity", "HumanEntity", "LivingEntity"})
    public void untrustedCannotSendRichText(String Type) throws IOException {
        assertFalse(has("untrusted", Type, "sendRichMessage"),
            Type + ".sendRichMessage parses MiniMessage, which can carry a"
            + " run_command click event, and must not be at untrusted.");
        assertTrue(has("trusted", Type, "sendRichMessage"),
            "trusted keeps it.");
    }

    /** Plain messaging stays, or untrusted cannot talk at all. */
    @ParameterizedTest
    @ValueSource(strings = {"sendMessage", "sendPlainMessage", "sendActionBar"})
    public void untrustedCanStillSendPlainMessages(String Method) throws IOException {
        assertTrue(has("untrusted", "Player", Method),
            "Player." + Method + " does not parse anything and must stay.");
    }

    /**
     * Every way to make a command run, kept out of the tiers that should not
     * have one.
     *
     * Found by reading what Paper says these methods do rather than what
     * they are called. `chat` is the one that hides: "Says a message (or
     * runs a command)", so a string beginning with a slash runs as that
     * player, with that player's permissions. A script calling it while an
     * operator is online is acting as the operator.
     */
    @ParameterizedTest
    @CsvSource({
        "Player,chat", "Player,performCommand",
        "Server,dispatchCommand", "Bukkit,dispatchCommand",
        "ServerCommandEvent,setCommand", "RemoteServerCommandEvent,setCommand",
        "CommandBlockHolder,setCommand", "CommandMinecart,setCommand"
    })
    public void nothingBelowDangerousCanMakeACommandRun(String Type, String Method)
            throws IOException {
        assertFalse(has("untrusted", Type, Method),
            "untrusted/" + Type + "." + Method + " can make a command run.");
        assertFalse(has("trusted", Type, Method),
            "trusted/" + Type + "." + Method + " runs a command with somebody"
            + " else's authority, which is the dangerous tier by another name.");
    }
}
