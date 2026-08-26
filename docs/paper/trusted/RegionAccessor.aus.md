# file: RegionAccessor.aus

## class: RegionAccessor

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.RegionAccessorShim) **extends: object** 

Generated shim for org.bukkit.RegionAccessor.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html
In Paper this is a [Keyed](Keyed.aus.md) and
[FeatureFlagSetHolder](FeatureFlagSetHolder.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addEntity** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#addEntity(org.bukkit.entity.Entity)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@r** `An` [Entity](Entity.aus.md).


- **getBiome** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getBiome(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [Biome](Biome.aus.md).


- **getBiome** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getBiome(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` [Biome](Biome.aus.md).


- **getBlockData** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getBlockData(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [BlockData](BlockData.aus.md).


- **getBlockData\_Vector** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getBlockData(org.bukkit.util.Vector)

	- **@p** `Location` is a [Vector](Vector.aus.md).
	- **@r** `A` [BlockData](BlockData.aus.md).


- **getBlockData** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getBlockData(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` [BlockData](BlockData.aus.md).


- **getBlockState** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getBlockState(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [BlockState](BlockState.aus.md).


- **getBlockState\_Vector** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getBlockState(org.bukkit.util.Vector)

	- **@p** `Location` is a [Vector](Vector.aus.md).
	- **@r** `A` [BlockState](BlockState.aus.md).


- **getBlockState** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getBlockState(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` [BlockState](BlockState.aus.md).


- **getComputedBiome** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getComputedBiome(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` [Biome](Biome.aus.md).


- **getEntities** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getEntities()

	- **@r** `A` list.


- **getFeatureFlags** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getFeatureFlags()

	- **@r** `A` list.


- **getFluidData** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getFluidData(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [FluidData](FluidData.aus.md).


- **getFluidData\_position** (`Position`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getFluidData(io.papermc.paper.math.Position)

	- **@p** `Position` is a [Position](Position.aus.md).
	- **@r** `A` [FluidData](FluidData.aus.md).


- **getFluidData** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getFluidData(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` [FluidData](FluidData.aus.md).


- **getHighestBlockYAt** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getHighestBlockYAt(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `An` int.


- **getHighestBlockYAt\_location\_heightmap** (`Location, HeightMap`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getHighestBlockYAt(org.bukkit.Location,org.bukkit.HeightMap)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `HeightMap` is a string naming a [HeightMap](HeightMap.aus.md).
	- **@r** `An` int.


- **getHighestBlockYAt** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getHighestBlockYAt(int,int)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@r** `An` int.


- **getHighestBlockYAt** (`X, Z, HeightMap`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getHighestBlockYAt(int,int,org.bukkit.HeightMap)

	- **@p** `X` is an int.
	- **@p** `Z` is an int.
	- **@p** `HeightMap` is a string naming a [HeightMap](HeightMap.aus.md).
	- **@r** `An` int.


- **getKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getKey()

	- **@r** `A` [NamespacedKey](NamespacedKey.aus.md).


- **getLivingEntities** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getLivingEntities()

	- **@r** `A` list.


- **getMoonPhase** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getMoonPhase()

	- **@r** `A` string naming a [MoonPhase](MoonPhase.aus.md).


- **getType** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getType(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` string naming a [Material](Material.aus.md).


- **getType** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#getType(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` string naming a [Material](Material.aus.md).


- **hasCollisionsIn** (`BoundingBox`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#hasCollisionsIn(org.bukkit.util.BoundingBox)

	- **@p** `BoundingBox` is a [BoundingBox](BoundingBox.aus.md).
	- **@r** `A` bool.


- **isEnabled** (`FeatureDependant`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#isEnabled(io.papermc.paper.world.flag.FeatureDependant)

	- **@p** `FeatureDependant` is a [FeatureDependant](FeatureDependant.aus.md).
	- **@r** `A` bool.


- **lineOfSightExists** (`From, To`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#lineOfSightExists(org.bukkit.Location,org.bukkit.Location)

	- **@p** `From` is a [Location](Location.aus.md).
	- **@p** `To` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **setBiome** (`Location, Biome`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#setBiome(org.bukkit.Location,org.bukkit.block.Biome)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Biome` is a [Biome](Biome.aus.md).


- **setBiome** (`X, Y, Z, Biome`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#setBiome(int,int,int,org.bukkit.block.Biome)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@p** `Biome` is a [Biome](Biome.aus.md).


- **setBlockData** (`Location, BlockData`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#setBlockData(org.bukkit.Location,org.bukkit.block.data.BlockData)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `BlockData` is a [BlockData](BlockData.aus.md).


- **setBlockData\_Vector\_BlockData** (`Location, BlockData`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#setBlockData(org.bukkit.util.Vector,org.bukkit.block.data.BlockData)

	- **@p** `Location` is a [Vector](Vector.aus.md).
	- **@p** `BlockData` is a [BlockData](BlockData.aus.md).


- **setBlockData** (`X, Y, Z, BlockData`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#setBlockData(int,int,int,org.bukkit.block.data.BlockData)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@p** `BlockData` is a [BlockData](BlockData.aus.md).


- **setType** (`Location, Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#setType(org.bukkit.Location,org.bukkit.Material)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Material` is a string naming a [Material](Material.aus.md).


- **setType** (`X, Y, Z, Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#setType(int,int,int,org.bukkit.Material)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@p** `Material` is a string naming a [Material](Material.aus.md).


- **spawnEntity** (`Location, Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#spawnEntity(org.bukkit.Location,org.bukkit.entity.EntityType)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `Type` is an string naming an [EntityType](EntityType.aus.md).
	- **@r** `An` [Entity](Entity.aus.md).


- **spawnEntity\_loc\_type\_reason** (`Loc, Type, Reason`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#spawnEntity(org.bukkit.Location,org.bukkit.entity.EntityType,org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Type` is an string naming an [EntityType](EntityType.aus.md).
	- **@p** `Reason` is a string naming a CreatureSpawnEvent.SpawnReason.
	- **@r** `An` [Entity](Entity.aus.md).


- **spawnEntity** (`Loc, Type, RandomizeData`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/RegionAccessor.html#spawnEntity(org.bukkit.Location,org.bukkit.entity.EntityType,boolean)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Type` is an string naming an [EntityType](EntityType.aus.md).
	- **@p** `RandomizeData` is a bool.
	- **@r** `An` [Entity](Entity.aus.md).




