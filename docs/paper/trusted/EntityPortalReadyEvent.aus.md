# file: EntityPortalReadyEvent.aus

## class: EntityPortalReadyEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.EntityPortalReadyEventShim) **extends: object** 

Generated shim for io.papermc.paper.event.entity.EntityPortalReadyEvent.
Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityPortalReadyEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[EntityEvent](EntityEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityPortalReadyEvent.html#getEntity()

	- **@r** `An` [Entity](Entity.aus.md).


- **getEntityType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityPortalReadyEvent.html#getEntityType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityPortalReadyEvent.html#getEventName()

	- **@r** `A` string.


- **getPortalType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityPortalReadyEvent.html#getPortalType()

	- **@r** `A` string naming a [PortalType](PortalType.aus.md).


- **getTargetWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityPortalReadyEvent.html#getTargetWorld()

	- **@r** `A` [World](World.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityPortalReadyEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityPortalReadyEvent.html#isCancelled()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityPortalReadyEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setTargetWorld** (`TargetWorld`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/entity/EntityPortalReadyEvent.html#setTargetWorld(org.bukkit.World)

	- **@p** `TargetWorld` is a [World](World.aus.md).




