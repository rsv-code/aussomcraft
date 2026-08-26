# Getting Started

This page gets you from nothing to a working script. Read it in order.

## 1. Install the plugin

Put `AussomCraft-0.1.0.jar` into your server's `plugins` folder and start the
server. You should see a line like this in the console:

```
[AussomCraft] Enabling AussomCraft v0.1.0
```

The plugin makes a folder for itself the first time it runs:

```
plugins/AussomCraft/
    scripts/        your scripts go here
    trust.yml       which scripts you have approved
    store.yml       data your scripts have saved
    config.yml      settings
```

## 2. Write your first script

Make a file called `hello.aus` in `plugins/AussomCraft/scripts/`. Put this in
it:

```
class Main {
    public main() {
        c.log("Hello from my first script!");
    }
}
```

Save it. In the server console, type:

```
acraft reload
```

You should see your message in the console:

```
[AussomCraft] [hello.aus] Hello from my first script!
```

If you are typing in the game chat instead of the console, put a slash in
front: `/acraft reload`. In the console there is no slash.

`acraft reload` restarts every script you have. Once you have more than one,
`acraft load hello.aus` is the better habit: it picks up that one file and
leaves the others running. It works on a brand new file too, so this is also
how you add a script without restarting anything.

## 3. What that script actually says

Every line is doing something. Here it is again, one piece at a time.

```
class Main {
```

A **class** is a container that holds your code. AussomCraft looks for one
named `Main`. The `{` opens it and the matching `}` at the bottom closes it.
Think of the braces like a folder holding everything inside.

```
    public main() {
```

A **function** is a named block of instructions. This one is called `main`.
AussomCraft runs `main` once, as soon as your script loads. `public` means
AussomCraft is allowed to call it. The empty `()` means it takes no
information from the outside.

```
        c.log("Hello from my first script!");
```

This is the instruction. `c.log` writes a line to the server console. The
text in quotes is what gets written. The semicolon `;` ends the instruction,
the way a period ends a sentence.

That is the whole script. There is no line at the end saying it finished.
When the last instruction in a function runs, the function is done.

## 4. Reacting to things: events

A script that only runs once is not very useful. Most of the time you want
your script to react when something happens. A player joins. A block breaks.
Someone sends a chat message.

Each of those is called an **event**. Minecraft announces an event every time
one of these things happens, and your script can ask to be told.

Asking to be told is one line:

```
events.on("PlayerJoinEvent", ::onJoin);
```

Read it as: *when a `PlayerJoinEvent` happens, run my function called
`onJoin`.*

The two colons in `::onJoin` matter. They mean "the function named onJoin",
not "run onJoin right now". You are handing AussomCraft the function so it
can run it later, each time the event happens.

## 5. A welcome message

Make a file called `welcome.aus`:

```
class Main {
    public main() {
        events.on("PlayerJoinEvent", ::onJoin);
    }

    public onJoin(Evt) {
        name = Evt.getPlayer().getName();
        server.broadcast("Welcome, " + name + "!");
    }
}
```

Reload, then leave and rejoin your server. Everyone sees the welcome.

Two new things here.

**`onJoin(Evt)` takes something.** When the event happens, AussomCraft hands
your function the event itself. `Evt` is the name we chose for it. You could
call it anything.

**`Evt.getPlayer().getName()`** reads left to right. Take the event, ask it
for the player, ask that player for their name. Each dot means "ask this
thing for". You will use this shape constantly.

The `+` joins pieces of text together. `"Welcome, " + name + "!"` becomes
`Welcome, Steve!`.

### How did I know the event had `getPlayer`?

Fair question. Nothing so far told you what an event holds. There is a page
for every one of them.

The event is called `PlayerJoinEvent`, so its page is
[PlayerJoinEvent](../paper/untrusted/PlayerJoinEvent.aus.md). Open it and you
will see everything you can ask a join event, which is not much:

- `getPlayer` - the player who joined
- `getJoinMessage` - the message Minecraft was going to show
- `getEventName` - the name of the event
- `isAsynchronous` - whether it ran off the main thread

`getPlayer` gives you back a player, and a player has a page too:
[Player](../paper/untrusted/Player.aus.md). That one is long, because there
is a lot you can ask a player. `getName` is in there, along with
`sendMessage`, `getLocation`, and many more.

That is the pattern for everything in this guide. When you have something and
want to know what you can do with it, find its page. The
[reference](..) lists them all, grouped by level.

Two things to know when you look:

