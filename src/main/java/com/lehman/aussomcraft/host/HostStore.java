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

package com.lehman.aussomcraft.host;

import java.util.ArrayList;
import java.util.Map;

import com.aussom.Environment;
import com.aussom.types.AussomBool;
import com.aussom.types.AussomException;
import com.aussom.types.AussomList;
import com.aussom.types.AussomNull;
import com.aussom.types.AussomString;
import com.aussom.types.AussomType;

import com.lehman.aussomcraft.AussomCraftPlugin;
import com.lehman.aussomcraft.script.ScriptContext;

/**
 * Backs the store extern.
 *
 * Bounded on purpose. The store is held in memory and written to disk, and
 * nothing else limits how much a script writes: a handler can stay well
 * inside its time budget while saving a little more on every call, forever.
 * A script cannot choose where the file goes, but without a cap it can
 * decide how big it gets.
 *
 * A map per script, keyed by file name rather than hash so a trust change or
 * an edit does not orphan the data. Plain types only: a callback or object
 * has no form that survives a restart, so storing one is refused rather than
 * silently dropped.
 *
 * @author Austin Lehman
 */
public class HostStore {

    /** Longest key a script may use. Long enough for a name or a UUID path. */
    private static final int MAX_KEY_CHARS = 256;

    /** Used when the plugin is not reachable, as in a unit test. */
    private static final long FALLBACK_MAX_BYTES = 1024L * 1024L;

    public HostStore() { }

    /** The per-script store limit, from config.yml. */
    private static long maxBytes() {
        AussomCraftPlugin plugin = Host.plugin();
        if (plugin == null) {
            return FALLBACK_MAX_BYTES;
        }
        return plugin.getStoreMaxBytes();
    }

    /**
     * Reads a value.
     *
     * @param env is the calling context.
     * @param args holds the key.
     * @return The stored AussomType, or null when the key is absent.
     */
    public AussomType get(Environment env, ArrayList<AussomType> args) {
        ScriptContext ctx = Host.context(env);
        if (ctx == null) {
            return new AussomException("store.get(): not running inside a loaded script.");
        }
        String key = Host.str(args, 0);
        if (key == null) {
            return new AussomException("store.get(): first argument must be a key string.");
        }
        return Host.toAussom(ctx.getStore().get(key));
    }

    /**
     * Writes a value.
     *
     * @param env is the calling context.
     * @param args holds the key and the value.
     * @return An AussomBool with true, or an AussomException.
     */
    public AussomType set(Environment env, ArrayList<AussomType> args) {
        ScriptContext ctx = Host.context(env);
        if (ctx == null) {
            return new AussomException("store.set(): not running inside a loaded script.");
        }
        String key = Host.str(args, 0);
        if (key == null) {
            return new AussomException("store.set(): first argument must be a key string.");
        }
        if (args.size() < 2) {
            return new AussomException("store.set(): a value is required.");
        }
        AussomType value = args.get(1);
        if (value.isNull()) {
            ctx.getStore().remove(key);
            ctx.markStoreDirty();
            return new AussomBool(true);
        }
        Object plain = Host.toJava(value);
        if (plain == null) {
            return new AussomException("store.set(): '" + key
                + "' cannot hold that type. Only strings, numbers, bools, lists and maps persist.");
        }

        if (key.length() > MAX_KEY_CHARS) {
            return new AussomException("store.set(): that key is longer than "
                + MAX_KEY_CHARS + " characters.");
        }

        // Measured before the store is touched, so a refused write changes
        // nothing. The old value stops counting because it is replaced.
        long was = Host.sizeOf(ctx.getStore().get(key));
        long now = Host.sizeOf(plain);
        long keyCost = 0L;
        if (!ctx.getStore().containsKey(key)) {
            keyCost = Host.sizeOf(key);
        }
        long after = ctx.getStoreBytes() - was + now + keyCost;
        long cap = maxBytes();
        if (after > cap) {
            return new AussomException("store.set(): this script's store is full."
                + " It holds about " + ctx.getStoreBytes() + " bytes and the limit is "
                + cap + ". Remove something, or raise store.max-bytes in config.yml.");
        }

        ctx.getStore().put(key, plain);
        ctx.addStoreBytes(now - was + keyCost);
        ctx.markStoreDirty();
        return new AussomBool(true);
    }

    /**
     * Removes a key.
     *
     * @param env is the calling context.
     * @param args holds the key.
     * @return An AussomBool with true when the key was there.
     */
    public AussomType remove(Environment env, ArrayList<AussomType> args) {
        ScriptContext ctx = Host.context(env);
        if (ctx == null) {
            return new AussomException("store.remove(): not running inside a loaded script.");
        }
        String key = Host.str(args, 0);
        if (key == null) {
            return new AussomException("store.remove(): first argument must be a key string.");
        }
        Object gone = ctx.getStore().remove(key);
        boolean had = gone != null;
        if (had) {
            ctx.addStoreBytes(-(Host.sizeOf(gone) + Host.sizeOf(key)));
            ctx.markStoreDirty();
        }
        return new AussomBool(had);
    }

    /**
     * Every key currently stored.
     *
     * @param env is the calling context.
     * @param args is unused.
     * @return An AussomList of key strings.
     */
    public AussomType keys(Environment env, ArrayList<AussomType> args) {
        ScriptContext ctx = Host.context(env);
        if (ctx == null) {
            return new AussomException("store.keys(): not running inside a loaded script.");
        }
        AussomList out = new AussomList();
        for (Map.Entry<String, Object> e : ctx.getStore().entrySet()) {
            out.add(new AussomString(e.getKey()));
        }
        return out;
    }

    /**
     * Whether a key is present.
     *
     * @param env is the calling context.
     * @param args holds the key.
     * @return An AussomBool.
     */
    public AussomType has(Environment env, ArrayList<AussomType> args) {
        ScriptContext ctx = Host.context(env);
        if (ctx == null) {
            return new AussomException("store.has(): not running inside a loaded script.");
        }
        String key = Host.str(args, 0);
        if (key == null) {
            return new AussomNull();
        }
        return new AussomBool(ctx.getStore().containsKey(key));
    }
}
