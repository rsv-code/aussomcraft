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
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import com.aussom.Engine;
import com.aussom.Environment;
import com.aussom.types.AussomBool;
import com.aussom.types.AussomDouble;
import com.aussom.types.AussomInt;
import com.aussom.types.AussomList;
import com.aussom.types.AussomMap;
import com.aussom.types.AussomNull;
import com.aussom.types.AussomString;
import com.aussom.types.AussomType;

import com.lehman.aussomcraft.AussomCraftPlugin;
import com.lehman.aussomcraft.script.ScriptContext;
import com.lehman.aussomcraft.script.ScriptEngineHost;

/**
 * What every host extern needs: the script it was called from, the plugin,
 * and conversion between Aussom and Java values.
 *
 * @author Austin Lehman
 */
public final class Host {

    /**
     * The plugin the externs call into. Static because an extern's only handle
     * on the world is its Environment, which reaches the engine but not the
     * plugin. One instance per server, set at enable, cleared at disable.
     */
    private static volatile AussomCraftPlugin plugin = null;

    private Host() { }

    /**
     * Binds the plugin the externs call into.
     *
     * @param Plugin is the plugin instance, or null to unbind at disable.
     */
    public static void setPlugin(AussomCraftPlugin Plugin) {
        plugin = Plugin;
    }

    /**
     * The plugin the externs call into.
     *
     * @return An AussomCraftPlugin, or null when the plugin is not enabled.
     */
    public static AussomCraftPlugin plugin() {
        return plugin;
    }

    /**
     * The script an extern was called from.
     *
     * @param env is the calling context.
     * @return A ScriptContext, or null when the engine is not one of ours.
     */
    public static ScriptContext context(Environment env) {
        if (env == null) {
            return null;
        }
        Engine eng = env.getEngine();
        if (eng instanceof ScriptEngineHost) {
            return ((ScriptEngineHost) eng).getContext();
        }
        return null;
    }

    /**
     * Converts an Aussom value to a plain Java value, for the store and for
     * passing to Bukkit.
     *
     * @param Value is the Aussom value.
     * @return An Object, or null for Aussom null.
     */
    public static Object toJava(AussomType Value) {
        if (Value == null || Value.isNull()) {
            return null;
        }
        if (Value instanceof AussomString) {
            return ((AussomString) Value).getValue();
        }
        if (Value instanceof AussomInt) {
            return Long.valueOf(((AussomInt) Value).getValue());
        }
        if (Value instanceof AussomDouble) {
            return Double.valueOf(((AussomDouble) Value).getValue());
        }
        if (Value instanceof AussomBool) {
            return Boolean.valueOf(((AussomBool) Value).getValue());
        }
        if (Value instanceof AussomList) {
            List<AussomType> items = ((AussomList) Value).getValue();
            List<Object> out = new ArrayList<Object>(items.size());
            for (AussomType item : items) {
                out.add(toJava(item));
            }
            return out;
        }
        if (Value instanceof AussomMap) {
            Map<String, Object> out = new ConcurrentHashMap<String, Object>();
            Map<String, AussomType> in = ((AussomMap) Value).getValue();
            for (Map.Entry<String, AussomType> e : in.entrySet()) {
                Object v = toJava(e.getValue());
                if (v != null) {
                    out.put(e.getKey(), v);
                }
            }
            return out;
        }
        // Anything else (an object, a callback) has no plain representation.
        // Refusing is better than storing something that will not come back.
        return null;
    }

