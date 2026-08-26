# file: BlockBreakEvent.aus

## class: BlockBreakEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.BlockBreakEventShim) **extends: object** 

Generated shim for org.bukkit.event.block.BlockBreakEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockBreakEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[BlockExpEvent](BlockExpEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockBreakEvent.html#getBlock()

	- **@r** `A` [Block](Block.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockBreakEvent.html#getEventName()

	- **@r** `A` string.


- **getPlayer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockBreakEvent.html#getPlayer()

	- **@r** `A` [Player](Player.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockBreakEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockBreakEvent.html#isCancelled()

	- **@r** `A` bool.


- **getExpToDrop** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockBreakEvent.html#getExpToDrop()

	- **@r** `An` int.


- **isDropItems** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockBreakEvent.html#isDropItems()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockBreakEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setDropItems** (`DropItems`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockBreakEvent.html#setDropItems(boolean)

	- **@p** `DropItems` is a bool.


- **setExpToDrop** (`Exp`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockBreakEvent.html#setExpToDrop(int)

	- **@p** `Exp` is an int.




