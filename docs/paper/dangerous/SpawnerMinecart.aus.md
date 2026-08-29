# file: SpawnerMinecart.aus

## class: SpawnerMinecart

[20:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.SpawnerMinecartShim) **extends: object** 

Generated shim for org.bukkit.entity.minecart.SpawnerMinecart.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html
In Paper this is a [Minecart](Minecart.aus.md) and
[Spawner](Spawner.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addPassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#addPassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **addPotentialSpawn** (`SpawnerEntry`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#addPotentialSpawn(org.bukkit.block.spawner.SpawnerEntry)

	- **@p** `SpawnerEntry` is a [SpawnerEntry](SpawnerEntry.aus.md).


- **addPotentialSpawn** (`Snapshot, Weight, SpawnRule`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#addPotentialSpawn(org.bukkit.entity.EntitySnapshot,int,org.bukkit.block.spawner.SpawnRule)

	- **@p** `Snapshot` is an [EntitySnapshot](EntitySnapshot.aus.md).
	- **@p** `Weight` is an int.
	- **@p** `SpawnRule` is a [SpawnRule](SpawnRule.aus.md).


- **addScoreboardTag** (`Tag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#addScoreboardTag(java.lang.String)

	- **@p** `Tag` is a string.
	- **@r** `A` bool.


- **broadcastHurtAnimation** (`Players`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#broadcastHurtAnimation(java.util.Collection)

	- **@p** `Players` is a list.


- **clearResourcePacks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#clearResourcePacks()



- **clearTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#clearTitle()



- **closeDialog** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#closeDialog()



- **collidesAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#collidesAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **copy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#copy()

	- **@r** `An` [Entity](Entity.aus.md).


- **copy** (`To`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#copy(org.bukkit.Location)

	- **@p** `To` is a [Location](Location.aus.md).
	- **@r** `An` [Entity](Entity.aus.md).


- **createSnapshot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#createSnapshot()

	- **@r** `An` [EntitySnapshot](EntitySnapshot.aus.md).


- **customName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#customName()

	- **@r** `A` Component.


- **customName** (`CustomName`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#customName(net.kyori.adventure.text.Component)

	- **@p** `CustomName` is a Component.


- **eject** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#eject()

	- **@r** `A` bool.


- **fromMobSpawner** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#fromMobSpawner()

	- **@r** `A` bool.


- **getAsString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getAsString()

	- **@r** `A` string.


- **getBoundingBox** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getBoundingBox()

	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **getChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getChunk()

	- **@r** `A` [Chunk](Chunk.aus.md).


- **getCustomName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getCustomName()

	- **@r** `A` string.


- **getDamage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getDamage()

	- **@r** `A` double.


- **getData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getData(io.papermc.paper.datacomponent.DataComponentType.Valued)

	- **@p** `Type` is a DataComponentType.Valued.
	- **@r** `An` Object.


- **getDataOrDefault** (`Type, Fallback`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getDataOrDefault(io.papermc.paper.datacomponent.DataComponentType.Valued,java.lang.Object)

	- **@p** `Type` is a DataComponentType.Valued.
	- **@p** `Fallback` is an Object.
	- **@r** `An` Object.


- **getDelay** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getDelay()

	- **@r** `An` int.


- **getDerailedVelocityMod** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getDerailedVelocityMod()

	- **@r** `A` [Vector](Vector.aus.md).


- **getDisplayBlockData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getDisplayBlockData()

	- **@r** `A` [BlockData](BlockData.aus.md).


- **getDisplayBlockOffset** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getDisplayBlockOffset()

	- **@r** `An` int.


- **getEffectivePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getEffectivePermissions()

	- **@r** `A` list.


- **getEntityId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getEntityId()

	- **@r** `An` int.


- **getEntitySpawnReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getEntitySpawnReason()

	- **@r** `A` string naming a CreatureSpawnEvent.SpawnReason.


- **getFacing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getFacing()

	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getFallDistance** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getFallDistance()

	- **@r** `A` double.


- **getFireTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getFireTicks()

	- **@r** `An` int.


- **getFlyingVelocityMod** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getFlyingVelocityMod()

	- **@r** `A` [Vector](Vector.aus.md).


- **getFreezeTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getFreezeTicks()

	- **@r** `An` int.


- **getHeight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getHeight()

	- **@r** `A` double.


- **getLastDamageCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getLastDamageCause()

	- **@r** `An` [EntityDamageEvent](EntityDamageEvent.aus.md).


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getLocation** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getLocation(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **getMaxFireTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getMaxFireTicks()

	- **@r** `An` int.


- **getMaxFreezeTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getMaxFreezeTicks()

	- **@r** `An` int.


- **getMaxNearbyEntities** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getMaxNearbyEntities()

	- **@r** `An` int.


- **getMaxSpawnDelay** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getMaxSpawnDelay()

	- **@r** `An` int.


- **getMaxSpeed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getMaxSpeed()

	- **@r** `A` double.


- **getMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` list.


- **getMinSpawnDelay** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getMinSpawnDelay()

	- **@r** `An` int.


- **getMinecartMaterial** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getMinecartMaterial()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getName()

	- **@r** `A` string.


- **getNearbyEntities** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getNearbyEntities(double,double,double)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` list.


- **getOrigin** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getOrigin()

	- **@r** `A` [Location](Location.aus.md).


- **getPassenger** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getPassenger()

	- **@r** `An` [Entity](Entity.aus.md).


- **getPassengers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getPassengers()

	- **@r** `A` list.


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getPickItemStack** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getPickItemStack()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getPistonMoveReaction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getPistonMoveReaction()

	- **@r** `A` string naming a [PistonMoveReaction](PistonMoveReaction.aus.md).


- **getPitch** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getPitch()

	- **@r** `A` double.


- **getPortalCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getPortalCooldown()

	- **@r** `An` int.


- **getPose** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getPose()

	- **@r** `A` string naming a [Pose](Pose.aus.md).


- **getPotentialSpawns** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getPotentialSpawns()

	- **@r** `A` list.


- **getRemovalReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getRemovalReason()

	- **@r** `A` string naming a [RemovalReason](RemovalReason.aus.md).


- **getRemoveEventCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getRemoveEventCause()

	- **@r** `A` string naming an EntityRemoveEvent.Cause.


- **getRequiredPlayerRange** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getRequiredPlayerRange()

	- **@r** `An` int.


- **getScoreboardEntryName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getScoreboardEntryName()

	- **@r** `A` string.


- **getScoreboardTags** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getScoreboardTags()

	- **@r** `A` list.


- **getSoundCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getSoundCategory()

	- **@r** `A` string naming a [SoundCategory](SoundCategory.aus.md).


- **getSpawnCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getSpawnCategory()

	- **@r** `A` string naming a [SpawnCategory](SpawnCategory.aus.md).


- **getSpawnCount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getSpawnCount()

	- **@r** `An` int.


- **getSpawnRange** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getSpawnRange()

	- **@r** `An` int.


- **getSpawnedEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getSpawnedEntity()

	- **@r** `An` [EntitySnapshot](EntitySnapshot.aus.md).


- **getSpawnedType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getSpawnedType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getSwimHighSpeedSplashSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getSwimHighSpeedSplashSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getSwimSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getSwimSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getSwimSplashSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getSwimSplashSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getTicksLived** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getTicksLived()

	- **@r** `An` int.


- **getTrackedBy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getTrackedBy()

	- **@r** `A` list.


- **getTrackedPlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getTrackedPlayers()

	- **@r** `A` list.


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getUniqueId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getUniqueId()

	- **@r** `A` string.


- **getVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getVehicle()

	- **@r** `An` [Entity](Entity.aus.md).


- **getVelocity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getVelocity()

	- **@r** `A` [Vector](Vector.aus.md).


- **getWidth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getWidth()

	- **@r** `A` double.


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **getX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getX()

	- **@r** `A` double.


- **getY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getY()

	- **@r** `A` double.


- **getYaw** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getYaw()

	- **@r** `A` double.


- **getZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getZ()

	- **@r** `A` double.


- **hasData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#hasData(io.papermc.paper.datacomponent.DataComponentType)

	- **@p** `Type` is a [DataComponentType](DataComponentType.aus.md).
	- **@r** `A` bool.


- **hasFixedPose** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#hasFixedPose()

	- **@r** `A` bool.


- **hasGravity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#hasGravity()

	- **@r** `A` bool.


- **hasMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#hasMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` bool.


- **hasNoPhysics** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#hasNoPhysics()

	- **@r** `A` bool.


- **hasPermission\_perm** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#hasPermission(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).
	- **@r** `A` bool.


- **hasPermission** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#hasPermission(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **isActivated** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isActivated()

	- **@r** `A` bool.


- **isCustomNameVisible** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isCustomNameVisible()

	- **@r** `A` bool.


- **isDead** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isDead()

	- **@r** `A` bool.


- **isEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isEmpty()

	- **@r** `A` bool.


- **isFreezeTickingLocked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isFreezeTickingLocked()

	- **@r** `A` bool.


- **isFrozen** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isFrozen()

	- **@r** `A` bool.


- **isGlowing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isGlowing()

	- **@r** `A` bool.


- **isInBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isInBubbleColumn()

	- **@r** `A` bool.


- **isInLava** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isInLava()

	- **@r** `A` bool.


- **isInPowderedSnow** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isInPowderedSnow()

	- **@r** `A` bool.


- **isInRain** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isInRain()

	- **@r** `A` bool.


- **isInWater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isInWater()

	- **@r** `A` bool.


- **isInWaterOrBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isInWaterOrBubbleColumn()

	- **@r** `A` bool.


- **isInWaterOrRain** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isInWaterOrRain()

	- **@r** `A` bool.


- **isInWaterOrRainOrBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isInWaterOrRainOrBubbleColumn()

	- **@r** `A` bool.


- **isInWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isInWorld()

	- **@r** `A` bool.


- **isInsideVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isInsideVehicle()

	- **@r** `A` bool.


- **isInvisible** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isInvisible()

	- **@r** `A` bool.


- **isInvulnerable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isInvulnerable()

	- **@r** `A` bool.


- **isOnGround** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isOnGround()

	- **@r** `A` bool.


- **isOp** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isOp()

	- **@r** `A` bool.


- **isPermissionSet\_perm** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isPermissionSet(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).
	- **@r** `A` bool.


- **isPermissionSet** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isPermissionSet(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **isPersistent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isPersistent()

	- **@r** `A` bool.


- **isSilent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isSilent()

	- **@r** `A` bool.


- **isSlowWhenEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isSlowWhenEmpty()

	- **@r** `A` bool.


- **isSneaking** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isSneaking()

	- **@r** `A` bool.


- **isTicking** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isTicking()

	- **@r** `A` bool.


- **isTrackedBy** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isTrackedBy(org.bukkit.entity.Player)

	- **@p** `Player` is a [Player](Player.aus.md).
	- **@r** `A` bool.


- **isUnderWater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isUnderWater()

	- **@r** `A` bool.


- **isValid** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isValid()

	- **@r** `A` bool.


- **isVisibleByDefault** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isVisibleByDefault()

	- **@r** `A` bool.


- **isVisualFire** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#isVisualFire()

	- **@r** `A` bool.


- **leaveVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#leaveVehicle()

	- **@r** `A` bool.


- **lockFreezeTicks** (`Locked`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#lockFreezeTicks(boolean)

	- **@p** `Locked` is a bool.


- **lookAt** (`Position, EntityAnchor`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#lookAt(io.papermc.paper.math.Position,io.papermc.paper.entity.LookAnchor)

	- **@p** `Position` is a [Position](Position.aus.md).
	- **@p** `EntityAnchor` is a string naming a [LookAnchor](LookAnchor.aus.md).


- **lookAt** (`X, Y, Z, EntityAnchor`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#lookAt(double,double,double,io.papermc.paper.entity.LookAnchor)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `EntityAnchor` is a string naming a [LookAnchor](LookAnchor.aus.md).


- **name** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#name()

	- **@r** `A` Component.


- **playEffect** (`Effect`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#playEffect(org.bukkit.EntityEffect)

	- **@p** `Effect` is an string naming an [EntityEffect](EntityEffect.aus.md).


- **recalculatePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#recalculatePermissions()



- **remove** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#remove()



- **removePassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#removePassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **removeResourcePacks** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#removeResourcePacks(java.lang.Iterable)

	- **@p** `A0` is an Iterable.


- **removeScoreboardTag** (`Tag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#removeScoreboardTag(java.lang.String)

	- **@p** `Tag` is a string.
	- **@r** `A` bool.


- **resetTimer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#resetTimer()



- **resetTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#resetTitle()



- **sendActionBar** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#sendActionBar(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendActionBar\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#sendActionBar(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage\_Component** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#sendMessage(net.kyori.adventure.text.Component)

	- **@p** `Message` is a Component.


- **sendMessage\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#sendMessage(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#sendMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendMessage** (`Sender, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#sendMessage(java.util.UUID,java.lang.String)

	- **@p** `Sender` is a string.
	- **@p** `Message` is a string.


- **sendPlainMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#sendPlainMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendPlayerListFooter** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#sendPlayerListFooter(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListFooter\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#sendPlayerListFooter(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeader** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#sendPlayerListHeader(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListHeader\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#sendPlayerListHeader(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeaderAndFooter** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.Component,net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.
	- **@p** `A1` is a Component.


- **sendPlayerListHeaderAndFooter\_ComponentLike\_ComponentLike** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.ComponentLike,net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.
	- **@p** `A1` is a ComponentLike.


- **sendRichMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#sendRichMessage(java.lang.String)

	- **@p** `Message` is a string.


- **setCustomName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setCustomName(java.lang.String)

	- **@p** `Name` is a string.


- **setCustomNameVisible** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setCustomNameVisible(boolean)

	- **@p** `Flag` is a bool.


- **setDamage** (`Damage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setDamage(double)

	- **@p** `Damage` is a double.


- **setDelay** (`Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setDelay(int)

	- **@p** `Delay` is an int.


- **setDerailedVelocityMod** (`Derailed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setDerailedVelocityMod(org.bukkit.util.Vector)

	- **@p** `Derailed` is a [Vector](Vector.aus.md).


- **setDisplayBlockData** (`BlockData`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setDisplayBlockData(org.bukkit.block.data.BlockData)

	- **@p** `BlockData` is a [BlockData](BlockData.aus.md).


- **setDisplayBlockOffset** (`Offset`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setDisplayBlockOffset(int)

	- **@p** `Offset` is an int.


- **setFallDistance** (`Distance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setFallDistance(float)

	- **@p** `Distance` is a double.


- **setFireTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setFireTicks(int)

	- **@p** `Ticks` is an int.


- **setFlyingVelocityMod** (`Flying`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setFlyingVelocityMod(org.bukkit.util.Vector)

	- **@p** `Flying` is a [Vector](Vector.aus.md).


- **setFreezeTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setFreezeTicks(int)

	- **@p** `Ticks` is an int.


- **setGlowing** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setGlowing(boolean)

	- **@p** `Flag` is a bool.


- **setGravity** (`Gravity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setGravity(boolean)

	- **@p** `Gravity` is a bool.


- **setInvisible** (`Invisible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setInvisible(boolean)

	- **@p** `Invisible` is a bool.


- **setInvulnerable** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setInvulnerable(boolean)

	- **@p** `Flag` is a bool.


- **setLastDamageCause** (`Event`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setLastDamageCause(org.bukkit.event.entity.EntityDamageEvent)

	- **@p** `Event` is an [EntityDamageEvent](EntityDamageEvent.aus.md).


- **setMaxNearbyEntities** (`MaxNearbyEntities`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setMaxNearbyEntities(int)

	- **@p** `MaxNearbyEntities` is an int.


- **setMaxSpawnDelay** (`Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setMaxSpawnDelay(int)

	- **@p** `Delay` is an int.


- **setMaxSpeed** (`Speed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setMaxSpeed(double)

	- **@p** `Speed` is a double.


- **setMetadata** (`MetadataKey, NewMetadataValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setMetadata(java.lang.String,org.bukkit.metadata.MetadataValue)

	- **@p** `MetadataKey` is a string.
	- **@p** `NewMetadataValue` is a [MetadataValue](MetadataValue.aus.md).


- **setMinSpawnDelay** (`Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setMinSpawnDelay(int)

	- **@p** `Delay` is an int.


- **setNoPhysics** (`NoPhysics`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setNoPhysics(boolean)

	- **@p** `NoPhysics` is a bool.


- **setPassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setPassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **setPersistent** (`Persistent`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setPersistent(boolean)

	- **@p** `Persistent` is a bool.


- **setPortalCooldown** (`Cooldown`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setPortalCooldown(int)

	- **@p** `Cooldown` is an int.


- **setPose** (`Pose`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setPose(org.bukkit.entity.Pose)

	- **@p** `Pose` is a string naming a [Pose](Pose.aus.md).


- **setPose** (`Pose, Fixed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setPose(org.bukkit.entity.Pose,boolean)

	- **@p** `Pose` is a string naming a [Pose](Pose.aus.md).
	- **@p** `Fixed` is a bool.


- **setPotentialSpawns** (`Entries`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setPotentialSpawns(java.util.Collection)

	- **@p** `Entries` is a list.


- **setRequiredPlayerRange** (`RequiredPlayerRange`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setRequiredPlayerRange(int)

	- **@p** `RequiredPlayerRange` is an int.


- **setRotation\_Angle\_Angle** (`Yaw, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setRotation(io.papermc.paper.math.Angle,io.papermc.paper.math.Angle)

	- **@p** `Yaw` is an [Angle](Angle.aus.md).
	- **@p** `Pitch` is an [Angle](Angle.aus.md).


- **setRotation** (`Yaw, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setRotation(float,float)

	- **@p** `Yaw` is a double.
	- **@p** `Pitch` is a double.


- **setSilent** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setSilent(boolean)

	- **@p** `Flag` is a bool.


- **setSlowWhenEmpty** (`Slow`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setSlowWhenEmpty(boolean)

	- **@p** `Slow` is a bool.


- **setSneaking** (`Sneak`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setSneaking(boolean)

	- **@p** `Sneak` is a bool.


- **setSpawnCount** (`SpawnCount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setSpawnCount(int)

	- **@p** `SpawnCount` is an int.


- **setSpawnRange** (`SpawnRange`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setSpawnRange(int)

	- **@p** `SpawnRange` is an int.


- **setSpawnedEntity** (`Snapshot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setSpawnedEntity(org.bukkit.entity.EntitySnapshot)

	- **@p** `Snapshot` is an [EntitySnapshot](EntitySnapshot.aus.md).


- **setSpawnedEntity\_spawnerentry** (`SpawnerEntry`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setSpawnedEntity(org.bukkit.block.spawner.SpawnerEntry)

	- **@p** `SpawnerEntry` is a [SpawnerEntry](SpawnerEntry.aus.md).


- **setSpawnedItem** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setSpawnedItem(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).


- **setSpawnedType** (`CreatureType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setSpawnedType(org.bukkit.entity.EntityType)

	- **@p** `CreatureType` is an string naming an [EntityType](EntityType.aus.md).


- **setTicksLived** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setTicksLived(int)

	- **@p** `Value` is an int.


- **setVelocity** (`Vel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setVelocity(org.bukkit.util.Vector)

	- **@p** `Vel` is a [Vector](Vector.aus.md).


- **setVisibleByDefault** (`Visible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setVisibleByDefault(boolean)

	- **@p** `Visible` is a bool.


- **setVisualFire** (`Fire`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setVisualFire(boolean)

	- **@p** `Fire` is a bool.


- **spawnAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#spawnAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **spawnAt** (`Location, Reason`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#spawnAt(org.bukkit.Location,org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Reason` is a string naming a CreatureSpawnEvent.SpawnReason.
	- **@r** `A` bool.


- **spigot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#spigot()

	- **@r** `An` Entity.Spigot.


- **teamDisplayName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#teamDisplayName()

	- **@r** `A` Component.


- **teleport** (`Destination`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#teleport(org.bukkit.entity.Entity)

	- **@p** `Destination` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **teleport\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#teleport(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **teleport** (`Destination, Cause`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#teleport(org.bukkit.entity.Entity,org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)

	- **@p** `Destination` is an [Entity](Entity.aus.md).
	- **@p** `Cause` is a string naming a PlayerTeleportEvent.TeleportCause.
	- **@r** `A` bool.


- **teleport\_location\_cause** (`Location, Cause`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#teleport(org.bukkit.Location,org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Cause` is a string naming a PlayerTeleportEvent.TeleportCause.
	- **@r** `A` bool.


- **wouldCollideUsing** (`BoundingBox`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#wouldCollideUsing(org.bukkit.util.BoundingBox)

	- **@p** `BoundingBox` is a [BoundingBox](BoundingBox.aus.md).
	- **@r** `A` bool.


- **addAttachment** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#addAttachment(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#addAttachment(org.bukkit.plugin.Plugin,int)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Ticks` is an int.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Name, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#addAttachment(org.bukkit.plugin.Plugin,java.lang.String,boolean)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Name` is a string.
	- **@p** `Value` is a bool.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Name, Value, Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#addAttachment(org.bukkit.plugin.Plugin,java.lang.String,boolean,int)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Name` is a string.
	- **@p** `Value` is a bool.
	- **@p** `Ticks` is an int.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **getScheduler** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getScheduler()

	- **@r** `An` EntityScheduler.


- **getServer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#getServer()

	- **@r** `A` [Server](Server.aus.md).


- **removeAttachment** (`Attachment`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#removeAttachment(org.bukkit.permissions.PermissionAttachment)

	- **@p** `Attachment` is a [PermissionAttachment](PermissionAttachment.aus.md).


- **removeMetadata** (`MetadataKey, OwningPlugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#removeMetadata(java.lang.String,org.bukkit.plugin.Plugin)

	- **@p** `MetadataKey` is a string.
	- **@p** `OwningPlugin` is a [Plugin](Plugin.aus.md).


- **setOp** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/minecart/SpawnerMinecart.html#setOp(boolean)

	- **@p** `Value` is a bool.




