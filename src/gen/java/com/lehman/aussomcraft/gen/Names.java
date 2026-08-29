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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * The Aussom class name for a Paper type.
 *
 * Aussom has no packages, so a Paper type's simple name is its whole
 * identity on the script side. Paper reuses simple names across packages,
 * which is ordinary Java, so the flat namespace collides: a block's Ageable
 * and an entity's Ageable are unrelated interfaces sharing one word.
 *
 * One type per colliding name keeps the bare name and the others are
 * prefixed with their own package's last segment, so every Paper type gets
 * a name of its own and nothing is dropped.
 *
 * Which one keeps the bare name is decided by PRIORITY rather than by
 * sorting. Sorting is what the generator used to do, and because "material"
 * sorts after "block" it handed the bare name to the deprecated pre-1.13
 * API: 'Bed' meant org.bukkit.material.Bed, and org.bukkit.command.Command
 * lost 'Command' to a command block.
 *
 * @author Austin Lehman
 */
public final class Names {

    /**
     * Packages that keep the bare name, best first.
     *
     * Read as "what would a script author mean by this word". An entity
     * Ageable is a mob that grows up, which is what a script is asking
     * about far more often than a crop's block data. Block data and the
     * Paper mirrors of Bukkit types sit at the bottom because a script
     * reaching for 'BellRingEvent' means Bukkit's.
     */
    private static final String[] PRIORITY = {
        "org.bukkit.entity",
        "org.bukkit.block",
        "org.bukkit.inventory",
        "org.bukkit.command",
        "org.bukkit",
    };

    /** Packages that lose to everything above, worst last. */
    private static final String[] LOW = {
        "org.bukkit.block.data",
        "io.papermc.paper",
        "com.destroystokyo.paper",
    };

    private Names() { }

    /**
     * Assigns one Aussom name to every Paper type.
     *
     * @param BinaryNames is every fully qualified type being generated.
     * @return A Map from binary name to Aussom class name, one entry per
     *         input, with no two inputs sharing a name.
     */
    public static Map<String, String> resolve(Collection<String> BinaryNames) {
        Map<String, List<String>> bySimple = new TreeMap<String, List<String>>();
        for (String n : BinaryNames) {
            String simple = simpleOf(n);
            List<String> g = bySimple.get(simple);
            if (g == null) {
                g = new ArrayList<String>();
                bySimple.put(simple, g);
            }
            g.add(n);
        }

        Map<String, String> out = new TreeMap<String, String>();
        for (Map.Entry<String, List<String>> e : bySimple.entrySet()) {
            List<String> group = e.getValue();
            if (group.size() == 1) {
                out.put(group.get(0), e.getKey());
                continue;
            }
            String winner = bestOf(group);
            out.put(winner, e.getKey());
            List<String> losers = new ArrayList<String>(group);
            losers.remove(winner);
            // Sorted so the shortest available name goes to the same type
            // every run, whatever order reflection produced the group in.
            java.util.Collections.sort(losers);
            for (String n : losers) {
                out.put(n, uniqueFor(n, e.getKey(), out.values()));
            }
        }
        return out;
    }

    /** The type in a colliding group that keeps the bare name. */
    private static String bestOf(List<String> Group) {
        String best = null;
        int bestRank = Integer.MAX_VALUE;
        for (String n : Group) {
            int r = rank(n);
            // Ties break on the binary name so the answer never depends on
            // the order reflection returned the types in.
            if (r < bestRank || (r == bestRank && n.compareTo(best) < 0)) {
                best = n;
                bestRank = r;
            }
        }
        return best;
    }

    /**
     * Where a type's package sits in the priority order. Lower wins.
     *
     * @param BinaryName is the fully qualified type.
     * @return An int rank, larger meaning less likely to be what a script
     *         author meant.
     */
    static int rank(String BinaryName) {
        String pkg = packageOf(BinaryName);
        for (int i = 0; i < LOW.length; i++) {
            if (pkg.equals(LOW[i]) || pkg.startsWith(LOW[i] + ".")) {
                return PRIORITY.length + 1 + i;
            }
        }
        for (int i = 0; i < PRIORITY.length; i++) {
            if (pkg.equals(PRIORITY[i])) {
                return i;
            }
        }
        // An org.bukkit package nobody named, above the low ones.
        return PRIORITY.length;
    }

    private static String packageOf(String BinaryName) {
        int dot = BinaryName.lastIndexOf('.');
        if (dot < 0) {
            return "";
        }
        return BinaryName.substring(0, dot);
    }

    private static String simpleOf(String BinaryName) {
        int dot = BinaryName.lastIndexOf('.');
        if (dot < 0) {
            return BinaryName;
        }
        return BinaryName.substring(dot + 1);
    }

    /**
     * A name for a losing type: its package's last segment before the
     * simple name, taking more segments when one is not enough.
     *
     * One segment settles almost every case. It does not settle
     * org.bukkit.structure.Structure against
     * org.bukkit.generator.structure.Structure, where the segment is
     * 'structure' both times, so the second falls back to two.
     *
     * No attempt is made to avoid a stutter such as
     * EntityEntityKnockbackEvent. The rule stays short and deterministic,
     * which matters more than how it reads for the handful of Paper types
     * that reuse a name.
     *
     * @param BinaryName is the type being named.
     * @param Simple is its simple name.
     * @param Taken is every name already assigned.
     * @return A name no other type has.
     */
    private static String uniqueFor(String BinaryName, String Simple,
            Collection<String> Taken) {
        String[] parts = packageOf(BinaryName).split("\\.");
        StringBuilder prefix = new StringBuilder();
        for (int take = 1; take <= parts.length; take++) {
            prefix.setLength(0);
            for (int i = parts.length - take; i < parts.length; i++) {
                prefix.append(capitalise(parts[i]));
            }
            String candidate = prefix + Simple;
            if (!Taken.contains(candidate)) {
                return candidate;
            }
        }
        // Every package segment used and still taken. Cannot happen for two
        // distinct binary names, but a name is still owed rather than a
        // duplicate that would overwrite a module.
        return BinaryName.replace('.', '_');
    }

    private static String capitalise(String Segment) {
        if (Segment.isEmpty()) {
            return "";
        }
        return Character.toUpperCase(Segment.charAt(0)) + Segment.substring(1);
    }
}
