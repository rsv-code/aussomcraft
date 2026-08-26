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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import org.bukkit.util.Vector;

import net.kyori.adventure.text.Component;

import com.aussom.CallStack;
import com.aussom.Engine;
import com.aussom.Environment;
import com.aussom.SecurityManagerImpl;
import com.aussom.ast.astClass;
import com.aussom.types.AussomBool;
import com.aussom.types.AussomDouble;
import com.aussom.types.AussomInt;
import com.aussom.types.AussomList;
import com.aussom.types.AussomObject;
import com.aussom.types.AussomString;
import com.aussom.types.AussomType;
import com.aussom.types.Members;

/**
 * The generated modules, exercised against real Bukkit objects.
 *
 * Vector is used throughout because it is arithmetic with no server behind
 * it, so these stay in the fast suite. Registry backed types such as
 * ItemStack need the MockBukkit layer.
 */
public class GeneratedShimTest {

    private static final String BASE = "/com/lehman/aussomcraft/aus/paper/";

    private static String module(String Tier, String Type) throws Exception {
        try (InputStream in = GeneratedShimTest.class.getResourceAsStream(
                BASE + Tier + "/" + Type + ".aus")) {
            assertNotNull(in, "generated module missing: " + Tier + "/" + Type);
            return new String(in.readAllBytes(), StandardCharsets.UTF_8);
        }
    }

    private Engine engineWith(String Tier, String... Types) throws Exception {
        Engine eng = new Engine(new SecurityManagerImpl());
        for (String t : Types) {
            eng.addModule("paper/" + Tier + "/" + t + ".aus", module(Tier, t));
            eng.addInclude("paper/" + Tier + "/" + t + ".aus");
        }
        return eng;
    }

    /** A shim wrapping the given object, ready to call. */
    private AussomObject shim(Engine Eng, String Type, Object Wrapped) throws Exception {
        AussomObject inst = Eng.instantiateObject(Type);
        ((PaperObj) inst.getExternObject()).setObj(Wrapped);
        return inst;
    }

    private Environment envOn(Engine Eng, AussomObject On) {
        Environment env = new Environment(Eng);
        env.setEnvironment(On, new Members(), new CallStack());
        env.setCurObj(On);
        return env;
    }

    /** A generated module parses and its class is defined. */
    @Test
    public void aGeneratedModuleParses() throws Exception {
        Engine eng = engineWith("untrusted", "Player", "Block", "World");
        assertFalse(eng.hasParseErrors(), "generated modules must parse: "
            + eng.getParseDiagnostics());
        assertTrue(eng.containsClass("Player"));
        assertTrue(eng.containsClass("Block"));
    }

    /** A generated method reaches the real Paper object and marshals back. */
    @Test
    public void aGeneratedMethodCallsThrough() throws Exception {
        Engine eng = engineWith("trusted", "Vector");
        AussomObject v = shim(eng, "Vector", new Vector(3.0d, 4.0d, 0.0d));
        Environment env = envOn(eng, v);
        astClass def = eng.getClassByName("Vector");

        assertEquals(3.0d, ((AussomDouble) def.call(env, false, "getX",
            new AussomList())).getValue(), 0.0001d);
        assertEquals(5.0d, ((AussomDouble) def.call(env, false, "length",
            new AussomList())).getValue(), 0.0001d);
    }

    /** A method returning a Paper type comes back as that type's shim. */
    @Test
    public void anObjectResultComesBackAsItsShim() throws Exception {
        Engine eng = engineWith("trusted", "Vector");
        AussomObject v = shim(eng, "Vector", new Vector(1.0d, 0.0d, 0.0d));
        Environment env = envOn(eng, v);
        astClass def = eng.getClassByName("Vector");

        AussomList args = new AussomList();
        args.add(v);
        AussomType sum = def.call(env, false, "add", args);
        assertTrue(sum instanceof AussomObject, "expected a shim, got " + sum);
        Object wrapped = ((PaperObj) ((AussomObject) sum).getExternObject()).getObj();
        assertTrue(wrapped instanceof Vector);
        assertEquals(2.0d, ((Vector) wrapped).getX(), 0.0001d,
            "the argument must have marshalled in");
    }

