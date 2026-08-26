# file: PreCreatureSpawnEvent.aus

## class: PreCreatureSpawnEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.PreCreatureSpawnEventShim) **extends: object** 

Generated shim for com.destroystokyo.paper.event.entity.PreCreatureSpawnEvent.
Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/entity/PreCreatureSpawnEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[Event](Event.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/entity/PreCreatureSpawnEvent.html#getEventName()

	- **@r** `A` string.


- **getReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/entity/PreCreatureSpawnEvent.html#getReason()

	- **@r** `A` string naming a CreatureSpawnEvent.SpawnReason.


- **getSpawnLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/entity/PreCreatureSpawnEvent.html#getSpawnLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/entity/PreCreatureSpawnEvent.html#getType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/entity/PreCreatureSpawnEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/entity/PreCreatureSpawnEvent.html#isCancelled()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/entity/PreCreatureSpawnEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setShouldAbortSpawn** (`ShouldAbortSpawn`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/entity/PreCreatureSpawnEvent.html#setShouldAbortSpawn(boolean)

	- **@p** `ShouldAbortSpawn` is a bool.


- **shouldAbortSpawn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/entity/PreCreatureSpawnEvent.html#shouldAbortSpawn()

	- **@r** `A` bool.




