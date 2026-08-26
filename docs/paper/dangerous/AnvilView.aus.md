# file: AnvilView.aus

## class: AnvilView

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.AnvilViewShim) **extends: object** 

Generated shim for org.bukkit.inventory.view.AnvilView.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html
In Paper this is a [InventoryView](InventoryView.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **bypassEnchantmentLevelRestriction** (`BypassEnchantmentLevelRestriction`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#bypassEnchantmentLevelRestriction(boolean)

	- **@p** `BypassEnchantmentLevelRestriction` is a bool.


- **bypassesEnchantmentLevelRestriction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#bypassesEnchantmentLevelRestriction()

	- **@r** `A` bool.


- **close** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#close()



- **convertSlot** (`RawSlot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#convertSlot(int)

	- **@p** `RawSlot` is an int.
	- **@r** `An` int.


- **countSlots** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#countSlots()

	- **@r** `An` int.


- **getBottomInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#getBottomInventory()

	- **@r** `An` [Inventory](Inventory.aus.md).


- **getCursor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#getCursor()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getInventory** (`RawSlot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#getInventory(int)

	- **@p** `RawSlot` is an int.
	- **@r** `An` [Inventory](Inventory.aus.md).


- **getItem** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#getItem(int)

	- **@p** `Slot` is an int.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getMaximumRepairCost** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#getMaximumRepairCost()

	- **@r** `An` int.


- **getMenuType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#getMenuType()

	- **@r** `A` [MenuType](MenuType.aus.md).


- **getOriginalTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#getOriginalTitle()

	- **@r** `A` string.


- **getPlayer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#getPlayer()

	- **@r** `A` [HumanEntity](HumanEntity.aus.md).


- **getRenameText** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#getRenameText()

	- **@r** `A` string.


- **getRepairCost** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#getRepairCost()

	- **@r** `An` int.


- **getRepairItemCountCost** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#getRepairItemCountCost()

	- **@r** `An` int.


- **getSlotType** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#getSlotType(int)

	- **@p** `Slot` is an int.
	- **@r** `A` string naming an InventoryType.SlotType.


- **getTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#getTitle()

	- **@r** `A` string.


- **getTopInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#getTopInventory()

	- **@r** `An` [AnvilInventory](AnvilInventory.aus.md).


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#getType()

	- **@r** `An` string naming an [InventoryType](InventoryType.aus.md).


- **open** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#open()



- **setCursor** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#setCursor(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setItem** (`Slot, Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#setItem(int,org.bukkit.inventory.ItemStack)

	- **@p** `Slot` is an int.
	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setMaximumRepairCost** (`Levels`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#setMaximumRepairCost(int)

	- **@p** `Levels` is an int.


- **setProperty** (`Prop, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#setProperty(org.bukkit.inventory.InventoryView.Property,int)

	- **@p** `Prop` is a string naming an InventoryView.Property.
	- **@p** `Value` is an int.
	- **@r** `A` bool.


- **setRepairCost** (`Cost`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#setRepairCost(int)

	- **@p** `Cost` is an int.


- **setRepairItemCountCost** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#setRepairItemCountCost(int)

	- **@p** `Amount` is an int.


- **setTitle** (`Title`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#setTitle(java.lang.String)

	- **@p** `Title` is a string.


- **title** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/AnvilView.html#title()

	- **@r** `A` Component.




