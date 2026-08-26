# file: CommandSender.aus

## class: CommandSender

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.CommandSenderShim) **extends: object** 

Generated shim for org.bukkit.command.CommandSender.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html
In Paper this is a [Permissible](Permissible.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **clearResourcePacks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#clearResourcePacks()



- **clearTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#clearTitle()



- **closeDialog** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#closeDialog()



- **getEffectivePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#getEffectivePermissions()

	- **@r** `A` list.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#getName()

	- **@r** `A` string.


- **hasPermission\_perm** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#hasPermission(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).
	- **@r** `A` bool.


- **hasPermission** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#hasPermission(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **isOp** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#isOp()

	- **@r** `A` bool.


- **isPermissionSet\_perm** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#isPermissionSet(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).
	- **@r** `A` bool.


- **isPermissionSet** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#isPermissionSet(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **name** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#name()

	- **@r** `A` Component.


- **recalculatePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#recalculatePermissions()



- **removeResourcePacks** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#removeResourcePacks(java.lang.Iterable)

	- **@p** `A0` is an Iterable.


- **resetTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#resetTitle()



- **sendActionBar** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#sendActionBar(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendActionBar\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#sendActionBar(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage\_Component** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#sendMessage(net.kyori.adventure.text.Component)

	- **@p** `Message` is a Component.


- **sendMessage\_ComponentLike** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#sendMessage(net.kyori.adventure.text.ComponentLike)

	- **@p** `Message` is a ComponentLike.


- **sendMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#sendMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendMessage** (`Sender, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#sendMessage(java.util.UUID,java.lang.String)

	- **@p** `Sender` is a string.
	- **@p** `Message` is a string.


- **sendPlainMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#sendPlainMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendPlayerListFooter** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#sendPlayerListFooter(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListFooter\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#sendPlayerListFooter(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeader** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#sendPlayerListHeader(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListHeader\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#sendPlayerListHeader(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeaderAndFooter** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.Component,net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.
	- **@p** `A1` is a Component.


- **sendPlayerListHeaderAndFooter\_ComponentLike\_ComponentLike** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.ComponentLike,net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.
	- **@p** `A1` is a ComponentLike.


- **sendRichMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#sendRichMessage(java.lang.String)

	- **@p** `Message` is a string.


- **spigot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#spigot()

	- **@r** `A` CommandSender.Spigot.


- **addAttachment** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#addAttachment(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#addAttachment(org.bukkit.plugin.Plugin,int)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Ticks` is an int.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Name, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#addAttachment(org.bukkit.plugin.Plugin,java.lang.String,boolean)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Name` is a string.
	- **@p** `Value` is a bool.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Name, Value, Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#addAttachment(org.bukkit.plugin.Plugin,java.lang.String,boolean,int)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Name` is a string.
	- **@p** `Value` is a bool.
	- **@p** `Ticks` is an int.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **getServer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#getServer()

	- **@r** `A` [Server](Server.aus.md).


- **removeAttachment** (`Attachment`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#removeAttachment(org.bukkit.permissions.PermissionAttachment)

	- **@p** `Attachment` is a [PermissionAttachment](PermissionAttachment.aus.md).


- **setOp** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/CommandSender.html#setOp(boolean)

	- **@p** `Value` is a bool.




