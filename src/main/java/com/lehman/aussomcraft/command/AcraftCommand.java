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

package com.lehman.aussomcraft.command;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import com.lehman.aussomcraft.AussomCraftPlugin;
import com.lehman.aussomcraft.profile.Profile;
import com.lehman.aussomcraft.script.ScriptContext;
import com.lehman.aussomcraft.trust.TrustStore;

/**
 * The /acraft command: reload, load, unload, list, trust, untrust.
 *
 * Elevation lives here, nowhere a script can reach. Both trust and
 * run --trusted need aussomcraft.trust, since a run that picked its own
 * profile freely would be the escalation path the trust store exists to
 * close.
 *
 * @author Austin Lehman
 */
public class AcraftCommand implements CommandExecutor, TabCompleter {

    /** Permission required to give a script the trusted tier. */
    public static final String TRUST_PERMISSION = "aussomcraft.trust";

    /**
     * Permission required to give a script the dangerous tier. Separate from
     * TRUST_PERMISSION on purpose: trusted is the working tier, while
     * dangerous can take over the server.
     */
    public static final String DANGEROUS_PERMISSION = "aussomcraft.dangerous";

    /** Permission required to reload and list. */
    public static final String ADMIN_PERMISSION = "aussomcraft.admin";

    private final AussomCraftPlugin plugin;

    /**
     * Builds the command handler.
     *
     * @param Plugin is the plugin.
     */
    public AcraftCommand(AussomCraftPlugin Plugin) {
        this.plugin = Plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label,
            String[] args) {
        if (!this.anyPermission(sender)) {
            sender.sendMessage("You need " + ADMIN_PERMISSION + " to do that.");
            return true;
        }
        if (args.length == 0) {
            this.usage(sender);
            return true;
        }

        String sub = args[0].toLowerCase(Locale.ROOT);
        if (sub.equals("reload")) {
            return this.reload(sender);
        }
        if (sub.equals("load")) {
            return this.load(sender, args);
        }
        if (sub.equals("unload")) {
            return this.unload(sender, args);
        }
        if (sub.equals("list")) {
            return this.list(sender);
        }
        if (sub.equals("trust")) {
            return this.trust(sender, args);
        }
        if (sub.equals("untrust")) {
            return this.untrust(sender, args);
        }
        this.usage(sender);
        return true;
    }

    private boolean reload(CommandSender sender) {
        if (!this.allowed(sender, ADMIN_PERMISSION)) {
            return true;
        }
        for (String line : this.plugin.reloadScripts()) {
            sender.sendMessage(line);
        }
        return true;
    }

    /** Reads a script that is not loaded yet, or reloads one that is. */
    /**
     * Loads or reloads one script.
     *
     * '--as <tier>' loads it at a named tier for this load only, without
     * writing to the trust store. That is a different thing from a grant,
     * and it is a modifier rather than a verb of its own because the way to
     * stop it is 'unload', the same as for any other load. It used to be a
     * separate 'run' command, which read as a second way to start a script
     * and had no matching way to stop one.
     */
    private boolean load(CommandSender sender, String[] args) {
        if (args.length < 2) {
            sender.sendMessage("Usage: /acraft load <script.aus>"
                + " [--as untrusted|trusted|dangerous]");
            return true;
        }

        // No override means "however this script is granted", which is what
        // reload does for every script.
        Profile as = null;
        for (int i = 2; i < args.length; i++) {
            if (args[i].equalsIgnoreCase("--as")) {
                if (i + 1 >= args.length) {
                    sender.sendMessage("--as needs a tier:"
                        + " untrusted, trusted or dangerous.");
                    return true;
                }
                as = Profile.byId(args[i + 1].toLowerCase(Locale.ROOT));
                if (as == null) {
                    sender.sendMessage("Unknown tier: " + args[i + 1]
                        + ". Use untrusted, trusted or dangerous.");
                    return true;
                }
            }
        }

        // Loading something at an elevated tier on demand is elevation, so it
        // needs the same permission granting that tier does. Without this the
        // override would be a way around the trust store entirely.
        if (as != null && as != Profile.UNTRUSTED) {
            if (!this.allowed(sender, this.permissionFor(as))) {
                return true;
            }
        } else if (!this.allowed(sender, ADMIN_PERMISSION)) {
            return true;
        }

        Path p = this.scriptPath(args[1]);
        if (p == null) {
            sender.sendMessage("No such script: " + args[1]);
            return true;
        }

        ScriptContext ctx = this.plugin.runOnce(p, as);
        if (ctx == null) {
            String how = "as granted";
            if (as != null) {
                how = "as " + as.getId();
            }
            sender.sendMessage(p.getFileName() + " did not load " + how
                + ". See the log for why.");
            return true;
        }
        String note = "";
        if (as != null) {
            note = " for this load only; /acraft reload puts it back to its grant";
        }
        sender.sendMessage(ctx.getName() + " is now " + ctx.getProfile().getId()
            + note + ".");
        return true;
    }

