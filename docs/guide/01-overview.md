# What AussomCraft Is

AussomCraft lets you add your own features to a Minecraft server by writing
short text files. You do not need to install a mod on your Minecraft game.
You do not need to compile anything. You write a file, save it, type one
command in the server, and your feature is live.

The files are written in a language called Aussom. If you have never written
code before, that is fine. This guide starts from the beginning.

## What you can make

Here are things people build with about ten lines each:

- A welcome message when a player joins
- A `/home` command that teleports a player
- An announcement that repeats every five minutes
- A counter that remembers how many times each player has visited
- A warning when someone breaks a valuable block

Bigger things are possible too. A whole minigame is just a longer file.

## Why not just edit the server config?

Config files let you change settings that someone else decided you could
change. A script lets you decide. If you want a message that only appears on
Tuesdays for players who are holding a diamond, no config file will do that,
but eight lines of script will.

## Change it while the server runs

This is the part people notice first. Normally, changing how a server behaves
means stopping it, swapping a file, and starting it again. Everyone gets
kicked off. With AussomCraft you save your file and type:

```
/acraft reload
```

Your change is live. Nobody is disconnected.

## Safety, in plain terms

Here is the problem AussomCraft solves. A script is a program. A program
running on your server could, in principle, delete your files, steal your
passwords, or make itself an operator. If you download a script someone else
wrote, how do you know it will not do that?

AussomCraft answers this by giving every script a **level**. The level decides
what the script is even able to do.

| Level | What a script can do |
| --- | --- |
| **untrusted** | Look at what is happening in the world and send chat messages. It cannot change anything, and it cannot see the commands people type. |
| **trusted** | Everything in the game world: move players, change blocks, give items. It cannot touch your files, the network, or the server itself. |
| **dangerous** | Anything at all, including things that could take your server down. |

Every script starts at **untrusted**. Always. There is no way for a script to
give itself a higher level, and no setting inside the file changes this. You
raise a script's level yourself, by typing a command, after you have decided
you trust it.

This is not a warning that gets shown and ignored. At the untrusted level, the
ability to do those things is not present in the script's world at all. A
script that tries to run a command as the server is not asking permission and
being told no. There is simply nothing there to call.

That includes reading. An untrusted script cannot see what people type as
commands. If your server asks players for a password with something like
`/login`, an unapproved script cannot read it, and the same goes for private
messages and anything you type at the console. It can still read ordinary
chat, because everyone nearby can read that anyway.

One more thing worth knowing: when you raise a script's level, that decision
is tied to the exact file you approved. If the file changes even slightly, it
drops back to untrusted on its own. So nobody can get you to approve a safe
script and then quietly swap it for a different one.

## What you need

- A Paper Minecraft server that you control
- The AussomCraft plugin file in the server's `plugins` folder
- A text editor. Notepad works. So does anything else.

You do not need to know Java. You do not need to know how Minecraft mods
work. You do not need any other tools.

## Where to go next

- **[Getting started](02-getting-started.md)** - install it and write your
  first script.
- **[Intermediate](03-intermediate.md)** - commands, timers, and saving data.
- **[Advanced](04-advanced.md)** - the dangerous level, speed, and sharing
  scripts.
