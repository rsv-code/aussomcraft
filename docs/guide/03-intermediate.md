# Intermediate

You can react to events now. This page covers the other three things almost
every script needs: your own commands, doing things on a timer, and
remembering data. Then it covers getting a script approved so it can change
the world.

## Your own commands

One line registers a command:

```
class Main {
    public main() {
        cmd.register("hello", ::onHello);
    }

    public onHello(Sender, Args) {
        Sender.sendMessage("Hello there!");
    }
}
```

Reload, then type `/hello` in the game.

Two names are taken already and you cannot use them. Anything a plugin on
your server has registered stays with that plugin, and a short list of names
that usually carry a password or a private message, `login` and `msg` among
them, is refused outright. The console tells you if you hit either. Both are
there so a script you have not read cannot answer a command your players
type out of habit.

Your function gets two things. `Sender` is whoever typed the command.
`Args` is a list of anything they typed after it. If someone types
`/hello there friend`, then `Args` holds `there` and `friend`.

Using the extra words:

```
    public onHello(Sender, Args) {
        if (#Args > 0) {
            Sender.sendMessage("Hello, " + Args[0] + "!");
        } else {
            Sender.sendMessage("Hello there!");
        }
    }
```

`#Args` means "how many items are in Args". `Args[0]` is the first one.
Counting starts at zero, so the first item is number 0, the second is 1, and
so on. That trips up everybody at first.

## Doing something later, or over and over

Minecraft measures time in **ticks**. There are 20 ticks in a second. So:

- 20 ticks = 1 second
- 1200 ticks = 1 minute
- 6000 ticks = 5 minutes

Run something once, after a wait:

```
sched.later(100, ::remind);
```

That runs `remind` after 100 ticks, which is five seconds.

Run something over and over:

```
sched.repeat(6000, ::announce);
```

That runs `announce` every five minutes. Note it waits the full time before
the first run too, so nothing happens for five minutes.

A repeating announcement:

```
class Main {
    public main() {
        sched.repeat(6000, ::announce);
    }

    public announce() {
        server.broadcast("Remember to set your home with /sethome.");
    }
}
```

## Remembering things

Variables inside a function disappear when the function ends. To keep
something between events, you have two choices.

### Values that live as long as the script

Put the value in the class, outside any function:

```
class Main {
    public joins = 0;

    public main() {
        events.on("PlayerJoinEvent", ::onJoin);
    }

    public onJoin(Evt) {
        this.joins = this.joins + 1;
        server.broadcast("That is visit number " + this.joins.toString());
    }
}
```

`this.joins` means "the `joins` that belongs to this script". The `this.` part
is required. Without it Aussom thinks you mean a brand new variable that only
exists in that function.

This value is lost when the server stops or you reload.

### Values that survive a restart

Use `store`:

```
store.set("total", 5);
value = store.get("total");
```

`store` belongs to your script alone. Another script cannot see it. It is
written to disk, so it is still there tomorrow.

A visit counter that actually remembers:

```
class Main {
    public main() {
        events.on("PlayerJoinEvent", ::onJoin);
    }

    public onJoin(Evt) {
        player = Evt.getPlayer();
        name = player.getName();

        visits = store.get(name);
        if (visits == null) { visits = 0; }
        visits = visits + 1;
        store.set(name, visits);

        player.sendMessage("Welcome back. Visit number " + visits.toString() + ".");
    }
}
```

The `if (visits == null)` line matters. The first time a player joins there is
nothing stored for them, and `store.get` gives back `null`, which means
"nothing here". Adding one to nothing is an error, so we turn it into zero
first.

You can store text, numbers, true and false, lists, and maps. You cannot
store a player or a block. Store the player's name instead, as above.

## Reading more from an event

Events carry details. You get at them the same way: with a dot.

```
    public onBreak(Evt) {
        player = Evt.getPlayer();
        block = Evt.getBlock();
        kind = block.getType();

        if (kind == "DIAMOND_ORE") {
            server.broadcast(player.getName() + " found diamonds!");
        }
    }
```

Block types are written in capitals with underscores: `DIAMOND_ORE`,
`OAK_LOG`, `ANCIENT_DEBRIS`. It is the Minecraft name in capitals. If you are
not sure, press F3 in the game while looking at a block.

A useful trick when you are exploring: print what you get.

```
    c.log("block type is " + block.getType());
```

Then read the console. This is the fastest way to find out what an event
actually gives you.

## Lists and loops

A list holds several values:

```
public watched = ["DIAMOND_ORE", "EMERALD_ORE", "ANCIENT_DEBRIS"];
```

Doing something to each item:

```
    for (item : this.watched) {
        c.log("watching " + item);
    }
```

Read `for (item : this.watched)` as "for each item in watched". Inside the
braces, `item` is one entry, and the block runs once per entry.

Checking whether something is in a list:

```
    if (this.watched.contains(kind)) {
        server.broadcast("Careful with that " + kind + "!");
    }
```

## Making a script trusted

Everything so far only looked at things and sent messages. That is the
untrusted level. To change the world - move a player, give an item, place a
block - the script needs to be **trusted**.

Say you write `home.aus` that teleports a player. Reload, and the console
says the script is not running because it needs a higher level. Approve it:

```
acraft trust home.aus
```

The console confirms it and the script starts working right away. You do not
need to reload.

Check what level things are at any time:

```
acraft list
```

### The rule that keeps this safe

Your approval is tied to the exact file you approved. Edit the file, even by
one character, and it drops back to untrusted on its own. You will see it in
the console next time it loads.

That is on purpose. It means nobody can show you a harmless script, get you
to approve it, and then change it afterwards. It also means that after you
edit your own script you have to approve it again. That is a small annoyance
in exchange for a real protection.

### What trusted still cannot do

A trusted script can do anything inside the game world. It cannot read or
write files on your computer, cannot use the network, and cannot control the
server itself. Those need the dangerous level, which is covered in
[Advanced](04-advanced.md).

## Using types that are not built in

Most things you need are ready to use: players, blocks, worlds, locations,
items, inventories. If you need something less common, add one line at the
top of your file:

```
include paper.trusted.Chunk;
```

That is the tier name, then the type name. If your script is untrusted, use
`paper.untrusted.` instead.

You will know you need this if the console says a class was not found.

## A complete example

A `/sethome` and `/home` pair. This one needs to be trusted, because
teleporting changes the world.

```
class Main {
    public main() {
        cmd.register("sethome", ::onSetHome);
        cmd.register("home", ::onHome);
    }

    public onSetHome(Sender, Args) {
        loc = Sender.getLocation();
        name = Sender.getName();

        store.set(name + ".world", loc.getWorld().getName());
        store.set(name + ".x", loc.getX());
        store.set(name + ".y", loc.getY());
        store.set(name + ".z", loc.getZ());

        Sender.sendMessage("Home set.");
    }

    public onHome(Sender, Args) {
        name = Sender.getName();
        if (!store.has(name + ".world")) {
            Sender.sendMessage("You have no home. Use /sethome first.");
            return;
        }

        loc = Sender.getLocation();
        loc.setX(store.get(name + ".x"));
        loc.setY(store.get(name + ".y"));
        loc.setZ(store.get(name + ".z"));

        Sender.teleport(loc);
        Sender.sendMessage("Welcome home.");
    }
}
```

Worth noticing: we store four separate simple values rather than the location
itself, because a location cannot be saved directly. This is the usual
pattern. Break the thing down into text and numbers, save those, and rebuild
it when you need it.

## Next

**[Advanced](04-advanced.md)** covers the dangerous level, keeping scripts
fast, and how to handle scripts other people wrote.
