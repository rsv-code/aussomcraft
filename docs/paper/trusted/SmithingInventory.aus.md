# file: SmithingInventory.aus

## class: SmithingInventory

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.SmithingInventoryShim) **extends: object** 

Generated shim for org.bukkit.inventory.SmithingInventory.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html
In Paper this is a [Inventory](Inventory.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **clear** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#clear()



- **clear** (`Index`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#clear(int)

	- **@p** `Index` is an int.


- **close** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#close()

	- **@r** `An` int.


- **contains** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#contains(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **contains\_material** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#contains(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@r** `A` bool.


- **contains** (`Item, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#contains(org.bukkit.inventory.ItemStack,int)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `A` bool.


- **contains\_material\_amount** (`Material, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#contains(org.bukkit.Material,int)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `A` bool.


- **containsAtLeast** (`Item, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#containsAtLeast(org.bukkit.inventory.ItemStack,int)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `A` bool.


- **first** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#first(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `An` int.


- **first\_material** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#first(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@r** `An` int.


- **firstEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#firstEmpty()

	- **@r** `An` int.


- **getHolder** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#getHolder()

	- **@r** `An` [InventoryHolder](InventoryHolder.aus.md).


- **getHolder** (`UseSnapshot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#getHolder(boolean)

	- **@p** `UseSnapshot` is a bool.
	- **@r** `An` [InventoryHolder](InventoryHolder.aus.md).


- **getInputEquipment** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#getInputEquipment()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getInputMineral** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#getInputMineral()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getInputTemplate** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#getInputTemplate()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getItem** (`Index`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#getItem(int)

	- **@p** `Index` is an int.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getMaxStackSize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#getMaxStackSize()

	- **@r** `An` int.


- **getRecipe** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#getRecipe()

	- **@r** `A` [Recipe](Recipe.aus.md).


- **getResult** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#getResult()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getSize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#getSize()

	- **@r** `An` int.


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#getType()

	- **@r** `An` string naming an [InventoryType](InventoryType.aus.md).


- **getViewers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#getViewers()

	- **@r** `A` list.


- **isEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#isEmpty()

	- **@r** `A` bool.


- **remove** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#remove(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **remove\_material** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#remove(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).


- **setInputEquipment** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#setInputEquipment(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).


- **setInputMineral** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#setInputMineral(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).


- **setInputTemplate** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#setInputTemplate(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).


- **setItem** (`Index, Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#setItem(int,org.bukkit.inventory.ItemStack)

	- **@p** `Index` is an int.
	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setMaxStackSize** (`Size`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#setMaxStackSize(int)

	- **@p** `Size` is an int.


- **setResult** (`NewResult`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/SmithingInventory.html#setResult(org.bukkit.inventory.ItemStack)

	- **@p** `NewResult` is an [ItemStack](ItemStack.aus.md).




