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

package com.lehman.aussomcraft.paper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.aussom.Engine;

/**
 * The generated Paper modules, read from the jar and registered per engine.
 *
 * A tier is a directory of modules inside the jar, and the engine reaches
 * it through the resource include path IncludePaths names for that tier.
 * Nothing is registered up front: a module is read the first time something
 * asks for it, so the cost scales with what a script touches rather than
 * with the size of the API.
 *
 * The tier prefix lives in the include path, not in the script. A script
 * writes 'include Chunk;' and gets its own tier's Chunk, which is why the
 * same file runs unchanged at any tier. It also means a script has no way
 * to name another tier: the other directories are not below its root, and
 * an include cannot climb out of one.
 *
 * The exception is CORE below, included for every script whether it asks or
 * not, the same way lang.aus and craft.aus are.
 *
 * @author Austin Lehman
 */
public final class PaperModules {

    /** Where the generated modules live inside the jar. */
    private static final String ROOT = "com/lehman/aussomcraft/aus/paper/";

    /**
     * Types included for every script, so ordinary handlers need no include
     * line. Everything else is available with an explicit include.
     */
    private static final String[] CORE = {
        "Player", "Entity", "World", "Block", "Location", "ItemStack",
        "Inventory", "Vector",
    };

    /**
     * The exact Paper class names each tier holds, read from the manifest
     * the generator writes beside the modules.
     */
    private static final Map<String, Set<String>> EXACT =
        new ConcurrentHashMap<String, Set<String>>();

    /**
     * Whether a tier was generated from exactly this Paper class.
     *
     * Asked by binary name, never by simple name. Modules are named after a
     * type's simple name, so matching on that accepted any class sharing one:
     * another plugin's event called AsyncPlayerChatEvent passed the check for
     * Bukkit's, and if it subclassed Bukkit's then the shim's cast succeeded
     * and the whole module worked against it.
     *
     * A missing manifest grants nothing, which is the safe direction.
     *
     * @param Tier is the tier id.
     * @param ClassName is the fully qualified Paper class name.
     * @return A boolean with true when this tier was built from that class.
     */
    public static boolean grantsClass(String Tier, String ClassName) {
        if (Tier == null || ClassName == null) {
            return false;
        }
        Set<String> known = EXACT.get(Tier);
        if (known == null) {
            known = readManifest(Tier);
            EXACT.put(Tier, known);
        }
        return known.contains(ClassName);
    }

    /**
     * The Aussom class each Paper type is reachable as, by tier. Read from
     * the same manifest as EXACT, so a type is granted and named together
     * or not at all.
     */
    private static final Map<String, Map<String, String>> AS_NAMED =
        new ConcurrentHashMap<String, Map<String, String>>();

    /**
     * The Aussom class names a tier provides.
     *
     * Taken from the tier's manifest, which is the same list grantsClass and
     * ausNameOf answer from, so nothing can report a type the manifest does
     * not carry. This used to scan the tier's directory, which reported
     * whatever happened to be filed there: moving aji.aus into the dangerous
     * directory made 'aji' appear as a Paper type at that tier.
     *
     * @param Tier is the tier id.
     * @return An unmodifiable List of Aussom class names.
     */
    public static List<String> names(String Tier) {
        Map<String, String> named = AS_NAMED.get(Tier);
        if (named == null) {
            readManifest(Tier);
            named = AS_NAMED.get(Tier);
        }
        if (named == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList<String>(named.values()));
    }

    /**
     * The Aussom class name a Paper type is reachable as at a tier.
     *
     * Asked by binary name, so two Paper types sharing a simple name are
     * told apart. A type this tier does not have returns null, which is the
     * answer that stops it being marshalled.
     *
     * @param Tier is the tier id.
     * @param ClassName is the fully qualified Paper class name.
     * @return A String with the Aussom class name, or null.
     */
    public static String ausNameOf(String Tier, String ClassName) {
        if (Tier == null || ClassName == null) {
            return null;
        }
        Map<String, String> named = AS_NAMED.get(Tier);
        if (named == null) {
            readManifest(Tier);
            named = AS_NAMED.get(Tier);
        }
        if (named == null) {
            return null;
        }
        return named.get(ClassName);
    }

