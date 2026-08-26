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
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * What the untrusted shims actually call.
 *
 * Read out of the generated Java rather than out of the rules, so it checks
 * the thing that ships rather than the thing that decided it. Every Paper
 * method an untrusted shim calls has to be one the rules classify as
 * untrusted for the type being shimmed.
 *
 * Calls go through the raw declaring type, because that is how generated
 * code survives generics, so the owner in the source is not the type the
 * decision was made about. The shimmed type comes from the file header.
 */
public class UntrustedCallsTest {

    /** The Paper type a generated shim file is for, read from its header. */
    private static String shimmedTypeOf(File F) throws Exception {
        String src = new String(Files.readAllBytes(F.toPath()), StandardCharsets.UTF_8);
        Matcher m = Pattern.compile("Generated shim for ([\\w.$]+)\\.").matcher(src);
        if (m.find()) {
            return m.group(1);
        }
        return null;
    }

    @Test
    public void untrustedShimsOnlyCallUntrustedMethods() throws Exception {
        Class<?> rules = Class.forName("com.lehman.aussomcraft.gen.Rules");
        Class<?> tierCls = Class.forName("com.lehman.aussomcraft.gen.Tier");
        Method tierOf = rules.getMethod("tierOf", Class.class, Method.class);

        // ((org.bukkit.entity.Player) self).getName(   or   org.bukkit.util.Vector.getRandom(
        Pattern call = Pattern.compile(
            "(?:\\(\\(([\\w.]+)\\) self\\)|(?<![\\w.])([a-z][\\w.]*\\.[A-Z][\\w.]*))\\.(\\w+)\\(");

        File dir = new File("src/main/java/com/lehman/aussomcraft/paper/gen/untrusted");
        int checked = 0;
        List<String> bad = new ArrayList<String>();
        Set<String> unresolved = new HashSet<String>();

        for (File f : dir.listFiles()) {
            if (!f.getName().endsWith(".java")) continue;
            String src = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);
            Matcher m = call.matcher(src);
            while (m.find()) {
                String owner = m.group(1);
                if (owner == null) owner = m.group(2);
                String method = m.group(3);
                if (owner == null || owner.startsWith("Marshal")) continue;
                // The call goes through the declaring type, because generated
                // code casts the receiver raw to survive generics. The tier
                // decision was made against the shimmed type, so that is what
                // has to be asked about here.
                String shimmed = shimmedTypeOf(f);
                if (shimmed == null) continue;
                Class<?> oc;
                try {
                    oc = Class.forName(shimmed, false, UntrustedCallsTest.class.getClassLoader());
                } catch (Throwable t) { unresolved.add(shimmed); continue; }
                checked++;
                boolean anyUntrusted = false;
                boolean anyAtAll = false;
                for (Method pm : oc.getMethods()) {
                    if (!pm.getName().equals(method)) continue;
                    anyAtAll = true;
                    Object t = tierOf.invoke(null, oc, pm);
                    if (t != null && String.valueOf(t).equals("UNTRUSTED")) anyUntrusted = true;
                }
                if (anyAtAll && !anyUntrusted) {
                    String s = f.getName() + " calls " + oc.getSimpleName() + "." + method;
                    if (!bad.contains(s)) bad.add(s);
                }
            }
        }
        assertTrue(checked > 150,
            "the untrusted shims should have been read, saw " + checked + " calls");
        assertTrue(unresolved.isEmpty(),
            "every call owner should resolve: " + unresolved);
        assertTrue(bad.isEmpty(),
            "an untrusted shim may only call methods the rules make untrusted: " + bad);
    }
}
