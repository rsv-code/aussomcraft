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

package com.lehman.aussomcraft.paper;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.aussom.Engine;
import com.aussom.Environment;
import com.aussom.ast.aussomException;
import com.aussom.types.AussomBool;
import com.aussom.types.AussomException;
import com.aussom.types.AussomDouble;
import com.aussom.types.AussomInt;
import com.aussom.types.AussomList;
import com.aussom.types.AussomMap;
import com.aussom.types.AussomNull;
import com.aussom.types.AussomObject;
import com.aussom.types.AussomString;
import com.aussom.types.AussomType;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.ComponentLike;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;

/**
 * Conversion between Aussom values and Java values for the generated shims.
 *
 * The generated code calls into here rather than repeating conversion at
 * every method, so the rules live in one place.
 *
 * @author Austin Lehman
 */
public final class Marshal {

    private Marshal() { }

    /**
     * Wraps a Java value for the script side.
     *
     * Primitives and strings become Aussom values. Collections marshal
     * element by element. Enums become their name, since Aussom enums are
     * strings underneath. Anything else needs a shim, and the caller names
     * which one.
     *
     * @param env is the calling context.
     * @param Value is the Java value.
     * @param ShimClass is the Aussom class to wrap an object in, or null.
     * @return An AussomType, never null.
     */
    public static AussomType wrap(Environment env, Object Value) {
        return wrap(env, Value, shimNameOf(Value));
    }

    /**
     * The Aussom shim class name for a Java object.
     *
     * Walks to the first API type the generator would have named, because
     * Paper hands out implementation classes such as CraftPlayer while the
     * shim is generated against the interface Player.
     *
     * @param Value is the Java object.
     * @return A String with the shim class name, or null when it is not an
     *         API type.
     */
    public static String shimNameOf(Object Value) {
        if (Value == null) {
            return null;
        }
        for (Class<?> c = Value.getClass(); c != null; c = c.getSuperclass()) {
            if (isApi(c)) {
                return c.getSimpleName();
            }
            for (Class<?> i : c.getInterfaces()) {
                if (isApi(i)) {
                    return i.getSimpleName();
                }
            }
        }
        return null;
    }

    private static boolean isApi(Class<?> C) {
        String n = C.getName();
        return n.startsWith("org.bukkit.") && !n.startsWith("org.bukkit.craftbukkit.")
            || n.startsWith("io.papermc.") || n.startsWith("com.destroystokyo.");
    }

    private static AussomType wrap(Environment env, Object Value, String ShimClass) {
        if (Value == null) {
            return new AussomNull();
        }
        if (Value instanceof String) {
            return new AussomString((String) Value);
        }
        if (Value instanceof Boolean) {
            return new AussomBool(((Boolean) Value).booleanValue());
        }
        if (Value instanceof Integer || Value instanceof Long
                || Value instanceof Short || Value instanceof Byte) {
            return new AussomInt(((Number) Value).longValue());
        }
        if (Value instanceof Double || Value instanceof Float) {
            return new AussomDouble(((Number) Value).doubleValue());
        }
        if (Value instanceof Character) {
            return new AussomString(String.valueOf(Value));
        }
        if (Value instanceof UUID) {
            return new AussomString(Value.toString());
        }
        if (Value instanceof Component) {
            // Adventure's Component is a builder, not a value a script wants
            // to hold. It marshals to and from a plain string instead, which
            // is what makes sendMessage("hi") work.
            return new AussomString(PlainTextComponentSerializer.plainText()
                .serialize((Component) Value));
        }
        if (Value instanceof Enum) {
            return new AussomString(((Enum<?>) Value).name());
        }
        if (Value instanceof Collection) {
            AussomList out = new AussomList();
            for (Object item : (Collection<?>) Value) {
                out.add(wrap(env, item, shimNameOf(item)));
            }
            return out;
        }
        if (Value instanceof Map) {
            AussomMap out = new AussomMap();
            Map<?, ?> in = (Map<?, ?>) Value;
            for (Map.Entry<?, ?> e : in.entrySet()) {
                String key = keyOf(e.getKey());
                if (key == null) {
                    // No safe way to name this entry, so the entry does not
                    // exist. See keyOf.
                    continue;
                }
                out.put(key, wrap(env, e.getValue(), shimNameOf(e.getValue())));
            }
            return out;
        }
        if (ShimClass != null) {
            return shim(env, Value, ShimClass);
        }
        // The remaining value types the generator promised a tier it could
        // express. Everything above is handled by its own case, so this is
        // the tail of that same list rather than a general fallback.
        if (Value instanceof Date || Value instanceof Instant
                || Value instanceof Duration || Value instanceof Number
                || Value instanceof CharSequence) {
            return new AussomString(String.valueOf(Value));
        }
        // Anything else is a Java object this tier was never granted. It
        // reaches here because a method declared to return Object may
        // return absolutely anything, and toString on the wrong object
        // reports things a tier is not supposed to see: a File prints an
        // absolute path to a tier that has no filesystem. Null says nothing.
        return new AussomNull();
    }

