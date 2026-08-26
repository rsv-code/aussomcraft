# file: BlockPlaceEvent.aus

## class: BlockPlaceEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.BlockPlaceEventShim) **extends: object** 

Generated shim for org.bukkit.event.block.BlockPlaceEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockPlaceEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[BlockEvent](BlockEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockPlaceEvent.html#getBlock()

	- **@r** `A` [Block](Block.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockPlaceEvent.html#getEventName()

	- **@r** `A` string.


- **getPlayer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockPlaceEvent.html#getPlayer()

	- **@r** `A` [Player](Player.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockPlaceEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockPlaceEvent.html#isCancelled()

	- **@r** `A` bool.


- **canBuild** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockPlaceEvent.html#canBuild()

	- **@r** `A` bool.


- **getBlockAgainst** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockPlaceEvent.html#getBlockAgainst()

	- **@r** `A` [Block](Block.aus.md).


- **getBlockPlaced** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockPlaceEvent.html#getBlockPlaced()

	- **@r** `A` [Block](Block.aus.md).


- **getBlockReplacedState** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockPlaceEvent.html#getBlockReplacedState()

	- **@r** `A` [BlockState](BlockState.aus.md).


- **getHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockPlaceEvent.html#getHand()

	- **@r** `An` string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **getItemInHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockPlaceEvent.html#getItemInHand()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **setBuild** (`CanBuild`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockPlaceEvent.html#setBuild(boolean)

	- **@p** `CanBuild` is a bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/BlockPlaceEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.




