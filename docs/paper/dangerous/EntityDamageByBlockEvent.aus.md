# file: EntityDamageByBlockEvent.aus

## class: EntityDamageByBlockEvent

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.EntityDamageByBlockEventShim) **extends: object** 

Generated shim for org.bukkit.event.entity.EntityDamageByBlockEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html
In Paper this is a [EntityDamageEvent](EntityDamageEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#getCause()

	- **@r** `A` string naming an EntityDamageEvent.DamageCause.


- **getDamage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#getDamage()

	- **@r** `A` double.


- **getDamage** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#getDamage(org.bukkit.event.entity.EntityDamageEvent.DamageModifier)

	- **@p** `Type` is a string naming an EntityDamageEvent.DamageModifier.
	- **@r** `A` double.


- **getDamageSource** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#getDamageSource()

	- **@r** `A` [DamageSource](DamageSource.aus.md).


- **getDamager** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#getDamager()

	- **@r** `A` [Block](Block.aus.md).


- **getDamagerBlockState** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#getDamagerBlockState()

	- **@r** `A` [BlockState](BlockState.aus.md).


- **getEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#getEntity()

	- **@r** `An` [Entity](Entity.aus.md).


- **getEntityType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#getEntityType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#getEventName()

	- **@r** `A` string.


- **getFinalDamage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#getFinalDamage()

	- **@r** `A` double.


- **getOriginalDamage** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#getOriginalDamage(org.bukkit.event.entity.EntityDamageEvent.DamageModifier)

	- **@p** `Type` is a string naming an EntityDamageEvent.DamageModifier.
	- **@r** `A` double.


- **isApplicable** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#isApplicable(org.bukkit.event.entity.EntityDamageEvent.DamageModifier)

	- **@p** `Type` is a string naming an EntityDamageEvent.DamageModifier.
	- **@r** `A` bool.


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#isCancelled()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setDamage** (`Damage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#setDamage(double)

	- **@p** `Damage` is a double.


- **setDamage** (`Type, Damage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#setDamage(org.bukkit.event.entity.EntityDamageEvent.DamageModifier,double)

	- **@p** `Type` is a string naming an EntityDamageEvent.DamageModifier.
	- **@p** `Damage` is a double.


- **callEvent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#callEvent()

	- **@r** `A` bool.


- **getHandlerList** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#getHandlerList()

	- **@r** `A` [HandlerList](HandlerList.aus.md).


- **getHandlers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByBlockEvent.html#getHandlers()

	- **@r** `A` [HandlerList](HandlerList.aus.md).