    /**
     * A map key, or null when the key cannot be named safely.
     *
     * An Aussom map is keyed by string, so a Java key has to become one. The
     * obvious way, String.valueOf, calls toString on whatever the key is,
     * and that is the disclosure this project already closed on the value
     * side: a File prints a path, a URL prints a host, a plugin prints its
     * name and version. Values were redacted and keys were not, which is a
     * gap rather than a decision.
     *
     * World.getPluginChunkTickets returns a Map keyed by Plugin and is
     * generated at untrusted, so plugin identity was readable by any script.
     * The wider problem is that a Paper method returning a map keyed by
     * anything at all would disclose it, without anybody choosing to.
     *
     * So only values that are their own text are accepted. Anything else
     * loses the entry, which is the same answer the value side gives.
     *
     * @param Key is the Java map key.
     * @return A String to key by, or null when there is no safe one.
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
     * Builds a shim of the named Aussom class around a Java object.
     *
     * @param env is the calling context.
     * @param Value is the Java object to wrap.
     * @param ShimClass is the Aussom class name.
     * @return An AussomObject holding the shim, or null on failure.
     */
    public static AussomType shim(Environment env, Object Value, String ShimClass) {
        return shim(env.getEngine(), Value, ShimClass);
    }

    /**
     * Builds a shim around a Java object, given the engine directly. Events
     * are wrapped before the runner has built an Environment.
     *
     * @param Eng is the engine whose classes to instantiate from.
     * @param Value is the Java object to wrap.
     * @param ShimClass is the Aussom class name.
     * @return An AussomObject holding the shim, or null when this tier has
     *         no such shim.
     */
    public static AussomType shim(Engine Eng, Object Value, String ShimClass) {
        if (Value == null) {
            return new AussomNull();
        }
        // The module for this type may be registered but not yet included,
        // because a script only parses what it touches. Include it the first
        // time something of that type comes back, then it is defined for
        // good.
        if (!Eng.containsClass(ShimClass) && Eng instanceof TierAware) {
            TierAware host = (TierAware) Eng;
            PaperModules.includeType(Eng, host.getTierId(), ShimClass);
            // Parsing is the host's work, so it does not count against the
            // script's budget for this run.
            host.hostWorkDone();
        }
        try {
            AussomObject inst = Eng.instantiateObject(ShimClass);
            Object ext = inst.getExternObject();
            if (ext instanceof PaperObj) {
                ((PaperObj) ext).setObj(Value);
            }
            return inst;
        } catch (aussomException e) {
            return new AussomNull();
        }
    }

