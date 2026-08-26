# file: Chain.aus

## class: Chain

[20:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.ChainShim) **extends: object** 

Generated shim for org.bukkit.block.data.type.Chain.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html
In Paper this is a [Orientable](Orientable.aus.md) and
[Waterlogged](Waterlogged.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **clone** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#clone()

	- **@r** `A` [BlockData](BlockData.aus.md).


- **copyTo** (`Other`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#copyTo(org.bukkit.block.data.BlockData)

	- **@p** `Other` is a [BlockData](BlockData.aus.md).


- **createBlockState** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#createBlockState()

	- **@r** `A` [BlockState](BlockState.aus.md).


- **getAsString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#getAsString()

	- **@r** `A` string.


- **getAsString** (`HideUnspecified`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#getAsString(boolean)

	- **@p** `HideUnspecified` is a bool.
	- **@r** `A` string.


- **getAxes** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#getAxes()

	- **@r** `A` list.


- **getAxis** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#getAxis()

	- **@r** `An` string naming an [Axis](Axis.aus.md).


- **getCollisionShape** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#getCollisionShape(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [VoxelShape](VoxelShape.aus.md).


- **getDestroySpeed** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#getDestroySpeed(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` double.


- **getDestroySpeed** (`ItemStack, ConsiderEnchants`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#getDestroySpeed(org.bukkit.inventory.ItemStack,boolean)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@p** `ConsiderEnchants` is a bool.
	- **@r** `A` double.


- **getLightEmission** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#getLightEmission()

	- **@r** `An` int.


- **getMapColor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#getMapColor()

	- **@r** `A` [Color](Color.aus.md).


- **getMaterial** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#getMaterial()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getPistonMoveReaction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#getPistonMoveReaction()

	- **@r** `A` string naming a [PistonMoveReaction](PistonMoveReaction.aus.md).


- **getPlacementMaterial** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#getPlacementMaterial()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getSoundGroup** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#getSoundGroup()

	- **@r** `A` [SoundGroup](SoundGroup.aus.md).


- **isFaceSturdy** (`Face, Support`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#isFaceSturdy(org.bukkit.block.BlockFace,org.bukkit.block.BlockSupport)

	- **@p** `Face` is a string naming a [BlockFace](BlockFace.aus.md).
	- **@p** `Support` is a string naming a [BlockSupport](BlockSupport.aus.md).
	- **@r** `A` bool.


- **isOccluding** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#isOccluding()

	- **@r** `A` bool.


- **isPreferredTool** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#isPreferredTool(org.bukkit.inventory.ItemStack)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **isRandomlyTicked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#isRandomlyTicked()

	- **@r** `A` bool.


- **isReplaceable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#isReplaceable()

	- **@r** `A` bool.


- **isSupported** (`Block`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#isSupported(org.bukkit.block.Block)

	- **@p** `Block` is a [Block](Block.aus.md).
	- **@r** `A` bool.


- **isSupported\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#isSupported(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **isWaterlogged** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#isWaterlogged()

	- **@r** `A` bool.


- **matches** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#matches(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).
	- **@r** `A` bool.


- **merge** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#merge(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).
	- **@r** `A` [BlockData](BlockData.aus.md).


- **mirror** (`Mirror`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#mirror(org.bukkit.block.structure.Mirror)

	- **@p** `Mirror` is a string naming a [Mirror](Mirror.aus.md).


- **requiresCorrectToolForDrops** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#requiresCorrectToolForDrops()

	- **@r** `A` bool.


- **rotate** (`Rotation`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#rotate(org.bukkit.block.structure.StructureRotation)

	- **@p** `Rotation` is a string naming a [StructureRotation](StructureRotation.aus.md).


- **setAxis** (`Axis`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#setAxis(org.bukkit.Axis)

	- **@p** `Axis` is an string naming an [Axis](Axis.aus.md).


- **setWaterlogged** (`Waterlogged`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Chain.html#setWaterlogged(boolean)

	- **@p** `Waterlogged` is a bool.




