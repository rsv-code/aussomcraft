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

package com.lehman.aussomcraft.script;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * A tier may include its own generated Paper modules and no other tier's.
 *
 * Runs against the packaged jar rather than target/classes, because a
 * resource include path only resolves when the resources and aussom-base
 * are in the same archive. See IncludeProbeMain for why. Bound to the
 * integration-test phase, so 'mvn verify' runs it and 'mvn test' does not.
 *
 * Every case asserts a positive and a negative together. A tier that could
 * reach nothing at all would pass a negative-only test while proving
 * nothing, which is the failure mode design/lessons-learned.md records
 * under "A passing security test is not automatically evidence".
 *
 * @author Austin Lehman
 */
public class TierIncludeIT {

    /** Results of the one probe run, keyed 'tier:Type'. */
    private static Map<String, String> results = null;

    /**
     * Types that exist at one tier and not below it. Player is in every
     * tier, Chunk starts at trusted, Bukkit is dangerous only.
     */
    private static final String[] CASES = {
        "untrusted:Player", "untrusted:Chunk", "untrusted:Bukkit",
        "trusted:Player",   "trusted:Chunk",   "trusted:Bukkit",
        "dangerous:Player", "dangerous:Chunk", "dangerous:Bukkit",
        "trusted:DefaultPermissions", "dangerous:DefaultPermissions",
        // Types that share a simple name in Paper and were renamed by
        // gen.Names, so both halves of a collision are reachable.
        "untrusted:TypeBarrel", "trusted:Barrel", "trusted:TypeBarrel",
        "trusted:DataAgeable", "trusted:StructureStructure",
    };

    /**
     * Runs the probe once, in a JVM whose whole class path is the packaged
     * jar plus the test classes that hold the probe.
     *
     * @throws Exception when the jar is missing or the probe cannot run.
     */
    @BeforeAll
    public static void runProbe() throws Exception {
        Path jar = packagedJar();
        Path testClasses = Paths.get("target", "test-classes");

        List<String> cmd = new ArrayList<String>();
        cmd.add(Paths.get(System.getProperty("java.home"), "bin", "java").toString());
        cmd.add("-cp");
        cmd.add(jar.toString() + File.pathSeparator + testClasses.toString());
        cmd.add(IncludeProbeMain.class.getName());
        for (String c : CASES) {
            cmd.add(c);
        }

        Path out = Files.createTempFile("tier-include-probe", ".txt");
        Process p = new ProcessBuilder(cmd)
            .redirectErrorStream(true)
            .redirectOutput(out.toFile())
            .start();
        int code = p.waitFor();
        String text = new String(Files.readAllBytes(out), StandardCharsets.UTF_8);
        Files.deleteIfExists(out);

        assertEquals(0, code, "the include probe did not run cleanly:\n" + text);

        results = new HashMap<String, String>();
        for (String line : text.split("\n")) {
            String[] parts = line.trim().split("\\|");
            if (parts.length == 3) {
                results.put(parts[0] + ":" + parts[1], parts[2]);
            }
        }
        assertEquals(CASES.length, results.size(),
            "expected one result per case, got:\n" + text);
    }

    /** @return the packaged jar, failing with a usable message when absent. */
    private static Path packagedJar() throws Exception {
        Path target = Paths.get("target");
        try (var files = Files.list(target)) {
            for (Path f : files.toList()) {
                String n = f.getFileName().toString();
                if (n.startsWith("AussomCraft-") && n.endsWith(".jar")
                        && !n.startsWith("original-")) {
                    return f;
                }
            }
        }
        fail("No packaged jar in target/. This test needs 'mvn verify',"
            + " not 'mvn test', because a resource include path only"
            + " resolves inside the packaged jar.");
        return null;
    }

    /**
     * Asserts one case, naming the tier and type so a failure says which
     * boundary moved.
     *
     * @param Tier is the tier id.
     * @param Type is the generated type.
     * @param Want is RESOLVED or REFUSED.
     */
    private void expect(String Tier, String Type, String Want) {
        String got = results.get(Tier + ":" + Type);
        assertEquals(Want, got, Tier + " including " + Type);
    }

    /** Untrusted reaches its own modules and neither tier above it. */
    @Test
    public void untrustedReachesOnlyItsOwnTier() {
        expect("untrusted", "Player", "RESOLVED");
        expect("untrusted", "Chunk", "REFUSED");
        expect("untrusted", "Bukkit", "REFUSED");
    }

    /** Trusted reaches its own modules and not the dangerous ones. */
    @Test
    public void trustedReachesOnlyItsOwnTier() {
        expect("trusted", "Player", "RESOLVED");
        expect("trusted", "Chunk", "RESOLVED");
        expect("trusted", "Bukkit", "REFUSED");
    }

    /** Dangerous reaches everything its own tier ships. */
    @Test
    public void dangerousReachesItsOwnTier() {
        expect("dangerous", "Player", "RESOLVED");
        expect("dangerous", "Chunk", "RESOLVED");
        expect("dangerous", "Bukkit", "RESOLVED");
    }

    /**
     * A type renamed to avoid a simple-name collision is reachable under
     * the name it was given.
     *
     * Paper has three types called Structure and two called Barrel. Before
     * gen.Names one of each pair overwrote the other and its API was
     * unreachable. Each now has a module of its own, so an include of the
     * prefixed name has to resolve, and the tier boundary has to hold for
     * it the same as for any other type.
     */
    @Test
    public void renamedCollisionTypesAreReachable() {
        expect("trusted", "Barrel", "RESOLVED");
        expect("trusted", "TypeBarrel", "RESOLVED");
        expect("trusted", "DataAgeable", "RESOLVED");
        expect("trusted", "StructureStructure", "RESOLVED");
        expect("untrusted", "TypeBarrel", "REFUSED");
    }

    /**
     * Permission registration is a dangerous tier type and stays there.
     *
     * TierEscalationIT checks that a trusted script naming it does not
     * load. This is the other half: it is genuinely absent at trusted and
     * genuinely present at dangerous, so that test is refusing something
     * real rather than passing on a typo.
     */
    @Test
    public void defaultPermissionsIsDangerousOnly() {
        expect("trusted", "DefaultPermissions", "REFUSED");
        expect("dangerous", "DefaultPermissions", "RESOLVED");
    }

    /**
     * At least one include resolved somewhere.
     *
     * The guard against the whole file passing for the wrong reason. If the
     * resource path stops resolving, every case becomes REFUSED and the
     * three tests above still pass on their negatives alone.
     */
    @Test
    public void someIncludeActuallyResolved() {
        boolean any = results.values().contains("RESOLVED");
        assertTrue(any, "no include resolved at any tier, so the negatives"
            + " above prove nothing. The resource include path is not"
            + " working against the packaged jar. Results: " + results);
    }
}
