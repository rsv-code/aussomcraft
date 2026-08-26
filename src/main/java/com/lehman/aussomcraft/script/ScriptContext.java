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

package com.lehman.aussomcraft.script;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;

import com.lehman.aussomcraft.host.Host;
import com.lehman.aussomcraft.profile.Profile;

/**
 * One loaded script: its file, its identity, its engine, and what it
 * registered with the server.
 *
 * Registrations are tracked so reload can undo them. Otherwise a reloaded
 * script's old handlers stay attached and fire against an engine nobody
 * holds.
 *
 * @author Austin Lehman
 */
public class ScriptContext {

    /** The file name, for example rules.aus. */
    private final String name;

    /** Where the file is on disk. */
    private final Path path;

    /** SHA-256 of the file's bytes, lower case hex. This is its identity. */
    private final String hash;

    /** The profile this script was loaded under. */
    private final Profile profile;

    /** The engine running it. */
    private final ScriptEngineHost host;

    /**
     * One listener stub per script. Bukkit keys handler removal on the listener
     * object, so this is what makes one script's handlers removable alone.
     */
    private final Listener listener = new Listener() { };

    /**
     * Commands this script registered, by name.
     *
     * Concurrent because an async event handler runs off the main thread and
     * can register from there. A plain list could throw while unregisterAll
     * was walking it, and unregisterAll failing part way is how a reloaded
     * script keeps its handlers attached.
     */
    private final List<Command> commands = new CopyOnWriteArrayList<Command>();

    /** Scheduler task ids this script owns. Concurrent for the same reason. */
    private final List<Integer> tasks = new CopyOnWriteArrayList<Integer>();

    /** This script's persistent store. */
    private final Map<String, Object> store = new ConcurrentHashMap<String, Object>();

    /** True when the store has changed since it was last written. */
    private volatile boolean storeDirty = false;

    /**
     * Roughly how many bytes the store holds, kept as writes happen.
     *
     * Tracked rather than measured on demand because a write would otherwise
     * walk the whole store, which turns a cheap call into one that gets more
     * expensive the more a script has saved.
     */
    private final AtomicLong storeBytes = new AtomicLong(0L);

    /** @return roughly how many bytes this script's store holds. */
    public long getStoreBytes() {
        return this.storeBytes.get();
    }

    /**
     * Adjusts the tracked store size.
     *
     * @param Delta is the change in bytes, positive or negative.
     */
    public void addStoreBytes(long Delta) {
        this.storeBytes.addAndGet(Delta);
    }

    /** Recounts the store from scratch, for when it is seeded at load. */
    public void recountStore() {
        long n = 0L;
        for (Map.Entry<String, Object> e : this.store.entrySet()) {
            n = n + Host.sizeOf(e.getKey()) + Host.sizeOf(e.getValue());
        }
        this.storeBytes.set(n);
    }

    /**
     * True when the script has been switched off after repeated budget
     * overruns. A disabled script keeps its registrations so that reload
     * still cleans up, but the runner refuses to call into it.
     */
    private volatile boolean disabled = false;

    /** How many runs have been cancelled for taking too long. */
    private int cancelCount = 0;

    /**
     * Builds a context.
     *
     * @param Name is the script file name.
     * @param ScriptPath is the file's path.
     * @param Hash is the SHA-256 of the file's bytes.
     * @param ScriptProfile is the profile it loaded under.
     * @param Host is the engine running it.
     */
    public ScriptContext(String Name, Path ScriptPath, String Hash,
            Profile ScriptProfile, ScriptEngineHost Host) {
        this.name = Name;
        this.path = ScriptPath;
        this.hash = Hash;
        this.profile = ScriptProfile;
        this.host = Host;
    }

    /** @return the script file name. */
    public String getName() {
        return this.name;
    }

    /** @return the file's path. */
    public Path getPath() {
        return this.path;
    }

    /** @return SHA-256 of the file's bytes, lower case hex. */
    public String getHash() {
        return this.hash;
    }

    /** @return the profile this script loaded under. */
    public Profile getProfile() {
        return this.profile;
    }

    /** @return the engine running this script. */
    public ScriptEngineHost getHost() {
        return this.host;
    }

    /** @return this script's listener stub. */
    public Listener getListener() {
        return this.listener;
    }

    /** @return this script's persistent store. */
    public Map<String, Object> getStore() {
        return this.store;
    }

    /** Marks the store as needing a write. */
    public void markStoreDirty() {
        this.storeDirty = true;
    }

    /**
     * Clears the dirty flag and reports what it was.
     *
     * @return A boolean with true when the store needed writing.
     */
    public boolean clearStoreDirty() {
        boolean was = this.storeDirty;
        this.storeDirty = false;
        return was;
    }

