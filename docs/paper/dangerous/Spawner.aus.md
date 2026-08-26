# file: Spawner.aus

## class: Spawner

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.SpawnerShim) **extends: object** 

Generated shim for org.bukkit.spawner.Spawner.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html
In Paper this is a [BaseSpawner](BaseSpawner.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addPotentialSpawn** (`SpawnerEntry`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#addPotentialSpawn(org.bukkit.block.spawner.SpawnerEntry)

	- **@p** `SpawnerEntry` is a [SpawnerEntry](SpawnerEntry.aus.md).


- **addPotentialSpawn** (`Snapshot, Weight, SpawnRule`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#addPotentialSpawn(org.bukkit.entity.EntitySnapshot,int,org.bukkit.block.spawner.SpawnRule)

	- **@p** `Snapshot` is an [EntitySnapshot](EntitySnapshot.aus.md).
	- **@p** `Weight` is an int.
	- **@p** `SpawnRule` is a [SpawnRule](SpawnRule.aus.md).


- **getDelay** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#getDelay()

	- **@r** `An` int.


- **getMaxNearbyEntities** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#getMaxNearbyEntities()

	- **@r** `An` int.


- **getMaxSpawnDelay** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#getMaxSpawnDelay()

	- **@r** `An` int.


- **getMinSpawnDelay** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#getMinSpawnDelay()

	- **@r** `An` int.


- **getPotentialSpawns** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#getPotentialSpawns()

	- **@r** `A` list.


- **getRequiredPlayerRange** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#getRequiredPlayerRange()

	- **@r** `An` int.


- **getSpawnCount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#getSpawnCount()

	- **@r** `An` int.


- **getSpawnRange** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#getSpawnRange()

	- **@r** `An` int.


- **getSpawnedEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#getSpawnedEntity()

	- **@r** `An` [EntitySnapshot](EntitySnapshot.aus.md).


- **getSpawnedType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#getSpawnedType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **isActivated** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#isActivated()

	- **@r** `A` bool.


- **resetTimer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#resetTimer()



- **setDelay** (`Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#setDelay(int)

	- **@p** `Delay` is an int.


- **setMaxNearbyEntities** (`MaxNearbyEntities`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#setMaxNearbyEntities(int)

	- **@p** `MaxNearbyEntities` is an int.


- **setMaxSpawnDelay** (`Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#setMaxSpawnDelay(int)

	- **@p** `Delay` is an int.


- **setMinSpawnDelay** (`Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#setMinSpawnDelay(int)

	- **@p** `Delay` is an int.


- **setPotentialSpawns** (`Entries`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#setPotentialSpawns(java.util.Collection)

	- **@p** `Entries` is a list.


- **setRequiredPlayerRange** (`RequiredPlayerRange`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#setRequiredPlayerRange(int)

	- **@p** `RequiredPlayerRange` is an int.


- **setSpawnCount** (`SpawnCount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#setSpawnCount(int)

	- **@p** `SpawnCount` is an int.


- **setSpawnRange** (`SpawnRange`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#setSpawnRange(int)

	- **@p** `SpawnRange` is an int.


- **setSpawnedEntity** (`Snapshot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#setSpawnedEntity(org.bukkit.entity.EntitySnapshot)

	- **@p** `Snapshot` is an [EntitySnapshot](EntitySnapshot.aus.md).


- **setSpawnedEntity\_spawnerentry** (`SpawnerEntry`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#setSpawnedEntity(org.bukkit.block.spawner.SpawnerEntry)

	- **@p** `SpawnerEntry` is a [SpawnerEntry](SpawnerEntry.aus.md).


- **setSpawnedItem** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#setSpawnedItem(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).


- **setSpawnedType** (`CreatureType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/Spawner.html#setSpawnedType(org.bukkit.entity.EntityType)

	- **@p** `CreatureType` is an string naming an [EntityType](EntityType.aus.md).




