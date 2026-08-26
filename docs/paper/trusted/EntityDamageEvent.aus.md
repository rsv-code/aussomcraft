# file: EntityDamageEvent.aus

## class: EntityDamageEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.EntityDamageEventShim) **extends: object** 

Generated shim for org.bukkit.event.entity.EntityDamageEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[EntityEvent](EntityEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageEvent.html#getCause()

	- **@r** `A` string naming an EntityDamageEvent.DamageCause.


- **getDamage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageEvent.html#getDamage()

	- **@r** `A` double.


- **getDamage** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageEvent.html#getDamage(org.bukkit.event.entity.EntityDamageEvent.DamageModifier)

	- **@p** `Type` is a string naming an EntityDamageEvent.DamageModifier.
	- **@r** `A` double.


- **getDamageSource** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageEvent.html#getDamageSource()

	- **@r** `A` [DamageSource](DamageSource.aus.md).


- **getEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageEvent.html#getEntity()

	- **@r** `An` [Entity](Entity.aus.md).


- **getEntityType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageEvent.html#getEntityType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageEvent.html#getEventName()

	- **@r** `A` string.


- **getFinalDamage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageEvent.html#getFinalDamage()

	- **@r** `A` double.


- **getOriginalDamage** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageEvent.html#getOriginalDamage(org.bukkit.event.entity.EntityDamageEvent.DamageModifier)

	- **@p** `Type` is a string naming an EntityDamageEvent.DamageModifier.
	- **@r** `A` double.


- **isApplicable** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageEvent.html#isApplicable(org.bukkit.event.entity.EntityDamageEvent.DamageModifier)

	- **@p** `Type` is a string naming an EntityDamageEvent.DamageModifier.
	- **@r** `A` bool.


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageEvent.html#isCancelled()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setDamage** (`Damage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageEvent.html#setDamage(double)

	- **@p** `Damage` is a double.


- **setDamage** (`Type, Damage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageEvent.html#setDamage(org.bukkit.event.entity.EntityDamageEvent.DamageModifier,double)

	- **@p** `Type` is a string naming an EntityDamageEvent.DamageModifier.
	- **@p** `Damage` is a double.




