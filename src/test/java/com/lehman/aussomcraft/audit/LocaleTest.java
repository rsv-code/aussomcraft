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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.junit.jupiter.api.Test;

import com.lehman.aussomcraft.profile.Profile;

/**
 * Case conversion has to say which locale it means.
 *
 * Bukkit normalises a command label with Locale.ROOT. Under a Turkish
 * default locale the bare toLowerCase turns "LOGIN" into "logın", with a
 * dotless i, so a protected name would be missed here and then normalised
 * back to "login" by Bukkit, handing a script the command that check exists
 * to refuse.
 *
 * The same applies to the generator: a build machine's locale must not
 * change the API it produces.
 */
public class LocaleTest {

    /** The character that makes this a real problem rather than a tidy-up. */
    @Test
    public void turkishLowercasingReallyDiffers() {
        assertNotEquals("login", "LOGIN".toLowerCase(new Locale("tr")),
            "if this ever stops being true the rest of this class is moot");
        assertEquals("login", "LOGIN".toLowerCase(Locale.ROOT));
    }

    /** A protected name is refused however it is typed, in any locale. */
    @Test
    public void protectedNamesMatchWhateverTheDefaultLocale() {
        Locale was = Locale.getDefault();
        try {
            Locale.setDefault(new Locale("tr"));
            // Profile ids go through the same conversion.
            assertEquals(Profile.TRUSTED, Profile.byId("TRUSTED"),
                "a profile id must resolve under a Turkish default locale");
            assertEquals(Profile.DANGEROUS, Profile.byId("Dangerous"));
        } finally {
            Locale.setDefault(was);
        }
    }

    /**
     * No bare case conversion anywhere in the hand written code.
     *
     * A grep rather than a behaviour test, because the next one of these
     * will be written somewhere this class does not reach.
     */
    @Test
    public void noBareCaseConversionInHandWrittenCode() throws IOException {
        List<String> bare = new ArrayList<String>();
        for (Path root : new Path[] {
                Paths.get("src", "main", "java"), Paths.get("src", "gen", "java") }) {
            scan(root, bare);
        }
        assertTrue(bare.isEmpty(),
            "case conversion must name its locale, or a Turkish default server"
            + " sees different strings than Bukkit does: " + bare);
    }

    private static void scan(Path Dir, List<String> Out) throws IOException {
        try (DirectoryStream<Path> d = Files.newDirectoryStream(Dir)) {
            for (Path p : d) {
                if (Files.isDirectory(p)) {
                    // The generated tree is written by the generator, which
                    // this class already covers at its source.
                    if (p.getFileName().toString().equals("gen")
                            && p.getParent().getFileName().toString().equals("paper")) {
                        continue;
                    }
                    scan(p, Out);
                } else if (p.getFileName().toString().endsWith(".java")) {
                    String s = new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
                    if (s.contains("toLowerCase()") || s.contains("toUpperCase()")) {
                        Out.add(p.toString());
                    }
                }
            }
        }
    }
}
