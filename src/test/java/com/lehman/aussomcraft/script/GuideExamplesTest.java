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
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.aussom.Engine;
import com.aussom.LoggingInt;

import com.lehman.aussomcraft.paper.PaperModules;
import com.lehman.aussomcraft.profile.Profile;

/**
 * Every complete script in the user guide must parse and run.
 *
 * Documentation that does not compile is worse than none, and the guide is
 * aimed at people who cannot tell a typo in an example from a mistake of
 * their own. Each fenced block that declares a Main class is pulled out of
 * the Markdown and run.
 *
 * Everything runs at the dangerous tier, which has the whole API, because
 * the point here is that the calls exist and the syntax is right. Which tier
 * an example needs is a separate claim the guide makes in prose.
 */
public class GuideExamplesTest {

    private static final ClassLoader LOADER = GuideExamplesTest.class.getClassLoader();

    /** One example, with where it came from so a failure is findable. */
    public static class Example {
        final String where;
        final String source;
        Example(String Where, String Source) {
            this.where = Where;
            this.source = Source;
        }
        @Override public String toString() {
            return this.where;
        }
    }

    static Stream<Example> examples() throws Exception {
        List<Example> out = new ArrayList<Example>();
        Path guide = Paths.get("docs", "guide");
        if (!Files.isDirectory(guide)) {
            return out.stream();
        }
        List<Path> pages = new ArrayList<Path>();
        try (Stream<Path> s = Files.list(guide)) {
            s.filter(p -> p.getFileName().toString().endsWith(".md")).forEach(pages::add);
        }
        java.util.Collections.sort(pages);

        for (Path page : pages) {
            String text = new String(Files.readAllBytes(page), StandardCharsets.UTF_8);
            String[] parts = text.split("```");
            // Odd indexes are the fenced blocks.
            for (int i = 1; i < parts.length; i += 2) {
                String block = parts[i];
                if (block.startsWith("yaml") || !block.contains("class Main")) {
                    continue;
                }
                // The guide also shows fragments, taking a script apart a
                // line at a time. Those are not scripts and must not be run.
                if (!balanced(block)) {
                    continue;
                }
                out.add(new Example(page.getFileName() + " block " + ((i + 1) / 2), block));
            }
        }
        return out.stream();
    }

    /** Whether a block is a whole script rather than a fragment of one. */
    private static boolean balanced(String Block) {
        int depth = 0;
        for (char ch : Block.toCharArray()) {
            if (ch == '{') { depth++; }
            if (ch == '}') { depth--; }
        }
        return depth == 0 && Block.indexOf('}') > 0;
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("examples")
    public void guideExampleParsesAndRuns(Example ex) throws Exception {
        Engine eng = new Engine(Profile.DANGEROUS.newPolicy(LOADER));
        eng.addModule("craft.aus", resource("/com/lehman/aussomcraft/aus/craft.aus"));
        eng.addModule("aji.aus", resource("/com/lehman/aussomcraft/aus/aji.aus"));
        PaperModules.install(eng, Profile.DANGEROUS.getId());
        eng.addInclude("craft.aus");

        eng.parseString(ex.where, ex.source);
        assertFalse(eng.hasParseErrors(),
            ex.where + " does not parse:\n" + eng.getParseDiagnostics() + "\n" + ex.source);

        Capture log = new Capture();
        eng.setLogger(log);
        try {
            eng.run();
        } catch (Exception expected) {
            // Reaching a host extern without a server fails, which is fine.
        }
        assertFalse(log.text().contains("FUNCT_NOT_FOUND"),
            ex.where + " calls something that does not exist:\n" + log.text()
            + "\n" + ex.source);
        assertFalse(log.text().contains("NO_MEMBER_FOUND"),
            ex.where + " reads something that does not exist:\n" + log.text()
            + "\n" + ex.source);
    }

    private static String resource(String name) throws Exception {
        try (InputStream in = GuideExamplesTest.class.getResourceAsStream(name)) {
            assertNotNull(in, "missing module " + name);
            return new String(in.readAllBytes(), StandardCharsets.UTF_8);
        }
    }

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
