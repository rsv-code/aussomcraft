# file: Chunk.aus

## class: Chunk

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.ChunkShim) **extends: object** 

Generated shim for org.bukkit.Chunk.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html
In Paper this is a
[PersistentDataHolder](PersistentDataHolder.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **contains** (`Biome`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#contains(org.bukkit.block.Biome)

	- **@p** `Biome` is a [Biome](Biome.aus.md).
	- **@r** `A` bool.


- **contains\_block** (`Block`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#contains(org.bukkit.block.data.BlockData)

	- **@p** `Block` is a [BlockData](BlockData.aus.md).
	- **@r** `A` bool.


- **getBlock** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#getBlock(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getChunkKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#getChunkKey()

	- **@r** `An` int.


- **getChunkKey** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#getChunkKey(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `An` int.


- **getChunkKey** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#getChunkKey(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `An` int.


- **getChunkSnapshot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#getChunkSnapshot()

	- **@r** `A` [ChunkSnapshot](ChunkSnapshot.aus.md).


- **getChunkSnapshot** (`IncludeMaxBlockY, IncludeBiome, IncludeBiomeTempRain`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#getChunkSnapshot(boolean,boolean,boolean)

	- **@p** `IncludeMaxBlockY` is a bool.
	- **@p** `IncludeBiome` is a bool.
	- **@p** `IncludeBiomeTempRain` is a bool.
	- **@r** `A` [ChunkSnapshot](ChunkSnapshot.aus.md).


- **getChunkSnapshot** (`IncludeMaxBlockY, IncludeBiome, IncludeBiomeTempRain, IncludeLightData`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#getChunkSnapshot(boolean,boolean,boolean,boolean)

	- **@p** `IncludeMaxBlockY` is a bool.
	- **@p** `IncludeBiome` is a bool.
	- **@p** `IncludeBiomeTempRain` is a bool.
	- **@p** `IncludeLightData` is a bool.
	- **@r** `A` [ChunkSnapshot](ChunkSnapshot.aus.md).


- **getInhabitedTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#getInhabitedTime()

	- **@r** `An` int.


- **getLoadLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#getLoadLevel()

	- **@r** `A` string naming a Chunk.LoadLevel.


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getPlayersSeeingChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#getPlayersSeeingChunk()

	- **@r** `A` list.


- **getPluginChunkTickets** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#getPluginChunkTickets()

	- **@r** `A` list.


- **getStructures** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#getStructures()

	- **@r** `A` list.


- **getStructures** (`Structure`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#getStructures(org.bukkit.generator.structure.Structure)

	- **@p** `Structure` is a [Structure](Structure.aus.md).
	- **@r** `A` list.


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **getX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#getX()

	- **@r** `An` int.


- **getZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#getZ()

	- **@r** `An` int.


- **isEntitiesLoaded** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#isEntitiesLoaded()

	- **@r** `A` bool.


- **isForceLoaded** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#isForceLoaded()

	- **@r** `A` bool.


- **isGenerated** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#isGenerated()

	- **@r** `A` bool.


- **isLoaded** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#isLoaded()

	- **@r** `A` bool.


- **isSlimeChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#isSlimeChunk()

	- **@r** `A` bool.


- **load** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#load()

	- **@r** `A` bool.


- **load** (`Generate`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#load(boolean)

	- **@p** `Generate` is a bool.
	- **@r** `A` bool.


- **setForceLoaded** (`Forced`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#setForceLoaded(boolean)

	- **@p** `Forced` is a bool.


- **setInhabitedTime** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#setInhabitedTime(long)

	- **@p** `Ticks` is an int.


- **unload** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#unload()

	- **@r** `A` bool.


- **unload** (`Save`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Chunk.html#unload(boolean)

	- **@p** `Save` is a bool.
	- **@r** `A` bool.




