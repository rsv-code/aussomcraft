# file: SpawnEggMeta.aus

## class: SpawnEggMeta

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.SpawnEggMetaShim) **extends: object** 

Generated shim for org.bukkit.inventory.meta.SpawnEggMeta.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html
In Paper this is a [ItemMeta](ItemMeta.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addAttributeModifier** (`Attribute, Modifier`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#addAttributeModifier(org.bukkit.attribute.Attribute,org.bukkit.attribute.AttributeModifier)

	- **@p** `Attribute` is an [Attribute](Attribute.aus.md).
	- **@p** `Modifier` is an [AttributeModifier](AttributeModifier.aus.md).
	- **@r** `A` bool.


- **addEnchant** (`Enchant, Level, IgnoreLevelRestriction`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#addEnchant(org.bukkit.enchantments.Enchantment,int,boolean)

	- **@p** `Enchant` is an [Enchantment](Enchantment.aus.md).
	- **@p** `Level` is an int.
	- **@p** `IgnoreLevelRestriction` is a bool.
	- **@r** `A` bool.


- **clone** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#clone()

	- **@r** `A` [SpawnEggMeta](SpawnEggMeta.aus.md).


- **customName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#customName()

	- **@r** `A` Component.


- **customName** (`CustomName`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#customName(net.kyori.adventure.text.Component)

	- **@p** `CustomName` is a Component.


- **displayName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#displayName()

	- **@r** `A` Component.


- **displayName** (`DisplayName`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#displayName(net.kyori.adventure.text.Component)

	- **@p** `DisplayName` is a Component.


- **getAsComponentString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getAsComponentString()

	- **@r** `A` string.


- **getAsString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getAsString()

	- **@r** `A` string.


- **getAttributeModifiers** (`Attribute`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getAttributeModifiers(org.bukkit.attribute.Attribute)

	- **@p** `Attribute` is an [Attribute](Attribute.aus.md).
	- **@r** `A` list.


- **getCanDestroy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getCanDestroy()

	- **@r** `A` list.


- **getCanPlaceOn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getCanPlaceOn()

	- **@r** `A` list.


- **getCustomModelData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getCustomModelData()

	- **@r** `An` int.


- **getCustomModelDataComponent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getCustomModelDataComponent()

	- **@r** `A` [CustomModelDataComponent](CustomModelDataComponent.aus.md).


- **getCustomSpawnedType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getCustomSpawnedType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getCustomTagContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getCustomTagContainer()

	- **@r** `A` [CustomItemTagContainer](CustomItemTagContainer.aus.md).


- **getDamageResistant** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getDamageResistant()

	- **@r** `A` [Tag](Tag.aus.md).


- **getDamageResistantTypes** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getDamageResistantTypes()

	- **@r** `A` [RegistryKeySet](RegistryKeySet.aus.md).


- **getDestroyableKeys** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getDestroyableKeys()

	- **@r** `A` list.


- **getDisplayName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getDisplayName()

	- **@r** `A` string.


- **getEnchantLevel** (`Enchant`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getEnchantLevel(org.bukkit.enchantments.Enchantment)

	- **@p** `Enchant` is an [Enchantment](Enchantment.aus.md).
	- **@r** `An` int.


- **getEnchantable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getEnchantable()

	- **@r** `An` int.


- **getEnchantmentGlintOverride** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getEnchantmentGlintOverride()

	- **@r** `A` bool.


- **getEnchants** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getEnchants()

	- **@r** `A` map.


- **getEquippable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getEquippable()

	- **@r** `An` [EquippableComponent](EquippableComponent.aus.md).


- **getFood** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getFood()

	- **@r** `A` [FoodComponent](FoodComponent.aus.md).


- **getItemFlags** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getItemFlags()

	- **@r** `A` list.


- **getItemModel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getItemModel()

	- **@r** `A` [NamespacedKey](NamespacedKey.aus.md).


- **getItemName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getItemName()

	- **@r** `A` string.


- **getJukeboxPlayable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getJukeboxPlayable()

	- **@r** `A` [JukeboxPlayableComponent](JukeboxPlayableComponent.aus.md).


- **getLocalizedName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getLocalizedName()

	- **@r** `A` string.


- **getLore** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getLore()

	- **@r** `A` list.


- **getLoreComponents** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getLoreComponents()

	- **@r** `A` list.


- **getMaxStackSize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getMaxStackSize()

	- **@r** `An` int.


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getPlaceableKeys** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getPlaceableKeys()

	- **@r** `A` list.


- **getRarity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getRarity()

	- **@r** `An` string naming an [ItemRarity](ItemRarity.aus.md).


- **getSpawnedEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getSpawnedEntity()

	- **@r** `An` [EntitySnapshot](EntitySnapshot.aus.md).


- **getSpawnedType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getSpawnedType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getTool** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getTool()

	- **@r** `A` [ToolComponent](ToolComponent.aus.md).


- **getTooltipStyle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getTooltipStyle()

	- **@r** `A` [NamespacedKey](NamespacedKey.aus.md).


- **getUseCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getUseCooldown()

	- **@r** `An` [UseCooldownComponent](UseCooldownComponent.aus.md).


- **getUseRemainder** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#getUseRemainder()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **hasAttributeModifiers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasAttributeModifiers()

	- **@r** `A` bool.


- **hasConflictingEnchant** (`Enchant`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasConflictingEnchant(org.bukkit.enchantments.Enchantment)

	- **@p** `Enchant` is an [Enchantment](Enchantment.aus.md).
	- **@r** `A` bool.


- **hasCustomModelData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasCustomModelData()

	- **@r** `A` bool.


- **hasCustomModelDataComponent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasCustomModelDataComponent()

	- **@r** `A` bool.


- **hasCustomName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasCustomName()

	- **@r** `A` bool.


- **hasDamageResistant** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasDamageResistant()

	- **@r** `A` bool.


- **hasDestroyableKeys** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasDestroyableKeys()

	- **@r** `A` bool.


- **hasDisplayName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasDisplayName()

	- **@r** `A` bool.


- **hasEnchant** (`Enchant`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasEnchant(org.bukkit.enchantments.Enchantment)

	- **@p** `Enchant` is an [Enchantment](Enchantment.aus.md).
	- **@r** `A` bool.


- **hasEnchantable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasEnchantable()

	- **@r** `A` bool.


- **hasEnchantmentGlintOverride** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasEnchantmentGlintOverride()

	- **@r** `A` bool.


- **hasEnchants** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasEnchants()

	- **@r** `A` bool.


- **hasEquippable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasEquippable()

	- **@r** `A` bool.


- **hasFood** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasFood()

	- **@r** `A` bool.


- **hasItemFlag** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasItemFlag(org.bukkit.inventory.ItemFlag)

	- **@p** `Flag` is an string naming an [ItemFlag](ItemFlag.aus.md).
	- **@r** `A` bool.


- **hasItemModel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasItemModel()

	- **@r** `A` bool.


- **hasItemName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasItemName()

	- **@r** `A` bool.


- **hasJukeboxPlayable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasJukeboxPlayable()

	- **@r** `A` bool.


- **hasLocalizedName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasLocalizedName()

	- **@r** `A` bool.


- **hasLore** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasLore()

	- **@r** `A` bool.


- **hasMaxStackSize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasMaxStackSize()

	- **@r** `A` bool.


- **hasPlaceableKeys** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasPlaceableKeys()

	- **@r** `A` bool.


- **hasRarity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasRarity()

	- **@r** `A` bool.


- **hasTool** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasTool()

	- **@r** `A` bool.


- **hasTooltipStyle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasTooltipStyle()

	- **@r** `A` bool.


- **hasUseCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasUseCooldown()

	- **@r** `A` bool.


- **hasUseRemainder** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#hasUseRemainder()

	- **@r** `A` bool.


- **isFireResistant** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#isFireResistant()

	- **@r** `A` bool.


- **isGlider** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#isGlider()

	- **@r** `A` bool.


- **isHideTooltip** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#isHideTooltip()

	- **@r** `A` bool.


- **isUnbreakable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#isUnbreakable()

	- **@r** `A` bool.


- **itemName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#itemName()

	- **@r** `A` Component.


- **itemName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#itemName(net.kyori.adventure.text.Component)

	- **@p** `Name` is a Component.


- **lore** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#lore()

	- **@r** `A` list.


- **lore** (`Lore`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#lore(java.util.List)

	- **@p** `Lore` is a list.


- **removeAttributeModifier** (`Attribute`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#removeAttributeModifier(org.bukkit.attribute.Attribute)

	- **@p** `Attribute` is an [Attribute](Attribute.aus.md).
	- **@r** `A` bool.


- **removeAttributeModifier\_slot** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#removeAttributeModifier(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).
	- **@r** `A` bool.


- **removeAttributeModifier** (`Attribute, Modifier`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#removeAttributeModifier(org.bukkit.attribute.Attribute,org.bukkit.attribute.AttributeModifier)

	- **@p** `Attribute` is an [Attribute](Attribute.aus.md).
	- **@p** `Modifier` is an [AttributeModifier](AttributeModifier.aus.md).
	- **@r** `A` bool.


- **removeEnchant** (`Enchant`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#removeEnchant(org.bukkit.enchantments.Enchantment)

	- **@p** `Enchant` is an [Enchantment](Enchantment.aus.md).
	- **@r** `A` bool.


- **removeEnchantments** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#removeEnchantments()



- **serialize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#serialize()

	- **@r** `A` map.


- **setCanDestroy** (`CanDestroy`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setCanDestroy(java.util.Set)

	- **@p** `CanDestroy` is a list.


- **setCanPlaceOn** (`CanPlaceOn`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setCanPlaceOn(java.util.Set)

	- **@p** `CanPlaceOn` is a list.


- **setCustomModelData** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setCustomModelData(java.lang.Integer)

	- **@p** `Data` is an int.


- **setCustomModelDataComponent** (`CustomModelData`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setCustomModelDataComponent(org.bukkit.inventory.meta.components.CustomModelDataComponent)

	- **@p** `CustomModelData` is a [CustomModelDataComponent](CustomModelDataComponent.aus.md).


- **setCustomSpawnedType** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setCustomSpawnedType(org.bukkit.entity.EntityType)

	- **@p** `Type` is an string naming an [EntityType](EntityType.aus.md).


- **setDamageResistant** (`Tag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setDamageResistant(org.bukkit.Tag)

	- **@p** `Tag` is a [Tag](Tag.aus.md).


- **setDamageResistantTypes** (`Types`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setDamageResistantTypes(io.papermc.paper.registry.set.RegistryKeySet)

	- **@p** `Types` is a [RegistryKeySet](RegistryKeySet.aus.md).


- **setDestroyableKeys** (`CanDestroy`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setDestroyableKeys(java.util.Collection)

	- **@p** `CanDestroy` is a list.


- **setDisplayName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setDisplayName(java.lang.String)

	- **@p** `Name` is a string.


- **setEnchantable** (`Enchantable`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setEnchantable(java.lang.Integer)

	- **@p** `Enchantable` is an int.


- **setEnchantmentGlintOverride** (`Override`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setEnchantmentGlintOverride(java.lang.Boolean)

	- **@p** `Override` is a bool.


- **setEquippable** (`Equippable`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setEquippable(org.bukkit.inventory.meta.components.EquippableComponent)

	- **@p** `Equippable` is an [EquippableComponent](EquippableComponent.aus.md).


- **setFireResistant** (`FireResistant`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setFireResistant(boolean)

	- **@p** `FireResistant` is a bool.


- **setFood** (`Food`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setFood(org.bukkit.inventory.meta.components.FoodComponent)

	- **@p** `Food` is a [FoodComponent](FoodComponent.aus.md).


- **setGlider** (`Glider`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setGlider(boolean)

	- **@p** `Glider` is a bool.


- **setHideTooltip** (`HideTooltip`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setHideTooltip(boolean)

	- **@p** `HideTooltip` is a bool.


- **setItemModel** (`ItemModel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setItemModel(org.bukkit.NamespacedKey)

	- **@p** `ItemModel` is a [NamespacedKey](NamespacedKey.aus.md).


- **setItemName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setItemName(java.lang.String)

	- **@p** `Name` is a string.


- **setJukeboxPlayable** (`JukeboxPlayable`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setJukeboxPlayable(org.bukkit.inventory.meta.components.JukeboxPlayableComponent)

	- **@p** `JukeboxPlayable` is a [JukeboxPlayableComponent](JukeboxPlayableComponent.aus.md).


- **setLocalizedName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setLocalizedName(java.lang.String)

	- **@p** `Name` is a string.


- **setLore** (`Lore`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setLore(java.util.List)

	- **@p** `Lore` is a list.


- **setLoreComponents** (`Lore`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setLoreComponents(java.util.List)

	- **@p** `Lore` is a list.


- **setMaxStackSize** (`Max`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setMaxStackSize(java.lang.Integer)

	- **@p** `Max` is an int.


- **setPlaceableKeys** (`CanPlaceOn`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setPlaceableKeys(java.util.Collection)

	- **@p** `CanPlaceOn` is a list.


- **setRarity** (`Rarity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setRarity(org.bukkit.inventory.ItemRarity)

	- **@p** `Rarity` is an string naming an [ItemRarity](ItemRarity.aus.md).


- **setSpawnedEntity** (`Snapshot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setSpawnedEntity(org.bukkit.entity.EntitySnapshot)

	- **@p** `Snapshot` is an [EntitySnapshot](EntitySnapshot.aus.md).


- **setSpawnedType** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setSpawnedType(org.bukkit.entity.EntityType)

	- **@p** `Type` is an string naming an [EntityType](EntityType.aus.md).


- **setTool** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setTool(org.bukkit.inventory.meta.components.ToolComponent)

	- **@p** `Tool` is a [ToolComponent](ToolComponent.aus.md).


- **setTooltipStyle** (`TooltipStyle`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setTooltipStyle(org.bukkit.NamespacedKey)

	- **@p** `TooltipStyle` is a [NamespacedKey](NamespacedKey.aus.md).


- **setUnbreakable** (`Unbreakable`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setUnbreakable(boolean)

	- **@p** `Unbreakable` is a bool.


- **setUseCooldown** (`Cooldown`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setUseCooldown(org.bukkit.inventory.meta.components.UseCooldownComponent)

	- **@p** `Cooldown` is an [UseCooldownComponent](UseCooldownComponent.aus.md).


- **setUseRemainder** (`Remainder`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setUseRemainder(org.bukkit.inventory.ItemStack)

	- **@p** `Remainder` is an [ItemStack](ItemStack.aus.md).


- **setVersion** (`Version`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/SpawnEggMeta.html#setVersion(int)

	- **@p** `Version` is an int.




