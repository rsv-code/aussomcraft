# file: EntityMoveEvent.aus

## class: EntityMoveEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.EntityMoveEventShim) **extends: object** 

Generated shim for io.papermc.paper.event.entity.EntityMoveEvent.
Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityMoveEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[EntityEvent](EntityEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityMoveEvent.html#getEntity()

	- **@r** `A` [LivingEntity](LivingEntity.aus.md).


- **getEntityType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityMoveEvent.html#getEntityType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityMoveEvent.html#getEventName()

	- **@r** `A` string.


- **getFrom** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityMoveEvent.html#getFrom()

	- **@r** `A` [Location](Location.aus.md).


- **getTo** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityMoveEvent.html#getTo()

	- **@r** `A` [Location](Location.aus.md).


- **hasChangedBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityMoveEvent.html#hasChangedBlock()

	- **@r** `A` bool.


- **hasChangedOrientation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityMoveEvent.html#hasChangedOrientation()

	- **@r** `A` bool.


- **hasChangedPosition** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityMoveEvent.html#hasChangedPosition()

	- **@r** `A` bool.


- **hasExplicitlyChangedBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityMoveEvent.html#hasExplicitlyChangedBlock()

	- **@r** `A` bool.


- **hasExplicitlyChangedPosition** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityMoveEvent.html#hasExplicitlyChangedPosition()

	- **@r** `A` bool.


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityMoveEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityMoveEvent.html#isCancelled()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityMoveEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setFrom** (`From`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityMoveEvent.html#setFrom(org.bukkit.Location)

	- **@p** `From` is a [Location](Location.aus.md).


- **setTo** (`To`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityMoveEvent.html#setTo(org.bukkit.Location)

	- **@p** `To` is a [Location](Location.aus.md).




