# file: ProjectileHitEvent.aus

## class: ProjectileHitEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.ProjectileHitEventShim) **extends: object** 

Generated shim for org.bukkit.event.entity.ProjectileHitEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/ProjectileHitEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[EntityEvent](EntityEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/ProjectileHitEvent.html#getEntity()

	- **@r** `A` [Projectile](Projectile.aus.md).


- **getEntityType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/ProjectileHitEvent.html#getEntityType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/ProjectileHitEvent.html#getEventName()

	- **@r** `A` string.


- **getHitBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/ProjectileHitEvent.html#getHitBlock()

	- **@r** `A` [Block](Block.aus.md).


- **getHitBlockFace** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/ProjectileHitEvent.html#getHitBlockFace()

	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getHitEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/ProjectileHitEvent.html#getHitEntity()

	- **@r** `An` [Entity](Entity.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/ProjectileHitEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/ProjectileHitEvent.html#isCancelled()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/ProjectileHitEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.




