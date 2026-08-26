# file: LlamaInventory.aus

## class: LlamaInventory

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.LlamaInventoryShim) **extends: object** 

Generated shim for org.bukkit.inventory.LlamaInventory.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html
In Paper this is a
[SaddledHorseInventory](SaddledHorseInventory.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **clear** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#clear()



- **clear** (`Index`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#clear(int)

	- **@p** `Index` is an int.


- **close** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#close()

	- **@r** `An` int.


- **contains** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#contains(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **contains\_material** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#contains(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@r** `A` bool.


- **contains** (`Item, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#contains(org.bukkit.inventory.ItemStack,int)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `A` bool.


- **contains\_material\_amount** (`Material, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#contains(org.bukkit.Material,int)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `A` bool.


- **containsAtLeast** (`Item, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#containsAtLeast(org.bukkit.inventory.ItemStack,int)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `A` bool.


- **first** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#first(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `An` int.


- **first\_material** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#first(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@r** `An` int.


- **firstEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#firstEmpty()

	- **@r** `An` int.


- **getDecor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#getDecor()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getHolder** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#getHolder()

	- **@r** `An` [InventoryHolder](InventoryHolder.aus.md).


- **getHolder** (`UseSnapshot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#getHolder(boolean)

	- **@p** `UseSnapshot` is a bool.
	- **@r** `An` [InventoryHolder](InventoryHolder.aus.md).


- **getItem** (`Index`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#getItem(int)

	- **@p** `Index` is an int.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getMaxStackSize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#getMaxStackSize()

	- **@r** `An` int.


- **getSaddle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#getSaddle()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getSize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#getSize()

	- **@r** `An` int.


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#getType()

	- **@r** `An` string naming an [InventoryType](InventoryType.aus.md).


- **getViewers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#getViewers()

	- **@r** `A` list.


- **isEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#isEmpty()

	- **@r** `A` bool.


- **remove** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#remove(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **remove\_material** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#remove(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).


- **setDecor** (`Stack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#setDecor(org.bukkit.inventory.ItemStack)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).


- **setItem** (`Index, Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#setItem(int,org.bukkit.inventory.ItemStack)

	- **@p** `Index` is an int.
	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setMaxStackSize** (`Size`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#setMaxStackSize(int)

	- **@p** `Size` is an int.


- **setSaddle** (`Stack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/LlamaInventory.html#setSaddle(org.bukkit.inventory.ItemStack)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).




