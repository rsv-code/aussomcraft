# file: EntityKnockbackEvent.aus

## class: EntityKnockbackEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.EntityKnockbackEventShim) **extends: object** 

Generated shim for org.bukkit.event.entity.EntityKnockbackEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityKnockbackEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[EntityEvent](EntityEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityKnockbackEvent.html#getCause()

	- **@r** `A` string naming an EntityKnockbackEvent.KnockbackCause.


- **getEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityKnockbackEvent.html#getEntity()

	- **@r** `A` [LivingEntity](LivingEntity.aus.md).


- **getEntityType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityKnockbackEvent.html#getEntityType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityKnockbackEvent.html#getEventName()

	- **@r** `A` string.


- **getFinalKnockback** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityKnockbackEvent.html#getFinalKnockback()

	- **@r** `A` [Vector](Vector.aus.md).


- **getForce** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityKnockbackEvent.html#getForce()

	- **@r** `A` double.


- **getKnockback** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityKnockbackEvent.html#getKnockback()

	- **@r** `A` [Vector](Vector.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityKnockbackEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityKnockbackEvent.html#isCancelled()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityKnockbackEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setFinalKnockback** (`Knockback`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityKnockbackEvent.html#setFinalKnockback(org.bukkit.util.Vector)

	- **@p** `Knockback` is a [Vector](Vector.aus.md).


- **callEvent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityKnockbackEvent.html#callEvent()

	- **@r** `A` bool.


- **getHandlerList** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityKnockbackEvent.html#getHandlerList()

	- **@r** `A` [HandlerList](HandlerList.aus.md).


- **getHandlers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityKnockbackEvent.html#getHandlers()

	- **@r** `A` [HandlerList](HandlerList.aus.md).




