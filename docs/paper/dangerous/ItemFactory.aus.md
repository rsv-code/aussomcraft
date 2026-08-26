# file: ItemFactory.aus

## class: ItemFactory

[15:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.ItemFactoryShim) **extends: object** 

Generated shim for org.bukkit.inventory.ItemFactory.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemFactory.html
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **asMetaFor** (`Meta, Stack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemFactory.html#asMetaFor(org.bukkit.inventory.meta.ItemMeta,org.bukkit.inventory.ItemStack)

	- **@p** `Meta` is an [ItemMeta](ItemMeta.aus.md).
	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `An` [ItemMeta](ItemMeta.aus.md).


- **asMetaFor\_meta\_material** (`Meta, Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemFactory.html#asMetaFor(org.bukkit.inventory.meta.ItemMeta,org.bukkit.Material)

	- **@p** `Meta` is an [ItemMeta](ItemMeta.aus.md).
	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@r** `An` [ItemMeta](ItemMeta.aus.md).


- **createItemStack** (`Input`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemFactory.html#createItemStack(java.lang.String)

	- **@p** `Input` is a string.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **displayName** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemFactory.html#displayName(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` Component.


- **enchantItem** (`Item, Level, AllowTreasures`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemFactory.html#enchantItem(org.bukkit.inventory.ItemStack,int,boolean)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Level` is an int.
	- **@p** `AllowTreasures` is a bool.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **enchantItem** (`Entity, Item, Level, AllowTreasures`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemFactory.html#enchantItem(org.bukkit.entity.Entity,org.bukkit.inventory.ItemStack,int,boolean)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Level` is an int.
	- **@p** `AllowTreasures` is a bool.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **enchantItem\_world\_item\_level\_allowtreasures** (`World, Item, Level, AllowTreasures`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemFactory.html#enchantItem(org.bukkit.World,org.bukkit.inventory.ItemStack,int,boolean)

	- **@p** `World` is a [World](World.aus.md).
	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Level` is an int.
	- **@p** `AllowTreasures` is a bool.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **ensureServerConversions** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemFactory.html#ensureServerConversions(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **equals** (`Meta1, Meta2`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemFactory.html#equals(org.bukkit.inventory.meta.ItemMeta,org.bukkit.inventory.meta.ItemMeta)

	- **@p** `Meta1` is an [ItemMeta](ItemMeta.aus.md).
	- **@p** `Meta2` is an [ItemMeta](ItemMeta.aus.md).
	- **@r** `A` bool.


- **getDefaultLeatherColor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemFactory.html#getDefaultLeatherColor()

	- **@r** `A` [Color](Color.aus.md).


- **getI18NDisplayName** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemFactory.html#getI18NDisplayName(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` string.


- **getItemMeta** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemFactory.html#getItemMeta(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@r** `An` [ItemMeta](ItemMeta.aus.md).


- **getSpawnEgg** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemFactory.html#getSpawnEgg(org.bukkit.entity.EntityType)

	- **@p** `Type` is an string naming an [EntityType](EntityType.aus.md).
	- **@r** `A` string naming a [Material](Material.aus.md).


- **isApplicable** (`Meta, Stack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemFactory.html#isApplicable(org.bukkit.inventory.meta.ItemMeta,org.bukkit.inventory.ItemStack)

	- **@p** `Meta` is an [ItemMeta](ItemMeta.aus.md).
	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **isApplicable\_meta\_material** (`Meta, Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemFactory.html#isApplicable(org.bukkit.inventory.meta.ItemMeta,org.bukkit.Material)

	- **@p** `Meta` is an [ItemMeta](ItemMeta.aus.md).
	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@r** `A` bool.




