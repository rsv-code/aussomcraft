# file: Block.aus

## class: Block

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.BlockShim) **extends: object** 

Generated shim for org.bukkit.block.Block.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html
In Paper this is a [Metadatable](Metadatable.aus.md) and
[Translatable](Translatable.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getType()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **getX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getX()

	- **@r** `An` int.


- **getY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getY()

	- **@r** `An` int.


- **getZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getZ()

	- **@r** `An` int.


- **isEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#isEmpty()

	- **@r** `A` bool.


- **applyBoneMeal** (`Face`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#applyBoneMeal(org.bukkit.block.BlockFace)

	- **@p** `Face` is a string naming a [BlockFace](BlockFace.aus.md).
	- **@r** `A` bool.


- **breakNaturally** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#breakNaturally()

	- **@r** `A` bool.


- **breakNaturally\_tool** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#breakNaturally(org.bukkit.inventory.ItemStack)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **breakNaturally** (`TriggerEffect`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#breakNaturally(boolean)

	- **@p** `TriggerEffect` is a bool.
	- **@r** `A` bool.


- **breakNaturally\_tool\_triggereffect** (`Tool, TriggerEffect`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#breakNaturally(org.bukkit.inventory.ItemStack,boolean)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@p** `TriggerEffect` is a bool.
	- **@r** `A` bool.


- **breakNaturally** (`TriggerEffect, DropExperience`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#breakNaturally(boolean,boolean)

	- **@p** `TriggerEffect` is a bool.
	- **@p** `DropExperience` is a bool.
	- **@r** `A` bool.


- **breakNaturally** (`Tool, TriggerEffect, DropExperience`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#breakNaturally(org.bukkit.inventory.ItemStack,boolean,boolean)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@p** `TriggerEffect` is a bool.
	- **@p** `DropExperience` is a bool.
	- **@r** `A` bool.


- **breakNaturally** (`Tool, TriggerEffect, DropExperience, ForceEffect`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#breakNaturally(org.bukkit.inventory.ItemStack,boolean,boolean,boolean)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@p** `TriggerEffect` is a bool.
	- **@p** `DropExperience` is a bool.
	- **@p** `ForceEffect` is a bool.
	- **@r** `A` bool.


- **canPlace** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#canPlace(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).
	- **@r** `A` bool.


- **fluidTick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#fluidTick()



- **getBiome** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getBiome()

	- **@r** `A` [Biome](Biome.aus.md).


- **getBlockData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getBlockData()

	- **@r** `A` [BlockData](BlockData.aus.md).


- **getBlockKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getBlockKey()

	- **@r** `An` int.


- **getBlockKey** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getBlockKey(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `An` int.


- **getBlockKeyX** (`Packed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getBlockKeyX(long)

	- **@p** `Packed` is an int.
	- **@r** `An` int.


- **getBlockKeyY** (`Packed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getBlockKeyY(long)

	- **@p** `Packed` is an int.
	- **@r** `An` int.


- **getBlockKeyZ** (`Packed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getBlockKeyZ(long)

	- **@p** `Packed` is an int.
	- **@r** `An` int.


- **getBlockPower** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getBlockPower()

	- **@r** `An` int.


- **getBlockPower** (`Face`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getBlockPower(org.bukkit.block.BlockFace)

	- **@p** `Face` is a string naming a [BlockFace](BlockFace.aus.md).
	- **@r** `An` int.


- **getBlockSoundGroup** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getBlockSoundGroup()

	- **@r** `A` [SoundGroup](SoundGroup.aus.md).


- **getBoundingBox** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getBoundingBox()

	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **getBreakSpeed** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getBreakSpeed(org.bukkit.entity.Player)

	- **@p** `Player` is a [Player](Player.aus.md).
	- **@r** `A` double.


- **getChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getChunk()

	- **@r** `A` [Chunk](Chunk.aus.md).


- **getCollisionShape** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getCollisionShape()

	- **@r** `A` [VoxelShape](VoxelShape.aus.md).


- **getComputedBiome** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getComputedBiome()

	- **@r** `A` [Biome](Biome.aus.md).


- **getData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getData()

	- **@r** `An` int.


- **getDestroySpeed** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getDestroySpeed(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` double.


- **getDestroySpeed** (`ItemStack, ConsiderEnchants`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getDestroySpeed(org.bukkit.inventory.ItemStack,boolean)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@p** `ConsiderEnchants` is a bool.
	- **@r** `A` double.


- **getDrops** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getDrops()

	- **@r** `A` list.


- **getDrops** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getDrops(org.bukkit.inventory.ItemStack)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` list.


- **getDrops** (`Tool, Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getDrops(org.bukkit.inventory.ItemStack,org.bukkit.entity.Entity)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@r** `A` list.


- **getFace** (`Block`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getFace(org.bukkit.block.Block)

	- **@p** `Block` is a [Block](Block.aus.md).
	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getHumidity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getHumidity()

	- **@r** `A` double.


- **getLightFromBlocks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getLightFromBlocks()

	- **@r** `An` int.


- **getLightFromSky** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getLightFromSky()

	- **@r** `An` int.


- **getLightLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getLightLevel()

	- **@r** `An` int.


- **getLocation** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getLocation(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **getMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` list.


- **getPistonMoveReaction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getPistonMoveReaction()

	- **@r** `A` string naming a [PistonMoveReaction](PistonMoveReaction.aus.md).


- **getRelative** (`Face`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getRelative(org.bukkit.block.BlockFace)

	- **@p** `Face` is a string naming a [BlockFace](BlockFace.aus.md).
	- **@r** `A` [Block](Block.aus.md).


- **getRelative** (`Face, Distance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getRelative(org.bukkit.block.BlockFace,int)

	- **@p** `Face` is a string naming a [BlockFace](BlockFace.aus.md).
	- **@p** `Distance` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getRelative** (`ModX, ModY, ModZ`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getRelative(int,int,int)

	- **@p** `ModX` is an int.
	- **@p** `ModY` is an int.
	- **@p** `ModZ` is an int.
	- **@r** `A` [Block](Block.aus.md).


- **getSoundGroup** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getSoundGroup()

	- **@r** `A` [BlockSoundGroup](BlockSoundGroup.aus.md).


- **getState** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getState()

	- **@r** `A` [BlockState](BlockState.aus.md).


- **getState** (`UseSnapshot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getState(boolean)

	- **@p** `UseSnapshot` is a bool.
	- **@r** `A` [BlockState](BlockState.aus.md).


- **getTemperature** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getTemperature()

	- **@r** `A` double.


- **getTranslationKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#getTranslationKey()

	- **@r** `A` string.


- **hasMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#hasMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` bool.


- **isBlockFaceIndirectlyPowered** (`Face`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#isBlockFaceIndirectlyPowered(org.bukkit.block.BlockFace)

	- **@p** `Face` is a string naming a [BlockFace](BlockFace.aus.md).
	- **@r** `A` bool.


- **isBlockFacePowered** (`Face`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#isBlockFacePowered(org.bukkit.block.BlockFace)

	- **@p** `Face` is a string naming a [BlockFace](BlockFace.aus.md).
	- **@r** `A` bool.


- **isBlockIndirectlyPowered** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#isBlockIndirectlyPowered()

	- **@r** `A` bool.


- **isBlockPowered** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#isBlockPowered()

	- **@r** `A` bool.


- **isBuildable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#isBuildable()

	- **@r** `A` bool.


- **isBurnable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#isBurnable()

	- **@r** `A` bool.


- **isCollidable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#isCollidable()

	- **@r** `A` bool.


- **isLiquid** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#isLiquid()

	- **@r** `A` bool.


- **isPassable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#isPassable()

	- **@r** `A` bool.


- **isPreferredTool** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#isPreferredTool(org.bukkit.inventory.ItemStack)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **isReplaceable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#isReplaceable()

	- **@r** `A` bool.


- **isSolid** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#isSolid()

	- **@r** `A` bool.


- **isSuffocating** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#isSuffocating()

	- **@r** `A` bool.


- **isValidTool** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#isValidTool(org.bukkit.inventory.ItemStack)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **randomTick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#randomTick()



- **rayTrace** (`Start, Direction, MaxDistance, FluidCollisionMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#rayTrace(org.bukkit.Location,org.bukkit.util.Vector,double,org.bukkit.FluidCollisionMode)

	- **@p** `Start` is a [Location](Location.aus.md).
	- **@p** `Direction` is a [Vector](Vector.aus.md).
	- **@p** `MaxDistance` is a double.
	- **@p** `FluidCollisionMode` is a string naming a [FluidCollisionMode](FluidCollisionMode.aus.md).
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **setBiome** (`Bio`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#setBiome(org.bukkit.block.Biome)

	- **@p** `Bio` is a [Biome](Biome.aus.md).


- **setBlockData** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#setBlockData(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).


- **setBlockData** (`Data, ApplyPhysics`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#setBlockData(org.bukkit.block.data.BlockData,boolean)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).
	- **@p** `ApplyPhysics` is a bool.


- **setMetadata** (`MetadataKey, NewMetadataValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#setMetadata(java.lang.String,org.bukkit.metadata.MetadataValue)

	- **@p** `MetadataKey` is a string.
	- **@p** `NewMetadataValue` is a [MetadataValue](MetadataValue.aus.md).


- **setType** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#setType(org.bukkit.Material)

	- **@p** `Type` is a string naming a [Material](Material.aus.md).


- **setType** (`Type, ApplyPhysics`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#setType(org.bukkit.Material,boolean)

	- **@p** `Type` is a string naming a [Material](Material.aus.md).
	- **@p** `ApplyPhysics` is a bool.


- **tick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#tick()



- **translationKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Block.html#translationKey()

	- **@r** `A` string.




