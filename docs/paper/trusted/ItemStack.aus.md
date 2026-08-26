# file: ItemStack.aus

## class: ItemStack

[23:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.ItemStackShim) **extends: object** 

Generated shim for org.bukkit.inventory.ItemStack.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html
In Paper this is a
[ConfigurationSerializable](ConfigurationSerializable.aus.md),
[Translatable](Translatable.aus.md),
[PersistentDataViewHolder](PersistentDataViewHolder.aus.md) and
[DataComponentHolder](DataComponentHolder.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getAmount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getAmount()

	- **@r** `An` int.


- **getDurability** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getDurability()

	- **@r** `An` int.


- **getLore** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getLore()

	- **@r** `A` list.


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getType()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **hasItemMeta** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#hasItemMeta()

	- **@r** `A` bool.


- **isEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#isEmpty()

	- **@r** `A` bool.


- **add** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#add()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **add** (`Qty`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#add(int)

	- **@p** `Qty` is an int.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **addEnchantment** (`Enchant, Level`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#addEnchantment(org.bukkit.enchantments.Enchantment,int)

	- **@p** `Enchant` is an [Enchantment](Enchantment.aus.md).
	- **@p** `Level` is an int.


- **addEnchantments** (`Enchantments`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#addEnchantments(java.util.Map)

	- **@p** `Enchantments` is a map.


- **addUnsafeEnchantment** (`Enchant, Level`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#addUnsafeEnchantment(org.bukkit.enchantments.Enchantment,int)

	- **@p** `Enchant` is an [Enchantment](Enchantment.aus.md).
	- **@p** `Level` is an int.


- **addUnsafeEnchantments** (`Enchantments`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#addUnsafeEnchantments(java.util.Map)

	- **@p** `Enchantments` is a map.


- **asOne** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#asOne()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **asQuantity** (`Qty`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#asQuantity(int)

	- **@p** `Qty` is an int.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **canRepair** (`ToBeRepaired`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#canRepair(org.bukkit.inventory.ItemStack)

	- **@p** `ToBeRepaired` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **clone** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#clone()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **computeTooltipLines** (`TooltipContext, Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#computeTooltipLines(io.papermc.paper.inventory.tooltip.TooltipContext,org.bukkit.entity.Player)

	- **@p** `TooltipContext` is a [TooltipContext](TooltipContext.aus.md).
	- **@p** `Player` is a [Player](Player.aus.md).
	- **@r** `A` list.


- **containsEnchantment** (`Enchant`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#containsEnchantment(org.bukkit.enchantments.Enchantment)

	- **@p** `Enchant` is an [Enchantment](Enchantment.aus.md).
	- **@r** `A` bool.


- **damage** (`Amount, LivingEntity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#damage(int,org.bukkit.entity.LivingEntity)

	- **@p** `Amount` is an int.
	- **@p** `LivingEntity` is a [LivingEntity](LivingEntity.aus.md).
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **deserialize** (`Args`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#deserialize(java.util.Map)

	- **@p** `Args` is a map.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **displayName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#displayName()

	- **@r** `A` Component.


- **effectiveName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#effectiveName()

	- **@r** `A` Component.


- **empty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#empty()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **ensureServerConversions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#ensureServerConversions()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **equals** (`Obj`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#equals(java.lang.Object)

	- **@p** `Obj` is an Object.
	- **@r** `A` bool.


- **getData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getData()

	- **@r** `A` [MaterialData](MaterialData.aus.md).


- **getData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getData(io.papermc.paper.datacomponent.DataComponentType.Valued)

	- **@p** `Type` is a DataComponentType.Valued.
	- **@r** `An` Object.


- **getDataOrDefault** (`Type, Fallback`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getDataOrDefault(io.papermc.paper.datacomponent.DataComponentType.Valued,java.lang.Object)

	- **@p** `Type` is a DataComponentType.Valued.
	- **@p** `Fallback` is an Object.
	- **@r** `An` Object.


- **getDataTypes** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getDataTypes()

	- **@r** `A` list.


- **getEnchantmentLevel** (`Enchant`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getEnchantmentLevel(org.bukkit.enchantments.Enchantment)

	- **@p** `Enchant` is an [Enchantment](Enchantment.aus.md).
	- **@r** `An` int.


- **getEnchantments** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getEnchantments()

	- **@r** `A` map.


- **getI18NDisplayName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getI18NDisplayName()

	- **@r** `A` string.


- **getItemFlags** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getItemFlags()

	- **@r** `A` list.


- **getItemMeta** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getItemMeta()

	- **@r** `An` [ItemMeta](ItemMeta.aus.md).


- **getMaxItemUseDuration** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getMaxItemUseDuration()

	- **@r** `An` int.


- **getMaxItemUseDuration** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getMaxItemUseDuration(org.bukkit.entity.LivingEntity)

	- **@p** `Entity` is a [LivingEntity](LivingEntity.aus.md).
	- **@r** `An` int.


- **getMaxStackSize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getMaxStackSize()

	- **@r** `An` int.


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainerView](PersistentDataContainerView.aus.md).


- **getRarity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getRarity()

	- **@r** `An` string naming an [ItemRarity](ItemRarity.aus.md).


- **getTranslationKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#getTranslationKey()

	- **@r** `A` string.


- **hasData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#hasData(io.papermc.paper.datacomponent.DataComponentType)

	- **@p** `Type` is a [DataComponentType](DataComponentType.aus.md).
	- **@r** `A` bool.


- **hasItemFlag** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#hasItemFlag(org.bukkit.inventory.ItemFlag)

	- **@p** `Flag` is an string naming an [ItemFlag](ItemFlag.aus.md).
	- **@r** `A` bool.


- **hashCode** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#hashCode()

	- **@r** `An` int.


- **isDataOverridden** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#isDataOverridden(io.papermc.paper.datacomponent.DataComponentType)

	- **@p** `Type` is a [DataComponentType](DataComponentType.aus.md).
	- **@r** `A` bool.


- **isRepairableBy** (`RepairMaterial`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#isRepairableBy(org.bukkit.inventory.ItemStack)

	- **@p** `RepairMaterial` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **isSimilar** (`Stack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#isSimilar(org.bukkit.inventory.ItemStack)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **lore** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#lore()

	- **@r** `A` list.


- **lore** (`Lore`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#lore(java.util.List)

	- **@p** `Lore` is a list.


- **matchesWithoutData** (`Item, ExcludeTypes`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#matchesWithoutData(org.bukkit.inventory.ItemStack,java.util.Set)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@p** `ExcludeTypes` is a list.
	- **@r** `A` bool.


- **matchesWithoutData** (`Item, ExcludeTypes, IgnoreCount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#matchesWithoutData(org.bukkit.inventory.ItemStack,java.util.Set,boolean)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@p** `ExcludeTypes` is a list.
	- **@p** `IgnoreCount` is a bool.
	- **@r** `A` bool.


- **of** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#of(org.bukkit.Material)

	- **@p** `Type` is a string naming a [Material](Material.aus.md).
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **of** (`Type, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#of(org.bukkit.Material,int)

	- **@p** `Type` is a string naming a [Material](Material.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **removeEnchantment** (`Enchant`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#removeEnchantment(org.bukkit.enchantments.Enchantment)

	- **@p** `Enchant` is an [Enchantment](Enchantment.aus.md).
	- **@r** `An` int.


- **removeEnchantments** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#removeEnchantments()



- **resetData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#resetData(io.papermc.paper.datacomponent.DataComponentType)

	- **@p** `Type` is a [DataComponentType](DataComponentType.aus.md).


- **serialize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#serialize()

	- **@r** `A` map.


- **setAmount** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#setAmount(int)

	- **@p** `Amount` is an int.


- **setDurability** (`Durability`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#setDurability(short)

	- **@p** `Durability` is an int.


- **setItemMeta** (`ItemMeta`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#setItemMeta(org.bukkit.inventory.meta.ItemMeta)

	- **@p** `ItemMeta` is an [ItemMeta](ItemMeta.aus.md).
	- **@r** `A` bool.


- **setLore** (`Lore`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#setLore(java.util.List)

	- **@p** `Lore` is a list.


- **setType** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#setType(org.bukkit.Material)

	- **@p** `Type` is a string naming a [Material](Material.aus.md).


- **subtract** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#subtract()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **subtract** (`Qty`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#subtract(int)

	- **@p** `Qty` is an int.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **toString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#toString()

	- **@r** `A` string.


- **translationKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#translationKey()

	- **@r** `A` string.


- **unsetData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#unsetData(io.papermc.paper.datacomponent.DataComponentType)

	- **@p** `Type` is a [DataComponentType](DataComponentType.aus.md).


- **withType** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/ItemStack.html#withType(org.bukkit.Material)

	- **@p** `Type` is a string naming a [Material](Material.aus.md).
	- **@r** `An` [ItemStack](ItemStack.aus.md).




