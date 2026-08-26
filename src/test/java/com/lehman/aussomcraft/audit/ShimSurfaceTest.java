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

package com.lehman.aussomcraft.audit;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * A shim's Java surface is the real attack surface, so it has to match its
 * module exactly.
 *
 * A script may bind its own tier's shim class, which the allowlist permits
 * because the generated modules do it. So any method the Java class carries
 * is a method a script can declare, whether or not the module mentions it.
 * A Java class holding more than its module declares would be granting
 * something nobody wrote down.
 */
public class ShimSurfaceTest {

    @Test
    public void everyShimsJavaSurfaceMatchesItsModule() throws Exception {
        List<String> problems = new ArrayList<String>();
        Pattern decl = Pattern.compile("public\\s+extern\\s+(\\w+)\\s*\\(");
        String[] tiers = { "untrusted", "trusted", "dangerous" };
        for (String tier : tiers) {
            Path aus = Paths.get("src/main/resources/com/lehman/aussomcraft/aus/paper", tier);
            int classes = 0, extraJava = 0, missingJava = 0, statics = 0;
            List<String> examplesExtra = new ArrayList<String>();
            List<String> examplesStatic = new ArrayList<String>();
            for (File f : aus.toFile().listFiles()) {
                if (!f.getName().endsWith(".aus")) continue;
                String type = f.getName().substring(0, f.getName().length() - 4);
                String src = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);
                Set<String> declared = new HashSet<String>();
                Matcher m = decl.matcher(src);
                while (m.find()) declared.add(m.group(1));

                Class<?> shim;
                try {
                    shim = Class.forName("com.lehman.aussomcraft.paper.gen." + tier
                        + "." + type + "Shim", false, ShimSurfaceTest.class.getClassLoader());
                } catch (Throwable notThere) { continue; }
                classes++;

                Set<String> javaNames = new HashSet<String>();
                for (Method jm : shim.getDeclaredMethods()) {
                    if (!Modifier.isPublic(jm.getModifiers())) continue;
                    javaNames.add(jm.getName());
                    if (Modifier.isStatic(jm.getModifiers())) statics++;
                }
                for (String jn : javaNames) {
                    if (!declared.contains(jn)) {
                        extraJava++;
                        problems.add(tier + "/" + type + "Shim has Java method " + jn
                            + " that its module does not declare");
                    }
                }
                for (String dn : declared) {
                    if (dn.equals("__opEq__") || dn.equals("toString")) continue;
                    if (!javaNames.contains(dn)) {
                        missingJava++;
                        problems.add(tier + "/" + type + ".aus declares " + dn
                            + " which the Java shim does not have");
                    }
                }
            }
            System.out.println("SURFACE " + tier + ": " + classes + " classes, "
                + extraJava + " java methods not declared in the module, "
                + missingJava + " declared but absent from java, "
                + statics + " static java methods");
            assertTrue(classes > 0, "no shim classes found for tier " + tier);
        }
        assertTrue(problems.isEmpty(),
            "the Java surface and the module must agree exactly: " + problems);
    }
}
