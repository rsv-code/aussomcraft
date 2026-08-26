# file: InventoryInteractEvent.aus

## class: InventoryInteractEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.InventoryInteractEventShim) **extends: object** 

Generated shim for org.bukkit.event.inventory.InventoryInteractEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryInteractEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[InventoryEvent](InventoryEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryInteractEvent.html#getEventName()

	- **@r** `A` string.


- **getInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryInteractEvent.html#getInventory()

	- **@r** `An` [Inventory](Inventory.aus.md).


- **getResult** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryInteractEvent.html#getResult()

	- **@r** `A` string naming an Event.Result.


- **getView** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryInteractEvent.html#getView()

	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **getViewers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryInteractEvent.html#getViewers()

	- **@r** `A` list.


- **getWhoClicked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryInteractEvent.html#getWhoClicked()

	- **@r** `A` [HumanEntity](HumanEntity.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryInteractEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryInteractEvent.html#isCancelled()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryInteractEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setResult** (`NewResult`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryInteractEvent.html#setResult(org.bukkit.event.Event.Result)

	- **@p** `NewResult` is a string naming an Event.Result.


- **callEvent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryInteractEvent.html#callEvent()

	- **@r** `A` bool.


- **getHandlerList** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryInteractEvent.html#getHandlerList()

	- **@r** `A` [HandlerList](HandlerList.aus.md).


- **getHandlers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryInteractEvent.html#getHandlers()

	- **@r** `A` [HandlerList](HandlerList.aus.md).




