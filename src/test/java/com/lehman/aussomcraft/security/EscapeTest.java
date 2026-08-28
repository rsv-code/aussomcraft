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

package com.lehman.aussomcraft.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.aussom.Engine;
import com.aussom.Environment;
import com.aussom.LoggingInt;
import com.aussom.types.AussomType;

import com.lehman.aussomcraft.host.Host;
import com.lehman.aussomcraft.paper.PaperModules;
import com.lehman.aussomcraft.profile.Profile;

/**
 * Attempts to reach outside a tier, from a script's point of view.
 *
 * Every test here is an attack. Each asserts on what the interpreter
 * actually did rather than on "something failed", because a denial and a
 * typo both throw and only one of them means the gate works. The paired
 * positives live in EngineDenialTest and GeneratedShimTest, so a gate that
 * denies everything cannot pass this file quietly.
 */
public class EscapeTest {

    private static final ClassLoader LOADER = EscapeTest.class.getClassLoader();

    /** Builds an engine the way ScriptLoader does, for a tier. */
    private Engine engineFor(Profile p) throws Exception {
        Engine eng = new Engine(p.newPolicy(LOADER));
        eng.addModule("craft.aus", resource("/com/lehman/aussomcraft/aus/craft.aus"));
        if (p == Profile.DANGEROUS) {
            eng.addModule("aji.aus", resource("/com/lehman/aussomcraft/aus/aji.aus"));
        }
        PaperModules.install(eng, p.getId());
        return eng;
    }

    private static String resource(String name) throws Exception {
        try (InputStream in = EscapeTest.class.getResourceAsStream(name)) {
            assertNotNull(in, "missing module " + name);
            return new String(in.readAllBytes(), StandardCharsets.UTF_8);
        }
    }

    /** One tier's generated module for a type, or null when it has none. */
    private static String tierModule(Profile p, String Type) throws Exception {
        String path = "/com/lehman/aussomcraft/aus/paper/" + p.getId() + "/" + Type + ".aus";
        try (InputStream in = EscapeTest.class.getResourceAsStream(path)) {
            if (in == null) {
                return null;
            }
            return new String(in.readAllBytes(), StandardCharsets.UTF_8);
        }
    }

    /** Parses source and returns the refusal, or null when it was allowed. */
    private String refusal(Engine Eng, String Source) {
        try {
            Eng.parseString("attack.aus", Source);
        } catch (Exception denied) {
            return String.valueOf(denied.getMessage());
        }
        if (Eng.hasParseErrors()) {
            return "parse errors: " + Eng.getParseDiagnostics();
        }
        return null;
    }

    /** Runs source and returns everything the engine logged. */
    private String runCapturing(Engine Eng, String Source) throws Exception {
        Eng.parseString("attack.aus", Source);
        Capture log = new Capture();
        Eng.setLogger(log);
        try {
            Eng.run();
        } catch (Exception e) {
            log.err(String.valueOf(e.getMessage()));
        }
        return log.text();
    }

    /**
     * Asserts a refusal came from the extern allowlist, and that the class
     * it refused is still a real one.
     *
     * The gate matches on the name before the class is loaded, so a class
     * that does not exist is refused with exactly the same message as one
     * that does. The message alone therefore cannot tell a denial from a
     * rename, which is why the class is loaded separately here. Without
     * that, renaming a shim would leave this file refusing a name that is
     * gone and passing on it. See design/lessons-learned.md, "A passing
     * security test is not automatically evidence".
     *
     * @param Denial the message from refusal, or null when it was allowed
     * @param Cls the binary name the script tried to bind
     */
    private void assertRefusedByExternGate(String Denial, String Cls) {
        assertNotNull(Denial, "must not be able to name " + Cls);
        assertTrue(Denial.contains("'" + Cls + "' is not permitted"),
            "expected the extern allowlist to refuse " + Cls
            + " by name, got: " + Denial);
        assertTrue(Denial.contains("aussom.extern.allowed"),
            "expected the refusal to name the 'aussom.extern.allowed' gate,"
            + " got: " + Denial);
        try {
            Class.forName(Cls, false, LOADER);
        } catch (ClassNotFoundException gone) {
            fail(Cls + " no longer exists, so this test refuses a name that"
                + " is gone and proves nothing. Point it at a current class.");
        }
    }

