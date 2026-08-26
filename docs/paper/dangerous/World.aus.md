# file: World.aus

## class: World

[24:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.WorldShim) **extends: object** 

Generated shim for org.bukkit.World.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html
In Paper this is a [RegionAccessor](RegionAccessor.aus.md),
[WorldInfo](WorldInfo.aus.md),
[PluginMessageRecipient](PluginMessageRecipient.aus.md),
[Metadatable](Metadatable.aus.md),
[PersistentDataHolder](PersistentDataHolder.aus.md) and
[Keyed](Keyed.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getName()

	- **@r** `A` string.


- **getPlayerCount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getPlayerCount()

	- **@r** `An` int.


- **getPlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getPlayers()

	- **@r** `A` list.


- **getTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getTime()

	- **@r** `An` int.


- **hasStorm** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#hasStorm()

	- **@r** `A` bool.


- **isThundering** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isThundering()

	- **@r** `A` bool.


- **sendActionBar** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#sendActionBar(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendActionBar\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#sendActionBar(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendMessage** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#sendMessage(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendMessage\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#sendMessage(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **addEntity** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#addEntity(org.bukkit.entity.Entity)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@r** `An` [Entity](Entity.aus.md).


- **audiences** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#audiences()

	- **@r** `An` Iterable.


- **canGenerateStructures** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#canGenerateStructures()

	- **@r** `A` bool.


- **clearResourcePacks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#clearResourcePacks()



- **clearTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#clearTitle()



- **closeDialog** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#closeDialog()



- **createExplosion** (`Source, Power`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#createExplosion(org.bukkit.entity.Entity,float)

	- **@p** `Source` is an [Entity](Entity.aus.md).
	- **@p** `Power` is a double.
	- **@r** `A` bool.


- **createExplosion\_loc\_power** (`Loc, Power`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#createExplosion(org.bukkit.Location,float)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Power` is a double.
	- **@r** `A` bool.


- **createExplosion\_source\_loc\_power** (`Source, Loc, Power`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#createExplosion(org.bukkit.entity.Entity,org.bukkit.Location,float)

	- **@p** `Source` is an [Entity](Entity.aus.md).
	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Power` is a double.
	- **@r** `A` bool.


- **createExplosion** (`Source, Power, SetFire`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#createExplosion(org.bukkit.entity.Entity,float,boolean)

	- **@p** `Source` is an [Entity](Entity.aus.md).
	- **@p** `Power` is a double.
	- **@p** `SetFire` is a bool.
	- **@r** `A` bool.


- **createExplosion\_loc\_power\_setfire** (`Loc, Power, SetFire`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#createExplosion(org.bukkit.Location,float,boolean)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Power` is a double.
	- **@p** `SetFire` is a bool.
	- **@r** `A` bool.


- **createExplosion\_source\_loc\_power\_setfire** (`Source, Loc, Power, SetFire`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#createExplosion(org.bukkit.entity.Entity,org.bukkit.Location,float,boolean)

	- **@p** `Source` is an [Entity](Entity.aus.md).
	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Power` is a double.
	- **@p** `SetFire` is a bool.
	- **@r** `A` bool.


- **createExplosion\_source\_power\_setfire\_breakblocks** (`Source, Power, SetFire, BreakBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#createExplosion(org.bukkit.entity.Entity,float,boolean,boolean)

	- **@p** `Source` is an [Entity](Entity.aus.md).
	- **@p** `Power` is a double.
	- **@p** `SetFire` is a bool.
	- **@p** `BreakBlocks` is a bool.
	- **@r** `A` bool.


- **createExplosion\_loc\_power\_setfire\_breakblocks** (`Loc, Power, SetFire, BreakBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#createExplosion(org.bukkit.Location,float,boolean,boolean)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Power` is a double.
	- **@p** `SetFire` is a bool.
	- **@p** `BreakBlocks` is a bool.
	- **@r** `A` bool.


- **createExplosion** (`X, Y, Z, Power`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#createExplosion(double,double,double,float)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `Power` is a double.
	- **@r** `A` bool.


- **createExplosion\_source\_loc\_power\_setfire\_breakblocks** (`Source, Loc, Power, SetFire, BreakBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#createExplosion(org.bukkit.entity.Entity,org.bukkit.Location,float,boolean,boolean)

	- **@p** `Source` is an [Entity](Entity.aus.md).
	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Power` is a double.
	- **@p** `SetFire` is a bool.
	- **@p** `BreakBlocks` is a bool.
	- **@r** `A` bool.


- **createExplosion\_loc\_power\_setfire\_breakblocks\_source** (`Loc, Power, SetFire, BreakBlocks, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#createExplosion(org.bukkit.Location,float,boolean,boolean,org.bukkit.entity.Entity)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Power` is a double.
	- **@p** `SetFire` is a bool.
	- **@p** `BreakBlocks` is a bool.
	- **@p** `Source` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **createExplosion** (`X, Y, Z, Power, SetFire`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#createExplosion(double,double,double,float,boolean)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `Power` is a double.
	- **@p** `SetFire` is a bool.
	- **@r** `A` bool.


- **createExplosion\_source\_loc\_power\_setfire\_breakblocks\_excludesourcefromdamage** (`Source, Loc, Power, SetFire, BreakBlocks, ExcludeSourceFromDamage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#createExplosion(org.bukkit.entity.Entity,org.bukkit.Location,float,boolean,boolean,boolean)

	- **@p** `Source` is an [Entity](Entity.aus.md).
	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Power` is a double.
	- **@p** `SetFire` is a bool.
	- **@p** `BreakBlocks` is a bool.
	- **@p** `ExcludeSourceFromDamage` is a bool.
	- **@r** `A` bool.


- **createExplosion** (`X, Y, Z, Power, SetFire, BreakBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#createExplosion(double,double,double,float,boolean,boolean)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `Power` is a double.
	- **@p** `SetFire` is a bool.
	- **@p** `BreakBlocks` is a bool.
	- **@r** `A` bool.


- **createExplosion** (`X, Y, Z, Power, SetFire, BreakBlocks, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#createExplosion(double,double,double,float,boolean,boolean,org.bukkit.entity.Entity)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `Power` is a double.
	- **@p** `SetFire` is a bool.
	- **@p** `BreakBlocks` is a bool.
	- **@p** `Source` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **dropItem** (`Location, Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#dropItem(org.bukkit.Location,org.bukkit.inventory.ItemStack)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `An` [Item](Item.aus.md).


- **dropItemNaturally** (`Location, Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#dropItemNaturally(org.bukkit.Location,org.bukkit.inventory.ItemStack)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@r** `An` [Item](Item.aus.md).


- **findLightningRod** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#findLightningRod(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **findLightningTarget** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#findLightningTarget(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **generateTree** (`Location, Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#generateTree(org.bukkit.Location,org.bukkit.TreeType)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Type` is a string naming a [TreeType](TreeType.aus.md).
	- **@r** `A` bool.


- **generateTree** (`Loc, Type, Delegate`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#generateTree(org.bukkit.Location,org.bukkit.TreeType,org.bukkit.BlockChangeDelegate)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Type` is a string naming a [TreeType](TreeType.aus.md).
	- **@p** `Delegate` is a [BlockChangeDelegate](BlockChangeDelegate.aus.md).
	- **@r** `A` bool.


- **getAllowAnimals** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getAllowAnimals()

	- **@r** `A` bool.


- **getAllowMonsters** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getAllowMonsters()

	- **@r** `A` bool.


- **getAmbientSpawnLimit** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getAmbientSpawnLimit()

	- **@r** `An` int.


- **getAnimalSpawnLimit** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getAnimalSpawnLimit()

	- **@r** `An` int.


- **getBiome** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getBiome(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [Biome](Biome.aus.md).


- **getBiome** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getBiome(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` [Biome](Biome.aus.md).


- **getBiome** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getBiome(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` [Biome](Biome.aus.md).


- **getBiomeProvider** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getBiomeProvider()

	- **@r** `A` [BiomeProvider](BiomeProvider.aus.md).


- **getBlockAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getBlockAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [Block](Block.aus.md).


- **getBlockAt** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getBlockAt(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getBlockAtKey** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getBlockAtKey(long)

	- **@p** `Key` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getBlockData** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getBlockData(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [BlockData](BlockData.aus.md).


- **getBlockData\_Vector** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getBlockData(org.bukkit.util.Vector)

	- **@p** `Location` is a [Vector](Vector.aus.md).
	- **@r** `A` [BlockData](BlockData.aus.md).


- **getBlockData** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getBlockData(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` [BlockData](BlockData.aus.md).


- **getBlockState** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getBlockState(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [BlockState](BlockState.aus.md).


- **getBlockState\_Vector** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getBlockState(org.bukkit.util.Vector)

	- **@p** `Location` is a [Vector](Vector.aus.md).
	- **@r** `A` [BlockState](BlockState.aus.md).


- **getBlockState** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getBlockState(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` [BlockState](BlockState.aus.md).


- **getChunkAt\_block** (`Block`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getChunkAt(org.bukkit.block.Block)

	- **@p** `Block` is a [Block](Block.aus.md).
	- **@r** `A` [Chunk](Chunk.aus.md).


- **getChunkAt\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getChunkAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [Chunk](Chunk.aus.md).


- **getChunkAt** (`ChunkKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getChunkAt(long)

	- **@p** `ChunkKey` is an int.
	- **@r** `A` [Chunk](Chunk.aus.md).


- **getChunkAt** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getChunkAt(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` [Chunk](Chunk.aus.md).


- **getChunkAt\_chunkkey\_generate** (`ChunkKey, Generate`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getChunkAt(long,boolean)

	- **@p** `ChunkKey` is an int.
	- **@p** `Generate` is a bool.
	- **@r** `A` [Chunk](Chunk.aus.md).


- **getChunkAt** (`X, Z, Generate`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getChunkAt(int,int,boolean)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@p** `Generate` is a bool.
	- **@r** `A` [Chunk](Chunk.aus.md).


- **getChunkAtAsync** (`Block, Cb`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getChunkAtAsync(org.bukkit.block.Block,org.bukkit.World.ChunkLoadCallback)

	- **@p** `Block` is a [Block](Block.aus.md).
	- **@p** `Cb` is a World.ChunkLoadCallback.


- **getChunkAtAsync\_loc\_cb** (`Loc, Cb`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getChunkAtAsync(org.bukkit.Location,org.bukkit.World.ChunkLoadCallback)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Cb` is a World.ChunkLoadCallback.


- **getChunkAtAsync** (`X, Z, Cb`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getChunkAtAsync(int,int,org.bukkit.World.ChunkLoadCallback)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@p** `Cb` is a World.ChunkLoadCallback.


- **getChunkCount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getChunkCount()

	- **@r** `An` int.


- **getClearWeatherDuration** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getClearWeatherDuration()

	- **@r** `An` int.


- **getComputedBiome** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getComputedBiome(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` [Biome](Biome.aus.md).


- **getCoordinateScale** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getCoordinateScale()

	- **@r** `A` double.


- **getDifficulty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getDifficulty()

	- **@r** `A` string naming a [Difficulty](Difficulty.aus.md).


- **getEmptyChunkSnapshot** (`X, Z, IncludeBiome, IncludeBiomeTemp`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getEmptyChunkSnapshot(int,int,boolean,boolean)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@p** `IncludeBiome` is a bool.
	- **@p** `IncludeBiomeTemp` is a bool.
	- **@r** `A` [ChunkSnapshot](ChunkSnapshot.aus.md).


- **getEnderDragonBattle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getEnderDragonBattle()

	- **@r** `A` [DragonBattle](DragonBattle.aus.md).


- **getEntities** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getEntities()

	- **@r** `A` list.


- **getEntity** (`Uuid`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getEntity(java.util.UUID)

	- **@p** `Uuid` is a string.
	- **@r** `An` [Entity](Entity.aus.md).


- **getEntityCount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getEntityCount()

	- **@r** `An` int.


- **getEnvironment** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getEnvironment()

	- **@r** `A` string naming a World.Environment.


- **getFeatureFlags** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getFeatureFlags()

	- **@r** `A` list.


- **getFluidData** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getFluidData(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [FluidData](FluidData.aus.md).


- **getFluidData\_position** (`Position`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getFluidData(io.papermc.paper.math.Position)

	- **@p** `Position` is a [Position](Position.aus.md).
	- **@r** `A` [FluidData](FluidData.aus.md).


- **getFluidData** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getFluidData(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` [FluidData](FluidData.aus.md).


- **getForceLoadedChunks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getForceLoadedChunks()

	- **@r** `A` list.


- **getFullTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getFullTime()

	- **@r** `An` int.


- **getGameRuleDefault** (`Rule`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getGameRuleDefault(org.bukkit.GameRule)

	- **@p** `Rule` is a [GameRule](GameRule.aus.md).
	- **@r** `An` Object.


- **getGameRuleValue\_GameRule** (`Rule`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getGameRuleValue(org.bukkit.GameRule)

	- **@p** `Rule` is a [GameRule](GameRule.aus.md).
	- **@r** `An` Object.


- **getGameRuleValue** (`Rule`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getGameRuleValue(java.lang.String)

	- **@p** `Rule` is a string.
	- **@r** `A` string.


- **getGameTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getGameTime()

	- **@r** `An` int.


- **getGenerator** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getGenerator()

	- **@r** `A` [ChunkGenerator](ChunkGenerator.aus.md).


- **getHighestBlockAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getHighestBlockAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [Block](Block.aus.md).


- **getHighestBlockAt\_location\_heightmap** (`Location, HeightMap`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getHighestBlockAt(org.bukkit.Location,org.bukkit.HeightMap)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `HeightMap` is a string naming a [HeightMap](HeightMap.aus.md).
	- **@r** `A` [Block](Block.aus.md).


- **getHighestBlockAt** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getHighestBlockAt(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getHighestBlockAt** (`X, Z, HeightMap`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getHighestBlockAt(int,int,org.bukkit.HeightMap)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@p** `HeightMap` is a string naming a [HeightMap](HeightMap.aus.md).
	- **@r** `A` [Block](Block.aus.md).


- **getHighestBlockYAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getHighestBlockYAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `An` int.


- **getHighestBlockYAt\_location\_heightmap** (`Location, HeightMap`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getHighestBlockYAt(org.bukkit.Location,org.bukkit.HeightMap)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `HeightMap` is a string naming a [HeightMap](HeightMap.aus.md).
	- **@r** `An` int.


- **getHighestBlockYAt** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getHighestBlockYAt(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `An` int.


- **getHighestBlockYAt** (`X, Z, HeightMap`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getHighestBlockYAt(int,int,org.bukkit.HeightMap)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@p** `HeightMap` is a string naming a [HeightMap](HeightMap.aus.md).
	- **@r** `An` int.


- **getHumidity** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getHumidity(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` double.


- **getHumidity** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getHumidity(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` double.


- **getInfiniburn** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getInfiniburn()

	- **@r** `A` list.


- **getIntersectingChunks** (`Box`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getIntersectingChunks(org.bukkit.util.BoundingBox)

	- **@p** `Box` is a [BoundingBox](BoundingBox.aus.md).
	- **@r** `A` list.


- **getKeepSpawnInMemory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getKeepSpawnInMemory()

	- **@r** `A` bool.


- **getKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getKey()

	- **@r** `A` [NamespacedKey](NamespacedKey.aus.md).


- **getListeningPluginChannels** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getListeningPluginChannels()

	- **@r** `A` list.


- **getLivingEntities** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getLivingEntities()

	- **@r** `A` list.


- **getLocationAtKey** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getLocationAtKey(long)

	- **@p** `Key` is an int.
	- **@r** `A` [Location](Location.aus.md).


- **getLogicalHeight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getLogicalHeight()

	- **@r** `An` int.


- **getMaxHeight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getMaxHeight()

	- **@r** `An` int.


- **getMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` list.


- **getMinHeight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getMinHeight()

	- **@r** `An` int.


- **getMonsterSpawnLimit** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getMonsterSpawnLimit()

	- **@r** `An` int.


- **getMoonPhase** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getMoonPhase()

	- **@r** `A` string naming a [MoonPhase](MoonPhase.aus.md).


- **getNearbyEntities** (`BoundingBox`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getNearbyEntities(org.bukkit.util.BoundingBox)

	- **@p** `BoundingBox` is a [BoundingBox](BoundingBox.aus.md).
	- **@r** `A` list.


- **getNearbyEntities** (`Location, X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getNearbyEntities(org.bukkit.Location,double,double,double)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` list.


- **getNearbyLivingEntities** (`Loc, Radius`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getNearbyLivingEntities(org.bukkit.Location,double)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Radius` is a double.
	- **@r** `A` list.


- **getNearbyLivingEntities** (`Loc, XzRadius, YRadius`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getNearbyLivingEntities(org.bukkit.Location,double,double)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `XzRadius` is a double.
	- **@p** `YRadius` is a double.
	- **@r** `A` list.


- **getNearbyLivingEntities** (`Loc, XRadius, YRadius, ZRadius`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getNearbyLivingEntities(org.bukkit.Location,double,double,double)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `XRadius` is a double.
	- **@p** `YRadius` is a double.
	- **@p** `ZRadius` is a double.
	- **@r** `A` list.


- **getNearbyPlayers** (`Loc, Radius`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getNearbyPlayers(org.bukkit.Location,double)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Radius` is a double.
	- **@r** `A` list.


- **getNearbyPlayers** (`Loc, XzRadius, YRadius`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getNearbyPlayers(org.bukkit.Location,double,double)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `XzRadius` is a double.
	- **@p** `YRadius` is a double.
	- **@r** `A` list.


- **getNearbyPlayers** (`Loc, XRadius, YRadius, ZRadius`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getNearbyPlayers(org.bukkit.Location,double,double,double)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `XRadius` is a double.
	- **@p** `YRadius` is a double.
	- **@p** `ZRadius` is a double.
	- **@r** `A` list.


- **getNoTickViewDistance** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getNoTickViewDistance()

	- **@r** `An` int.


- **getPVP** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getPVP()

	- **@r** `A` bool.


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getPlayersSeeingChunk** (`Chunk`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getPlayersSeeingChunk(org.bukkit.Chunk)

	- **@p** `Chunk` is a [Chunk](Chunk.aus.md).
	- **@r** `A` list.


- **getPlayersSeeingChunk** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getPlayersSeeingChunk(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` list.


- **getPluginChunkTickets** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getPluginChunkTickets()

	- **@r** `A` map.


- **getPluginChunkTickets** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getPluginChunkTickets(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` list.


- **getPopulators** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getPopulators()

	- **@r** `A` list.


- **getRaid** (`Id`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getRaid(int)

	- **@p** `Id` is an int.
	- **@r** `A` [Raid](Raid.aus.md).


- **getRaids** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getRaids()

	- **@r** `A` list.


- **getSeaLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getSeaLevel()

	- **@r** `An` int.


- **getSeed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getSeed()

	- **@r** `An` int.


- **getSendViewDistance** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getSendViewDistance()

	- **@r** `An` int.


- **getSimulationDistance** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getSimulationDistance()

	- **@r** `An` int.


- **getSpawnLimit** (`SpawnCategory`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getSpawnLimit(org.bukkit.entity.SpawnCategory)

	- **@p** `SpawnCategory` is a string naming a [SpawnCategory](SpawnCategory.aus.md).
	- **@r** `An` int.


- **getSpawnLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getSpawnLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getStructures** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getStructures(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` list.


- **getStructures** (`X, Z, Structure`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getStructures(int,int,org.bukkit.generator.structure.Structure)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@p** `Structure` is a [Structure](Structure.aus.md).
	- **@r** `A` list.


- **getTemperature** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getTemperature(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` double.


- **getTemperature** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getTemperature(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` double.


- **getThunderDuration** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getThunderDuration()

	- **@r** `An` int.


- **getTickableTileEntityCount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getTickableTileEntityCount()

	- **@r** `An` int.


- **getTicksPerAmbientSpawns** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getTicksPerAmbientSpawns()

	- **@r** `An` int.


- **getTicksPerAnimalSpawns** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getTicksPerAnimalSpawns()

	- **@r** `An` int.


- **getTicksPerMonsterSpawns** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getTicksPerMonsterSpawns()

	- **@r** `An` int.


- **getTicksPerSpawns** (`SpawnCategory`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getTicksPerSpawns(org.bukkit.entity.SpawnCategory)

	- **@p** `SpawnCategory` is a string naming a [SpawnCategory](SpawnCategory.aus.md).
	- **@r** `An` int.


- **getTicksPerWaterAmbientSpawns** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getTicksPerWaterAmbientSpawns()

	- **@r** `An` int.


- **getTicksPerWaterSpawns** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getTicksPerWaterSpawns()

	- **@r** `An` int.


- **getTicksPerWaterUndergroundCreatureSpawns** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getTicksPerWaterUndergroundCreatureSpawns()

	- **@r** `An` int.


- **getTileEntityCount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getTileEntityCount()

	- **@r** `An` int.


- **getType** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getType(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` string naming a [Material](Material.aus.md).


- **getType** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getType(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` string naming a [Material](Material.aus.md).


- **getUID** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getUID()

	- **@r** `A` string.


- **getViewDistance** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getViewDistance()

	- **@r** `An` int.


- **getVoidDamageAmount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getVoidDamageAmount()

	- **@r** `A` double.


- **getVoidDamageMinBuildHeightOffset** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getVoidDamageMinBuildHeightOffset()

	- **@r** `A` double.


- **getWaterAmbientSpawnLimit** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getWaterAmbientSpawnLimit()

	- **@r** `An` int.


- **getWaterAnimalSpawnLimit** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getWaterAnimalSpawnLimit()

	- **@r** `An` int.


- **getWaterUndergroundCreatureSpawnLimit** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getWaterUndergroundCreatureSpawnLimit()

	- **@r** `An` int.


- **getWeatherDuration** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getWeatherDuration()

	- **@r** `An` int.


- **getWorldBorder** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getWorldBorder()

	- **@r** `A` [WorldBorder](WorldBorder.aus.md).


- **getWorldType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#getWorldType()

	- **@r** `A` string naming a [WorldType](WorldType.aus.md).


- **hasBonusChest** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#hasBonusChest()

	- **@r** `A` bool.


- **hasCeiling** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#hasCeiling()

	- **@r** `A` bool.


- **hasCollisionsIn** (`BoundingBox`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#hasCollisionsIn(org.bukkit.util.BoundingBox)

	- **@p** `BoundingBox` is a [BoundingBox](BoundingBox.aus.md).
	- **@r** `A` bool.


- **hasMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#hasMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` bool.


- **hasRaids** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#hasRaids()

	- **@r** `A` bool.


- **hasSkyLight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#hasSkyLight()

	- **@r** `A` bool.


- **hasStructureAt** (`Position, Structure`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#hasStructureAt(io.papermc.paper.math.Position,org.bukkit.generator.structure.Structure)

	- **@p** `Position` is a [Position](Position.aus.md).
	- **@p** `Structure` is a [Structure](Structure.aus.md).
	- **@r** `A` bool.


- **isAutoSave** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isAutoSave()

	- **@r** `A` bool.


- **isBedWorks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isBedWorks()

	- **@r** `A` bool.


- **isChunkForceLoaded** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isChunkForceLoaded(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` bool.


- **isChunkGenerated** (`ChunkKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isChunkGenerated(long)

	- **@p** `ChunkKey` is an int.
	- **@r** `A` bool.


- **isChunkGenerated** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isChunkGenerated(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` bool.


- **isChunkInUse** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isChunkInUse(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` bool.


- **isChunkLoaded** (`Chunk`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isChunkLoaded(org.bukkit.Chunk)

	- **@p** `Chunk` is a [Chunk](Chunk.aus.md).
	- **@r** `A` bool.


- **isChunkLoaded** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isChunkLoaded(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` bool.


- **isClearWeather** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isClearWeather()

	- **@r** `A` bool.


- **isDayTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isDayTime()

	- **@r** `A` bool.


- **isEnabled** (`FeatureDependant`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isEnabled(io.papermc.paper.world.flag.FeatureDependant)

	- **@p** `FeatureDependant` is a [FeatureDependant](FeatureDependant.aus.md).
	- **@r** `A` bool.


- **isFixedTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isFixedTime()

	- **@r** `A` bool.


- **isGameRule** (`Rule`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isGameRule(java.lang.String)

	- **@p** `Rule` is a string.
	- **@r** `A` bool.


- **isHardcore** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isHardcore()

	- **@r** `A` bool.


- **isNatural** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isNatural()

	- **@r** `A` bool.


- **isPiglinSafe** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isPiglinSafe()

	- **@r** `A` bool.


- **isPositionLoaded** (`Position`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isPositionLoaded(io.papermc.paper.math.Position)

	- **@p** `Position` is a [Position](Position.aus.md).
	- **@r** `A` bool.


- **isRespawnAnchorWorks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isRespawnAnchorWorks()

	- **@r** `A` bool.


- **isUltraWarm** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isUltraWarm()

	- **@r** `A` bool.


- **isVoidDamageEnabled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#isVoidDamageEnabled()

	- **@r** `A` bool.


- **lineOfSightExists** (`From, To`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#lineOfSightExists(org.bukkit.Location,org.bukkit.Location)

	- **@p** `From` is a [Location](Location.aus.md).
	- **@p** `To` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **loadChunk** (`Chunk`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#loadChunk(org.bukkit.Chunk)

	- **@p** `Chunk` is a [Chunk](Chunk.aus.md).


- **loadChunk** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#loadChunk(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.


- **loadChunk** (`X, Z, Generate`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#loadChunk(int,int,boolean)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@p** `Generate` is a bool.
	- **@r** `A` bool.


- **locateNearestBiome** (`Origin, Biome, Radius`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#locateNearestBiome(org.bukkit.Location,org.bukkit.block.Biome,int)

	- **@p** `Origin` is a [Location](Location.aus.md).
	- **@p** `Biome` is a [Biome](Biome.aus.md).
	- **@p** `Radius` is an int.
	- **@r** `A` [Location](Location.aus.md).


- **locateNearestBiome** (`Origin, Biome, Radius, Step`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#locateNearestBiome(org.bukkit.Location,org.bukkit.block.Biome,int,int)

	- **@p** `Origin` is a [Location](Location.aus.md).
	- **@p** `Biome` is a [Biome](Biome.aus.md).
	- **@p** `Radius` is an int.
	- **@p** `Step` is an int.
	- **@r** `A` [Location](Location.aus.md).


- **locateNearestPoi** (`Origin, PoiType, Radius`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#locateNearestPoi(org.bukkit.Location,io.papermc.paper.entity.poi.PoiType,int)

	- **@p** `Origin` is a [Location](Location.aus.md).
	- **@p** `PoiType` is a [PoiType](PoiType.aus.md).
	- **@p** `Radius` is an int.
	- **@r** `A` [Location](Location.aus.md).


- **locateNearestPoi** (`Origin, PoiType, Radius, Occupancy`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#locateNearestPoi(org.bukkit.Location,io.papermc.paper.entity.poi.PoiType,int,io.papermc.paper.entity.poi.PoiType.Occupancy)

	- **@p** `Origin` is a [Location](Location.aus.md).
	- **@p** `PoiType` is a [PoiType](PoiType.aus.md).
	- **@p** `Radius` is an int.
	- **@p** `Occupancy` is a PoiType.Occupancy.
	- **@r** `A` [Location](Location.aus.md).


- **locateNearestRaid** (`Location, Radius`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#locateNearestRaid(org.bukkit.Location,int)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Radius` is an int.
	- **@r** `A` [Raid](Raid.aus.md).


- **locateNearestStructure** (`Origin, Structure, Radius, FindUnexplored`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#locateNearestStructure(org.bukkit.Location,org.bukkit.generator.structure.Structure,int,boolean)

	- **@p** `Origin` is a [Location](Location.aus.md).
	- **@p** `Structure` is a [Structure](Structure.aus.md).
	- **@p** `Radius` is an int.
	- **@p** `FindUnexplored` is a bool.
	- **@r** `A` [StructureSearchResult](StructureSearchResult.aus.md).


- **locateNearestStructure\_Location\_StructureType\_int\_boolean** (`Origin, StructureType, Radius, FindUnexplored`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#locateNearestStructure(org.bukkit.Location,org.bukkit.StructureType,int,boolean)

	- **@p** `Origin` is a [Location](Location.aus.md).
	- **@p** `StructureType` is a [StructureType](StructureType.aus.md).
	- **@p** `Radius` is an int.
	- **@p** `FindUnexplored` is a bool.
	- **@r** `A` [Location](Location.aus.md).


- **locateNearestStructure\_Location\_StructureType\_int\_boolean2** (`Origin, StructureType, Radius, FindUnexplored`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#locateNearestStructure(org.bukkit.Location,org.bukkit.generator.structure.StructureType,int,boolean)

	- **@p** `Origin` is a [Location](Location.aus.md).
	- **@p** `StructureType` is a [StructureType](StructureType.aus.md).
	- **@p** `Radius` is an int.
	- **@p** `FindUnexplored` is a bool.
	- **@r** `A` [StructureSearchResult](StructureSearchResult.aus.md).


- **playEffect\_Location\_Effect\_Object** (`Location, Effect, Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#playEffect(org.bukkit.Location,org.bukkit.Effect,java.lang.Object)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Effect` is an string naming an [Effect](Effect.aus.md).
	- **@p** `Data` is an Object.


- **playEffect** (`Location, Effect, Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#playEffect(org.bukkit.Location,org.bukkit.Effect,int)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Effect` is an string naming an [Effect](Effect.aus.md).
	- **@p** `Data` is an int.


- **playEffect\_Location\_Effect\_Object\_int** (`Location, Effect, Data, Radius`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#playEffect(org.bukkit.Location,org.bukkit.Effect,java.lang.Object,int)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Effect` is an string naming an [Effect](Effect.aus.md).
	- **@p** `Data` is an Object.
	- **@p** `Radius` is an int.


- **playEffect** (`Location, Effect, Data, Radius`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#playEffect(org.bukkit.Location,org.bukkit.Effect,int,int)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Effect` is an string naming an [Effect](Effect.aus.md).
	- **@p** `Data` is an int.
	- **@p** `Radius` is an int.


- **playNote** (`Loc, Instrument, Note`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#playNote(org.bukkit.Location,org.bukkit.Instrument,org.bukkit.Note)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Instrument` is an string naming an [Instrument](Instrument.aus.md).
	- **@p** `Note` is a [Note](Note.aus.md).


- **playSound\_Entity\_Sound\_float\_float** (`Entity, Sound, Volume, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#playSound(org.bukkit.entity.Entity,org.bukkit.Sound,float,float)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@p** `Sound` is a [Sound](Sound.aus.md).
	- **@p** `Volume` is a double.
	- **@p** `Pitch` is a double.


- **playSound** (`Entity, Sound, Volume, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#playSound(org.bukkit.entity.Entity,java.lang.String,float,float)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@p** `Sound` is a string.
	- **@p** `Volume` is a double.
	- **@p** `Pitch` is a double.


- **playSound\_Location\_Sound\_float\_float** (`Location, Sound, Volume, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#playSound(org.bukkit.Location,org.bukkit.Sound,float,float)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Sound` is a [Sound](Sound.aus.md).
	- **@p** `Volume` is a double.
	- **@p** `Pitch` is a double.


- **playSound\_Location\_String\_float\_float** (`Location, Sound, Volume, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#playSound(org.bukkit.Location,java.lang.String,float,float)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Sound` is a string.
	- **@p** `Volume` is a double.
	- **@p** `Pitch` is a double.


- **playSound\_Entity\_Sound\_SoundCategory\_float\_float** (`Entity, Sound, Category, Volume, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#playSound(org.bukkit.entity.Entity,org.bukkit.Sound,org.bukkit.SoundCategory,float,float)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@p** `Sound` is a [Sound](Sound.aus.md).
	- **@p** `Category` is a string naming a [SoundCategory](SoundCategory.aus.md).
	- **@p** `Volume` is a double.
	- **@p** `Pitch` is a double.


- **playSound** (`Entity, Sound, Category, Volume, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#playSound(org.bukkit.entity.Entity,java.lang.String,org.bukkit.SoundCategory,float,float)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@p** `Sound` is a string.
	- **@p** `Category` is a string naming a [SoundCategory](SoundCategory.aus.md).
	- **@p** `Volume` is a double.
	- **@p** `Pitch` is a double.


- **playSound\_Location\_Sound\_SoundCategory\_float\_float** (`Location, Sound, Category, Volume, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#playSound(org.bukkit.Location,org.bukkit.Sound,org.bukkit.SoundCategory,float,float)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Sound` is a [Sound](Sound.aus.md).
	- **@p** `Category` is a string naming a [SoundCategory](SoundCategory.aus.md).
	- **@p** `Volume` is a double.
	- **@p** `Pitch` is a double.


- **playSound\_Location\_String\_SoundCategory\_float\_float** (`Location, Sound, Category, Volume, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#playSound(org.bukkit.Location,java.lang.String,org.bukkit.SoundCategory,float,float)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Sound` is a string.
	- **@p** `Category` is a string naming a [SoundCategory](SoundCategory.aus.md).
	- **@p** `Volume` is a double.
	- **@p** `Pitch` is a double.


- **playSound\_Entity\_Sound\_SoundCategory\_float\_float\_long** (`Entity, Sound, Category, Volume, Pitch, Seed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#playSound(org.bukkit.entity.Entity,org.bukkit.Sound,org.bukkit.SoundCategory,float,float,long)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@p** `Sound` is a [Sound](Sound.aus.md).
	- **@p** `Category` is a string naming a [SoundCategory](SoundCategory.aus.md).
	- **@p** `Volume` is a double.
	- **@p** `Pitch` is a double.
	- **@p** `Seed` is an int.


- **playSound** (`Entity, Sound, Category, Volume, Pitch, Seed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#playSound(org.bukkit.entity.Entity,java.lang.String,org.bukkit.SoundCategory,float,float,long)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@p** `Sound` is a string.
	- **@p** `Category` is a string naming a [SoundCategory](SoundCategory.aus.md).
	- **@p** `Volume` is a double.
	- **@p** `Pitch` is a double.
	- **@p** `Seed` is an int.


- **playSound\_Location\_Sound\_SoundCategory\_float\_float\_long** (`Location, Sound, Category, Volume, Pitch, Seed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#playSound(org.bukkit.Location,org.bukkit.Sound,org.bukkit.SoundCategory,float,float,long)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Sound` is a [Sound](Sound.aus.md).
	- **@p** `Category` is a string naming a [SoundCategory](SoundCategory.aus.md).
	- **@p** `Volume` is a double.
	- **@p** `Pitch` is a double.
	- **@p** `Seed` is an int.


- **playSound\_Location\_String\_SoundCategory\_float\_float\_long** (`Location, Sound, Category, Volume, Pitch, Seed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#playSound(org.bukkit.Location,java.lang.String,org.bukkit.SoundCategory,float,float,long)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Sound` is a string.
	- **@p** `Category` is a string naming a [SoundCategory](SoundCategory.aus.md).
	- **@p** `Volume` is a double.
	- **@p** `Pitch` is a double.
	- **@p** `Seed` is an int.


- **rayTraceBlocks** (`Start, Direction, MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#rayTraceBlocks(org.bukkit.Location,org.bukkit.util.Vector,double)

	- **@p** `Start` is a [Location](Location.aus.md).
	- **@p** `Direction` is a [Vector](Vector.aus.md).
	- **@p** `MaxDistance` is a double.
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **rayTraceBlocks** (`Start, Direction, MaxDistance, FluidCollisionMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#rayTraceBlocks(org.bukkit.Location,org.bukkit.util.Vector,double,org.bukkit.FluidCollisionMode)

	- **@p** `Start` is a [Location](Location.aus.md).
	- **@p** `Direction` is a [Vector](Vector.aus.md).
	- **@p** `MaxDistance` is a double.
	- **@p** `FluidCollisionMode` is a string naming a [FluidCollisionMode](FluidCollisionMode.aus.md).
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **rayTraceBlocks** (`Start, Direction, MaxDistance, FluidCollisionMode, IgnorePassableBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#rayTraceBlocks(org.bukkit.Location,org.bukkit.util.Vector,double,org.bukkit.FluidCollisionMode,boolean)

	- **@p** `Start` is a [Location](Location.aus.md).
	- **@p** `Direction` is a [Vector](Vector.aus.md).
	- **@p** `MaxDistance` is a double.
	- **@p** `FluidCollisionMode` is a string naming a [FluidCollisionMode](FluidCollisionMode.aus.md).
	- **@p** `IgnorePassableBlocks` is a bool.
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **rayTraceEntities** (`Start, Direction, MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#rayTraceEntities(org.bukkit.Location,org.bukkit.util.Vector,double)

	- **@p** `Start` is a [Location](Location.aus.md).
	- **@p** `Direction` is a [Vector](Vector.aus.md).
	- **@p** `MaxDistance` is a double.
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **rayTraceEntities** (`Start, Direction, MaxDistance, RaySize`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#rayTraceEntities(org.bukkit.Location,org.bukkit.util.Vector,double,double)

	- **@p** `Start` is a [Location](Location.aus.md).
	- **@p** `Direction` is a [Vector](Vector.aus.md).
	- **@p** `MaxDistance` is a double.
	- **@p** `RaySize` is a double.
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **refreshChunk** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#refreshChunk(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` bool.


- **regenerateChunk** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#regenerateChunk(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` bool.


- **removeResourcePacks** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#removeResourcePacks(java.lang.Iterable)

	- **@p** `A0` is an Iterable.


- **resetTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#resetTitle()



- **save** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#save()



- **save** (`Flush`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#save(boolean)

	- **@p** `Flush` is a bool.


- **sendGameEvent** (`SourceEntity, GameEvent, Position`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#sendGameEvent(org.bukkit.entity.Entity,org.bukkit.GameEvent,org.bukkit.util.Vector)

	- **@p** `SourceEntity` is an [Entity](Entity.aus.md).
	- **@p** `GameEvent` is a [GameEvent](GameEvent.aus.md).
	- **@p** `Position` is a [Vector](Vector.aus.md).


- **sendPlayerListFooter** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#sendPlayerListFooter(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListFooter\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#sendPlayerListFooter(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeader** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#sendPlayerListHeader(net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.


- **sendPlayerListHeader\_ComponentLike** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#sendPlayerListHeader(net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.


- **sendPlayerListHeaderAndFooter** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.Component,net.kyori.adventure.text.Component)

	- **@p** `A0` is a Component.
	- **@p** `A1` is a Component.


- **sendPlayerListHeaderAndFooter\_ComponentLike\_ComponentLike** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#sendPlayerListHeaderAndFooter(net.kyori.adventure.text.ComponentLike,net.kyori.adventure.text.ComponentLike)

	- **@p** `A0` is a ComponentLike.
	- **@p** `A1` is a ComponentLike.


- **setAllowMonsterSpawning** (`AllowMonsters`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setAllowMonsterSpawning(boolean)

	- **@p** `AllowMonsters` is a bool.


- **setAmbientSpawnLimit** (`Limit`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setAmbientSpawnLimit(int)

	- **@p** `Limit` is an int.


- **setAnimalSpawnLimit** (`Limit`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setAnimalSpawnLimit(int)

	- **@p** `Limit` is an int.


- **setAutoSave** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setAutoSave(boolean)

	- **@p** `Value` is a bool.


- **setBiome** (`Location, Biome`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setBiome(org.bukkit.Location,org.bukkit.block.Biome)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Biome` is a [Biome](Biome.aus.md).


- **setBiome** (`X, Z, Bio`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setBiome(int,int,org.bukkit.block.Biome)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@p** `Bio` is a [Biome](Biome.aus.md).


- **setBiome** (`X, Y, Z, Biome`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setBiome(int,int,int,org.bukkit.block.Biome)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@p** `Biome` is a [Biome](Biome.aus.md).


- **setBlockData** (`Location, BlockData`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setBlockData(org.bukkit.Location,org.bukkit.block.data.BlockData)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `BlockData` is a [BlockData](BlockData.aus.md).


- **setBlockData\_Vector\_BlockData** (`Location, BlockData`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setBlockData(org.bukkit.util.Vector,org.bukkit.block.data.BlockData)

	- **@p** `Location` is a [Vector](Vector.aus.md).
	- **@p** `BlockData` is a [BlockData](BlockData.aus.md).


- **setBlockData** (`X, Y, Z, BlockData`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setBlockData(int,int,int,org.bukkit.block.data.BlockData)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@p** `BlockData` is a [BlockData](BlockData.aus.md).


- **setChunkForceLoaded** (`X, Z, Forced`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setChunkForceLoaded(int,int,boolean)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@p** `Forced` is a bool.


- **setClearWeatherDuration** (`Duration`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setClearWeatherDuration(int)

	- **@p** `Duration` is an int.


- **setDifficulty** (`Difficulty`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setDifficulty(org.bukkit.Difficulty)

	- **@p** `Difficulty` is a string naming a [Difficulty](Difficulty.aus.md).


- **setFullTime** (`Time`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setFullTime(long)

	- **@p** `Time` is an int.


- **setGameRule** (`Rule, NewValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setGameRule(org.bukkit.GameRule,java.lang.Object)

	- **@p** `Rule` is a [GameRule](GameRule.aus.md).
	- **@p** `NewValue` is an Object.
	- **@r** `A` bool.


- **setGameRuleValue** (`Rule, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setGameRuleValue(java.lang.String,java.lang.String)

	- **@p** `Rule` is a string.
	- **@p** `Value` is a string.
	- **@r** `A` bool.


- **setHardcore** (`Hardcore`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setHardcore(boolean)

	- **@p** `Hardcore` is a bool.


- **setKeepSpawnInMemory** (`KeepLoaded`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setKeepSpawnInMemory(boolean)

	- **@p** `KeepLoaded` is a bool.


- **setMetadata** (`MetadataKey, NewMetadataValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setMetadata(java.lang.String,org.bukkit.metadata.MetadataValue)

	- **@p** `MetadataKey` is a string.
	- **@p** `NewMetadataValue` is a [MetadataValue](MetadataValue.aus.md).


- **setMonsterSpawnLimit** (`Limit`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setMonsterSpawnLimit(int)

	- **@p** `Limit` is an int.


- **setNoTickViewDistance** (`ViewDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setNoTickViewDistance(int)

	- **@p** `ViewDistance` is an int.


- **setPVP** (`Pvp`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setPVP(boolean)

	- **@p** `Pvp` is a bool.


- **setSendViewDistance** (`ViewDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setSendViewDistance(int)

	- **@p** `ViewDistance` is an int.


- **setSimulationDistance** (`SimulationDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setSimulationDistance(int)

	- **@p** `SimulationDistance` is an int.


- **setSpawnFlags** (`AllowMonsters, AllowAnimals`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setSpawnFlags(boolean,boolean)

	- **@p** `AllowMonsters` is a bool.
	- **@p** `AllowAnimals` is a bool.


- **setSpawnLimit** (`SpawnCategory, Limit`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setSpawnLimit(org.bukkit.entity.SpawnCategory,int)

	- **@p** `SpawnCategory` is a string naming a [SpawnCategory](SpawnCategory.aus.md).
	- **@p** `Limit` is an int.


- **setSpawnLocation** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setSpawnLocation(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **setSpawnLocation** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setSpawnLocation(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` bool.


- **setSpawnLocation** (`X, Y, Z, Yaw`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setSpawnLocation(int,int,int,float)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@p** `Yaw` is a double.
	- **@r** `A` bool.


- **setStorm** (`HasStorm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setStorm(boolean)

	- **@p** `HasStorm` is a bool.


- **setThunderDuration** (`Duration`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setThunderDuration(int)

	- **@p** `Duration` is an int.


- **setThundering** (`Thundering`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setThundering(boolean)

	- **@p** `Thundering` is a bool.


- **setTicksPerAmbientSpawns** (`TicksPerAmbientSpawns`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setTicksPerAmbientSpawns(int)

	- **@p** `TicksPerAmbientSpawns` is an int.


- **setTicksPerAnimalSpawns** (`TicksPerAnimalSpawns`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setTicksPerAnimalSpawns(int)

	- **@p** `TicksPerAnimalSpawns` is an int.


- **setTicksPerMonsterSpawns** (`TicksPerMonsterSpawns`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setTicksPerMonsterSpawns(int)

	- **@p** `TicksPerMonsterSpawns` is an int.


- **setTicksPerSpawns** (`SpawnCategory, TicksPerCategorySpawn`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setTicksPerSpawns(org.bukkit.entity.SpawnCategory,int)

	- **@p** `SpawnCategory` is a string naming a [SpawnCategory](SpawnCategory.aus.md).
	- **@p** `TicksPerCategorySpawn` is an int.


- **setTicksPerWaterAmbientSpawns** (`TicksPerWaterAmbientSpawns`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setTicksPerWaterAmbientSpawns(int)

	- **@p** `TicksPerWaterAmbientSpawns` is an int.


- **setTicksPerWaterSpawns** (`TicksPerWaterSpawns`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setTicksPerWaterSpawns(int)

	- **@p** `TicksPerWaterSpawns` is an int.


- **setTicksPerWaterUndergroundCreatureSpawns** (`TicksPerWaterUndergroundCreatureSpawns`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setTicksPerWaterUndergroundCreatureSpawns(int)

	- **@p** `TicksPerWaterUndergroundCreatureSpawns` is an int.


- **setTime** (`Time`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setTime(long)

	- **@p** `Time` is an int.


- **setType** (`Location, Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setType(org.bukkit.Location,org.bukkit.Material)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Material` is a string naming a [Material](Material.aus.md).


- **setType** (`X, Y, Z, Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setType(int,int,int,org.bukkit.Material)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@p** `Material` is a string naming a [Material](Material.aus.md).


- **setViewDistance** (`ViewDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setViewDistance(int)

	- **@p** `ViewDistance` is an int.


- **setVoidDamageAmount** (`VoidDamageAmount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setVoidDamageAmount(float)

	- **@p** `VoidDamageAmount` is a double.


- **setVoidDamageEnabled** (`Enabled`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setVoidDamageEnabled(boolean)

	- **@p** `Enabled` is a bool.


- **setVoidDamageMinBuildHeightOffset** (`MinBuildHeightOffset`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setVoidDamageMinBuildHeightOffset(double)

	- **@p** `MinBuildHeightOffset` is a double.


- **setWaterAmbientSpawnLimit** (`Limit`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setWaterAmbientSpawnLimit(int)

	- **@p** `Limit` is an int.


- **setWaterAnimalSpawnLimit** (`Limit`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setWaterAnimalSpawnLimit(int)

	- **@p** `Limit` is an int.


- **setWaterUndergroundCreatureSpawnLimit** (`Limit`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setWaterUndergroundCreatureSpawnLimit(int)

	- **@p** `Limit` is an int.


- **setWeatherDuration** (`Duration`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#setWeatherDuration(int)

	- **@p** `Duration` is an int.


- **spawnArrow** (`Location, Direction, Speed, Spread`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnArrow(org.bukkit.Location,org.bukkit.util.Vector,float,float)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Direction` is a [Vector](Vector.aus.md).
	- **@p** `Speed` is a double.
	- **@p** `Spread` is a double.
	- **@r** `An` [Arrow](Arrow.aus.md).


- **spawnEntity** (`Location, Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnEntity(org.bukkit.Location,org.bukkit.entity.EntityType)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Type` is an string naming an [EntityType](EntityType.aus.md).
	- **@r** `An` [Entity](Entity.aus.md).


- **spawnEntity\_loc\_type\_reason** (`Loc, Type, Reason`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnEntity(org.bukkit.Location,org.bukkit.entity.EntityType,org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Type` is an string naming an [EntityType](EntityType.aus.md).
	- **@p** `Reason` is a string naming a CreatureSpawnEvent.SpawnReason.
	- **@r** `An` [Entity](Entity.aus.md).


- **spawnEntity** (`Loc, Type, RandomizeData`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnEntity(org.bukkit.Location,org.bukkit.entity.EntityType,boolean)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Type` is an string naming an [EntityType](EntityType.aus.md).
	- **@p** `RandomizeData` is a bool.
	- **@r** `An` [Entity](Entity.aus.md).


- **spawnFallingBlock** (`Location, Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnFallingBlock(org.bukkit.Location,org.bukkit.block.data.BlockData)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Data` is a [BlockData](BlockData.aus.md).
	- **@r** `A` [FallingBlock](FallingBlock.aus.md).


- **spawnFallingBlock\_Location\_MaterialData** (`Location, Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnFallingBlock(org.bukkit.Location,org.bukkit.material.MaterialData)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Data` is a [MaterialData](MaterialData.aus.md).
	- **@r** `A` [FallingBlock](FallingBlock.aus.md).


- **spawnFallingBlock** (`Location, Material, Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnFallingBlock(org.bukkit.Location,org.bukkit.Material,byte)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@p** `Data` is an int.
	- **@r** `A` [FallingBlock](FallingBlock.aus.md).


- **spawnParticle** (`Particle, Location, Count`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnParticle(org.bukkit.Particle,org.bukkit.Location,int)

	- **@p** `Particle` is a string naming a [Particle](Particle.aus.md).
	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Count` is an int.


- **spawnParticle** (`Particle, Location, Count, Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnParticle(org.bukkit.Particle,org.bukkit.Location,int,java.lang.Object)

	- **@p** `Particle` is a string naming a [Particle](Particle.aus.md).
	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Count` is an int.
	- **@p** `Data` is an Object.


- **spawnParticle** (`Particle, X, Y, Z, Count`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnParticle(org.bukkit.Particle,double,double,double,int)

	- **@p** `Particle` is a string naming a [Particle](Particle.aus.md).
	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `Count` is an int.


- **spawnParticle** (`Particle, Location, Count, OffsetX, OffsetY, OffsetZ`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnParticle(org.bukkit.Particle,org.bukkit.Location,int,double,double,double)

	- **@p** `Particle` is a string naming a [Particle](Particle.aus.md).
	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Count` is an int.
	- **@p** `OffsetX` is a double.
	- **@p** `OffsetY` is a double.
	- **@p** `OffsetZ` is a double.


- **spawnParticle\_particle\_x\_y\_z\_count\_data** (`Particle, X, Y, Z, Count, Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnParticle(org.bukkit.Particle,double,double,double,int,java.lang.Object)

	- **@p** `Particle` is a string naming a [Particle](Particle.aus.md).
	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `Count` is an int.
	- **@p** `Data` is an Object.


- **spawnParticle\_particle\_location\_count\_offsetx\_offsety\_offsetz\_data** (`Particle, Location, Count, OffsetX, OffsetY, OffsetZ, Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnParticle(org.bukkit.Particle,org.bukkit.Location,int,double,double,double,java.lang.Object)

	- **@p** `Particle` is a string naming a [Particle](Particle.aus.md).
	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Count` is an int.
	- **@p** `OffsetX` is a double.
	- **@p** `OffsetY` is a double.
	- **@p** `OffsetZ` is a double.
	- **@p** `Data` is an Object.


- **spawnParticle** (`Particle, Location, Count, OffsetX, OffsetY, OffsetZ, Extra`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnParticle(org.bukkit.Particle,org.bukkit.Location,int,double,double,double,double)

	- **@p** `Particle` is a string naming a [Particle](Particle.aus.md).
	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Count` is an int.
	- **@p** `OffsetX` is a double.
	- **@p** `OffsetY` is a double.
	- **@p** `OffsetZ` is a double.
	- **@p** `Extra` is a double.


- **spawnParticle\_Particle\_Location\_int\_double\_double\_double\_double\_Object** (`Particle, X, Y, Z, Count, OffsetX, OffsetY, OffsetZ`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnParticle(org.bukkit.Particle,org.bukkit.Location,int,double,double,double,double,java.lang.Object)

	- **@p** `Particle` is a string naming a [Particle](Particle.aus.md).
	- **@p** `X` is a [Location](Location.aus.md).
	- **@p** `Y` is an int.
	- **@p** `Z` is a double.
	- **@p** `Count` is a double.
	- **@p** `OffsetX` is a double.
	- **@p** `OffsetY` is a double.
	- **@p** `OffsetZ` is an Object.


- **spawnParticle** (`Particle, X, Y, Z, Count, OffsetX, OffsetY, OffsetZ`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnParticle(org.bukkit.Particle,double,double,double,int,double,double,double)

	- **@p** `Particle` is a string naming a [Particle](Particle.aus.md).
	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `Count` is an int.
	- **@p** `OffsetX` is a double.
	- **@p** `OffsetY` is a double.
	- **@p** `OffsetZ` is a double.


- **spawnParticle\_Particle\_Location\_int\_double\_double\_double\_double\_Object\_boolean** (`Particle, X, Y, Z, Count, OffsetX, OffsetY, OffsetZ, Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnParticle(org.bukkit.Particle,org.bukkit.Location,int,double,double,double,double,java.lang.Object,boolean)

	- **@p** `Particle` is a string naming a [Particle](Particle.aus.md).
	- **@p** `X` is a [Location](Location.aus.md).
	- **@p** `Y` is an int.
	- **@p** `Z` is a double.
	- **@p** `Count` is a double.
	- **@p** `OffsetX` is a double.
	- **@p** `OffsetY` is a double.
	- **@p** `OffsetZ` is an Object.
	- **@p** `Data` is a bool.


- **spawnParticle\_Particle\_double\_double\_double\_int\_double\_double\_double\_Object** (`Particle, X, Y, Z, Count, OffsetX, OffsetY, OffsetZ, Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnParticle(org.bukkit.Particle,double,double,double,int,double,double,double,java.lang.Object)

	- **@p** `Particle` is a string naming a [Particle](Particle.aus.md).
	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `Count` is an int.
	- **@p** `OffsetX` is a double.
	- **@p** `OffsetY` is a double.
	- **@p** `OffsetZ` is a double.
	- **@p** `Data` is an Object.


- **spawnParticle** (`Particle, X, Y, Z, Count, OffsetX, OffsetY, OffsetZ, Extra`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnParticle(org.bukkit.Particle,double,double,double,int,double,double,double,double)

	- **@p** `Particle` is a string naming a [Particle](Particle.aus.md).
	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `Count` is an int.
	- **@p** `OffsetX` is a double.
	- **@p** `OffsetY` is a double.
	- **@p** `OffsetZ` is a double.
	- **@p** `Extra` is a double.


- **spawnParticle** (`Particle, X, Y, Z, Count, OffsetX, OffsetY, OffsetZ, Extra, Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnParticle(org.bukkit.Particle,double,double,double,int,double,double,double,double,java.lang.Object)

	- **@p** `Particle` is a string naming a [Particle](Particle.aus.md).
	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `Count` is an int.
	- **@p** `OffsetX` is a double.
	- **@p** `OffsetY` is a double.
	- **@p** `OffsetZ` is a double.
	- **@p** `Extra` is a double.
	- **@p** `Data` is an Object.


- **spawnParticle** (`Particle, X, Y, Z, Count, OffsetX, OffsetY, OffsetZ, Extra, Data, Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnParticle(org.bukkit.Particle,double,double,double,int,double,double,double,double,java.lang.Object,boolean)

	- **@p** `Particle` is a string naming a [Particle](Particle.aus.md).
	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `Count` is an int.
	- **@p** `OffsetX` is a double.
	- **@p** `OffsetY` is a double.
	- **@p** `OffsetZ` is a double.
	- **@p** `Extra` is a double.
	- **@p** `Data` is an Object.
	- **@p** `Force` is a bool.


- **spawnParticle** (`Particle, Receivers, Source, X, Y, Z, Count, OffsetX, OffsetY, OffsetZ, Extra, Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnParticle(org.bukkit.Particle,java.util.List,org.bukkit.entity.Player,double,double,double,int,double,double,double,double,java.lang.Object)

	- **@p** `Particle` is a string naming a [Particle](Particle.aus.md).
	- **@p** `Receivers` is a list.
	- **@p** `Source` is a [Player](Player.aus.md).
	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `Count` is an int.
	- **@p** `OffsetX` is a double.
	- **@p** `OffsetY` is a double.
	- **@p** `OffsetZ` is a double.
	- **@p** `Extra` is a double.
	- **@p** `Data` is an Object.


- **spawnParticle** (`Particle, Receivers, Source, X, Y, Z, Count, OffsetX, OffsetY, OffsetZ, Extra, Data, Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spawnParticle(org.bukkit.Particle,java.util.List,org.bukkit.entity.Player,double,double,double,int,double,double,double,double,java.lang.Object,boolean)

	- **@p** `Particle` is a string naming a [Particle](Particle.aus.md).
	- **@p** `Receivers` is a list.
	- **@p** `Source` is a [Player](Player.aus.md).
	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@p** `Count` is an int.
	- **@p** `OffsetX` is a double.
	- **@p** `OffsetY` is a double.
	- **@p** `OffsetZ` is a double.
	- **@p** `Extra` is a double.
	- **@p** `Data` is an Object.
	- **@p** `Force` is a bool.


- **spigot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#spigot()

	- **@r** `A` World.Spigot.


- **strikeLightning** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#strikeLightning(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` [LightningStrike](LightningStrike.aus.md).


- **strikeLightningEffect** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#strikeLightningEffect(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` [LightningStrike](LightningStrike.aus.md).


- **unloadChunk** (`Chunk`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#unloadChunk(org.bukkit.Chunk)

	- **@p** `Chunk` is a [Chunk](Chunk.aus.md).
	- **@r** `A` bool.


- **unloadChunk** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#unloadChunk(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` bool.


- **unloadChunk** (`X, Z, Save`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#unloadChunk(int,int,boolean)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@p** `Save` is a bool.
	- **@r** `A` bool.


- **unloadChunkRequest** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#unloadChunkRequest(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` bool.


- **vanillaBiomeProvider** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#vanillaBiomeProvider()

	- **@r** `A` [BiomeProvider](BiomeProvider.aus.md).


- **addPluginChunkTicket** (`X, Z, Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#addPluginChunkTicket(int,int,org.bukkit.plugin.Plugin)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@r** `A` bool.


- **removeMetadata** (`MetadataKey, OwningPlugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#removeMetadata(java.lang.String,org.bukkit.plugin.Plugin)

	- **@p** `MetadataKey` is a string.
	- **@p** `OwningPlugin` is a [Plugin](Plugin.aus.md).


- **removePluginChunkTicket** (`X, Z, Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#removePluginChunkTicket(int,int,org.bukkit.plugin.Plugin)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@r** `A` bool.


- **removePluginChunkTickets** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/World.html#removePluginChunkTickets(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).