    /** Detaches a script and stops it. */
    private boolean unload(CommandSender sender, String[] args) {
        if (!this.allowed(sender, ADMIN_PERMISSION)) {
            return true;
        }
        if (args.length < 2) {
            sender.sendMessage("Usage: /acraft unload <script.aus>");
            return true;
        }
        String name = new File(args[1]).getName();
        if (!name.endsWith(".aus")) {
            name = name + ".aus";
        }
        if (!this.plugin.unloadScript(name)) {
            sender.sendMessage(name + " is not loaded.");
            return true;
        }
        this.plugin.getLogger().info(sender.getName() + " unloaded '" + name + "'");
        sender.sendMessage("Unloaded " + name + ".");
        return true;
    }

    private boolean list(CommandSender sender) {
        if (!this.allowed(sender, ADMIN_PERMISSION)) {
            return true;
        }
        for (ScriptContext ctx : this.plugin.getScripts().values()) {
            String line = ctx.getName() + "  " + ctx.getProfile().getId()
                + "  sha256 " + TrustStore.shortHash(ctx.getHash());
            if (ctx.isDisabled()) {
                line = line + "  DISABLED";
            }
            sender.sendMessage(line);
        }

        // A script that failed to load is not in the loaded map, and simply
        // leaving it out makes it look as though the file is not there.
        int failed = 0;
        try {
            for (Path p : this.plugin.getLoader().discover()) {
                String name = p.getFileName().toString();
                if (!this.plugin.getScripts().containsKey(name)) {
                    sender.sendMessage(name + "  FAILED TO LOAD, see the log");
                    failed++;
                }
            }
        } catch (IOException e) {
            sender.sendMessage("Could not read the scripts directory: " + e.getMessage());
        }

        if (this.plugin.getScripts().isEmpty() && failed == 0) {
            sender.sendMessage("No scripts found.");
        }
        return true;
    }

    /**
     * Reloads one script and reports what it came back as, so a grant takes
     * effect on the command that made it rather than on a later reload.
     */
    private boolean trust(CommandSender sender, String[] args) {
        if (args.length < 2) {
            sender.sendMessage("Usage: /acraft trust <script.aus> [trusted|dangerous]");
            return true;
        }

        Profile want = Profile.TRUSTED;
        if (args.length > 2) {
            want = Profile.byId(args[2]);
            if (want == null || want == Profile.UNTRUSTED) {
                sender.sendMessage("Grant a tier of trusted or dangerous."
                    + " To remove a grant use /acraft untrust.");
                return true;
            }
        }
        if (!this.allowed(sender, this.permissionFor(want))) {
            return true;
        }

        Path p = this.scriptPath(args[1]);
        if (p == null) {
            sender.sendMessage("No such script: " + args[1]);
            return true;
        }

        String hash;
        try {
            hash = TrustStore.hashOf(p);
        } catch (IOException e) {
            sender.sendMessage("Could not read " + args[1] + ": " + e.getMessage());
            return true;
        }

        this.plugin.getTrustStore().grant(hash, want,
            p.getFileName().toString(), sender.getName());
        if (!this.saveTrust(sender)) {
            return true;
        }

        // Logged at the server, not just answered to the sender, because
        // elevation is the one action here worth being able to audit later.
        this.plugin.getLogger().warning(sender.getName() + " granted " + want.getId()
            + " to '" + p.getFileName() + "' (sha256 " + hash + ")");
        sender.sendMessage("Granted " + want.getId() + " to " + p.getFileName()
            + " (sha256 " + TrustStore.shortHash(hash) + ").");
        this.applyTo(sender, p);
        sender.sendMessage("Editing the file revokes this.");
        return true;
    }

    /** The permission a tier grant requires. */
    private String permissionFor(Profile P) {
        if (P == Profile.DANGEROUS) {
            return DANGEROUS_PERMISSION;
        }
        return TRUST_PERMISSION;
    }

    private boolean untrust(CommandSender sender, String[] args) {
        if (!this.allowed(sender, TRUST_PERMISSION)) {
            return true;
        }
        if (args.length < 2) {
            sender.sendMessage("Usage: /acraft untrust <script.aus>");
            return true;
        }
        Path p = this.scriptPath(args[1]);
        if (p == null) {
            sender.sendMessage("No such script: " + args[1]);
            return true;
        }
        String hash;
        try {
            hash = TrustStore.hashOf(p);
        } catch (IOException e) {
            sender.sendMessage("Could not read " + args[1] + ": " + e.getMessage());
            return true;
        }
        if (!this.plugin.getTrustStore().revoke(hash)) {
            sender.sendMessage(p.getFileName() + " was not granted anything.");
            return true;
        }
        if (!this.saveTrust(sender)) {
            return true;
        }
        this.plugin.getLogger().warning(sender.getName() + " revoked trust for '"
            + p.getFileName() + "' (sha256 " + hash + ")");
        sender.sendMessage("Revoked.");
        this.applyTo(sender, p);
        return true;
    }