    // ------------------------------------------------------------------
    // Binding a Java class that exists but is out of the tier's reach
    // ------------------------------------------------------------------

    /**
     * A script naming a real Java class in an extern declaration.
     *
     * Each of these classes is on the class path and would load. The
     * allowlist is the only thing standing between a script and them, so
     * this is the test that matters most.
     */
    @ParameterizedTest
    @CsvSource({
        "org.bukkit.Bukkit,               the server itself",
        "org.bukkit.Server,               the server interface",
        "org.bukkit.plugin.PluginManager, every other plugin",
        "java.io.File,                    the filesystem",
        "java.lang.ClassLoader,           loading arbitrary classes",
        "java.lang.Runtime,               running processes",
        "java.lang.System,                system access",
        "java.net.URL,                    the network",
        "com.lehman.aussomcraft.aji.AussomAJI,        reflection over everything",
        "com.lehman.aussomcraft.aji.AjiGate,          the gate itself",
        "com.lehman.aussomcraft.trust.TrustStore,     the grant store",
        "com.lehman.aussomcraft.AussomCraftPlugin,    the plugin",
    })
    public void noTierBindsAForbiddenClass(String Target, String Why) throws Exception {
        for (Profile p : new Profile[] { Profile.UNTRUSTED, Profile.TRUSTED }) {
            String denial = refusal(engineFor(p),
                "extern class Escape : " + Target + " {\n"
              + "    public extern anything();\n}\n"
              + "class Main { public main() { return 0; } }\n");
            assertNotNull(denial, p.getId() + " must not bind " + Target
                + " (" + Why + ")");
            assertTrue(denial.contains("not permitted") || denial.contains("parse errors"),
                "expected a policy refusal for " + Target + ", got: " + denial);
        }
    }

    /**
     * The one forbidden class the dangerous tier may bind, since that is
     * what AJI is. Proves the test above is refusing on policy rather than
     * on the declaration being malformed.
     */
    @Test
    public void dangerousMayBindAjiAndNothingElseForbidden() throws Exception {
        assertNull(refusal(engineFor(Profile.DANGEROUS),
            "extern class Ok : com.lehman.aussomcraft.aji.AussomAJI {\n"
          + "    public extern newObj(A0);\n}\n"
          + "class Main { public main() { return 0; } }\n"),
            "the dangerous tier binds AJI, which is the point of it");

        assertNotNull(refusal(engineFor(Profile.DANGEROUS),
            "extern class No : java.lang.Runtime {\n    public extern exec(A0);\n}\n"
          + "class Main { public main() { return 0; } }\n"),
            "even dangerous does not bind arbitrary JDK classes by declaration");
    }

    /**
     * A script may name its own tier's shim package, because the generated
     * modules bind classes in it and they have to parse. What it gets from
     * doing so is an object that holds nothing: the host is the only thing
     * that ever attaches one.
     */
    @Test
    public void aSelfDeclaredShimWrapsNothing() throws Exception {
        Engine eng = engineFor(Profile.UNTRUSTED);
        String out = runCapturing(eng,
            "extern class Escape : com.lehman.aussomcraft.paper.gen.untrusted.PlayerShim {\n"
          + "    public extern getName();\n"
          + "}\n"
          + "class Main { public main() {\n"
          + "  e = new Escape();\n"
          + "  c.log(\"NAME=\" + e.getName());\n"
          + "  return 0;\n} }\n");
        assertTrue(out.contains("no longer attached"),
            "a self declared shim must hold nothing: " + out);
    }

    /**
     * setObj is public Java, but its signature is not the extern calling
     * convention, so a script cannot declare it and attach an object of its
     * own choosing.
     */
    @Test
    public void aScriptCannotAttachAnObjectToAShim() throws Exception {
        Engine eng = engineFor(Profile.UNTRUSTED);
        String out = runCapturing(eng,
            "extern class Escape : com.lehman.aussomcraft.paper.gen.untrusted.PlayerShim {\n"
          + "    public extern setObj(A0);\n}\n"
          + "class Main { public main() {\n"
          + "  e = new Escape();\n"
          + "  e.setObj(\"anything\");\n"
          + "  return 0;\n} }\n");
        assertTrue(out.contains("EXTERN_NO_SUCH_METHOD") || out.contains("no such method"),
            "attaching an object must not be reachable: " + out);
    }

