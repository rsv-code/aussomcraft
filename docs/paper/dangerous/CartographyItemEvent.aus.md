# file: CartographyItemEvent.aus

## class: CartographyItemEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.CartographyItemEventShim) **extends: object** 

Generated shim for io.papermc.paper.event.player.CartographyItemEvent.
Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html
In Paper this is a
[InventoryClickEvent](InventoryClickEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getAction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#getAction()

	- **@r** `An` string naming an [InventoryAction](InventoryAction.aus.md).


- **getClick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#getClick()

	- **@r** `A` string naming a [ClickType](ClickType.aus.md).


- **getClickedInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#getClickedInventory()

	- **@r** `An` [Inventory](Inventory.aus.md).


- **getCurrentItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#getCurrentItem()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getCursor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#getCursor()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#getEventName()

	- **@r** `A` string.


- **getHotbarButton** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#getHotbarButton()

	- **@r** `An` int.


- **getInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#getInventory()

	- **@r** `A` [CartographyInventory](CartographyInventory.aus.md).


- **getRawSlot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#getRawSlot()

	- **@r** `An` int.


- **getResult** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#getResult()

	- **@r** `A` string naming an Event.Result.


- **getSlot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#getSlot()

	- **@r** `An` int.


- **getSlotType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#getSlotType()

	- **@r** `A` string naming an InventoryType.SlotType.


- **getView** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#getView()

	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **getViewers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#getViewers()

	- **@r** `A` list.


- **getWhoClicked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#getWhoClicked()

	- **@r** `A` [HumanEntity](HumanEntity.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#isCancelled()

	- **@r** `A` bool.


- **isLeftClick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#isLeftClick()

	- **@r** `A` bool.


- **isRightClick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#isRightClick()

	- **@r** `A` bool.


- **isShiftClick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#isShiftClick()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setCurrentItem** (`Stack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#setCurrentItem(org.bukkit.inventory.ItemStack)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).


- **setCursor** (`Stack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#setCursor(org.bukkit.inventory.ItemStack)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).


- **setResult** (`NewResult`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#setResult(org.bukkit.event.Event.Result)

	- **@p** `NewResult` is a string naming an Event.Result.


- **callEvent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#callEvent()

	- **@r** `A` bool.


- **getHandlerList** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#getHandlerList()

	- **@r** `A` [HandlerList](HandlerList.aus.md).


- **getHandlers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/CartographyItemEvent.html#getHandlers()

	- **@r** `A` [HandlerList](HandlerList.aus.md).




