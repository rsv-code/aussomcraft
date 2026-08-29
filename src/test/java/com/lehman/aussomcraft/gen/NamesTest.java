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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

/**
 * Every Paper type gets an Aussom name, and no two share one.
 *
 * Run against the real type list the generator last wrote, so this is the
 * actual Paper surface rather than a sample. It is the check that has to
 * hold before the generator is run, because a duplicate name means one
 * type's module silently overwrites another's, which is the bug this
 * scheme exists to end.
 *
 * @author Austin Lehman
 */
public class NamesTest {

    /** The dangerous tier holds every type, so it is the superset. */
    private static final Path TYPES = Paths.get("src", "main", "resources",
        "com", "lehman", "aussomcraft", "aus", "paper", "dangerous", "TYPES.txt");

    private List<String> everyType() throws IOException {
        List<String> out = new ArrayList<String>();
        for (String line : new String(Files.readAllBytes(TYPES),
                StandardCharsets.UTF_8).split("\n")) {
            String t = line.trim();
            // org.bukkit.material is excluded from generation now, so the
            // manifest on disk still lists types this scheme will not see.
            if (t.isEmpty() || t.startsWith("#")) {
                continue;
            }
            // Each line is 'binary name<TAB>Aussom name'. Only the first
            // column is input to naming.
            int tab = t.indexOf('\t');
            if (tab > 0) {
                t = t.substring(0, tab).trim();
            }
            if (!t.startsWith("org.bukkit.material.")) {
                out.add(t);
            }
        }
        return out;
    }

    /** One name per type, and no name used twice. */
    @Test
    public void everyTypeGetsAUniqueName() throws Exception {
        List<String> types = everyType();
        assertTrue(types.size() > 1000, "expected the real type list, got " + types.size());

        Map<String, String> names = Names.resolve(types);
        assertEquals(types.size(), names.size(), "one name per type");

        Map<String, List<String>> byName = new HashMap<String, List<String>>();
        for (Map.Entry<String, String> e : names.entrySet()) {
            byName.computeIfAbsent(e.getValue(), k -> new ArrayList<String>()).add(e.getKey());
        }
        List<String> clashes = new ArrayList<String>();
        for (Map.Entry<String, List<String>> e : byName.entrySet()) {
            if (e.getValue().size() > 1) {
                clashes.add(e.getKey() + " <- " + e.getValue());
            }
        }
        assertTrue(clashes.isEmpty(), "names must be unique, but: " + clashes);
    }

    /** A type with no collision keeps its plain simple name. */
    @Test
    public void anUncontestedTypeKeepsItsSimpleName() throws Exception {
        Map<String, String> names = Names.resolve(everyType());
        assertEquals("Player", names.get("org.bukkit.entity.Player"));
        assertEquals("World", names.get("org.bukkit.World"));
        assertEquals("PlayerJoinEvent", names.get("org.bukkit.event.player.PlayerJoinEvent"));
    }

    /**
     * The bare name goes to the type a script author would mean, not to
     * whichever sorted last.
     */
    @Test
    public void priorityDecidesWhoKeepsTheBareName() throws Exception {
        Map<String, String> names = Names.resolve(everyType());

        // A mob that grows up beats a crop's block data.
        assertEquals("Ageable", names.get("org.bukkit.entity.Ageable"));
        assertEquals("DataAgeable", names.get("org.bukkit.block.data.Ageable"));

        // The block you can open beats its facing and open state.
        assertEquals("Barrel", names.get("org.bukkit.block.Barrel"));
        assertEquals("TypeBarrel", names.get("org.bukkit.block.data.type.Barrel"));

        // Bukkit's own type beats Paper's mirror of it.
        assertEquals("EntityKnockbackEvent",
            names.get("org.bukkit.event.entity.EntityKnockbackEvent"));
    }

    /** The result does not depend on the order the types arrive in. */
    @Test
    public void theAnswerDoesNotDependOnInputOrder() throws Exception {
        List<String> types = everyType();
        Map<String, String> first = Names.resolve(types);
        List<String> shuffled = new ArrayList<String>(types);
        java.util.Collections.reverse(shuffled);
        assertEquals(first, Names.resolve(shuffled),
            "a reversed input must give the same names");
    }

    /** Nothing is dropped: every input appears exactly once in the output. */
    @Test
    public void noTypeIsLost() throws Exception {
        List<String> types = everyType();
        Set<String> got = new HashSet<String>(Names.resolve(types).keySet());
        assertEquals(new HashSet<String>(types), got, "every type must be named");
    }
}
