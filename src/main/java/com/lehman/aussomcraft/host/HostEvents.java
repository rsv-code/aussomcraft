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

import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.EventPriority;

import com.aussom.Environment;
import com.aussom.types.AussomBool;
import com.aussom.types.AussomCallback;
import com.aussom.types.AussomException;
import com.aussom.types.AussomList;
import com.aussom.types.AussomType;

import com.lehman.aussomcraft.AussomCraftPlugin;
import com.lehman.aussomcraft.paper.PaperModules;
import com.lehman.aussomcraft.script.ScriptContext;

/**
 * Backs the events extern.
 *
 * Handlers register programmatically rather than by annotation, because the
 * annotation form cannot take a class chosen at runtime, which is the whole
 * point. Bukkit's EventExecutor is the seam.
 *
 * @author Austin Lehman
 */
public class HostEvents {

    /** Packages tried, in order, for a simple event name. A dotted name skips these. */
    private static final String[] EVENT_PACKAGES = {
        "org.bukkit.event.player.",
        "org.bukkit.event.block.",
        "org.bukkit.event.entity.",
        "org.bukkit.event.inventory.",
        "org.bukkit.event.server.",
        "org.bukkit.event.world.",
        "org.bukkit.event.weather.",
        "org.bukkit.event.vehicle.",
        "org.bukkit.event.hanging.",
        "org.bukkit.event.enchantment.",
        "org.bukkit.event.raid.",
        "org.bukkit.event.",
    };

    public HostEvents() { }

    /**
     * Registers a handler for a named Bukkit event.
     *
     * @param env is the calling context.
     * @param args holds the event name, the callback, and optionally
     *        whether to see cancelled events.
     * @return An AussomBool with true, or an AussomException on failure.
     */
    public AussomType on(Environment env, ArrayList<AussomType> args) {
        ScriptContext ctx = Host.context(env);
        AussomCraftPlugin plugin = Host.plugin();
        if (ctx == null || plugin == null) {
            return new AussomException("events.on(): not running inside a loaded script.");
        }

        String name = Host.str(args, 0);
        if (name == null) {
            return new AussomException("events.on(): first argument must be an event name string.");
        }
        if (args.size() < 2 || !(args.get(1) instanceof AussomCallback)) {
            return new AussomException("events.on(): second argument must be a callback.");
        }
        AussomCallback cb = (AussomCallback) args.get(1);

        boolean ignoreCancelled = true;
        if (args.size() > 2 && args.get(2) instanceof AussomBool) {
            // The script says "also give me cancelled events" by passing
            // false here, so the flag Bukkit wants is the inverse.
            ignoreCancelled = !((AussomBool) args.get(2)).getValue();
        }

        Class<? extends Event> cls;
        try {
            cls = resolve(name);
        } catch (ClassNotFoundException e) {
            return new AussomException("events.on(): no event class found for '" + name + "'.");
        } catch (IllegalArgumentException e) {
            return new AussomException("events.on(): " + e.getMessage());
        }

        // Include the event's module now, at load, rather than when the
        // first event arrives. Parsing a module takes long enough to blow a
        // tick budget, and the dispatch path must never parse.
        //
        // The answer also decides whether to register at all. Resolving a
        // name only proves the class is a Bukkit event, not that this tier
        // was given it, so without this a script could subscribe to anything
        // on the class path. The handler would receive null, since a tier
        // with no module for a type gets no shim, but the script would still
        // learn that the event fired and how often. The generated API is
        // meant to be the whole surface, and that is a way around it.
        //
        // Asked by binary name. Modules are named after a type's simple name,
        // and asking by that accepted any class sharing one: another plugin's
        // event called AsyncPlayerChatEvent passed the check meant for
        // Bukkit's. Where that class also extended Bukkit's, the shim's cast
        // succeeded and an untrusted script read a staff channel through the
        // module for public chat.
        String tier = ctx.getProfile().getId();
        if (!PaperModules.grantsClass(tier, cls.getName())
                || !PaperModules.includeType(ctx.getHost(), tier, cls.getSimpleName())) {
            return new AussomException("events.on(): '" + name + "' is not available"
                + " at the " + tier + " tier.");
        }

        final String what = "events.on(\"" + name + "\")";
        Bukkit.getPluginManager().registerEvent(cls, ctx.getListener(),
            EventPriority.NORMAL,
            (listener, event) -> {
                AussomList cargs = new AussomList();
                cargs.add(plugin.wrapEvent(ctx, event));
                plugin.getRunner().run(ctx, cb, cargs, what);
            },
            plugin, ignoreCancelled);

        return new AussomBool(true);
    }

    /**
     * Resolves an event name to a class, checked against Event so events.on
     * cannot be used to load arbitrary classes by name.
     *
     * @param Name the simple or fully qualified event name.
     * @return The Class for the event.
     * @throws ClassNotFoundException when no candidate resolves.
     * @throws IllegalArgumentException when it resolves to a non-event.
     */
    @SuppressWarnings("unchecked")
    static Class<? extends Event> resolve(String Name) throws ClassNotFoundException {
        ClassLoader cl = HostEvents.class.getClassLoader();
        Class<?> found = null;

        if (Name.indexOf('.') >= 0) {
            found = Class.forName(Name, false, cl);
        } else {
            for (String pkg : EVENT_PACKAGES) {
                try {
                    found = Class.forName(pkg + Name, false, cl);
                    break;
                } catch (ClassNotFoundException keepLooking) {
                    found = null;
                }
            }
        }

        if (found == null) {
            throw new ClassNotFoundException(Name);
        }
        if (!Event.class.isAssignableFrom(found)) {
            throw new IllegalArgumentException("'" + found.getName()
                + "' is not a Bukkit event.");
        }
        return (Class<? extends Event>) found;
    }
}