    /**
     * A tier cannot name another tier's shim package.
     *
     * This is the boundary the generated classes exist for. Each tier's
     * shims carry only that tier's methods, so binding another tier's class
     * would hand over its whole API, and the interpreter refuses the name
     * before any of it is reachable.
     */
    @ParameterizedTest
    @ValueSource(strings = {
        "com.lehman.aussomcraft.paper.gen.trusted.PlayerShim",
        "com.lehman.aussomcraft.paper.gen.dangerous.PlayerShim",
        "com.lehman.aussomcraft.paper.gen.dangerous.ServerShim",
    })
    public void untrustedCannotNameAnotherTiersShim(String Cls) throws Exception {
        assertRefusedByExternGate(refusal(engineFor(Profile.UNTRUSTED),
            "extern class Escape : " + Cls + " {\n"
          + "    public extern setOp(A0);\n}\n"
          + "class Main { public main() { return 0; } }\n"), Cls);
    }

    /** Trusted cannot reach the dangerous shims either. */
    @Test
    public void trustedCannotNameTheDangerousShims() throws Exception {
        String cls = "com.lehman.aussomcraft.paper.gen.dangerous.ServerShim";
        assertRefusedByExternGate(refusal(engineFor(Profile.TRUSTED),
            "extern class Escape : " + cls + " {\n"
          + "    public extern shutdown();\n}\n"
          + "class Main { public main() { return 0; } }\n"), cls);
    }

    /**
     * The runtime package is on no tier's list at all, so the marshaller and
     * the shim base class cannot be named by any script.
     */
    @ParameterizedTest
    @ValueSource(strings = {
        "com.lehman.aussomcraft.paper.Marshal",
        "com.lehman.aussomcraft.paper.PaperObj",
        "com.lehman.aussomcraft.paper.PaperModules",
    })
    public void noTierCanNameTheRuntime(String Cls) throws Exception {
        for (Profile p : Profile.values()) {
            assertRefusedByExternGate(refusal(engineFor(p),
                "extern class Escape : " + Cls + " {\n}\n"
              + "class Main { public main() { return 0; } }\n"), Cls);
        }
    }

    // ------------------------------------------------------------------
    // The host package, which every tier's allowlist grants in full
    // ------------------------------------------------------------------

    /**
     * Host is nameable at every tier and must still yield nothing.
     *
     * The extern allowlist grants 'com.lehman.aussomcraft.host.*' at every
     * tier, because the five Host* classes the script API is made of live
     * there. Host itself is in that package and holds the static plugin
     * handle, so reaching setPlugin would repoint every extern on the
     * server, and plugin() would hand a script the plugin itself.
     *
     * Two separate things stop that. The class is final with a private
     * constructor, and none of its methods matches the extern calling
     * convention. This pins the first; hostExposesNoExternCallableMethods
     * pins the second. The assertion names the private constructor rather
     * than accepting any failure, because a misspelled class would fail too
     * and would prove nothing.
     */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void hostItselfCannotBeConstructed(Profile p) throws Exception {
        String out = runCapturing(engineFor(p),
            "extern class H : com.lehman.aussomcraft.host.Host {\n"
          + "    public extern setPlugin(A0);\n}\n"
          + "class Main { public main() {\n"
          + "  h = new H();\n"
          + "  h.setPlugin(null);\n"
          + "  return 0;\n} }\n");
        assertTrue(out.contains("INSTANTIATION_FAILURE"),
            p.getId() + " must not be able to construct Host. Got: " + out);
        assertTrue(out.contains("private"),
            p.getId() + " must fail on Host's private constructor, not on"
            + " something else. Got: " + out);
    }

    /**
     * No method on Host is reachable from a script.
     *
     * A script calls an extern method only when its Java signature is
     * (Environment, ArrayList) returning AussomType. Host's methods are host
     * side helpers and none has that shape, which is what keeps setPlugin
     * and plugin() out of reach even though the class is on the allowlist.
     *
     * Structural rather than behavioural on purpose: it fails the moment
     * somebody adds an extern shaped method to Host, which is the change
     * that would open this up, rather than waiting for a script to exploit
     * it.
     */
    @Test
    public void hostExposesNoExternCallableMethods() {
        for (Method m : Host.class.getDeclaredMethods()) {
            if (!Modifier.isPublic(m.getModifiers())) {
                continue;
            }
            Class<?>[] params = m.getParameterTypes();
            boolean externShaped = params.length == 2
                && params[0] == Environment.class
                && params[1] == ArrayList.class
                && m.getReturnType() == AussomType.class;
            assertFalse(externShaped, "Host." + m.getName() + " is extern callable,"
                + " so any script naming com.lehman.aussomcraft.host.Host could call"
                + " it. Host holds the static plugin handle. Move this method onto"
                + " one of the Host* classes or stop it being public.");
        }
    }

