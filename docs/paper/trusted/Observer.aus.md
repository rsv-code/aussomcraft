# file: Observer.aus

## class: Observer

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.ObserverShim) **extends: object** 

Generated shim for org.bukkit.block.data.type.Observer.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html
In Paper this is a [Directional](Directional.aus.md) and
[Powerable](Powerable.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **clone** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#clone()

	- **@r** `A` [BlockData](BlockData.aus.md).


- **copyTo** (`Other`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#copyTo(org.bukkit.block.data.BlockData)

	- **@p** `Other` is a [BlockData](BlockData.aus.md).


- **createBlockState** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#createBlockState()

	- **@r** `A` [BlockState](BlockState.aus.md).


- **getAsString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#getAsString()

	- **@r** `A` string.


- **getAsString** (`HideUnspecified`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#getAsString(boolean)

	- **@p** `HideUnspecified` is a bool.
	- **@r** `A` string.


- **getCollisionShape** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#getCollisionShape(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [VoxelShape](VoxelShape.aus.md).


- **getDestroySpeed** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#getDestroySpeed(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` double.


- **getDestroySpeed** (`ItemStack, ConsiderEnchants`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#getDestroySpeed(org.bukkit.inventory.ItemStack,boolean)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@p** `ConsiderEnchants` is a bool.
	- **@r** `A` double.


- **getFaces** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#getFaces()

	- **@r** `A` list.


- **getFacing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#getFacing()

	- **@r** `A` string naming a [BlockFace](BlockFace.aus.md).


- **getLightEmission** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#getLightEmission()

	- **@r** `An` int.


- **getMapColor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#getMapColor()

	- **@r** `A` [Color](Color.aus.md).


- **getMaterial** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#getMaterial()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getPistonMoveReaction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#getPistonMoveReaction()

	- **@r** `A` string naming a [PistonMoveReaction](PistonMoveReaction.aus.md).


- **getPlacementMaterial** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#getPlacementMaterial()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getSoundGroup** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#getSoundGroup()

	- **@r** `A` [SoundGroup](SoundGroup.aus.md).


- **isFaceSturdy** (`Face, Support`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#isFaceSturdy(org.bukkit.block.BlockFace,org.bukkit.block.BlockSupport)

	- **@p** `Face` is a string naming a [BlockFace](BlockFace.aus.md).
	- **@p** `Support` is a string naming a [BlockSupport](BlockSupport.aus.md).
	- **@r** `A` bool.


- **isOccluding** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#isOccluding()

	- **@r** `A` bool.


- **isPowered** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#isPowered()

	- **@r** `A` bool.


- **isPreferredTool** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#isPreferredTool(org.bukkit.inventory.ItemStack)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **isRandomlyTicked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#isRandomlyTicked()

	- **@r** `A` bool.


- **isReplaceable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#isReplaceable()

	- **@r** `A` bool.


- **isSupported** (`Block`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#isSupported(org.bukkit.block.Block)

	- **@p** `Block` is a [Block](Block.aus.md).
	- **@r** `A` bool.


- **isSupported\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#isSupported(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **matches** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#matches(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).
	- **@r** `A` bool.


- **merge** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#merge(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).
	- **@r** `A` [BlockData](BlockData.aus.md).


- **mirror** (`Mirror`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#mirror(org.bukkit.block.structure.Mirror)

	- **@p** `Mirror` is a string naming a [Mirror](Mirror.aus.md).


- **requiresCorrectToolForDrops** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#requiresCorrectToolForDrops()

	- **@r** `A` bool.


- **rotate** (`Rotation`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#rotate(org.bukkit.block.structure.StructureRotation)

	- **@p** `Rotation` is a string naming a [StructureRotation](StructureRotation.aus.md).


- **setFacing** (`Facing`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#setFacing(org.bukkit.block.BlockFace)

	- **@p** `Facing` is a string naming a [BlockFace](BlockFace.aus.md).


- **setPowered** (`Powered`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Observer.html#setPowered(boolean)

	- **@p** `Powered` is a bool.




