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
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import com.lehman.aussomcraft.paper.PaperModules;
import com.lehman.aussomcraft.profile.Profile;

/**
 * A tier's types are exactly what its manifest says, and nothing else.
 *
 * TYPES.txt is what the runtime authorises against, so every answer about
 * what a tier holds has to come from it. PaperModules.names once listed the
 * tier's directory instead, which reported whatever was filed there rather
 * than what was granted: moving aji.aus into the dangerous directory made
 * 'aji' appear as a Paper type at that tier.
 *
 * Not exploitable at the time, because Marshal and HostEvents both check
 * the manifest before consulting names. This is the test that keeps the two
 * from drifting apart again.
 *
 * @author Austin Lehman
 */
public class ManifestIsTheListTest {

    /** The Aussom names the manifest carries, read straight off the file. */
    private List<String> manifestNames(String Tier) throws IOException {
        List<String> out = new ArrayList<String>();
        String path = "/com/lehman/aussomcraft/aus/paper/" + Tier + "/TYPES.txt";
        try (InputStream in = ManifestIsTheListTest.class.getResourceAsStream(path)) {
            assertTrue(in != null, "missing manifest for " + Tier);
            for (String line : new String(in.readAllBytes(),
                    StandardCharsets.UTF_8).split("\n")) {
                String t = line.trim();
                if (t.isEmpty() || t.startsWith("#")) {
                    continue;
                }
                int tab = t.indexOf('\t');
                assertTrue(tab > 0, Tier + " manifest line has no Aussom name: " + t);
                out.add(t.substring(tab + 1).trim());
            }
        }
        return out;
    }

    /**
     * names() reports the manifest and only the manifest.
     *
     * Asserted both ways. A missing name would mean a granted type nothing
     * can reach; an extra one would mean the runtime reporting a type the
     * manifest never granted.
     */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void namesAreExactlyTheManifest(Profile p) throws Exception {
        Set<String> fromFile = new HashSet<String>(manifestNames(p.getId()));
        Set<String> fromCode = new HashSet<String>(PaperModules.names(p.getId()));

        Set<String> extra = new HashSet<String>(fromCode);
        extra.removeAll(fromFile);
        assertTrue(extra.isEmpty(), p.getId() + " reports types its manifest does"
            + " not grant, so something other than TYPES.txt is deciding what"
            + " the tier holds: " + extra);

        Set<String> missing = new HashSet<String>(fromFile);
        missing.removeAll(fromCode);
        assertTrue(missing.isEmpty(), p.getId() + " grants types it does not"
            + " report: " + missing);

        assertEquals(fromFile.size(), fromCode.size(),
            p.getId() + " must report one name per manifest entry");
    }

    /**
     * Every name is unique, so no two Paper types share an Aussom class.
     *
     * Two types under one name means one module overwrites the other, and an
     * object of the losing type gets the winner's shim.
     */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void everyNameIsUnique(Profile p) throws Exception {
        List<String> all = manifestNames(p.getId());
        Set<String> seen = new HashSet<String>();
        List<String> dupes = new ArrayList<String>();
        for (String n : all) {
            if (!seen.add(n)) {
                dupes.add(n);
            }
        }
        assertTrue(dupes.isEmpty(), p.getId() + " has names used twice: " + dupes);
    }
}
