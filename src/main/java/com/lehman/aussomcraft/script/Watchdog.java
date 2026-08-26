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

import java.util.Deque;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.logging.Logger;

/**
 * Stops a script run that has gone past its budget.
 *
 * One thread watching the runs in flight. Past the budget it calls
 * Engine.cancel(), which the interpreter checks at every loop back edge and
 * every Aussom call, so a runaway loop stops within microseconds.
 *
 * Three limits, none fixable here:
 *   - the tick has already stalled by the time this fires, so cancelling
 *     bounds the damage rather than preventing it
 *   - cancellation is cooperative, so a script inside one long AJI call has
 *     no checkpoint until it returns
 *   - a cancelled engine still holds its memory
 *
 * @author Austin Lehman
 */
public class Watchdog {

    /** How often the watcher thread looks, in milliseconds. */
    private static final long TICK_MS = 5L;

    /**
     * Runs in flight, keyed by the script, as a stack of start times.
     *
     * A stack rather than one time because handlers re-enter: a handler can
     * do something that fires an event, and that event can reach the same
     * script. With a single entry the inner run's exit removed the outer
     * run's entry as well, and the outer handler carried on unwatched. A
     * script could hang the server for good by looping after a nested call
     * returned.
     */
    private final Map<ScriptContext, Deque<Long>> inFlight =
        new ConcurrentHashMap<ScriptContext, Deque<Long>>();

    /** How long one run may take, in milliseconds. */
    private final long budgetMs;

    /** How many cancellations a script gets before it is switched off. */
    private final int maxCancels;

    /** Where overruns are reported. */
    private final Logger log;

    /** The watcher. Null until start(). */
    private Thread thread = null;

    /** Cleared to stop the watcher. */
    private volatile boolean running = false;

    /**
     * Builds a watchdog.
     *
     * @param BudgetMs is how long one run may take.
     * @param MaxCancels is how many overruns a script gets before it is
     *        disabled. Zero or less means never disable.
     * @param Log is where overruns are reported.
     */
    public Watchdog(long BudgetMs, int MaxCancels, Logger Log) {
        this.budgetMs = BudgetMs;
        this.maxCancels = MaxCancels;
        this.log = Log;
    }

    /** Starts the watcher thread. */
    public void start() {
        if (this.running) {
            return;
        }
        this.running = true;
        this.thread = new Thread(this::watch, "AussomCraft-Watchdog");
        this.thread.setDaemon(true);
        this.thread.start();
    }

    /** Stops the watcher thread. */
    public void stop() {
        this.running = false;
        Thread t = this.thread;
        if (t != null) {
            t.interrupt();
        }
        this.thread = null;
        this.inFlight.clear();
    }

    /**
     * Records that a run has begun.
     *
     * @param Context is the script being run.
     */
    public void enter(ScriptContext Context) {
        Deque<Long> stack = this.inFlight.get(Context);
        if (stack == null) {
            stack = new ConcurrentLinkedDeque<Long>();
            Deque<Long> raced = this.inFlight.putIfAbsent(Context, stack);
            if (raced != null) {
                stack = raced;
            }
        }
        stack.addLast(Long.valueOf(System.nanoTime()));
    }

    /**
     * Restarts the clock for a run in flight.
     *
     * For time the host spent on the script's behalf, such as parsing a
     * module a returned value needed. The budget bounds what a script does,
     * not what the host does for it, and a handler must not be cancelled for
     * a cost it neither asked for nor can avoid.
     *
     * @param Context is the script being run.
     */
    public void excuse(ScriptContext Context) {
        Deque<Long> stack = this.inFlight.get(Context);
        if (stack == null) {
            return;
        }
        // Every run in flight waited on the same host work, including the
        // outer ones, so they are all forgiven the same amount.
        Long now = Long.valueOf(System.nanoTime());
        int depth = stack.size();
        stack.clear();
        for (int i = 0; i < depth; i++) {
            stack.addLast(now);
        }
    }

    /**
     * Records that a run has ended and clears any cancel the watchdog raised,
     * so the engine is usable for the next event.
     *
     * @param Context the script that was run.
     * @return A boolean with true when this run was cancelled.
     */
    public boolean exit(ScriptContext Context) {
        Deque<Long> stack = this.inFlight.get(Context);
        if (stack != null) {
            stack.pollLast();
            if (stack.isEmpty()) {
                this.inFlight.remove(Context);
                this.special.remove(Context);
            }
        }
        boolean cancelled = Context.getHost().isCancelled();
        if (cancelled) {
            Context.getHost().clearCancel();
        }
        return cancelled;
    }

    /**
     * Counts a stopped run and switches the script off once it has happened too
     * often. Overrunning once is a bug; overrunning every time costs a tick each
     * time.
     *
     * @param Context the script that was cancelled.
     * @param What names the handler, for the log.
     */
    public void recordCancellation(ScriptContext Context, String What) {
        int count = Context.recordCancel();
        this.log.warning("Script '" + Context.getName() + "' exceeded its "
            + this.budgetMs + "ms budget in " + What + " (" + count + ")");
        if (this.maxCancels > 0 && count >= this.maxCancels && !Context.isDisabled()) {
            Context.disable();
            this.log.severe("Script '" + Context.getName() + "' disabled after "
                + count + " budget overruns. Fix it and run /acraft reload.");
        }
    }

    /** @return how long one run may take, in milliseconds. */
    public long getBudgetMs() {
        return this.budgetMs;
    }

    /**
     * Watches a run under a budget of its own, for work that is not a tick.
     *
     * A script's main runs once at load and is allowed to be slower than a
     * handler, but it cannot be allowed to be endless: load happens on the
     * server thread, so a loop there hangs the server with nothing to stop
     * it.
     *
     * @param Context is the script being run.
     * @param BudgetMs is how long this particular run may take.
     */
    public void enterWith(ScriptContext Context, long BudgetMs) {
        this.enter(Context);
        this.special.put(Context, Long.valueOf(BudgetMs));
    }

    /** Budgets that differ from the standard one, by script. */
    private final Map<ScriptContext, Long> special =
        new ConcurrentHashMap<ScriptContext, Long>();

    private void watch() {
        while (this.running) {
            long now = System.nanoTime();
            for (Map.Entry<ScriptContext, Deque<Long>> e : this.inFlight.entrySet()) {
                long budgetNanos = this.budgetMs * 1000000L;
                Long own = this.special.get(e.getKey());
                if (own != null) {
                    budgetNanos = own.longValue() * 1000000L;
                }
                // The oldest start is the outermost run, so this bounds the
                // whole nest rather than only the innermost call.
                Long oldest = e.getValue().peekFirst();
                if (oldest != null && now - oldest.longValue() > budgetNanos) {
                    // cancel() is idempotent and the run clears it on
                    // the way out, so raising it again on the next sweep of
                    // a still-running handler is harmless.
                    e.getKey().getHost().cancel();
                }
            }
            try {
                Thread.sleep(TICK_MS);
            } catch (InterruptedException stop) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
