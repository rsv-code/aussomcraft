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

package com.lehman.aussomcraft.aji;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

import com.aussom.Environment;
import com.aussom.SecurityManagerInt;
import com.aussom.types.AussomException;
import com.aussom.types.AussomException.exType;
import com.aussom.types.AussomType;

/**
 * The single place AJI asks whether an operation is permitted.
 *
 * One class allowlist. Constructing a class, calling a method on one,
 * implementing an interface and naming an array component type all check
 * against it. Denial is absence.
 *
 * Three entry forms:
 *   *       admits everything, which is what the trusted profile uses
 *   pkg.*   admits any class whose name starts with pkg.
 *   a.b.C   admits any class assignable to a.b.C
 *
 * Both name forms are needed. Assignability reaches an implementation from
 * its interface: org.bukkit.entity.Player admits CraftPlayer, which lives in
 * org.bukkit.craftbukkit.entity where no org.bukkit.entity.* prefix would
 * match it. A prefix admits a library without enumerating it.
 *
 * Names resolve through a host-supplied loader, not the system loader, which
 * inside a Paper plugin cannot see org.bukkit at all. See
 * design/aussomcraft-design-1.md section 3.
 *
 * Each AJI API also has a boolean flag saying whether it exists at all. An
 * undefined flag denies, and so does an absent list.
 *
 * Ported from aussom, with the class loader and wildcard forms added.
 *
 * @author Austin Lehman
 */
public final class AjiGate {

    /** Turns allowlist enforcement on. Absent or false means off. */
    public static final String ENFORCE = "aussom.aji.allowlist.enforce";

    /** The one class allowlist. See the class comment for entry forms. */
    public static final String ALLOWED = "aussom.aji.allowed";

    /**
     * The exception id every denial carries. Tests and script code match on
     * this, so a denial stays distinguishable from a genuine extern fault.
     */
    public static final String DENIED_ID = "SECURITY_DENIED";

    /**
     * The loader every class name resolves through. Volatile because the host
     * sets it at plugin enable and interpreter threads read it after. Defaults
     * to this class's own loader, which in a plugin is the plugin loader.
     */
    private static volatile ClassLoader loader = AjiGate.class.getClassLoader();

    /**
     * Resolved allowlist entries, cached by list contents and loader. The
     * loader is in the key because one name can resolve differently under
     * two loaders.
     */
    private static final Map<String, List<Class<?>>> CACHE =
        new ConcurrentHashMap<String, List<Class<?>>>();

    private AjiGate() { }

    /**
     * Sets the loader class names resolve through.
     *
     * @param Loader is the loader to use, or null to restore the default.
     */
    public static void setClassLoader(ClassLoader Loader) {
        if (Loader == null) {
            loader = AjiGate.class.getClassLoader();
        } else {
            loader = Loader;
        }
        CACHE.clear();
    }

    /** @return the loader class names resolve through. */
    public static ClassLoader getClassLoader() {
        return loader;
    }

    // ---- boolean flags ----

    /**
     * Reads a boolean policy flag without throwing on an undefined key.
     *
     * @param sm   the engine's security manager.
     * @param prop the property name.
     * @return true only when the property is defined and true.
     */
    public static boolean isAllowed(SecurityManagerInt sm, String prop) {
        if (sm == null) {
            return false;
        }
        Object v = sm.getProperty(prop);
        if (v instanceof Boolean) {
            return ((Boolean) v).booleanValue();
        }
        return false;
    }

    /**
     * Enforces a boolean policy flag.
     *
     * @param env  the calling context.
     * @param prop the property name.
     * @param api  the API being called, for the message.
     * @throws SandboxDenied when the flag is false or undefined.
     */
    public static void requireFlag(Environment env, String prop, String api)
            throws SandboxDenied {
        if (isAllowed(security(env), prop)) {
            return;
        }
        throw new SandboxDenied(api, prop, prop,
            "The property is false or not defined.");
    }

