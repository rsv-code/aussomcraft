# file: TypeCrafter.aus

## class: TypeCrafter

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.TypeCrafterShim) **extends: object** 

Generated shim for org.bukkit.block.data.type.Crafter.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html
In Paper this is a [BlockData](BlockData.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **clone** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#clone()

	- **@r** `A` [BlockData](BlockData.aus.md).


- **copyTo** (`Other`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#copyTo(org.bukkit.block.data.BlockData)

	- **@p** `Other` is a [BlockData](BlockData.aus.md).


- **createBlockState** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#createBlockState()

	- **@r** `A` [BlockState](BlockState.aus.md).


- **getAsString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#getAsString()

	- **@r** `A` string.


- **getAsString** (`HideUnspecified`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#getAsString(boolean)

	- **@p** `HideUnspecified` is a bool.
	- **@r** `A` string.


- **getCollisionShape** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#getCollisionShape(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [VoxelShape](VoxelShape.aus.md).


- **getDestroySpeed** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#getDestroySpeed(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` double.


- **getDestroySpeed** (`ItemStack, ConsiderEnchants`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#getDestroySpeed(org.bukkit.inventory.ItemStack,boolean)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@p** `ConsiderEnchants` is a bool.
	- **@r** `A` double.


- **getLightEmission** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#getLightEmission()

	- **@r** `An` int.


- **getMapColor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#getMapColor()

	- **@r** `A` [Color](Color.aus.md).


- **getMaterial** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#getMaterial()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getOrientation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#getOrientation()

	- **@r** `An` string naming an [Orientation](Orientation.aus.md).


- **getPistonMoveReaction** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#getPistonMoveReaction()

	- **@r** `A` string naming a [PistonMoveReaction](PistonMoveReaction.aus.md).


- **getPlacementMaterial** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#getPlacementMaterial()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getSoundGroup** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#getSoundGroup()

	- **@r** `A` [SoundGroup](SoundGroup.aus.md).


- **isCrafting** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#isCrafting()

	- **@r** `A` bool.


- **isFaceSturdy** (`Face, Support`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#isFaceSturdy(org.bukkit.block.BlockFace,org.bukkit.block.BlockSupport)

	- **@p** `Face` is a string naming a [BlockFace](BlockFace.aus.md).
	- **@p** `Support` is a string naming a [BlockSupport](BlockSupport.aus.md).
	- **@r** `A` bool.


- **isOccluding** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#isOccluding()

	- **@r** `A` bool.


- **isPreferredTool** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#isPreferredTool(org.bukkit.inventory.ItemStack)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` bool.


- **isRandomlyTicked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#isRandomlyTicked()

	- **@r** `A` bool.


- **isReplaceable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#isReplaceable()

	- **@r** `A` bool.


- **isSupported** (`Block`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#isSupported(org.bukkit.block.Block)

	- **@p** `Block` is a [Block](Block.aus.md).
	- **@r** `A` bool.


- **isSupported\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#isSupported(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **isTriggered** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#isTriggered()

	- **@r** `A` bool.


- **matches** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#matches(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).
	- **@r** `A` bool.


- **merge** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#merge(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).
	- **@r** `A` [BlockData](BlockData.aus.md).


- **mirror** (`Mirror`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#mirror(org.bukkit.block.structure.Mirror)

	- **@p** `Mirror` is a string naming a [Mirror](Mirror.aus.md).


- **requiresCorrectToolForDrops** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#requiresCorrectToolForDrops()

	- **@r** `A` bool.


- **rotate** (`Rotation`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#rotate(org.bukkit.block.structure.StructureRotation)

	- **@p** `Rotation` is a string naming a [StructureRotation](StructureRotation.aus.md).


- **setCrafting** (`Crafting`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#setCrafting(boolean)

	- **@p** `Crafting` is a bool.


- **setOrientation** (`Orientation`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#setOrientation(org.bukkit.block.Orientation)

	- **@p** `Orientation` is an string naming an [Orientation](Orientation.aus.md).


- **setTriggered** (`Triggered`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/data/type/Crafter.html#setTriggered(boolean)

	- **@p** `Triggered` is a bool.