    /**
     * Reloads a script at whatever tier it is now granted, and says what
     * that turned out to be. Used after a grant changes, so the running
     * script matches the store without the operator having to reload it.
     *
     * @param sender is who to answer.
     * @param ScriptPath is the script whose grant just changed.
     */
    private void applyTo(CommandSender sender, Path ScriptPath) {
        ScriptContext ctx = this.plugin.runOnce(ScriptPath, null);
        if (ctx == null) {
            sender.sendMessage(ScriptPath.getFileName()
                + " is stopped and not running. See the log for why.");
            return;
        }
        sender.sendMessage(ctx.getName() + " is now " + ctx.getProfile().getId() + ".");
    }

    private boolean saveTrust(CommandSender sender) {
        try {
            this.plugin.getTrustStore().save();
            return true;
        } catch (IOException e) {
            sender.sendMessage("Could not write the trust file: " + e.getMessage());
            return false;
        }
    }

    /**
     * Resolves a script name to a path inside the script directory. Reduced to
     * its file name first, so a relative path cannot reach outside.
     *
     * @param Name what the sender typed.
     * @return A Path, or null when no such script exists.
     */
    private Path scriptPath(String Name) {
        String bare = new File(Name).getName();
        if (!bare.endsWith(".aus")) {
            bare = bare + ".aus";
        }
        File f = new File(this.plugin.getScriptDir(), bare);
        if (!f.isFile()) {
            return null;
        }
        return f.toPath();
    }

    /**
     * Whether the sender has any business with this command at all.
     *
     * The command carries no permission in plugin.yml, so every sender
     * reaches this class. Each action checks its own permission, but the
     * usage text and the tab completions are answered before any action is
     * chosen, and the completions list every script file on the server.
     *
     * @param sender is who ran the command.
     * @return A boolean with true when the sender holds any of the three.
     */
    private boolean anyPermission(CommandSender sender) {
        return sender.hasPermission(ADMIN_PERMISSION)
            || sender.hasPermission(TRUST_PERMISSION)
            || sender.hasPermission(DANGEROUS_PERMISSION);
    }

    private boolean allowed(CommandSender sender, String Permission) {
        if (sender.hasPermission(Permission)) {
            return true;
        }
        sender.sendMessage("You need " + Permission + " to do that.");
        return false;
    }

    private void usage(CommandSender sender) {
        sender.sendMessage("/acraft reload            reload every script");
        sender.sendMessage("/acraft load <script> [--as <tier>]");
        sender.sendMessage("                          load or reload one script."
            + " --as runs it at that tier for this load only");
        sender.sendMessage("/acraft unload <script>   detach and stop one script");
        sender.sendMessage("/acraft list              show loaded scripts and profiles");
        sender.sendMessage("/acraft trust <script> [trusted|dangerous]");
        sender.sendMessage("/acraft untrust <script>  revoke that grant");
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command,
            String label, String[] args) {
        List<String> out = new ArrayList<String>();
        // Completing at all tells the sender which scripts exist, so this is
        // answered with the same permission the actions need.
        if (!this.anyPermission(sender)) {
            return Collections.emptyList();
        }
        if (args.length == 1) {
            for (String s : new String[] { "reload", "load", "unload", "list",
                    "trust", "untrust" }) {
                if (s.startsWith(args[0].toLowerCase(Locale.ROOT))) {
                    out.add(s);
                }
            }
            return out;
        }
        if (args.length == 2) {
            // Through the loader, so what completes is exactly what would
            // load. Listing the directory here meant a second definition of
            // what counts as a script, which could disagree with the first.
            try {
                for (Path p : this.plugin.getLoader().discover()) {
                    String f = p.getFileName().toString();
                    if (f.startsWith(args[1])) {
                        out.add(f);
                    }
                }
            } catch (IOException unreadable) {
                // Completion is a convenience. A directory that cannot be
                // read is reported when a command actually runs.
            }
            return out;
        }
        if (args.length == 3 && args[0].equalsIgnoreCase("load")) {
            out.add("--as");
            return out;
        }
        if (args.length == 4 && args[0].equalsIgnoreCase("load")
                && args[2].equalsIgnoreCase("--as")) {
            for (Profile p : Profile.values()) {
                out.add(p.getId());
            }
            return out;
        }
        return Collections.emptyList();
    }
}