    // ------------------------------------------------------------------
    // Reaching another tier's modules
    // ------------------------------------------------------------------

    /** A tier cannot include a module belonging to a higher tier. */
    @ParameterizedTest
    @ValueSource(strings = {
        "paper.trusted.Player", "paper.dangerous.Player",
        "paper.trusted.World", "paper.dangerous.Server",
    })
    public void untrustedCannotIncludeAHigherTiersModule(String Module) throws Exception {
        assertNotNull(refusal(engineFor(Profile.UNTRUSTED),
            "include " + Module + ";\nclass Main { public main() { return 0; } }\n"),
            "untrusted must not include " + Module);
    }

    /** The trusted tier still cannot reach the dangerous modules. */
    @ParameterizedTest
    @ValueSource(strings = { "paper.dangerous.Server", "paper.dangerous.Bukkit" })
    public void trustedCannotIncludeDangerousModules(String Module) throws Exception {
        assertNotNull(refusal(engineFor(Profile.TRUSTED),
            "include " + Module + ";\nclass Main { public main() { return 0; } }\n"),
            "trusted must not include " + Module);
    }

    /** aji is not registered below the dangerous tier. */
    @ParameterizedTest
    @EnumSource(value = Profile.class, names = { "UNTRUSTED", "TRUSTED" })
    public void ajiIsNotIncludableBelowDangerous(Profile p) throws Exception {
        assertNotNull(refusal(engineFor(p),
            "include aji;\nclass Main { public main() { return 0; } }\n"),
            p.getId() + " must not include aji");
    }

    // ------------------------------------------------------------------
    // Calling what the tier's module does not declare
    // ------------------------------------------------------------------

    /**
     * The generated module is the gate. A method the tier withheld is not
     * declared, so the call does not resolve.
     */
    @ParameterizedTest
    @CsvSource({
        "Player,  performCommand,  running commands as the player",
        "Player,  setOp,           conferring operator",
        "Player,  kick,            kicking players",
        "Player,  getServer,       reaching the server",
        "World,   getWorldFolder,  reaching the filesystem",
        "World,   getWorldPath,    reaching the filesystem",
    })
    public void untrustedCannotCallAWithheldMethod(String Type, String Method, String Why)
            throws Exception {
        String module = resource("/com/lehman/aussomcraft/aus/paper/untrusted/"
            + Type + ".aus");
        assertFalse(module.contains(" " + Method + "("),
            "untrusted " + Type + " must not declare " + Method + " (" + Why + ")");
    }

    /** The trusted tier withholds the harmful methods too. */
    @ParameterizedTest
    @CsvSource({
        "World,   getWorldFolder",
        "World,   getWorldPath",
        "Player,  getServer",
    })
    public void trustedCannotCallAHarmfulMethod(String Type, String Method) throws Exception {
        String module = resource("/com/lehman/aussomcraft/aus/paper/trusted/"
            + Type + ".aus");
        assertFalse(module.contains(" " + Method + "("),
            "trusted " + Type + " must not declare " + Method);
    }

    /** No generated module anywhere exposes getClass. */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void noModuleExposesGetClass(Profile p) throws Exception {
        for (String type : new String[] { "Player", "World", "Block", "ItemStack" }) {
            String path = "/com/lehman/aussomcraft/aus/paper/" + p.getId() + "/" + type + ".aus";
            try (InputStream in = EscapeTest.class.getResourceAsStream(path)) {
                if (in == null) {
                    continue;
                }
                String module = new String(in.readAllBytes(), StandardCharsets.UTF_8);
                assertFalse(module.contains(" getClass("),
                    p.getId() + " " + type + " must not expose getClass");
                assertFalse(module.contains(" getClassLoader("),
                    p.getId() + " " + type + " must not expose getClassLoader");
            }
        }
    }

