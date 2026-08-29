# file: RedstoneWire.aus

## class: RedstoneWire

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.RedstoneWireShim) **extends: object** 

Generated shim for org.bukkit.block.data.type.RedstoneWire.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html
In Paper this is a [AnaloguePowerable](AnaloguePowerable.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **clone** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#clone()

	- **@r** `A` [BlockData](BlockData.aus.md).


- **copyTo** (`Other`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#copyTo(org.bukkit.block.data.BlockData)

	- **@p** `Other` is a [BlockData](BlockData.aus.md).


- **createBlockState** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#createBlockState()

	- **@r** `A` [BlockState](BlockState.aus.md).


- **getAllowedFaces** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#getAllowedFaces()

	- **@r** `A` list.


- **getAsString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#getAsString()

	- **@r** `A` string.


- **getAsString** (`HideUnspecified`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#getAsString(boolean)

	- **@p** `HideUnspecified` is a bool.
	- **@r** `A` string.


- **getCollisionShape** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#getCollisionShape(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [VoxelShape](VoxelShape.aus.md).


- **getDestroySpeed** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#getDestroySpeed(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` double.


- **getDestroySpeed** (`ItemStack, ConsiderEnchants`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#getDestroySpeed(org.bukkit.inventory.ItemStack,boolean)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@p** `ConsiderEnchants` is a bool.
	- **@r** `A` double.


- **getFace** (`Face`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#getFace(org.bukkit.block.BlockFace)

	- **@p** `Face` is a string naming a [BlockFace](BlockFace.aus.md).
	- **@r** `A` string naming a RedstoneWire.Connection.


- **getLightEmission** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#getLightEmission()

	- **@r** `An` int.


- **getMapColor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#getMapColor()

	- **@r** `A` [Color](Color.aus.md).


- **getMaterial** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#getMaterial()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getMaximumPower** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#getMaximumPower()

	- **@r** `An` int.


- **getPistonMoveReaction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#getPistonMoveReaction()

	- **@r** `A` string naming a [PistonMoveReaction](PistonMoveReaction.aus.md).


- **getPlacementMaterial** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#getPlacementMaterial()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getPower** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#getPower()

	- **@r** `An` int.


- **getSoundGroup** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#getSoundGroup()

	- **@r** `A` [SoundGroup](SoundGroup.aus.md).


- **isFaceSturdy** (`Face, Support`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#isFaceSturdy(org.bukkit.block.BlockFace,org.bukkit.block.BlockSupport)

	- **@p** `Face` is a string naming a [BlockFace](BlockFace.aus.md).
	- **@p** `Support` is a string naming a [BlockSupport](BlockSupport.aus.md).
	- **@r** `A` bool.


- **isOccluding** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#isOccluding()

	- **@r** `A` bool.


- **isPreferredTool** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#isPreferredTool(org.bukkit.inventory.ItemStack)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **isRandomlyTicked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#isRandomlyTicked()

	- **@r** `A` bool.


- **isReplaceable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#isReplaceable()

	- **@r** `A` bool.


- **isSupported** (`Block`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#isSupported(org.bukkit.block.Block)

	- **@p** `Block` is a [Block](Block.aus.md).
	- **@r** `A` bool.


- **isSupported\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#isSupported(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **matches** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#matches(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).
	- **@r** `A` bool.


- **merge** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#merge(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).
	- **@r** `A` [BlockData](BlockData.aus.md).


- **mirror** (`Mirror`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#mirror(org.bukkit.block.structure.Mirror)

	- **@p** `Mirror` is a string naming a [Mirror](Mirror.aus.md).


- **requiresCorrectToolForDrops** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#requiresCorrectToolForDrops()

	- **@r** `A` bool.


- **rotate** (`Rotation`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#rotate(org.bukkit.block.structure.StructureRotation)

	- **@p** `Rotation` is a string naming a [StructureRotation](StructureRotation.aus.md).


- **setFace** (`Face, Connection`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#setFace(org.bukkit.block.BlockFace,org.bukkit.block.data.type.RedstoneWire.Connection)

	- **@p** `Face` is a string naming a [BlockFace](BlockFace.aus.md).
	- **@p** `Connection` is a string naming a RedstoneWire.Connection.


- **setPower** (`Power`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/RedstoneWire.html#setPower(int)

	- **@p** `Power` is an int.