    /** @return true when this script has been switched off. */
    public boolean isDisabled() {
        return this.disabled;
    }

    /** Switches this script off. Its registrations stay for cleanup. */
    public void disable() {
        this.disabled = true;
    }

    /**
     * Records that a run was cancelled for taking too long.
     *
     * @return An int with the running total for this script.
     */
    public int recordCancel() {
        this.cancelCount++;
        return this.cancelCount;
    }

    /**
     * Records a command this script registered.
     *
     * @param Cmd is the command.
     */
    public void addCommand(Command Cmd) {
        this.commands.add(Cmd);
    }

    /** @return the commands this script registered. */
    public List<Command> getCommands() {
        return Collections.unmodifiableList(this.commands);
    }

    /**
     * Records a scheduler task this script owns.
     *
     * @param TaskId is the Bukkit task id.
     */
    public void addTask(int TaskId) {
        this.tasks.add(Integer.valueOf(TaskId));
    }

    /**
     * Whether a scheduler task belongs to this script.
     *
     * Bukkit task ids are server wide and sequential, so a script can name
     * another plugin's task simply by counting. Cancelling is therefore
     * answered from what this script actually scheduled.
     *
     * @param TaskId is the Bukkit task id.
     * @return A boolean with true when this script scheduled it.
     */
    public boolean ownsTask(int TaskId) {
        return this.tasks.contains(Integer.valueOf(TaskId));
    }

    /**
     * Forgets a task this script cancelled, so the list stays the set of
     * tasks still outstanding.
     *
     * @param TaskId is the Bukkit task id.
     */
    public void forgetTask(int TaskId) {
        this.tasks.remove(Integer.valueOf(TaskId));
    }

    /**
     * Detaches everything this script registered. Handlers first: a cancelled
     * task cannot fire an event, but a live handler can still be reached by one
     * already in flight.
     */
    public void unregisterAll() {
        // Two belts. Detaching removes everything the host handed out, and
        // disabling plus cancelling neutralises anything that somehow still
        // holds a callback: the runner refuses a disabled context, and a
        // cancelled engine stops at its next check.
        this.disabled = true;
        this.host.cancel();

        // Each detach is guarded on its own. One that throws must not leave
        // the rest attached, because a half detached script still has live
        // handlers pointing at an engine nobody owns any more.
        try {
            HandlerList.unregisterAll(this.listener);
        } catch (Throwable e) {
            Bukkit.getLogger().warning("Could not detach handlers for '"
                + this.name + "': " + e);
        }
        for (Integer id : this.tasks) {
            try {
                Bukkit.getScheduler().cancelTask(id.intValue());
            } catch (Throwable e) {
                Bukkit.getLogger().warning("Could not cancel task " + id
                    + " for '" + this.name + "': " + e);
            }
        }
        this.tasks.clear();
        for (Command cmd : this.commands) {
            try {
                cmd.unregister(Bukkit.getCommandMap());
                forgetCommand(cmd);
            } catch (Throwable e) {
                Bukkit.getLogger().warning("Could not unregister command '"
                    + cmd.getName() + "' for '" + this.name + "': " + e);
            }
        }
        this.commands.clear();
    }

    /**
     * Drops a command's entries from the server's command map.
     *
     * Command.unregister clears the command's own registration flag and
     * nothing else. The map keeps every key it was filed under, so the name
     * stays taken, and the next load of the same script registers under its
     * fallback prefix instead. The bare name is then still bound to a command
     * belonging to a script that is no longer running, and typing it does
     * nothing. That is what made a reload silently stop answering.
     *
     * One command is filed under several keys: the bare name, the prefixed
     * form, and any aliases. Entries are matched on the command object rather
     * than on the name, so every key this command owns goes and a name another
     * plugin owns is left alone even when it collides with ours.
     *
     * @param Cmd is the command to forget.
     */
    private void forgetCommand(Command Cmd) {
        Map<String, Command> known = Bukkit.getCommandMap().getKnownCommands();

        // The keys are collected before anything is removed. The map is not
        // always a plain HashMap: a server that forwards its commands into
        // Brigadier hands back a view whose iterator ignores a removal, while
        // remove by key is passed along properly. Collecting first also keeps
        // this off the concurrent modification path.
        List<String> keys = new ArrayList<String>();
        for (Map.Entry<String, Command> entry : known.entrySet()) {
            if (entry.getValue() == Cmd) {
                keys.add(entry.getKey());
            }
        }
        for (String key : keys) {
            known.remove(key);
        }
    }
}
