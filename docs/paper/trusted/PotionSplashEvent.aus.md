# file: PotionSplashEvent.aus

## class: PotionSplashEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.PotionSplashEventShim) **extends: object** 

Generated shim for org.bukkit.event.entity.PotionSplashEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PotionSplashEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[ProjectileHitEvent](ProjectileHitEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getAffectedEntities** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PotionSplashEvent.html#getAffectedEntities()

	- **@r** `A` list.


- **getEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PotionSplashEvent.html#getEntity()

	- **@r** `A` [ThrownPotion](ThrownPotion.aus.md).


- **getEntityType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PotionSplashEvent.html#getEntityType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PotionSplashEvent.html#getEventName()

	- **@r** `A` string.


- **getHitBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PotionSplashEvent.html#getHitBlock()

	- **@r** `A` [Block](Block.aus.md).


- **getHitBlockFace** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PotionSplashEvent.html#getHitBlockFace()

	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getHitEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PotionSplashEvent.html#getHitEntity()

	- **@r** `An` [Entity](Entity.aus.md).


- **getIntensity** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PotionSplashEvent.html#getIntensity(org.bukkit.entity.LivingEntity)

	- **@p** `Entity` is a [LivingEntity](LivingEntity.aus.md).
	- **@r** `A` double.


- **getPotion** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PotionSplashEvent.html#getPotion()

	- **@r** `A` [ThrownPotion](ThrownPotion.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PotionSplashEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PotionSplashEvent.html#isCancelled()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PotionSplashEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setIntensity** (`Entity, Intensity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PotionSplashEvent.html#setIntensity(org.bukkit.entity.LivingEntity,double)

	- **@p** `Entity` is a [LivingEntity](LivingEntity.aus.md).
	- **@p** `Intensity` is a double.