    /**
     * Whether allowlist enforcement is switched on for this engine.
     *
     * @param env is the calling context.
     * @return A boolean with true when enforcing.
     */
    public static boolean enforcing(Environment env) {
        return isAllowed(security(env), ENFORCE);
    }

    // ---- the one class check ----

    /**
     * Enforces the allowlist for a class named by the caller - a class to
     * construct, an interface to implement, an array component type.
     *
     * @param env       the calling context.
     * @param className the class name the caller supplied.
     * @param api       the API being called, for the message.
     * @throws SandboxDenied when enforcement is on and the class is not
     *         permitted.
     */
    public static void requireClass(Environment env, String className, String api) throws SandboxDenied {
        SecurityManagerInt sm = security(env);
        if (!isAllowed(sm, ENFORCE)) {
            return;
        }
        if (className == null) {
            throw new SandboxDenied(api, "<null>", "class",
                "No class name was supplied.");
        }

        // A wildcard entry answers on the name alone, so a permitted class
        // never has to load before it is judged.
        if (nameMatches(sm, className)) {
            return;
        }

        Class<?> cls = resolve(className);
        if (cls == null) {
            // Unresolvable names are refused rather than passed through:
            // a name that cannot be loaded cannot be checked either.
            throw new SandboxDenied(api, className, "class",
                "The class could not be loaded by " + loader
                + ", so it cannot be checked.");
        }
        requireClass(env, cls, api);
    }

    /**
     * Enforces the allowlist for a class already held, normally a receiver's
     * actual class.
     *
     * Judged on what the object really is, not the name it was created under: a
     * permitted call can return an instance of something else entirely.
     *
     * @param env the calling context.
     * @param cls the class to check.
     * @param api the API being called, for the message.
     * @throws SandboxDenied when enforcement is on and the class is not permitted.
     */
    public static void requireClass(Environment env, Class<?> cls, String api)
            throws SandboxDenied {
        SecurityManagerInt sm = security(env);
        if (!isAllowed(sm, ENFORCE)) {
            return;
        }
        if (cls == null) {
            throw new SandboxDenied(api, "<null>", "class",
                "No class was resolved.");
        }
        if (nameMatches(sm, cls.getName())) {
            return;
        }
        for (Class<?> t : allowed(sm)) {
            if (t.isAssignableFrom(cls)) {
                return;
            }
        }
        throw new SandboxDenied(api, cls.getName(), "class",
            "Add it, or a supertype of it, to '" + ALLOWED + "'.");
    }

    // ---- value forms, for extern call sites ----

    /**
     * Flag check in value form: null when permitted, otherwise the
     * exception value the extern should return.
     *
     * @param env  the calling context.
     * @param prop the property name.
     * @param api  the API being called.
     * @return null when allowed, otherwise an AussomException value.
     */
    public static AussomType checkFlag(Environment env, String prop,
            String api) {
        try {
            requireFlag(env, prop, api);
            return null;
        } catch (SandboxDenied d) {
            return toValue(d, env);
        }
    }

    /**
     * Class check in value form, for a caller-supplied name.
     *
     * @param env       the calling context.
     * @param className the class name.
     * @param api       the API being called.
     * @return null when allowed, otherwise an AussomException value.
     */
    public static AussomType checkClass(Environment env, String className,
            String api) {
        try {
            requireClass(env, className, api);
            return null;
        } catch (SandboxDenied d) {
            return toValue(d, env);
        }
    }

    /**
     * Class check in value form, for a class already held.
     *
     * @param env the calling context.
     * @param cls the class to check.
     * @param api the API being called.
     * @return null when allowed, otherwise an AussomException value.
     */
    public static AussomType checkClass(Environment env, Class<?> cls,
            String api) {
        try {
            requireClass(env, cls, api);
            return null;
        } catch (SandboxDenied d) {
            return toValue(d, env);
        }
    }

