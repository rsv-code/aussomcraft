# file: EntityDamageByEntityEvent.aus

## class: EntityDamageByEntityEvent

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.EntityDamageByEntityEventShim) **extends: object** 

Generated shim for org.bukkit.event.entity.EntityDamageByEntityEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html
In Paper this is a [EntityDamageEvent](EntityDamageEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getDamage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html#getDamage()

	- **@r** `A` double.


- **getEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html#getEntity()

	- **@r** `An` [Entity](Entity.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html#getEventName()

	- **@r** `A` string.


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html#isCancelled()

	- **@r** `A` bool.


- **getCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html#getCause()

	- **@r** `A` string naming an EntityDamageEvent.DamageCause.


- **getDamage** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html#getDamage(org.bukkit.event.entity.EntityDamageEvent.DamageModifier)

	- **@p** `Type` is a string naming an EntityDamageEvent.DamageModifier.
	- **@r** `A` double.


- **getDamageSource** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html#getDamageSource()

	- **@r** `A` [DamageSource](DamageSource.aus.md).


- **getDamager** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html#getDamager()

	- **@r** `An` [Entity](Entity.aus.md).


- **getEntityType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html#getEntityType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getFinalDamage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html#getFinalDamage()

	- **@r** `A` double.


- **getOriginalDamage** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html#getOriginalDamage(org.bukkit.event.entity.EntityDamageEvent.DamageModifier)

	- **@p** `Type` is a string naming an EntityDamageEvent.DamageModifier.
	- **@r** `A` double.


- **isApplicable** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html#isApplicable(org.bukkit.event.entity.EntityDamageEvent.DamageModifier)

	- **@p** `Type` is a string naming an EntityDamageEvent.DamageModifier.
	- **@r** `A` bool.


- **isCritical** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html#isCritical()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setDamage** (`Damage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html#setDamage(double)

	- **@p** `Damage` is a double.


- **setDamage** (`Type, Damage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityDamageByEntityEvent.html#setDamage(org.bukkit.event.entity.EntityDamageEvent.DamageModifier,double)

	- **@p** `Type` is a string naming an EntityDamageEvent.DamageModifier.
	- **@p** `Damage` is a double.




