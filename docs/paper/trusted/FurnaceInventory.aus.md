# file: FurnaceInventory.aus

## class: FurnaceInventory

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.FurnaceInventoryShim) **extends: object** 

Generated shim for org.bukkit.inventory.FurnaceInventory.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html
In Paper this is a [Inventory](Inventory.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **canSmelt** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#canSmelt(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **clear** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#clear()



- **clear** (`Index`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#clear(int)

	- **@p** `Index` is an int.


- **close** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#close()

	- **@r** `An` int.


- **contains** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#contains(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **contains\_material** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#contains(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@r** `A` bool.


- **contains** (`Item, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#contains(org.bukkit.inventory.ItemStack,int)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `A` bool.


- **contains\_material\_amount** (`Material, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#contains(org.bukkit.Material,int)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `A` bool.


- **containsAtLeast** (`Item, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#containsAtLeast(org.bukkit.inventory.ItemStack,int)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `A` bool.


- **first** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#first(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `An` int.


- **first\_material** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#first(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@r** `An` int.


- **firstEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#firstEmpty()

	- **@r** `An` int.


- **getFuel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#getFuel()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getHolder** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#getHolder()

	- **@r** `A` [Furnace](Furnace.aus.md).


- **getHolder** (`UseSnapshot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#getHolder(boolean)

	- **@p** `UseSnapshot` is a bool.
	- **@r** `An` [InventoryHolder](InventoryHolder.aus.md).


- **getItem** (`Index`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#getItem(int)

	- **@p** `Index` is an int.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getMaxStackSize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#getMaxStackSize()

	- **@r** `An` int.


- **getResult** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#getResult()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getSize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#getSize()

	- **@r** `An` int.


- **getSmelting** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#getSmelting()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#getType()

	- **@r** `An` string naming an [InventoryType](InventoryType.aus.md).


- **getViewers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#getViewers()

	- **@r** `A` list.


- **isEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#isEmpty()

	- **@r** `A` bool.


- **isFuel** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#isFuel(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **remove** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#remove(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **remove\_material** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#remove(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).


- **setFuel** (`Stack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#setFuel(org.bukkit.inventory.ItemStack)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).


- **setItem** (`Index, Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#setItem(int,org.bukkit.inventory.ItemStack)

	- **@p** `Index` is an int.
	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setMaxStackSize** (`Size`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#setMaxStackSize(int)

	- **@p** `Size` is an int.


- **setResult** (`Stack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#setResult(org.bukkit.inventory.ItemStack)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).


- **setSmelting** (`Stack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/FurnaceInventory.html#setSmelting(org.bukkit.inventory.ItemStack)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).




