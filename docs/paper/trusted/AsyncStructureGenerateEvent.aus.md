# file: AsyncStructureGenerateEvent.aus

## class: AsyncStructureGenerateEvent

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.AsyncStructureGenerateEventShim) **extends: object** 

Generated shim for org.bukkit.event.world.AsyncStructureGenerateEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html
In Paper this is a [WorldEvent](WorldEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **clearBlockTransformers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#clearBlockTransformers()



- **clearEntityTransformers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#clearEntityTransformers()



- **getBlockTransformer** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#getBlockTransformer(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` [BlockTransformer](BlockTransformer.aus.md).


- **getBlockTransformers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#getBlockTransformers()

	- **@r** `A` map.


- **getBoundingBox** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#getBoundingBox()

	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **getCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#getCause()

	- **@r** `A` string naming an AsyncStructureGenerateEvent.Cause.


- **getChunkX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#getChunkX()

	- **@r** `An` int.


- **getChunkZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#getChunkZ()

	- **@r** `An` int.


- **getEntityTransformer** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#getEntityTransformer(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `An` [EntityTransformer](EntityTransformer.aus.md).


- **getEntityTransformers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#getEntityTransformers()

	- **@r** `A` map.


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#getEventName()

	- **@r** `A` string.


- **getStructure** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#getStructure()

	- **@r** `A` StructureStructure.


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **removeBlockTransformer** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#removeBlockTransformer(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).


- **removeEntityTransformer** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#removeEntityTransformer(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).


- **setBlockTransformer** (`Key, Transformer`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#setBlockTransformer(org.bukkit.NamespacedKey,org.bukkit.util.BlockTransformer)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@p** `Transformer` is a [BlockTransformer](BlockTransformer.aus.md).


- **setEntityTransformer** (`Key, Transformer`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/world/AsyncStructureGenerateEvent.html#setEntityTransformer(org.bukkit.NamespacedKey,org.bukkit.util.EntityTransformer)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@p** `Transformer` is an [EntityTransformer](EntityTransformer.aus.md).




