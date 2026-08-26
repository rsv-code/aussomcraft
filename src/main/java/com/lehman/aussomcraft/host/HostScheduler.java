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
import org.bukkit.scheduler.BukkitTask;

import com.aussom.Environment;
import com.aussom.types.AussomCallback;
import com.aussom.types.AussomException;
import com.aussom.types.AussomInt;
import com.aussom.types.AussomList;
import com.aussom.types.AussomType;

import com.lehman.aussomcraft.AussomCraftPlugin;
import com.lehman.aussomcraft.script.ScriptContext;

/**
 * Backs the sched extern. Both forms run on the main server thread, so a
 * scheduled callback sees the same world state an event handler does.
 *
 * @author Austin Lehman
 */
public class HostScheduler {

    public HostScheduler() { }

    /**
     * Runs a callback once after a delay.
     *
     * @param env is the calling context.
     * @param args holds the delay in ticks and the callback.
     * @return An AussomInt with the task id, or an AussomException.
     */
    public AussomType later(Environment env, ArrayList<AussomType> args) {
        return schedule(env, args, false);
    }

    /**
     * Runs a callback repeatedly.
     *
     * @param env is the calling context.
     * @param args holds the period in ticks and the callback.
     * @return An AussomInt with the task id, or an AussomException.
     */
    public AussomType repeat(Environment env, ArrayList<AussomType> args) {
        return schedule(env, args, true);
    }

    /**
     * Cancels a task this script owns.
     *
     * @param env is the calling context.
     * @param args holds the task id.
     * @return An AussomInt with the id that was cancelled.
     */
    public AussomType cancel(Environment env, ArrayList<AussomType> args) {
        ScriptContext ctx = Host.context(env);
        if (ctx == null) {
            return new AussomException("sched.cancel(): not running inside a loaded script.");
        }
        long id = Host.num(args, 0, -1L);
        if (id < 0) {
            return new AussomException("sched.cancel(): first argument must be a task id.");
        }
        // Task ids are server wide and sequential, so without this a script
        // could count from zero and cancel every other plugin's scheduled
        // work as well as the server's own.
        if (!ctx.ownsTask((int) id)) {
            return new AussomException("sched.cancel(): task " + id
                + " does not belong to this script.");
        }
        Bukkit.getScheduler().cancelTask((int) id);
        ctx.forgetTask((int) id);
        return new AussomInt(id);
    }

    private AussomType schedule(Environment env, ArrayList<AussomType> args,
            boolean Repeating) {
        ScriptContext ctx = Host.context(env);
        AussomCraftPlugin plugin = Host.plugin();
        if (ctx == null || plugin == null) {
            return new AussomException("sched: not running inside a loaded script.");
        }

        long ticks = Host.num(args, 0, -1L);
        if (ticks < 0) {
            return new AussomException("sched: first argument must be a tick count.");
        }
        if (args.size() < 2 || !(args.get(1) instanceof AussomCallback)) {
            return new AussomException("sched: second argument must be a callback.");
        }
        final AussomCallback cb = (AussomCallback) args.get(1);

        String what = "sched.later(" + ticks + ")";
        if (Repeating) {
            what = "sched.repeat(" + ticks + ")";
        }
        final String label = what;

        Runnable body = () -> plugin.getRunner().run(ctx, cb, new AussomList(), label);

        BukkitTask task;
        if (Repeating) {
            // A period of zero would run the body every tick forever, which
            // is almost never meant and is indistinguishable from a hang.
            long period = ticks;
            if (period <= 0) {
                period = 1;
            }
            task = Bukkit.getScheduler().runTaskTimer(plugin, body, period, period);
        } else {
            task = Bukkit.getScheduler().runTaskLater(plugin, body, ticks);
        }
        ctx.addTask(task.getTaskId());
        return new AussomInt(task.getTaskId());
    }
}
