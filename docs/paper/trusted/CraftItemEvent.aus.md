# file: CraftItemEvent.aus

## class: CraftItemEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.CraftItemEventShim) **extends: object** 

Generated shim for org.bukkit.event.inventory.CraftItemEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html
In Paper this is a
[InventoryClickEvent](InventoryClickEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getAction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#getAction()

	- **@r** `An` string naming an [InventoryAction](InventoryAction.aus.md).


- **getClick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#getClick()

	- **@r** `A` string naming a [ClickType](ClickType.aus.md).


- **getClickedInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#getClickedInventory()

	- **@r** `An` [Inventory](Inventory.aus.md).


- **getCurrentItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#getCurrentItem()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getCursor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#getCursor()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#getEventName()

	- **@r** `A` string.


- **getHotbarButton** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#getHotbarButton()

	- **@r** `An` int.


- **getInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#getInventory()

	- **@r** `A` [CraftingInventory](CraftingInventory.aus.md).


- **getRawSlot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#getRawSlot()

	- **@r** `An` int.


- **getRecipe** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#getRecipe()

	- **@r** `A` [Recipe](Recipe.aus.md).


- **getResult** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#getResult()

	- **@r** `A` string naming an Event.Result.


- **getSlot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#getSlot()

	- **@r** `An` int.


- **getSlotType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#getSlotType()

	- **@r** `A` string naming an InventoryType.SlotType.


- **getView** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#getView()

	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **getViewers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#getViewers()

	- **@r** `A` list.


- **getWhoClicked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#getWhoClicked()

	- **@r** `A` [HumanEntity](HumanEntity.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#isCancelled()

	- **@r** `A` bool.


- **isLeftClick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#isLeftClick()

	- **@r** `A` bool.


- **isRightClick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#isRightClick()

	- **@r** `A` bool.


- **isShiftClick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#isShiftClick()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setCurrentItem** (`Stack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#setCurrentItem(org.bukkit.inventory.ItemStack)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).


- **setCursor** (`Stack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#setCursor(org.bukkit.inventory.ItemStack)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).


- **setResult** (`NewResult`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/CraftItemEvent.html#setResult(org.bukkit.event.Event.Result)

	- **@p** `NewResult` is a string naming an Event.Result.




