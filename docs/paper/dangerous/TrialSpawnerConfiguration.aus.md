# file: TrialSpawnerConfiguration.aus

## class: TrialSpawnerConfiguration

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.TrialSpawnerConfigurationShim) **extends: object** 

Generated shim for org.bukkit.spawner.TrialSpawnerConfiguration.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html
In Paper this is a [BaseSpawner](BaseSpawner.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addPossibleReward** (`Table, Weight`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#addPossibleReward(org.bukkit.loot.LootTable,int)

	- **@p** `Table` is a [LootTable](LootTable.aus.md).
	- **@p** `Weight` is an int.


- **addPotentialSpawn** (`SpawnerEntry`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#addPotentialSpawn(org.bukkit.block.spawner.SpawnerEntry)

	- **@p** `SpawnerEntry` is a [SpawnerEntry](SpawnerEntry.aus.md).


- **addPotentialSpawn** (`Snapshot, Weight, SpawnRule`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#addPotentialSpawn(org.bukkit.entity.EntitySnapshot,int,org.bukkit.block.spawner.SpawnRule)

	- **@p** `Snapshot` is an [EntitySnapshot](EntitySnapshot.aus.md).
	- **@p** `Weight` is an int.
	- **@p** `SpawnRule` is a [SpawnRule](SpawnRule.aus.md).


- **getAdditionalSimultaneousEntities** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#getAdditionalSimultaneousEntities()

	- **@r** `A` double.


- **getAdditionalSpawnsBeforeCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#getAdditionalSpawnsBeforeCooldown()

	- **@r** `A` double.


- **getBaseSimultaneousEntities** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#getBaseSimultaneousEntities()

	- **@r** `A` double.


- **getBaseSpawnsBeforeCooldown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#getBaseSpawnsBeforeCooldown()

	- **@r** `A` double.


- **getDelay** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#getDelay()

	- **@r** `An` int.


- **getPossibleRewards** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#getPossibleRewards()

	- **@r** `A` map.


- **getPotentialSpawns** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#getPotentialSpawns()

	- **@r** `A` list.


- **getRequiredPlayerRange** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#getRequiredPlayerRange()

	- **@r** `An` int.


- **getSpawnRange** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#getSpawnRange()

	- **@r** `An` int.


- **getSpawnedEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#getSpawnedEntity()

	- **@r** `An` [EntitySnapshot](EntitySnapshot.aus.md).


- **getSpawnedType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#getSpawnedType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **removePossibleReward** (`Table`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#removePossibleReward(org.bukkit.loot.LootTable)

	- **@p** `Table` is a [LootTable](LootTable.aus.md).


- **setAdditionalSimultaneousEntities** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#setAdditionalSimultaneousEntities(float)

	- **@p** `Amount` is a double.


- **setAdditionalSpawnsBeforeCooldown** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#setAdditionalSpawnsBeforeCooldown(float)

	- **@p** `Amount` is a double.


- **setBaseSimultaneousEntities** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#setBaseSimultaneousEntities(float)

	- **@p** `Amount` is a double.


- **setBaseSpawnsBeforeCooldown** (`Amount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#setBaseSpawnsBeforeCooldown(float)

	- **@p** `Amount` is a double.


- **setDelay** (`Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#setDelay(int)

	- **@p** `Delay` is an int.


- **setPossibleRewards** (`Rewards`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#setPossibleRewards(java.util.Map)

	- **@p** `Rewards` is a map.


- **setPotentialSpawns** (`Entries`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#setPotentialSpawns(java.util.Collection)

	- **@p** `Entries` is a list.


- **setRequiredPlayerRange** (`RequiredPlayerRange`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#setRequiredPlayerRange(int)

	- **@p** `RequiredPlayerRange` is an int.


- **setSpawnRange** (`SpawnRange`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#setSpawnRange(int)

	- **@p** `SpawnRange` is an int.


- **setSpawnedEntity** (`Snapshot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#setSpawnedEntity(org.bukkit.entity.EntitySnapshot)

	- **@p** `Snapshot` is an [EntitySnapshot](EntitySnapshot.aus.md).


- **setSpawnedEntity\_spawnerentry** (`SpawnerEntry`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#setSpawnedEntity(org.bukkit.block.spawner.SpawnerEntry)

	- **@p** `SpawnerEntry` is a [SpawnerEntry](SpawnerEntry.aus.md).


- **setSpawnedType** (`CreatureType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/spawner/TrialSpawnerConfiguration.html#setSpawnedType(org.bukkit.entity.EntityType)

	- **@p** `CreatureType` is an string naming an [EntityType](EntityType.aus.md).