    /**
     * Converts a plain Java value to an Aussom value.
     *
     * @param Value is the Java value.
     * @return An AussomType, never null.
     */
    @SuppressWarnings("unchecked")
    public static AussomType toAussom(Object Value) {
        if (Value == null) {
            return new AussomNull();
        }
        if (Value instanceof String) {
            return new AussomString((String) Value);
        }
        if (Value instanceof Integer) {
            return new AussomInt(((Integer) Value).longValue());
        }
        if (Value instanceof Long) {
            return new AussomInt(((Long) Value).longValue());
        }
        if (Value instanceof Double) {
            return new AussomDouble(((Double) Value).doubleValue());
        }
        if (Value instanceof Float) {
            return new AussomDouble(((Float) Value).doubleValue());
        }
        if (Value instanceof Boolean) {
            return new AussomBool(((Boolean) Value).booleanValue());
        }
        if (Value instanceof List) {
            AussomList out = new AussomList();
            for (Object item : (List<Object>) Value) {
                out.add(toAussom(item));
            }
            return out;
        }
        if (Value instanceof Map) {
            AussomMap out = new AussomMap();
            Map<Object, Object> in = (Map<Object, Object>) Value;
            for (Map.Entry<Object, Object> e : in.entrySet()) {
                String key = keyOf(e.getKey());
                if (key == null) {
                    continue;
                }
                out.put(key, toAussom(e.getValue()));
            }
            return out;
        }
        // A store holds plain types by construction, so nothing should reach
        // here. Saying nothing is the right answer if something does: this
        // used to be String.valueOf, and a configuration section read back
        // off disk arrived as the text of its own toString.
        return new AussomNull();
    }

    /**
     * A map key, or null when there is no safe way to name it.
     *
     * The same rule the marshaller uses. Only values that are their own text
     * become keys, because the alternative is calling toString on whatever
     * the key happens to be.
     *
     * @param Key is the Java map key.
     * @return A String to key by, or null.
     */
    private static String keyOf(Object Key) {
        if (Key == null) {
            return null;
        }
        if (Key instanceof String || Key instanceof CharSequence) {
            return Key.toString();
        }
        if (Key instanceof Number || Key instanceof Boolean
                || Key instanceof Character || Key instanceof UUID) {
            return String.valueOf(Key);
        }
        if (Key instanceof Enum) {
            return ((Enum<?>) Key).name();
        }
        return null;
    }

    /**
     * Roughly how many bytes a stored value occupies.
     *
     * An estimate, not a measurement. What it has to be is monotonic and
     * cheap: bigger values must count for more, and it runs on every write.
     * Strings count two bytes per character because that is what they cost
     * in memory, and every entry carries a small fixed overhead so that a
     * million empty keys still counts as something.
     *
     * @param Value is the stored value.
     * @return A long with the estimated size in bytes.
     */
    public static long sizeOf(Object Value) {
        if (Value == null) {
            return 0L;
        }
        if (Value instanceof String) {
            return 16L + 2L * ((String) Value).length();
        }
        if (Value instanceof Number || Value instanceof Boolean) {
            return 16L;
        }
        if (Value instanceof List) {
            long n = 16L;
            for (Object o : (List<?>) Value) {
                n = n + 8L + sizeOf(o);
            }
            return n;
        }
        if (Value instanceof Map) {
            long n = 16L;
            for (Map.Entry<?, ?> e : ((Map<?, ?>) Value).entrySet()) {
                n = n + 8L + sizeOf(String.valueOf(e.getKey())) + sizeOf(e.getValue());
            }
            return n;
        }
        return 16L;
    }

    /**
     * Reads an argument as a string.
     *
     * @param args is the extern argument list.
     * @param Index is which argument to read.
     * @return A String, or null when the argument is absent or not a string.
     */
    public static String str(List<AussomType> args, int Index) {
        if (args == null || args.size() <= Index) {
            return null;
        }
        AussomType t = args.get(Index);
        if (t instanceof AussomString) {
            return ((AussomString) t).getValue();
        }
        return null;
    }

    /**
     * Reads an argument as a long.
     *
     * @param args is the extern argument list.
     * @param Index is which argument to read.
     * @param Fallback is returned when the argument is absent or not an int.
     * @return A long with the value.
     */
    public static long num(List<AussomType> args, int Index, long Fallback) {
        if (args == null || args.size() <= Index) {
            return Fallback;
        }
        AussomType t = args.get(Index);
        if (t instanceof AussomInt) {
            return ((AussomInt) t).getValue();
        }
        return Fallback;
    }
}
