# file: PotionEffectType.aus

## class: PotionEffectType

[21:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.PotionEffectTypeShim) **extends: object** 

Generated shim for org.bukkit.potion.PotionEffectType.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html
In Paper this is a [Keyed](Keyed.aus.md),
[Translatable](Translatable.aus.md) and
[FeatureDependant](FeatureDependant.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **createEffect** (`Duration, Amplifier`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html#createEffect(int,int)

	- **@p** `Duration` is an int.
	- **@p** `Amplifier` is an int.
	- **@r** `A` [PotionEffect](PotionEffect.aus.md).


- **getAttributeModifierAmount** (`Attribute, EffectAmplifier`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html#getAttributeModifierAmount(org.bukkit.attribute.Attribute,int)

	- **@p** `Attribute` is an [Attribute](Attribute.aus.md).
	- **@p** `EffectAmplifier` is an int.
	- **@r** `A` double.


- **getById** (`Id`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html#getById(int)

	- **@p** `Id` is an int.
	- **@r** `A` [PotionEffectType](PotionEffectType.aus.md).


- **getByKey** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html#getByKey(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` [PotionEffectType](PotionEffectType.aus.md).


- **getByName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html#getByName(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` [PotionEffectType](PotionEffectType.aus.md).


- **getCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html#getCategory()

	- **@r** `A` string naming a [PotionEffectTypeCategory](PotionEffectTypeCategory.aus.md).


- **getColor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html#getColor()

	- **@r** `A` [Color](Color.aus.md).


- **getDurationModifier** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html#getDurationModifier()

	- **@r** `A` double.


- **getEffectAttributes** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html#getEffectAttributes()

	- **@r** `A` map.


- **getEffectCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html#getEffectCategory()

	- **@r** `A` string naming a PotionEffectType.Category.


- **getId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html#getId()

	- **@r** `An` int.


- **getKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html#getKey()

	- **@r** `A` [NamespacedKey](NamespacedKey.aus.md).


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html#getName()

	- **@r** `A` string.


- **getTranslationKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html#getTranslationKey()

	- **@r** `A` string.


- **isInstant** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html#isInstant()

	- **@r** `A` bool.


- **requiredFeatures** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html#requiredFeatures()

	- **@r** `A` list.


- **translationKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionEffectType.html#translationKey()

	- **@r** `A` string.




