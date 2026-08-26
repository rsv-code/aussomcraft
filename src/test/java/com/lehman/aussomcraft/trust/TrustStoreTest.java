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

package com.lehman.aussomcraft.trust;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import com.lehman.aussomcraft.profile.Profile;

/**
 * The three properties hash keying buys: moving or renaming a script does
 * not change what it may do, editing one revokes its grant, and a grant
 * cannot transfer to different content.
 */
public class TrustStoreTest {

    @TempDir
    Path tmp;

    private Path write(String name, String content) throws IOException {
        Path p = this.tmp.resolve(name);
        Files.write(p, content.getBytes(StandardCharsets.UTF_8));
        return p;
    }

    private TrustStore store() throws IOException {
        TrustStore ts = new TrustStore(this.tmp.resolve("trust.yml").toFile());
        ts.load();
        return ts;
    }

    /** Nothing granted means everything is untrusted. Not an error, the default. */
    @Test
    public void anEmptyStoreGrantsNothing() throws Exception {
        assertEquals(Profile.UNTRUSTED, store().profileFor("whatever"));
    }

    /** A missing file is an empty store rather than a failure. */
    @Test
    public void aMissingFileIsAnEmptyStore() throws Exception {
        TrustStore ts = new TrustStore(new File(this.tmp.toFile(), "absent.yml"));
        ts.load();
        assertTrue(ts.hashes().isEmpty());
        assertEquals(Profile.UNTRUSTED, ts.profileFor("anything"));
    }

    @Test
    public void aGrantSurvivesASaveAndReload() throws Exception {
        Path script = write("rules.aus", "class Main { public main() { return 0; } }");
        String hash = TrustStore.hashOf(script);

        TrustStore ts = store();
        ts.grant(hash, Profile.TRUSTED, "rules.aus", "console");
        ts.save();

        TrustStore reloaded = store();
        assertEquals(Profile.TRUSTED, reloaded.profileFor(hash));
    }

    /**
     * The property that makes path-based trust unnecessary: what a script
     * may do travels with its bytes, not its name.
     */
    @Test
    public void renamingAScriptDoesNotChangeItsGrant() throws Exception {
        String body = "class Main { public main() { return 0; } }";
        Path original = write("rules.aus", body);
        String hash = TrustStore.hashOf(original);

        TrustStore ts = store();
        ts.grant(hash, Profile.TRUSTED, "rules.aus", "console");

        Path renamed = write("something-else.aus", body);
        assertEquals(hash, TrustStore.hashOf(renamed));
        assertEquals(Profile.TRUSTED, ts.profileFor(TrustStore.hashOf(renamed)));
    }

    /**
     * The property that makes a grant safe to give: editing the file
     * revokes it, with nothing to remember to do.
     */
    @Test
    public void editingAScriptRevokesItsGrant() throws Exception {
        Path script = write("rules.aus", "class Main { public main() { return 0; } }");
        String granted = TrustStore.hashOf(script);

        TrustStore ts = store();
        ts.grant(granted, Profile.TRUSTED, "rules.aus", "console");
        assertEquals(Profile.TRUSTED, ts.profileFor(granted));

        Files.write(script,
            "class Main { public main() { return 1; } }".getBytes(StandardCharsets.UTF_8));
        String edited = TrustStore.hashOf(script);

        assertNotEquals(granted, edited);
        assertEquals(Profile.UNTRUSTED, ts.profileFor(edited),
            "an edited script must fall back to untrusted");
    }

    @Test
    public void revokeRemovesAGrant() throws Exception {
        String hash = TrustStore.hashOf("x".getBytes(StandardCharsets.UTF_8));
        TrustStore ts = store();
        ts.grant(hash, Profile.TRUSTED, "x.aus", "console");
        assertTrue(ts.revoke(hash));
        assertEquals(Profile.UNTRUSTED, ts.profileFor(hash));
        assertFalse(ts.revoke(hash), "revoking twice reports nothing was there");
    }

    /**
     * The audit fields are written, and are never what decides a profile.
     * A grant whose recorded name no longer matches still applies, because
     * the name was never consulted.
     */
    @Test
    public void auditFieldsAreRecordedButNeverConsulted() throws Exception {
        String hash = TrustStore.hashOf("x".getBytes(StandardCharsets.UTF_8));
        TrustStore ts = store();
        ts.grant(hash, Profile.TRUSTED, "original-name.aus", "austin");
        ts.save();

        TrustStore reloaded = store();
        assertEquals("original-name.aus", reloaded.scriptNameFor(hash));
        assertEquals(Profile.TRUSTED, reloaded.profileFor(hash));
    }

    /** An unreadable profile name in the file falls back to untrusted. */
    @Test
    public void anUnknownProfileNameFallsBackToUntrusted() throws Exception {
        Files.write(this.tmp.resolve("trust.yml"),
            ("grants:\n  abc123:\n    profile: superuser\n").getBytes(StandardCharsets.UTF_8));
        assertEquals(Profile.UNTRUSTED, store().profileFor("abc123"));
    }

    @Test
    public void hashIsSha256Hex() {
        String h = TrustStore.hashOf("abc".getBytes(StandardCharsets.UTF_8));
        assertEquals("ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad", h);
        assertEquals("ba7816bf8f01", TrustStore.shortHash(h));
    }
}
