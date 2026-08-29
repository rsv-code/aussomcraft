# file: CommandBlock.aus

## class: CommandBlock

[20:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.CommandBlockShim) **extends: object** 

Generated shim for org.bukkit.block.CommandBlock.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html
In Paper this is a [TileState](TileState.aus.md) and
[CommandBlockHolder](CommandBlockHolder.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **copy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#copy()

	- **@r** `A` [BlockState](BlockState.aus.md).


- **copy** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#copy(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [BlockState](BlockState.aus.md).


- **getBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getBlock()

	- **@r** `A` [Block](Block.aus.md).


- **getBlockData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getBlockData()

	- **@r** `A` [BlockData](BlockData.aus.md).


- **getChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getChunk()

	- **@r** `A` [Chunk](Chunk.aus.md).


- **getCommand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getCommand()

	- **@r** `A` string.


- **getDrops** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getDrops()

	- **@r** `A` list.


- **getDrops** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getDrops(org.bukkit.inventory.ItemStack)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` list.


- **getDrops** (`Tool, Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getDrops(org.bukkit.inventory.ItemStack,org.bukkit.entity.Entity)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@r** `A` list.


- **getLightLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getLightLevel()

	- **@r** `An` int.


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getLocation** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getLocation(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **getMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` list.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getName()

	- **@r** `A` string.


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getRawData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getRawData()

	- **@r** `An` int.


- **getSuccessCount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getSuccessCount()

	- **@r** `An` int.


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getType()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **getX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getX()

	- **@r** `An` int.


- **getY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getY()

	- **@r** `An` int.


- **getZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#getZ()

	- **@r** `An` int.


- **hasMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#hasMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` bool.


- **isCollidable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#isCollidable()

	- **@r** `A` bool.


- **isPlaced** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#isPlaced()

	- **@r** `A` bool.


- **isSnapshot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#isSnapshot()

	- **@r** `A` bool.


- **isSuffocating** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#isSuffocating()

	- **@r** `A` bool.


- **lastOutput** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#lastOutput()

	- **@r** `A` Component.


- **lastOutput** (`LastOutput`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#lastOutput(net.kyori.adventure.text.Component)

	- **@p** `LastOutput` is a Component.


- **name** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#name()

	- **@r** `A` Component.


- **name** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#name(net.kyori.adventure.text.Component)

	- **@p** `Name` is a Component.


- **setBlockData** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#setBlockData(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).


- **setMetadata** (`MetadataKey, NewMetadataValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#setMetadata(java.lang.String,org.bukkit.metadata.MetadataValue)

	- **@p** `MetadataKey` is a string.
	- **@p** `NewMetadataValue` is a [MetadataValue](MetadataValue.aus.md).


- **setName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#setName(java.lang.String)

	- **@p** `Name` is a string.


- **setRawData** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#setRawData(byte)

	- **@p** `Data` is an int.


- **setSuccessCount** (`SuccessCount`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#setSuccessCount(int)

	- **@p** `SuccessCount` is an int.


- **setType** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#setType(org.bukkit.Material)

	- **@p** `Type` is a string naming a [Material](Material.aus.md).


- **update** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#update()

	- **@r** `A` bool.


- **update** (`Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#update(boolean)

	- **@p** `Force` is a bool.
	- **@r** `A` bool.


- **update** (`Force, ApplyPhysics`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#update(boolean,boolean)

	- **@p** `Force` is a bool.
	- **@p** `ApplyPhysics` is a bool.
	- **@r** `A` bool.


- **removeMetadata** (`MetadataKey, OwningPlugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#removeMetadata(java.lang.String,org.bukkit.plugin.Plugin)

	- **@p** `MetadataKey` is a string.
	- **@p** `OwningPlugin` is a [Plugin](Plugin.aus.md).


- **setCommand** (`Command`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/CommandBlock.html#setCommand(java.lang.String)

	- **@p** `Command` is a string.




