# file: SculkSensor.aus

## class: SculkSensor

[20:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.SculkSensorShim) **extends: object** 

Generated shim for org.bukkit.block.data.type.SculkSensor.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html
In Paper this is a [AnaloguePowerable](AnaloguePowerable.aus.md)
and [Waterlogged](Waterlogged.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **clone** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#clone()

	- **@r** `A` [BlockData](BlockData.aus.md).


- **copyTo** (`Other`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#copyTo(org.bukkit.block.data.BlockData)

	- **@p** `Other` is a [BlockData](BlockData.aus.md).


- **createBlockState** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#createBlockState()

	- **@r** `A` [BlockState](BlockState.aus.md).


- **getAsString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#getAsString()

	- **@r** `A` string.


- **getAsString** (`HideUnspecified`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#getAsString(boolean)

	- **@p** `HideUnspecified` is a bool.
	- **@r** `A` string.


- **getCollisionShape** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#getCollisionShape(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [VoxelShape](VoxelShape.aus.md).


- **getDestroySpeed** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#getDestroySpeed(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` double.


- **getDestroySpeed** (`ItemStack, ConsiderEnchants`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#getDestroySpeed(org.bukkit.inventory.ItemStack,boolean)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@p** `ConsiderEnchants` is a bool.
	- **@r** `A` double.


- **getLightEmission** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#getLightEmission()

	- **@r** `An` int.


- **getMapColor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#getMapColor()

	- **@r** `A` [Color](Color.aus.md).


- **getMaterial** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#getMaterial()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getMaximumPower** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#getMaximumPower()

	- **@r** `An` int.


- **getPhase** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#getPhase()

	- **@r** `A` string naming a SculkSensor.Phase.


- **getPistonMoveReaction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#getPistonMoveReaction()

	- **@r** `A` string naming a [PistonMoveReaction](PistonMoveReaction.aus.md).


- **getPlacementMaterial** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#getPlacementMaterial()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getPower** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#getPower()

	- **@r** `An` int.


- **getSculkSensorPhase** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#getSculkSensorPhase()

	- **@r** `A` string naming a SculkSensor.Phase.


- **getSoundGroup** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#getSoundGroup()

	- **@r** `A` [SoundGroup](SoundGroup.aus.md).


- **isFaceSturdy** (`Face, Support`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#isFaceSturdy(org.bukkit.block.BlockFace,org.bukkit.block.BlockSupport)

	- **@p** `Face` is a string naming a [BlockFace](BlockFace.aus.md).
	- **@p** `Support` is a string naming a [BlockSupport](BlockSupport.aus.md).
	- **@r** `A` bool.


- **isOccluding** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#isOccluding()

	- **@r** `A` bool.


- **isPreferredTool** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#isPreferredTool(org.bukkit.inventory.ItemStack)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **isRandomlyTicked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#isRandomlyTicked()

	- **@r** `A` bool.


- **isReplaceable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#isReplaceable()

	- **@r** `A` bool.


- **isSupported** (`Block`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#isSupported(org.bukkit.block.Block)

	- **@p** `Block` is a [Block](Block.aus.md).
	- **@r** `A` bool.


- **isSupported\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#isSupported(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **isWaterlogged** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#isWaterlogged()

	- **@r** `A` bool.


- **matches** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#matches(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).
	- **@r** `A` bool.


- **merge** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#merge(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).
	- **@r** `A` [BlockData](BlockData.aus.md).


- **mirror** (`Mirror`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#mirror(org.bukkit.block.structure.Mirror)

	- **@p** `Mirror` is a string naming a [Mirror](Mirror.aus.md).


- **requiresCorrectToolForDrops** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#requiresCorrectToolForDrops()

	- **@r** `A` bool.


- **rotate** (`Rotation`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#rotate(org.bukkit.block.structure.StructureRotation)

	- **@p** `Rotation` is a string naming a [StructureRotation](StructureRotation.aus.md).


- **setPhase** (`Phase`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#setPhase(org.bukkit.block.data.type.SculkSensor.Phase)

	- **@p** `Phase` is a string naming a SculkSensor.Phase.


- **setPower** (`Power`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#setPower(int)

	- **@p** `Power` is an int.


- **setSculkSensorPhase** (`Phase`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#setSculkSensorPhase(org.bukkit.block.data.type.SculkSensor.Phase)

	- **@p** `Phase` is a string naming a SculkSensor.Phase.


- **setWaterlogged** (`Waterlogged`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/SculkSensor.html#setWaterlogged(boolean)

	- **@p** `Waterlogged` is a bool.