    /**
     * Unwraps an Aussom value to the Java value a Paper method wants.
     *
     * @param Value is the Aussom value.
     * @return An Object, or null for Aussom null.
     */
    public static Object unwrap(AussomType Value) {
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
                out.add(unwrap(item));
            }
            return out;
        }
        if (Value instanceof AussomObject) {
            Object ext = ((AussomObject) Value).getExternObject();
            if (ext instanceof PaperObj) {
                return ((PaperObj) ext).getObj();
            }
        }
        return null;
    }

    /**
     * Whether a marshalled value can be converted to the wanted type.
     * Used to pick between overloads before anything is invoked.
     *
     * @param Raw is the marshalled value.
     * @param Want is the target type.
     * @return A boolean with true when coerce would produce that type.
     */
    public static boolean convertible(Object Raw, Class<?> Want) {
        if (Raw == null || Want == null) {
            return true;
        }
        if (Want.isInstance(Raw)) {
            return true;
        }
        Object got = coerce(Raw, Want);
        if (got == null) {
            return false;
        }
        if (Want.isPrimitive()) {
            return got instanceof Number || got instanceof Boolean
                || got instanceof Character;
        }
        return Want.isInstance(got);
    }

    /**
     * Reads one argument as the Java type a Paper method expects, narrowing
     * numbers as needed. Aussom has one integer and one float type, so a
     * method wanting an int gets a long that has to be brought down.
     *
     * @param args is the argument list.
     * @param Index is which argument.
     * @param Want is the Java parameter type.
     * @return An Object suitable for reflective invocation.
     */
    public static Object arg(ArrayList<AussomType> args, int Index, Class<?> Want) {
        Object raw = null;
        if (args != null && args.size() > Index) {
            raw = unwrap(args.get(Index));
        }
        return coerce(raw, Want);
    }

    /**
     * One argument, as the exact type a generated shim needs.
     *
     * Generated code calls Paper directly, so it needs a typed value rather
     * than an Object. Primitives have their own accessors below, because a
     * Class token cannot name one and a null would fail to unbox.
     *
     * @param args is the extern argument list.
     * @param Index is which argument.
     * @param Want is the type to produce.
     * @param <T> is that type.
     * @return A T, or null when the argument is absent or unconvertible.
     */
    public static <T> T typed(ArrayList<AussomType> args, int Index, Class<T> Want) {
        Object got = arg(args, Index, Want);
        if (got == null) {
            return null;
        }
        return Want.cast(got);
    }

    /** An int argument, or zero when absent. */
    public static int argInt(ArrayList<AussomType> args, int Index) {
        Object o = arg(args, Index, int.class);
        if (o instanceof Number) {
            return ((Number) o).intValue();
        }
        return 0;
    }

    /** A long argument, or zero when absent. */
    public static long argLong(ArrayList<AussomType> args, int Index) {
        Object o = arg(args, Index, long.class);
        if (o instanceof Number) {
            return ((Number) o).longValue();
        }
        return 0L;
    }

    /** A double argument, or zero when absent. */
    public static double argDouble(ArrayList<AussomType> args, int Index) {
        Object o = arg(args, Index, double.class);
        if (o instanceof Number) {
            return ((Number) o).doubleValue();
        }
        return 0.0;
    }

    /** A float argument, or zero when absent. */
    public static float argFloat(ArrayList<AussomType> args, int Index) {
        Object o = arg(args, Index, float.class);
        if (o instanceof Number) {
            return ((Number) o).floatValue();
        }
        return 0.0f;
    }

    /** A short argument, or zero when absent. */
    public static short argShort(ArrayList<AussomType> args, int Index) {
        Object o = arg(args, Index, short.class);
        if (o instanceof Number) {
            return ((Number) o).shortValue();
        }
        return (short) 0;
    }

    /** A byte argument, or zero when absent. */
    public static byte argByte(ArrayList<AussomType> args, int Index) {
        Object o = arg(args, Index, byte.class);
        if (o instanceof Number) {
            return ((Number) o).byteValue();
        }
        return (byte) 0;
    }

    /** A char argument, or the null character when absent. */
    public static char argChar(ArrayList<AussomType> args, int Index) {
        Object o = arg(args, Index, char.class);
        if (o instanceof Character) {
            return ((Character) o).charValue();
        }
        if (o instanceof String && !((String) o).isEmpty()) {
            return ((String) o).charAt(0);
        }
        return '\0';
    }

    /** A boolean argument, or false when absent. */
    public static boolean argBool(ArrayList<AussomType> args, int Index) {
        Object o = arg(args, Index, boolean.class);
        if (o instanceof Boolean) {
            return ((Boolean) o).booleanValue();
        }
        return false;
    }

    /**
     * The answer when a shim is called and holds nothing.
     *
     * A script can build its own instance of a shim class, and the host is
     * the only thing that ever attaches an object, so this is the ordinary
     * result of calling one of those rather than a fault.
     *
     * @param Name is the method being called, for the message.
     * @return An AussomException value.
     */
    public static AussomType detached(String Name) {
        return new AussomException(Name + "(): this object is no longer attached.");
    }

    /**
     * The answer when a shim is called with a number of arguments no form of
     * that method takes.
     *
     * @param Name is the method being called.
     * @param Got is how many arguments arrived.
     * @return An AussomException value.
     */
    public static AussomType wrongArity(String Name, int Got) {
        return new AussomException(Name + "(): no form of this method takes "
            + Got + " arguments.");
    }

    /**
     * The answer when Paper itself throws.
     *
     * Returned as a value rather than thrown, so a script can catch it and
     * a handler is not taken down by an API that refused its arguments.
     *
     * @param Name is the method being called.
     * @param Thrown is what came out of Paper.
     * @return An AussomException value.
     */
    public static AussomType failed(String Name, Throwable Thrown) {
        Throwable cause = Thrown;
        if (Thrown.getCause() != null) {
            cause = Thrown.getCause();
        }
        String msg = cause.getMessage();
        if (msg == null) {
            msg = cause.getClass().getSimpleName();
        }
        return new AussomException(Name + "(): " + msg);
    }

    /**
     * Narrows a marshalled value to the exact Java type wanted.
     *
     * @param Raw is the marshalled value.
     * @param Want is the target type.
     * @return An Object of the wanted type where possible.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static Object coerce(Object Raw, Class<?> Want) {
        if (Raw == null) {
            return null;
        }
        if (Want == null || Want.isInstance(Raw)) {
            return Raw;
        }
        if (Raw instanceof Number) {
            Number n = (Number) Raw;
            if (Want == int.class || Want == Integer.class) return Integer.valueOf(n.intValue());
            if (Want == long.class || Want == Long.class) return Long.valueOf(n.longValue());
            if (Want == double.class || Want == Double.class) return Double.valueOf(n.doubleValue());
            if (Want == float.class || Want == Float.class) return Float.valueOf(n.floatValue());
            if (Want == short.class || Want == Short.class) return Short.valueOf(n.shortValue());
            if (Want == byte.class || Want == Byte.class) return Byte.valueOf(n.byteValue());
        }
        if (Raw instanceof String) {
            String s = (String) Raw;
            if (Want == Component.class || Want == ComponentLike.class) {
                return Component.text(s);
            }
            if (Want == UUID.class) {
                return UUID.fromString(s);
            }
            if (Want.isEnum()) {
                return Enum.valueOf((Class<? extends Enum>) Want, s);
            }
            if (Want == char.class || Want == Character.class) {
                if (!s.isEmpty()) return Character.valueOf(s.charAt(0));
            }
        }
        return Raw;
    }
}
