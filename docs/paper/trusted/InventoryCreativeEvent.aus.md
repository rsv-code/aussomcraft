# file: InventoryCreativeEvent.aus

## class: InventoryCreativeEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.InventoryCreativeEventShim) **extends: object** 

Generated shim for org.bukkit.event.inventory.InventoryCreativeEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html
In Paper this is a
[InventoryClickEvent](InventoryClickEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getAction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#getAction()

	- **@r** `An` string naming an [InventoryAction](InventoryAction.aus.md).


- **getClick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#getClick()

	- **@r** `A` string naming a [ClickType](ClickType.aus.md).


- **getClickedInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#getClickedInventory()

	- **@r** `An` [Inventory](Inventory.aus.md).


- **getCurrentItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#getCurrentItem()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getCursor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#getCursor()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#getEventName()

	- **@r** `A` string.


- **getHotbarButton** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#getHotbarButton()

	- **@r** `An` int.


- **getInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#getInventory()

	- **@r** `An` [Inventory](Inventory.aus.md).


- **getRawSlot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#getRawSlot()

	- **@r** `An` int.


- **getResult** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#getResult()

	- **@r** `A` string naming an Event.Result.


- **getSlot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#getSlot()

	- **@r** `An` int.


- **getSlotType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#getSlotType()

	- **@r** `A` string naming an InventoryType.SlotType.


- **getView** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#getView()

	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **getViewers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#getViewers()

	- **@r** `A` list.


- **getWhoClicked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#getWhoClicked()

	- **@r** `A` [HumanEntity](HumanEntity.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#isCancelled()

	- **@r** `A` bool.


- **isLeftClick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#isLeftClick()

	- **@r** `A` bool.


- **isRightClick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#isRightClick()

	- **@r** `A` bool.


- **isShiftClick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#isShiftClick()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setCurrentItem** (`Stack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#setCurrentItem(org.bukkit.inventory.ItemStack)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).


- **setCursor** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#setCursor(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setResult** (`NewResult`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/inventory/InventoryCreativeEvent.html#setResult(org.bukkit.event.Event.Result)

	- **@p** `NewResult` is a string naming an Event.Result.




