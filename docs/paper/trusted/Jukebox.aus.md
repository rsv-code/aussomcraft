# file: Jukebox.aus

## class: Jukebox

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.JukeboxShim) **extends: object** 

Generated shim for org.bukkit.block.Jukebox.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html
In Paper this is a
[TileStateInventoryHolder](TileStateInventoryHolder.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **copy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#copy()

	- **@r** `A` [BlockState](BlockState.aus.md).


- **copy** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#copy(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [BlockState](BlockState.aus.md).


- **eject** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#eject()

	- **@r** `A` bool.


- **getBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getBlock()

	- **@r** `A` [Block](Block.aus.md).


- **getBlockData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getBlockData()

	- **@r** `A` [BlockData](BlockData.aus.md).


- **getChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getChunk()

	- **@r** `A` [Chunk](Chunk.aus.md).


- **getDrops** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getDrops()

	- **@r** `A` list.


- **getDrops** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getDrops(org.bukkit.inventory.ItemStack)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` list.


- **getDrops** (`Tool, Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getDrops(org.bukkit.inventory.ItemStack,org.bukkit.entity.Entity)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@r** `A` list.


- **getInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getInventory()

	- **@r** `A` [JukeboxInventory](JukeboxInventory.aus.md).


- **getLightLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getLightLevel()

	- **@r** `An` int.


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getLocation** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getLocation(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **getMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` list.


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getPlaying** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getPlaying()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getRawData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getRawData()

	- **@r** `An` int.


- **getRecord** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getRecord()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getSnapshotInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getSnapshotInventory()

	- **@r** `A` [JukeboxInventory](JukeboxInventory.aus.md).


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getType()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **getX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getX()

	- **@r** `An` int.


- **getY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getY()

	- **@r** `An` int.


- **getZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#getZ()

	- **@r** `An` int.


- **hasMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#hasMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` bool.


- **hasRecord** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#hasRecord()

	- **@r** `A` bool.


- **isCollidable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#isCollidable()

	- **@r** `A` bool.


- **isPlaced** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#isPlaced()

	- **@r** `A` bool.


- **isPlaying** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#isPlaying()

	- **@r** `A` bool.


- **isSnapshot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#isSnapshot()

	- **@r** `A` bool.


- **isSuffocating** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#isSuffocating()

	- **@r** `A` bool.


- **setBlockData** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#setBlockData(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).


- **setMetadata** (`MetadataKey, NewMetadataValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#setMetadata(java.lang.String,org.bukkit.metadata.MetadataValue)

	- **@p** `MetadataKey` is a string.
	- **@p** `NewMetadataValue` is a [MetadataValue](MetadataValue.aus.md).


- **setPlaying** (`Record`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#setPlaying(org.bukkit.Material)

	- **@p** `Record` is a string naming a [Material](Material.aus.md).


- **setRawData** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#setRawData(byte)

	- **@p** `Data` is an int.


- **setRecord** (`Record`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#setRecord(org.bukkit.inventory.ItemStack)

	- **@p** `Record` is an [ItemStack](ItemStack.aus.md).


- **setType** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#setType(org.bukkit.Material)

	- **@p** `Type` is a string naming a [Material](Material.aus.md).


- **startPlaying** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#startPlaying()

	- **@r** `A` bool.


- **stopPlaying** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#stopPlaying()



- **update** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#update()

	- **@r** `A` bool.


- **update** (`Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#update(boolean)

	- **@p** `Force` is a bool.
	- **@r** `A` bool.


- **update** (`Force, ApplyPhysics`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Jukebox.html#update(boolean,boolean)

	- **@p** `Force` is a bool.
	- **@p** `ApplyPhysics` is a bool.
	- **@r** `A` bool.




