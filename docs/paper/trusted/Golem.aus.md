# file: Golem.aus

## class: Golem

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.GolemShim) **extends: object** 

Generated shim for org.bukkit.entity.Golem.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html
In Paper this is a [Creature](Creature.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addPassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#addPassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **addPotionEffect** (`Effect`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#addPotionEffect(org.bukkit.potion.PotionEffect)

	- **@p** `Effect` is a [PotionEffect](PotionEffect.aus.md).
	- **@r** `A` bool.


- **addPotionEffect** (`Effect, Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#addPotionEffect(org.bukkit.potion.PotionEffect,boolean)

	- **@p** `Effect` is a [PotionEffect](PotionEffect.aus.md).
	- **@p** `Force` is a bool.
	- **@r** `A` bool.


- **addPotionEffects** (`Effects`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#addPotionEffects(java.util.Collection)

	- **@p** `Effects` is a list.
	- **@r** `A` bool.


- **addScoreboardTag** (`Tag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#addScoreboardTag(java.lang.String)

	- **@p** `Tag` is a string.
	- **@r** `A` bool.


- **attack** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#attack(org.bukkit.entity.Entity)

	- **@p** `Target` is an [Entity](Entity.aus.md).


- **broadcastHurtAnimation** (`Players`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#broadcastHurtAnimation(java.util.Collection)

	- **@p** `Players` is a list.


- **broadcastSlotBreak** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#broadcastSlotBreak(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **broadcastSlotBreak** (`Slot, Players`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#broadcastSlotBreak(org.bukkit.inventory.EquipmentSlot,java.util.Collection)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).
	- **@p** `Players` is a list.


- **canBreatheUnderwater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#canBreatheUnderwater()

	- **@r** `A` bool.


- **canUseEquipmentSlot** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#canUseEquipmentSlot(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).
	- **@r** `A` bool.


- **clearActiveItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#clearActiveItem()



- **clearActivePotionEffects** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#clearActivePotionEffects()

	- **@r** `A` bool.


- **clearLootTable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#clearLootTable()



- **clearResourcePacks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#clearResourcePacks()



- **clearTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#clearTitle()



- **closeDialog** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#closeDialog()



- **collidesAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#collidesAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **completeUsingActiveItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#completeUsingActiveItem()



- **copy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#copy()

	- **@r** `An` [Entity](Entity.aus.md).


- **copy** (`To`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#copy(org.bukkit.Location)

	- **@p** `To` is a [Location](Location.aus.md).
	- **@r** `An` [Entity](Entity.aus.md).


- **createSnapshot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#createSnapshot()

	- **@r** `An` [EntitySnapshot](EntitySnapshot.aus.md).


- **customName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#customName()

	- **@r** `A` Component.


- **customName** (`CustomName`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#customName(net.kyori.adventure.text.Component)

	- **@p** `CustomName` is a Component.


- **damage** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#damage(double)

	- **@p** `Amount` is a double.


- **damage** (`Amount, DamageSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#damage(double,org.bukkit.damage.DamageSource)

	- **@p** `Amount` is a double.
	- **@p** `DamageSource` is a [DamageSource](DamageSource.aus.md).


- **damage\_amount\_source** (`Amount, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#damage(double,org.bukkit.entity.Entity)

	- **@p** `Amount` is a double.
	- **@p** `Source` is an [Entity](Entity.aus.md).


- **damageItemStack** (`Slot, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#damageItemStack(org.bukkit.inventory.EquipmentSlot,int)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).
	- **@p** `Amount` is an int.


- **damageItemStack\_stack\_amount** (`Stack, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#damageItemStack(org.bukkit.inventory.ItemStack,int)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **eject** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#eject()

	- **@r** `A` bool.


- **fromMobSpawner** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#fromMobSpawner()

	- **@r** `A` bool.


- **getAbsorptionAmount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getAbsorptionAmount()

	- **@r** `A` double.


- **getActiveItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getActiveItem()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getActiveItemHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getActiveItemHand()

	- **@r** `An` string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **getActiveItemRemainingTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getActiveItemRemainingTime()

	- **@r** `An` int.


- **getActiveItemUsedTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getActiveItemUsedTime()

	- **@r** `An` int.


- **getActivePotionEffects** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getActivePotionEffects()

	- **@r** `A` list.


- **getAmbientSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getAmbientSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getArrowCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getArrowCooldown()

	- **@r** `An` int.


- **getArrowsInBody** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getArrowsInBody()

	- **@r** `An` int.


- **getArrowsStuck** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getArrowsStuck()

	- **@r** `An` int.


- **getAsString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getAsString()

	- **@r** `A` string.


- **getAttribute** (`Attribute`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getAttribute(org.bukkit.attribute.Attribute)

	- **@p** `Attribute` is an [Attribute](Attribute.aus.md).
	- **@r** `An` [AttributeInstance](AttributeInstance.aus.md).


- **getBeeStingerCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getBeeStingerCooldown()

	- **@r** `An` int.


- **getBeeStingersInBody** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getBeeStingersInBody()

	- **@r** `An` int.


- **getBodyYaw** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getBodyYaw()

	- **@r** `A` double.


- **getBoundingBox** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getBoundingBox()

	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **getCanPickupItems** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getCanPickupItems()

	- **@r** `A` bool.


- **getCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getCategory()

	- **@r** `An` string naming an [EntityCategory](EntityCategory.aus.md).


- **getChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getChunk()

	- **@r** `A` [Chunk](Chunk.aus.md).


- **getCollidableExemptions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getCollidableExemptions()

	- **@r** `A` list.


- **getCombatTracker** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getCombatTracker()

	- **@r** `A` [CombatTracker](CombatTracker.aus.md).


- **getCustomName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getCustomName()

	- **@r** `A` string.


- **getData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getData(io.papermc.paper.datacomponent.DataComponentType.Valued)

	- **@p** `Type` is a DataComponentType.Valued.
	- **@r** `An` Object.


- **getDataOrDefault** (`Type, Fallback`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getDataOrDefault(io.papermc.paper.datacomponent.DataComponentType.Valued,java.lang.Object)

	- **@p** `Type` is a DataComponentType.Valued.
	- **@p** `Fallback` is an Object.
	- **@r** `An` Object.


- **getDeathSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getDeathSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getDrinkingSound** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getDrinkingSound(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` [Sound](Sound.aus.md).


- **getEatingSound** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getEatingSound(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` [Sound](Sound.aus.md).


- **getEffectivePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getEffectivePermissions()

	- **@r** `A` list.


- **getEntityId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getEntityId()

	- **@r** `An` int.


- **getEntitySpawnReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getEntitySpawnReason()

	- **@r** `A` string naming a CreatureSpawnEvent.SpawnReason.


- **getEquipment** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getEquipment()

	- **@r** `An` [EntityEquipment](EntityEquipment.aus.md).


- **getEyeHeight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getEyeHeight()

	- **@r** `A` double.


- **getEyeHeight** (`IgnorePose`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getEyeHeight(boolean)

	- **@p** `IgnorePose` is a bool.
	- **@r** `A` double.


- **getEyeLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getEyeLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getFacing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getFacing()

	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getFallDamageSound** (`FallHeight`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getFallDamageSound(int)

	- **@p** `FallHeight` is an int.
	- **@r** `A` [Sound](Sound.aus.md).


- **getFallDamageSoundBig** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getFallDamageSoundBig()

	- **@r** `A` [Sound](Sound.aus.md).


- **getFallDamageSoundSmall** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getFallDamageSoundSmall()

	- **@r** `A` [Sound](Sound.aus.md).


- **getFallDistance** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getFallDistance()

	- **@r** `A` double.


- **getFireTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getFireTicks()

	- **@r** `An` int.


- **getForwardsMovement** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getForwardsMovement()

	- **@r** `A` double.


- **getFreezeTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getFreezeTicks()

	- **@r** `An` int.


- **getHandRaised** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getHandRaised()

	- **@r** `An` string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **getHandRaisedTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getHandRaisedTime()

	- **@r** `An` int.


- **getHeadRotationSpeed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getHeadRotationSpeed()

	- **@r** `An` int.


- **getHealth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getHealth()

	- **@r** `A` double.


- **getHeight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getHeight()

	- **@r** `A` double.


- **getHurtDirection** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getHurtDirection()

	- **@r** `A` double.


- **getHurtSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getHurtSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getHurtSound** (`DamageSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getHurtSound(org.bukkit.damage.DamageSource)

	- **@p** `DamageSource` is a [DamageSource](DamageSource.aus.md).
	- **@r** `A` [Sound](Sound.aus.md).


- **getItemInUse** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getItemInUse()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getItemInUseTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getItemInUseTicks()

	- **@r** `An` int.


- **getItemUseRemainingTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getItemUseRemainingTime()

	- **@r** `An` int.


- **getKiller** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getKiller()

	- **@r** `A` [Player](Player.aus.md).


- **getLastDamage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getLastDamage()

	- **@r** `A` double.


- **getLastDamageCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getLastDamageCause()

	- **@r** `An` [EntityDamageEvent](EntityDamageEvent.aus.md).


- **getLastTwoTargetBlocks** (`Transparent, MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getLastTwoTargetBlocks(java.util.Set,int)

	- **@p** `Transparent` is a list.
	- **@p** `MaxDistance` is an int.
	- **@r** `A` list.


- **getLeashHolder** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getLeashHolder()

	- **@r** `An` [Entity](Entity.aus.md).


- **getLineOfSight** (`Transparent, MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getLineOfSight(java.util.Set,int)

	- **@p** `Transparent` is a list.
	- **@p** `MaxDistance` is an int.
	- **@r** `A` list.


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getLocation** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getLocation(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **getLootTable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getLootTable()

	- **@r** `A` [LootTable](LootTable.aus.md).


- **getMaxFireTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getMaxFireTicks()

	- **@r** `An` int.


- **getMaxFreezeTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getMaxFreezeTicks()

	- **@r** `An` int.


- **getMaxHeadPitch** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getMaxHeadPitch()

	- **@r** `An` int.


- **getMaxHealth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getMaxHealth()

	- **@r** `A` double.


- **getMaximumAir** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getMaximumAir()

	- **@r** `An` int.


- **getMaximumNoDamageTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getMaximumNoDamageTicks()

	- **@r** `An` int.


- **getMemory** (`MemoryKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getMemory(org.bukkit.entity.memory.MemoryKey)

	- **@p** `MemoryKey` is a [MemoryKey](MemoryKey.aus.md).
	- **@r** `An` Object.


- **getMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` list.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getName()

	- **@r** `A` string.


- **getNearbyEntities** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getNearbyEntities(double,double,double)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` list.


- **getNextArrowRemoval** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getNextArrowRemoval()

	- **@r** `An` int.


- **getNextBeeStingerRemoval** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getNextBeeStingerRemoval()

	- **@r** `An` int.


- **getNoActionTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getNoActionTicks()

	- **@r** `An` int.


- **getNoDamageTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getNoDamageTicks()

	- **@r** `An` int.


- **getOrigin** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getOrigin()

	- **@r** `A` [Location](Location.aus.md).


- **getPassenger** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getPassenger()

	- **@r** `An` [Entity](Entity.aus.md).


- **getPassengers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getPassengers()

	- **@r** `A` list.


- **getPathfinder** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getPathfinder()

	- **@r** `A` [Pathfinder](Pathfinder.aus.md).


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getPickItemStack** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getPickItemStack()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getPistonMoveReaction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getPistonMoveReaction()

	- **@r** `A` string naming a [PistonMoveReaction](PistonMoveReaction.aus.md).


- **getPitch** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getPitch()

	- **@r** `A` double.


- **getPortalCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getPortalCooldown()

	- **@r** `An` int.


- **getPose** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getPose()

	- **@r** `A` string naming a [Pose](Pose.aus.md).


- **getPossibleExperienceReward** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getPossibleExperienceReward()

	- **@r** `An` int.


- **getPotionEffect** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getPotionEffect(org.bukkit.potion.PotionEffectType)

	- **@p** `Type` is a [PotionEffectType](PotionEffectType.aus.md).
	- **@r** `A` [PotionEffect](PotionEffect.aus.md).


- **getRemainingAir** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getRemainingAir()

	- **@r** `An` int.


- **getRemovalReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getRemovalReason()

	- **@r** `A` string naming a [RemovalReason](RemovalReason.aus.md).


- **getRemoveEventCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getRemoveEventCause()

	- **@r** `A` string naming an EntityRemoveEvent.Cause.


- **getRemoveWhenFarAway** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getRemoveWhenFarAway()

	- **@r** `A` bool.


- **getScoreboardEntryName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getScoreboardEntryName()

	- **@r** `A` string.


- **getScoreboardTags** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getScoreboardTags()

	- **@r** `A` list.


- **getSeed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getSeed()

	- **@r** `An` int.


- **getShieldBlockingDelay** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getShieldBlockingDelay()

	- **@r** `An` int.


- **getSidewaysMovement** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getSidewaysMovement()

	- **@r** `A` double.


- **getSoundCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getSoundCategory()

	- **@r** `A` string naming a [SoundCategory](SoundCategory.aus.md).


- **getSoundPitch** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getSoundPitch()

	- **@r** `A` double.


- **getSoundVolume** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getSoundVolume()

	- **@r** `A` double.


- **getSpawnCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getSpawnCategory()

	- **@r** `A` string naming a [SpawnCategory](SpawnCategory.aus.md).


- **getSwimHighSpeedSplashSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getSwimHighSpeedSplashSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getSwimSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getSwimSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getSwimSplashSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getSwimSplashSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getTarget** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTarget()

	- **@r** `A` [LivingEntity](LivingEntity.aus.md).


- **getTargetBlock** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTargetBlock(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlock** (`Transparent, MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTargetBlock(java.util.Set,int)

	- **@p** `Transparent` is a list.
	- **@p** `MaxDistance` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlock\_maxdistance\_fluidmode** (`MaxDistance, FluidMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTargetBlock(int,com.destroystokyo.paper.block.TargetBlockInfo.FluidMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidMode` is a string naming a TargetBlockInfo.FluidMode.
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlockExact** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTargetBlockExact(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlockExact** (`MaxDistance, FluidCollisionMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTargetBlockExact(int,org.bukkit.FluidCollisionMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidCollisionMode` is a string naming a [FluidCollisionMode](FluidCollisionMode.aus.md).
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlockFace** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTargetBlockFace(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getTargetBlockFace** (`MaxDistance, FluidMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTargetBlockFace(int,org.bukkit.FluidCollisionMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidMode` is a string naming a [FluidCollisionMode](FluidCollisionMode.aus.md).
	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getTargetBlockFace\_int\_FluidMode** (`MaxDistance, FluidMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTargetBlockFace(int,com.destroystokyo.paper.block.TargetBlockInfo.FluidMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidMode` is a string naming a TargetBlockInfo.FluidMode.
	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getTargetBlockInfo** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTargetBlockInfo(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [TargetBlockInfo](TargetBlockInfo.aus.md).


- **getTargetBlockInfo** (`MaxDistance, FluidMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTargetBlockInfo(int,com.destroystokyo.paper.block.TargetBlockInfo.FluidMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidMode` is a string naming a TargetBlockInfo.FluidMode.
	- **@r** `A` [TargetBlockInfo](TargetBlockInfo.aus.md).


- **getTargetEntity** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTargetEntity(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `An` [Entity](Entity.aus.md).


- **getTargetEntity** (`MaxDistance, IgnoreBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTargetEntity(int,boolean)

	- **@p** `MaxDistance` is an int.
	- **@p** `IgnoreBlocks` is a bool.
	- **@r** `An` [Entity](Entity.aus.md).


- **getTargetEntityInfo** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTargetEntityInfo(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [TargetEntityInfo](TargetEntityInfo.aus.md).


- **getTargetEntityInfo** (`MaxDistance, IgnoreBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTargetEntityInfo(int,boolean)

	- **@p** `MaxDistance` is an int.
	- **@p** `IgnoreBlocks` is a bool.
	- **@r** `A` [TargetEntityInfo](TargetEntityInfo.aus.md).


- **getTicksLived** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTicksLived()

	- **@r** `An` int.


- **getTrackedBy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTrackedBy()

	- **@r** `A` list.


- **getTrackedPlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getTrackedPlayers()

	- **@r** `A` list.


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getUniqueId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getUniqueId()

	- **@r** `A` string.


- **getUpwardsMovement** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getUpwardsMovement()

	- **@r** `A` double.


- **getVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getVehicle()

	- **@r** `An` [Entity](Entity.aus.md).


- **getVelocity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getVelocity()

	- **@r** `A` [Vector](Vector.aus.md).


- **getWaypointColor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getWaypointColor()

	- **@r** `A` [Color](Color.aus.md).


- **getWidth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getWidth()

	- **@r** `A` double.


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **getX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getX()

	- **@r** `A` double.


- **getY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getY()

	- **@r** `A` double.


- **getYaw** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getYaw()

	- **@r** `A` double.


- **getZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#getZ()

	- **@r** `A` double.


- **hasAI** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#hasAI()

	- **@r** `A` bool.


- **hasActiveItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#hasActiveItem()

	- **@r** `A` bool.


- **hasData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#hasData(io.papermc.paper.datacomponent.DataComponentType)

	- **@p** `Type` is a [DataComponentType](DataComponentType.aus.md).
	- **@r** `A` bool.


- **hasFixedPose** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#hasFixedPose()

	- **@r** `A` bool.


- **hasGravity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#hasGravity()

	- **@r** `A` bool.


- **hasLineOfSight** (`Other`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#hasLineOfSight(org.bukkit.entity.Entity)

	- **@p** `Other` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **hasLineOfSight\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#hasLineOfSight(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **hasLootTable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#hasLootTable()

	- **@r** `A` bool.


- **hasMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#hasMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` bool.


- **hasNoPhysics** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#hasNoPhysics()

	- **@r** `A` bool.


- **hasPermission** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#hasPermission(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **hasPotionEffect** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#hasPotionEffect(org.bukkit.potion.PotionEffectType)

	- **@p** `Type` is a [PotionEffectType](PotionEffectType.aus.md).
	- **@r** `A` bool.


- **heal** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#heal(double)

	- **@p** `Amount` is a double.


- **heal** (`Amount, Reason`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#heal(double,org.bukkit.event.entity.EntityRegainHealthEvent.RegainReason)

	- **@p** `Amount` is a double.
	- **@p** `Reason` is a string naming an EntityRegainHealthEvent.RegainReason.


- **isAggressive** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isAggressive()

	- **@r** `A` bool.


- **isAware** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isAware()

	- **@r** `A` bool.


- **isClimbing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isClimbing()

	- **@r** `A` bool.


- **isCollidable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isCollidable()

	- **@r** `A` bool.


- **isCustomNameVisible** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isCustomNameVisible()

	- **@r** `A` bool.


- **isDead** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isDead()

	- **@r** `A` bool.


- **isEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isEmpty()

	- **@r** `A` bool.


- **isFreezeTickingLocked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isFreezeTickingLocked()

	- **@r** `A` bool.


- **isFrozen** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isFrozen()

	- **@r** `A` bool.


- **isGliding** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isGliding()

	- **@r** `A` bool.


- **isGlowing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isGlowing()

	- **@r** `A` bool.


- **isHandRaised** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isHandRaised()

	- **@r** `A` bool.


- **isInBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isInBubbleColumn()

	- **@r** `A` bool.


- **isInDaylight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isInDaylight()

	- **@r** `A` bool.


- **isInLava** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isInLava()

	- **@r** `A` bool.


- **isInPowderedSnow** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isInPowderedSnow()

	- **@r** `A` bool.


- **isInRain** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isInRain()

	- **@r** `A` bool.


- **isInWater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isInWater()

	- **@r** `A` bool.


- **isInWaterOrBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isInWaterOrBubbleColumn()

	- **@r** `A` bool.


- **isInWaterOrRain** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isInWaterOrRain()

	- **@r** `A` bool.


- **isInWaterOrRainOrBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isInWaterOrRainOrBubbleColumn()

	- **@r** `A` bool.


- **isInWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isInWorld()

	- **@r** `A` bool.


- **isInsideVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isInsideVehicle()

	- **@r** `A` bool.


- **isInvisible** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isInvisible()

	- **@r** `A` bool.


- **isInvulnerable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isInvulnerable()

	- **@r** `A` bool.


- **isJumping** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isJumping()

	- **@r** `A` bool.


- **isLeashed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isLeashed()

	- **@r** `A` bool.


- **isLeftHanded** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isLeftHanded()

	- **@r** `A` bool.


- **isOnGround** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isOnGround()

	- **@r** `A` bool.


- **isOp** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isOp()

	- **@r** `A` bool.


- **isPermissionSet** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isPermissionSet(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **isPersistent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isPersistent()

	- **@r** `A` bool.


- **isRiptiding** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isRiptiding()

	- **@r** `A` bool.


- **isSilent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isSilent()

	- **@r** `A` bool.


- **isSleeping** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isSleeping()

	- **@r** `A` bool.


- **isSneaking** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isSneaking()

	- **@r** `A` bool.


- **isSwimming** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isSwimming()

	- **@r** `A` bool.


- **isTicking** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isTicking()

	- **@r** `A` bool.


- **isTrackedBy** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isTrackedBy(org.bukkit.entity.Player)

	- **@p** `Player` is a [Player](Player.aus.md).
	- **@r** `A` bool.


- **isUnderWater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isUnderWater()

	- **@r** `A` bool.


- **isValid** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isValid()

	- **@r** `A` bool.


- **isVisibleByDefault** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isVisibleByDefault()

	- **@r** `A` bool.


- **isVisualFire** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#isVisualFire()

	- **@r** `A` bool.


- **kill** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#kill()



- **kill** (`DamageSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#kill(org.bukkit.damage.DamageSource)

	- **@p** `DamageSource` is a [DamageSource](DamageSource.aus.md).


- **knockback** (`Strength, DirectionX, DirectionZ`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#knockback(double,double,double)

	- **@p** `Strength` is a double.
	- **@p** `DirectionX` is a double.
	- **@p** `DirectionZ` is a double.


- **leaveVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#leaveVehicle()

	- **@r** `A` bool.


- **lockFreezeTicks** (`Locked`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#lockFreezeTicks(boolean)

	- **@p** `Locked` is a bool.


- **lookAt** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#lookAt(org.bukkit.entity.Entity)

	- **@p** `Entity` is an [Entity](Entity.aus.md).


- **lookAt\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#lookAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).


- **lookAt** (`Position, EntityAnchor`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#lookAt(io.papermc.paper.math.Position,io.papermc.paper.entity.LookAnchor)

	- **@p** `Position` is a [Position](Position.aus.md).
	- **@p** `EntityAnchor` is a string naming a [LookAnchor](LookAnchor.aus.md).


- **lookAt\_entity\_headrotationspeed\_maxheadpitch** (`Entity, HeadRotationSpeed, MaxHeadPitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#lookAt(org.bukkit.entity.Entity,float,float)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@p** `HeadRotationSpeed` is a double.
	- **@p** `MaxHeadPitch` is a double.


- **lookAt\_location\_headrotationspeed\_maxheadpitch** (`Location, HeadRotationSpeed, MaxHeadPitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#lookAt(org.bukkit.Location,float,float)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `HeadRotationSpeed` is a double.
	- **@p** `MaxHeadPitch` is a double.


- **lookAt** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#lookAt(double,double,double)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.


- **lookAt** (`X, Y, Z, EntityAnchor`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#lookAt(double,double,double,io.papermc.paper.entity.LookAnchor)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `EntityAnchor` is a string naming a [LookAnchor](LookAnchor.aus.md).


- **lookAt** (`X, Y, Z, HeadRotationSpeed, MaxHeadPitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#lookAt(double,double,double,float,float)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `HeadRotationSpeed` is a double.
	- **@p** `MaxHeadPitch` is a double.


- **name** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#name()

	- **@r** `A` Component.


- **playEffect** (`Effect`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#playEffect(org.bukkit.EntityEffect)

	- **@p** `Effect` is an string naming an [EntityEffect](EntityEffect.aus.md).


- **playHurtAnimation** (`Yaw`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#playHurtAnimation(float)

	- **@p** `Yaw` is a double.


- **playPickupItemAnimation** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#playPickupItemAnimation(org.bukkit.entity.Item)

	- **@p** `Item` is an [Item](Item.aus.md).


- **playPickupItemAnimation** (`Item, Quantity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#playPickupItemAnimation(org.bukkit.entity.Item,int)

	- **@p** `Item` is an [Item](Item.aus.md).
	- **@p** `Quantity` is an int.


- **rayTraceBlocks** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#rayTraceBlocks(double)

	- **@p** `MaxDistance` is a double.
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **rayTraceBlocks** (`MaxDistance, FluidCollisionMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#rayTraceBlocks(double,org.bukkit.FluidCollisionMode)

	- **@p** `MaxDistance` is a double.
	- **@p** `FluidCollisionMode` is a string naming a [FluidCollisionMode](FluidCollisionMode.aus.md).
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **rayTraceEntities** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#rayTraceEntities(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **rayTraceEntities** (`MaxDistance, IgnoreBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#rayTraceEntities(int,boolean)

	- **@p** `MaxDistance` is an int.
	- **@p** `IgnoreBlocks` is a bool.
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **recalculatePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#recalculatePermissions()



- **registerAttribute** (`Attribute`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#registerAttribute(org.bukkit.attribute.Attribute)

	- **@p** `Attribute` is an [Attribute](Attribute.aus.md).


- **remove** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#remove()



- **removePassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#removePassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **removePotionEffect** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#removePotionEffect(org.bukkit.potion.PotionEffectType)

	- **@p** `Type` is a [PotionEffectType](PotionEffectType.aus.md).


- **removeResourcePacks** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#removeResourcePacks(java.lang.Iterable)

	- **@p** `A0` is an Iterable.


- **removeScoreboardTag** (`Tag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#removeScoreboardTag(java.lang.String)

	- **@p** `Tag` is a string.
	- **@r** `A` bool.


- **resetMaxHealth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#resetMaxHealth()



- **resetTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#resetTitle()



- **sendActionBar** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#sendActionBar(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendActionBar\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#sendActionBar(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage\_Component** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#sendMessage(net.kyori.adventure.text.Component)

	- **@p** `Message` is a Component.


- **sendMessage\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#sendMessage(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#sendMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendMessage** (`Sender, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#sendMessage(java.util.UUID,java.lang.String)

	- **@p** `Sender` is a string.
	- **@p** `Message` is a string.


- **sendPlainMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#sendPlainMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendPlayerListFooter** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#sendPlayerListFooter(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListFooter\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#sendPlayerListFooter(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeader** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#sendPlayerListHeader(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListHeader\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#sendPlayerListHeader(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeaderAndFooter** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.Component,net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.
	- **@p** `A1` is a Component.


- **sendPlayerListHeaderAndFooter\_ComponentLike\_ComponentLike** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.ComponentLike,net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.
	- **@p** `A1` is a ComponentLike.


- **sendRichMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#sendRichMessage(java.lang.String)

	- **@p** `Message` is a string.


- **setAI** (`Ai`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setAI(boolean)

	- **@p** `Ai` is a bool.


- **setAbsorptionAmount** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setAbsorptionAmount(double)

	- **@p** `Amount` is a double.


- **setActiveItemRemainingTime** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setActiveItemRemainingTime(int)

	- **@p** `Ticks` is an int.


- **setAggressive** (`Aggressive`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setAggressive(boolean)

	- **@p** `Aggressive` is a bool.


- **setArrowCooldown** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setArrowCooldown(int)

	- **@p** `Ticks` is an int.


- **setArrowsInBody** (`Count`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setArrowsInBody(int)

	- **@p** `Count` is an int.


- **setArrowsInBody** (`Count, FireEvent`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setArrowsInBody(int,boolean)

	- **@p** `Count` is an int.
	- **@p** `FireEvent` is a bool.


- **setArrowsStuck** (`Arrows`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setArrowsStuck(int)

	- **@p** `Arrows` is an int.


- **setAware** (`Aware`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setAware(boolean)

	- **@p** `Aware` is a bool.


- **setBeeStingerCooldown** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setBeeStingerCooldown(int)

	- **@p** `Ticks` is an int.


- **setBeeStingersInBody** (`Count`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setBeeStingersInBody(int)

	- **@p** `Count` is an int.


- **setBodyYaw** (`BodyYaw`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setBodyYaw(float)

	- **@p** `BodyYaw` is a double.


- **setCanPickupItems** (`Pickup`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setCanPickupItems(boolean)

	- **@p** `Pickup` is a bool.


- **setCollidable** (`Collidable`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setCollidable(boolean)

	- **@p** `Collidable` is a bool.


- **setCustomName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setCustomName(java.lang.String)

	- **@p** `Name` is a string.


- **setCustomNameVisible** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setCustomNameVisible(boolean)

	- **@p** `Flag` is a bool.


- **setFallDistance** (`Distance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setFallDistance(float)

	- **@p** `Distance` is a double.


- **setFireTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setFireTicks(int)

	- **@p** `Ticks` is an int.


- **setFreezeTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setFreezeTicks(int)

	- **@p** `Ticks` is an int.


- **setGliding** (`Gliding`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setGliding(boolean)

	- **@p** `Gliding` is a bool.


- **setGlowing** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setGlowing(boolean)

	- **@p** `Flag` is a bool.


- **setGravity** (`Gravity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setGravity(boolean)

	- **@p** `Gravity` is a bool.


- **setHealth** (`Health`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setHealth(double)

	- **@p** `Health` is a double.


- **setHurtDirection** (`HurtDirection`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setHurtDirection(float)

	- **@p** `HurtDirection` is a double.


- **setInvisible** (`Invisible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setInvisible(boolean)

	- **@p** `Invisible` is a bool.


- **setInvulnerable** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setInvulnerable(boolean)

	- **@p** `Flag` is a bool.


- **setItemInUseTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setItemInUseTicks(int)

	- **@p** `Ticks` is an int.


- **setJumping** (`Jumping`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setJumping(boolean)

	- **@p** `Jumping` is a bool.


- **setKiller** (`Killer`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setKiller(org.bukkit.entity.Player)

	- **@p** `Killer` is a [Player](Player.aus.md).


- **setLastDamage** (`Damage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setLastDamage(double)

	- **@p** `Damage` is a double.


- **setLastDamageCause** (`Event`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setLastDamageCause(org.bukkit.event.entity.EntityDamageEvent)

	- **@p** `Event` is an [EntityDamageEvent](EntityDamageEvent.aus.md).


- **setLeashHolder** (`Holder`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setLeashHolder(org.bukkit.entity.Entity)

	- **@p** `Holder` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **setLeftHanded** (`LeftHanded`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setLeftHanded(boolean)

	- **@p** `LeftHanded` is a bool.


- **setLootTable** (`Table`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setLootTable(org.bukkit.loot.LootTable)

	- **@p** `Table` is a [LootTable](LootTable.aus.md).


- **setLootTable** (`Table, Seed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setLootTable(org.bukkit.loot.LootTable,long)

	- **@p** `Table` is a [LootTable](LootTable.aus.md).
	- **@p** `Seed` is an int.


- **setMaxHealth** (`Health`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setMaxHealth(double)

	- **@p** `Health` is a double.


- **setMaximumAir** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setMaximumAir(int)

	- **@p** `Ticks` is an int.


- **setMaximumNoDamageTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setMaximumNoDamageTicks(int)

	- **@p** `Ticks` is an int.


- **setMemory** (`MemoryKey, MemoryValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setMemory(org.bukkit.entity.memory.MemoryKey,java.lang.Object)

	- **@p** `MemoryKey` is a [MemoryKey](MemoryKey.aus.md).
	- **@p** `MemoryValue` is an Object.


- **setMetadata** (`MetadataKey, NewMetadataValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setMetadata(java.lang.String,org.bukkit.metadata.MetadataValue)

	- **@p** `MetadataKey` is a string.
	- **@p** `NewMetadataValue` is a [MetadataValue](MetadataValue.aus.md).


- **setNextArrowRemoval** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setNextArrowRemoval(int)

	- **@p** `Ticks` is an int.


- **setNextBeeStingerRemoval** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setNextBeeStingerRemoval(int)

	- **@p** `Ticks` is an int.


- **setNoActionTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setNoActionTicks(int)

	- **@p** `Ticks` is an int.


- **setNoDamageTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setNoDamageTicks(int)

	- **@p** `Ticks` is an int.


- **setNoPhysics** (`NoPhysics`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setNoPhysics(boolean)

	- **@p** `NoPhysics` is a bool.


- **setPassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setPassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **setPersistent** (`Persistent`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setPersistent(boolean)

	- **@p** `Persistent` is a bool.


- **setPortalCooldown** (`Cooldown`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setPortalCooldown(int)

	- **@p** `Cooldown` is an int.


- **setPose** (`Pose`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setPose(org.bukkit.entity.Pose)

	- **@p** `Pose` is a string naming a [Pose](Pose.aus.md).


- **setPose** (`Pose, Fixed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setPose(org.bukkit.entity.Pose,boolean)

	- **@p** `Pose` is a string naming a [Pose](Pose.aus.md).
	- **@p** `Fixed` is a bool.


- **setRemainingAir** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setRemainingAir(int)

	- **@p** `Ticks` is an int.


- **setRemoveWhenFarAway** (`Remove`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setRemoveWhenFarAway(boolean)

	- **@p** `Remove` is a bool.


- **setRiptiding** (`Riptiding`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setRiptiding(boolean)

	- **@p** `Riptiding` is a bool.


- **setRotation\_Angle\_Angle** (`Yaw, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setRotation(io.papermc.paper.math.Angle,io.papermc.paper.math.Angle)

	- **@p** `Yaw` is an [Angle](Angle.aus.md).
	- **@p** `Pitch` is an [Angle](Angle.aus.md).


- **setRotation** (`Yaw, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setRotation(float,float)

	- **@p** `Yaw` is a double.
	- **@p** `Pitch` is a double.


- **setSeed** (`Seed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setSeed(long)

	- **@p** `Seed` is an int.


- **setShieldBlockingDelay** (`Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setShieldBlockingDelay(int)

	- **@p** `Delay` is an int.


- **setSilent** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setSilent(boolean)

	- **@p** `Flag` is a bool.


- **setSneaking** (`Sneak`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setSneaking(boolean)

	- **@p** `Sneak` is a bool.


- **setSwimming** (`Swimming`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setSwimming(boolean)

	- **@p** `Swimming` is a bool.


- **setTarget** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setTarget(org.bukkit.entity.LivingEntity)

	- **@p** `Target` is a [LivingEntity](LivingEntity.aus.md).


- **setTicksLived** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setTicksLived(int)

	- **@p** `Value` is an int.


- **setVelocity** (`Velocity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setVelocity(org.bukkit.util.Vector)

	- **@p** `Velocity` is a [Vector](Vector.aus.md).


- **setVisibleByDefault** (`Visible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setVisibleByDefault(boolean)

	- **@p** `Visible` is a bool.


- **setVisualFire** (`Fire`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setVisualFire(boolean)

	- **@p** `Fire` is a bool.


- **setWaypointColor** (`Color`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#setWaypointColor(org.bukkit.Color)

	- **@p** `Color` is a [Color](Color.aus.md).


- **shouldDespawnInPeaceful** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#shouldDespawnInPeaceful()

	- **@r** `A` bool.


- **spawnAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#spawnAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **spawnAt** (`Location, Reason`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#spawnAt(org.bukkit.Location,org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Reason` is a string naming a CreatureSpawnEvent.SpawnReason.
	- **@r** `A` bool.


- **spigot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#spigot()

	- **@r** `An` Entity.Spigot.


- **startUsingItem** (`Hand`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#startUsingItem(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Hand` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **swingHand** (`Hand`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#swingHand(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Hand` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **swingMainHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#swingMainHand()



- **swingOffHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#swingOffHand()



- **teamDisplayName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#teamDisplayName()

	- **@r** `A` Component.


- **teleport** (`Destination`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#teleport(org.bukkit.entity.Entity)

	- **@p** `Destination` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **teleport\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#teleport(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **teleport** (`Destination, Cause`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#teleport(org.bukkit.entity.Entity,org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)

	- **@p** `Destination` is an [Entity](Entity.aus.md).
	- **@p** `Cause` is a string naming a PlayerTeleportEvent.TeleportCause.
	- **@r** `A` bool.


- **teleport\_location\_cause** (`Location, Cause`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#teleport(org.bukkit.Location,org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Cause` is a string naming a PlayerTeleportEvent.TeleportCause.
	- **@r** `A` bool.


- **wouldCollideUsing** (`BoundingBox`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Golem.html#wouldCollideUsing(org.bukkit.util.BoundingBox)

	- **@p** `BoundingBox` is a [BoundingBox](BoundingBox.aus.md).
	- **@r** `A` bool.




