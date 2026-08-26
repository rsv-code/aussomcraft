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

package com.lehman.aussomcraft.aji;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.aussom.Engine;
import com.aussom.Environment;
import com.aussom.SecurityManagerImpl;

/**
 * The three allowlist entry forms. This is the code the port adds rather
 * than inherits. The case worth reading twice is
 * prefixAndAssignabilityAreNotInterchangeable, which is why both name forms
 * exist.
 */
public class AjiGateEntryFormTest {

    /** A policy with enforcement on and a caller-chosen allowlist. */
    private static class ListPolicy extends SecurityManagerImpl {
        ListPolicy(String... allowed) {
            super();
            this.props.put(AjiGate.ENFORCE, true);
            this.props.put(AjiGate.ALLOWED,
                new ArrayList<String>(Arrays.asList(allowed)));
        }
    }

    private Environment envWith(String... allowed) throws Exception {
        return new Environment(new Engine(new ListPolicy(allowed)));
    }

    private boolean permits(Environment env, Class<?> cls) {
        return AjiGate.checkClass(env, cls, "test") == null;
    }

    private boolean permits(Environment env, String name) {
        return AjiGate.checkClass(env, name, "test") == null;
    }

    @Test
    public void starAdmitsEverything() throws Exception {
        Environment env = envWith("*");
        assertTrue(permits(env, String.class));
        assertTrue(permits(env, ClassLoader.class));
        assertTrue(permits(env, "java.util.ArrayList"));
    }

    @Test
    public void emptyListDeniesEverything() throws Exception {
        Environment env = envWith();
        assertFalse(permits(env, String.class));
        assertFalse(permits(env, "java.lang.String"));
    }

    @Test
    public void packagePrefixAdmitsThatPackageAndBelow() throws Exception {
        Environment env = envWith("java.util.*");
        assertTrue(permits(env, java.util.ArrayList.class));
        assertTrue(permits(env, java.util.concurrent.ConcurrentHashMap.class));
        assertFalse(permits(env, String.class));
    }

    /**
     * A prefix must not admit a package that merely shares a text prefix.
     * Dropping the star but keeping the dot is what makes this hold.
     */
    @Test
    public void prefixDoesNotAdmitASiblingPackageWithASharedPrefix() throws Exception {
        Environment env = envWith("java.uti.*");
        assertFalse(permits(env, java.util.ArrayList.class),
            "'java.uti.*' must not admit java.util");
    }

    @Test
    public void anExactNameAdmitsSubtypesByAssignability() throws Exception {
        Environment env = envWith("java.util.List");
        assertTrue(permits(env, java.util.ArrayList.class),
            "listing an interface must admit an implementation");
        assertFalse(permits(env, java.util.HashMap.class));
    }

    @Test
    public void listingASubtypeNeverAdmitsItsParent() throws Exception {
        Environment env = envWith("java.util.ArrayList");
        assertFalse(permits(env, java.util.List.class));
        assertFalse(permits(env, Object.class));
    }

    /**
     * Why both forms are needed. An implementation often lives in a different
     * package from its interface, so a prefix over the interface's package does
     * not reach it while assignability does. On a server that is Player and
     * CraftPlayer.
     */
    @Test
    public void prefixAndAssignabilityAreNotInterchangeable() throws Exception {
        // The interface and its implementation in different packages.
        Class<?> iface = java.util.RandomAccess.class;        // java.util
        Class<?> impl = javax.print.attribute.standard.JobName.class; // javax.print...

        assertTrue(permits(envWith("java.util.RandomAccess"), java.util.ArrayList.class),
            "assignability reaches an implementation wherever it lives");
        assertFalse(permits(envWith("java.util.*"), impl),
            "a prefix over one package cannot reach a type in another");
        assertTrue(permits(envWith("java.util.*"), iface));
    }

    /** An unresolvable exact name denies rather than passing through. */
    @Test
    public void anUnresolvableNameIsRefused() throws Exception {
        Environment env = envWith("com.example.NotHere");
        assertFalse(permits(env, "com.example.NotHere"));
        assertFalse(permits(env, String.class));
    }

    /**
     * The host needs to be able to tell an operator that an entry will
     * never match, because a silently dropped entry denies without saying
     * so and is very hard to debug.
     */
    @Test
    public void unresolvableEntriesAreReportable() {
        List<String> missing = AjiGate.unresolvable(
            new ListPolicy("java.util.List", "com.example.NotHere", "java.util.*", "*"));
        assertEquals(List.of("com.example.NotHere"), missing,
            "only the unresolvable exact name should be reported");
    }

    @Test
    public void enforcementOffPermitsAnything() throws Exception {
        Engine eng = new Engine(new SecurityManagerImpl());
        Environment env = new Environment(eng);
        assertTrue(permits(env, ClassLoader.class),
            "with enforcement off the list is not consulted at all");
    }

    /** A denial names the class and says what would fix it. */
    @Test
    public void aDenialSaysWhatWasRefusedAndHow() throws Exception {
        Environment env = envWith("java.util.List");
        SandboxDenied d = assertThrows(SandboxDenied.class,
            () -> AjiGate.requireClass(env, ClassLoader.class, "aji.invoke()"));
        assertTrue(d.getMessage().contains("java.lang.ClassLoader"));
        assertTrue(d.getMessage().contains(AjiGate.ALLOWED));
        assertEquals("java.lang.ClassLoader", d.getSubject());
    }

    /** The loader is settable and swapping it clears the resolution cache. */
    @Test
    public void theClassLoaderIsSettable() {
        ClassLoader original = AjiGate.getClassLoader();
        try {
            ClassLoader other = new ClassLoader(original) { };
            AjiGate.setClassLoader(other);
            assertEquals(other, AjiGate.getClassLoader());
            AjiGate.setClassLoader(null);
            assertEquals(AjiGate.class.getClassLoader(), AjiGate.getClassLoader());
        } finally {
            AjiGate.setClassLoader(original);
        }
    }
}