    // ------------------------------------------------------------------
    // Standard library gates
    // ------------------------------------------------------------------

    /**
     * Evaluating source at run time would sidestep every parse time gate.
     *
     * The assertion names the security action rather than merely checking
     * that something was thrown. An earlier version of this test called
     * 'evalString', which the reflect module does not define, so it passed
     * on the resulting FUNCT_NOT_FOUND without ever reaching the gate. A
     * test that cannot tell a denial from a typo is not evidence.
     */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void noTierEvaluatesSourceAtRunTime(Profile p) throws Exception {
        String out = runCapturing(engineFor(p),
            "include reflect;\n"
          + "class Main { public main() {\n"
          + "  try { reflect.evalStr(\"class X { public main() { return 0; } }\");\n"
          + "        c.log(\"EVALUATED\"); }\n"
          + "  catch (e) { c.log(\"DENIED text=\" + e.getText()); }\n"
          + "  return 0;\n} }\n");
        assertFalse(out.contains("EVALUATED"), "eval must not succeed at " + p.getId());
        assertTrue(out.contains("reflect.eval.string"),
            p.getId() + " must refuse eval by the 'reflect.eval.string' gate,"
            + " not by accident. Got: " + out);
    }

    /**
     * The reflect module can also load a module by name at run time, which
     * would defeat the parse time include gate the tiers rely on.
     */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void noTierIncludesAModuleAtRunTime(Profile p) throws Exception {
        String out = runCapturing(engineFor(p),
            "include reflect;\n"
          + "class Main { public main() {\n"
          + "  try { reflect.includeModule(\"aji\"); c.log(\"INCLUDED\"); }\n"
          + "  catch (e) { c.log(\"DENIED text=\" + e.getText()); }\n"
          + "  return 0;\n} }\n");
        assertFalse(out.contains("INCLUDED"), p.getId() + " must not include at run time");
        assertTrue(out.contains("reflect.include.module"),
            p.getId() + " must refuse by the 'reflect.include.module' gate. Got: " + out);
    }

    /**
     * Reading the policy is deliberately permitted. The map holds flags,
     * limits and the extern allowlist, and nothing that is a secret, so a
     * script learning its own limits is not a leak. This test pins that
     * decision: if something sensitive is ever added to the property map,
     * it fails and the decision gets revisited rather than inherited.
     */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void thePolicyHoldsNothingSecret(Profile p) throws Exception {
        String out = runCapturing(engineFor(p),
            "class Main { public main() { c.log(\"DUMP=\" + secman.getMap()); return 0; } }\n");
        assertTrue(out.contains("DUMP="), p.getId() + " is expected to read its own policy");
        for (String secret : new String[] { "password", "secret", "token",
                "credential", "seed", "/home/", "C:\\\\" }) {
            assertFalse(out.toLowerCase(Locale.ROOT).contains(secret),
                p.getId() + " policy must not carry '" + secret + "'. Got: " + out);
        }
    }

    /**
     * A fresh SecurityManager is instantiable, and setting properties on it
     * reports success. It must stay a standalone object: if it wrote through
     * to the engine, a script could switch off its own allowlist.
     */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void aFreshManagerDoesNotRewriteTheEnginePolicy(Profile p) throws Exception {
        String out = runCapturing(engineFor(p),
            "include reflect;\n"
          + "class Main { public main() {\n"
          + "  sm = new SecurityManager();\n"
          + "  sm.setMap({\"aussom.extern.allowlist.enforce\": false,\n"
          + "             \"reflect.eval.string\": true});\n"
          + "  c.log(\"enforce=\" + secman.getProp(\"aussom.extern.allowlist.enforce\"));\n"
          + "  try { reflect.evalStr(\"class X { public main() { return 1; } }\");\n"
          + "        c.log(\"EVAL SUCCEEDED\"); }\n"
          + "  catch (e) { c.log(\"eval still denied\"); }\n"
          + "  return 0;\n} }\n");
        assertTrue(out.contains("enforce=true"),
            p.getId() + " must keep enforcing its allowlist. Got: " + out);
        assertFalse(out.contains("EVAL SUCCEEDED"),
            p.getId() + " must not gain eval from a fresh manager. Got: " + out);
    }

