# file: InventoryView.aus

## class: InventoryView

[15:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.InventoryViewShim) **extends: object** 

Generated shim for org.bukkit.inventory.InventoryView.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **close** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#close()



- **convertSlot** (`RawSlot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#convertSlot(int)

	- **@p** `RawSlot` is an int.
	- **@r** `An` int.


- **countSlots** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#countSlots()

	- **@r** `An` int.


- **getBottomInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#getBottomInventory()

	- **@r** `An` [Inventory](Inventory.aus.md).


- **getCursor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#getCursor()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getInventory** (`RawSlot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#getInventory(int)

	- **@p** `RawSlot` is an int.
	- **@r** `An` [Inventory](Inventory.aus.md).


- **getItem** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#getItem(int)

	- **@p** `Slot` is an int.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getMenuType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#getMenuType()

	- **@r** `A` [MenuType](MenuType.aus.md).


- **getOriginalTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#getOriginalTitle()

	- **@r** `A` string.


- **getPlayer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#getPlayer()

	- **@r** `A` [HumanEntity](HumanEntity.aus.md).


- **getSlotType** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#getSlotType(int)

	- **@p** `Slot` is an int.
	- **@r** `A` string naming an InventoryType.SlotType.


- **getTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#getTitle()

	- **@r** `A` string.


- **getTopInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#getTopInventory()

	- **@r** `An` [Inventory](Inventory.aus.md).


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#getType()

	- **@r** `An` string naming an [InventoryType](InventoryType.aus.md).


- **open** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#open()



- **setCursor** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#setCursor(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setItem** (`Slot, Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#setItem(int,org.bukkit.inventory.ItemStack)

	- **@p** `Slot` is an int.
	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setProperty** (`Prop, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#setProperty(org.bukkit.inventory.InventoryView.Property,int)

	- **@p** `Prop` is a string naming an InventoryView.Property.
	- **@p** `Value` is an int.
	- **@r** `A` bool.


- **setTitle** (`Title`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#setTitle(java.lang.String)

	- **@p** `Title` is a string.


- **title** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/InventoryView.html#title()

	- **@r** `A` Component.




