# file: CreatureSpawner.aus

## class: CreatureSpawner

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.CreatureSpawnerShim) **extends: object** 

Generated shim for org.bukkit.block.CreatureSpawner.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html
In Paper this is a [TileState](TileState.aus.md) and
[Spawner](Spawner.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addPotentialSpawn** (`SpawnerEntry`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#addPotentialSpawn(org.bukkit.block.spawner.SpawnerEntry)

	- **@p** `SpawnerEntry` is a [SpawnerEntry](SpawnerEntry.aus.md).


- **addPotentialSpawn** (`Snapshot, Weight, SpawnRule`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#addPotentialSpawn(org.bukkit.entity.EntitySnapshot,int,org.bukkit.block.spawner.SpawnRule)

	- **@p** `Snapshot` is an [EntitySnapshot](EntitySnapshot.aus.md).
	- **@p** `Weight` is an int.
	- **@p** `SpawnRule` is a [SpawnRule](SpawnRule.aus.md).


- **copy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#copy()

	- **@r** `A` [BlockState](BlockState.aus.md).


- **copy** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#copy(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [BlockState](BlockState.aus.md).


- **getBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getBlock()

	- **@r** `A` [Block](Block.aus.md).


- **getBlockData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getBlockData()

	- **@r** `A` [BlockData](BlockData.aus.md).


- **getChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getChunk()

	- **@r** `A` [Chunk](Chunk.aus.md).


- **getCreatureTypeName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getCreatureTypeName()

	- **@r** `A` string.


- **getDelay** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getDelay()

	- **@r** `An` int.


- **getDrops** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getDrops()

	- **@r** `A` list.


- **getDrops** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getDrops(org.bukkit.inventory.ItemStack)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` list.


- **getDrops** (`Tool, Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getDrops(org.bukkit.inventory.ItemStack,org.bukkit.entity.Entity)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@r** `A` list.


- **getLightLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getLightLevel()

	- **@r** `An` int.


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getLocation** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getLocation(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **getMaxNearbyEntities** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getMaxNearbyEntities()

	- **@r** `An` int.


- **getMaxSpawnDelay** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getMaxSpawnDelay()

	- **@r** `An` int.


- **getMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` list.


- **getMinSpawnDelay** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getMinSpawnDelay()

	- **@r** `An` int.


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getPotentialSpawns** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getPotentialSpawns()

	- **@r** `A` list.


- **getRawData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getRawData()

	- **@r** `An` int.


- **getRequiredPlayerRange** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getRequiredPlayerRange()

	- **@r** `An` int.


- **getSpawnCount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getSpawnCount()

	- **@r** `An` int.


- **getSpawnRange** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getSpawnRange()

	- **@r** `An` int.


- **getSpawnedEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getSpawnedEntity()

	- **@r** `An` [EntitySnapshot](EntitySnapshot.aus.md).


- **getSpawnedType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getSpawnedType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getType()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **getX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getX()

	- **@r** `An` int.


- **getY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getY()

	- **@r** `An` int.


- **getZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#getZ()

	- **@r** `An` int.


- **hasMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#hasMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` bool.


- **isActivated** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#isActivated()

	- **@r** `A` bool.


- **isCollidable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#isCollidable()

	- **@r** `A` bool.


- **isPlaced** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#isPlaced()

	- **@r** `A` bool.


- **isSnapshot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#isSnapshot()

	- **@r** `A` bool.


- **isSuffocating** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#isSuffocating()

	- **@r** `A` bool.


- **resetTimer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#resetTimer()



- **setBlockData** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#setBlockData(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).


- **setCreatureTypeByName** (`CreatureType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#setCreatureTypeByName(java.lang.String)

	- **@p** `CreatureType` is a string.


- **setDelay** (`Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#setDelay(int)

	- **@p** `Delay` is an int.


- **setMaxNearbyEntities** (`MaxNearbyEntities`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#setMaxNearbyEntities(int)

	- **@p** `MaxNearbyEntities` is an int.


- **setMaxSpawnDelay** (`Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#setMaxSpawnDelay(int)

	- **@p** `Delay` is an int.


- **setMetadata** (`MetadataKey, NewMetadataValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#setMetadata(java.lang.String,org.bukkit.metadata.MetadataValue)

	- **@p** `MetadataKey` is a string.
	- **@p** `NewMetadataValue` is a [MetadataValue](MetadataValue.aus.md).


- **setMinSpawnDelay** (`Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#setMinSpawnDelay(int)

	- **@p** `Delay` is an int.


- **setPotentialSpawns** (`Entries`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#setPotentialSpawns(java.util.Collection)

	- **@p** `Entries` is a list.


- **setRawData** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#setRawData(byte)

	- **@p** `Data` is an int.


- **setRequiredPlayerRange** (`RequiredPlayerRange`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#setRequiredPlayerRange(int)

	- **@p** `RequiredPlayerRange` is an int.


- **setSpawnCount** (`SpawnCount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#setSpawnCount(int)

	- **@p** `SpawnCount` is an int.


- **setSpawnRange** (`SpawnRange`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#setSpawnRange(int)

	- **@p** `SpawnRange` is an int.


- **setSpawnedEntity** (`Snapshot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#setSpawnedEntity(org.bukkit.entity.EntitySnapshot)

	- **@p** `Snapshot` is an [EntitySnapshot](EntitySnapshot.aus.md).


- **setSpawnedEntity\_spawnerentry** (`SpawnerEntry`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#setSpawnedEntity(org.bukkit.block.spawner.SpawnerEntry)

	- **@p** `SpawnerEntry` is a [SpawnerEntry](SpawnerEntry.aus.md).


- **setSpawnedItem** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#setSpawnedItem(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).


- **setSpawnedType** (`CreatureType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#setSpawnedType(org.bukkit.entity.EntityType)

	- **@p** `CreatureType` is an string naming an [EntityType](EntityType.aus.md).


- **setType** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#setType(org.bukkit.Material)

	- **@p** `Type` is a string naming a [Material](Material.aus.md).


- **update** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#update()

	- **@r** `A` bool.


- **update** (`Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#update(boolean)

	- **@p** `Force` is a bool.
	- **@r** `A` bool.


- **update** (`Force, ApplyPhysics`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CreatureSpawner.html#update(boolean,boolean)

	- **@p** `Force` is a bool.
	- **@p** `ApplyPhysics` is a bool.
	- **@r** `A` bool.




