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

package com.lehman.aussomcraft.profile;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import com.aussom.SecurityManagerInt;

import com.lehman.aussomcraft.aji.AjiGate;

/**
 * Asserts each profile's policy property by property. Cheapest tests here,
 * and they cover what a refactor is most likely to break quietly, since
 * nothing fails loudly when a gate opens.
 */
public class ProfilePolicyTest {

    /** The loader a plain JUnit run has, which sees everything. */
    private static final ClassLoader LOADER = ProfilePolicyTest.class.getClassLoader();

    /** Every AJI flag, so a new one cannot be added and left unasserted. */
    private static final String[] AJI_FLAGS = {
        "aussom.aji.invoke",
        "aussom.aji.getmember",
        "aussom.aji.setmember",
        "aussom.aji.object.create",
        "aussom.aji.static.invoke",
        "aussom.aji.static.getmember",
        "aussom.aji.static.setmember",
    };

    /**
     * The rule the whole design leans on: no profile may let a script rewrite
     * its own policy. Parameterized so a profile added later is covered without
     * anyone remembering to.
     */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void noProfileLetsAScriptSetProperties(Profile p) {
        SecurityManagerInt sm = p.newPolicy(LOADER);
        assertFalse(sm.getPropertyBoolean("securitymanager.property.set", false),
            p.getId() + " must not permit securitymanager.property.set");
    }

    /**
     * Enforcement is never switched off, in either profile or on either
     * list. What differs is the list contents.
     */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void enforcementIsNeverOff(Profile p) {
        SecurityManagerInt sm = p.newPolicy(LOADER);
        assertTrue(sm.getPropertyBoolean(AjiGate.ENFORCE, false),
            p.getId() + " must enforce the AJI allowlist");
        assertTrue(sm.getPropertyBoolean(ScriptPolicy.EXTERN_ENFORCE, false),
            p.getId() + " must enforce the extern allowlist");
    }

    /** Only the dangerous tier has AJI. Untrusted and trusted must not. */
    @ParameterizedTest
    @EnumSource(value = Profile.class, names = { "UNTRUSTED", "TRUSTED" })
    public void onlyDangerousHasAji(Profile p) {
        SecurityManagerInt sm = p.newPolicy(LOADER);
        for (String flag : AJI_FLAGS) {
            assertFalse(sm.getPropertyBoolean(flag, true), flag + " must be false at " + p.getId());
        }
        assertTrue(sm.getPropertyList(AjiGate.ALLOWED).isEmpty(),
            "the AJI list must be empty below dangerous, so a regressed flag still denies");
    }

    @Test
    public void dangerousHasAllAjiFlagsAndAWildcardList() {
        SecurityManagerInt sm = Profile.DANGEROUS.newPolicy(LOADER);
        for (String flag : AJI_FLAGS) {
            assertTrue(sm.getPropertyBoolean(flag, false), flag + " must be true at the dangerous tier");
        }
        assertEquals(List.of("*"), sm.getPropertyList(AjiGate.ALLOWED));
    }

    /**
     * The extern list stays narrow in both profiles. The single entry that
     * differs is this plugin's AJI package, which is what lets aji.aus
     * parse.
     */
    @Test
    public void eachTierMayNameOnlyItsOwnShimPackage() {
        List<String> untrusted =
            ((ScriptPolicy) Profile.UNTRUSTED.newPolicy(LOADER)).getExternAllowed();
        List<String> trusted =
            ((ScriptPolicy) Profile.TRUSTED.newPolicy(LOADER)).getExternAllowed();
        List<String> dangerous =
            ((ScriptPolicy) Profile.DANGEROUS.newPolicy(LOADER)).getExternAllowed();

        assertEquals(
            List.of("com.aussom.stdlib.*", "com.aussom.types.*",
                "com.lehman.aussomcraft.host.*",
                "com.lehman.aussomcraft.paper.gen.untrusted.*"),
            untrusted);

        // Each tier's shims are separate classes holding only that tier's
        // methods, so the package name is the boundary. A tier that could
        // name another tier's package could bind its whole API.
        assertTrue(trusted.contains("com.lehman.aussomcraft.paper.gen.trusted.*"));
        assertFalse(trusted.contains("com.lehman.aussomcraft.paper.gen.untrusted.*"));
        assertFalse(trusted.contains("com.lehman.aussomcraft.paper.gen.dangerous.*"));

        assertTrue(dangerous.contains("com.lehman.aussomcraft.paper.gen.dangerous.*"));
        assertFalse(dangerous.contains("com.lehman.aussomcraft.paper.gen.trusted.*"));

        assertFalse(untrusted.contains("com.lehman.aussomcraft.paper.gen.trusted.*"));
        assertFalse(untrusted.contains("com.lehman.aussomcraft.paper.gen.dangerous.*"));

        // The runtime package itself is on no tier's list, so Marshal and
        // PaperObj cannot be named by any script at all.
        for (List<String> list : List.of(untrusted, trusted, dangerous)) {
            assertFalse(list.contains("com.lehman.aussomcraft.paper.*"));
            assertFalse(list.contains("*"));
        }

        // AJI stays where it was: dangerous only.
        assertTrue(dangerous.contains("com.lehman.aussomcraft.aji.*"));
        assertFalse(untrusted.contains("com.lehman.aussomcraft.aji.*"));
        assertFalse(trusted.contains("com.lehman.aussomcraft.aji.*"));
    }

    /** Symlinked includes are refused in both profiles. */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void includesMayNotTraverseSymlinks(Profile p) {
        SecurityManagerInt sm = p.newPolicy(LOADER);
        assertFalse(sm.getPropertyBoolean(ScriptPolicy.SYMLINK_FOLLOW, true),
            p.getId() + " must not follow symlinked includes");
    }

    /**
     * The loader reaches the policy, which is what the engine resolves extern
     * classes through. Getting this wrong is not a test failure anywhere else
     * in this suite: it only shows up on a real Paper server, where the system
     * loader cannot see com.aussom.* at all.
     */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void theEngineClassLoaderIsWhatTheHostSupplied(Profile p) {
        ClassLoader mine = new ClassLoader(LOADER) { };
        assertEquals(mine, p.newPolicy(mine).getEngineClassLoader(),
            p.getId() + " must resolve extern classes through the host's loader");
    }

    /** Each engine must get its own policy object. */
    @Test
    public void everyCallBuildsAFreshPolicy() {
        assertTrue(Profile.UNTRUSTED.newPolicy(LOADER) != Profile.UNTRUSTED.newPolicy(LOADER));
    }
}
