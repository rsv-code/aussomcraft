# file: EntityRegainHealthEvent.aus

## class: EntityRegainHealthEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.EntityRegainHealthEventShim) **extends: object** 

Generated shim for org.bukkit.event.entity.EntityRegainHealthEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityRegainHealthEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[EntityEvent](EntityEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getAmount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityRegainHealthEvent.html#getAmount()

	- **@r** `A` double.


- **getEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityRegainHealthEvent.html#getEntity()

	- **@r** `An` [Entity](Entity.aus.md).


- **getEntityType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityRegainHealthEvent.html#getEntityType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityRegainHealthEvent.html#getEventName()

	- **@r** `A` string.


- **getRegainReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityRegainHealthEvent.html#getRegainReason()

	- **@r** `A` string naming an EntityRegainHealthEvent.RegainReason.


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityRegainHealthEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityRegainHealthEvent.html#isCancelled()

	- **@r** `A` bool.


- **isFastRegen** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityRegainHealthEvent.html#isFastRegen()

	- **@r** `A` bool.


- **setAmount** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityRegainHealthEvent.html#setAmount(double)

	- **@p** `Amount` is a double.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntityRegainHealthEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.




