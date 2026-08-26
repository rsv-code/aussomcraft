# file: BufferedCommandSender.aus

## class: BufferedCommandSender

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.BufferedCommandSenderShim) **extends: object** 

Generated shim for org.bukkit.command.BufferedCommandSender.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html
In Paper this is a
[MessageCommandSender](MessageCommandSender.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **clearResourcePacks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#clearResourcePacks()



- **clearTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#clearTitle()



- **closeDialog** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#closeDialog()



- **getBuffer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#getBuffer()

	- **@r** `A` string.


- **getEffectivePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#getEffectivePermissions()

	- **@r** `A` list.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#getName()

	- **@r** `A` string.


- **hasPermission** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#hasPermission(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **isOp** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#isOp()

	- **@r** `A` bool.


- **isPermissionSet** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#isPermissionSet(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **name** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#name()

	- **@r** `A` Component.


- **recalculatePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#recalculatePermissions()



- **removeResourcePacks** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#removeResourcePacks(java.lang.Iterable)

	- **@p** `A0` is an Iterable.


- **reset** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#reset()



- **resetTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#resetTitle()



- **sendActionBar** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#sendActionBar(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendActionBar\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#sendActionBar(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage\_Component** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#sendMessage(net.kyori.adventure.text.Component)

	- **@p** `Message` is a Component.


- **sendMessage\_ComponentLike** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#sendMessage(net.kyori.adventure.text.ComponentLike)

	- **@p** `Message` is a ComponentLike.


- **sendMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#sendMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendMessage** (`Sender, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#sendMessage(java.util.UUID,java.lang.String)

	- **@p** `Sender` is a string.
	- **@p** `Message` is a string.


- **sendPlainMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#sendPlainMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendPlayerListFooter** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#sendPlayerListFooter(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListFooter\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#sendPlayerListFooter(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeader** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#sendPlayerListHeader(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListHeader\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#sendPlayerListHeader(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeaderAndFooter** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.Component,net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.
	- **@p** `A1` is a Component.


- **sendPlayerListHeaderAndFooter\_ComponentLike\_ComponentLike** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.ComponentLike,net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.
	- **@p** `A1` is a ComponentLike.


- **sendRichMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#sendRichMessage(java.lang.String)

	- **@p** `Message` is a string.


- **spigot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/command/BufferedCommandSender.html#spigot()

	- **@r** `A` CommandSender.Spigot.




