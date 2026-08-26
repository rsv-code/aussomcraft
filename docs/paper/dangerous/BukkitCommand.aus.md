# file: BukkitCommand.aus

## class: BukkitCommand

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.BukkitCommandShim) **extends: object** 

Generated shim for org.bukkit.command.defaults.BukkitCommand.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html
In Paper this is a [Command](Command.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **broadcastCommandMessage\_CommandSender\_Component** (`Source, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#broadcastCommandMessage(org.bukkit.command.CommandSender,net.kyori.adventure.text.Component)

	- **@p** `Source` is a [CommandSender](CommandSender.aus.md).
	- **@p** `Message` is a Component.


- **broadcastCommandMessage** (`Source, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#broadcastCommandMessage(org.bukkit.command.CommandSender,java.lang.String)

	- **@p** `Source` is a [CommandSender](CommandSender.aus.md).
	- **@p** `Message` is a string.


- **broadcastCommandMessage\_CommandSender\_Component\_boolean** (`Source, Message, SendToSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#broadcastCommandMessage(org.bukkit.command.CommandSender,net.kyori.adventure.text.Component,boolean)

	- **@p** `Source` is a [CommandSender](CommandSender.aus.md).
	- **@p** `Message` is a Component.
	- **@p** `SendToSource` is a bool.


- **broadcastCommandMessage** (`Source, Message, SendToSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#broadcastCommandMessage(org.bukkit.command.CommandSender,java.lang.String,boolean)

	- **@p** `Source` is a [CommandSender](CommandSender.aus.md).
	- **@p** `Message` is a string.
	- **@p** `SendToSource` is a bool.


- **canBeOverriden** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#canBeOverriden()

	- **@r** `A` bool.


- **getAliases** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#getAliases()

	- **@r** `A` list.


- **getDescription** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#getDescription()

	- **@r** `A` string.


- **getLabel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#getLabel()

	- **@r** `A` string.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#getName()

	- **@r** `A` string.


- **getPermission** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#getPermission()

	- **@r** `A` string.


- **getPermissionMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#getPermissionMessage()

	- **@r** `A` string.


- **getTimingName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#getTimingName()

	- **@r** `A` string.


- **getUsage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#getUsage()

	- **@r** `A` string.


- **isRegistered** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#isRegistered()

	- **@r** `A` bool.


- **permissionMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#permissionMessage()

	- **@r** `A` Component.


- **permissionMessage** (`PermissionMessage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#permissionMessage(net.kyori.adventure.text.Component)

	- **@p** `PermissionMessage` is a Component.


- **register** (`CommandMap`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#register(org.bukkit.command.CommandMap)

	- **@p** `CommandMap` is a [CommandMap](CommandMap.aus.md).
	- **@r** `A` bool.


- **setAliases** (`Aliases`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#setAliases(java.util.List)

	- **@p** `Aliases` is a list.
	- **@r** `A` [Command](Command.aus.md).


- **setDescription** (`Description`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#setDescription(java.lang.String)

	- **@p** `Description` is a string.
	- **@r** `A` [Command](Command.aus.md).


- **setLabel** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#setLabel(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **setName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#setName(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **setPermission** (`Permission`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#setPermission(java.lang.String)

	- **@p** `Permission` is a string.


- **setPermissionMessage** (`PermissionMessage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#setPermissionMessage(java.lang.String)

	- **@p** `PermissionMessage` is a string.
	- **@r** `A` [Command](Command.aus.md).


- **setUsage** (`Usage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#setUsage(java.lang.String)

	- **@p** `Usage` is a string.
	- **@r** `A` [Command](Command.aus.md).


- **testPermission** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#testPermission(org.bukkit.command.CommandSender)

	- **@p** `Target` is a [CommandSender](CommandSender.aus.md).
	- **@r** `A` bool.


- **testPermissionSilent** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#testPermissionSilent(org.bukkit.command.CommandSender)

	- **@p** `Target` is a [CommandSender](CommandSender.aus.md).
	- **@r** `A` bool.


- **toString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#toString()

	- **@r** `A` string.


- **unregister** (`CommandMap`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/defaults/BukkitCommand.html#unregister(org.bukkit.command.CommandMap)

	- **@p** `CommandMap` is a [CommandMap](CommandMap.aus.md).
	- **@r** `A` bool.




