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
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import com.aussom.Engine;

import com.lehman.aussomcraft.profile.Profile;
import com.lehman.aussomcraft.script.IncludePaths;

/**
 * Runs real Aussom source on a real engine under each profile.
 *
 * These matter more than the property assertions in ProfilePolicyTest,
 * because they exercise the gates the way a script reaches them. Each denial
 * is paired with a positive case, so a typo cannot pass as a working gate.
 *
 * None of this needs Bukkit. Note also what it cannot claim: the class
 * loader of design section 3 is untestable here and under MockBukkit, since
 * in both the app class loader already sees everything.
 */
public class EngineDenialIT {

    /** The loader a plain JUnit run has, which sees everything. */
    private static final ClassLoader LOADER = EngineDenialIT.class.getClassLoader();

    /** Where the plugin keeps aji.aus, read straight off the classpath. */
    private static final String AJI_MODULE = "/com/lehman/aussomcraft/aus/aji.aus";

    /** This plugin's AJI implementation class. */
    private static final String AJI_CLASS = "com.lehman.aussomcraft.aji.AussomAJI";

    /** A class on the classpath that no profile lists. */
    private static final String UNLISTED_CLASS = "com.lehman.aussomcraft.AussomCraftPlugin";

    /**
     * Builds an engine under a profile, registering aji.aus only where the
     * profile is meant to have it. This mirrors ScriptLoader.
     */
    private Engine engineFor(Profile p) throws Exception {
        Engine eng = new Engine(p.newPolicy(LOADER));
        // aji.aus lives in the dangerous tier's own directory, so adding
        // that tier's include path is the whole of what makes it reachable.
        // No other tier has a path that finds it.
        eng.addResourceIncludePath(IncludePaths.paperResource(p));
        return eng;
    }

    private static String resource(String name) throws Exception {
        try (InputStream in = EngineDenialIT.class.getResourceAsStream(name)) {
            assertNotNull(in, "missing bundled module " + name);
            return new String(in.readAllBytes(), StandardCharsets.UTF_8);
        }
    }

    /** Source declaring an extern class against the named Java class. */
    private static String externDeclaring(String javaClass) {
        return "static extern class sneaky : " + javaClass + " {\n"
             + "    public extern nope();\n"
             + "}\n"
             + "class Main { public main() { return 0; } }\n";
    }

    /**
     * Parses and reports the denial message, or null when it parsed.
     */
    private String parseDenial(Engine eng, String src) {
        try {
            eng.parseString("test.aus", src);
        } catch (Exception denied) {
            return denied.getMessage();
        }
        if (eng.hasParseErrors()) {
            return "parse errors";
        }
        return null;
    }

    // ---- the bypass that would matter most ----

    /**
     * The one extern binding that would undo the untrusted profile: naming the
     * AJI class directly, which would hand a script AJI without touching the
     * module registration that withholds it.
     */
    @Test
    public void untrustedCannotBindAjiDirectly() throws Exception {
        String denial = parseDenial(engineFor(Profile.UNTRUSTED), externDeclaring(AJI_CLASS));
        assertNotNull(denial, "untrusted must not be able to bind " + AJI_CLASS);
        assertTrue(denial.contains("not permitted"),
            "the denial should say what was refused, got: " + denial);
    }

    /** The first thing that has to hold: the module is not even there. */
    @Test
    public void untrustedCannotIncludeAji() throws Exception {
        String denial = parseDenial(engineFor(Profile.UNTRUSTED),
            "include aji;\nclass Main { public main() { return 0; } }\n");
        assertNotNull(denial, "aji must not be includable untrusted");
    }

    /** A script that reaches for aji anyway fails rather than running. */
    @Test
    public void untrustedScriptCallingAjiFails() throws Exception {
        Engine eng = engineFor(Profile.UNTRUSTED);
        eng.parseString("test.aus",
            "class Main { public main() {\n"
          + "  aji.invokeStatic(\"org.bukkit.Bukkit\", \"dispatchCommand\", null, \"op me\");\n"
          + "  return 0;\n} }\n");
        assertFalse(eng.hasParseErrors());
        assertNotEquals(0, eng.run(),
            "an untrusted script reaching for aji must not report success");
    }

