# file: EnchantmentWrapper.aus

## class: EnchantmentWrapper

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.EnchantmentWrapperShim) **extends: object** 

Generated shim for org.bukkit.enchantments.EnchantmentWrapper.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html
In Paper this is a [Enchantment](Enchantment.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **canEnchantItem** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#canEnchantItem(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **conflictsWith** (`Other`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#conflictsWith(org.bukkit.enchantments.Enchantment)

	- **@p** `Other` is an [Enchantment](Enchantment.aus.md).
	- **@r** `A` bool.


- **description** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#description()

	- **@r** `A` Component.


- **displayName** (`Level`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#displayName(int)

	- **@p** `Level` is an int.
	- **@r** `A` Component.


- **getActiveSlotGroups** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getActiveSlotGroups()

	- **@r** `A` list.


- **getActiveSlots** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getActiveSlots()

	- **@r** `A` list.


- **getAnvilCost** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getAnvilCost()

	- **@r** `An` int.


- **getByKey** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getByKey(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `An` [Enchantment](Enchantment.aus.md).


- **getByName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getByName(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `An` [Enchantment](Enchantment.aus.md).


- **getDamageIncrease** (`Level, EntityCategory`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getDamageIncrease(int,org.bukkit.entity.EntityCategory)

	- **@p** `Level` is an int.
	- **@p** `EntityCategory` is an string naming an [EntityCategory](EntityCategory.aus.md).
	- **@r** `A` double.


- **getDamageIncrease\_level\_entitytype** (`Level, EntityType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getDamageIncrease(int,org.bukkit.entity.EntityType)

	- **@p** `Level` is an int.
	- **@p** `EntityType` is an string naming an [EntityType](EntityType.aus.md).
	- **@r** `A` double.


- **getEnchantment** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getEnchantment()

	- **@r** `An` [Enchantment](Enchantment.aus.md).


- **getExclusiveWith** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getExclusiveWith()

	- **@r** `A` [RegistryKeySet](RegistryKeySet.aus.md).


- **getItemTarget** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getItemTarget()

	- **@r** `An` string naming an [EnchantmentTarget](EnchantmentTarget.aus.md).


- **getKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getKey()

	- **@r** `A` [NamespacedKey](NamespacedKey.aus.md).


- **getMaxLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getMaxLevel()

	- **@r** `An` int.


- **getMaxModifiedCost** (`Level`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getMaxModifiedCost(int)

	- **@p** `Level` is an int.
	- **@r** `An` int.


- **getMinModifiedCost** (`Level`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getMinModifiedCost(int)

	- **@p** `Level` is an int.
	- **@r** `An` int.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getName()

	- **@r** `A` string.


- **getPrimaryItems** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getPrimaryItems()

	- **@r** `A` [RegistryKeySet](RegistryKeySet.aus.md).


- **getRarity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getRarity()

	- **@r** `An` string naming an [EnchantmentRarity](EnchantmentRarity.aus.md).


- **getStartLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getStartLevel()

	- **@r** `An` int.


- **getSupportedItems** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getSupportedItems()

	- **@r** `A` [RegistryKeySet](RegistryKeySet.aus.md).


- **getTranslationKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getTranslationKey()

	- **@r** `A` string.


- **getWeight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#getWeight()

	- **@r** `An` int.


- **isCursed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#isCursed()

	- **@r** `A` bool.


- **isDiscoverable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#isDiscoverable()

	- **@r** `A` bool.


- **isTradeable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#isTradeable()

	- **@r** `A` bool.


- **isTreasure** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#isTreasure()

	- **@r** `A` bool.


- **translationKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/enchantments/EnchantmentWrapper.html#translationKey()

	- **@r** `A` string.




