# file: EntityTargetEvent.aus

## class: EntityTargetEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.EntityTargetEventShim) **extends: object** 

Generated shim for org.bukkit.event.entity.EntityTargetEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityTargetEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[EntityEvent](EntityEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityTargetEvent.html#getEntity()

	- **@r** `An` [Entity](Entity.aus.md).


- **getEntityType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityTargetEvent.html#getEntityType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityTargetEvent.html#getEventName()

	- **@r** `A` string.


- **getReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityTargetEvent.html#getReason()

	- **@r** `A` string naming an EntityTargetEvent.TargetReason.


- **getTarget** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityTargetEvent.html#getTarget()

	- **@r** `An` [Entity](Entity.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityTargetEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityTargetEvent.html#isCancelled()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityTargetEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setTarget** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityTargetEvent.html#setTarget(org.bukkit.entity.Entity)

	- **@p** `Target` is an [Entity](Entity.aus.md).


- **callEvent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityTargetEvent.html#callEvent()

	- **@r** `A` bool.


- **getHandlerList** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityTargetEvent.html#getHandlerList()

	- **@r** `A` [HandlerList](HandlerList.aus.md).


- **getHandlers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityTargetEvent.html#getHandlers()

	- **@r** `A` [HandlerList](HandlerList.aus.md).




