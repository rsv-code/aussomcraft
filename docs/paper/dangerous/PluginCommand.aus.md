# file: PluginCommand.aus

## class: PluginCommand

[21:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.PluginCommandShim) **extends: object** 

Generated shim for org.bukkit.command.PluginCommand.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html
In Paper this is a
[PluginIdentifiableCommand](PluginIdentifiableCommand.aus.md) and
[Command](Command.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **broadcastCommandMessage\_CommandSender\_Component** (`Source, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#broadcastCommandMessage(org.bukkit.command.CommandSender,net.kyori.adventure.text.Component)

	- **@p** `Source` is a [CommandSender](CommandSender.aus.md).
	- **@p** `Message` is a Component.


- **broadcastCommandMessage** (`Source, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#broadcastCommandMessage(org.bukkit.command.CommandSender,java.lang.String)

	- **@p** `Source` is a [CommandSender](CommandSender.aus.md).
	- **@p** `Message` is a string.


- **broadcastCommandMessage\_CommandSender\_Component\_boolean** (`Source, Message, SendToSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#broadcastCommandMessage(org.bukkit.command.CommandSender,net.kyori.adventure.text.Component,boolean)

	- **@p** `Source` is a [CommandSender](CommandSender.aus.md).
	- **@p** `Message` is a Component.
	- **@p** `SendToSource` is a bool.


- **broadcastCommandMessage** (`Source, Message, SendToSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#broadcastCommandMessage(org.bukkit.command.CommandSender,java.lang.String,boolean)

	- **@p** `Source` is a [CommandSender](CommandSender.aus.md).
	- **@p** `Message` is a string.
	- **@p** `SendToSource` is a bool.


- **canBeOverriden** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#canBeOverriden()

	- **@r** `A` bool.


- **getAliases** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#getAliases()

	- **@r** `A` list.


- **getDescription** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#getDescription()

	- **@r** `A` string.


- **getExecutor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#getExecutor()

	- **@r** `A` CommandExecutor.


- **getLabel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#getLabel()

	- **@r** `A` string.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#getName()

	- **@r** `A` string.


- **getPermission** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#getPermission()

	- **@r** `A` string.


- **getPermissionMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#getPermissionMessage()

	- **@r** `A` string.


- **getPlugin** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#getPlugin()

	- **@r** `A` [Plugin](Plugin.aus.md).


- **getTabCompleter** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#getTabCompleter()

	- **@r** `A` TabCompleter.


- **getTimingName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#getTimingName()

	- **@r** `A` string.


- **getUsage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#getUsage()

	- **@r** `A` string.


- **isRegistered** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#isRegistered()

	- **@r** `A` bool.


- **permissionMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#permissionMessage()

	- **@r** `A` Component.


- **permissionMessage** (`PermissionMessage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#permissionMessage(net.kyori.adventure.text.Component)

	- **@p** `PermissionMessage` is a Component.


- **register** (`CommandMap`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#register(org.bukkit.command.CommandMap)

	- **@p** `CommandMap` is a [CommandMap](CommandMap.aus.md).
	- **@r** `A` bool.


- **setAliases** (`Aliases`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#setAliases(java.util.List)

	- **@p** `Aliases` is a list.
	- **@r** `A` [Command](Command.aus.md).


- **setDescription** (`Description`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#setDescription(java.lang.String)

	- **@p** `Description` is a string.
	- **@r** `A` [Command](Command.aus.md).


- **setExecutor** (`Executor`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#setExecutor(org.bukkit.command.CommandExecutor)

	- **@p** `Executor` is a CommandExecutor.


- **setLabel** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#setLabel(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **setName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#setName(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **setPermission** (`Permission`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#setPermission(java.lang.String)

	- **@p** `Permission` is a string.


- **setPermissionMessage** (`PermissionMessage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#setPermissionMessage(java.lang.String)

	- **@p** `PermissionMessage` is a string.
	- **@r** `A` [Command](Command.aus.md).


- **setTabCompleter** (`Completer`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#setTabCompleter(org.bukkit.command.TabCompleter)

	- **@p** `Completer` is a TabCompleter.


- **setUsage** (`Usage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#setUsage(java.lang.String)

	- **@p** `Usage` is a string.
	- **@r** `A` [Command](Command.aus.md).


- **testPermission** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#testPermission(org.bukkit.command.CommandSender)

	- **@p** `Target` is a [CommandSender](CommandSender.aus.md).
	- **@r** `A` bool.


- **testPermissionSilent** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#testPermissionSilent(org.bukkit.command.CommandSender)

	- **@p** `Target` is a [CommandSender](CommandSender.aus.md).
	- **@r** `A` bool.


- **toString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#toString()

	- **@r** `A` string.


- **unregister** (`CommandMap`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/PluginCommand.html#unregister(org.bukkit.command.CommandMap)

	- **@p** `CommandMap` is a [CommandMap](CommandMap.aus.md).
	- **@r** `A` bool.