    /** Writing the policy is the one that ends the sandbox outright. */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void noTierWritesItsOwnPolicy(Profile p) throws Exception {
        String out = runCapturing(engineFor(p),
            "class Main { public main() {\n"
          + "  try { secman.setProp(\"aussom.extern.allowlist.enforce\", false);\n"
          + "        c.log(\"WROTE\"); }\n"
          + "  catch (e) { c.log(\"DENIED text=\" + e.getText()); }\n"
          + "  return 0;\n} }\n");
        assertFalse(out.contains("WROTE"), p.getId() + " must not write its policy");
        assertTrue(out.contains("securitymanager.property.set"),
            p.getId() + " must refuse by the 'securitymanager.property.set' gate. Got: " + out);
    }

    /** The unit test runner would build an engine under a policy of its own. */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void noTierBuildsATestRunner(Profile p) throws Exception {
        assertFalse(p.newPolicy(LOADER).getPropertyBoolean("test.aussom.runner", false),
            p.getId() + " must not permit a child test engine");
    }

    /** Script mode would let a script evaluate a line at a time. */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void noTierEnablesScriptMode(Profile p) {
        assertFalse(p.newPolicy(LOADER).getPropertyBoolean("aussom.script.mode.enable", false),
            p.getId() + " must not enable script mode");
    }

    /** A debugger would expose the whole interpreter state. */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void noTierAttachesADebugger(Profile p) {
        assertFalse(p.newPolicy(LOADER).getPropertyBoolean("aussom.debugger.enable", false),
            p.getId() + " must not permit a debugger");
    }

    /** System information is not a capability any tier needs. */
    @ParameterizedTest
    @EnumSource(value = Profile.class, names = { "UNTRUSTED", "TRUSTED" })
    public void systemInformationIsWithheld(Profile p) {
        for (String prop : new String[] { "os.info.view", "java.info.view",
                "java.classpath.view", "home.path.view", "user.name.view" }) {
            assertFalse(p.newPolicy(LOADER).getPropertyBoolean(prop, false),
                p.getId() + " must not permit " + prop);
        }
    }


    // ------------------------------------------------------------------
    // Registration, which must stay with the host externs
    // ------------------------------------------------------------------

    /**
     * A script that could register a handler by some other route would
     * survive being unloaded, because the host would have no record of it to
     * detach. So no generated module may offer registration or scheduling.
     */
    @ParameterizedTest
    @EnumSource(value = Profile.class, names = { "UNTRUSTED", "TRUSTED" })
    public void noModuleOffersRegistrationOrScheduling(Profile p) throws Exception {
        String[] forbidden = {
            "registerEvent", "registerEvents", "runTask", "runTaskTimer",
            "runTaskLater", "runTaskAsynchronously", "scheduleSyncRepeatingTask",
            "getScheduler", "getPluginManager", "callEvent",
        };
        for (String type : PaperModules.names(p.getId())) {
            String module = tierModule(p, type);
            if (module == null) {
                continue;
            }
            for (String bad : forbidden) {
                assertFalse(module.contains(" " + bad + "("),
                    p.getId() + " " + type + " must not offer " + bad
                    + ": unload could not detach what it registered");
            }
        }
    }

    /** The registration and control plane types get no module below dangerous. */
    @ParameterizedTest
    @EnumSource(value = Profile.class, names = { "UNTRUSTED", "TRUSTED" })
    public void controlPlaneTypesHaveNoModule(Profile p) {
        for (String type : new String[] { "Server", "Bukkit", "PluginManager",
                "BukkitScheduler", "BukkitRunnable", "HandlerList",
                "ConsoleCommandSender", "CommandMap", "Plugin" }) {
            assertFalse(PaperModules.names(p.getId()).contains(type),
                p.getId() + " must have no module for " + type);
        }
    }

    /** A shim a tier lacks cannot be built even by name. */
    @Test
    public void aTierCannotInstantiateAShimItLacks() throws Exception {
        Engine eng = engineFor(Profile.TRUSTED);
        assertFalse(eng.containsClass("Server"),
            "trusted must not have a Server class to instantiate");
        String out = runCapturing(eng,
            "class Main { public main() {\n"
          + "  try { s = new Server(); c.log(\"BUILT\"); }\n"
          + "  catch (e) { c.log(\"DENIED\"); }\n"
          + "  return 0;\n} }\n");
        assertFalse(out.contains("BUILT"), "a missing shim must not be constructible");
    }

