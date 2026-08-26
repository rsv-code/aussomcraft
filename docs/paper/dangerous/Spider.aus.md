# file: Spider.aus

## class: Spider

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.SpiderShim) **extends: object** 

Generated shim for org.bukkit.entity.Spider.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html
In Paper this is a [Monster](Monster.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addPassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#addPassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **addPotionEffect** (`Effect`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#addPotionEffect(org.bukkit.potion.PotionEffect)

	- **@p** `Effect` is a [PotionEffect](PotionEffect.aus.md).
	- **@r** `A` bool.


- **addPotionEffect** (`Effect, Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#addPotionEffect(org.bukkit.potion.PotionEffect,boolean)

	- **@p** `Effect` is a [PotionEffect](PotionEffect.aus.md).
	- **@p** `Force` is a bool.
	- **@r** `A` bool.


- **addPotionEffects** (`Effects`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#addPotionEffects(java.util.Collection)

	- **@p** `Effects` is a list.
	- **@r** `A` bool.


- **addScoreboardTag** (`Tag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#addScoreboardTag(java.lang.String)

	- **@p** `Tag` is a string.
	- **@r** `A` bool.


- **attack** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#attack(org.bukkit.entity.Entity)

	- **@p** `Target` is an [Entity](Entity.aus.md).


- **broadcastHurtAnimation** (`Players`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#broadcastHurtAnimation(java.util.Collection)

	- **@p** `Players` is a list.


- **broadcastSlotBreak** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#broadcastSlotBreak(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **broadcastSlotBreak** (`Slot, Players`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#broadcastSlotBreak(org.bukkit.inventory.EquipmentSlot,java.util.Collection)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).
	- **@p** `Players` is a list.


- **canBreatheUnderwater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#canBreatheUnderwater()

	- **@r** `A` bool.


- **canUseEquipmentSlot** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#canUseEquipmentSlot(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).
	- **@r** `A` bool.


- **clearActiveItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#clearActiveItem()



- **clearActivePotionEffects** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#clearActivePotionEffects()

	- **@r** `A` bool.


- **clearLootTable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#clearLootTable()



- **clearResourcePacks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#clearResourcePacks()



- **clearTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#clearTitle()



- **closeDialog** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#closeDialog()



- **collidesAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#collidesAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **completeUsingActiveItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#completeUsingActiveItem()



- **copy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#copy()

	- **@r** `An` [Entity](Entity.aus.md).


- **copy** (`To`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#copy(org.bukkit.Location)

	- **@p** `To` is a [Location](Location.aus.md).
	- **@r** `An` [Entity](Entity.aus.md).


- **createSnapshot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#createSnapshot()

	- **@r** `An` [EntitySnapshot](EntitySnapshot.aus.md).


- **customName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#customName()

	- **@r** `A` Component.


- **customName** (`CustomName`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#customName(net.kyori.adventure.text.Component)

	- **@p** `CustomName` is a Component.


- **damage** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#damage(double)

	- **@p** `Amount` is a double.


- **damage** (`Amount, DamageSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#damage(double,org.bukkit.damage.DamageSource)

	- **@p** `Amount` is a double.
	- **@p** `DamageSource` is a [DamageSource](DamageSource.aus.md).


- **damage\_amount\_source** (`Amount, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#damage(double,org.bukkit.entity.Entity)

	- **@p** `Amount` is a double.
	- **@p** `Source` is an [Entity](Entity.aus.md).


- **damageItemStack** (`Slot, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#damageItemStack(org.bukkit.inventory.EquipmentSlot,int)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).
	- **@p** `Amount` is an int.


- **damageItemStack\_stack\_amount** (`Stack, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#damageItemStack(org.bukkit.inventory.ItemStack,int)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **eject** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#eject()

	- **@r** `A` bool.


- **fromMobSpawner** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#fromMobSpawner()

	- **@r** `A` bool.


- **getAbsorptionAmount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getAbsorptionAmount()

	- **@r** `A` double.


- **getActiveItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getActiveItem()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getActiveItemHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getActiveItemHand()

	- **@r** `An` string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **getActiveItemRemainingTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getActiveItemRemainingTime()

	- **@r** `An` int.


- **getActiveItemUsedTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getActiveItemUsedTime()

	- **@r** `An` int.


- **getActivePotionEffects** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getActivePotionEffects()

	- **@r** `A` list.


- **getAmbientSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getAmbientSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getArrowCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getArrowCooldown()

	- **@r** `An` int.


- **getArrowsInBody** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getArrowsInBody()

	- **@r** `An` int.


- **getArrowsStuck** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getArrowsStuck()

	- **@r** `An` int.


- **getAsString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getAsString()

	- **@r** `A` string.


- **getAttribute** (`Attribute`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getAttribute(org.bukkit.attribute.Attribute)

	- **@p** `Attribute` is an [Attribute](Attribute.aus.md).
	- **@r** `An` [AttributeInstance](AttributeInstance.aus.md).


- **getBeeStingerCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getBeeStingerCooldown()

	- **@r** `An` int.


- **getBeeStingersInBody** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getBeeStingersInBody()

	- **@r** `An` int.


- **getBodyYaw** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getBodyYaw()

	- **@r** `A` double.


- **getBoundingBox** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getBoundingBox()

	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **getCanPickupItems** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getCanPickupItems()

	- **@r** `A` bool.


- **getCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getCategory()

	- **@r** `An` string naming an [EntityCategory](EntityCategory.aus.md).


- **getChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getChunk()

	- **@r** `A` [Chunk](Chunk.aus.md).


- **getCollidableExemptions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getCollidableExemptions()

	- **@r** `A` list.


- **getCombatTracker** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getCombatTracker()

	- **@r** `A` [CombatTracker](CombatTracker.aus.md).


- **getCustomName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getCustomName()

	- **@r** `A` string.


- **getData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getData(io.papermc.paper.datacomponent.DataComponentType.Valued)

	- **@p** `Type` is a DataComponentType.Valued.
	- **@r** `An` Object.


- **getDataOrDefault** (`Type, Fallback`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getDataOrDefault(io.papermc.paper.datacomponent.DataComponentType.Valued,java.lang.Object)

	- **@p** `Type` is a DataComponentType.Valued.
	- **@p** `Fallback` is an Object.
	- **@r** `An` Object.


- **getDeathSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getDeathSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getDrinkingSound** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getDrinkingSound(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` [Sound](Sound.aus.md).


- **getEatingSound** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getEatingSound(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` [Sound](Sound.aus.md).


- **getEffectivePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getEffectivePermissions()

	- **@r** `A` list.


- **getEntityId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getEntityId()

	- **@r** `An` int.


- **getEntitySpawnReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getEntitySpawnReason()

	- **@r** `A` string naming a CreatureSpawnEvent.SpawnReason.


- **getEquipment** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getEquipment()

	- **@r** `An` [EntityEquipment](EntityEquipment.aus.md).


- **getEyeHeight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getEyeHeight()

	- **@r** `A` double.


- **getEyeHeight** (`IgnorePose`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getEyeHeight(boolean)

	- **@p** `IgnorePose` is a bool.
	- **@r** `A` double.


- **getEyeLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getEyeLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getFacing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getFacing()

	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getFallDamageSound** (`FallHeight`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getFallDamageSound(int)

	- **@p** `FallHeight` is an int.
	- **@r** `A` [Sound](Sound.aus.md).


- **getFallDamageSoundBig** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getFallDamageSoundBig()

	- **@r** `A` [Sound](Sound.aus.md).


- **getFallDamageSoundSmall** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getFallDamageSoundSmall()

	- **@r** `A` [Sound](Sound.aus.md).


- **getFallDistance** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getFallDistance()

	- **@r** `A` double.


- **getFireTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getFireTicks()

	- **@r** `An` int.


- **getForwardsMovement** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getForwardsMovement()

	- **@r** `A` double.


- **getFreezeTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getFreezeTicks()

	- **@r** `An` int.


- **getHandRaised** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getHandRaised()

	- **@r** `An` string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **getHandRaisedTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getHandRaisedTime()

	- **@r** `An` int.


- **getHeadRotationSpeed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getHeadRotationSpeed()

	- **@r** `An` int.


- **getHealth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getHealth()

	- **@r** `A` double.


- **getHeight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getHeight()

	- **@r** `A` double.


- **getHurtDirection** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getHurtDirection()

	- **@r** `A` double.


- **getHurtSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getHurtSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getHurtSound** (`DamageSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getHurtSound(org.bukkit.damage.DamageSource)

	- **@p** `DamageSource` is a [DamageSource](DamageSource.aus.md).
	- **@r** `A` [Sound](Sound.aus.md).


- **getItemInUse** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getItemInUse()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getItemInUseTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getItemInUseTicks()

	- **@r** `An` int.


- **getItemUseRemainingTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getItemUseRemainingTime()

	- **@r** `An` int.


- **getKiller** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getKiller()

	- **@r** `A` [Player](Player.aus.md).


- **getLastDamage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getLastDamage()

	- **@r** `A` double.


- **getLastDamageCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getLastDamageCause()

	- **@r** `An` [EntityDamageEvent](EntityDamageEvent.aus.md).


- **getLastTwoTargetBlocks** (`Transparent, MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getLastTwoTargetBlocks(java.util.Set,int)

	- **@p** `Transparent` is a list.
	- **@p** `MaxDistance` is an int.
	- **@r** `A` list.


- **getLeashHolder** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getLeashHolder()

	- **@r** `An` [Entity](Entity.aus.md).


- **getLineOfSight** (`Transparent, MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getLineOfSight(java.util.Set,int)

	- **@p** `Transparent` is a list.
	- **@p** `MaxDistance` is an int.
	- **@r** `A` list.


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getLocation** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getLocation(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **getLootTable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getLootTable()

	- **@r** `A` [LootTable](LootTable.aus.md).


- **getMaxFireTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getMaxFireTicks()

	- **@r** `An` int.


- **getMaxFreezeTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getMaxFreezeTicks()

	- **@r** `An` int.


- **getMaxHeadPitch** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getMaxHeadPitch()

	- **@r** `An` int.


- **getMaxHealth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getMaxHealth()

	- **@r** `A` double.


- **getMaximumAir** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getMaximumAir()

	- **@r** `An` int.


- **getMaximumNoDamageTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getMaximumNoDamageTicks()

	- **@r** `An` int.


- **getMemory** (`MemoryKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getMemory(org.bukkit.entity.memory.MemoryKey)

	- **@p** `MemoryKey` is a [MemoryKey](MemoryKey.aus.md).
	- **@r** `An` Object.


- **getMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` list.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getName()

	- **@r** `A` string.


- **getNearbyEntities** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getNearbyEntities(double,double,double)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` list.


- **getNextArrowRemoval** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getNextArrowRemoval()

	- **@r** `An` int.


- **getNextBeeStingerRemoval** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getNextBeeStingerRemoval()

	- **@r** `An` int.


- **getNoActionTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getNoActionTicks()

	- **@r** `An` int.


- **getNoDamageTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getNoDamageTicks()

	- **@r** `An` int.


- **getOrigin** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getOrigin()

	- **@r** `A` [Location](Location.aus.md).


- **getPassenger** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getPassenger()

	- **@r** `An` [Entity](Entity.aus.md).


- **getPassengers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getPassengers()

	- **@r** `A` list.


- **getPathfinder** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getPathfinder()

	- **@r** `A` [Pathfinder](Pathfinder.aus.md).


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getPickItemStack** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getPickItemStack()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getPistonMoveReaction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getPistonMoveReaction()

	- **@r** `A` string naming a [PistonMoveReaction](PistonMoveReaction.aus.md).


- **getPitch** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getPitch()

	- **@r** `A` double.


- **getPortalCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getPortalCooldown()

	- **@r** `An` int.


- **getPose** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getPose()

	- **@r** `A` string naming a [Pose](Pose.aus.md).


- **getPossibleExperienceReward** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getPossibleExperienceReward()

	- **@r** `An` int.


- **getPotionEffect** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getPotionEffect(org.bukkit.potion.PotionEffectType)

	- **@p** `Type` is a [PotionEffectType](PotionEffectType.aus.md).
	- **@r** `A` [PotionEffect](PotionEffect.aus.md).


- **getRemainingAir** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getRemainingAir()

	- **@r** `An` int.


- **getRemovalReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getRemovalReason()

	- **@r** `A` string naming a [RemovalReason](RemovalReason.aus.md).


- **getRemoveEventCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getRemoveEventCause()

	- **@r** `A` string naming an EntityRemoveEvent.Cause.


- **getRemoveWhenFarAway** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getRemoveWhenFarAway()

	- **@r** `A` bool.


- **getScoreboardEntryName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getScoreboardEntryName()

	- **@r** `A` string.


- **getScoreboardTags** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getScoreboardTags()

	- **@r** `A` list.


- **getSeed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getSeed()

	- **@r** `An` int.


- **getShieldBlockingDelay** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getShieldBlockingDelay()

	- **@r** `An` int.


- **getSidewaysMovement** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getSidewaysMovement()

	- **@r** `A` double.


- **getSoundCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getSoundCategory()

	- **@r** `A` string naming a [SoundCategory](SoundCategory.aus.md).


- **getSoundPitch** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getSoundPitch()

	- **@r** `A` double.


- **getSoundVolume** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getSoundVolume()

	- **@r** `A` double.


- **getSpawnCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getSpawnCategory()

	- **@r** `A` string naming a [SpawnCategory](SpawnCategory.aus.md).


- **getSwimHighSpeedSplashSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getSwimHighSpeedSplashSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getSwimSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getSwimSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getSwimSplashSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getSwimSplashSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getTarget** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTarget()

	- **@r** `A` [LivingEntity](LivingEntity.aus.md).


- **getTargetBlock** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTargetBlock(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlock** (`Transparent, MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTargetBlock(java.util.Set,int)

	- **@p** `Transparent` is a list.
	- **@p** `MaxDistance` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlock\_maxdistance\_fluidmode** (`MaxDistance, FluidMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTargetBlock(int,com.destroystokyo.paper.block.TargetBlockInfo.FluidMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidMode` is a string naming a TargetBlockInfo.FluidMode.
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlockExact** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTargetBlockExact(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlockExact** (`MaxDistance, FluidCollisionMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTargetBlockExact(int,org.bukkit.FluidCollisionMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidCollisionMode` is a string naming a [FluidCollisionMode](FluidCollisionMode.aus.md).
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlockFace** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTargetBlockFace(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getTargetBlockFace** (`MaxDistance, FluidMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTargetBlockFace(int,org.bukkit.FluidCollisionMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidMode` is a string naming a [FluidCollisionMode](FluidCollisionMode.aus.md).
	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getTargetBlockFace\_int\_FluidMode** (`MaxDistance, FluidMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTargetBlockFace(int,com.destroystokyo.paper.block.TargetBlockInfo.FluidMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidMode` is a string naming a TargetBlockInfo.FluidMode.
	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getTargetBlockInfo** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTargetBlockInfo(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [TargetBlockInfo](TargetBlockInfo.aus.md).


- **getTargetBlockInfo** (`MaxDistance, FluidMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTargetBlockInfo(int,com.destroystokyo.paper.block.TargetBlockInfo.FluidMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidMode` is a string naming a TargetBlockInfo.FluidMode.
	- **@r** `A` [TargetBlockInfo](TargetBlockInfo.aus.md).


- **getTargetEntity** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTargetEntity(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `An` [Entity](Entity.aus.md).


- **getTargetEntity** (`MaxDistance, IgnoreBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTargetEntity(int,boolean)

	- **@p** `MaxDistance` is an int.
	- **@p** `IgnoreBlocks` is a bool.
	- **@r** `An` [Entity](Entity.aus.md).


- **getTargetEntityInfo** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTargetEntityInfo(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [TargetEntityInfo](TargetEntityInfo.aus.md).


- **getTargetEntityInfo** (`MaxDistance, IgnoreBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTargetEntityInfo(int,boolean)

	- **@p** `MaxDistance` is an int.
	- **@p** `IgnoreBlocks` is a bool.
	- **@r** `A` [TargetEntityInfo](TargetEntityInfo.aus.md).


- **getTicksLived** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTicksLived()

	- **@r** `An` int.


- **getTrackedBy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTrackedBy()

	- **@r** `A` list.


- **getTrackedPlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getTrackedPlayers()

	- **@r** `A` list.


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getUniqueId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getUniqueId()

	- **@r** `A` string.


- **getUpwardsMovement** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getUpwardsMovement()

	- **@r** `A` double.


- **getVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getVehicle()

	- **@r** `An` [Entity](Entity.aus.md).


- **getVelocity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getVelocity()

	- **@r** `A` [Vector](Vector.aus.md).


- **getWaypointColor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getWaypointColor()

	- **@r** `A` [Color](Color.aus.md).


- **getWidth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getWidth()

	- **@r** `A` double.


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **getX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getX()

	- **@r** `A` double.


- **getY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getY()

	- **@r** `A` double.


- **getYaw** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getYaw()

	- **@r** `A` double.


- **getZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getZ()

	- **@r** `A` double.


- **hasAI** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#hasAI()

	- **@r** `A` bool.


- **hasActiveItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#hasActiveItem()

	- **@r** `A` bool.


- **hasData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#hasData(io.papermc.paper.datacomponent.DataComponentType)

	- **@p** `Type` is a [DataComponentType](DataComponentType.aus.md).
	- **@r** `A` bool.


- **hasFixedPose** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#hasFixedPose()

	- **@r** `A` bool.


- **hasGravity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#hasGravity()

	- **@r** `A` bool.


- **hasLineOfSight** (`Other`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#hasLineOfSight(org.bukkit.entity.Entity)

	- **@p** `Other` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **hasLineOfSight\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#hasLineOfSight(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **hasLootTable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#hasLootTable()

	- **@r** `A` bool.


- **hasMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#hasMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` bool.


- **hasNoPhysics** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#hasNoPhysics()

	- **@r** `A` bool.


- **hasPermission\_perm** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#hasPermission(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).
	- **@r** `A` bool.


- **hasPermission** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#hasPermission(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **hasPotionEffect** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#hasPotionEffect(org.bukkit.potion.PotionEffectType)

	- **@p** `Type` is a [PotionEffectType](PotionEffectType.aus.md).
	- **@r** `A` bool.


- **heal** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#heal(double)

	- **@p** `Amount` is a double.


- **heal** (`Amount, Reason`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#heal(double,org.bukkit.event.entity.EntityRegainHealthEvent.RegainReason)

	- **@p** `Amount` is a double.
	- **@p** `Reason` is a string naming an EntityRegainHealthEvent.RegainReason.


- **isAggressive** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isAggressive()

	- **@r** `A` bool.


- **isAware** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isAware()

	- **@r** `A` bool.


- **isClimbing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isClimbing()

	- **@r** `A` bool.


- **isCollidable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isCollidable()

	- **@r** `A` bool.


- **isCustomNameVisible** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isCustomNameVisible()

	- **@r** `A` bool.


- **isDead** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isDead()

	- **@r** `A` bool.


- **isEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isEmpty()

	- **@r** `A` bool.


- **isFreezeTickingLocked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isFreezeTickingLocked()

	- **@r** `A` bool.


- **isFrozen** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isFrozen()

	- **@r** `A` bool.


- **isGliding** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isGliding()

	- **@r** `A` bool.


- **isGlowing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isGlowing()

	- **@r** `A` bool.


- **isHandRaised** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isHandRaised()

	- **@r** `A` bool.


- **isInBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isInBubbleColumn()

	- **@r** `A` bool.


- **isInDaylight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isInDaylight()

	- **@r** `A` bool.


- **isInLava** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isInLava()

	- **@r** `A` bool.


- **isInPowderedSnow** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isInPowderedSnow()

	- **@r** `A` bool.


- **isInRain** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isInRain()

	- **@r** `A` bool.


- **isInWater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isInWater()

	- **@r** `A` bool.


- **isInWaterOrBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isInWaterOrBubbleColumn()

	- **@r** `A` bool.


- **isInWaterOrRain** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isInWaterOrRain()

	- **@r** `A` bool.


- **isInWaterOrRainOrBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isInWaterOrRainOrBubbleColumn()

	- **@r** `A` bool.


- **isInWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isInWorld()

	- **@r** `A` bool.


- **isInsideVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isInsideVehicle()

	- **@r** `A` bool.


- **isInvisible** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isInvisible()

	- **@r** `A` bool.


- **isInvulnerable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isInvulnerable()

	- **@r** `A` bool.


- **isJumping** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isJumping()

	- **@r** `A` bool.


- **isLeashed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isLeashed()

	- **@r** `A` bool.


- **isLeftHanded** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isLeftHanded()

	- **@r** `A` bool.


- **isOnGround** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isOnGround()

	- **@r** `A` bool.


- **isOp** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isOp()

	- **@r** `A` bool.


- **isPermissionSet\_perm** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isPermissionSet(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).
	- **@r** `A` bool.


- **isPermissionSet** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isPermissionSet(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **isPersistent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isPersistent()

	- **@r** `A` bool.


- **isRiptiding** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isRiptiding()

	- **@r** `A` bool.


- **isSilent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isSilent()

	- **@r** `A` bool.


- **isSleeping** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isSleeping()

	- **@r** `A` bool.


- **isSneaking** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isSneaking()

	- **@r** `A` bool.


- **isSwimming** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isSwimming()

	- **@r** `A` bool.


- **isTicking** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isTicking()

	- **@r** `A` bool.


- **isTrackedBy** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isTrackedBy(org.bukkit.entity.Player)

	- **@p** `Player` is a [Player](Player.aus.md).
	- **@r** `A` bool.


- **isUnderWater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isUnderWater()

	- **@r** `A` bool.


- **isValid** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isValid()

	- **@r** `A` bool.


- **isVisibleByDefault** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isVisibleByDefault()

	- **@r** `A` bool.


- **isVisualFire** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#isVisualFire()

	- **@r** `A` bool.


- **kill** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#kill()



- **kill** (`DamageSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#kill(org.bukkit.damage.DamageSource)

	- **@p** `DamageSource` is a [DamageSource](DamageSource.aus.md).


- **knockback** (`Strength, DirectionX, DirectionZ`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#knockback(double,double,double)

	- **@p** `Strength` is a double.
	- **@p** `DirectionX` is a double.
	- **@p** `DirectionZ` is a double.


- **leaveVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#leaveVehicle()

	- **@r** `A` bool.


- **lockFreezeTicks** (`Locked`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#lockFreezeTicks(boolean)

	- **@p** `Locked` is a bool.


- **lookAt** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#lookAt(org.bukkit.entity.Entity)

	- **@p** `Entity` is an [Entity](Entity.aus.md).


- **lookAt\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#lookAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).


- **lookAt** (`Position, EntityAnchor`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#lookAt(io.papermc.paper.math.Position,io.papermc.paper.entity.LookAnchor)

	- **@p** `Position` is a [Position](Position.aus.md).
	- **@p** `EntityAnchor` is a string naming a [LookAnchor](LookAnchor.aus.md).


- **lookAt\_entity\_headrotationspeed\_maxheadpitch** (`Entity, HeadRotationSpeed, MaxHeadPitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#lookAt(org.bukkit.entity.Entity,float,float)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@p** `HeadRotationSpeed` is a double.
	- **@p** `MaxHeadPitch` is a double.


- **lookAt\_location\_headrotationspeed\_maxheadpitch** (`Location, HeadRotationSpeed, MaxHeadPitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#lookAt(org.bukkit.Location,float,float)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `HeadRotationSpeed` is a double.
	- **@p** `MaxHeadPitch` is a double.


- **lookAt** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#lookAt(double,double,double)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.


- **lookAt** (`X, Y, Z, EntityAnchor`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#lookAt(double,double,double,io.papermc.paper.entity.LookAnchor)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `EntityAnchor` is a string naming a [LookAnchor](LookAnchor.aus.md).


- **lookAt** (`X, Y, Z, HeadRotationSpeed, MaxHeadPitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#lookAt(double,double,double,float,float)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `HeadRotationSpeed` is a double.
	- **@p** `MaxHeadPitch` is a double.


- **name** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#name()

	- **@r** `A` Component.


- **playEffect** (`Effect`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#playEffect(org.bukkit.EntityEffect)

	- **@p** `Effect` is an string naming an [EntityEffect](EntityEffect.aus.md).


- **playHurtAnimation** (`Yaw`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#playHurtAnimation(float)

	- **@p** `Yaw` is a double.


- **playPickupItemAnimation** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#playPickupItemAnimation(org.bukkit.entity.Item)

	- **@p** `Item` is an [Item](Item.aus.md).


- **playPickupItemAnimation** (`Item, Quantity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#playPickupItemAnimation(org.bukkit.entity.Item,int)

	- **@p** `Item` is an [Item](Item.aus.md).
	- **@p** `Quantity` is an int.


- **rayTraceBlocks** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#rayTraceBlocks(double)

	- **@p** `MaxDistance` is a double.
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **rayTraceBlocks** (`MaxDistance, FluidCollisionMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#rayTraceBlocks(double,org.bukkit.FluidCollisionMode)

	- **@p** `MaxDistance` is a double.
	- **@p** `FluidCollisionMode` is a string naming a [FluidCollisionMode](FluidCollisionMode.aus.md).
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **rayTraceEntities** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#rayTraceEntities(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **rayTraceEntities** (`MaxDistance, IgnoreBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#rayTraceEntities(int,boolean)

	- **@p** `MaxDistance` is an int.
	- **@p** `IgnoreBlocks` is a bool.
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **recalculatePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#recalculatePermissions()



- **registerAttribute** (`Attribute`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#registerAttribute(org.bukkit.attribute.Attribute)

	- **@p** `Attribute` is an [Attribute](Attribute.aus.md).


- **remove** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#remove()



- **removePassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#removePassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **removePotionEffect** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#removePotionEffect(org.bukkit.potion.PotionEffectType)

	- **@p** `Type` is a [PotionEffectType](PotionEffectType.aus.md).


- **removeResourcePacks** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#removeResourcePacks(java.lang.Iterable)

	- **@p** `A0` is an Iterable.


- **removeScoreboardTag** (`Tag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#removeScoreboardTag(java.lang.String)

	- **@p** `Tag` is a string.
	- **@r** `A` bool.


- **resetMaxHealth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#resetMaxHealth()



- **resetTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#resetTitle()



- **sendActionBar** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#sendActionBar(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendActionBar\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#sendActionBar(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage\_Component** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#sendMessage(net.kyori.adventure.text.Component)

	- **@p** `Message` is a Component.


- **sendMessage\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#sendMessage(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#sendMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendMessage** (`Sender, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#sendMessage(java.util.UUID,java.lang.String)

	- **@p** `Sender` is a string.
	- **@p** `Message` is a string.


- **sendPlainMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#sendPlainMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendPlayerListFooter** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#sendPlayerListFooter(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListFooter\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#sendPlayerListFooter(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeader** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#sendPlayerListHeader(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListHeader\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#sendPlayerListHeader(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeaderAndFooter** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.Component,net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.
	- **@p** `A1` is a Component.


- **sendPlayerListHeaderAndFooter\_ComponentLike\_ComponentLike** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.ComponentLike,net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.
	- **@p** `A1` is a ComponentLike.


- **sendRichMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#sendRichMessage(java.lang.String)

	- **@p** `Message` is a string.


- **setAI** (`Ai`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setAI(boolean)

	- **@p** `Ai` is a bool.


- **setAbsorptionAmount** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setAbsorptionAmount(double)

	- **@p** `Amount` is a double.


- **setActiveItemRemainingTime** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setActiveItemRemainingTime(int)

	- **@p** `Ticks` is an int.


- **setAggressive** (`Aggressive`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setAggressive(boolean)

	- **@p** `Aggressive` is a bool.


- **setArrowCooldown** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setArrowCooldown(int)

	- **@p** `Ticks` is an int.


- **setArrowsInBody** (`Count`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setArrowsInBody(int)

	- **@p** `Count` is an int.


- **setArrowsInBody** (`Count, FireEvent`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setArrowsInBody(int,boolean)

	- **@p** `Count` is an int.
	- **@p** `FireEvent` is a bool.


- **setArrowsStuck** (`Arrows`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setArrowsStuck(int)

	- **@p** `Arrows` is an int.


- **setAware** (`Aware`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setAware(boolean)

	- **@p** `Aware` is a bool.


- **setBeeStingerCooldown** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setBeeStingerCooldown(int)

	- **@p** `Ticks` is an int.


- **setBeeStingersInBody** (`Count`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setBeeStingersInBody(int)

	- **@p** `Count` is an int.


- **setBodyYaw** (`BodyYaw`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setBodyYaw(float)

	- **@p** `BodyYaw` is a double.


- **setCanPickupItems** (`Pickup`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setCanPickupItems(boolean)

	- **@p** `Pickup` is a bool.


- **setCollidable** (`Collidable`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setCollidable(boolean)

	- **@p** `Collidable` is a bool.


- **setCustomName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setCustomName(java.lang.String)

	- **@p** `Name` is a string.


- **setCustomNameVisible** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setCustomNameVisible(boolean)

	- **@p** `Flag` is a bool.


- **setFallDistance** (`Distance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setFallDistance(float)

	- **@p** `Distance` is a double.


- **setFireTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setFireTicks(int)

	- **@p** `Ticks` is an int.


- **setFreezeTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setFreezeTicks(int)

	- **@p** `Ticks` is an int.


- **setGliding** (`Gliding`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setGliding(boolean)

	- **@p** `Gliding` is a bool.


- **setGlowing** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setGlowing(boolean)

	- **@p** `Flag` is a bool.


- **setGravity** (`Gravity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setGravity(boolean)

	- **@p** `Gravity` is a bool.


- **setHealth** (`Health`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setHealth(double)

	- **@p** `Health` is a double.


- **setHurtDirection** (`HurtDirection`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setHurtDirection(float)

	- **@p** `HurtDirection` is a double.


- **setInvisible** (`Invisible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setInvisible(boolean)

	- **@p** `Invisible` is a bool.


- **setInvulnerable** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setInvulnerable(boolean)

	- **@p** `Flag` is a bool.


- **setItemInUseTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setItemInUseTicks(int)

	- **@p** `Ticks` is an int.


- **setJumping** (`Jumping`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setJumping(boolean)

	- **@p** `Jumping` is a bool.


- **setKiller** (`Killer`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setKiller(org.bukkit.entity.Player)

	- **@p** `Killer` is a [Player](Player.aus.md).


- **setLastDamage** (`Damage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setLastDamage(double)

	- **@p** `Damage` is a double.


- **setLastDamageCause** (`Event`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setLastDamageCause(org.bukkit.event.entity.EntityDamageEvent)

	- **@p** `Event` is an [EntityDamageEvent](EntityDamageEvent.aus.md).


- **setLeashHolder** (`Holder`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setLeashHolder(org.bukkit.entity.Entity)

	- **@p** `Holder` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **setLeftHanded** (`LeftHanded`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setLeftHanded(boolean)

	- **@p** `LeftHanded` is a bool.


- **setLootTable** (`Table`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setLootTable(org.bukkit.loot.LootTable)

	- **@p** `Table` is a [LootTable](LootTable.aus.md).


- **setLootTable** (`Table, Seed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setLootTable(org.bukkit.loot.LootTable,long)

	- **@p** `Table` is a [LootTable](LootTable.aus.md).
	- **@p** `Seed` is an int.


- **setMaxHealth** (`Health`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setMaxHealth(double)

	- **@p** `Health` is a double.


- **setMaximumAir** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setMaximumAir(int)

	- **@p** `Ticks` is an int.


- **setMaximumNoDamageTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setMaximumNoDamageTicks(int)

	- **@p** `Ticks` is an int.


- **setMemory** (`MemoryKey, MemoryValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setMemory(org.bukkit.entity.memory.MemoryKey,java.lang.Object)

	- **@p** `MemoryKey` is a [MemoryKey](MemoryKey.aus.md).
	- **@p** `MemoryValue` is an Object.


- **setMetadata** (`MetadataKey, NewMetadataValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setMetadata(java.lang.String,org.bukkit.metadata.MetadataValue)

	- **@p** `MetadataKey` is a string.
	- **@p** `NewMetadataValue` is a [MetadataValue](MetadataValue.aus.md).


- **setNextArrowRemoval** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setNextArrowRemoval(int)

	- **@p** `Ticks` is an int.


- **setNextBeeStingerRemoval** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setNextBeeStingerRemoval(int)

	- **@p** `Ticks` is an int.


- **setNoActionTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setNoActionTicks(int)

	- **@p** `Ticks` is an int.


- **setNoDamageTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setNoDamageTicks(int)

	- **@p** `Ticks` is an int.


- **setNoPhysics** (`NoPhysics`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setNoPhysics(boolean)

	- **@p** `NoPhysics` is a bool.


- **setPassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setPassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **setPersistent** (`Persistent`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setPersistent(boolean)

	- **@p** `Persistent` is a bool.


- **setPortalCooldown** (`Cooldown`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setPortalCooldown(int)

	- **@p** `Cooldown` is an int.


- **setPose** (`Pose`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setPose(org.bukkit.entity.Pose)

	- **@p** `Pose` is a string naming a [Pose](Pose.aus.md).


- **setPose** (`Pose, Fixed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setPose(org.bukkit.entity.Pose,boolean)

	- **@p** `Pose` is a string naming a [Pose](Pose.aus.md).
	- **@p** `Fixed` is a bool.


- **setRemainingAir** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setRemainingAir(int)

	- **@p** `Ticks` is an int.


- **setRemoveWhenFarAway** (`Remove`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setRemoveWhenFarAway(boolean)

	- **@p** `Remove` is a bool.


- **setRiptiding** (`Riptiding`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setRiptiding(boolean)

	- **@p** `Riptiding` is a bool.


- **setRotation\_Angle\_Angle** (`Yaw, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setRotation(io.papermc.paper.math.Angle,io.papermc.paper.math.Angle)

	- **@p** `Yaw` is an [Angle](Angle.aus.md).
	- **@p** `Pitch` is an [Angle](Angle.aus.md).


- **setRotation** (`Yaw, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setRotation(float,float)

	- **@p** `Yaw` is a double.
	- **@p** `Pitch` is a double.


- **setSeed** (`Seed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setSeed(long)

	- **@p** `Seed` is an int.


- **setShieldBlockingDelay** (`Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setShieldBlockingDelay(int)

	- **@p** `Delay` is an int.


- **setSilent** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setSilent(boolean)

	- **@p** `Flag` is a bool.


- **setSneaking** (`Sneak`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setSneaking(boolean)

	- **@p** `Sneak` is a bool.


- **setSwimming** (`Swimming`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setSwimming(boolean)

	- **@p** `Swimming` is a bool.


- **setTarget** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setTarget(org.bukkit.entity.LivingEntity)

	- **@p** `Target` is a [LivingEntity](LivingEntity.aus.md).


- **setTicksLived** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setTicksLived(int)

	- **@p** `Value` is an int.


- **setVelocity** (`Velocity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setVelocity(org.bukkit.util.Vector)

	- **@p** `Velocity` is a [Vector](Vector.aus.md).


- **setVisibleByDefault** (`Visible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setVisibleByDefault(boolean)

	- **@p** `Visible` is a bool.


- **setVisualFire** (`Fire`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setVisualFire(boolean)

	- **@p** `Fire` is a bool.


- **setWaypointColor** (`Color`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setWaypointColor(org.bukkit.Color)

	- **@p** `Color` is a [Color](Color.aus.md).


- **shouldDespawnInPeaceful** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#shouldDespawnInPeaceful()

	- **@r** `A` bool.


- **spawnAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#spawnAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **spawnAt** (`Location, Reason`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#spawnAt(org.bukkit.Location,org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Reason` is a string naming a CreatureSpawnEvent.SpawnReason.
	- **@r** `A` bool.


- **spigot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#spigot()

	- **@r** `An` Entity.Spigot.


- **startUsingItem** (`Hand`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#startUsingItem(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Hand` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **swingHand** (`Hand`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#swingHand(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Hand` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **swingMainHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#swingMainHand()



- **swingOffHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#swingOffHand()



- **teamDisplayName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#teamDisplayName()

	- **@r** `A` Component.


- **teleport** (`Destination`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#teleport(org.bukkit.entity.Entity)

	- **@p** `Destination` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **teleport\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#teleport(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **teleport** (`Destination, Cause`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#teleport(org.bukkit.entity.Entity,org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)

	- **@p** `Destination` is an [Entity](Entity.aus.md).
	- **@p** `Cause` is a string naming a PlayerTeleportEvent.TeleportCause.
	- **@r** `A` bool.


- **teleport\_location\_cause** (`Location, Cause`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#teleport(org.bukkit.Location,org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Cause` is a string naming a PlayerTeleportEvent.TeleportCause.
	- **@r** `A` bool.


- **wouldCollideUsing** (`BoundingBox`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#wouldCollideUsing(org.bukkit.util.BoundingBox)

	- **@p** `BoundingBox` is a [BoundingBox](BoundingBox.aus.md).
	- **@r** `A` bool.


- **addAttachment** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#addAttachment(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#addAttachment(org.bukkit.plugin.Plugin,int)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Ticks` is an int.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Name, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#addAttachment(org.bukkit.plugin.Plugin,java.lang.String,boolean)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Name` is a string.
	- **@p** `Value` is a bool.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Name, Value, Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#addAttachment(org.bukkit.plugin.Plugin,java.lang.String,boolean,int)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Name` is a string.
	- **@p** `Value` is a bool.
	- **@p** `Ticks` is an int.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **getScheduler** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getScheduler()

	- **@r** `An` EntityScheduler.


- **getServer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#getServer()

	- **@r** `A` [Server](Server.aus.md).


- **removeAttachment** (`Attachment`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#removeAttachment(org.bukkit.permissions.PermissionAttachment)

	- **@p** `Attachment` is a [PermissionAttachment](PermissionAttachment.aus.md).


- **removeMetadata** (`MetadataKey, OwningPlugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#removeMetadata(java.lang.String,org.bukkit.plugin.Plugin)

	- **@p** `MetadataKey` is a string.
	- **@p** `OwningPlugin` is a [Plugin](Plugin.aus.md).


- **setOp** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/Spider.html#setOp(boolean)

	- **@p** `Value` is a bool.




