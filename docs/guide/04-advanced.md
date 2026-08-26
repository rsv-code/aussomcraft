# Advanced

This page covers the dangerous level, keeping your scripts fast, and dealing
with scripts you did not write.

## The dangerous level

There are three levels. You have seen two. The third is called **dangerous**,
and the name is the honest one.

A script at this level can do anything the server itself can do. It can read
and write files on your computer. It can use the network. It can make anyone
an operator. It can shut the server down. If you approve a script at this
level and the script is hostile, nothing in AussomCraft will stop it.

Approve one like this:

```
acraft trust myscript.aus dangerous
```

That needs the `aussomcraft.dangerous` permission, which is separate from
ordinary approval on purpose.

Only do this for scripts you wrote yourself, or that you have read line by
line and understood.

### What it unlocks

Two things. First, parts of the server that the lower levels hold back:

```
include paper.dangerous.Bukkit;
```

Second, a tool called **AJI**, which reaches any Java code on the server. That
includes other plugins:

```
include aji;

class Main {
    public main() {
        console = aji.invokeStatic("org.bukkit.Bukkit", "getConsoleSender");
        aji.invokeStatic("org.bukkit.Bukkit", "dispatchCommand", console, "say hi");
    }
}
```

That runs a server command as the console. It is also exactly the line a
malicious script would use to make its author an operator, which is why this
level exists as its own thing.

Reach for it when you need to talk to another plugin, or use a Java library.
For anything inside the game world, trusted is enough and much safer.

## Keeping scripts fast

Minecraft does everything in ticks, 20 per second. Your event handlers run
inside a tick. While your code is running, the server is doing nothing else.
A slow handler makes the whole server stutter for everyone.

This matters most for events that happen constantly. `PlayerJoinEvent` fires a
few times an hour. `BlockBreakEvent` can fire hundreds of times a second when
someone is mining.

Some habits that help:

**Check the cheap thing first.**

```
    public onBreak(Evt) {
        if (Evt.getBlock().getType() != "DIAMOND_ORE") { return; }
        // the expensive part only runs for diamond ore
    }
```

**Do not loop over every player on every event.** If a block-break handler
loops over 80 players, that is 80 times the work, hundreds of times a second.

**Do not put long waits in a handler.** There is no reason to make the server
wait. If you want something to happen later, use `sched.later`.

### The time limit

AussomCraft watches how long each handler takes. If one runs too long it gets
stopped, and you see this:

```
Script 'myscript.aus' exceeded its 250ms budget in events.on("BlockBreakEvent")
```

This almost always means a loop that never ends. Look for a `while` whose
condition never becomes false.

If a script keeps overrunning, AussomCraft switches it off rather than letting
it cost time forever. Fix it and reload.

You can change the limit in `plugins/AussomCraft/config.yml`:

```yaml
watchdog:
  budget-ms: 250
  max-cancels: 20
```

Raising it is rarely the right fix. The limit exists so one bad script cannot
freeze your server.

## Loading and unloading

| Command | What it does |
| --- | --- |
| `acraft reload` | reload everything |
| `acraft load <file> [--as <tier>]` | load or reload one script, including one that is new |
| `acraft unload <file>` | stop one script |

`reload` drops every script and reads the folder again. `load` takes one
file and leaves the rest alone. On a server with several scripts running,
that difference matters: reloading everything stops and restarts timers and
handlers that were working fine, so prefer `load` when one script changed.

Nothing watches the scripts folder. A file you copy in while the server is
running does nothing until you say so, and it will not appear in
`acraft list` either. You do not have to reload everything to pick it up:
`acraft load <file>` works on a file that has never been loaded, so adding a
script is one command and it disturbs nothing else.

Unloading is thorough. Your event handlers are removed, your timers are
cancelled, and your commands are taken away. The script stops completely.

This works because AussomCraft handed out those registrations in the first
place, so it knows exactly what to take back. That is also why `events`,
`cmd` and `sched` are the only ways to register things. If a script could
register a handler some other way, unloading it would leave that handler
running.

Values in `store` survive an unload, because they are on disk. Values kept in
`this.something` do not.

## Reading the API documentation

The [API reference](..) has a page for every type you can use, with every
function, what it takes, and what it gives back. It is generated from your
server's own API, so it matches your server version exactly.

The pages say what each function takes and returns, but not what it does.
For that, every entry links to Minecraft's own documentation for the same
method. Follow the link when a name is not obvious.

Look in [paper/trusted](../paper/trusted/) for the level you are working at,
then the type name. `Player.aus.md` lists everything you can ask a player.

[host/craft.aus.md](../host/craft.aus.md) covers `events`, `cmd`, `sched`,
`store` and `server` - the five built-in tools.

## Scripts other people wrote

This is what the levels are really for.

When you get a script from a forum, a friend, or a download, put it in your
scripts folder and run `acraft load <file>`. It runs at **untrusted**. It can watch and it can
talk, and it cannot do anything else. You can leave it that way indefinitely
and it cannot hurt you.

If it needs more, it will say so in the console. Before you approve it:

**Read it.** These files are short and plain text. You do not have to
understand every line. Look for anything that does not match what the script
claims to be. A join-message script has no reason to mention `aji`,
`Bukkit`, `dispatchCommand`, `op`, or files.

**Give the smallest level that works.** Try `trusted` first. Only go to
`dangerous` if it genuinely will not run otherwise, and then read it much more
carefully.

**Remember the file is what you approved.** If the author sends an update, it
arrives untrusted and you approve it again after reading the changes. That is
the system working.

### Being honest about the limit

A trusted script cannot reach your files or your network. That is enforced,
not advice.

A dangerous script has no such limits. Approving one is a real decision, and
AussomCraft's protection is that the decision is explicit, recorded in the
log with your name on it, and impossible to make by accident. It is not that
the script is somehow contained afterwards.

## Sharing your own scripts

Say what level yours needs and why. "Needs trusted, because it teleports
players" tells a server owner what they need to know in one line. If yours
needs dangerous, say what for.

Keep them short. A person reading a script before approving it is far more
likely to actually read fifty lines than five hundred.

## When something goes wrong

**Nothing happens at all.** Run `acraft list`. If your script is not there it
did not load, and the console will say why.

**"has parse errors".** A typo. The console gives a line number.

**"needs the trusted profile".** It wants a higher level. See above.

**A handler stops partway with no message.** Something in it failed. Add
`c.log` lines to see how far it gets.

**Changes do nothing.** You saved the file but did not load it again:
`acraft load <file>`. Or you edited the copy in your project folder instead
of the one in `plugins/AussomCraft/scripts/`.

**A script you added is not listed.** Copying a file into the scripts folder
does not load it. Nothing watches the folder. Run `acraft load <file>`.