    /**
     * Converts a denial into the exception value an extern returns.
     *
     * @param d   the denial.
     * @param env the calling context, for the stack trace.
     * @return an AussomException carrying DENIED_ID.
     */
    public static AussomType toValue(SandboxDenied d, Environment env) {
        // The base exType enum has no security member, so the id is what
        // makes a denial distinguishable. Callers match DENIED_ID.
        AussomException e = new AussomException(exType.exRuntime);
        String trace = "";
        if (env != null && env.getCallStack() != null) {
            trace = env.getCallStack().getStackTrace();
        }
        e.setException(0, DENIED_ID, d.getMessage(), trace);
        return e;
    }

    // ---- internals ----

    /**
     * Whether a wildcard entry admits this class name. Checked before
     * resolution, since a prefix is a statement about names not types.
     *
     * @param sm the engine's security manager.
     * @param className the fully qualified class name.
     * @return A boolean with true when a wildcard entry admits it.
     */
    private static boolean nameMatches(SecurityManagerInt sm, String className) {
        for (String ent : names(sm, ALLOWED)) {
            if (ent.equals("*")) {
                return true;
            }
            if (ent.endsWith(".*")) {
                // Drop only the star and keep the trailing dot, so an entry
                // of 'org.bukkit.ent.*' does not admit 'org.bukkit.entity.X'.
                if (className.startsWith(ent.substring(0, ent.length() - 1))) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Resolves the name entries to Class objects, cached. Wildcards are skipped
     * here since nameMatches answers them. Names that do not resolve are
     * skipped rather than failing every check; the host reports those at load.
     */
    private static List<Class<?>> allowed(SecurityManagerInt sm) {
        Set<String> want = names(sm, ALLOWED);
        if (want.isEmpty()) {
            return Collections.emptyList();
        }
        ClassLoader cl = loader;
        String key = System.identityHashCode(cl) + "|"
            + new TreeSet<String>(want).toString();
        List<Class<?>> hit = CACHE.get(key);
        if (hit != null) {
            return hit;
        }
        List<Class<?>> out = new ArrayList<Class<?>>();
        for (String n : want) {
            if (n.equals("*") || n.endsWith(".*")) {
                continue;
            }
            Class<?> c = resolve(n);
            if (c != null) {
                out.add(c);
            }
        }
        CACHE.put(key, out);
        return out;
    }

    /**
     * Names on the allowlist that do not resolve. A dropped entry denies, which
     * is safe but very hard to debug, so the host reports these at load.
     *
     * @param sm the security manager holding the list.
     * @return A List of entries that could not be loaded.
     */
    public static List<String> unresolvable(SecurityManagerInt sm) {
        List<String> out = new ArrayList<String>();
        for (String n : names(sm, ALLOWED)) {
            if (n.equals("*") || n.endsWith(".*")) {
                continue;
            }
            if (resolve(n) == null) {
                out.add(n);
            }
        }
        return out;
    }

    /**
     * Loads a class without initializing it, so nothing of the class runs
     * before it has passed the gate.
     */
    private static Class<?> resolve(String name) {
        try {
            return Class.forName(name, false, loader);
        } catch (Throwable notThere) {
            return null;
        }
    }

    /** Reads the allowlist as names. Absent or unusable yields empty, which denies. */
    private static Set<String> names(SecurityManagerInt sm, String prop) {
        if (sm == null) {
            return Collections.emptySet();
        }
        Object v = sm.getProperty(prop);
        if (!(v instanceof Collection)) {
            return Collections.emptySet();
        }
        Set<String> out = new HashSet<String>();
        for (Object o : (Collection<?>) v) {
            if (o != null) {
                out.add(o.toString().trim());
            }
        }
        return out;
    }

    private static SecurityManagerInt security(Environment env) {
        if (env == null || env.getEngine() == null) {
            return null;
        }
        return env.getEngine().getSecurityManager();
    }
}
