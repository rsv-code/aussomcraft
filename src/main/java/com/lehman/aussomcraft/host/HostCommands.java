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

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.aussom.Environment;
import com.aussom.types.AussomBool;
import com.aussom.types.AussomCallback;
import com.aussom.types.AussomException;
import com.aussom.types.AussomList;
import com.aussom.types.AussomNull;
import com.aussom.types.AussomMap;
import com.aussom.types.AussomString;
import com.aussom.types.AussomType;

import com.lehman.aussomcraft.AussomCraftPlugin;
import com.lehman.aussomcraft.profile.Profile;
import com.lehman.aussomcraft.script.ScriptContext;

/**
 * Backs the cmd extern.
 *
 * Commands go into the server's CommandMap rather than plugin.yml, because a
 * script's commands are not known until the script has run.
 *
 * @author Austin Lehman
 */
public class HostCommands {

    public HostCommands() { }

    /**
     * Registers a command.
     *
     * @param env is the calling context.
     * @param args holds the command name and the callback.
     * @return An AussomBool with true, or an AussomException on failure.
     */
    public AussomType register(Environment env, ArrayList<AussomType> args) {
        ScriptContext ctx = Host.context(env);
        AussomCraftPlugin plugin = Host.plugin();
        if (ctx == null || plugin == null) {
            return new AussomException("cmd.register(): not running inside a loaded script.");
        }

        String name = Host.str(args, 0);
        if (name == null || name.trim().isEmpty()) {
            return new AussomException("cmd.register(): first argument must be a command name string.");
        }
        if (args.size() < 2 || !(args.get(1) instanceof AussomCallback)) {
            return new AussomException("cmd.register(): second argument must be a callback.");
        }
        final AussomCallback cb = (AussomCallback) args.get(1);
        final String cmdName = name.trim();
        final String prefix = stripExtension(ctx.getName());

        // A name the server keeps for itself.
        //
        // Bukkit already refuses to hand over a command something else owns,
        // and scripts load after every plugin has registered, so a real owner
        // always wins. What neither of those settles is a sensitive name
        // nobody happens to own right now: a script can take `login` on a
        // server whose authentication plugin is absent, and be handed what
        // players type at it.
        //
        // No script has a reason to answer `/login`, so it is refused rather
        // than worked around. The dangerous tier is exempt: a script there
        // can do anything already, and somebody writing their own login
        // system is entitled to.
        if (ctx.getProfile() != Profile.DANGEROUS && plugin.isProtectedCommand(cmdName)) {
            return new AussomException("cmd.register(): '" + cmdName
                + "' is a protected command name. Names like this carry"
                + " passwords or private messages, so a script may not answer"
                + " them. See commands.protected in config.yml.");
        }

        Command cmd = new Command(cmdName) {
            @Override
            public boolean execute(CommandSender sender, String label, String[] cmdArgs) {
                AussomList cargs = new AussomList();
                cargs.add(senderToAussom(ctx, sender));
                AussomList rest = new AussomList();
                for (String a : cmdArgs) {
                    rest.add(new AussomString(a));
                }
                cargs.add(rest);
                plugin.getRunner().run(ctx, cb, cargs,
                    "cmd.register(\"" + cmdName + "\")");
                return true;
            }
        };
        cmd.setDescription("Registered by AussomCraft script " + ctx.getName());

        // The script name is the fallback prefix, so two scripts registering
        // the same command still both work as /script:name.
        boolean ok = Bukkit.getCommandMap().register(prefix, cmd);
        ctx.addCommand(cmd);
        // Recorded so an operator reading a script can see what it took.
        String how = "";
        if (!ok) {
            how = " (as /" + prefix + ":" + cmdName + "; the bare name was taken)";
        }
        plugin.getLogger().info("'" + ctx.getName() + "' registered /" + cmdName + how);
        return new AussomBool(ok);
    }

    /**
     * A command sender as its generated shim. A console sender has no shim
     * below the dangerous tier, so a script gets null there rather than a
     * handle on the console.
     */
    private static AussomType senderToAussom(ScriptContext Context, CommandSender Sender) {
        AussomCraftPlugin plugin = Host.plugin();
        if (plugin == null) {
            return new AussomNull();
        }
        return plugin.shimFor(Context, Sender);
    }

    private static String stripExtension(String Name) {
        int dot = Name.lastIndexOf('.');
        if (dot > 0) {
            return Name.substring(0, dot);
        }
        return Name;
    }

    /**
     * Command names currently registered by a script.
     *
     * @param Context is the script.
     * @return A List of command names.
     */
    public static List<String> namesFor(ScriptContext Context) {
        List<String> out = new ArrayList<String>();
        for (Command c : Context.getCommands()) {
            out.add(c.getName());
        }
        return out;
    }
}
