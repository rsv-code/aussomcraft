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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * The shape of the untrusted tier, asserted as a whole.
 *
 * Every security finding in this project reached untrusted through a rule
 * that was working correctly. Rules match on name shape and type; capability
 * is what matters and a name does not carry it. So the tier is a list now,
 * and these are the properties that list has to keep.
 *
 * Written as whole-tier invariants rather than checks on named methods,
 * because a check on a named method only ever finds what somebody already
 * thought of. Everything here fails on things nobody enumerated.
 */
public class UntrustedSurfaceTest {

    private static final Path PAPER = Paths.get("src", "main", "resources",
        "com", "lehman", "aussomcraft", "aus", "paper");

    private static final Pattern DECL =
        Pattern.compile("public\\s+extern\\s+(\\w+)\\s*\\(([^)]*)\\)");

    /** The Paper method an extern binds, taken from its documentation link. */
    private static final Pattern BOUND =
        Pattern.compile("\\* Paper: (\\S+)\\n(?:.*?\\n)*?    public extern (\\w+)\\(");

    private static Set<String> modules(String Tier) throws IOException {
        Set<String> out = new TreeSet<String>();
        try (DirectoryStream<Path> d = Files.newDirectoryStream(PAPER.resolve(Tier), "*.aus")) {
            for (Path f : d) {
                String n = f.getFileName().toString();
                out.add(n.substring(0, n.length() - 4));
            }
        }
        return out;
    }

    private static String read(String Tier, String Type) throws IOException {
        Path p = PAPER.resolve(Tier).resolve(Type + ".aus");
        if (!Files.exists(p)) {
            return null;
        }
        return new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
    }

    /** Extern name to the Paper signature it binds, for one module. */
    private static Map<String, String> boundMethods(String Tier, String Type)
            throws IOException {
        String src = read(Tier, Type);
        if (src == null) {
            return null;
        }
        Map<String, String> out = new HashMap<String, String>();
        Matcher m = BOUND.matcher(src);
        while (m.find()) {
            if (!out.containsKey(m.group(2))) {
                out.put(m.group(2), m.group(1));
            }
        }
        return out;
    }

    /**
     * The tier is exactly the types and events somebody chose.
     *
     * It used to be eleven types plus every event Paper ships, 298 modules.
     * Two findings were events nobody had asked for. This is the list from
     * design/untrusted-api-research.md and nothing else belongs in it.
     */
    @Test
    public void untrustedIsExactlyTheChosenTypesAndEvents() throws IOException {
        Set<String> expected = new TreeSet<String>(Arrays.asList(
            // types
            "Player", "Entity", "LivingEntity", "HumanEntity",
            "Block", "World", "Location", "ItemStack", "Inventory", "PlayerInventory",
            // events
            "PlayerJoinEvent", "PlayerQuitEvent",
            "AsyncPlayerChatEvent", "AsyncChatEvent",
            "PlayerDeathEvent", "PlayerRespawnEvent", "BlockBreakEvent",
            "BlockPlaceEvent", "PlayerInteractEvent", "EntityDamageByEntityEvent",
            "PlayerMoveEvent", "InventoryClickEvent", "PlayerTeleportEvent"));
        assertEquals(expected, modules("untrusted"),
            "the untrusted tier must be exactly the reviewed list. Adding to it"
            + " is a decision; this is where the decision gets noticed.");
    }

    /**
     * The tier stays small enough to read.
     *
     * A surface nobody can read in one sitting is one nobody audits. This is
     * a ceiling, not a target: it was 2,481 declarations and is around 200.
     */
    @Test
    public void untrustedStaysSmall() throws IOException {
        int declarations = 0;
        for (String t : modules("untrusted")) {
            Matcher m = DECL.matcher(read("untrusted", t));
            while (m.find()) {
                declarations++;
            }
        }
        assertTrue(declarations > 100,
            "the tier should have been read, counted " + declarations);
        assertTrue(declarations < 400,
            "the untrusted tier has grown to " + declarations + " declarations."
            + " It is meant to stay small enough to read line by line. If this"
            + " growth is deliberate, raise the bound and say why.");
    }

    /**
     * A script that works untrusted must work when it is trusted.
     *
     * Elevation must not change behaviour, so every untrusted extern has to
     * exist at trusted under the same name and bind the same Paper method.
     * The binding matters as much as the name: overload naming is worked out
     * per tier, so the same name could reach a different method if the two
     * tiers ever stopped agreeing.
     */
    @Test
    public void everyUntrustedExternMeansTheSameThingAtTrusted() throws IOException {
        List<String> problems = new ArrayList<String>();
        int checked = 0;
        for (String t : modules("untrusted")) {
            Map<String, String> u = boundMethods("untrusted", t);
            Map<String, String> tr = boundMethods("trusted", t);
            if (tr == null) {
                problems.add(t + " has no trusted module, so elevating breaks it");
                continue;
            }
            for (Map.Entry<String, String> e : u.entrySet()) {
                checked++;
                String at = tr.get(e.getKey());
                if (at == null) {
                    problems.add(t + "." + e.getKey() + " disappears at trusted");
                } else if (!at.equals(e.getValue())) {
                    problems.add(t + "." + e.getKey() + " binds a different method at"
                        + " trusted: " + e.getValue() + " then " + at);
                }
            }
        }
        assertTrue(checked > 100, "should have compared the tier, saw " + checked);
        assertTrue(problems.isEmpty(),
            "elevating a script must not change what its calls mean: " + problems);
    }

