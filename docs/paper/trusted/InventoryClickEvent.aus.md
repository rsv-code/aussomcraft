# file: InventoryClickEvent.aus

## class: InventoryClickEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.InventoryClickEventShim) **extends: object** 

Generated shim for org.bukkit.event.inventory.InventoryClickEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html
In Paper this is a
[InventoryInteractEvent](InventoryInteractEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getAction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#getAction()

	- **@r** `An` string naming an [InventoryAction](InventoryAction.aus.md).


- **getCurrentItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#getCurrentItem()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#getEventName()

	- **@r** `A` string.


- **getInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#getInventory()

	- **@r** `An` [Inventory](Inventory.aus.md).


- **getWhoClicked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#getWhoClicked()

	- **@r** `A` [HumanEntity](HumanEntity.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#isCancelled()

	- **@r** `A` bool.


- **getClick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#getClick()

	- **@r** `A` string naming a [ClickType](ClickType.aus.md).


- **getClickedInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#getClickedInventory()

	- **@r** `An` [Inventory](Inventory.aus.md).


- **getCursor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#getCursor()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getHotbarButton** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#getHotbarButton()

	- **@r** `An` int.


- **getRawSlot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#getRawSlot()

	- **@r** `An` int.


- **getResult** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#getResult()

	- **@r** `A` string naming an Event.Result.


- **getSlot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#getSlot()

	- **@r** `An` int.


- **getSlotType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#getSlotType()

	- **@r** `A` string naming an InventoryType.SlotType.


- **getView** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#getView()

	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **getViewers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#getViewers()

	- **@r** `A` list.


- **isLeftClick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#isLeftClick()

	- **@r** `A` bool.


- **isRightClick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#isRightClick()

	- **@r** `A` bool.


- **isShiftClick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#isShiftClick()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setCurrentItem** (`Stack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#setCurrentItem(org.bukkit.inventory.ItemStack)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).


- **setCursor** (`Stack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#setCursor(org.bukkit.inventory.ItemStack)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).


- **setResult** (`NewResult`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryClickEvent.html#setResult(org.bukkit.event.Event.Result)

	- **@p** `NewResult` is a string naming an Event.Result.




