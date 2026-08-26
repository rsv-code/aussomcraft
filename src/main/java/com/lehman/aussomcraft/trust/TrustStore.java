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

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

import com.lehman.aussomcraft.profile.Profile;

/**
 * Which exact scripts an operator has elevated.
 *
 * A grant is keyed on the SHA-256 of a script's bytes, never its path or
 * name. So moving or renaming a script does not change what it may do,
 * editing one silently revokes its grant, and a grant cannot be transferred
 * to different content.
 *
 * The name, operator and timestamp are written for audit and never read back
 * when deciding a profile.
 *
 * @author Austin Lehman
 */
public class TrustStore {

    /** Key under which grants live in the file. */
    private static final String GRANTS = "grants";

    /** Where the grants are written. */
    private final File file;

    /** The grants, as loaded. */
    private YamlConfiguration config = new YamlConfiguration();

    /**
     * Builds a store over the provided file. The file need not exist yet.
     *
     * @param GrantFile is where grants are read from and written to.
     */
    public TrustStore(File GrantFile) {
        this.file = GrantFile;
    }

    /**
     * Reads the grants from disk. A missing file is an empty store, which
     * means everything loads untrusted.
     *
     * @throws IOException when the file exists but cannot be read.
     */
    public void load() throws IOException {
        if (!this.file.exists()) {
            this.config = new YamlConfiguration();
            return;
        }
        try {
            this.config = YamlConfiguration.loadConfiguration(this.file);
        } catch (Exception e) {
            throw new IOException("Could not read trust file '"
                + this.file.getAbsolutePath() + "': " + e.getMessage(), e);
        }
    }

    /**
     * Writes the grants to disk.
     *
     * @throws IOException on write failure.
     */
    public void save() throws IOException {
        File parent = this.file.getParentFile();
        if (parent != null && !parent.exists()) {
            parent.mkdirs();
        }
        this.config.save(this.file);
    }

    /**
     * The profile a script's bytes have been granted.
     *
     * @param Hash is the SHA-256 of the script's bytes.
     * @return The granted Profile, or Profile.UNTRUSTED when there
     *         is no matching grant. Never null: no match is not an error,
     *         it is the default answer.
     */
    public Profile profileFor(String Hash) {
        if (Hash == null) {
            return Profile.UNTRUSTED;
        }
        ConfigurationSection grants = this.config.getConfigurationSection(GRANTS);
        if (grants == null) {
            return Profile.UNTRUSTED;
        }
        ConfigurationSection grant = grants.getConfigurationSection(Hash);
        if (grant == null) {
            return Profile.UNTRUSTED;
        }
        Profile p = Profile.byId(grant.getString("profile"));
        if (p == null) {
            return Profile.UNTRUSTED;
        }
        return p;
    }

    /**
     * Records a grant against a script's bytes.
     *
     * @param Hash is the SHA-256 of the bytes being approved.
     * @param Granted is the profile being granted.
     * @param ScriptName is the file name at grant time, for audit only.
     * @param Operator is who granted it, for audit only.
     */
    public void grant(String Hash, Profile Granted, String ScriptName,
            String Operator) {
        ConfigurationSection grants = this.config.getConfigurationSection(GRANTS);
        if (grants == null) {
            grants = this.config.createSection(GRANTS);
        }
        ConfigurationSection grant = grants.createSection(Hash);
        grant.set("profile", Granted.getId());
        grant.set("script", ScriptName);
        grant.set("operator", Operator);
        grant.set("granted", Instant.now().toString());
    }

    /**
     * Removes a grant.
     *
     * @param Hash is the SHA-256 whose grant should go.
     * @return A boolean with true when a grant was there to remove.
     */
    public boolean revoke(String Hash) {
        ConfigurationSection grants = this.config.getConfigurationSection(GRANTS);
        if (grants == null || !grants.contains(Hash)) {
            return false;
        }
        grants.set(Hash, null);
        return true;
    }

    /**
     * Every hash currently granted something other than untrusted.
     *
     * @return A List of SHA-256 strings.
     */
    public List<String> hashes() {
        List<String> out = new ArrayList<String>();
        ConfigurationSection grants = this.config.getConfigurationSection(GRANTS);
        if (grants != null) {
            out.addAll(grants.getKeys(false));
        }
        return out;
    }

    /**
     * The file name recorded when a hash was granted. Audit only; never
     * consulted when deciding a profile.
     *
     * @param Hash is the SHA-256 to look up.
     * @return A String with the recorded name, or null.
     */
    public String scriptNameFor(String Hash) {
        ConfigurationSection grants = this.config.getConfigurationSection(GRANTS);
        if (grants == null) {
            return null;
        }
        ConfigurationSection grant = grants.getConfigurationSection(Hash);
        if (grant == null) {
            return null;
        }
        return grant.getString("script");
    }

    /**
     * SHA-256 of a file's bytes, as lower case hex.
     *
     * @param ScriptPath is the file to hash.
     * @return A String with 64 hex characters.
     * @throws IOException when the file cannot be read.
     */
    public static String hashOf(Path ScriptPath) throws IOException {
        return hashOf(Files.readAllBytes(ScriptPath));
    }

    /**
     * SHA-256 of the provided bytes, as lower case hex.
     *
     * @param Bytes is the content to hash.
     * @return A String with 64 hex characters.
     */
    public static String hashOf(byte[] Bytes) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            // Every JVM ships SHA-256. If this one does not, failing loudly
            // is right: silently falling back would mean grants keyed on
            // something weaker than what the operator was told.
            throw new IllegalStateException("SHA-256 is not available", e);
        }
        byte[] digest = md.digest(Bytes);
        StringBuilder sb = new StringBuilder(digest.length * 2);
        for (byte b : digest) {
            sb.append(Character.forDigit((b >> 4) & 0xf, 16));
            sb.append(Character.forDigit(b & 0xf, 16));
        }
        return sb.toString();
    }

    /**
     * The short form of a hash used in log lines, so an operator can match
     * a log message to a grant without copying 64 characters.
     *
     * @param Hash is the full hash.
     * @return A String with the first 12 characters.
     */
    public static String shortHash(String Hash) {
        if (Hash == null || Hash.length() <= 12) {
            return String.valueOf(Hash);
        }
        return Hash.substring(0, 12);
    }

    /**
     * Reads a script file as text.
     *
     * @param ScriptPath is the file to read.
     * @return A String with the file's content.
     * @throws IOException when the file cannot be read.
     */
    public static String readSource(Path ScriptPath) throws IOException {
        return new String(Files.readAllBytes(ScriptPath), StandardCharsets.UTF_8);
    }
}
