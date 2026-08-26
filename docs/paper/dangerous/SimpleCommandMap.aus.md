# file: SimpleCommandMap.aus

## class: SimpleCommandMap

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.SimpleCommandMapShim) **extends: object** 

Generated shim for org.bukkit.command.SimpleCommandMap.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/SimpleCommandMap.html
In Paper this is a [CommandMap](CommandMap.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **clearCommands** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/SimpleCommandMap.html#clearCommands()



- **dispatch** (`Sender, CommandLine`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/SimpleCommandMap.html#dispatch(org.bukkit.command.CommandSender,java.lang.String)

	- **@p** `Sender` is a [CommandSender](CommandSender.aus.md).
	- **@p** `CommandLine` is a string.
	- **@r** `A` bool.


- **getCommand** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/SimpleCommandMap.html#getCommand(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` [Command](Command.aus.md).


- **getCommands** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/SimpleCommandMap.html#getCommands()

	- **@r** `A` list.


- **getKnownCommands** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/SimpleCommandMap.html#getKnownCommands()

	- **@r** `A` map.


- **register** (`FallbackPrefix, Command`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/SimpleCommandMap.html#register(java.lang.String,org.bukkit.command.Command)

	- **@p** `FallbackPrefix` is a string.
	- **@p** `Command` is a [Command](Command.aus.md).
	- **@r** `A` bool.


- **register** (`Label, FallbackPrefix, Command`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/SimpleCommandMap.html#register(java.lang.String,java.lang.String,org.bukkit.command.Command)

	- **@p** `Label` is a string.
	- **@p** `FallbackPrefix` is a string.
	- **@p** `Command` is a [Command](Command.aus.md).
	- **@r** `A` bool.


- **registerAll** (`FallbackPrefix, Commands`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/SimpleCommandMap.html#registerAll(java.lang.String,java.util.List)

	- **@p** `FallbackPrefix` is a string.
	- **@p** `Commands` is a list.


- **registerServerAliases** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/SimpleCommandMap.html#registerServerAliases()



- **setFallbackCommands** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/SimpleCommandMap.html#setFallbackCommands()



- **tabComplete** (`Sender, CmdLine`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/SimpleCommandMap.html#tabComplete(org.bukkit.command.CommandSender,java.lang.String)

	- **@p** `Sender` is a [CommandSender](CommandSender.aus.md).
	- **@p** `CmdLine` is a string.
	- **@r** `A` list.


- **tabComplete** (`Sender, CmdLine, Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/SimpleCommandMap.html#tabComplete(org.bukkit.command.CommandSender,java.lang.String,org.bukkit.Location)

	- **@p** `Sender` is a [CommandSender](CommandSender.aus.md).
	- **@p** `CmdLine` is a string.
	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` list.




