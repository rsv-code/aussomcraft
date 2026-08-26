# file: InventoryDragEvent.aus

## class: InventoryDragEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.InventoryDragEventShim) **extends: object** 

Generated shim for org.bukkit.event.inventory.InventoryDragEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html
In Paper this is a
[InventoryInteractEvent](InventoryInteractEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getCursor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html#getCursor()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html#getEventName()

	- **@r** `A` string.


- **getInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html#getInventory()

	- **@r** `An` [Inventory](Inventory.aus.md).


- **getInventorySlots** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html#getInventorySlots()

	- **@r** `A` list.


- **getNewItems** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html#getNewItems()

	- **@r** `A` map.


- **getOldCursor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html#getOldCursor()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getRawSlots** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html#getRawSlots()

	- **@r** `A` list.


- **getResult** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html#getResult()

	- **@r** `A` string naming an Event.Result.


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html#getType()

	- **@r** `A` string naming a [DragType](DragType.aus.md).


- **getView** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html#getView()

	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **getViewers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html#getViewers()

	- **@r** `A` list.


- **getWhoClicked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html#getWhoClicked()

	- **@r** `A` [HumanEntity](HumanEntity.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html#isCancelled()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setCursor** (`NewCursor`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html#setCursor(org.bukkit.inventory.ItemStack)

	- **@p** `NewCursor` is an [ItemStack](ItemStack.aus.md).


- **setResult** (`NewResult`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryDragEvent.html#setResult(org.bukkit.event.Event.Result)

	- **@p** `NewResult` is a string naming an Event.Result.