- The pages are grouped by level, so `untrusted` shows only what an
  unapproved script may use. The `trusted` and `dangerous` folders list more.
- Each entry shows what it takes and what it gives back, and links to
  Minecraft's own page for that method if you want the full description.

## 6. Saving a value

A variable is a name for a value you want to use later:

```
name = Evt.getPlayer().getName();
```

That means: ask for the name, and remember it as `name`. After that line you
can write `name` anywhere you want that text. You do not have to say what
kind of thing it is. Aussom works it out.

We could have skipped the variable and written it in one line. The variable
is there because it reads better, which matters more than it sounds.

## 7. Saying goodbye too

Handling a second event is another `events.on` line and another function:

```
class Main {
    public main() {
        events.on("PlayerJoinEvent", ::onJoin);
        events.on("PlayerQuitEvent", ::onQuit);
    }

    public onJoin(Evt) {
        server.broadcast(Evt.getPlayer().getName() + " joined.");
    }

    public onQuit(Evt) {
        server.broadcast(Evt.getPlayer().getName() + " left.");
    }
}
```

## 8. Which events can I use?

An unapproved script gets a short list, chosen to cover what small scripts
actually do. These are all of them:

| Event name | Happens when |
| --- | --- |
| [`PlayerJoinEvent`](../paper/untrusted/PlayerJoinEvent.aus.md) | a player joins |
| [`PlayerQuitEvent`](../paper/untrusted/PlayerQuitEvent.aus.md) | a player leaves |
| [`AsyncPlayerChatEvent`](../paper/untrusted/AsyncPlayerChatEvent.aus.md) | a player sends a chat message |
| [`AsyncChatEvent`](../paper/untrusted/AsyncChatEvent.aus.md) | the same, on newer servers |
| [`PlayerDeathEvent`](../paper/untrusted/PlayerDeathEvent.aus.md) | a player dies |
| [`PlayerRespawnEvent`](../paper/untrusted/PlayerRespawnEvent.aus.md) | a player respawns |
| [`BlockBreakEvent`](../paper/untrusted/BlockBreakEvent.aus.md) | a block is broken |
| [`BlockPlaceEvent`](../paper/untrusted/BlockPlaceEvent.aus.md) | a block is placed |
| [`PlayerInteractEvent`](../paper/untrusted/PlayerInteractEvent.aus.md) | a player clicks a block or the air |
| [`EntityDamageByEntityEvent`](../paper/untrusted/EntityDamageByEntityEvent.aus.md) | something is hurt by something else |
| [`PlayerMoveEvent`](../paper/untrusted/PlayerMoveEvent.aus.md) | a player moves. Fires constantly, so keep the handler short |
| [`InventoryClickEvent`](../paper/untrusted/InventoryClickEvent.aus.md) | a player clicks in an inventory |
| [`PlayerTeleportEvent`](../paper/untrusted/PlayerTeleportEvent.aus.md) | a player teleports |

Minecraft has around two hundred events, and this is a deliberate handful of
them. A script nobody has read gets what small scripts are known to need, and
nothing else, because every extra thing on that list is something that has to
be checked and kept safe. Approving a script with `acraft trust` gives it all
of them.

Two chat events are listed because Minecraft is changing which one it sends.
Use `AsyncChatEvent` on a current server and read the text with
`Evt.message()`; use `AsyncPlayerChatEvent` on an older one and read it with
`Evt.getMessage()`. Listening for both is fine.

If you ask for an event that is not on this list, the script will not load
and the console will say so.

## 9. Two messages you will see

**"needs the trusted profile"**

```
'myscript.aus' needs the trusted profile and is not granted, so it is not
running. To elevate: /acraft trust myscript.aus
```

This is not an error. Your script asked to do something that the untrusted
level does not allow. See [Intermediate](03-intermediate.md) for how to
approve it.

**"has parse errors and was not run"**

You have a typo. A missing `;`, a missing `}`, or a misspelled word. The
console prints the line number. Look at that line and the one above it.

## 10. Commands you will use

Type these in the console without a slash, or in chat with one.

| Command | What it does |
| --- | --- |
| `acraft reload` | reload every script |
| `acraft list` | show your scripts and their levels |
| `acraft load <file> [--as <tier>]` | load or reload one script, including a new one |
| `acraft unload <file>` | stop one script |

## Next

Head to **[Intermediate](03-intermediate.md)** to make your own commands, run
things on a timer, and save data that survives a restart.
