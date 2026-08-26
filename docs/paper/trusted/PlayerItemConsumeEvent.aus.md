# file: PlayerItemConsumeEvent.aus

## class: PlayerItemConsumeEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.PlayerItemConsumeEventShim) **extends: object** 

Generated shim for org.bukkit.event.player.PlayerItemConsumeEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerItemConsumeEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[PlayerEvent](PlayerEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerItemConsumeEvent.html#getEventName()

	- **@r** `A` string.


- **getHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerItemConsumeEvent.html#getHand()

	- **@r** `An` string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **getItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerItemConsumeEvent.html#getItem()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getPlayer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerItemConsumeEvent.html#getPlayer()

	- **@r** `A` [Player](Player.aus.md).


- **getReplacement** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerItemConsumeEvent.html#getReplacement()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerItemConsumeEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerItemConsumeEvent.html#isCancelled()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerItemConsumeEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setItem** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerItemConsumeEvent.html#setItem(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setReplacement** (`Replacement`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerItemConsumeEvent.html#setReplacement(org.bukkit.inventory.ItemStack)

	- **@p** `Replacement` is an [ItemStack](ItemStack.aus.md).




