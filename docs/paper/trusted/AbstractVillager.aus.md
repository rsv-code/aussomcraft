# file: AbstractVillager.aus

## class: AbstractVillager

[21:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.AbstractVillagerShim) **extends: object** 

Generated shim for org.bukkit.entity.AbstractVillager.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html
In Paper this is a [Breedable](Breedable.aus.md),
[NPC](NPC.aus.md), [InventoryHolder](InventoryHolder.aus.md) and
[Merchant](Merchant.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addPassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#addPassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **addPotionEffect** (`Effect`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#addPotionEffect(org.bukkit.potion.PotionEffect)

	- **@p** `Effect` is a [PotionEffect](PotionEffect.aus.md).
	- **@r** `A` bool.


- **addPotionEffect** (`Effect, Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#addPotionEffect(org.bukkit.potion.PotionEffect,boolean)

	- **@p** `Effect` is a [PotionEffect](PotionEffect.aus.md).
	- **@p** `Force` is a bool.
	- **@r** `A` bool.


- **addPotionEffects** (`Effects`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#addPotionEffects(java.util.Collection)

	- **@p** `Effects` is a list.
	- **@r** `A` bool.


- **addScoreboardTag** (`Tag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#addScoreboardTag(java.lang.String)

	- **@p** `Tag` is a string.
	- **@r** `A` bool.


- **attack** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#attack(org.bukkit.entity.Entity)

	- **@p** `Target` is an [Entity](Entity.aus.md).


- **broadcastHurtAnimation** (`Players`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#broadcastHurtAnimation(java.util.Collection)

	- **@p** `Players` is a list.


- **broadcastSlotBreak** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#broadcastSlotBreak(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **broadcastSlotBreak** (`Slot, Players`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#broadcastSlotBreak(org.bukkit.inventory.EquipmentSlot,java.util.Collection)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).
	- **@p** `Players` is a list.


- **canBreatheUnderwater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#canBreatheUnderwater()

	- **@r** `A` bool.


- **canBreed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#canBreed()

	- **@r** `A` bool.


- **canUseEquipmentSlot** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#canUseEquipmentSlot(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).
	- **@r** `A` bool.


- **clearActiveItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#clearActiveItem()



- **clearActivePotionEffects** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#clearActivePotionEffects()

	- **@r** `A` bool.


- **clearLootTable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#clearLootTable()



- **clearResourcePacks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#clearResourcePacks()



- **clearTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#clearTitle()



- **closeDialog** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#closeDialog()



- **collidesAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#collidesAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **completeUsingActiveItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#completeUsingActiveItem()



- **copy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#copy()

	- **@r** `An` [Entity](Entity.aus.md).


- **copy** (`To`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#copy(org.bukkit.Location)

	- **@p** `To` is a [Location](Location.aus.md).
	- **@r** `An` [Entity](Entity.aus.md).


- **createSnapshot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#createSnapshot()

	- **@r** `An` [EntitySnapshot](EntitySnapshot.aus.md).


- **customName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#customName()

	- **@r** `A` Component.


- **customName** (`CustomName`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#customName(net.kyori.adventure.text.Component)

	- **@p** `CustomName` is a Component.


- **damage** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#damage(double)

	- **@p** `Amount` is a double.


- **damage** (`Amount, DamageSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#damage(double,org.bukkit.damage.DamageSource)

	- **@p** `Amount` is a double.
	- **@p** `DamageSource` is a [DamageSource](DamageSource.aus.md).


- **damage\_amount\_source** (`Amount, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#damage(double,org.bukkit.entity.Entity)

	- **@p** `Amount` is a double.
	- **@p** `Source` is an [Entity](Entity.aus.md).


- **damageItemStack** (`Slot, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#damageItemStack(org.bukkit.inventory.EquipmentSlot,int)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).
	- **@p** `Amount` is an int.


- **damageItemStack\_stack\_amount** (`Stack, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#damageItemStack(org.bukkit.inventory.ItemStack,int)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **eject** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#eject()

	- **@r** `A` bool.


- **fromMobSpawner** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#fromMobSpawner()

	- **@r** `A` bool.


- **getAbsorptionAmount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getAbsorptionAmount()

	- **@r** `A` double.


- **getActiveItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getActiveItem()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getActiveItemHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getActiveItemHand()

	- **@r** `An` string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **getActiveItemRemainingTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getActiveItemRemainingTime()

	- **@r** `An` int.


- **getActiveItemUsedTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getActiveItemUsedTime()

	- **@r** `An` int.


- **getActivePotionEffects** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getActivePotionEffects()

	- **@r** `A` list.


- **getAge** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getAge()

	- **@r** `An` int.


- **getAgeLock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getAgeLock()

	- **@r** `A` bool.


- **getAmbientSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getAmbientSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getArrowCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getArrowCooldown()

	- **@r** `An` int.


- **getArrowsInBody** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getArrowsInBody()

	- **@r** `An` int.


- **getArrowsStuck** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getArrowsStuck()

	- **@r** `An` int.


- **getAsString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getAsString()

	- **@r** `A` string.


- **getAttribute** (`Attribute`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getAttribute(org.bukkit.attribute.Attribute)

	- **@p** `Attribute` is an [Attribute](Attribute.aus.md).
	- **@r** `An` [AttributeInstance](AttributeInstance.aus.md).


- **getBeeStingerCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getBeeStingerCooldown()

	- **@r** `An` int.


- **getBeeStingersInBody** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getBeeStingersInBody()

	- **@r** `An` int.


- **getBodyYaw** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getBodyYaw()

	- **@r** `A` double.


- **getBoundingBox** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getBoundingBox()

	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **getCanPickupItems** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getCanPickupItems()

	- **@r** `A` bool.


- **getCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getCategory()

	- **@r** `An` string naming an [EntityCategory](EntityCategory.aus.md).


- **getChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getChunk()

	- **@r** `A` [Chunk](Chunk.aus.md).


- **getCollidableExemptions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getCollidableExemptions()

	- **@r** `A` list.


- **getCombatTracker** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getCombatTracker()

	- **@r** `A` [CombatTracker](CombatTracker.aus.md).


- **getCustomName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getCustomName()

	- **@r** `A` string.


- **getData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getData(io.papermc.paper.datacomponent.DataComponentType.Valued)

	- **@p** `Type` is a DataComponentType.Valued.
	- **@r** `An` Object.


- **getDataOrDefault** (`Type, Fallback`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getDataOrDefault(io.papermc.paper.datacomponent.DataComponentType.Valued,java.lang.Object)

	- **@p** `Type` is a DataComponentType.Valued.
	- **@p** `Fallback` is an Object.
	- **@r** `An` Object.


- **getDeathSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getDeathSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getDrinkingSound** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getDrinkingSound(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` [Sound](Sound.aus.md).


- **getEatingSound** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getEatingSound(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` [Sound](Sound.aus.md).


- **getEffectivePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getEffectivePermissions()

	- **@r** `A` list.


- **getEntityId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getEntityId()

	- **@r** `An` int.


- **getEntitySpawnReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getEntitySpawnReason()

	- **@r** `A` string naming a CreatureSpawnEvent.SpawnReason.


- **getEquipment** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getEquipment()

	- **@r** `An` [EntityEquipment](EntityEquipment.aus.md).


- **getEyeHeight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getEyeHeight()

	- **@r** `A` double.


- **getEyeHeight** (`IgnorePose`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getEyeHeight(boolean)

	- **@p** `IgnorePose` is a bool.
	- **@r** `A` double.


- **getEyeLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getEyeLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getFacing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getFacing()

	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getFallDamageSound** (`FallHeight`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getFallDamageSound(int)

	- **@p** `FallHeight` is an int.
	- **@r** `A` [Sound](Sound.aus.md).


- **getFallDamageSoundBig** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getFallDamageSoundBig()

	- **@r** `A` [Sound](Sound.aus.md).


- **getFallDamageSoundSmall** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getFallDamageSoundSmall()

	- **@r** `A` [Sound](Sound.aus.md).


- **getFallDistance** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getFallDistance()

	- **@r** `A` double.


- **getFireTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getFireTicks()

	- **@r** `An` int.


- **getForwardsMovement** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getForwardsMovement()

	- **@r** `A` double.


- **getFreezeTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getFreezeTicks()

	- **@r** `An` int.


- **getHandRaised** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getHandRaised()

	- **@r** `An` string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **getHandRaisedTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getHandRaisedTime()

	- **@r** `An` int.


- **getHeadRotationSpeed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getHeadRotationSpeed()

	- **@r** `An` int.


- **getHealth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getHealth()

	- **@r** `A` double.


- **getHeight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getHeight()

	- **@r** `A` double.


- **getHurtDirection** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getHurtDirection()

	- **@r** `A` double.


- **getHurtSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getHurtSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getHurtSound** (`DamageSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getHurtSound(org.bukkit.damage.DamageSource)

	- **@p** `DamageSource` is a [DamageSource](DamageSource.aus.md).
	- **@r** `A` [Sound](Sound.aus.md).


- **getInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getInventory()

	- **@r** `An` [Inventory](Inventory.aus.md).


- **getItemInUse** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getItemInUse()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getItemInUseTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getItemInUseTicks()

	- **@r** `An` int.


- **getItemUseRemainingTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getItemUseRemainingTime()

	- **@r** `An` int.


- **getKiller** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getKiller()

	- **@r** `A` [Player](Player.aus.md).


- **getLastDamage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getLastDamage()

	- **@r** `A` double.


- **getLastDamageCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getLastDamageCause()

	- **@r** `An` [EntityDamageEvent](EntityDamageEvent.aus.md).


- **getLastTwoTargetBlocks** (`Transparent, MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getLastTwoTargetBlocks(java.util.Set,int)

	- **@p** `Transparent` is a list.
	- **@p** `MaxDistance` is an int.
	- **@r** `A` list.


- **getLeashHolder** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getLeashHolder()

	- **@r** `An` [Entity](Entity.aus.md).


- **getLineOfSight** (`Transparent, MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getLineOfSight(java.util.Set,int)

	- **@p** `Transparent` is a list.
	- **@p** `MaxDistance` is an int.
	- **@r** `A` list.


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getLocation** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getLocation(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **getLootTable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getLootTable()

	- **@r** `A` [LootTable](LootTable.aus.md).


- **getMaxFireTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getMaxFireTicks()

	- **@r** `An` int.


- **getMaxFreezeTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getMaxFreezeTicks()

	- **@r** `An` int.


- **getMaxHeadPitch** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getMaxHeadPitch()

	- **@r** `An` int.


- **getMaxHealth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getMaxHealth()

	- **@r** `A` double.


- **getMaximumAir** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getMaximumAir()

	- **@r** `An` int.


- **getMaximumNoDamageTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getMaximumNoDamageTicks()

	- **@r** `An` int.


- **getMemory** (`MemoryKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getMemory(org.bukkit.entity.memory.MemoryKey)

	- **@p** `MemoryKey` is a [MemoryKey](MemoryKey.aus.md).
	- **@r** `An` Object.


- **getMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` list.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getName()

	- **@r** `A` string.


- **getNearbyEntities** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getNearbyEntities(double,double,double)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` list.


- **getNextArrowRemoval** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getNextArrowRemoval()

	- **@r** `An` int.


- **getNextBeeStingerRemoval** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getNextBeeStingerRemoval()

	- **@r** `An` int.


- **getNoActionTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getNoActionTicks()

	- **@r** `An` int.


- **getNoDamageTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getNoDamageTicks()

	- **@r** `An` int.


- **getOrigin** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getOrigin()

	- **@r** `A` [Location](Location.aus.md).


- **getPassenger** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getPassenger()

	- **@r** `An` [Entity](Entity.aus.md).


- **getPassengers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getPassengers()

	- **@r** `A` list.


- **getPathfinder** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getPathfinder()

	- **@r** `A` [Pathfinder](Pathfinder.aus.md).


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getPickItemStack** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getPickItemStack()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getPistonMoveReaction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getPistonMoveReaction()

	- **@r** `A` string naming a [PistonMoveReaction](PistonMoveReaction.aus.md).


- **getPitch** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getPitch()

	- **@r** `A` double.


- **getPortalCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getPortalCooldown()

	- **@r** `An` int.


- **getPose** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getPose()

	- **@r** `A` string naming a [Pose](Pose.aus.md).


- **getPossibleExperienceReward** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getPossibleExperienceReward()

	- **@r** `An` int.


- **getPotionEffect** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getPotionEffect(org.bukkit.potion.PotionEffectType)

	- **@p** `Type` is a [PotionEffectType](PotionEffectType.aus.md).
	- **@r** `A` [PotionEffect](PotionEffect.aus.md).


- **getRecipe** (`I`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getRecipe(int)

	- **@p** `I` is an int.
	- **@r** `A` [MerchantRecipe](MerchantRecipe.aus.md).


- **getRecipeCount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getRecipeCount()

	- **@r** `An` int.


- **getRecipes** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getRecipes()

	- **@r** `A` list.


- **getRemainingAir** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getRemainingAir()

	- **@r** `An` int.


- **getRemovalReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getRemovalReason()

	- **@r** `A` string naming a [RemovalReason](RemovalReason.aus.md).


- **getRemoveEventCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getRemoveEventCause()

	- **@r** `A` string naming an EntityRemoveEvent.Cause.


- **getRemoveWhenFarAway** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getRemoveWhenFarAway()

	- **@r** `A` bool.


- **getScoreboardEntryName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getScoreboardEntryName()

	- **@r** `A` string.


- **getScoreboardTags** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getScoreboardTags()

	- **@r** `A` list.


- **getSeed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getSeed()

	- **@r** `An` int.


- **getShieldBlockingDelay** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getShieldBlockingDelay()

	- **@r** `An` int.


- **getSidewaysMovement** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getSidewaysMovement()

	- **@r** `A` double.


- **getSoundCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getSoundCategory()

	- **@r** `A` string naming a [SoundCategory](SoundCategory.aus.md).


- **getSoundPitch** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getSoundPitch()

	- **@r** `A` double.


- **getSoundVolume** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getSoundVolume()

	- **@r** `A` double.


- **getSpawnCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getSpawnCategory()

	- **@r** `A` string naming a [SpawnCategory](SpawnCategory.aus.md).


- **getSwimHighSpeedSplashSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getSwimHighSpeedSplashSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getSwimSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getSwimSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getSwimSplashSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getSwimSplashSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getTarget** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTarget()

	- **@r** `A` [LivingEntity](LivingEntity.aus.md).


- **getTargetBlock** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTargetBlock(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlock** (`Transparent, MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTargetBlock(java.util.Set,int)

	- **@p** `Transparent` is a list.
	- **@p** `MaxDistance` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlock\_maxdistance\_fluidmode** (`MaxDistance, FluidMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTargetBlock(int,com.destroystokyo.paper.block.TargetBlockInfo.FluidMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidMode` is a string naming a TargetBlockInfo.FluidMode.
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlockExact** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTargetBlockExact(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlockExact** (`MaxDistance, FluidCollisionMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTargetBlockExact(int,org.bukkit.FluidCollisionMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidCollisionMode` is a string naming a [FluidCollisionMode](FluidCollisionMode.aus.md).
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlockFace** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTargetBlockFace(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getTargetBlockFace** (`MaxDistance, FluidMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTargetBlockFace(int,org.bukkit.FluidCollisionMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidMode` is a string naming a [FluidCollisionMode](FluidCollisionMode.aus.md).
	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getTargetBlockFace\_int\_FluidMode** (`MaxDistance, FluidMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTargetBlockFace(int,com.destroystokyo.paper.block.TargetBlockInfo.FluidMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidMode` is a string naming a TargetBlockInfo.FluidMode.
	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getTargetBlockInfo** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTargetBlockInfo(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [TargetBlockInfo](TargetBlockInfo.aus.md).


- **getTargetBlockInfo** (`MaxDistance, FluidMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTargetBlockInfo(int,com.destroystokyo.paper.block.TargetBlockInfo.FluidMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidMode` is a string naming a TargetBlockInfo.FluidMode.
	- **@r** `A` [TargetBlockInfo](TargetBlockInfo.aus.md).


- **getTargetEntity** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTargetEntity(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `An` [Entity](Entity.aus.md).


- **getTargetEntity** (`MaxDistance, IgnoreBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTargetEntity(int,boolean)

	- **@p** `MaxDistance` is an int.
	- **@p** `IgnoreBlocks` is a bool.
	- **@r** `An` [Entity](Entity.aus.md).


- **getTargetEntityInfo** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTargetEntityInfo(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [TargetEntityInfo](TargetEntityInfo.aus.md).


- **getTargetEntityInfo** (`MaxDistance, IgnoreBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTargetEntityInfo(int,boolean)

	- **@p** `MaxDistance` is an int.
	- **@p** `IgnoreBlocks` is a bool.
	- **@r** `A` [TargetEntityInfo](TargetEntityInfo.aus.md).


- **getTicksLived** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTicksLived()

	- **@r** `An` int.


- **getTrackedBy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTrackedBy()

	- **@r** `A` list.


- **getTrackedPlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTrackedPlayers()

	- **@r** `A` list.


- **getTrader** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getTrader()

	- **@r** `A` [HumanEntity](HumanEntity.aus.md).


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getUniqueId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getUniqueId()

	- **@r** `A` string.


- **getUpwardsMovement** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getUpwardsMovement()

	- **@r** `A` double.


- **getVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getVehicle()

	- **@r** `An` [Entity](Entity.aus.md).


- **getVelocity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getVelocity()

	- **@r** `A` [Vector](Vector.aus.md).


- **getWaypointColor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getWaypointColor()

	- **@r** `A` [Color](Color.aus.md).


- **getWidth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getWidth()

	- **@r** `A` double.


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **getX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getX()

	- **@r** `A` double.


- **getY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getY()

	- **@r** `A` double.


- **getYaw** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getYaw()

	- **@r** `A` double.


- **getZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#getZ()

	- **@r** `A` double.


- **hasAI** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#hasAI()

	- **@r** `A` bool.


- **hasActiveItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#hasActiveItem()

	- **@r** `A` bool.


- **hasData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#hasData(io.papermc.paper.datacomponent.DataComponentType)

	- **@p** `Type` is a [DataComponentType](DataComponentType.aus.md).
	- **@r** `A` bool.


- **hasFixedPose** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#hasFixedPose()

	- **@r** `A` bool.


- **hasGravity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#hasGravity()

	- **@r** `A` bool.


- **hasLineOfSight** (`Other`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#hasLineOfSight(org.bukkit.entity.Entity)

	- **@p** `Other` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **hasLineOfSight\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#hasLineOfSight(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **hasLootTable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#hasLootTable()

	- **@r** `A` bool.


- **hasMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#hasMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` bool.


- **hasNoPhysics** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#hasNoPhysics()

	- **@r** `A` bool.


- **hasPermission** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#hasPermission(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **hasPotionEffect** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#hasPotionEffect(org.bukkit.potion.PotionEffectType)

	- **@p** `Type` is a [PotionEffectType](PotionEffectType.aus.md).
	- **@r** `A` bool.


- **heal** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#heal(double)

	- **@p** `Amount` is a double.


- **heal** (`Amount, Reason`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#heal(double,org.bukkit.event.entity.EntityRegainHealthEvent.RegainReason)

	- **@p** `Amount` is a double.
	- **@p** `Reason` is a string naming an EntityRegainHealthEvent.RegainReason.


- **isAdult** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isAdult()

	- **@r** `A` bool.


- **isAggressive** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isAggressive()

	- **@r** `A` bool.


- **isAware** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isAware()

	- **@r** `A` bool.


- **isClimbing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isClimbing()

	- **@r** `A` bool.


- **isCollidable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isCollidable()

	- **@r** `A` bool.


- **isCustomNameVisible** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isCustomNameVisible()

	- **@r** `A` bool.


- **isDead** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isDead()

	- **@r** `A` bool.


- **isEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isEmpty()

	- **@r** `A` bool.


- **isFreezeTickingLocked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isFreezeTickingLocked()

	- **@r** `A` bool.


- **isFrozen** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isFrozen()

	- **@r** `A` bool.


- **isGliding** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isGliding()

	- **@r** `A` bool.


- **isGlowing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isGlowing()

	- **@r** `A` bool.


- **isHandRaised** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isHandRaised()

	- **@r** `A` bool.


- **isInBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isInBubbleColumn()

	- **@r** `A` bool.


- **isInDaylight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isInDaylight()

	- **@r** `A` bool.


- **isInLava** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isInLava()

	- **@r** `A` bool.


- **isInPowderedSnow** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isInPowderedSnow()

	- **@r** `A` bool.


- **isInRain** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isInRain()

	- **@r** `A` bool.


- **isInWater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isInWater()

	- **@r** `A` bool.


- **isInWaterOrBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isInWaterOrBubbleColumn()

	- **@r** `A` bool.


- **isInWaterOrRain** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isInWaterOrRain()

	- **@r** `A` bool.


- **isInWaterOrRainOrBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isInWaterOrRainOrBubbleColumn()

	- **@r** `A` bool.


- **isInWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isInWorld()

	- **@r** `A` bool.


- **isInsideVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isInsideVehicle()

	- **@r** `A` bool.


- **isInvisible** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isInvisible()

	- **@r** `A` bool.


- **isInvulnerable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isInvulnerable()

	- **@r** `A` bool.


- **isJumping** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isJumping()

	- **@r** `A` bool.


- **isLeashed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isLeashed()

	- **@r** `A` bool.


- **isLeftHanded** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isLeftHanded()

	- **@r** `A` bool.


- **isOnGround** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isOnGround()

	- **@r** `A` bool.


- **isOp** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isOp()

	- **@r** `A` bool.


- **isPermissionSet** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isPermissionSet(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **isPersistent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isPersistent()

	- **@r** `A` bool.


- **isRiptiding** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isRiptiding()

	- **@r** `A` bool.


- **isSilent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isSilent()

	- **@r** `A` bool.


- **isSleeping** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isSleeping()

	- **@r** `A` bool.


- **isSneaking** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isSneaking()

	- **@r** `A` bool.


- **isSwimming** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isSwimming()

	- **@r** `A` bool.


- **isTicking** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isTicking()

	- **@r** `A` bool.


- **isTrackedBy** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isTrackedBy(org.bukkit.entity.Player)

	- **@p** `Player` is a [Player](Player.aus.md).
	- **@r** `A` bool.


- **isTrading** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isTrading()

	- **@r** `A` bool.


- **isUnderWater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isUnderWater()

	- **@r** `A` bool.


- **isValid** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isValid()

	- **@r** `A` bool.


- **isVisibleByDefault** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isVisibleByDefault()

	- **@r** `A` bool.


- **isVisualFire** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#isVisualFire()

	- **@r** `A` bool.


- **kill** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#kill()



- **kill** (`DamageSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#kill(org.bukkit.damage.DamageSource)

	- **@p** `DamageSource` is a [DamageSource](DamageSource.aus.md).


- **knockback** (`Strength, DirectionX, DirectionZ`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#knockback(double,double,double)

	- **@p** `Strength` is a double.
	- **@p** `DirectionX` is a double.
	- **@p** `DirectionZ` is a double.


- **leaveVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#leaveVehicle()

	- **@r** `A` bool.


- **lockFreezeTicks** (`Locked`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#lockFreezeTicks(boolean)

	- **@p** `Locked` is a bool.


- **lookAt** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#lookAt(org.bukkit.entity.Entity)

	- **@p** `Entity` is an [Entity](Entity.aus.md).


- **lookAt\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#lookAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).


- **lookAt** (`Position, EntityAnchor`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#lookAt(io.papermc.paper.math.Position,io.papermc.paper.entity.LookAnchor)

	- **@p** `Position` is a [Position](Position.aus.md).
	- **@p** `EntityAnchor` is a string naming a [LookAnchor](LookAnchor.aus.md).


- **lookAt\_entity\_headrotationspeed\_maxheadpitch** (`Entity, HeadRotationSpeed, MaxHeadPitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#lookAt(org.bukkit.entity.Entity,float,float)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@p** `HeadRotationSpeed` is a double.
	- **@p** `MaxHeadPitch` is a double.


- **lookAt\_location\_headrotationspeed\_maxheadpitch** (`Location, HeadRotationSpeed, MaxHeadPitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#lookAt(org.bukkit.Location,float,float)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `HeadRotationSpeed` is a double.
	- **@p** `MaxHeadPitch` is a double.


- **lookAt** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#lookAt(double,double,double)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.


- **lookAt** (`X, Y, Z, EntityAnchor`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#lookAt(double,double,double,io.papermc.paper.entity.LookAnchor)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `EntityAnchor` is a string naming a [LookAnchor](LookAnchor.aus.md).


- **lookAt** (`X, Y, Z, HeadRotationSpeed, MaxHeadPitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#lookAt(double,double,double,float,float)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `HeadRotationSpeed` is a double.
	- **@p** `MaxHeadPitch` is a double.


- **name** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#name()

	- **@r** `A` Component.


- **playEffect** (`Effect`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#playEffect(org.bukkit.EntityEffect)

	- **@p** `Effect` is an string naming an [EntityEffect](EntityEffect.aus.md).


- **playHurtAnimation** (`Yaw`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#playHurtAnimation(float)

	- **@p** `Yaw` is a double.


- **playPickupItemAnimation** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#playPickupItemAnimation(org.bukkit.entity.Item)

	- **@p** `Item` is an [Item](Item.aus.md).


- **playPickupItemAnimation** (`Item, Quantity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#playPickupItemAnimation(org.bukkit.entity.Item,int)

	- **@p** `Item` is an [Item](Item.aus.md).
	- **@p** `Quantity` is an int.


- **rayTraceBlocks** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#rayTraceBlocks(double)

	- **@p** `MaxDistance` is a double.
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **rayTraceBlocks** (`MaxDistance, FluidCollisionMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#rayTraceBlocks(double,org.bukkit.FluidCollisionMode)

	- **@p** `MaxDistance` is a double.
	- **@p** `FluidCollisionMode` is a string naming a [FluidCollisionMode](FluidCollisionMode.aus.md).
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **rayTraceEntities** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#rayTraceEntities(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **rayTraceEntities** (`MaxDistance, IgnoreBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#rayTraceEntities(int,boolean)

	- **@p** `MaxDistance` is an int.
	- **@p** `IgnoreBlocks` is a bool.
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **recalculatePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#recalculatePermissions()



- **registerAttribute** (`Attribute`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#registerAttribute(org.bukkit.attribute.Attribute)

	- **@p** `Attribute` is an [Attribute](Attribute.aus.md).


- **remove** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#remove()



- **removePassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#removePassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **removePotionEffect** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#removePotionEffect(org.bukkit.potion.PotionEffectType)

	- **@p** `Type` is a [PotionEffectType](PotionEffectType.aus.md).


- **removeResourcePacks** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#removeResourcePacks(java.lang.Iterable)

	- **@p** `A0` is an Iterable.


- **removeScoreboardTag** (`Tag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#removeScoreboardTag(java.lang.String)

	- **@p** `Tag` is a string.
	- **@r** `A` bool.


- **resetMaxHealth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#resetMaxHealth()



- **resetOffers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#resetOffers()



- **resetTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#resetTitle()



- **sendActionBar** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#sendActionBar(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendActionBar\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#sendActionBar(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage\_Component** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#sendMessage(net.kyori.adventure.text.Component)

	- **@p** `Message` is a Component.


- **sendMessage\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#sendMessage(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#sendMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendMessage** (`Sender, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#sendMessage(java.util.UUID,java.lang.String)

	- **@p** `Sender` is a string.
	- **@p** `Message` is a string.


- **sendPlainMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#sendPlainMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendPlayerListFooter** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#sendPlayerListFooter(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListFooter\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#sendPlayerListFooter(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeader** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#sendPlayerListHeader(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListHeader\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#sendPlayerListHeader(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeaderAndFooter** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.Component,net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.
	- **@p** `A1` is a Component.


- **sendPlayerListHeaderAndFooter\_ComponentLike\_ComponentLike** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.ComponentLike,net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.
	- **@p** `A1` is a ComponentLike.


- **sendRichMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#sendRichMessage(java.lang.String)

	- **@p** `Message` is a string.


- **setAI** (`Ai`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setAI(boolean)

	- **@p** `Ai` is a bool.


- **setAbsorptionAmount** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setAbsorptionAmount(double)

	- **@p** `Amount` is a double.


- **setActiveItemRemainingTime** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setActiveItemRemainingTime(int)

	- **@p** `Ticks` is an int.


- **setAdult** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setAdult()



- **setAge** (`Age`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setAge(int)

	- **@p** `Age` is an int.


- **setAgeLock** (`Lock`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setAgeLock(boolean)

	- **@p** `Lock` is a bool.


- **setAggressive** (`Aggressive`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setAggressive(boolean)

	- **@p** `Aggressive` is a bool.


- **setArrowCooldown** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setArrowCooldown(int)

	- **@p** `Ticks` is an int.


- **setArrowsInBody** (`Count`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setArrowsInBody(int)

	- **@p** `Count` is an int.


- **setArrowsInBody** (`Count, FireEvent`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setArrowsInBody(int,boolean)

	- **@p** `Count` is an int.
	- **@p** `FireEvent` is a bool.


- **setArrowsStuck** (`Arrows`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setArrowsStuck(int)

	- **@p** `Arrows` is an int.


- **setAware** (`Aware`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setAware(boolean)

	- **@p** `Aware` is a bool.


- **setBaby** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setBaby()



- **setBeeStingerCooldown** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setBeeStingerCooldown(int)

	- **@p** `Ticks` is an int.


- **setBeeStingersInBody** (`Count`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setBeeStingersInBody(int)

	- **@p** `Count` is an int.


- **setBodyYaw** (`BodyYaw`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setBodyYaw(float)

	- **@p** `BodyYaw` is a double.


- **setBreed** (`Breed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setBreed(boolean)

	- **@p** `Breed` is a bool.


- **setCanPickupItems** (`Pickup`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setCanPickupItems(boolean)

	- **@p** `Pickup` is a bool.


- **setCollidable** (`Collidable`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setCollidable(boolean)

	- **@p** `Collidable` is a bool.


- **setCustomName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setCustomName(java.lang.String)

	- **@p** `Name` is a string.


- **setCustomNameVisible** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setCustomNameVisible(boolean)

	- **@p** `Flag` is a bool.


- **setFallDistance** (`Distance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setFallDistance(float)

	- **@p** `Distance` is a double.


- **setFireTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setFireTicks(int)

	- **@p** `Ticks` is an int.


- **setFreezeTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setFreezeTicks(int)

	- **@p** `Ticks` is an int.


- **setGliding** (`Gliding`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setGliding(boolean)

	- **@p** `Gliding` is a bool.


- **setGlowing** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setGlowing(boolean)

	- **@p** `Flag` is a bool.


- **setGravity** (`Gravity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setGravity(boolean)

	- **@p** `Gravity` is a bool.


- **setHealth** (`Health`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setHealth(double)

	- **@p** `Health` is a double.


- **setHurtDirection** (`HurtDirection`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setHurtDirection(float)

	- **@p** `HurtDirection` is a double.


- **setInvisible** (`Invisible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setInvisible(boolean)

	- **@p** `Invisible` is a bool.


- **setInvulnerable** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setInvulnerable(boolean)

	- **@p** `Flag` is a bool.


- **setItemInUseTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setItemInUseTicks(int)

	- **@p** `Ticks` is an int.


- **setJumping** (`Jumping`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setJumping(boolean)

	- **@p** `Jumping` is a bool.


- **setKiller** (`Killer`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setKiller(org.bukkit.entity.Player)

	- **@p** `Killer` is a [Player](Player.aus.md).


- **setLastDamage** (`Damage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setLastDamage(double)

	- **@p** `Damage` is a double.


- **setLastDamageCause** (`Event`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setLastDamageCause(org.bukkit.event.entity.EntityDamageEvent)

	- **@p** `Event` is an [EntityDamageEvent](EntityDamageEvent.aus.md).


- **setLeashHolder** (`Holder`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setLeashHolder(org.bukkit.entity.Entity)

	- **@p** `Holder` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **setLeftHanded** (`LeftHanded`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setLeftHanded(boolean)

	- **@p** `LeftHanded` is a bool.


- **setLootTable** (`Table`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setLootTable(org.bukkit.loot.LootTable)

	- **@p** `Table` is a [LootTable](LootTable.aus.md).


- **setLootTable** (`Table, Seed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setLootTable(org.bukkit.loot.LootTable,long)

	- **@p** `Table` is a [LootTable](LootTable.aus.md).
	- **@p** `Seed` is an int.


- **setMaxHealth** (`Health`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setMaxHealth(double)

	- **@p** `Health` is a double.


- **setMaximumAir** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setMaximumAir(int)

	- **@p** `Ticks` is an int.


- **setMaximumNoDamageTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setMaximumNoDamageTicks(int)

	- **@p** `Ticks` is an int.


- **setMemory** (`MemoryKey, MemoryValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setMemory(org.bukkit.entity.memory.MemoryKey,java.lang.Object)

	- **@p** `MemoryKey` is a [MemoryKey](MemoryKey.aus.md).
	- **@p** `MemoryValue` is an Object.


- **setMetadata** (`MetadataKey, NewMetadataValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setMetadata(java.lang.String,org.bukkit.metadata.MetadataValue)

	- **@p** `MetadataKey` is a string.
	- **@p** `NewMetadataValue` is a [MetadataValue](MetadataValue.aus.md).


- **setNextArrowRemoval** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setNextArrowRemoval(int)

	- **@p** `Ticks` is an int.


- **setNextBeeStingerRemoval** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setNextBeeStingerRemoval(int)

	- **@p** `Ticks` is an int.


- **setNoActionTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setNoActionTicks(int)

	- **@p** `Ticks` is an int.


- **setNoDamageTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setNoDamageTicks(int)

	- **@p** `Ticks` is an int.


- **setNoPhysics** (`NoPhysics`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setNoPhysics(boolean)

	- **@p** `NoPhysics` is a bool.


- **setPassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setPassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **setPersistent** (`Persistent`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setPersistent(boolean)

	- **@p** `Persistent` is a bool.


- **setPortalCooldown** (`Cooldown`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setPortalCooldown(int)

	- **@p** `Cooldown` is an int.


- **setPose** (`Pose`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setPose(org.bukkit.entity.Pose)

	- **@p** `Pose` is a string naming a [Pose](Pose.aus.md).


- **setPose** (`Pose, Fixed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setPose(org.bukkit.entity.Pose,boolean)

	- **@p** `Pose` is a string naming a [Pose](Pose.aus.md).
	- **@p** `Fixed` is a bool.


- **setRecipe** (`I, Recipe`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setRecipe(int,org.bukkit.inventory.MerchantRecipe)

	- **@p** `I` is an int.
	- **@p** `Recipe` is a [MerchantRecipe](MerchantRecipe.aus.md).


- **setRecipes** (`Recipes`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setRecipes(java.util.List)

	- **@p** `Recipes` is a list.


- **setRemainingAir** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setRemainingAir(int)

	- **@p** `Ticks` is an int.


- **setRemoveWhenFarAway** (`Remove`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setRemoveWhenFarAway(boolean)

	- **@p** `Remove` is a bool.


- **setRiptiding** (`Riptiding`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setRiptiding(boolean)

	- **@p** `Riptiding` is a bool.


- **setRotation\_Angle\_Angle** (`Yaw, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setRotation(io.papermc.paper.math.Angle,io.papermc.paper.math.Angle)

	- **@p** `Yaw` is an [Angle](Angle.aus.md).
	- **@p** `Pitch` is an [Angle](Angle.aus.md).


- **setRotation** (`Yaw, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setRotation(float,float)

	- **@p** `Yaw` is a double.
	- **@p** `Pitch` is a double.


- **setSeed** (`Seed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setSeed(long)

	- **@p** `Seed` is an int.


- **setShieldBlockingDelay** (`Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setShieldBlockingDelay(int)

	- **@p** `Delay` is an int.


- **setSilent** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setSilent(boolean)

	- **@p** `Flag` is a bool.


- **setSneaking** (`Sneak`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setSneaking(boolean)

	- **@p** `Sneak` is a bool.


- **setSwimming** (`Swimming`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setSwimming(boolean)

	- **@p** `Swimming` is a bool.


- **setTarget** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setTarget(org.bukkit.entity.LivingEntity)

	- **@p** `Target` is a [LivingEntity](LivingEntity.aus.md).


- **setTicksLived** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setTicksLived(int)

	- **@p** `Value` is an int.


- **setVelocity** (`Velocity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setVelocity(org.bukkit.util.Vector)

	- **@p** `Velocity` is a [Vector](Vector.aus.md).


- **setVisibleByDefault** (`Visible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setVisibleByDefault(boolean)

	- **@p** `Visible` is a bool.


- **setVisualFire** (`Fire`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setVisualFire(boolean)

	- **@p** `Fire` is a bool.


- **setWaypointColor** (`Color`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#setWaypointColor(org.bukkit.Color)

	- **@p** `Color` is a [Color](Color.aus.md).


- **shouldDespawnInPeaceful** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#shouldDespawnInPeaceful()

	- **@r** `A` bool.


- **spawnAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#spawnAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **spawnAt** (`Location, Reason`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#spawnAt(org.bukkit.Location,org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Reason` is a string naming a CreatureSpawnEvent.SpawnReason.
	- **@r** `A` bool.


- **spigot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#spigot()

	- **@r** `An` Entity.Spigot.


- **startUsingItem** (`Hand`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#startUsingItem(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Hand` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **swingHand** (`Hand`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#swingHand(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Hand` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **swingMainHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#swingMainHand()



- **swingOffHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#swingOffHand()



- **teamDisplayName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#teamDisplayName()

	- **@r** `A` Component.


- **teleport** (`Destination`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#teleport(org.bukkit.entity.Entity)

	- **@p** `Destination` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **teleport\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#teleport(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **teleport** (`Destination, Cause`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#teleport(org.bukkit.entity.Entity,org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)

	- **@p** `Destination` is an [Entity](Entity.aus.md).
	- **@p** `Cause` is a string naming a PlayerTeleportEvent.TeleportCause.
	- **@r** `A` bool.


- **teleport\_location\_cause** (`Location, Cause`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#teleport(org.bukkit.Location,org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Cause` is a string naming a PlayerTeleportEvent.TeleportCause.
	- **@r** `A` bool.


- **wouldCollideUsing** (`BoundingBox`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/AbstractVillager.html#wouldCollideUsing(org.bukkit.util.BoundingBox)

	- **@p** `BoundingBox` is a [BoundingBox](BoundingBox.aus.md).
	- **@r** `A` bool.




