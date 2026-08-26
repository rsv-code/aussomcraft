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

import net.kyori.adventure.text.Component;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

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
 * Backs the server extern.
 *
 * Deliberately thin. Untrusted, this is the only way to reach the server at
 * all, so anything added here widens that surface.
 *
 * @author Austin Lehman
 */
public class HostServer {

    public HostServer() { }

    /**
     * Sends a message to every player.
     *
     * @param env is the calling context.
     * @param args holds the message.
     * @return An AussomBool with true, or an AussomException.
     */
    public AussomType broadcast(Environment env, ArrayList<AussomType> args) {
        String msg = Host.str(args, 0);
        if (msg == null) {
            return new AussomException("server.broadcast(): first argument must be a string.");
        }
        Bukkit.broadcast(Component.text(msg));
        return new AussomBool(true);
    }

    /**
     * Sends a message to one player by name.
     *
     * @param env is the calling context.
     * @param args holds the player name and the message.
     * @return An AussomBool with true when the player was online.
     */
    public AussomType tell(Environment env, ArrayList<AussomType> args) {
        String who = Host.str(args, 0);
        String msg = Host.str(args, 1);
        if (who == null || msg == null) {
            return new AussomException("server.tell(): expects a player name and a message.");
        }
        Player p = Bukkit.getPlayerExact(who);
        if (p == null) {
            return new AussomBool(false);
        }
        p.sendMessage(Component.text(msg));
        return new AussomBool(true);
    }

    /**
     * Looks up an online player by name. Every tier gets the same generated
     * shim; what differs is which methods that tier's shim declares.
     *
     * @param env the calling context.
     * @param args the player name.
     * @return The player, or null when offline.
     */
    public AussomType getPlayer(Environment env, ArrayList<AussomType> args) {
        String who = Host.str(args, 0);
        if (who == null) {
            return new AussomException("server.getPlayer(): first argument must be a name string.");
        }
        Player p = Bukkit.getPlayerExact(who);
        if (p == null) {
            return new AussomNull();
        }
        return this.representPlayer(env, p);
    }

    /**
     * Every online player.
     *
     * @param env is the calling context.
     * @param args is unused.
     * @return An AussomList of players, represented per the profile.
     */
    public AussomType getPlayers(Environment env, ArrayList<AussomType> args) {
        AussomList out = new AussomList();
        for (Player p : Bukkit.getOnlinePlayers()) {
            out.add(this.representPlayer(env, p));
        }
        return out;
    }

    /**
     * The name of the script this call came from. Handy in log messages a
     * script writes about itself.
     *
     * @param env is the calling context.
     * @param args is unused.
     * @return An AussomString with the script file name.
     */
    public AussomType scriptName(Environment env, ArrayList<AussomType> args) {
        ScriptContext ctx = Host.context(env);
        if (ctx == null) {
            return new AussomNull();
        }
        return new AussomString(ctx.getName());
    }

    /**
     * A player as its generated shim. Every tier gets the same shape; what
     * differs is which methods the shim has.
     */
    private AussomType representPlayer(Environment env, Player P) {
        ScriptContext ctx = Host.context(env);
        AussomCraftPlugin plugin = Host.plugin();
        if (ctx == null || plugin == null) {
            return new AussomNull();
        }
        return plugin.shimFor(ctx, P);
    }
}
