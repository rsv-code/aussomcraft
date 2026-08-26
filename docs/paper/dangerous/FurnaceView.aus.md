# file: FurnaceView.aus

## class: FurnaceView

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.FurnaceViewShim) **extends: object** 

Generated shim for org.bukkit.inventory.view.FurnaceView.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html
In Paper this is a [InventoryView](InventoryView.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **close** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#close()



- **convertSlot** (`RawSlot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#convertSlot(int)

	- **@p** `RawSlot` is an int.
	- **@r** `An` int.


- **countSlots** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#countSlots()

	- **@r** `An` int.


- **getBottomInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#getBottomInventory()

	- **@r** `An` [Inventory](Inventory.aus.md).


- **getBurnTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#getBurnTime()

	- **@r** `A` double.


- **getCookTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#getCookTime()

	- **@r** `A` double.


- **getCursor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#getCursor()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getInventory** (`RawSlot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#getInventory(int)

	- **@p** `RawSlot` is an int.
	- **@r** `An` [Inventory](Inventory.aus.md).


- **getItem** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#getItem(int)

	- **@p** `Slot` is an int.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getMenuType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#getMenuType()

	- **@r** `A` [MenuType](MenuType.aus.md).


- **getOriginalTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#getOriginalTitle()

	- **@r** `A` string.


- **getPlayer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#getPlayer()

	- **@r** `A` [HumanEntity](HumanEntity.aus.md).


- **getSlotType** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#getSlotType(int)

	- **@p** `Slot` is an int.
	- **@r** `A` string naming an InventoryType.SlotType.


- **getTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#getTitle()

	- **@r** `A` string.


- **getTopInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#getTopInventory()

	- **@r** `A` [FurnaceInventory](FurnaceInventory.aus.md).


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#getType()

	- **@r** `An` string naming an [InventoryType](InventoryType.aus.md).


- **isBurning** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#isBurning()

	- **@r** `A` bool.


- **open** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#open()



- **setBurnTime** (`BurnProgress, BurnDuration`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#setBurnTime(int,int)

	- **@p** `BurnProgress` is an int.
	- **@p** `BurnDuration` is an int.


- **setCookTime** (`CookProgress, CookDuration`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#setCookTime(int,int)

	- **@p** `CookProgress` is an int.
	- **@p** `CookDuration` is an int.


- **setCursor** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#setCursor(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setItem** (`Slot, Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#setItem(int,org.bukkit.inventory.ItemStack)

	- **@p** `Slot` is an int.
	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setProperty** (`Prop, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#setProperty(org.bukkit.inventory.InventoryView.Property,int)

	- **@p** `Prop` is a string naming an InventoryView.Property.
	- **@p** `Value` is an int.
	- **@r** `A` bool.


- **setTitle** (`Title`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#setTitle(java.lang.String)

	- **@p** `Title` is a string.


- **title** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/FurnaceView.html#title()

	- **@r** `A` Component.




