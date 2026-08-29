# file: Command.aus

## class: Command

[15:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.CommandShim) **extends: object** 

Generated shim for org.bukkit.command.Command.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **broadcastCommandMessage\_CommandSender\_Component** (`Source, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#broadcastCommandMessage(org.bukkit.command.CommandSender,net.kyori.adventure.text.Component)

	- **@p** `Source` is a [CommandSender](CommandSender.aus.md).
	- **@p** `Message` is a Component.


- **broadcastCommandMessage** (`Source, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#broadcastCommandMessage(org.bukkit.command.CommandSender,java.lang.String)

	- **@p** `Source` is a [CommandSender](CommandSender.aus.md).
	- **@p** `Message` is a string.


- **broadcastCommandMessage\_CommandSender\_Component\_boolean** (`Source, Message, SendToSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#broadcastCommandMessage(org.bukkit.command.CommandSender,net.kyori.adventure.text.Component,boolean)

	- **@p** `Source` is a [CommandSender](CommandSender.aus.md).
	- **@p** `Message` is a Component.
	- **@p** `SendToSource` is a bool.


- **broadcastCommandMessage** (`Source, Message, SendToSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#broadcastCommandMessage(org.bukkit.command.CommandSender,java.lang.String,boolean)

	- **@p** `Source` is a [CommandSender](CommandSender.aus.md).
	- **@p** `Message` is a string.
	- **@p** `SendToSource` is a bool.


- **canBeOverriden** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#canBeOverriden()

	- **@r** `A` bool.


- **getAliases** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#getAliases()

	- **@r** `A` list.


- **getDescription** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#getDescription()

	- **@r** `A` string.


- **getLabel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#getLabel()

	- **@r** `A` string.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#getName()

	- **@r** `A` string.


- **getPermission** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#getPermission()

	- **@r** `A` string.


- **getPermissionMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#getPermissionMessage()

	- **@r** `A` string.


- **getTimingName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#getTimingName()

	- **@r** `A` string.


- **getUsage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#getUsage()

	- **@r** `A` string.


- **isRegistered** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#isRegistered()

	- **@r** `A` bool.


- **permissionMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#permissionMessage()

	- **@r** `A` Component.


- **permissionMessage** (`PermissionMessage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#permissionMessage(net.kyori.adventure.text.Component)

	- **@p** `PermissionMessage` is a Component.


- **setAliases** (`Aliases`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#setAliases(java.util.List)

	- **@p** `Aliases` is a list.
	- **@r** `A` [Command](Command.aus.md).


- **setDescription** (`Description`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#setDescription(java.lang.String)

	- **@p** `Description` is a string.
	- **@r** `A` [Command](Command.aus.md).


- **setLabel** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#setLabel(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **setName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#setName(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **setPermission** (`Permission`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#setPermission(java.lang.String)

	- **@p** `Permission` is a string.


- **setPermissionMessage** (`PermissionMessage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#setPermissionMessage(java.lang.String)

	- **@p** `PermissionMessage` is a string.
	- **@r** `A` [Command](Command.aus.md).


- **setUsage** (`Usage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#setUsage(java.lang.String)

	- **@p** `Usage` is a string.
	- **@r** `A` [Command](Command.aus.md).


- **testPermission** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#testPermission(org.bukkit.command.CommandSender)

	- **@p** `Target` is a [CommandSender](CommandSender.aus.md).
	- **@r** `A` bool.


- **testPermissionSilent** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#testPermissionSilent(org.bukkit.command.CommandSender)

	- **@p** `Target` is a [CommandSender](CommandSender.aus.md).
	- **@r** `A` bool.


- **toString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/Command.html#toString()

	- **@r** `A` string.




