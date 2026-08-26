# file: EntitySpellCastEvent.aus

## class: EntitySpellCastEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.EntitySpellCastEventShim) **extends: object** 

Generated shim for org.bukkit.event.entity.EntitySpellCastEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntitySpellCastEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[EntityEvent](EntityEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntitySpellCastEvent.html#getEntity()

	- **@r** `A` [Spellcaster](Spellcaster.aus.md).


- **getEntityType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntitySpellCastEvent.html#getEntityType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntitySpellCastEvent.html#getEventName()

	- **@r** `A` string.


- **getSpell** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntitySpellCastEvent.html#getSpell()

	- **@r** `A` string naming a Spellcaster.Spell.


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntitySpellCastEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntitySpellCastEvent.html#isCancelled()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/EntitySpellCastEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.




