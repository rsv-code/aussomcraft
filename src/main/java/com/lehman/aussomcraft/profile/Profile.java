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

package com.lehman.aussomcraft.profile;

import java.util.Locale;

import com.aussom.SecurityManagerInt;

/**
 * The capability profiles a script can run under.
 *
 * A profile is a set of security manager property values and nothing else.
 * Untrusted is the default for every script and cannot be opted out of.
 * Trusted is granted per script by an operator, against a hash of the
 * script's bytes. See design/aussomcraft-design-1.md sections 4 and 5.
 *
 * @author Austin Lehman
 */
public enum Profile {

    /** The curated safe subset. Reads state and sends messages. */
    UNTRUSTED("untrusted"),

    /** The full Paper API, less anything that leaves the game world. */
    TRUSTED("trusted"),

    /** The harmful parts as well, plus AJI. Can take over the server. */
    DANGEROUS("dangerous");

    /** The name used in the trust file and on the command line. */
    private final String id;

    Profile(String Id) {
        this.id = Id;
    }

    /** @return the name used in the trust file and on the command line. */
    public String getId() {
        return this.id;
    }

    /**
     * Looks up a profile by its id.
     *
     * @param Id is the id to look for, case insensitive.
     * @return The Profile, or null when the id matches none.
     */
    public static Profile byId(String Id) {
        if (Id == null) {
            return null;
        }
        String want = Id.trim().toLowerCase(Locale.ROOT);
        for (Profile p : values()) {
            if (p.id.equals(want)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Builds a fresh security manager for this profile. A new instance every
     * time: the engine keeps a reference, so a shared one would let a change
     * meant for a single engine reach all of them.
     *
     * @param Loader is the class loader the engine resolves extern classes
     * through.
     * @return A SecurityManagerInt carrying this profile's policy.
     */
    public SecurityManagerInt newPolicy(ClassLoader Loader) {
        return new ScriptPolicy(Loader, this);
    }
}
