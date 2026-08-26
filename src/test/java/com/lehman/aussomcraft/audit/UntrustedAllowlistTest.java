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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * The untrusted tier is a list somebody approved, not a rule.
 *
 * Rules match on name shape and type. Capability is what matters, and a name
 * does not carry it: `getSeed`, `sendRichMessage`, `chat` and `getMessage`
 * all read like ordinary getters and senders, and every one was a finding. A
 * rule cannot catch that. A list can, because adding to it is a decision
 * somebody makes.
 *
 * This checks the generated tier against that list, so the two cannot drift.
 */
public class UntrustedAllowlistTest {

    private static final Path ALLOWLIST =
        Paths.get("src", "gen", "resources", "untrusted-allowlist.txt");

    private static final Path UNTRUSTED = Paths.get("src", "main", "resources",
        "com", "lehman", "aussomcraft", "aus", "paper", "untrusted");

    /** The Paper class a generated module shims, read from its header. */
    private static String shimType(Path Module) throws IOException {
        String src = new String(Files.readAllBytes(Module), StandardCharsets.UTF_8);
        Matcher m = Pattern.compile("Generated shim for ([\\w.]+)\\.").matcher(src);
        assertTrue(m.find(), "no shim header in " + Module.getFileName());
        return m.group(1);
    }

    private static Set<String> allowed() throws IOException {
        Set<String> out = new HashSet<String>();
        for (String line : Files.readAllLines(ALLOWLIST, StandardCharsets.UTF_8)) {
            String t = line.trim();
            if (!t.isEmpty() && !t.startsWith("#")) {
                out.add(t);
            }
        }
        return out;
    }

    /** The list has to be there and populated, or the tier is empty. */
    @Test
    public void theAllowlistExistsAndIsPopulated() throws IOException {
        assertTrue(Files.exists(ALLOWLIST), "the untrusted allowlist must exist");
        Set<String> names = allowed();
        assertTrue(names.size() > 120,
            "the allowlist looks truncated, holds " + names.size());
        // The upper bound is the point of the list. It was 619 bare names and
        // produced finding after finding. It is 185 now, one line per method
        // per type, and meant to stay small enough to read. Growing it is a
        // decision, and this is where that decision gets noticed.
        assertTrue(names.size() < 300,
            "the untrusted allowlist has grown to " + names.size() + " entries."
            + " If that is deliberate, raise this bound and say why in the"
            + " file's header.");
        assertTrue(names.contains("org.bukkit.entity.Player.getName"),
            "ordinary readers should be on it");
        assertTrue(names.contains("org.bukkit.entity.Player.sendMessage"),
            "messaging should be on it");
    }

    /**
     * Every entry names a class, which is the whole point of the format.
     *
     * A bare name would never match anything and would fail closed so
     * quietly that the only symptom is a method missing from the tier.
     */
    @Test
    public void everyEntryNamesAClass() throws IOException {
        for (String entry : allowed()) {
            assertTrue(entry.indexOf('.') > 0,
                "'" + entry + "' names no class. Entries are"
                + " 'fully.qualified.Type.method'.");
            assertTrue(entry.startsWith("org.bukkit.") || entry.startsWith("io.papermc."),
                "'" + entry + "' does not name a Paper class.");
        }
    }

    /**
     * The list grants nothing on a type the tier does not have.
     *
     * The type gate and the allowlist are separate, so an entry for a class
     * that is not on the tier is dead text. Dead text in a security file
     * reads like a granted capability to whoever audits it next.
     */
    @Test
    public void everyEntryNamesATypeTheTierHas() throws IOException {
        Set<String> types = new HashSet<String>();
        try (DirectoryStream<Path> dir = Files.newDirectoryStream(UNTRUSTED, "*.aus")) {
            for (Path f : dir) {
                types.add(shimType(f));
            }
        }
        for (String entry : allowed()) {
            String owner = entry.substring(0, entry.lastIndexOf('.'));
            assertTrue(types.contains(owner),
                "the allowlist names '" + entry + "' but '" + owner
                + "' is not a type on the untrusted tier, so the line grants"
                + " nothing and should go.");
        }
    }

    /** Nothing untrusted was granted that the list does not name. */
    @Test
    public void everyUntrustedMethodIsOnTheAllowlist() throws IOException {
        Set<String> names = allowed();
        Pattern decl = Pattern.compile("public\\s+extern\\s+(\\w+)\\s*\\(");
        List<String> unlisted = new ArrayList<String>();
        int seen = 0;

        try (DirectoryStream<Path> dir = Files.newDirectoryStream(UNTRUSTED, "*.aus")) {
            for (Path f : dir) {
                String src = new String(Files.readAllBytes(f), StandardCharsets.UTF_8);
                String owner = shimType(f);
                Matcher m = decl.matcher(src);
                while (m.find()) {
                    String name = m.group(1);
                    seen++;
                    if (name.equals("__opEq__") || name.equals("toString")) {
                        continue;
                    }
                    // Overload renaming appends a suffix to Paper's name, and
                    // the allowlist holds Paper's.
                    String base = name;
                    int cut = base.indexOf('_');
                    if (cut > 0) {
                        base = base.substring(0, cut);
                    }
                    if (!names.contains(owner + "." + name)
                            && !names.contains(owner + "." + base)) {
                        unlisted.add(owner + "." + name);
                    }
                }
            }
        }
        assertTrue(seen > 150, "the untrusted tier should have been read, saw " + seen);
        assertTrue(unlisted.isEmpty(),
            "untrusted granted methods that nobody put on the allowlist: " + unlisted);
    }

    /** The things that were findings must not be back on the list. */
    @Test
    public void thePastFindingsAreNotOnTheAllowlist() throws IOException {
        Set<String> names = allowed();
        for (String gone : new String[] {
            "sendRichMessage", "chat", "performCommand", "setCommand",
            "getBuffer", "getCommandLine", "getHostname", "getSeed" }) {
            for (String entry : names) {
                // Matched on the method half, so the check holds however many
                // types the tier grows to carry.
                //
                // getMessage is deliberately not in this list. It is a leak on
                // PlayerCommandPreprocessEvent and ordinary public chat on the
                // chat events, which is the whole reason the file names types.
                // everyEntryNamesATypeTheTierHas is what refuses the bad one.
                assertFalse(entry.endsWith("." + gone),
                    entry + " was removed from untrusted for a reason and must"
                    + " not be back on the allowlist.");
            }
        }
    }
}
