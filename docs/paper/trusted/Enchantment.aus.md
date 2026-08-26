# file: Enchantment.aus

## class: Enchantment

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.EnchantmentShim) **extends: object** 

Generated shim for org.bukkit.enchantments.Enchantment.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html
In Paper this is a [Keyed](Keyed.aus.md) and
[Translatable](Translatable.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **canEnchantItem** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#canEnchantItem(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **conflictsWith** (`Other`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#conflictsWith(org.bukkit.enchantments.Enchantment)

	- **@p** `Other` is an [Enchantment](Enchantment.aus.md).
	- **@r** `A` bool.


- **description** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#description()

	- **@r** `A` Component.


- **displayName** (`Level`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#displayName(int)

	- **@p** `Level` is an int.
	- **@r** `A` Component.


- **getActiveSlotGroups** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getActiveSlotGroups()

	- **@r** `A` list.


- **getActiveSlots** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getActiveSlots()

	- **@r** `A` list.


- **getAnvilCost** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getAnvilCost()

	- **@r** `An` int.


- **getByKey** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getByKey(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `An` [Enchantment](Enchantment.aus.md).


- **getByName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getByName(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `An` [Enchantment](Enchantment.aus.md).


- **getDamageIncrease** (`Level, EntityCategory`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getDamageIncrease(int,org.bukkit.entity.EntityCategory)

	- **@p** `Level` is an int.
	- **@p** `EntityCategory` is an string naming an [EntityCategory](EntityCategory.aus.md).
	- **@r** `A` double.


- **getDamageIncrease\_level\_entitytype** (`Level, EntityType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getDamageIncrease(int,org.bukkit.entity.EntityType)

	- **@p** `Level` is an int.
	- **@p** `EntityType` is an string naming an [EntityType](EntityType.aus.md).
	- **@r** `A` double.


- **getExclusiveWith** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getExclusiveWith()

	- **@r** `A` [RegistryKeySet](RegistryKeySet.aus.md).


- **getItemTarget** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getItemTarget()

	- **@r** `An` string naming an [EnchantmentTarget](EnchantmentTarget.aus.md).


- **getKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getKey()

	- **@r** `A` [NamespacedKey](NamespacedKey.aus.md).


- **getMaxLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getMaxLevel()

	- **@r** `An` int.


- **getMaxModifiedCost** (`Level`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getMaxModifiedCost(int)

	- **@p** `Level` is an int.
	- **@r** `An` int.


- **getMinModifiedCost** (`Level`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getMinModifiedCost(int)

	- **@p** `Level` is an int.
	- **@r** `An` int.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getName()

	- **@r** `A` string.


- **getPrimaryItems** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getPrimaryItems()

	- **@r** `A` [RegistryKeySet](RegistryKeySet.aus.md).


- **getRarity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getRarity()

	- **@r** `An` string naming an [EnchantmentRarity](EnchantmentRarity.aus.md).


- **getStartLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getStartLevel()

	- **@r** `An` int.


- **getSupportedItems** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getSupportedItems()

	- **@r** `A` [RegistryKeySet](RegistryKeySet.aus.md).


- **getTranslationKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getTranslationKey()

	- **@r** `A` string.


- **getWeight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#getWeight()

	- **@r** `An` int.


- **isCursed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#isCursed()

	- **@r** `A` bool.


- **isDiscoverable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#isDiscoverable()

	- **@r** `A` bool.


- **isTradeable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#isTradeable()

	- **@r** `A` bool.


- **isTreasure** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#isTreasure()

	- **@r** `A` bool.


- **translationKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/Enchantment.html#translationKey()

	- **@r** `A` string.




