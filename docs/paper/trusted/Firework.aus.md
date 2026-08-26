# file: Firework.aus

## class: Firework

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.FireworkShim) **extends: object** 

Generated shim for org.bukkit.entity.Firework.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html
In Paper this is a [Projectile](Projectile.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addPassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#addPassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **addScoreboardTag** (`Tag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#addScoreboardTag(java.lang.String)

	- **@p** `Tag` is a string.
	- **@r** `A` bool.


- **broadcastHurtAnimation** (`Players`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#broadcastHurtAnimation(java.util.Collection)

	- **@p** `Players` is a list.


- **canHitEntity** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#canHitEntity(org.bukkit.entity.Entity)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **clearResourcePacks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#clearResourcePacks()



- **clearTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#clearTitle()



- **closeDialog** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#closeDialog()



- **collidesAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#collidesAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **copy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#copy()

	- **@r** `An` [Entity](Entity.aus.md).


- **copy** (`To`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#copy(org.bukkit.Location)

	- **@p** `To` is a [Location](Location.aus.md).
	- **@r** `An` [Entity](Entity.aus.md).


- **createSnapshot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#createSnapshot()

	- **@r** `An` [EntitySnapshot](EntitySnapshot.aus.md).


- **customName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#customName()

	- **@r** `A` Component.


- **customName** (`CustomName`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#customName(net.kyori.adventure.text.Component)

	- **@p** `CustomName` is a Component.


- **detonate** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#detonate()



- **doesBounce** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#doesBounce()

	- **@r** `A` bool.


- **eject** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#eject()

	- **@r** `A` bool.


- **fromMobSpawner** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#fromMobSpawner()

	- **@r** `A` bool.


- **getAsString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getAsString()

	- **@r** `A` string.


- **getAttachedTo** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getAttachedTo()

	- **@r** `A` [LivingEntity](LivingEntity.aus.md).


- **getBoostedEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getBoostedEntity()

	- **@r** `A` [LivingEntity](LivingEntity.aus.md).


- **getBoundingBox** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getBoundingBox()

	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **getChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getChunk()

	- **@r** `A` [Chunk](Chunk.aus.md).


- **getCustomName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getCustomName()

	- **@r** `A` string.


- **getData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getData(io.papermc.paper.datacomponent.DataComponentType.Valued)

	- **@p** `Type` is a DataComponentType.Valued.
	- **@r** `An` Object.


- **getDataOrDefault** (`Type, Fallback`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getDataOrDefault(io.papermc.paper.datacomponent.DataComponentType.Valued,java.lang.Object)

	- **@p** `Type` is a DataComponentType.Valued.
	- **@p** `Fallback` is an Object.
	- **@r** `An` Object.


- **getEffectivePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getEffectivePermissions()

	- **@r** `A` list.


- **getEntityId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getEntityId()

	- **@r** `An` int.


- **getEntitySpawnReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getEntitySpawnReason()

	- **@r** `A` string naming a CreatureSpawnEvent.SpawnReason.


- **getFacing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getFacing()

	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getFallDistance** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getFallDistance()

	- **@r** `A` double.


- **getFireTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getFireTicks()

	- **@r** `An` int.


- **getFireworkMeta** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getFireworkMeta()

	- **@r** `A` [FireworkMeta](FireworkMeta.aus.md).


- **getFreezeTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getFreezeTicks()

	- **@r** `An` int.


- **getHeight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getHeight()

	- **@r** `A` double.


- **getItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getItem()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getLastDamageCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getLastDamageCause()

	- **@r** `An` [EntityDamageEvent](EntityDamageEvent.aus.md).


- **getLife** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getLife()

	- **@r** `An` int.


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getLocation** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getLocation(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **getMaxFireTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getMaxFireTicks()

	- **@r** `An` int.


- **getMaxFreezeTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getMaxFreezeTicks()

	- **@r** `An` int.


- **getMaxLife** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getMaxLife()

	- **@r** `An` int.


- **getMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` list.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getName()

	- **@r** `A` string.


- **getNearbyEntities** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getNearbyEntities(double,double,double)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` list.


- **getOrigin** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getOrigin()

	- **@r** `A` [Location](Location.aus.md).


- **getOwnerUniqueId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getOwnerUniqueId()

	- **@r** `A` string.


- **getPassenger** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getPassenger()

	- **@r** `An` [Entity](Entity.aus.md).


- **getPassengers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getPassengers()

	- **@r** `A` list.


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getPickItemStack** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getPickItemStack()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getPistonMoveReaction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getPistonMoveReaction()

	- **@r** `A` string naming a [PistonMoveReaction](PistonMoveReaction.aus.md).


- **getPitch** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getPitch()

	- **@r** `A` double.


- **getPortalCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getPortalCooldown()

	- **@r** `An` int.


- **getPose** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getPose()

	- **@r** `A` string naming a [Pose](Pose.aus.md).


- **getRemovalReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getRemovalReason()

	- **@r** `A` string naming a [RemovalReason](RemovalReason.aus.md).


- **getRemoveEventCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getRemoveEventCause()

	- **@r** `A` string naming an EntityRemoveEvent.Cause.


- **getScoreboardEntryName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getScoreboardEntryName()

	- **@r** `A` string.


- **getScoreboardTags** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getScoreboardTags()

	- **@r** `A` list.


- **getShooter** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getShooter()

	- **@r** `A` ProjectileSource.


- **getSoundCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getSoundCategory()

	- **@r** `A` string naming a [SoundCategory](SoundCategory.aus.md).


- **getSpawnCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getSpawnCategory()

	- **@r** `A` string naming a [SpawnCategory](SpawnCategory.aus.md).


- **getSpawningEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getSpawningEntity()

	- **@r** `A` string.


- **getSwimHighSpeedSplashSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getSwimHighSpeedSplashSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getSwimSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getSwimSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getSwimSplashSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getSwimSplashSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getTicksFlown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getTicksFlown()

	- **@r** `An` int.


- **getTicksLived** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getTicksLived()

	- **@r** `An` int.


- **getTicksToDetonate** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getTicksToDetonate()

	- **@r** `An` int.


- **getTrackedBy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getTrackedBy()

	- **@r** `A` list.


- **getTrackedPlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getTrackedPlayers()

	- **@r** `A` list.


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getUniqueId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getUniqueId()

	- **@r** `A` string.


- **getVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getVehicle()

	- **@r** `An` [Entity](Entity.aus.md).


- **getVelocity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getVelocity()

	- **@r** `A` [Vector](Vector.aus.md).


- **getWidth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getWidth()

	- **@r** `A` double.


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **getX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getX()

	- **@r** `A` double.


- **getY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getY()

	- **@r** `A` double.


- **getYaw** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getYaw()

	- **@r** `A` double.


- **getZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#getZ()

	- **@r** `A` double.


- **hasBeenShot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#hasBeenShot()

	- **@r** `A` bool.


- **hasData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#hasData(io.papermc.paper.datacomponent.DataComponentType)

	- **@p** `Type` is a [DataComponentType](DataComponentType.aus.md).
	- **@r** `A` bool.


- **hasFixedPose** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#hasFixedPose()

	- **@r** `A` bool.


- **hasGravity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#hasGravity()

	- **@r** `A` bool.


- **hasLeftShooter** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#hasLeftShooter()

	- **@r** `A` bool.


- **hasMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#hasMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` bool.


- **hasNoPhysics** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#hasNoPhysics()

	- **@r** `A` bool.


- **hasPermission** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#hasPermission(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **hitEntity** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#hitEntity(org.bukkit.entity.Entity)

	- **@p** `Entity` is an [Entity](Entity.aus.md).


- **hitEntity** (`Entity, Vector`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#hitEntity(org.bukkit.entity.Entity,org.bukkit.util.Vector)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@p** `Vector` is a [Vector](Vector.aus.md).


- **isCustomNameVisible** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isCustomNameVisible()

	- **@r** `A` bool.


- **isDead** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isDead()

	- **@r** `A` bool.


- **isDetonated** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isDetonated()

	- **@r** `A` bool.


- **isEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isEmpty()

	- **@r** `A` bool.


- **isFreezeTickingLocked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isFreezeTickingLocked()

	- **@r** `A` bool.


- **isFrozen** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isFrozen()

	- **@r** `A` bool.


- **isGlowing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isGlowing()

	- **@r** `A` bool.


- **isInBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isInBubbleColumn()

	- **@r** `A` bool.


- **isInLava** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isInLava()

	- **@r** `A` bool.


- **isInPowderedSnow** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isInPowderedSnow()

	- **@r** `A` bool.


- **isInRain** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isInRain()

	- **@r** `A` bool.


- **isInWater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isInWater()

	- **@r** `A` bool.


- **isInWaterOrBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isInWaterOrBubbleColumn()

	- **@r** `A` bool.


- **isInWaterOrRain** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isInWaterOrRain()

	- **@r** `A` bool.


- **isInWaterOrRainOrBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isInWaterOrRainOrBubbleColumn()

	- **@r** `A` bool.


- **isInWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isInWorld()

	- **@r** `A` bool.


- **isInsideVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isInsideVehicle()

	- **@r** `A` bool.


- **isInvisible** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isInvisible()

	- **@r** `A` bool.


- **isInvulnerable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isInvulnerable()

	- **@r** `A` bool.


- **isOnGround** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isOnGround()

	- **@r** `A` bool.


- **isOp** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isOp()

	- **@r** `A` bool.


- **isPermissionSet** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isPermissionSet(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **isPersistent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isPersistent()

	- **@r** `A` bool.


- **isShotAtAngle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isShotAtAngle()

	- **@r** `A` bool.


- **isSilent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isSilent()

	- **@r** `A` bool.


- **isSneaking** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isSneaking()

	- **@r** `A` bool.


- **isTicking** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isTicking()

	- **@r** `A` bool.


- **isTrackedBy** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isTrackedBy(org.bukkit.entity.Player)

	- **@p** `Player` is a [Player](Player.aus.md).
	- **@r** `A` bool.


- **isUnderWater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isUnderWater()

	- **@r** `A` bool.


- **isValid** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isValid()

	- **@r** `A` bool.


- **isVisibleByDefault** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isVisibleByDefault()

	- **@r** `A` bool.


- **isVisualFire** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#isVisualFire()

	- **@r** `A` bool.


- **leaveVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#leaveVehicle()

	- **@r** `A` bool.


- **lockFreezeTicks** (`Locked`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#lockFreezeTicks(boolean)

	- **@p** `Locked` is a bool.


- **lookAt** (`Position, EntityAnchor`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#lookAt(io.papermc.paper.math.Position,io.papermc.paper.entity.LookAnchor)

	- **@p** `Position` is a [Position](Position.aus.md).
	- **@p** `EntityAnchor` is a string naming a [LookAnchor](LookAnchor.aus.md).


- **lookAt** (`X, Y, Z, EntityAnchor`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#lookAt(double,double,double,io.papermc.paper.entity.LookAnchor)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `EntityAnchor` is a string naming a [LookAnchor](LookAnchor.aus.md).


- **name** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#name()

	- **@r** `A` Component.


- **playEffect** (`Effect`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#playEffect(org.bukkit.EntityEffect)

	- **@p** `Effect` is an string naming an [EntityEffect](EntityEffect.aus.md).


- **recalculatePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#recalculatePermissions()



- **remove** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#remove()



- **removePassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#removePassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **removeResourcePacks** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#removeResourcePacks(java.lang.Iterable)

	- **@p** `A0` is an Iterable.


- **removeScoreboardTag** (`Tag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#removeScoreboardTag(java.lang.String)

	- **@p** `Tag` is a string.
	- **@r** `A` bool.


- **resetTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#resetTitle()



- **sendActionBar** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#sendActionBar(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendActionBar\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#sendActionBar(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage\_Component** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#sendMessage(net.kyori.adventure.text.Component)

	- **@p** `Message` is a Component.


- **sendMessage\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#sendMessage(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#sendMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendMessage** (`Sender, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#sendMessage(java.util.UUID,java.lang.String)

	- **@p** `Sender` is a string.
	- **@p** `Message` is a string.


- **sendPlainMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#sendPlainMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendPlayerListFooter** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#sendPlayerListFooter(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListFooter\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#sendPlayerListFooter(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeader** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#sendPlayerListHeader(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListHeader\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#sendPlayerListHeader(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeaderAndFooter** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.Component,net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.
	- **@p** `A1` is a Component.


- **sendPlayerListHeaderAndFooter\_ComponentLike\_ComponentLike** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.ComponentLike,net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.
	- **@p** `A1` is a ComponentLike.


- **sendRichMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#sendRichMessage(java.lang.String)

	- **@p** `Message` is a string.


- **setAttachedTo** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setAttachedTo(org.bukkit.entity.LivingEntity)

	- **@p** `Entity` is a [LivingEntity](LivingEntity.aus.md).
	- **@r** `A` bool.


- **setBounce** (`DoesBounce`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setBounce(boolean)

	- **@p** `DoesBounce` is a bool.


- **setCustomName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setCustomName(java.lang.String)

	- **@p** `Name` is a string.


- **setCustomNameVisible** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setCustomNameVisible(boolean)

	- **@p** `Flag` is a bool.


- **setFallDistance** (`Distance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setFallDistance(float)

	- **@p** `Distance` is a double.


- **setFireTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setFireTicks(int)

	- **@p** `Ticks` is an int.


- **setFireworkMeta** (`Meta`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setFireworkMeta(org.bukkit.inventory.meta.FireworkMeta)

	- **@p** `Meta` is a [FireworkMeta](FireworkMeta.aus.md).


- **setFreezeTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setFreezeTicks(int)

	- **@p** `Ticks` is an int.


- **setGlowing** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setGlowing(boolean)

	- **@p** `Flag` is a bool.


- **setGravity** (`Gravity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setGravity(boolean)

	- **@p** `Gravity` is a bool.


- **setHasBeenShot** (`BeenShot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setHasBeenShot(boolean)

	- **@p** `BeenShot` is a bool.


- **setHasLeftShooter** (`LeftShooter`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setHasLeftShooter(boolean)

	- **@p** `LeftShooter` is a bool.


- **setInvisible** (`Invisible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setInvisible(boolean)

	- **@p** `Invisible` is a bool.


- **setInvulnerable** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setInvulnerable(boolean)

	- **@p** `Flag` is a bool.


- **setItem** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setItem(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).


- **setLastDamageCause** (`Event`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setLastDamageCause(org.bukkit.event.entity.EntityDamageEvent)

	- **@p** `Event` is an [EntityDamageEvent](EntityDamageEvent.aus.md).


- **setLife** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setLife(int)

	- **@p** `Ticks` is an int.
	- **@r** `A` bool.


- **setMaxLife** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setMaxLife(int)

	- **@p** `Ticks` is an int.
	- **@r** `A` bool.


- **setMetadata** (`MetadataKey, NewMetadataValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setMetadata(java.lang.String,org.bukkit.metadata.MetadataValue)

	- **@p** `MetadataKey` is a string.
	- **@p** `NewMetadataValue` is a [MetadataValue](MetadataValue.aus.md).


- **setNoPhysics** (`NoPhysics`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setNoPhysics(boolean)

	- **@p** `NoPhysics` is a bool.


- **setPassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setPassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **setPersistent** (`Persistent`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setPersistent(boolean)

	- **@p** `Persistent` is a bool.


- **setPortalCooldown** (`Cooldown`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setPortalCooldown(int)

	- **@p** `Cooldown` is an int.


- **setPose** (`Pose`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setPose(org.bukkit.entity.Pose)

	- **@p** `Pose` is a string naming a [Pose](Pose.aus.md).


- **setPose** (`Pose, Fixed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setPose(org.bukkit.entity.Pose,boolean)

	- **@p** `Pose` is a string naming a [Pose](Pose.aus.md).
	- **@p** `Fixed` is a bool.


- **setRotation\_Angle\_Angle** (`Yaw, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setRotation(io.papermc.paper.math.Angle,io.papermc.paper.math.Angle)

	- **@p** `Yaw` is an [Angle](Angle.aus.md).
	- **@p** `Pitch` is an [Angle](Angle.aus.md).


- **setRotation** (`Yaw, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setRotation(float,float)

	- **@p** `Yaw` is a double.
	- **@p** `Pitch` is a double.


- **setShooter** (`Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setShooter(org.bukkit.projectiles.ProjectileSource)

	- **@p** `Source` is a ProjectileSource.


- **setShotAtAngle** (`ShotAtAngle`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setShotAtAngle(boolean)

	- **@p** `ShotAtAngle` is a bool.


- **setSilent** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setSilent(boolean)

	- **@p** `Flag` is a bool.


- **setSneaking** (`Sneak`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setSneaking(boolean)

	- **@p** `Sneak` is a bool.


- **setTicksFlown** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setTicksFlown(int)

	- **@p** `Ticks` is an int.


- **setTicksLived** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setTicksLived(int)

	- **@p** `Value` is an int.


- **setTicksToDetonate** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setTicksToDetonate(int)

	- **@p** `Ticks` is an int.


- **setVelocity** (`Velocity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setVelocity(org.bukkit.util.Vector)

	- **@p** `Velocity` is a [Vector](Vector.aus.md).


- **setVisibleByDefault** (`Visible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setVisibleByDefault(boolean)

	- **@p** `Visible` is a bool.


- **setVisualFire** (`Fire`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#setVisualFire(boolean)

	- **@p** `Fire` is a bool.


- **spawnAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#spawnAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **spawnAt** (`Location, Reason`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#spawnAt(org.bukkit.Location,org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Reason` is a string naming a CreatureSpawnEvent.SpawnReason.
	- **@r** `A` bool.


- **spigot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#spigot()

	- **@r** `An` Entity.Spigot.


- **teamDisplayName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#teamDisplayName()

	- **@r** `A` Component.


- **teleport** (`Destination`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#teleport(org.bukkit.entity.Entity)

	- **@p** `Destination` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **teleport\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#teleport(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **teleport** (`Destination, Cause`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#teleport(org.bukkit.entity.Entity,org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)

	- **@p** `Destination` is an [Entity](Entity.aus.md).
	- **@p** `Cause` is a string naming a PlayerTeleportEvent.TeleportCause.
	- **@r** `A` bool.


- **teleport\_location\_cause** (`Location, Cause`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#teleport(org.bukkit.Location,org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Cause` is a string naming a PlayerTeleportEvent.TeleportCause.
	- **@r** `A` bool.


- **wouldCollideUsing** (`BoundingBox`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Firework.html#wouldCollideUsing(org.bukkit.util.BoundingBox)

	- **@p** `BoundingBox` is a [BoundingBox](BoundingBox.aus.md).
	- **@r** `A` bool.




