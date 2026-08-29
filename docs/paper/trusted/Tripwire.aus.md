# file: Tripwire.aus

## class: Tripwire

[21:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.TripwireShim) **extends: object** 

Generated shim for org.bukkit.block.data.type.Tripwire.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html
In Paper this is a [Attachable](Attachable.aus.md),
[MultipleFacing](MultipleFacing.aus.md) and
[Powerable](Powerable.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **clone** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#clone()

	- **@r** `A` [BlockData](BlockData.aus.md).


- **copyTo** (`Other`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#copyTo(org.bukkit.block.data.BlockData)

	- **@p** `Other` is a [BlockData](BlockData.aus.md).


- **createBlockState** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#createBlockState()

	- **@r** `A` [BlockState](BlockState.aus.md).


- **getAllowedFaces** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#getAllowedFaces()

	- **@r** `A` list.


- **getAsString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#getAsString()

	- **@r** `A` string.


- **getAsString** (`HideUnspecified`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#getAsString(boolean)

	- **@p** `HideUnspecified` is a bool.
	- **@r** `A` string.


- **getCollisionShape** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#getCollisionShape(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [VoxelShape](VoxelShape.aus.md).


- **getDestroySpeed** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#getDestroySpeed(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` double.


- **getDestroySpeed** (`ItemStack, ConsiderEnchants`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#getDestroySpeed(org.bukkit.inventory.ItemStack,boolean)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@p** `ConsiderEnchants` is a bool.
	- **@r** `A` double.


- **getFaces** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#getFaces()

	- **@r** `A` list.


- **getLightEmission** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#getLightEmission()

	- **@r** `An` int.


- **getMapColor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#getMapColor()

	- **@r** `A` [Color](Color.aus.md).


- **getMaterial** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#getMaterial()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getPistonMoveReaction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#getPistonMoveReaction()

	- **@r** `A` string naming a [PistonMoveReaction](PistonMoveReaction.aus.md).


- **getPlacementMaterial** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#getPlacementMaterial()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getSoundGroup** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#getSoundGroup()

	- **@r** `A` [SoundGroup](SoundGroup.aus.md).


- **hasFace** (`Face`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#hasFace(org.bukkit.block.BlockFace)

	- **@p** `Face` is a string naming a [BlockFace](BlockFace.aus.md).
	- **@r** `A` bool.


- **isAttached** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#isAttached()

	- **@r** `A` bool.


- **isDisarmed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#isDisarmed()

	- **@r** `A` bool.


- **isFaceSturdy** (`Face, Support`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#isFaceSturdy(org.bukkit.block.BlockFace,org.bukkit.block.BlockSupport)

	- **@p** `Face` is a string naming a [BlockFace](BlockFace.aus.md).
	- **@p** `Support` is a string naming a [BlockSupport](BlockSupport.aus.md).
	- **@r** `A` bool.


- **isOccluding** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#isOccluding()

	- **@r** `A` bool.


- **isPowered** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#isPowered()

	- **@r** `A` bool.


- **isPreferredTool** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#isPreferredTool(org.bukkit.inventory.ItemStack)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **isRandomlyTicked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#isRandomlyTicked()

	- **@r** `A` bool.


- **isReplaceable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#isReplaceable()

	- **@r** `A` bool.


- **isSupported** (`Block`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#isSupported(org.bukkit.block.Block)

	- **@p** `Block` is a [Block](Block.aus.md).
	- **@r** `A` bool.


- **isSupported\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#isSupported(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **matches** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#matches(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).
	- **@r** `A` bool.


- **merge** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#merge(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).
	- **@r** `A` [BlockData](BlockData.aus.md).


- **mirror** (`Mirror`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#mirror(org.bukkit.block.structure.Mirror)

	- **@p** `Mirror` is a string naming a [Mirror](Mirror.aus.md).


- **requiresCorrectToolForDrops** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#requiresCorrectToolForDrops()

	- **@r** `A` bool.


- **rotate** (`Rotation`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#rotate(org.bukkit.block.structure.StructureRotation)

	- **@p** `Rotation` is a string naming a [StructureRotation](StructureRotation.aus.md).


- **setAttached** (`Attached`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#setAttached(boolean)

	- **@p** `Attached` is a bool.


- **setDisarmed** (`Disarmed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#setDisarmed(boolean)

	- **@p** `Disarmed` is a bool.


- **setFace** (`Face, Has`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#setFace(org.bukkit.block.BlockFace,boolean)

	- **@p** `Face` is a string naming a [BlockFace](BlockFace.aus.md).
	- **@p** `Has` is a bool.


- **setPowered** (`Powered`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Tripwire.html#setPowered(boolean)

	- **@p** `Powered` is a bool.