    /**
     * Overloads are chosen by the arguments, not by name and count alone.
     *
     * Vector.multiply takes a Vector, an int, a double or a float and they
     * all return Vector, so nothing in the signature prefers one. Before the
     * arguments were considered this picked essentially at random.
     */
    @Test
    public void theOverloadIsChosenByTheArguments() throws Exception {
        Engine eng = engineWith("trusted", "Vector");
        AussomObject v = shim(eng, "Vector", new Vector(2.0d, 3.0d, 4.0d));
        Environment env = envOn(eng, v);
        astClass def = eng.getClassByName("Vector");

        AussomList byNumber = new AussomList();
        byNumber.add(new AussomInt(3L));
        AussomType scaled = def.call(env, false, "multiply", byNumber);
        assertTrue(scaled instanceof AussomObject, "expected a Vector back, got " + scaled);
        Vector got = (Vector) ((PaperObj) ((AussomObject) scaled).getExternObject()).getObj();
        assertEquals(6.0d, got.getX(), 0.0001d, "multiply by a number must scale");
    }

    /** Two shims wrapping the same object compare equal. */
    @Test
    public void equalityComparesTheWrappedObject() throws Exception {
        Engine eng = engineWith("trusted", "Vector");
        Vector shared = new Vector(1.0d, 2.0d, 3.0d);
        AussomObject a = shim(eng, "Vector", shared);
        AussomObject b = shim(eng, "Vector", shared);
        AussomObject other = shim(eng, "Vector", new Vector(9.0d, 9.0d, 9.0d));

        Environment env = envOn(eng, a);
        astClass def = eng.getClassByName("Vector");

        AussomList same = new AussomList();
        same.add(b);
        assertTrue(((AussomBool) def.call(env, false, "__opEq__", same)).getValue(),
            "two shims for the same object must compare equal");

        AussomList diff = new AussomList();
        diff.add(other);
        assertFalse(((AussomBool) def.call(env, false, "__opEq__", diff)).getValue(),
            "shims for different objects must not");
    }

    /** Java equality agrees with the operator, so list membership works. */
    @Test
    public void javaEqualityAgreesWithTheOperator() throws Exception {
        Engine eng = engineWith("trusted", "Vector");
        Vector shared = new Vector(4.0d, 5.0d, 6.0d);
        AussomObject a = shim(eng, "Vector", shared);
        AussomObject b = shim(eng, "Vector", shared);

        assertEquals(a.getExternObject(), b.getExternObject(),
            "AussomList compares with Java equals, so it must agree with __opEq__");
        assertEquals(a.getExternObject().hashCode(), b.getExternObject().hashCode());
    }

    /** Adventure Components marshal to and from plain strings. */
    @Test
    public void componentsMarshalAsStrings() throws Exception {
        Object asComponent = Marshal.coerce("hello there", Component.class);
        assertTrue(asComponent instanceof Component,
            "a string argument must become a Component");

        Engine eng = engineWith("trusted", "Vector");
        Environment env = new Environment(eng);
        env.setEnvironment(null, new Members(), new CallStack());
        AussomType back = Marshal.wrap(env, Component.text("hello there"));
        assertEquals("hello there", ((AussomString) back).getValue(),
            "a Component result must come back as plain text");
    }

    /** The tier is the module: untrusted declares less than trusted. */
    @Test
    public void tiersDifferByWhatTheModuleDeclares() throws Exception {
        String untrusted = module("untrusted", "Player");
        String trusted = module("trusted", "Player");

        assertTrue(untrusted.contains("getName"), "untrusted reads names");
        assertFalse(untrusted.contains("performCommand"),
            "untrusted must not be able to run commands as the player");
        assertFalse(untrusted.contains("setOp"), "untrusted must not confer op");
        assertTrue(trusted.length() > untrusted.length(),
            "trusted is a superset of untrusted");
    }

    /** Nothing at any tier below dangerous reaches the server or the disk. */
    @Test
    public void noTierBelowDangerousReachesTheServer() throws Exception {
        for (String tier : new String[] { "untrusted", "trusted" }) {
            String world = module(tier, "World");
            assertFalse(world.contains("getWorldFolder"),
                tier + " must not reach the world directory");
            assertFalse(world.contains("getWorldPath"),
                tier + " must not reach the world path");
            assertFalse(module(tier, "Player").contains("getServer"),
                tier + " must not reach the server");
        }
    }
}
