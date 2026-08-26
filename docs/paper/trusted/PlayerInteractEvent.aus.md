# file: PlayerInteractEvent.aus

## class: PlayerInteractEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.PlayerInteractEventShim) **extends: object** 

Generated shim for org.bukkit.event.player.PlayerInteractEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[PlayerEvent](PlayerEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getAction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#getAction()

	- **@r** `An` string naming an [Action](Action.aus.md).


- **getClickedBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#getClickedBlock()

	- **@r** `A` [Block](Block.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#getEventName()

	- **@r** `A` string.


- **getPlayer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#getPlayer()

	- **@r** `A` [Player](Player.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#isCancelled()

	- **@r** `A` bool.


- **getBlockFace** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#getBlockFace()

	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getClickedPosition** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#getClickedPosition()

	- **@r** `A` [Vector](Vector.aus.md).


- **getHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#getHand()

	- **@r** `An` string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **getInteractionPoint** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#getInteractionPoint()

	- **@r** `A` [Location](Location.aus.md).


- **getItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#getItem()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getMaterial** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#getMaterial()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **hasBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#hasBlock()

	- **@r** `A` bool.


- **hasItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#hasItem()

	- **@r** `A` bool.


- **isBlockInHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#isBlockInHand()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setUseInteractedBlock** (`UseInteractedBlock`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#setUseInteractedBlock(org.bukkit.event.Event.Result)

	- **@p** `UseInteractedBlock` is a string naming an Event.Result.


- **setUseItemInHand** (`UseItemInHand`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#setUseItemInHand(org.bukkit.event.Event.Result)

	- **@p** `UseItemInHand` is a string naming an Event.Result.


- **useInteractedBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#useInteractedBlock()

	- **@r** `A` string naming an Event.Result.


- **useItemInHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerInteractEvent.html#useItemInHand()

	- **@r** `A` string naming an Event.Result.




