# file: BlockLockCheckEvent.aus

## class: BlockLockCheckEvent

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.BlockLockCheckEventShim) **extends: object** 

Generated shim for io.papermc.paper.event.block.BlockLockCheckEvent.
Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/block/BlockLockCheckEvent.html
In Paper this is a [BlockEvent](BlockEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/block/BlockLockCheckEvent.html#getBlock()

	- **@r** `A` [Block](Block.aus.md).


- **getBlockState** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/block/BlockLockCheckEvent.html#getBlockState()

	- **@r** `A` [LockableTileState](LockableTileState.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/block/BlockLockCheckEvent.html#getEventName()

	- **@r** `A` string.


- **getKeyItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/block/BlockLockCheckEvent.html#getKeyItem()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getLockedMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/block/BlockLockCheckEvent.html#getLockedMessage()

	- **@r** `A` Component.


- **getPlayer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/block/BlockLockCheckEvent.html#getPlayer()

	- **@r** `A` [Player](Player.aus.md).


- **getResult** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/block/BlockLockCheckEvent.html#getResult()

	- **@r** `A` string naming an Event.Result.


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/block/BlockLockCheckEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isUsingCustomKeyItemStack** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/block/BlockLockCheckEvent.html#isUsingCustomKeyItemStack()

	- **@r** `A` bool.


- **resetKeyItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/block/BlockLockCheckEvent.html#resetKeyItem()



- **setKeyItem** (`Stack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/block/BlockLockCheckEvent.html#setKeyItem(org.bukkit.inventory.ItemStack)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).


- **setLockedMessage** (`LockedMessage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/block/BlockLockCheckEvent.html#setLockedMessage(net.kyori.adventure.text.Component)

	- **@p** `LockedMessage` is a Component.


- **setResult** (`Result`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/block/BlockLockCheckEvent.html#setResult(org.bukkit.event.Event.Result)

	- **@p** `Result` is a string naming an Event.Result.




