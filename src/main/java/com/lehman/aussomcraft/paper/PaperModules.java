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
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.concurrent.ConcurrentHashMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import com.aussom.Engine;

/**
 * The generated Paper modules, read from the jar and registered per engine.
 *
 * A tier is a directory of modules. Registering a tier's modules is what
 * gives a script that tier's API, and a module a tier does not have simply
 * cannot be included.
 *
 * Modules are registered, not included. An engine parses only what a script
 * asks for with 'include paper.trusted.Player;', plus the small core the
 * loader includes for it, so the cost scales with what a script touches
 * rather than with the size of the API.
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

    /** Reads one tier's manifest. Unreadable yields empty, which grants nothing. */
    private static Set<String> readManifest(String Tier) {
        Set<String> out = new HashSet<String>();
        String path = "/" + ROOT + Tier + "/TYPES.txt";
        try (InputStream in = PaperModules.class.getResourceAsStream(path)) {
            if (in == null) {
                return out;
            }
            for (String line : new String(in.readAllBytes(),
                    StandardCharsets.UTF_8).split("\n")) {
                String t = line.trim();
                if (!t.isEmpty() && !t.startsWith("#")) {
                    out.add(t);
                }
            }
        } catch (IOException e) {
            return new HashSet<String>();
        }
        return out;
    }

    /** Module names by tier, discovered once per JVM. */
    private static final Map<String, List<String>> BY_TIER =
        new ConcurrentHashMap<String, List<String>>();

    private PaperModules() { }

    /**
     * Registers every module of a tier on an engine, and includes the core
     * types.
     *
     * @param Eng is the engine to register on.
     * @param Tier is the tier id, for example "trusted".
     * @return An int with how many modules were registered.
     * @throws Exception when a core module cannot be included.
     */
    public static int install(Engine Eng, String Tier) throws Exception {
        int n = 0;
        for (String type : names(Tier)) {
            String src = read(Tier, type);
            if (src == null) {
                continue;
            }
            // 'include paper.trusted.Player;' resolves to this path.
            Eng.addModule("paper/" + Tier + "/" + type + ".aus", src);
            n++;
        }
        for (String type : CORE) {
            String mod = "paper/" + Tier + "/" + type + ".aus";
            if (names(Tier).contains(type)) {
                Eng.addInclude(mod);
            }
        }
        return n;
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
        try {
            Eng.addInclude("paper/" + Tier + "/" + Type + ".aus");
        } catch (Exception e) {
            return false;
        }
        return Eng.containsClass(Type);
    }

    /** The tier ids, lowest first. */
    private static final String[] TIERS = { "untrusted", "trusted", "dangerous" };

    /**
     * Every type name any tier provides.
     *
     * The collision check needs the union rather than one tier's list. A
     * script's own class called ServerTickManager collides even on a tier
     * that has no such module, because the host picks a shim class by the
     * Java type's simple name and does not consult the tier first.
     *
     * @return An unmodifiable List of every generated type name.
     */
    public static List<String> allTypeNames() {
        List<String> out = new ArrayList<String>();
        for (String tier : TIERS) {
            for (String n : names(tier)) {
                if (!out.contains(n)) {
                    out.add(n);
                }
            }
        }
        return Collections.unmodifiableList(out);
    }

    /**
     * The type names a tier provides.
     *
     * @param Tier is the tier id.
     * @return An unmodifiable List of type names.
     */
    public static List<String> names(String Tier) {
        List<String> hit = BY_TIER.get(Tier);
        if (hit != null) {
            return hit;
        }
        List<String> found = discover(Tier);
        // An empty answer is never cached. discover falls back to empty on
        // any failure, and caching that would turn one transient problem
        // into a permanently empty tier: every shim would then come back
        // null with nothing to say why.
        if (!found.isEmpty()) {
            BY_TIER.put(Tier, found);
        }
        return found;
    }

    /** Matches a declaration in a generated module. The format is ours. */
    private static final Pattern DECL = Pattern.compile("public\\s+extern\\s+(\\w+)\\s*\\(");

    /** Declared method names by "tier/Type", parsed once. */
    private static final Map<String, Set<String>> METHODS =
        new ConcurrentHashMap<String, Set<String>>();

    /**
     * The method names a tier's module for a type declares.
     *
     * This is the tier's grant for that type, written where the generator
     * wrote it, so it is the thing to compare a live class against.
     *
     * @param Tier is the tier id.
     * @param Type is the simple type name.
     * @return A Set of method names, or null when this tier has no such
     *         module and therefore grants nothing at all.
     */
    public static Set<String> allowedMethods(String Tier, String Type) {
        String key = Tier + "/" + Type;
        Set<String> hit = METHODS.get(key);
        if (hit != null) {
            return hit;
        }
        String src = read(Tier, Type);
        if (src == null) {
            return null;
        }
        Set<String> out = new HashSet<String>();
        Matcher m = DECL.matcher(src);
        while (m.find()) {
            out.add(m.group(1));
        }
        METHODS.put(key, out);
        return out;
    }

    private static String read(String Tier, String Type) {
        String path = "/" + ROOT + Tier + "/" + Type + ".aus";
        try (InputStream in = PaperModules.class.getResourceAsStream(path)) {
            if (in == null) {
                return null;
            }
            return new String(in.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * Lists a tier's modules. Reads the jar directly, because a classpath
     * directory cannot be listed through getResource alone.
     */
    private static List<String> discover(String Tier) {
        List<String> out = new ArrayList<String>();
        String dir = ROOT + Tier + "/";
        try {
            URL self = PaperModules.class.getProtectionDomain()
                .getCodeSource().getLocation();
            java.io.File f = new java.io.File(self.toURI());
            if (f.isDirectory()) {
                java.io.File d = new java.io.File(f, dir);
                String[] kids = d.list();
                if (kids != null) {
                    for (String k : kids) {
                        if (k.endsWith(".aus")) {
                            out.add(k.substring(0, k.length() - 4));
                        }
                    }
                }
            } else {
                try (JarFile jar = new JarFile(f)) {
                    java.util.Enumeration<JarEntry> en = jar.entries();
                    while (en.hasMoreElements()) {
                        String n = en.nextElement().getName();
                        if (n.startsWith(dir) && n.endsWith(".aus")
                                && n.indexOf('/', dir.length()) < 0) {
                            out.add(n.substring(dir.length(), n.length() - 4));
                        }
                    }
                }
            }
        } catch (Exception e) {
            return Collections.emptyList();
        }
        Collections.sort(out);
        return Collections.unmodifiableList(out);
    }
}
