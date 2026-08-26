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
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;

/**
 * Docs has to tell one overload from another.
 *
 * It used to key on a method's name and argument count, which lost every
 * member of a same-arity group but one. That is exactly the group the
 * overload naming has to name, so the key is the whole signature now.
 */
@EnabledIf("sourcesJarPresent")
public class DocsSignatureTest {

    /** The sources jar is a build input, not something a test can assume. */
    static boolean sourcesJarPresent() {
        return findSourcesJar() != null;
    }

    private static String findSourcesJar() {
        for (String p : System.getProperty("java.class.path").split(File.pathSeparator)) {
            if (p.contains("paper-api") && p.endsWith("-sources.jar")) {
                return p;
            }
        }
        String home = System.getProperty("user.home");
        File root = new File(home + "/.m2/repository/io/papermc/paper/paper-api");
        File[] versions = root.listFiles();
        if (versions == null) {
            return null;
        }
        for (File v : versions) {
            File[] jars = v.listFiles();
            if (jars == null) {
                continue;
            }
            for (File j : jars) {
                if (j.getName().endsWith("-sources.jar")) {
                    return j.getAbsolutePath();
                }
            }
        }
        return null;
    }

    /** Source types are written differently from compiled ones. */
    @Test
    public void sourceTypesReduceToCompiledNames() {
        assertEquals("List", Docs.normalize("java.util.List<String>"));
        assertEquals("Map", Docs.normalize("Map<String, List<Integer>>"));
        assertEquals("String[]", Docs.normalize("String..."));
        assertEquals("Material", Docs.normalize("org.bukkit.Material"));
        assertEquals("int", Docs.normalize("int"));
        assertEquals("String[]", Docs.normalize("java.lang.String[]"));
    }

    /**
     * The case the rework exists for. Bukkit.getWorld has a String form and
     * a UUID form, both taking one argument, and they must come back as
     * different declarations with different parameter names.
     */
    @Test
    public void sameArityOverloadsAreToldApart() throws Exception {
        Docs docs = new Docs(findSourcesJar());
        try {
            Docs.MethodDoc byName = docs.lookup("org.bukkit.Bukkit", "getWorld",
                new Class<?>[] { String.class });
            Docs.MethodDoc byId = docs.lookup("org.bukkit.Bukkit", "getWorld",
                new Class<?>[] { UUID.class });

            assertNotNull(byName, "the String form should be described");
            assertNotNull(byId, "the UUID form should be described");
            assertEquals(1, byName.params.size());
            assertEquals(1, byId.params.size());
            assertEquals("String", byName.paramTypes.get(0));
            assertEquals("UUID", byId.paramTypes.get(0));
            assertNotEquals(byName.params.get(0), byId.params.get(0),
                "the two forms should have different parameter names, which is"
                + " what makes a readable mangled name possible");
        } finally {
            docs.close();
        }
    }

    /** A method with one form still resolves, which is the common case. */
    @Test
    public void anOrdinaryMethodStillResolves() throws Exception {
        Docs docs = new Docs(findSourcesJar());
        try {
            Docs.MethodDoc doc = docs.lookup("org.bukkit.entity.Player", "kick",
                new Class<?>[] { net.kyori.adventure.text.Component.class });
            assertNotNull(doc, "Player.kick(Component) should be described");
            assertEquals(1, doc.params.size());
        } finally {
            docs.close();
        }
    }
}
