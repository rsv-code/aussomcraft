# file: OfflinePlayer.aus

## class: OfflinePlayer

[22:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.OfflinePlayerShim) **extends: object** 

Generated shim for org.bukkit.OfflinePlayer.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html
In Paper this is a [ServerOperator](ServerOperator.aus.md),
[AnimalTamer](AnimalTamer.aus.md),
[ConfigurationSerializable](ConfigurationSerializable.aus.md) and
[PersistentDataViewHolder](PersistentDataViewHolder.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **ban** (`Reason, Expires, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#ban(java.lang.String,java.util.Date,java.lang.String)

	- **@p** `Reason` is a string.
	- **@p** `Expires` is a Date.
	- **@p** `Source` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **ban\_String\_Duration\_String** (`Reason, Duration, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#ban(java.lang.String,java.time.Duration,java.lang.String)

	- **@p** `Reason` is a string.
	- **@p** `Duration` is a Duration.
	- **@p** `Source` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **ban\_String\_Instant\_String** (`Reason, Expires, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#ban(java.lang.String,java.time.Instant,java.lang.String)

	- **@p** `Reason` is a string.
	- **@p** `Expires` is an Instant.
	- **@p** `Source` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **banPlayer** (`Reason`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#banPlayer(java.lang.String)

	- **@p** `Reason` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **banPlayer\_reason\_expires** (`Reason, Expires`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#banPlayer(java.lang.String,java.util.Date)

	- **@p** `Reason` is a string.
	- **@p** `Expires` is a Date.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **banPlayer** (`Reason, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#banPlayer(java.lang.String,java.lang.String)

	- **@p** `Reason` is a string.
	- **@p** `Source` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **banPlayer** (`Reason, Expires, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#banPlayer(java.lang.String,java.util.Date,java.lang.String)

	- **@p** `Reason` is a string.
	- **@p** `Expires` is a Date.
	- **@p** `Source` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **banPlayer** (`Reason, Expires, Source, KickIfOnline`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#banPlayer(java.lang.String,java.util.Date,java.lang.String,boolean)

	- **@p** `Reason` is a string.
	- **@p** `Expires` is a Date.
	- **@p** `Source` is a string.
	- **@p** `KickIfOnline` is a bool.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **decrementStatistic** (`Statistic`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#decrementStatistic(org.bukkit.Statistic)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).


- **decrementStatistic\_statistic\_entitytype** (`Statistic, EntityType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#decrementStatistic(org.bukkit.Statistic,org.bukkit.entity.EntityType)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).
	- **@p** `EntityType` is an string naming an [EntityType](EntityType.aus.md).


- **decrementStatistic\_statistic\_material** (`Statistic, Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#decrementStatistic(org.bukkit.Statistic,org.bukkit.Material)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).
	- **@p** `Material` is a string naming a [Material](Material.aus.md).


- **decrementStatistic** (`Statistic, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#decrementStatistic(org.bukkit.Statistic,int)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).
	- **@p** `Amount` is an int.


- **decrementStatistic** (`Statistic, EntityType, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#decrementStatistic(org.bukkit.Statistic,org.bukkit.entity.EntityType,int)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).
	- **@p** `EntityType` is an string naming an [EntityType](EntityType.aus.md).
	- **@p** `Amount` is an int.


- **decrementStatistic\_statistic\_material\_amount** (`Statistic, Material, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#decrementStatistic(org.bukkit.Statistic,org.bukkit.Material,int)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).
	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@p** `Amount` is an int.


- **getBedSpawnLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#getBedSpawnLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getFirstPlayed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#getFirstPlayed()

	- **@r** `An` int.


- **getLastDeathLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#getLastDeathLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getLastLogin** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#getLastLogin()

	- **@r** `An` int.


- **getLastPlayed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#getLastPlayed()

	- **@r** `An` int.


- **getLastSeen** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#getLastSeen()

	- **@r** `An` int.


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#getName()

	- **@r** `A` string.


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainerView](PersistentDataContainerView.aus.md).


- **getPlayer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#getPlayer()

	- **@r** `A` [Player](Player.aus.md).


- **getPlayerProfile** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#getPlayerProfile()

	- **@r** `A` ProfilePlayerProfile.


- **getRespawnLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#getRespawnLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getRespawnLocation** (`LoadLocationAndValidate`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#getRespawnLocation(boolean)

	- **@p** `LoadLocationAndValidate` is a bool.
	- **@r** `A` [Location](Location.aus.md).


- **getStatistic** (`Statistic`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#getStatistic(org.bukkit.Statistic)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).
	- **@r** `An` int.


- **getStatistic** (`Statistic, EntityType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#getStatistic(org.bukkit.Statistic,org.bukkit.entity.EntityType)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).
	- **@p** `EntityType` is an string naming an [EntityType](EntityType.aus.md).
	- **@r** `An` int.


- **getStatistic\_statistic\_material** (`Statistic, Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#getStatistic(org.bukkit.Statistic,org.bukkit.Material)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).
	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@r** `An` int.


- **getUniqueId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#getUniqueId()

	- **@r** `A` string.


- **hasPlayedBefore** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#hasPlayedBefore()

	- **@r** `A` bool.


- **incrementStatistic** (`Statistic`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#incrementStatistic(org.bukkit.Statistic)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).


- **incrementStatistic\_statistic\_entitytype** (`Statistic, EntityType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#incrementStatistic(org.bukkit.Statistic,org.bukkit.entity.EntityType)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).
	- **@p** `EntityType` is an string naming an [EntityType](EntityType.aus.md).


- **incrementStatistic\_statistic\_material** (`Statistic, Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#incrementStatistic(org.bukkit.Statistic,org.bukkit.Material)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).
	- **@p** `Material` is a string naming a [Material](Material.aus.md).


- **incrementStatistic** (`Statistic, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#incrementStatistic(org.bukkit.Statistic,int)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).
	- **@p** `Amount` is an int.


- **incrementStatistic** (`Statistic, EntityType, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#incrementStatistic(org.bukkit.Statistic,org.bukkit.entity.EntityType,int)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).
	- **@p** `EntityType` is an string naming an [EntityType](EntityType.aus.md).
	- **@p** `Amount` is an int.


- **incrementStatistic\_statistic\_material\_amount** (`Statistic, Material, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#incrementStatistic(org.bukkit.Statistic,org.bukkit.Material,int)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).
	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@p** `Amount` is an int.


- **isBanned** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#isBanned()

	- **@r** `A` bool.


- **isConnected** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#isConnected()

	- **@r** `A` bool.


- **isOnline** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#isOnline()

	- **@r** `A` bool.


- **isOp** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#isOp()

	- **@r** `A` bool.


- **isWhitelisted** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#isWhitelisted()

	- **@r** `A` bool.


- **serialize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#serialize()

	- **@r** `A` map.


- **setStatistic** (`Statistic, NewValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#setStatistic(org.bukkit.Statistic,int)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).
	- **@p** `NewValue` is an int.


- **setStatistic** (`Statistic, EntityType, NewValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#setStatistic(org.bukkit.Statistic,org.bukkit.entity.EntityType,int)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).
	- **@p** `EntityType` is an string naming an [EntityType](EntityType.aus.md).
	- **@p** `NewValue` is an int.


- **setStatistic\_statistic\_material\_newvalue** (`Statistic, Material, NewValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/OfflinePlayer.html#setStatistic(org.bukkit.Statistic,org.bukkit.Material,int)

	- **@p** `Statistic` is a string naming a [Statistic](Statistic.aus.md).
	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@p** `NewValue` is an int.