    /**
     * Reads one tier's manifest. Unreadable yields empty, which grants
     * nothing.
     *
     * Each line is a Paper class, a tab, and the Aussom class it is
     * reachable as. A line with no tab is read as a type named after its
     * own simple name, so an older manifest still loads.
     */
    private static Set<String> readManifest(String Tier) {
        Set<String> out = new HashSet<String>();
        Map<String, String> named = new HashMap<String, String>();
        String path = "/" + ROOT + Tier + "/TYPES.txt";
        try (InputStream in = PaperModules.class.getResourceAsStream(path)) {
            if (in == null) {
                AS_NAMED.put(Tier, named);
                return out;
            }
            for (String line : new String(in.readAllBytes(),
                    StandardCharsets.UTF_8).split("\n")) {
                String t = line.trim();
                if (t.isEmpty() || t.startsWith("#")) {
                    continue;
                }
                int tab = t.indexOf('\t');
                String binary = t;
                String as = null;
                if (tab > 0) {
                    binary = t.substring(0, tab).trim();
                    as = t.substring(tab + 1).trim();
                }
                if (as == null || as.isEmpty()) {
                    as = binary.substring(binary.lastIndexOf('.') + 1);
                }
                out.add(binary);
                named.put(binary, as);
            }
        } catch (IOException e) {
            AS_NAMED.put(Tier, new HashMap<String, String>());
            return new HashSet<String>();
        }
        AS_NAMED.put(Tier, named);
        return out;
    }


    private PaperModules() { }

    /**
     * The types every script gets without asking.
     *
     * Exposed so a test can seed exactly these on an engine it builds by
     * hand. A resource include path does not resolve from target/classes,
     * for the reason docs/guide/aussomcraft-testing.md records, so a test
     * that needs the core types available has to register them itself.
     *
     * @return A String array of simple type names.
     */
    public static String[] coreTypes() {
        return CORE.clone();
    }


    /**
     * Includes the core types every script gets without asking.
     *
     * Nothing else is touched. The rest of the tier is reached on demand
     * through the resource include path, so the engine must already have
     * that path set. ScriptLoader adds it before calling this.
     *
     * @param Eng is the engine to include on.
     * @param Tier is the tier id, for example "trusted".
     * @return An int with how many core modules were included.
     * @throws Exception when a core module cannot be included, which means
     *         the tier's include path is missing or wrong.
     */
    public static int install(Engine Eng, String Tier) throws Exception {
        int n = 0;
        for (String type : CORE) {
            if (define(Eng, Tier, type)) {
                n++;
            }
        }
        return n;
    }

    /**
     * Defines one module on an engine.
     *
     * Resolved by the engine through the tier's resource include path, so
     * the tier prefix stays out of the name and the interpreter's own
     * lookup does the work. Nothing is read here: a module reaching an
     * engine any other way would be one the engine never checked.
     *
     * @param Eng is the engine.
     * @param Tier is the tier id.
     * @param Type is the simple type name.
     * @return A boolean with true when the class is now defined.
     */
    private static boolean define(Engine Eng, String Tier, String Type) {
        try {
            Eng.addInclude(Type + ".aus");
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * Includes one type's module, if this tier has it and it is not already
     * in. Registering a module only makes it available; a class is not
     * defined until something includes it.
     *
     * @param Eng is the engine.
     * @param Tier is the tier id.
     * @param Type is the simple type name, for example "PlayerJoinEvent".
     * @return A boolean with true when the class is now defined.
     */
    public static boolean includeType(Engine Eng, String Tier, String Type) {
        if (Type == null) {
            return false;
        }
        if (Eng.containsClass(Type)) {
            return true;
        }
        if (!names(Tier).contains(Type)) {
            return false;
        }
        if (!define(Eng, Tier, Type)) {
            return false;
        }
        return Eng.containsClass(Type);
    }

    /** The tier ids, lowest first. */
    private static final String[] TIERS = { "untrusted", "trusted", "dangerous" };







}
