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

package com.lehman.aussomcraft.script;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.aussom.Engine;
import com.aussom.LoggingInt;

import com.lehman.aussomcraft.paper.PaperModules;
import com.lehman.aussomcraft.profile.Profile;

/**
 * Every shipped example must parse and get through main().
 *
 * Parsing alone is not enough. A script calling a host extern with the wrong
 * number of arguments parses fine and fails at run time with FUNCT_NOT_FOUND,
 * which is how a craft.aus signature can drift away from the examples without
 * anything here going red.
 *
 * Running is possible without a server because every extern checks for its
 * ScriptContext first and returns before touching Bukkit. So an extern here
 * reports EXTERN_RUNTIME, which is expected and ignored, while a signature
 * mismatch reports FUNCT_NOT_FOUND, which is not.
 */
public class ExampleScriptsIT {

    /** The loader a plain JUnit run has, which sees everything. */
    private static final ClassLoader LOADER = ExampleScriptsIT.class.getClassLoader();

    /** Where the examples live, relative to the module root. */
    private static final Path EXAMPLES = Paths.get("examples");

    /** Scripts that use AJI and so need the dangerous tier. */
    private static final List<String> NEEDS_DANGEROUS =
        List.of("06-trusted-worldinfo.aus", "demo-op.aus");

    static Stream<Path> examples() throws Exception {
        if (!Files.isDirectory(EXAMPLES)) {
            return Stream.empty();
        }
        List<Path> out = new ArrayList<Path>();
        try (Stream<Path> s = Files.list(EXAMPLES)) {
            s.filter(p -> p.getFileName().toString().endsWith(".aus")).forEach(out::add);
        }
        Collections.sort(out);
        return out.stream();
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("examples")
    public void exampleParsesAndRuns(Path script) throws Exception {
        Profile p = Profile.UNTRUSTED;
        if (NEEDS_DANGEROUS.contains(script.getFileName().toString())) {
            p = Profile.DANGEROUS;
        }

        // Built the way ScriptLoader builds one: every module reaches the
        // engine through an include path, so this exercises the same
        // resolution the server does.
        Engine eng = new Engine(p.newPolicy(LOADER));
        eng.addResourceIncludePath(IncludePaths.paperResource(p));
        eng.addResourceIncludePath(IncludePaths.hostResource());
        PaperModules.install(eng, p.getId());

        // ScriptLoader includes craft.aus for the script, so no example
        // writes 'include craft;' itself.
        eng.addInclude("craft.aus");
        if (p == Profile.DANGEROUS) {
            eng.addInclude("aji.aus");
        }

        String source = new String(Files.readAllBytes(script), StandardCharsets.UTF_8);
        eng.parseString(script.toString(), source);
        assertFalse(eng.hasParseErrors(),
            script.getFileName() + " has parse errors: " + eng.getParseDiagnostics());
        assertTrue(eng.containsClass("Main"),
            script.getFileName() + " must declare a Main class");

        Capture log = new Capture();
        eng.setLogger(log);
        try {
            eng.run();
        } catch (Exception expected) {
            // Reaching a host extern without a server fails; that is fine.
        }

        assertFalse(log.text().contains("FUNCT_NOT_FOUND"),
            script.getFileName() + " calls something that does not match a"
            + " declaration in craft.aus:\n" + log.text());
    }

    private static String resource(String name) throws Exception {
        try (InputStream in = ExampleScriptsIT.class.getResourceAsStream(name)) {
            assertNotNull(in, "missing bundled module " + name);
            return new String(in.readAllBytes(), StandardCharsets.UTF_8);
        }
    }

    /** Collects everything the engine writes, at every level. */
    private static class Capture implements LoggingInt {
        private final StringBuilder sb = new StringBuilder();
        String text() {
            return this.sb.toString();
        }
        private void add(String s) {
            this.sb.append(s).append('\n');
        }
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