    /**
     * The narrow extern list is narrow in the trusted profile too: a class
     * on the classpath that no profile lists is refused in both.
     */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void noProfileBindsAnUnlistedExternClass(Profile p) throws Exception {
        String denial = parseDenial(engineFor(p), externDeclaring(UNLISTED_CLASS));
        assertNotNull(denial,
            p.getId() + " must not be able to bind " + UNLISTED_CLASS);
    }

    /**
     * The gate a script must never open. Asserted by reading the property back
     * rather than trusting the call's return: the state is what matters.
     */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void noProfileLetsAScriptOpenItsOwnGate(Profile p) throws Exception {
        Engine eng = engineFor(p);
        eng.parseString("test.aus",
            "class Main { public main() {\n"
          + "  try { secman.setProp(\"" + AjiGate.ENFORCE + "\", false); } catch (e) { }\n"
          + "  return 0;\n} }\n");
        assertFalse(eng.hasParseErrors());
        eng.run();
        assertTrue(eng.getSecurityManager().getPropertyBoolean(AjiGate.ENFORCE, false),
            p.getId() + ": a script must not be able to switch enforcement off");
    }

    // ---- the paired positives, so the gates above are not vacuous ----

    /** Trusted really can reach Java, or the profile would be pointless. */
    @Test
    public void dangerousCanConstructAndCallAJavaObject() throws Exception {
        Engine eng = engineFor(Profile.DANGEROUS);
        eng.parseString("test.aus",
            "include aji;\n"
          + "class Main { public main() {\n"
          + "  sb = aji.newObj(\"java.lang.StringBuilder\");\n"
          + "  sb.invoke(\"append\", \"it works\");\n"
          + "  if (sb.invoke(\"toString\") != \"it works\") { return 2; }\n"
          + "  return 0;\n} }\n");
        assertFalse(eng.hasParseErrors(), "aji.aus must parse in the dangerous profile");
        assertEquals(0, eng.run(), "a dangerous script must be able to use a Java object");
    }

    /**
     * A trusted engine must have AussomJavaObject defined even when the
     * script never wrote 'include aji;'. The host wraps Java objects before
     * the script sees them, so registering the module is not enough: it has
     * to be included.
     */
    @Test
    public void dangerousEngineHasAjiWithoutTheScriptAskingForIt() throws Exception {
        Engine eng = engineFor(Profile.DANGEROUS);
        eng.addInclude("aji.aus");
        assertTrue(eng.containsClass("AussomJavaObject"),
            "a dangerous engine must be able to wrap a Java object");
    }

    /** Trusted may bind the AJI class, which is what lets aji.aus parse. */
    @Test
    public void dangerousMayBindAji() throws Exception {
        assertNull2(parseDenial(engineFor(Profile.DANGEROUS), externDeclaring(AJI_CLASS)));
    }

    /**
     * Both profiles keep the base standard library, or an untrusted script
     * could not do anything at all and the profile would be useless rather
     * than safe.
     */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void everyProfileKeepsTheStandardLibrary(Profile p) throws Exception {
        Engine eng = engineFor(p);
        eng.parseString("test.aus",
            "class Main { public main() {\n"
          + "  l = [3, 1, 2];\n"
          + "  l.sortAsc();\n"
          + "  if (l[0] != 1) { return 2; }\n"
          + "  if ((\"a\" + \"b\") != \"ab\") { return 3; }\n"
          + "  return 0;\n} }\n");
        assertFalse(eng.hasParseErrors());
        assertEquals(0, eng.run(), p.getId() + ": the base standard library must still work");
    }

    private static void assertNull2(String denial) {
        assertTrue(denial == null,
            "expected this to be permitted, but it was refused: " + denial);
    }
}