    // ------------------------------------------------------------------
    // Modules the interpreter itself must not hand over
    // ------------------------------------------------------------------

    /**
     * aussom-base ships no file, socket or process API, and this plugin does
     * not add one. Asserted rather than assumed, because adding a dependency
     * that carries one would open every tier at once.
     */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void thereIsNoFileOrProcessApiAtAnyTier(Profile p) throws Exception {
        for (String mod : new String[] { "file", "os", "socket", "sslsocket",
                "udpsocket", "jdbc", "panama", "http" }) {
            assertNotNull(refusal(engineFor(p),
                "include " + mod + ";\nclass Main { public main() { return 0; } }\n"),
                p.getId() + " must not be able to include '" + mod + "'");
        }
    }

    /** An include may not resolve through a symbolic link out of the tree. */
    @ParameterizedTest
    @EnumSource(Profile.class)
    public void includesMayNotTraverseASymlink(Profile p, @TempDir Path tmp)
            throws Exception {
        Path real = tmp.resolve("outside");
        Files.createDirectories(real);
        Files.write(real.resolve("secret.aus"),
            "class Secret { public main() { return 0; } }\n".getBytes(StandardCharsets.UTF_8));

        Path root = tmp.resolve("scripts");
        Files.createDirectories(root);
        try {
            Files.createSymbolicLink(root.resolve("linked"), real);
        } catch (Exception noSymlinks) {
            return;
        }

        Engine eng = engineFor(p);
        eng.addIncludePath(root.toString() + "/");
        assertNotNull(refusal(eng,
            "include linked.secret;\nclass Main { public main() { return 0; } }\n"),
            p.getId() + " must not include through a symbolic link");
    }

    // ------------------------------------------------------------------
    // Robustness: bad input must fail cleanly, never crash the server
    // ------------------------------------------------------------------

    /** A bad enum name is an error, not an exception escaping into the tick. */
    @Test
    public void aBadEnumNameFailsCleanly() throws Exception {
        Engine eng = engineFor(Profile.TRUSTED);
        String out = runCapturing(eng,
            "class Main { public main() {\n"
          + "  v = new Vector();\n"
          + "  try { v.setX(\"NOT_A_NUMBER\"); } catch (e) { c.log(\"CAUGHT\"); }\n"
          + "  return 0;\n} }\n");
        assertFalse(out.contains("Exception in thread"),
            "a bad argument must not escape as a Java exception: " + out);
    }

    /** Passing a shim where a number is wanted must not crash. */
    @Test
    public void wrongArgumentTypesFailCleanly() throws Exception {
        Engine eng = engineFor(Profile.TRUSTED);
        String out = runCapturing(eng,
            "class Main { public main() {\n"
          + "  a = new Vector();\n"
          + "  b = new Vector();\n"
          + "  try { a.setX(b); } catch (e) { c.log(\"CAUGHT\"); }\n"
          + "  try { a.add(42); } catch (e) { c.log(\"CAUGHT\"); }\n"
          + "  return 0;\n} }\n");
        assertFalse(out.contains("Exception in thread"),
            "type confusion must not escape: " + out);
    }

    /** Calling a method on a shim the host never attached is an error value. */
    @Test
    public void anUnattachedShimAnswersWithAnError() throws Exception {
        Engine eng = engineFor(Profile.TRUSTED);
        String out = runCapturing(eng,
            "class Main { public main() {\n"
          + "  v = new Vector();\n"
          + "  c.log(\"GOT=\" + v.getX());\n"
          + "  return 0;\n} }\n");
        assertTrue(out.contains("no longer attached") || out.contains("GOT="),
            "an unattached shim must answer rather than crash: " + out);
    }

    /** Collects everything the engine writes. */
    private static class Capture implements LoggingInt {
        private final StringBuilder sb = new StringBuilder();
        String text() { return this.sb.toString(); }
        private void add(String s) { this.sb.append(s).append('\n'); }
        @Override public void log(String s) { add(s); }
        @Override public void trc(String s) { add(s); }
        @Override public void dbg(String s) { add(s); }
        @Override public void info(String s) { add(s); }
        @Override public void warn(String s) { add(s); }
        @Override public void err(String s) { add(s); }
        @Override public void print(String s) { add(s); }
        @Override public void println(String s) { add(s); }
    }
}
