# file: Shelf.aus

## class: Shelf

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.ShelfShim) **extends: object** 

Generated shim for org.bukkit.block.Shelf.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html
In Paper this is a
[TileStateInventoryHolder](TileStateInventoryHolder.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **copy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#copy()

	- **@r** `A` [BlockState](BlockState.aus.md).


- **copy** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#copy(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [BlockState](BlockState.aus.md).


- **getBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getBlock()

	- **@r** `A` [Block](Block.aus.md).


- **getBlockData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getBlockData()

	- **@r** `A` [BlockData](BlockData.aus.md).


- **getChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getChunk()

	- **@r** `A` [Chunk](Chunk.aus.md).


- **getDrops** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getDrops()

	- **@r** `A` list.


- **getDrops** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getDrops(org.bukkit.inventory.ItemStack)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` list.


- **getDrops** (`Tool, Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getDrops(org.bukkit.inventory.ItemStack,org.bukkit.entity.Entity)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@r** `A` list.


- **getInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getInventory()

	- **@r** `A` [ShelfInventory](ShelfInventory.aus.md).


- **getLightLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getLightLevel()

	- **@r** `An` int.


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getLocation** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getLocation(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **getMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` list.


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getRawData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getRawData()

	- **@r** `An` int.


- **getSnapshotInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getSnapshotInventory()

	- **@r** `A` [ShelfInventory](ShelfInventory.aus.md).


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getType()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **getX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getX()

	- **@r** `An` int.


- **getY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getY()

	- **@r** `An` int.


- **getZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#getZ()

	- **@r** `An` int.


- **hasMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#hasMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` bool.


- **isCollidable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#isCollidable()

	- **@r** `A` bool.


- **isPlaced** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#isPlaced()

	- **@r** `A` bool.


- **isSnapshot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#isSnapshot()

	- **@r** `A` bool.


- **isSuffocating** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#isSuffocating()

	- **@r** `A` bool.


- **setBlockData** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#setBlockData(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).


- **setMetadata** (`MetadataKey, NewMetadataValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#setMetadata(java.lang.String,org.bukkit.metadata.MetadataValue)

	- **@p** `MetadataKey` is a string.
	- **@p** `NewMetadataValue` is a [MetadataValue](MetadataValue.aus.md).


- **setRawData** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#setRawData(byte)

	- **@p** `Data` is an int.


- **setType** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#setType(org.bukkit.Material)

	- **@p** `Type` is a string naming a [Material](Material.aus.md).


- **update** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#update()

	- **@r** `A` bool.


- **update** (`Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#update(boolean)

	- **@p** `Force` is a bool.
	- **@r** `A` bool.


- **update** (`Force, ApplyPhysics`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Shelf.html#update(boolean,boolean)

	- **@p** `Force` is a bool.
	- **@p** `ApplyPhysics` is a bool.
	- **@r** `A` bool.




