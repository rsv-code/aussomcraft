# file: Projectile.aus

## class: Projectile

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.ProjectileShim) **extends: object** 

Generated shim for org.bukkit.entity.Projectile.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html
In Paper this is a [Entity](Entity.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addPassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#addPassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **addScoreboardTag** (`Tag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#addScoreboardTag(java.lang.String)

	- **@p** `Tag` is a string.
	- **@r** `A` bool.


- **broadcastHurtAnimation** (`Players`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#broadcastHurtAnimation(java.util.Collection)

	- **@p** `Players` is a list.


- **canHitEntity** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#canHitEntity(org.bukkit.entity.Entity)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **clearResourcePacks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#clearResourcePacks()



- **clearTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#clearTitle()



- **closeDialog** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#closeDialog()



- **collidesAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#collidesAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **copy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#copy()

	- **@r** `An` [Entity](Entity.aus.md).


- **copy** (`To`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#copy(org.bukkit.Location)

	- **@p** `To` is a [Location](Location.aus.md).
	- **@r** `An` [Entity](Entity.aus.md).


- **createSnapshot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#createSnapshot()

	- **@r** `An` [EntitySnapshot](EntitySnapshot.aus.md).


- **customName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#customName()

	- **@r** `A` Component.


- **customName** (`CustomName`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#customName(net.kyori.adventure.text.Component)

	- **@p** `CustomName` is a Component.


- **doesBounce** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#doesBounce()

	- **@r** `A` bool.


- **eject** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#eject()

	- **@r** `A` bool.


- **fromMobSpawner** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#fromMobSpawner()

	- **@r** `A` bool.


- **getAsString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getAsString()

	- **@r** `A` string.


- **getBoundingBox** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getBoundingBox()

	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **getChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getChunk()

	- **@r** `A` [Chunk](Chunk.aus.md).


- **getCustomName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getCustomName()

	- **@r** `A` string.


- **getData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getData(io.papermc.paper.datacomponent.DataComponentType.Valued)

	- **@p** `Type` is a DataComponentType.Valued.
	- **@r** `An` Object.


- **getDataOrDefault** (`Type, Fallback`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getDataOrDefault(io.papermc.paper.datacomponent.DataComponentType.Valued,java.lang.Object)

	- **@p** `Type` is a DataComponentType.Valued.
	- **@p** `Fallback` is an Object.
	- **@r** `An` Object.


- **getEffectivePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getEffectivePermissions()

	- **@r** `A` list.


- **getEntityId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getEntityId()

	- **@r** `An` int.


- **getEntitySpawnReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getEntitySpawnReason()

	- **@r** `A` string naming a CreatureSpawnEvent.SpawnReason.


- **getFacing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getFacing()

	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getFallDistance** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getFallDistance()

	- **@r** `A` double.


- **getFireTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getFireTicks()

	- **@r** `An` int.


- **getFreezeTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getFreezeTicks()

	- **@r** `An` int.


- **getHeight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getHeight()

	- **@r** `A` double.


- **getLastDamageCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getLastDamageCause()

	- **@r** `An` [EntityDamageEvent](EntityDamageEvent.aus.md).


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getLocation** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getLocation(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **getMaxFireTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getMaxFireTicks()

	- **@r** `An` int.


- **getMaxFreezeTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getMaxFreezeTicks()

	- **@r** `An` int.


- **getMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` list.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getName()

	- **@r** `A` string.


- **getNearbyEntities** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getNearbyEntities(double,double,double)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` list.


- **getOrigin** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getOrigin()

	- **@r** `A` [Location](Location.aus.md).


- **getOwnerUniqueId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getOwnerUniqueId()

	- **@r** `A` string.


- **getPassenger** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getPassenger()

	- **@r** `An` [Entity](Entity.aus.md).


- **getPassengers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getPassengers()

	- **@r** `A` list.


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getPickItemStack** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getPickItemStack()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getPistonMoveReaction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getPistonMoveReaction()

	- **@r** `A` string naming a [PistonMoveReaction](PistonMoveReaction.aus.md).


- **getPitch** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getPitch()

	- **@r** `A` double.


- **getPortalCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getPortalCooldown()

	- **@r** `An` int.


- **getPose** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getPose()

	- **@r** `A` string naming a [Pose](Pose.aus.md).


- **getRemovalReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getRemovalReason()

	- **@r** `A` string naming a [RemovalReason](RemovalReason.aus.md).


- **getRemoveEventCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getRemoveEventCause()

	- **@r** `A` string naming an EntityRemoveEvent.Cause.


- **getScoreboardEntryName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getScoreboardEntryName()

	- **@r** `A` string.


- **getScoreboardTags** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getScoreboardTags()

	- **@r** `A` list.


- **getShooter** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getShooter()

	- **@r** `A` ProjectileSource.


- **getSoundCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getSoundCategory()

	- **@r** `A` string naming a [SoundCategory](SoundCategory.aus.md).


- **getSpawnCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getSpawnCategory()

	- **@r** `A` string naming a [SpawnCategory](SpawnCategory.aus.md).


- **getSwimHighSpeedSplashSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getSwimHighSpeedSplashSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getSwimSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getSwimSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getSwimSplashSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getSwimSplashSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getTicksLived** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getTicksLived()

	- **@r** `An` int.


- **getTrackedBy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getTrackedBy()

	- **@r** `A` list.


- **getTrackedPlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getTrackedPlayers()

	- **@r** `A` list.


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getUniqueId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getUniqueId()

	- **@r** `A` string.


- **getVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getVehicle()

	- **@r** `An` [Entity](Entity.aus.md).


- **getVelocity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getVelocity()

	- **@r** `A` [Vector](Vector.aus.md).


- **getWidth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getWidth()

	- **@r** `A` double.


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **getX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getX()

	- **@r** `A` double.


- **getY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getY()

	- **@r** `A` double.


- **getYaw** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getYaw()

	- **@r** `A` double.


- **getZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#getZ()

	- **@r** `A` double.


- **hasBeenShot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#hasBeenShot()

	- **@r** `A` bool.


- **hasData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#hasData(io.papermc.paper.datacomponent.DataComponentType)

	- **@p** `Type` is a [DataComponentType](DataComponentType.aus.md).
	- **@r** `A` bool.


- **hasFixedPose** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#hasFixedPose()

	- **@r** `A` bool.


- **hasGravity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#hasGravity()

	- **@r** `A` bool.


- **hasLeftShooter** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#hasLeftShooter()

	- **@r** `A` bool.


- **hasMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#hasMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` bool.


- **hasNoPhysics** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#hasNoPhysics()

	- **@r** `A` bool.


- **hasPermission** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#hasPermission(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **hitEntity** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#hitEntity(org.bukkit.entity.Entity)

	- **@p** `Entity` is an [Entity](Entity.aus.md).


- **hitEntity** (`Entity, Vector`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#hitEntity(org.bukkit.entity.Entity,org.bukkit.util.Vector)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@p** `Vector` is a [Vector](Vector.aus.md).


- **isCustomNameVisible** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isCustomNameVisible()

	- **@r** `A` bool.


- **isDead** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isDead()

	- **@r** `A` bool.


- **isEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isEmpty()

	- **@r** `A` bool.


- **isFreezeTickingLocked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isFreezeTickingLocked()

	- **@r** `A` bool.


- **isFrozen** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isFrozen()

	- **@r** `A` bool.


- **isGlowing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isGlowing()

	- **@r** `A` bool.


- **isInBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isInBubbleColumn()

	- **@r** `A` bool.


- **isInLava** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isInLava()

	- **@r** `A` bool.


- **isInPowderedSnow** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isInPowderedSnow()

	- **@r** `A` bool.


- **isInRain** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isInRain()

	- **@r** `A` bool.


- **isInWater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isInWater()

	- **@r** `A` bool.


- **isInWaterOrBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isInWaterOrBubbleColumn()

	- **@r** `A` bool.


- **isInWaterOrRain** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isInWaterOrRain()

	- **@r** `A` bool.


- **isInWaterOrRainOrBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isInWaterOrRainOrBubbleColumn()

	- **@r** `A` bool.


- **isInWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isInWorld()

	- **@r** `A` bool.


- **isInsideVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isInsideVehicle()

	- **@r** `A` bool.


- **isInvisible** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isInvisible()

	- **@r** `A` bool.


- **isInvulnerable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isInvulnerable()

	- **@r** `A` bool.


- **isOnGround** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isOnGround()

	- **@r** `A` bool.


- **isOp** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isOp()

	- **@r** `A` bool.


- **isPermissionSet** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isPermissionSet(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **isPersistent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isPersistent()

	- **@r** `A` bool.


- **isSilent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isSilent()

	- **@r** `A` bool.


- **isSneaking** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isSneaking()

	- **@r** `A` bool.


- **isTicking** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isTicking()

	- **@r** `A` bool.


- **isTrackedBy** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isTrackedBy(org.bukkit.entity.Player)

	- **@p** `Player` is a [Player](Player.aus.md).
	- **@r** `A` bool.


- **isUnderWater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isUnderWater()

	- **@r** `A` bool.


- **isValid** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isValid()

	- **@r** `A` bool.


- **isVisibleByDefault** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isVisibleByDefault()

	- **@r** `A` bool.


- **isVisualFire** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#isVisualFire()

	- **@r** `A` bool.


- **leaveVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#leaveVehicle()

	- **@r** `A` bool.


- **lockFreezeTicks** (`Locked`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#lockFreezeTicks(boolean)

	- **@p** `Locked` is a bool.


- **lookAt** (`Position, EntityAnchor`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#lookAt(io.papermc.paper.math.Position,io.papermc.paper.entity.LookAnchor)

	- **@p** `Position` is a [Position](Position.aus.md).
	- **@p** `EntityAnchor` is a string naming a [LookAnchor](LookAnchor.aus.md).


- **lookAt** (`X, Y, Z, EntityAnchor`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#lookAt(double,double,double,io.papermc.paper.entity.LookAnchor)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `EntityAnchor` is a string naming a [LookAnchor](LookAnchor.aus.md).


- **name** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#name()

	- **@r** `A` Component.


- **playEffect** (`Effect`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#playEffect(org.bukkit.EntityEffect)

	- **@p** `Effect` is an string naming an [EntityEffect](EntityEffect.aus.md).


- **recalculatePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#recalculatePermissions()



- **remove** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#remove()



- **removePassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#removePassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **removeResourcePacks** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#removeResourcePacks(java.lang.Iterable)

	- **@p** `A0` is an Iterable.


- **removeScoreboardTag** (`Tag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#removeScoreboardTag(java.lang.String)

	- **@p** `Tag` is a string.
	- **@r** `A` bool.


- **resetTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#resetTitle()



- **sendActionBar** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#sendActionBar(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendActionBar\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#sendActionBar(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage\_Component** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#sendMessage(net.kyori.adventure.text.Component)

	- **@p** `Message` is a Component.


- **sendMessage\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#sendMessage(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#sendMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendMessage** (`Sender, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#sendMessage(java.util.UUID,java.lang.String)

	- **@p** `Sender` is a string.
	- **@p** `Message` is a string.


- **sendPlainMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#sendPlainMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendPlayerListFooter** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#sendPlayerListFooter(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListFooter\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#sendPlayerListFooter(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeader** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#sendPlayerListHeader(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListHeader\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#sendPlayerListHeader(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeaderAndFooter** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.Component,net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.
	- **@p** `A1` is a Component.


- **sendPlayerListHeaderAndFooter\_ComponentLike\_ComponentLike** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.ComponentLike,net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.
	- **@p** `A1` is a ComponentLike.


- **sendRichMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#sendRichMessage(java.lang.String)

	- **@p** `Message` is a string.


- **setBounce** (`DoesBounce`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setBounce(boolean)

	- **@p** `DoesBounce` is a bool.


- **setCustomName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setCustomName(java.lang.String)

	- **@p** `Name` is a string.


- **setCustomNameVisible** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setCustomNameVisible(boolean)

	- **@p** `Flag` is a bool.


- **setFallDistance** (`Distance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setFallDistance(float)

	- **@p** `Distance` is a double.


- **setFireTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setFireTicks(int)

	- **@p** `Ticks` is an int.


- **setFreezeTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setFreezeTicks(int)

	- **@p** `Ticks` is an int.


- **setGlowing** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setGlowing(boolean)

	- **@p** `Flag` is a bool.


- **setGravity** (`Gravity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setGravity(boolean)

	- **@p** `Gravity` is a bool.


- **setHasBeenShot** (`BeenShot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setHasBeenShot(boolean)

	- **@p** `BeenShot` is a bool.


- **setHasLeftShooter** (`LeftShooter`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setHasLeftShooter(boolean)

	- **@p** `LeftShooter` is a bool.


- **setInvisible** (`Invisible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setInvisible(boolean)

	- **@p** `Invisible` is a bool.


- **setInvulnerable** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setInvulnerable(boolean)

	- **@p** `Flag` is a bool.


- **setLastDamageCause** (`Event`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setLastDamageCause(org.bukkit.event.entity.EntityDamageEvent)

	- **@p** `Event` is an [EntityDamageEvent](EntityDamageEvent.aus.md).


- **setMetadata** (`MetadataKey, NewMetadataValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setMetadata(java.lang.String,org.bukkit.metadata.MetadataValue)

	- **@p** `MetadataKey` is a string.
	- **@p** `NewMetadataValue` is a [MetadataValue](MetadataValue.aus.md).


- **setNoPhysics** (`NoPhysics`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setNoPhysics(boolean)

	- **@p** `NoPhysics` is a bool.


- **setPassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setPassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **setPersistent** (`Persistent`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setPersistent(boolean)

	- **@p** `Persistent` is a bool.


- **setPortalCooldown** (`Cooldown`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setPortalCooldown(int)

	- **@p** `Cooldown` is an int.


- **setPose** (`Pose`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setPose(org.bukkit.entity.Pose)

	- **@p** `Pose` is a string naming a [Pose](Pose.aus.md).


- **setPose** (`Pose, Fixed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setPose(org.bukkit.entity.Pose,boolean)

	- **@p** `Pose` is a string naming a [Pose](Pose.aus.md).
	- **@p** `Fixed` is a bool.


- **setRotation\_Angle\_Angle** (`Yaw, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setRotation(io.papermc.paper.math.Angle,io.papermc.paper.math.Angle)

	- **@p** `Yaw` is an [Angle](Angle.aus.md).
	- **@p** `Pitch` is an [Angle](Angle.aus.md).


- **setRotation** (`Yaw, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setRotation(float,float)

	- **@p** `Yaw` is a double.
	- **@p** `Pitch` is a double.


- **setShooter** (`Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setShooter(org.bukkit.projectiles.ProjectileSource)

	- **@p** `Source` is a ProjectileSource.


- **setSilent** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setSilent(boolean)

	- **@p** `Flag` is a bool.


- **setSneaking** (`Sneak`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setSneaking(boolean)

	- **@p** `Sneak` is a bool.


- **setTicksLived** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setTicksLived(int)

	- **@p** `Value` is an int.


- **setVelocity** (`Velocity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setVelocity(org.bukkit.util.Vector)

	- **@p** `Velocity` is a [Vector](Vector.aus.md).


- **setVisibleByDefault** (`Visible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setVisibleByDefault(boolean)

	- **@p** `Visible` is a bool.


- **setVisualFire** (`Fire`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#setVisualFire(boolean)

	- **@p** `Fire` is a bool.


- **spawnAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#spawnAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **spawnAt** (`Location, Reason`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#spawnAt(org.bukkit.Location,org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Reason` is a string naming a CreatureSpawnEvent.SpawnReason.
	- **@r** `A` bool.


- **spigot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#spigot()

	- **@r** `An` Entity.Spigot.


- **teamDisplayName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#teamDisplayName()

	- **@r** `A` Component.


- **teleport** (`Destination`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#teleport(org.bukkit.entity.Entity)

	- **@p** `Destination` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **teleport\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#teleport(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **teleport** (`Destination, Cause`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#teleport(org.bukkit.entity.Entity,org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)

	- **@p** `Destination` is an [Entity](Entity.aus.md).
	- **@p** `Cause` is a string naming a PlayerTeleportEvent.TeleportCause.
	- **@r** `A` bool.


- **teleport\_location\_cause** (`Location, Cause`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#teleport(org.bukkit.Location,org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Cause` is a string naming a PlayerTeleportEvent.TeleportCause.
	- **@r** `A` bool.


- **wouldCollideUsing** (`BoundingBox`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Projectile.html#wouldCollideUsing(org.bukkit.util.BoundingBox)

	- **@p** `BoundingBox` is a [BoundingBox](BoundingBox.aus.md).
	- **@r** `A` bool.