    /**
     * Nothing at untrusted takes an argument except talking and comparing.
     *
     * A zero argument reader observes. Anything taking an argument is doing
     * something with it, and the only somethings this tier has are sending a
     * message and comparing two shims.
     */
    @Test
    public void nothingTakesArgumentsExceptMessagingAndEquality() throws IOException {
        Set<String> talking = new HashSet<String>(Arrays.asList(
            "__opEq__", "sendMessage", "sendActionBar", "sendPlainMessage"));
        List<String> odd = new ArrayList<String>();
        for (String t : modules("untrusted")) {
            Matcher m = DECL.matcher(read("untrusted", t));
            while (m.find()) {
                if (m.group(2).trim().isEmpty()) {
                    continue;
                }
                String base = m.group(1);
                int cut = base.indexOf('_');
                if (cut > 0) {
                    base = base.substring(0, cut);
                }
                if (!talking.contains(m.group(1)) && !talking.contains(base)) {
                    odd.add(t + "." + m.group(1) + "(" + m.group(2) + ")");
                }
            }
        }
        assertTrue(odd.isEmpty(),
            "untrusted observes and talks; nothing else may take an argument: " + odd);
    }

    /**
     * No shim method at untrusted works without an attached object.
     *
     * A static needs no receiver, so the protection that a shim a script
     * builds for itself wraps nothing does not apply to one. That is how the
     * permission registration finding reached trusted, and untrusted should
     * not have the shape at all.
     */
    @Test
    public void nothingAtUntrustedIsStatic() throws IOException {
        Path javaDir = Paths.get("src", "main", "java", "com", "lehman",
            "aussomcraft", "paper", "gen", "untrusted");
        List<String> unguarded = new ArrayList<String>();
        int methods = 0;
        try (DirectoryStream<Path> d = Files.newDirectoryStream(javaDir, "*.java")) {
            for (Path f : d) {
                String src = new String(Files.readAllBytes(f), StandardCharsets.UTF_8);
                Matcher m = Pattern.compile(
                    "    public AussomType (\\w+)\\(Environment.*?\\n    \\}\\n",
                    Pattern.DOTALL).matcher(src);
                while (m.find()) {
                    methods++;
                    if (!m.group(0).contains("Marshal.detached")) {
                        unguarded.add(f.getFileName() + ": " + m.group(1));
                    }
                }
            }
        }
        assertTrue(methods > 100, "should have read the shims, saw " + methods);
        assertTrue(unguarded.isEmpty(),
            "every untrusted shim method must need an attached object: " + unguarded);
    }

    /**
     * Everything the tier hands back is something the tier can use.
     *
     * A method returning a type untrusted has no module for answers null,
     * which is safe but useless. This is a quality check rather than a
     * security one, and it also catches a type quietly leaving the list.
     */
    @Test
    public void returnedShimTypesAreAvailableAtThisTier() throws IOException {
        Set<String> have = modules("untrusted");
        Pattern link = Pattern.compile("@r An? \\[(\\w+)\\]");
        List<String> dangling = new ArrayList<String>();
        for (String t : have) {
            Matcher m = link.matcher(read("untrusted", t));
            while (m.find()) {
                if (!have.contains(m.group(1))) {
                    dangling.add(t + " returns " + m.group(1) + ", which this tier lacks");
                }
            }
        }
        assertTrue(dangling.isEmpty(),
            "a method returning a type the tier does not have always answers null: "
            + dangling);
    }

    /**
     * Chat is readable both ways round.
     *
     * The Bukkit chat event is deprecated in favour of Paper's, and Paper's
     * carries its text as message() rather than getMessage(). A script has
     * to be able to read chat whichever event its server fires, or reacting
     * to chat breaks quietly on a Paper release with nothing to see.
     */
    @Test
    public void chatIsReadableThroughBothEvents() throws IOException {
        assertTrue(read("untrusted", "AsyncPlayerChatEvent").contains(
                "public extern getMessage("),
            "the Bukkit chat event must expose its text while it still fires.");
        assertTrue(read("untrusted", "AsyncChatEvent").contains(
                "public extern message("),
            "Paper's chat event carries its text as message(), and a script"
            + " must be able to read it.");
        for (String t : new String[] {"AsyncPlayerChatEvent", "AsyncChatEvent"}) {
            assertTrue(read("untrusted", t).contains("public extern getPlayer("),
                t + " must say who spoke.");
        }
    }
}
