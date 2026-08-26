# file: ConsoleCommandSender.aus

## class: ConsoleCommandSender

[20:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.ConsoleCommandSenderShim) **extends: object** 

Generated shim for org.bukkit.command.ConsoleCommandSender.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html
In Paper this is a [CommandSender](CommandSender.aus.md) and
[Conversable](Conversable.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **abandonConversation** (`Conversation`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#abandonConversation(org.bukkit.conversations.Conversation)

	- **@p** `Conversation` is a [Conversation](Conversation.aus.md).


- **abandonConversation** (`Conversation, Details`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#abandonConversation(org.bukkit.conversations.Conversation,org.bukkit.conversations.ConversationAbandonedEvent)

	- **@p** `Conversation` is a [Conversation](Conversation.aus.md).
	- **@p** `Details` is a [ConversationAbandonedEvent](ConversationAbandonedEvent.aus.md).


- **acceptConversationInput** (`Input`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#acceptConversationInput(java.lang.String)

	- **@p** `Input` is a string.


- **addAttachment** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#addAttachment(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#addAttachment(org.bukkit.plugin.Plugin,int)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Ticks` is an int.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Name, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#addAttachment(org.bukkit.plugin.Plugin,java.lang.String,boolean)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Name` is a string.
	- **@p** `Value` is a bool.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Name, Value, Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#addAttachment(org.bukkit.plugin.Plugin,java.lang.String,boolean,int)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Name` is a string.
	- **@p** `Value` is a bool.
	- **@p** `Ticks` is an int.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **beginConversation** (`Conversation`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#beginConversation(org.bukkit.conversations.Conversation)

	- **@p** `Conversation` is a [Conversation](Conversation.aus.md).
	- **@r** `A` bool.


- **clearResourcePacks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#clearResourcePacks()



- **clearTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#clearTitle()



- **closeDialog** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#closeDialog()



- **getEffectivePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#getEffectivePermissions()

	- **@r** `A` list.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#getName()

	- **@r** `A` string.


- **getServer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#getServer()

	- **@r** `A` [Server](Server.aus.md).


- **hasPermission\_perm** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#hasPermission(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).
	- **@r** `A` bool.


- **hasPermission** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#hasPermission(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **isConversing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#isConversing()

	- **@r** `A` bool.


- **isOp** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#isOp()

	- **@r** `A` bool.


- **isPermissionSet\_perm** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#isPermissionSet(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).
	- **@r** `A` bool.


- **isPermissionSet** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#isPermissionSet(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **name** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#name()

	- **@r** `A` Component.


- **recalculatePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#recalculatePermissions()



- **removeAttachment** (`Attachment`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#removeAttachment(org.bukkit.permissions.PermissionAttachment)

	- **@p** `Attachment` is a [PermissionAttachment](PermissionAttachment.aus.md).


- **removeResourcePacks** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#removeResourcePacks(java.lang.Iterable)

	- **@p** `A0` is an Iterable.


- **resetTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#resetTitle()



- **sendActionBar** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#sendActionBar(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendActionBar\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#sendActionBar(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage\_Component** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#sendMessage(net.kyori.adventure.text.Component)

	- **@p** `Message` is a Component.


- **sendMessage\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#sendMessage(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#sendMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendMessage** (`Sender, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#sendMessage(java.util.UUID,java.lang.String)

	- **@p** `Sender` is a string.
	- **@p** `Message` is a string.


- **sendPlainMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#sendPlainMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendPlayerListFooter** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#sendPlayerListFooter(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListFooter\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#sendPlayerListFooter(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeader** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#sendPlayerListHeader(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListHeader\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#sendPlayerListHeader(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeaderAndFooter** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.Component,net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.
	- **@p** `A1` is a Component.


- **sendPlayerListHeaderAndFooter\_ComponentLike\_ComponentLike** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.ComponentLike,net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.
	- **@p** `A1` is a ComponentLike.


- **sendRawMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#sendRawMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendRawMessage** (`Sender, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#sendRawMessage(java.util.UUID,java.lang.String)

	- **@p** `Sender` is a string.
	- **@p** `Message` is a string.


- **sendRichMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#sendRichMessage(java.lang.String)

	- **@p** `Message` is a string.


- **setOp** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#setOp(boolean)

	- **@p** `Value` is a bool.


- **spigot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/ConsoleCommandSender.html#spigot()

	- **@r** `A` CommandSender.Spigot.




