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
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Files;

import com.aussom.Engine;
import com.aussom.SecurityManagerImpl;

/**
 * The two interpreter constraints the generator's shape depends on.
 *
 * Aussom permits only one external class in an inheritance chain. So the
 * generated Java shims mirror Paper's hierarchy, where inheritance costs
 * nothing, while each Aussom class declares its inherited methods over again.
 * Getting this backwards turns 12,000 Paper methods into 84,000 generated
 * ones.
 */
public class ShimInheritanceIT {

    /**
     * An engine that reaches a probe module the way a script reaches a
     * sibling: written to a directory the engine has on its include path,
     * and resolved by the engine rather than handed to it.
     */
    private Engine engineWith(String module) throws Exception {
        Path dir = Files.createTempDirectory("probe");
        Files.write(dir.resolve("probe.aus"), module.getBytes(StandardCharsets.UTF_8));
        Engine eng = new Engine(new SecurityManagerImpl());
        eng.addIncludePath(dir.toString());
        eng.addInclude("probe.aus");
        return eng;
    }

    /** An extern class cannot extend another extern class. */
    @Test
    public void twoExternClassesInAChainAreRefused() throws Exception {
        Engine eng = engineWith(
            "extern class BaseProbe : com.lehman.aussomcraft.paper.BaseProbeShim {\n"
          + "    public extern alpha();\n}\n"
          + "extern class DerivedProbe : com.lehman.aussomcraft.paper.DerivedProbeShim, BaseProbe {\n}\n");
        eng.parseString("t.aus",
            "class Main { public main() { d = new DerivedProbe(); return 0; } }\n");
        assertFalse(eng.hasParseErrors());
        assertEquals(1, eng.run(), "chaining two extern classes must fail");
    }

    /**
     * The Java shim may inherit, and the Aussom binding still resolves the
     * inherited method. This is what keeps the Java side free of duplication.
     */
    @Test
    public void anExternBindingResolvesAnInheritedJavaMethod() throws Exception {
        Engine eng = engineWith(
            "extern class DerivedProbe : com.lehman.aussomcraft.paper.DerivedProbeShim {\n"
          + "    public extern alpha();\n}\n");
        eng.parseString("t.aus",
            "class Main { public main() {\n"
          + "  d = new DerivedProbe();\n"
          + "  if (d.alpha() != \"alpha\") { return 2; }\n"
          + "  return 0;\n} }\n");
        assertFalse(eng.hasParseErrors());
        assertEquals(0, eng.run(),
            "a shim must be able to bind a method its Java parent declares");
    }

    /** A plain Aussom class may extend an extern one and inherits its methods. */
    @Test
    public void aPlainClassMayExtendAnExternClass() throws Exception {
        Engine eng = engineWith(
            "extern class BaseProbe : com.lehman.aussomcraft.paper.BaseProbeShim {\n"
          + "    public extern alpha();\n}\n"
          + "class Sub : BaseProbe {\n    public gamma() { return \"gamma\"; }\n}\n");
        eng.parseString("t.aus",
            "class Main { public main() {\n"
          + "  s = new Sub();\n"
          + "  if (s.alpha() != \"alpha\") { return 2; }\n"
          + "  if (s.gamma() != \"gamma\") { return 3; }\n"
          + "  return 0;\n} }\n");
        assertFalse(eng.hasParseErrors());
        assertEquals(0, eng.run());
    }

    /** A nested Java class cannot be named: '$' is illegal in Aussom source. */
    @Test
    public void nestedJavaClassNamesCannotBeBound() throws Exception {
        Engine eng = engineWith(
            "extern class Nope : com.lehman.aussomcraft.paper.Outer$Inner {\n}\n");
        assertTrue(eng.hasParseErrors(),
            "the generator must never emit a nested class name");
    }
}
