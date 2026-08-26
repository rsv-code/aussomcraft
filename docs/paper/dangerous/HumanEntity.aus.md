# file: HumanEntity.aus

## class: HumanEntity

[21:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.HumanEntityShim) **extends: object** 

Generated shim for org.bukkit.entity.HumanEntity.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html
In Paper this is a [LivingEntity](LivingEntity.aus.md),
[AnimalTamer](AnimalTamer.aus.md) and
[InventoryHolder](InventoryHolder.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getFoodLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getFoodLevel()

	- **@r** `An` int.


- **getGameMode** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getGameMode()

	- **@r** `A` string naming a [GameMode](GameMode.aus.md).


- **getHealth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getHealth()

	- **@r** `A` double.


- **getInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getInventory()

	- **@r** `A` [PlayerInventory](PlayerInventory.aus.md).


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getName()

	- **@r** `A` string.


- **getPitch** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getPitch()

	- **@r** `A` double.


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getUniqueId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getUniqueId()

	- **@r** `A` string.


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **getX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getX()

	- **@r** `A` double.


- **getY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getY()

	- **@r** `A` double.


- **getYaw** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getYaw()

	- **@r** `A` double.


- **getZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getZ()

	- **@r** `A` double.


- **isDead** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isDead()

	- **@r** `A` bool.


- **isEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isEmpty()

	- **@r** `A` bool.


- **isSneaking** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isSneaking()

	- **@r** `A` bool.


- **sendActionBar** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#sendActionBar(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendActionBar\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#sendActionBar(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage\_Component** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#sendMessage(net.kyori.adventure.text.Component)

	- **@p** `Message` is a Component.


- **sendMessage\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#sendMessage(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#sendMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendMessage** (`Sender, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#sendMessage(java.util.UUID,java.lang.String)

	- **@p** `Sender` is a string.
	- **@p** `Message` is a string.


- **sendPlainMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#sendPlainMessage(java.lang.String)

	- **@p** `Message` is a string.


- **addPassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#addPassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **addPotionEffect** (`Effect`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#addPotionEffect(org.bukkit.potion.PotionEffect)

	- **@p** `Effect` is a [PotionEffect](PotionEffect.aus.md).
	- **@r** `A` bool.


- **addPotionEffect** (`Effect, Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#addPotionEffect(org.bukkit.potion.PotionEffect,boolean)

	- **@p** `Effect` is a [PotionEffect](PotionEffect.aus.md).
	- **@p** `Force` is a bool.
	- **@r** `A` bool.


- **addPotionEffects** (`Effects`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#addPotionEffects(java.util.Collection)

	- **@p** `Effects` is a list.
	- **@r** `A` bool.


- **addScoreboardTag** (`Tag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#addScoreboardTag(java.lang.String)

	- **@p** `Tag` is a string.
	- **@r** `A` bool.


- **attack** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#attack(org.bukkit.entity.Entity)

	- **@p** `Target` is an [Entity](Entity.aus.md).


- **broadcastHurtAnimation** (`Players`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#broadcastHurtAnimation(java.util.Collection)

	- **@p** `Players` is a list.


- **broadcastSlotBreak** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#broadcastSlotBreak(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **broadcastSlotBreak** (`Slot, Players`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#broadcastSlotBreak(org.bukkit.inventory.EquipmentSlot,java.util.Collection)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).
	- **@p** `Players` is a list.


- **canBreatheUnderwater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#canBreatheUnderwater()

	- **@r** `A` bool.


- **canUseEquipmentSlot** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#canUseEquipmentSlot(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).
	- **@r** `A` bool.


- **clearActiveItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#clearActiveItem()



- **clearActivePotionEffects** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#clearActivePotionEffects()

	- **@r** `A` bool.


- **clearResourcePacks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#clearResourcePacks()



- **clearTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#clearTitle()



- **closeDialog** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#closeDialog()



- **closeInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#closeInventory()



- **closeInventory** (`Reason`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#closeInventory(org.bukkit.event.inventory.InventoryCloseEvent.Reason)

	- **@p** `Reason` is a string naming an InventoryCloseEvent.Reason.


- **collidesAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#collidesAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **completeUsingActiveItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#completeUsingActiveItem()



- **copy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#copy()

	- **@r** `An` [Entity](Entity.aus.md).


- **copy** (`To`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#copy(org.bukkit.Location)

	- **@p** `To` is a [Location](Location.aus.md).
	- **@r** `An` [Entity](Entity.aus.md).


- **createSnapshot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#createSnapshot()

	- **@r** `An` [EntitySnapshot](EntitySnapshot.aus.md).


- **customName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#customName()

	- **@r** `A` Component.


- **customName** (`CustomName`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#customName(net.kyori.adventure.text.Component)

	- **@p** `CustomName` is a Component.


- **damage** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#damage(double)

	- **@p** `Amount` is a double.


- **damage** (`Amount, DamageSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#damage(double,org.bukkit.damage.DamageSource)

	- **@p** `Amount` is a double.
	- **@p** `DamageSource` is a [DamageSource](DamageSource.aus.md).


- **damage\_amount\_source** (`Amount, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#damage(double,org.bukkit.entity.Entity)

	- **@p** `Amount` is a double.
	- **@p** `Source` is an [Entity](Entity.aus.md).


- **damageItemStack** (`Slot, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#damageItemStack(org.bukkit.inventory.EquipmentSlot,int)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).
	- **@p** `Amount` is an int.


- **damageItemStack\_stack\_amount** (`Stack, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#damageItemStack(org.bukkit.inventory.ItemStack,int)

	- **@p** `Stack` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **discoverRecipe** (`Recipe`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#discoverRecipe(org.bukkit.NamespacedKey)

	- **@p** `Recipe` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` bool.


- **discoverRecipes** (`Recipes`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#discoverRecipes(java.util.Collection)

	- **@p** `Recipes` is a list.
	- **@r** `An` int.


- **dropItem\_EquipmentSlot** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#dropItem(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).
	- **@r** `An` [Item](Item.aus.md).


- **dropItem\_ItemStack** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#dropItem(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `An` [Item](Item.aus.md).


- **dropItem** (`DropAll`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#dropItem(boolean)

	- **@p** `DropAll` is a bool.
	- **@r** `A` bool.


- **dropItem\_int** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#dropItem(int)

	- **@p** `Slot` is an int.
	- **@r** `An` [Item](Item.aus.md).


- **dropItem\_EquipmentSlot\_int** (`Slot, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#dropItem(org.bukkit.inventory.EquipmentSlot,int)

	- **@p** `Slot` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).
	- **@p** `Amount` is an int.
	- **@r** `An` [Item](Item.aus.md).


- **dropItem** (`Slot, Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#dropItem(int,int)

	- **@p** `Slot` is an int.
	- **@p** `Amount` is an int.
	- **@r** `An` [Item](Item.aus.md).


- **eject** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#eject()

	- **@r** `A` bool.


- **fireworkBoost** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#fireworkBoost()

	- **@r** `A` [Firework](Firework.aus.md).


- **fireworkBoost** (`BoosterItem`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#fireworkBoost(org.bukkit.inventory.ItemStack)

	- **@p** `BoosterItem` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` [Firework](Firework.aus.md).


- **fromMobSpawner** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#fromMobSpawner()

	- **@r** `A` bool.


- **getAbsorptionAmount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getAbsorptionAmount()

	- **@r** `A` double.


- **getActiveItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getActiveItem()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getActiveItemHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getActiveItemHand()

	- **@r** `An` string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **getActiveItemRemainingTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getActiveItemRemainingTime()

	- **@r** `An` int.


- **getActiveItemUsedTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getActiveItemUsedTime()

	- **@r** `An` int.


- **getActivePotionEffects** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getActivePotionEffects()

	- **@r** `A` list.


- **getArrowCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getArrowCooldown()

	- **@r** `An` int.


- **getArrowsInBody** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getArrowsInBody()

	- **@r** `An` int.


- **getArrowsStuck** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getArrowsStuck()

	- **@r** `An` int.


- **getAsString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getAsString()

	- **@r** `A` string.


- **getAttackCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getAttackCooldown()

	- **@r** `A` double.


- **getAttribute** (`Attribute`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getAttribute(org.bukkit.attribute.Attribute)

	- **@p** `Attribute` is an [Attribute](Attribute.aus.md).
	- **@r** `An` [AttributeInstance](AttributeInstance.aus.md).


- **getBedLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getBedLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getBeeStingerCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getBeeStingerCooldown()

	- **@r** `An` int.


- **getBeeStingersInBody** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getBeeStingersInBody()

	- **@r** `An` int.


- **getBodyYaw** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getBodyYaw()

	- **@r** `A` double.


- **getBoundingBox** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getBoundingBox()

	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **getCanPickupItems** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getCanPickupItems()

	- **@r** `A` bool.


- **getCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getCategory()

	- **@r** `An` string naming an [EntityCategory](EntityCategory.aus.md).


- **getChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getChunk()

	- **@r** `A` [Chunk](Chunk.aus.md).


- **getCollidableExemptions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getCollidableExemptions()

	- **@r** `A` list.


- **getCombatTracker** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getCombatTracker()

	- **@r** `A` [CombatTracker](CombatTracker.aus.md).


- **getCooldown** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getCooldown(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `An` int.


- **getCooldown\_material** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getCooldown(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@r** `An` int.


- **getCustomName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getCustomName()

	- **@r** `A` string.


- **getData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getData(io.papermc.paper.datacomponent.DataComponentType.Valued)

	- **@p** `Type` is a DataComponentType.Valued.
	- **@r** `An` Object.


- **getDataOrDefault** (`Type, Fallback`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getDataOrDefault(io.papermc.paper.datacomponent.DataComponentType.Valued,java.lang.Object)

	- **@p** `Type` is a DataComponentType.Valued.
	- **@p** `Fallback` is an Object.
	- **@r** `An` Object.


- **getDeathSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getDeathSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getDiscoveredRecipes** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getDiscoveredRecipes()

	- **@r** `A` list.


- **getDrinkingSound** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getDrinkingSound(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` [Sound](Sound.aus.md).


- **getEatingSound** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getEatingSound(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` [Sound](Sound.aus.md).


- **getEffectivePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getEffectivePermissions()

	- **@r** `A` list.


- **getEnchantmentSeed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getEnchantmentSeed()

	- **@r** `An` int.


- **getEnderChest** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getEnderChest()

	- **@r** `An` [Inventory](Inventory.aus.md).


- **getEntityId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getEntityId()

	- **@r** `An` int.


- **getEntitySpawnReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getEntitySpawnReason()

	- **@r** `A` string naming a CreatureSpawnEvent.SpawnReason.


- **getEquipment** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getEquipment()

	- **@r** `An` [EntityEquipment](EntityEquipment.aus.md).


- **getExhaustion** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getExhaustion()

	- **@r** `A` double.


- **getExpToLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getExpToLevel()

	- **@r** `An` int.


- **getEyeHeight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getEyeHeight()

	- **@r** `A` double.


- **getEyeHeight** (`IgnorePose`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getEyeHeight(boolean)

	- **@p** `IgnorePose` is a bool.
	- **@r** `A` double.


- **getEyeLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getEyeLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getFacing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getFacing()

	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getFallDamageSound** (`FallHeight`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getFallDamageSound(int)

	- **@p** `FallHeight` is an int.
	- **@r** `A` [Sound](Sound.aus.md).


- **getFallDamageSoundBig** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getFallDamageSoundBig()

	- **@r** `A` [Sound](Sound.aus.md).


- **getFallDamageSoundSmall** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getFallDamageSoundSmall()

	- **@r** `A` [Sound](Sound.aus.md).


- **getFallDistance** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getFallDistance()

	- **@r** `A` double.


- **getFireTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getFireTicks()

	- **@r** `An` int.


- **getFishHook** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getFishHook()

	- **@r** `A` [FishHook](FishHook.aus.md).


- **getForwardsMovement** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getForwardsMovement()

	- **@r** `A` double.


- **getFreezeTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getFreezeTicks()

	- **@r** `An` int.


- **getHandRaised** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getHandRaised()

	- **@r** `An` string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **getHandRaisedTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getHandRaisedTime()

	- **@r** `An` int.


- **getHeight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getHeight()

	- **@r** `A` double.


- **getHurtDirection** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getHurtDirection()

	- **@r** `A` double.


- **getHurtSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getHurtSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getHurtSound** (`DamageSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getHurtSound(org.bukkit.damage.DamageSource)

	- **@p** `DamageSource` is a [DamageSource](DamageSource.aus.md).
	- **@r** `A` [Sound](Sound.aus.md).


- **getItemInHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getItemInHand()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getItemInUse** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getItemInUse()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getItemInUseTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getItemInUseTicks()

	- **@r** `An` int.


- **getItemOnCursor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getItemOnCursor()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getItemUseRemainingTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getItemUseRemainingTime()

	- **@r** `An` int.


- **getKiller** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getKiller()

	- **@r** `A` [Player](Player.aus.md).


- **getLastDamage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getLastDamage()

	- **@r** `A` double.


- **getLastDamageCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getLastDamageCause()

	- **@r** `An` [EntityDamageEvent](EntityDamageEvent.aus.md).


- **getLastDeathLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getLastDeathLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getLastTwoTargetBlocks** (`Transparent, MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getLastTwoTargetBlocks(java.util.Set,int)

	- **@p** `Transparent` is a list.
	- **@p** `MaxDistance` is an int.
	- **@r** `A` list.


- **getLeashHolder** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getLeashHolder()

	- **@r** `An` [Entity](Entity.aus.md).


- **getLineOfSight** (`Transparent, MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getLineOfSight(java.util.Set,int)

	- **@p** `Transparent` is a list.
	- **@p** `MaxDistance` is an int.
	- **@r** `A` list.


- **getLocation** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getLocation(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **getMainHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getMainHand()

	- **@r** `A` string naming a [MainHand](MainHand.aus.md).


- **getMaxFireTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getMaxFireTicks()

	- **@r** `An` int.


- **getMaxFreezeTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getMaxFreezeTicks()

	- **@r** `An` int.


- **getMaxHealth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getMaxHealth()

	- **@r** `A` double.


- **getMaximumAir** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getMaximumAir()

	- **@r** `An` int.


- **getMaximumNoDamageTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getMaximumNoDamageTicks()

	- **@r** `An` int.


- **getMemory** (`MemoryKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getMemory(org.bukkit.entity.memory.MemoryKey)

	- **@p** `MemoryKey` is a [MemoryKey](MemoryKey.aus.md).
	- **@r** `An` Object.


- **getMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` list.


- **getNearbyEntities** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getNearbyEntities(double,double,double)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` list.


- **getNextArrowRemoval** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getNextArrowRemoval()

	- **@r** `An` int.


- **getNextBeeStingerRemoval** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getNextBeeStingerRemoval()

	- **@r** `An` int.


- **getNoActionTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getNoActionTicks()

	- **@r** `An` int.


- **getNoDamageTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getNoDamageTicks()

	- **@r** `An` int.


- **getOpenInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getOpenInventory()

	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **getOrigin** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getOrigin()

	- **@r** `A` [Location](Location.aus.md).


- **getPassenger** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getPassenger()

	- **@r** `An` [Entity](Entity.aus.md).


- **getPassengers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getPassengers()

	- **@r** `A` list.


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getPickItemStack** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getPickItemStack()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getPistonMoveReaction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getPistonMoveReaction()

	- **@r** `A` string naming a [PistonMoveReaction](PistonMoveReaction.aus.md).


- **getPortalCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getPortalCooldown()

	- **@r** `An` int.


- **getPose** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getPose()

	- **@r** `A` string naming a [Pose](Pose.aus.md).


- **getPotentialBedLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getPotentialBedLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getPotentialRespawnLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getPotentialRespawnLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getPotionEffect** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getPotionEffect(org.bukkit.potion.PotionEffectType)

	- **@p** `Type` is a [PotionEffectType](PotionEffectType.aus.md).
	- **@r** `A` [PotionEffect](PotionEffect.aus.md).


- **getRemainingAir** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getRemainingAir()

	- **@r** `An` int.


- **getRemovalReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getRemovalReason()

	- **@r** `A` string naming a [RemovalReason](RemovalReason.aus.md).


- **getRemoveEventCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getRemoveEventCause()

	- **@r** `A` string naming an EntityRemoveEvent.Cause.


- **getRemoveWhenFarAway** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getRemoveWhenFarAway()

	- **@r** `A` bool.


- **getSaturatedRegenRate** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getSaturatedRegenRate()

	- **@r** `An` int.


- **getSaturation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getSaturation()

	- **@r** `A` double.


- **getScoreboardEntryName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getScoreboardEntryName()

	- **@r** `A` string.


- **getScoreboardTags** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getScoreboardTags()

	- **@r** `A` list.


- **getShieldBlockingDelay** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getShieldBlockingDelay()

	- **@r** `An` int.


- **getShoulderEntityLeft** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getShoulderEntityLeft()

	- **@r** `An` [Entity](Entity.aus.md).


- **getShoulderEntityRight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getShoulderEntityRight()

	- **@r** `An` [Entity](Entity.aus.md).


- **getSidewaysMovement** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getSidewaysMovement()

	- **@r** `A` double.


- **getSleepTicks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getSleepTicks()

	- **@r** `An` int.


- **getSoundCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getSoundCategory()

	- **@r** `A` string naming a [SoundCategory](SoundCategory.aus.md).


- **getSoundPitch** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getSoundPitch()

	- **@r** `A` double.


- **getSoundVolume** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getSoundVolume()

	- **@r** `A` double.


- **getSpawnCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getSpawnCategory()

	- **@r** `A` string naming a [SpawnCategory](SpawnCategory.aus.md).


- **getStarvationRate** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getStarvationRate()

	- **@r** `An` int.


- **getSwimHighSpeedSplashSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getSwimHighSpeedSplashSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getSwimSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getSwimSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getSwimSplashSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getSwimSplashSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getTargetBlock** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getTargetBlock(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlock** (`Transparent, MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getTargetBlock(java.util.Set,int)

	- **@p** `Transparent` is a list.
	- **@p** `MaxDistance` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlock\_maxdistance\_fluidmode** (`MaxDistance, FluidMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getTargetBlock(int,com.destroystokyo.paper.block.TargetBlockInfo.FluidMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidMode` is a string naming a TargetBlockInfo.FluidMode.
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlockExact** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getTargetBlockExact(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlockExact** (`MaxDistance, FluidCollisionMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getTargetBlockExact(int,org.bukkit.FluidCollisionMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidCollisionMode` is a string naming a [FluidCollisionMode](FluidCollisionMode.aus.md).
	- **@r** `A` [Block](Block.aus.md).


- **getTargetBlockFace** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getTargetBlockFace(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getTargetBlockFace** (`MaxDistance, FluidMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getTargetBlockFace(int,org.bukkit.FluidCollisionMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidMode` is a string naming a [FluidCollisionMode](FluidCollisionMode.aus.md).
	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getTargetBlockFace\_int\_FluidMode** (`MaxDistance, FluidMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getTargetBlockFace(int,com.destroystokyo.paper.block.TargetBlockInfo.FluidMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidMode` is a string naming a TargetBlockInfo.FluidMode.
	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getTargetBlockInfo** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getTargetBlockInfo(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [TargetBlockInfo](TargetBlockInfo.aus.md).


- **getTargetBlockInfo** (`MaxDistance, FluidMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getTargetBlockInfo(int,com.destroystokyo.paper.block.TargetBlockInfo.FluidMode)

	- **@p** `MaxDistance` is an int.
	- **@p** `FluidMode` is a string naming a TargetBlockInfo.FluidMode.
	- **@r** `A` [TargetBlockInfo](TargetBlockInfo.aus.md).


- **getTargetEntity** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getTargetEntity(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `An` [Entity](Entity.aus.md).


- **getTargetEntity** (`MaxDistance, IgnoreBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getTargetEntity(int,boolean)

	- **@p** `MaxDistance` is an int.
	- **@p** `IgnoreBlocks` is a bool.
	- **@r** `An` [Entity](Entity.aus.md).


- **getTargetEntityInfo** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getTargetEntityInfo(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [TargetEntityInfo](TargetEntityInfo.aus.md).


- **getTargetEntityInfo** (`MaxDistance, IgnoreBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getTargetEntityInfo(int,boolean)

	- **@p** `MaxDistance` is an int.
	- **@p** `IgnoreBlocks` is a bool.
	- **@r** `A` [TargetEntityInfo](TargetEntityInfo.aus.md).


- **getTicksLived** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getTicksLived()

	- **@r** `An` int.


- **getTrackedBy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getTrackedBy()

	- **@r** `A` list.


- **getTrackedPlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getTrackedPlayers()

	- **@r** `A` list.


- **getUnsaturatedRegenRate** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getUnsaturatedRegenRate()

	- **@r** `An` int.


- **getUpwardsMovement** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getUpwardsMovement()

	- **@r** `A` double.


- **getVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getVehicle()

	- **@r** `An` [Entity](Entity.aus.md).


- **getVelocity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getVelocity()

	- **@r** `A` [Vector](Vector.aus.md).


- **getWaypointColor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getWaypointColor()

	- **@r** `A` [Color](Color.aus.md).


- **getWidth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getWidth()

	- **@r** `A` double.


- **hasAI** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#hasAI()

	- **@r** `A` bool.


- **hasActiveItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#hasActiveItem()

	- **@r** `A` bool.


- **hasCooldown** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#hasCooldown(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **hasCooldown\_material** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#hasCooldown(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@r** `A` bool.


- **hasData** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#hasData(io.papermc.paper.datacomponent.DataComponentType)

	- **@p** `Type` is a [DataComponentType](DataComponentType.aus.md).
	- **@r** `A` bool.


- **hasDiscoveredRecipe** (`Recipe`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#hasDiscoveredRecipe(org.bukkit.NamespacedKey)

	- **@p** `Recipe` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` bool.


- **hasFixedPose** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#hasFixedPose()

	- **@r** `A` bool.


- **hasGravity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#hasGravity()

	- **@r** `A` bool.


- **hasLineOfSight** (`Other`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#hasLineOfSight(org.bukkit.entity.Entity)

	- **@p** `Other` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **hasLineOfSight\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#hasLineOfSight(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **hasMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#hasMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` bool.


- **hasNoPhysics** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#hasNoPhysics()

	- **@r** `A` bool.


- **hasPermission\_perm** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#hasPermission(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).
	- **@r** `A` bool.


- **hasPermission** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#hasPermission(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **hasPotionEffect** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#hasPotionEffect(org.bukkit.potion.PotionEffectType)

	- **@p** `Type` is a [PotionEffectType](PotionEffectType.aus.md).
	- **@r** `A` bool.


- **heal** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#heal(double)

	- **@p** `Amount` is a double.


- **heal** (`Amount, Reason`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#heal(double,org.bukkit.event.entity.EntityRegainHealthEvent.RegainReason)

	- **@p** `Amount` is a double.
	- **@p** `Reason` is a string naming an EntityRegainHealthEvent.RegainReason.


- **isBlocking** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isBlocking()

	- **@r** `A` bool.


- **isClimbing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isClimbing()

	- **@r** `A` bool.


- **isCollidable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isCollidable()

	- **@r** `A` bool.


- **isCustomNameVisible** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isCustomNameVisible()

	- **@r** `A` bool.


- **isDeeplySleeping** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isDeeplySleeping()

	- **@r** `A` bool.


- **isFreezeTickingLocked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isFreezeTickingLocked()

	- **@r** `A` bool.


- **isFrozen** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isFrozen()

	- **@r** `A` bool.


- **isGliding** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isGliding()

	- **@r** `A` bool.


- **isGlowing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isGlowing()

	- **@r** `A` bool.


- **isHandRaised** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isHandRaised()

	- **@r** `A` bool.


- **isInBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isInBubbleColumn()

	- **@r** `A` bool.


- **isInLava** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isInLava()

	- **@r** `A` bool.


- **isInPowderedSnow** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isInPowderedSnow()

	- **@r** `A` bool.


- **isInRain** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isInRain()

	- **@r** `A` bool.


- **isInWater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isInWater()

	- **@r** `A` bool.


- **isInWaterOrBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isInWaterOrBubbleColumn()

	- **@r** `A` bool.


- **isInWaterOrRain** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isInWaterOrRain()

	- **@r** `A` bool.


- **isInWaterOrRainOrBubbleColumn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isInWaterOrRainOrBubbleColumn()

	- **@r** `A` bool.


- **isInWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isInWorld()

	- **@r** `A` bool.


- **isInsideVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isInsideVehicle()

	- **@r** `A` bool.


- **isInvisible** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isInvisible()

	- **@r** `A` bool.


- **isInvulnerable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isInvulnerable()

	- **@r** `A` bool.


- **isJumping** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isJumping()

	- **@r** `A` bool.


- **isLeashed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isLeashed()

	- **@r** `A` bool.


- **isOnGround** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isOnGround()

	- **@r** `A` bool.


- **isOp** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isOp()

	- **@r** `A` bool.


- **isPermissionSet\_perm** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isPermissionSet(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).
	- **@r** `A` bool.


- **isPermissionSet** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isPermissionSet(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **isPersistent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isPersistent()

	- **@r** `A` bool.


- **isRiptiding** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isRiptiding()

	- **@r** `A` bool.


- **isSilent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isSilent()

	- **@r** `A` bool.


- **isSleeping** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isSleeping()

	- **@r** `A` bool.


- **isSwimming** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isSwimming()

	- **@r** `A` bool.


- **isTicking** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isTicking()

	- **@r** `A` bool.


- **isTrackedBy** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isTrackedBy(org.bukkit.entity.Player)

	- **@p** `Player` is a [Player](Player.aus.md).
	- **@r** `A` bool.


- **isUnderWater** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isUnderWater()

	- **@r** `A` bool.


- **isValid** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isValid()

	- **@r** `A` bool.


- **isVisibleByDefault** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isVisibleByDefault()

	- **@r** `A` bool.


- **isVisualFire** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#isVisualFire()

	- **@r** `A` bool.


- **kill** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#kill()



- **kill** (`DamageSource`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#kill(org.bukkit.damage.DamageSource)

	- **@p** `DamageSource` is a [DamageSource](DamageSource.aus.md).


- **knockback** (`Strength, DirectionX, DirectionZ`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#knockback(double,double,double)

	- **@p** `Strength` is a double.
	- **@p** `DirectionX` is a double.
	- **@p** `DirectionZ` is a double.


- **leaveVehicle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#leaveVehicle()

	- **@r** `A` bool.


- **lockFreezeTicks** (`Locked`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#lockFreezeTicks(boolean)

	- **@p** `Locked` is a bool.


- **lookAt** (`Position, EntityAnchor`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#lookAt(io.papermc.paper.math.Position,io.papermc.paper.entity.LookAnchor)

	- **@p** `Position` is a [Position](Position.aus.md).
	- **@p** `EntityAnchor` is a string naming a [LookAnchor](LookAnchor.aus.md).


- **lookAt** (`X, Y, Z, EntityAnchor`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#lookAt(double,double,double,io.papermc.paper.entity.LookAnchor)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `EntityAnchor` is a string naming a [LookAnchor](LookAnchor.aus.md).


- **name** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#name()

	- **@r** `A` Component.


- **openAnvil** (`Location, Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#openAnvil(org.bukkit.Location,boolean)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Force` is a bool.
	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **openCartographyTable** (`Location, Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#openCartographyTable(org.bukkit.Location,boolean)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Force` is a bool.
	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **openEnchanting** (`Location, Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#openEnchanting(org.bukkit.Location,boolean)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Force` is a bool.
	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **openGrindstone** (`Location, Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#openGrindstone(org.bukkit.Location,boolean)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Force` is a bool.
	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **openInventory** (`Inventory`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#openInventory(org.bukkit.inventory.Inventory)

	- **@p** `Inventory` is an [Inventory](Inventory.aus.md).
	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **openInventory\_InventoryView** (`Inventory`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#openInventory(org.bukkit.inventory.InventoryView)

	- **@p** `Inventory` is an [InventoryView](InventoryView.aus.md).


- **openLoom** (`Location, Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#openLoom(org.bukkit.Location,boolean)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Force` is a bool.
	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **openMerchant** (`Merchant, Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#openMerchant(org.bukkit.inventory.Merchant,boolean)

	- **@p** `Merchant` is a [Merchant](Merchant.aus.md).
	- **@p** `Force` is a bool.
	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **openMerchant\_trader\_force** (`Trader, Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#openMerchant(org.bukkit.entity.Villager,boolean)

	- **@p** `Trader` is a [Villager](Villager.aus.md).
	- **@p** `Force` is a bool.
	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **openSign** (`Sign`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#openSign(org.bukkit.block.Sign)

	- **@p** `Sign` is a [Sign](Sign.aus.md).


- **openSign** (`Sign, Side`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#openSign(org.bukkit.block.Sign,org.bukkit.block.sign.Side)

	- **@p** `Sign` is a [Sign](Sign.aus.md).
	- **@p** `Side` is a string naming a [Side](Side.aus.md).


- **openSmithingTable** (`Location, Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#openSmithingTable(org.bukkit.Location,boolean)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Force` is a bool.
	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **openStonecutter** (`Location, Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#openStonecutter(org.bukkit.Location,boolean)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Force` is a bool.
	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **openWorkbench** (`Location, Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#openWorkbench(org.bukkit.Location,boolean)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Force` is a bool.
	- **@r** `An` [InventoryView](InventoryView.aus.md).


- **playEffect** (`Effect`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#playEffect(org.bukkit.EntityEffect)

	- **@p** `Effect` is an string naming an [EntityEffect](EntityEffect.aus.md).


- **playHurtAnimation** (`Yaw`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#playHurtAnimation(float)

	- **@p** `Yaw` is a double.


- **playPickupItemAnimation** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#playPickupItemAnimation(org.bukkit.entity.Item)

	- **@p** `Item` is an [Item](Item.aus.md).


- **playPickupItemAnimation** (`Item, Quantity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#playPickupItemAnimation(org.bukkit.entity.Item,int)

	- **@p** `Item` is an [Item](Item.aus.md).
	- **@p** `Quantity` is an int.


- **rayTraceBlocks** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#rayTraceBlocks(double)

	- **@p** `MaxDistance` is a double.
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **rayTraceBlocks** (`MaxDistance, FluidCollisionMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#rayTraceBlocks(double,org.bukkit.FluidCollisionMode)

	- **@p** `MaxDistance` is a double.
	- **@p** `FluidCollisionMode` is a string naming a [FluidCollisionMode](FluidCollisionMode.aus.md).
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **rayTraceEntities** (`MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#rayTraceEntities(int)

	- **@p** `MaxDistance` is an int.
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **rayTraceEntities** (`MaxDistance, IgnoreBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#rayTraceEntities(int,boolean)

	- **@p** `MaxDistance` is an int.
	- **@p** `IgnoreBlocks` is a bool.
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **recalculatePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#recalculatePermissions()



- **registerAttribute** (`Attribute`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#registerAttribute(org.bukkit.attribute.Attribute)

	- **@p** `Attribute` is an [Attribute](Attribute.aus.md).


- **releaseLeftShoulderEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#releaseLeftShoulderEntity()

	- **@r** `An` [Entity](Entity.aus.md).


- **releaseRightShoulderEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#releaseRightShoulderEntity()

	- **@r** `An` [Entity](Entity.aus.md).


- **remove** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#remove()



- **removePassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#removePassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **removePotionEffect** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#removePotionEffect(org.bukkit.potion.PotionEffectType)

	- **@p** `Type` is a [PotionEffectType](PotionEffectType.aus.md).


- **removeResourcePacks** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#removeResourcePacks(java.lang.Iterable)

	- **@p** `A0` is an Iterable.


- **removeScoreboardTag** (`Tag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#removeScoreboardTag(java.lang.String)

	- **@p** `Tag` is a string.
	- **@r** `A` bool.


- **resetMaxHealth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#resetMaxHealth()



- **resetTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#resetTitle()



- **sendPlayerListFooter** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#sendPlayerListFooter(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListFooter\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#sendPlayerListFooter(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeader** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#sendPlayerListHeader(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListHeader\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#sendPlayerListHeader(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeaderAndFooter** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.Component,net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.
	- **@p** `A1` is a Component.


- **sendPlayerListHeaderAndFooter\_ComponentLike\_ComponentLike** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.ComponentLike,net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.
	- **@p** `A1` is a ComponentLike.


- **sendRichMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#sendRichMessage(java.lang.String)

	- **@p** `Message` is a string.


- **setAI** (`Ai`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setAI(boolean)

	- **@p** `Ai` is a bool.


- **setAbsorptionAmount** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setAbsorptionAmount(double)

	- **@p** `Amount` is a double.


- **setActiveItemRemainingTime** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setActiveItemRemainingTime(int)

	- **@p** `Ticks` is an int.


- **setArrowCooldown** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setArrowCooldown(int)

	- **@p** `Ticks` is an int.


- **setArrowsInBody** (`Count`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setArrowsInBody(int)

	- **@p** `Count` is an int.


- **setArrowsInBody** (`Count, FireEvent`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setArrowsInBody(int,boolean)

	- **@p** `Count` is an int.
	- **@p** `FireEvent` is a bool.


- **setArrowsStuck** (`Arrows`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setArrowsStuck(int)

	- **@p** `Arrows` is an int.


- **setBeeStingerCooldown** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setBeeStingerCooldown(int)

	- **@p** `Ticks` is an int.


- **setBeeStingersInBody** (`Count`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setBeeStingersInBody(int)

	- **@p** `Count` is an int.


- **setBodyYaw** (`BodyYaw`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setBodyYaw(float)

	- **@p** `BodyYaw` is a double.


- **setCanPickupItems** (`Pickup`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setCanPickupItems(boolean)

	- **@p** `Pickup` is a bool.


- **setCollidable** (`Collidable`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setCollidable(boolean)

	- **@p** `Collidable` is a bool.


- **setCooldown** (`Item, Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setCooldown(org.bukkit.inventory.ItemStack,int)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Ticks` is an int.


- **setCooldown\_material\_ticks** (`Material, Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setCooldown(org.bukkit.Material,int)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@p** `Ticks` is an int.


- **setCustomName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setCustomName(java.lang.String)

	- **@p** `Name` is a string.


- **setCustomNameVisible** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setCustomNameVisible(boolean)

	- **@p** `Flag` is a bool.


- **setEnchantmentSeed** (`Seed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setEnchantmentSeed(int)

	- **@p** `Seed` is an int.


- **setExhaustion** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setExhaustion(float)

	- **@p** `Value` is a double.


- **setFallDistance** (`Distance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setFallDistance(float)

	- **@p** `Distance` is a double.


- **setFireTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setFireTicks(int)

	- **@p** `Ticks` is an int.


- **setFoodLevel** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setFoodLevel(int)

	- **@p** `Value` is an int.


- **setFreezeTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setFreezeTicks(int)

	- **@p** `Ticks` is an int.


- **setGameMode** (`Mode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setGameMode(org.bukkit.GameMode)

	- **@p** `Mode` is a string naming a [GameMode](GameMode.aus.md).


- **setGliding** (`Gliding`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setGliding(boolean)

	- **@p** `Gliding` is a bool.


- **setGlowing** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setGlowing(boolean)

	- **@p** `Flag` is a bool.


- **setGravity** (`Gravity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setGravity(boolean)

	- **@p** `Gravity` is a bool.


- **setHealth** (`Health`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setHealth(double)

	- **@p** `Health` is a double.


- **setHurtDirection** (`HurtDirection`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setHurtDirection(float)

	- **@p** `HurtDirection` is a double.


- **setInvisible** (`Invisible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setInvisible(boolean)

	- **@p** `Invisible` is a bool.


- **setInvulnerable** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setInvulnerable(boolean)

	- **@p** `Flag` is a bool.


- **setItemInHand** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setItemInHand(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setItemInUseTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setItemInUseTicks(int)

	- **@p** `Ticks` is an int.


- **setItemOnCursor** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setItemOnCursor(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setJumping** (`Jumping`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setJumping(boolean)

	- **@p** `Jumping` is a bool.


- **setKiller** (`Killer`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setKiller(org.bukkit.entity.Player)

	- **@p** `Killer` is a [Player](Player.aus.md).


- **setLastDamage** (`Damage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setLastDamage(double)

	- **@p** `Damage` is a double.


- **setLastDamageCause** (`Event`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setLastDamageCause(org.bukkit.event.entity.EntityDamageEvent)

	- **@p** `Event` is an [EntityDamageEvent](EntityDamageEvent.aus.md).


- **setLastDeathLocation** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setLastDeathLocation(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).


- **setLeashHolder** (`Holder`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setLeashHolder(org.bukkit.entity.Entity)

	- **@p** `Holder` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **setMaxHealth** (`Health`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setMaxHealth(double)

	- **@p** `Health` is a double.


- **setMaximumAir** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setMaximumAir(int)

	- **@p** `Ticks` is an int.


- **setMaximumNoDamageTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setMaximumNoDamageTicks(int)

	- **@p** `Ticks` is an int.


- **setMemory** (`MemoryKey, MemoryValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setMemory(org.bukkit.entity.memory.MemoryKey,java.lang.Object)

	- **@p** `MemoryKey` is a [MemoryKey](MemoryKey.aus.md).
	- **@p** `MemoryValue` is an Object.


- **setMetadata** (`MetadataKey, NewMetadataValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setMetadata(java.lang.String,org.bukkit.metadata.MetadataValue)

	- **@p** `MetadataKey` is a string.
	- **@p** `NewMetadataValue` is a [MetadataValue](MetadataValue.aus.md).


- **setNextArrowRemoval** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setNextArrowRemoval(int)

	- **@p** `Ticks` is an int.


- **setNextBeeStingerRemoval** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setNextBeeStingerRemoval(int)

	- **@p** `Ticks` is an int.


- **setNoActionTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setNoActionTicks(int)

	- **@p** `Ticks` is an int.


- **setNoDamageTicks** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setNoDamageTicks(int)

	- **@p** `Ticks` is an int.


- **setNoPhysics** (`NoPhysics`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setNoPhysics(boolean)

	- **@p** `NoPhysics` is a bool.


- **setPassenger** (`Passenger`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setPassenger(org.bukkit.entity.Entity)

	- **@p** `Passenger` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **setPersistent** (`Persistent`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setPersistent(boolean)

	- **@p** `Persistent` is a bool.


- **setPortalCooldown** (`Cooldown`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setPortalCooldown(int)

	- **@p** `Cooldown` is an int.


- **setPose** (`Pose`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setPose(org.bukkit.entity.Pose)

	- **@p** `Pose` is a string naming a [Pose](Pose.aus.md).


- **setPose** (`Pose, Fixed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setPose(org.bukkit.entity.Pose,boolean)

	- **@p** `Pose` is a string naming a [Pose](Pose.aus.md).
	- **@p** `Fixed` is a bool.


- **setRemainingAir** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setRemainingAir(int)

	- **@p** `Ticks` is an int.


- **setRemoveWhenFarAway** (`Remove`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setRemoveWhenFarAway(boolean)

	- **@p** `Remove` is a bool.


- **setRiptiding** (`Riptiding`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setRiptiding(boolean)

	- **@p** `Riptiding` is a bool.


- **setRotation\_Angle\_Angle** (`Yaw, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setRotation(io.papermc.paper.math.Angle,io.papermc.paper.math.Angle)

	- **@p** `Yaw` is an [Angle](Angle.aus.md).
	- **@p** `Pitch` is an [Angle](Angle.aus.md).


- **setRotation** (`Yaw, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setRotation(float,float)

	- **@p** `Yaw` is a double.
	- **@p** `Pitch` is a double.


- **setSaturatedRegenRate** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setSaturatedRegenRate(int)

	- **@p** `Ticks` is an int.


- **setSaturation** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setSaturation(float)

	- **@p** `Value` is a double.


- **setShieldBlockingDelay** (`Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setShieldBlockingDelay(int)

	- **@p** `Delay` is an int.


- **setShoulderEntityLeft** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setShoulderEntityLeft(org.bukkit.entity.Entity)

	- **@p** `Entity` is an [Entity](Entity.aus.md).


- **setShoulderEntityRight** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setShoulderEntityRight(org.bukkit.entity.Entity)

	- **@p** `Entity` is an [Entity](Entity.aus.md).


- **setSilent** (`Flag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setSilent(boolean)

	- **@p** `Flag` is a bool.


- **setSneaking** (`Sneak`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setSneaking(boolean)

	- **@p** `Sneak` is a bool.


- **setStarvationRate** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setStarvationRate(int)

	- **@p** `Ticks` is an int.


- **setSwimming** (`Swimming`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setSwimming(boolean)

	- **@p** `Swimming` is a bool.


- **setTicksLived** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setTicksLived(int)

	- **@p** `Value` is an int.


- **setUnsaturatedRegenRate** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setUnsaturatedRegenRate(int)

	- **@p** `Ticks` is an int.


- **setVelocity** (`Velocity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setVelocity(org.bukkit.util.Vector)

	- **@p** `Velocity` is a [Vector](Vector.aus.md).


- **setVisibleByDefault** (`Visible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setVisibleByDefault(boolean)

	- **@p** `Visible` is a bool.


- **setVisualFire** (`Fire`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setVisualFire(boolean)

	- **@p** `Fire` is a bool.


- **setWaypointColor** (`Color`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setWaypointColor(org.bukkit.Color)

	- **@p** `Color` is a [Color](Color.aus.md).


- **setWindowProperty** (`Prop, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setWindowProperty(org.bukkit.inventory.InventoryView.Property,int)

	- **@p** `Prop` is a string naming an InventoryView.Property.
	- **@p** `Value` is an int.
	- **@r** `A` bool.


- **sleep** (`Location, Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#sleep(org.bukkit.Location,boolean)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Force` is a bool.
	- **@r** `A` bool.


- **spawnAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#spawnAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **spawnAt** (`Location, Reason`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#spawnAt(org.bukkit.Location,org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Reason` is a string naming a CreatureSpawnEvent.SpawnReason.
	- **@r** `A` bool.


- **spigot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#spigot()

	- **@r** `An` Entity.Spigot.


- **startRiptideAttack** (`Duration, AttackStrength, AttackItem`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#startRiptideAttack(int,float,org.bukkit.inventory.ItemStack)

	- **@p** `Duration` is an int.
	- **@p** `AttackStrength` is a double.
	- **@p** `AttackItem` is an [ItemStack](ItemStack.aus.md).


- **startUsingItem** (`Hand`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#startUsingItem(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Hand` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **swingHand** (`Hand`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#swingHand(org.bukkit.inventory.EquipmentSlot)

	- **@p** `Hand` is an string naming an [EquipmentSlot](EquipmentSlot.aus.md).


- **swingMainHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#swingMainHand()



- **swingOffHand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#swingOffHand()



- **teamDisplayName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#teamDisplayName()

	- **@r** `A` Component.


- **teleport** (`Destination`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#teleport(org.bukkit.entity.Entity)

	- **@p** `Destination` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **teleport\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#teleport(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **teleport** (`Destination, Cause`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#teleport(org.bukkit.entity.Entity,org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)

	- **@p** `Destination` is an [Entity](Entity.aus.md).
	- **@p** `Cause` is a string naming a PlayerTeleportEvent.TeleportCause.
	- **@r** `A` bool.


- **teleport\_location\_cause** (`Location, Cause`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#teleport(org.bukkit.Location,org.bukkit.event.player.PlayerTeleportEvent.TeleportCause)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Cause` is a string naming a PlayerTeleportEvent.TeleportCause.
	- **@r** `A` bool.


- **undiscoverRecipe** (`Recipe`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#undiscoverRecipe(org.bukkit.NamespacedKey)

	- **@p** `Recipe` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` bool.


- **undiscoverRecipes** (`Recipes`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#undiscoverRecipes(java.util.Collection)

	- **@p** `Recipes` is a list.
	- **@r** `An` int.


- **wakeup** (`SetSpawnLocation`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#wakeup(boolean)

	- **@p** `SetSpawnLocation` is a bool.


- **wouldCollideUsing** (`BoundingBox`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#wouldCollideUsing(org.bukkit.util.BoundingBox)

	- **@p** `BoundingBox` is a [BoundingBox](BoundingBox.aus.md).
	- **@r** `A` bool.


- **addAttachment** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#addAttachment(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#addAttachment(org.bukkit.plugin.Plugin,int)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Ticks` is an int.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Name, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#addAttachment(org.bukkit.plugin.Plugin,java.lang.String,boolean)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Name` is a string.
	- **@p** `Value` is a bool.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Name, Value, Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#addAttachment(org.bukkit.plugin.Plugin,java.lang.String,boolean,int)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Name` is a string.
	- **@p** `Value` is a bool.
	- **@p** `Ticks` is an int.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **getScheduler** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getScheduler()

	- **@r** `An` EntityScheduler.


- **getServer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#getServer()

	- **@r** `A` [Server](Server.aus.md).


- **removeAttachment** (`Attachment`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#removeAttachment(org.bukkit.permissions.PermissionAttachment)

	- **@p** `Attachment` is a [PermissionAttachment](PermissionAttachment.aus.md).


- **removeMetadata** (`MetadataKey, OwningPlugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#removeMetadata(java.lang.String,org.bukkit.plugin.Plugin)

	- **@p** `MetadataKey` is a string.
	- **@p** `OwningPlugin` is a [Plugin](Plugin.aus.md).


- **setOp** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/entity/HumanEntity.html#setOp(boolean)

	- **@p** `Value` is a bool.




