# file: PlayerInventory.aus

## class: PlayerInventory

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.PlayerInventoryShim) **extends: object** 

Generated shim for org.bukkit.inventory.PlayerInventory.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html
In Paper this is a [Inventory](Inventory.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getHolder** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#getHolder()

	- **@r** `A` [HumanEntity](HumanEntity.aus.md).


- **getItemInMainHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#getItemInMainHand()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getSize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#getSize()

	- **@r** `An` int.


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#getType()

	- **@r** `An` string naming an [InventoryType](InventoryType.aus.md).


- **isEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#isEmpty()

	- **@r** `A` bool.


- **clear** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#clear()



- **clear** (`Index`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#clear(int)

	- **@p** `Index` is an int.


- **close** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#close()

	- **@r** `An` int.


- **contains** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#contains(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **contains\_material** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#contains(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@r** `A` bool.


- **contains** (`Item, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#contains(org.bukkit.inventory.ItemStack,int)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `A` bool.


- **contains\_material\_amount** (`Material, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#contains(org.bukkit.Material,int)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `A` bool.


- **containsAtLeast** (`Item, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#containsAtLeast(org.bukkit.inventory.ItemStack,int)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `A` bool.


- **first** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#first(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `An` int.


- **first\_material** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#first(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@r** `An` int.


- **firstEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#firstEmpty()

	- **@r** `An` int.


- **getBoots** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#getBoots()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getChestplate** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#getChestplate()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getHeldItemSlot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#getHeldItemSlot()

	- **@r** `An` int.


- **getHelmet** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#getHelmet()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getHolder** (`UseSnapshot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#getHolder(boolean)

	- **@p** `UseSnapshot` is a bool.
	- **@r** `An` [InventoryHolder](InventoryHolder.aus.md).


- **getItem\_slot** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#getItem(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getItem** (`Index`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#getItem(int)

	- **@p** `Index` is an int.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getItemInHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#getItemInHand()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getItemInOffHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#getItemInOffHand()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getLeggings** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#getLeggings()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getMaxStackSize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#getMaxStackSize()

	- **@r** `An` int.


- **getViewers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#getViewers()

	- **@r** `A` list.


- **remove** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#remove(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **remove\_material** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#remove(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).


- **setBoots** (`Boots`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#setBoots(org.bukkit.inventory.ItemStack)

	- **@p** `Boots` is an [ItemStack](ItemStack.aus.md).


- **setChestplate** (`Chestplate`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#setChestplate(org.bukkit.inventory.ItemStack)

	- **@p** `Chestplate` is an [ItemStack](ItemStack.aus.md).


- **setHeldItemSlot** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#setHeldItemSlot(int)

	- **@p** `Slot` is an int.


- **setHelmet** (`Helmet`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#setHelmet(org.bukkit.inventory.ItemStack)

	- **@p** `Helmet` is an [ItemStack](ItemStack.aus.md).


- **setItem\_slot\_item** (`Slot, Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#setItem(org.bukkit.inventory.EquipmentSlot,org.bukkit.inventory.ItemStack)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).
	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setItem** (`Index, Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#setItem(int,org.bukkit.inventory.ItemStack)

	- **@p** `Index` is an int.
	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setItemInHand** (`Stack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#setItemInHand(org.bukkit.inventory.ItemStack)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).


- **setItemInMainHand** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#setItemInMainHand(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setItemInOffHand** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#setItemInOffHand(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setLeggings** (`Leggings`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#setLeggings(org.bukkit.inventory.ItemStack)

	- **@p** `Leggings` is an [ItemStack](ItemStack.aus.md).


- **setMaxStackSize** (`Size`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/PlayerInventory.html#setMaxStackSize(int)

	- **@p** `Size` is an int.




