# file: InternalAPIBridge.aus

## class: InternalAPIBridge

[15:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.InternalAPIBridgeShim) **extends: object** 

Generated shim for io.papermc.paper.InternalAPIBridge.
Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **allSkinParts** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#allSkinParts()

	- **@r** `A` SkinParts.Mutable.


- **constructLegacyCustomBiome** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#constructLegacyCustomBiome()

	- **@r** `A` [Biome](Biome.aus.md).


- **createCombatEntry** (`Entity, DamageSource, Damage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#createCombatEntry(org.bukkit.entity.LivingEntity,org.bukkit.damage.DamageSource,float)

	- **@p** `Entity` is a [LivingEntity](LivingEntity.aus.md).
	- **@p** `DamageSource` is a [DamageSource](DamageSource.aus.md).
	- **@p** `Damage` is a double.
	- **@r** `A` [CombatEntry](CombatEntry.aus.md).


- **createCombatEntry** (`DamageSource, Damage, FallLocationType, FallDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#createCombatEntry(org.bukkit.damage.DamageSource,float,io.papermc.paper.world.damagesource.FallLocationType,float)

	- **@p** `DamageSource` is a [DamageSource](DamageSource.aus.md).
	- **@p** `Damage` is a double.
	- **@p** `FallLocationType` is a [FallLocationType](FallLocationType.aus.md).
	- **@p** `FallDistance` is a double.
	- **@r** `A` [CombatEntry](CombatEntry.aus.md).


- **createDamageSourceBuilder** (`DamageType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#createDamageSourceBuilder(org.bukkit.damage.DamageType)

	- **@p** `DamageType` is a [DamageType](DamageType.aus.md).
	- **@r** `A` DamageSource.Builder.


- **createEmptyStack** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#createEmptyStack()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **createOccupancy** (`EnumNameEntry`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#createOccupancy(java.lang.String)

	- **@p** `EnumNameEntry` is a string.
	- **@r** `A` PoiType.Occupancy.


- **defaultMannequinDescription** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#defaultMannequinDescription()

	- **@r** `A` Component.


- **defaultMannequinProfile** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#defaultMannequinProfile()

	- **@r** `A` [ResolvableProfile](ResolvableProfile.aus.md).


- **get** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#get()

	- **@r** `An` [InternalAPIBridge](InternalAPIBridge.aus.md).


- **getDamageEffect** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#getDamageEffect(java.lang.String)

	- **@p** `Key` is a string.
	- **@r** `A` [DamageEffect](DamageEffect.aus.md).


- **getDefaultEntityAttributes** (`EntityKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#getDefaultEntityAttributes(org.bukkit.NamespacedKey)

	- **@p** `EntityKey` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `An` [Attributable](Attributable.aus.md).


- **getSpawnCategory** (`EntityType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#getSpawnCategory(org.bukkit.entity.EntityType)

	- **@p** `EntityType` is an string naming an [EntityType](EntityType.aus.md).
	- **@r** `A` string naming a [SpawnCategory](SpawnCategory.aus.md).


- **getStatisticCriteriaKey** (`Statistic`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#getStatisticCriteriaKey(org.bukkit.Statistic)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).
	- **@r** `A` string.


- **getTranslationKey** (`EntityType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#getTranslationKey(org.bukkit.entity.EntityType)

	- **@p** `EntityType` is an string naming an [EntityType](EntityType.aus.md).
	- **@r** `A` string.


- **getVersionFetcher** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#getVersionFetcher()

	- **@r** `A` [VersionFetcher](VersionFetcher.aus.md).


- **hasDefaultEntityAttributes** (`EntityKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#hasDefaultEntityAttributes(org.bukkit.NamespacedKey)

	- **@p** `EntityKey` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` bool.


- **resolveWithContext** (`Component, Context, ScoreboardSubject, BypassPermissions`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#resolveWithContext(net.kyori.adventure.text.Component,org.bukkit.command.CommandSender,org.bukkit.entity.Entity,boolean)

	- **@p** `Component` is a Component.
	- **@p** `Context` is a [CommandSender](CommandSender.aus.md).
	- **@p** `ScoreboardSubject` is an [Entity](Entity.aus.md).
	- **@p** `BypassPermissions` is a bool.
	- **@r** `A` Component.


- **validMannequinPoses** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/InternalAPIBridge.html#validMannequinPoses()

	- **@r** `A` list.




