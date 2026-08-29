# file: Dispenser.aus

## class: Dispenser

[21:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.DispenserShim) **extends: object** 

Generated shim for org.bukkit.block.Dispenser.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html
In Paper this is a [Container](Container.aus.md),
[Nameable](Nameable.aus.md) and
[LootableBlockInventory](LootableBlockInventory.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **canPlayerLoot** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#canPlayerLoot(java.util.UUID)

	- **@p** `Player` is a string.
	- **@r** `A` bool.


- **clearLootTable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#clearLootTable()



- **copy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#copy()

	- **@r** `A` [BlockState](BlockState.aus.md).


- **copy** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#copy(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [BlockState](BlockState.aus.md).


- **customName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#customName()

	- **@r** `A` Component.


- **customName** (`CustomName`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#customName(net.kyori.adventure.text.Component)

	- **@p** `CustomName` is a Component.


- **dispense** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#dispense()

	- **@r** `A` bool.


- **getBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getBlock()

	- **@r** `A` [Block](Block.aus.md).


- **getBlockData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getBlockData()

	- **@r** `A` [BlockData](BlockData.aus.md).


- **getBlockProjectileSource** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getBlockProjectileSource()

	- **@r** `A` [BlockProjectileSource](BlockProjectileSource.aus.md).


- **getChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getChunk()

	- **@r** `A` [Chunk](Chunk.aus.md).


- **getCustomName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getCustomName()

	- **@r** `A` string.


- **getDrops** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getDrops()

	- **@r** `A` list.


- **getDrops** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getDrops(org.bukkit.inventory.ItemStack)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` list.


- **getDrops** (`Tool, Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getDrops(org.bukkit.inventory.ItemStack,org.bukkit.entity.Entity)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@r** `A` list.


- **getInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getInventory()

	- **@r** `An` [Inventory](Inventory.aus.md).


- **getLastFilled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getLastFilled()

	- **@r** `An` int.


- **getLastLooted** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getLastLooted(org.bukkit.entity.Player)

	- **@p** `Player` is a [Player](Player.aus.md).
	- **@r** `An` int.


- **getLastLooted\_UUID** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getLastLooted(java.util.UUID)

	- **@p** `Player` is a string.
	- **@r** `An` int.


- **getLightLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getLightLevel()

	- **@r** `An` int.


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getLocation** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getLocation(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **getLock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getLock()

	- **@r** `A` string.


- **getLootTable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getLootTable()

	- **@r** `A` [LootTable](LootTable.aus.md).


- **getMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` list.


- **getNextRefill** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getNextRefill()

	- **@r** `An` int.


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getRawData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getRawData()

	- **@r** `An` int.


- **getSeed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getSeed()

	- **@r** `An` int.


- **getSnapshotInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getSnapshotInventory()

	- **@r** `An` [Inventory](Inventory.aus.md).


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getType()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **getX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getX()

	- **@r** `An` int.


- **getY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getY()

	- **@r** `An` int.


- **getZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#getZ()

	- **@r** `An` int.


- **hasBeenFilled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#hasBeenFilled()

	- **@r** `A` bool.


- **hasLootTable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#hasLootTable()

	- **@r** `A` bool.


- **hasMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#hasMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` bool.


- **hasPendingRefill** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#hasPendingRefill()

	- **@r** `A` bool.


- **hasPlayerLooted** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#hasPlayerLooted(org.bukkit.entity.Player)

	- **@p** `Player` is a [Player](Player.aus.md).
	- **@r** `A` bool.


- **hasPlayerLooted\_UUID** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#hasPlayerLooted(java.util.UUID)

	- **@p** `Player` is a string.
	- **@r** `A` bool.


- **isCollidable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#isCollidable()

	- **@r** `A` bool.


- **isLocked** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#isLocked()

	- **@r** `A` bool.


- **isPlaced** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#isPlaced()

	- **@r** `A` bool.


- **isRefillEnabled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#isRefillEnabled()

	- **@r** `A` bool.


- **isSnapshot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#isSnapshot()

	- **@r** `A` bool.


- **isSuffocating** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#isSuffocating()

	- **@r** `A` bool.


- **setBlockData** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#setBlockData(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).


- **setCustomName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#setCustomName(java.lang.String)

	- **@p** `Name` is a string.


- **setHasPlayerLooted** (`Player, Looted`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#setHasPlayerLooted(org.bukkit.entity.Player,boolean)

	- **@p** `Player` is a [Player](Player.aus.md).
	- **@p** `Looted` is a bool.
	- **@r** `A` bool.


- **setHasPlayerLooted\_UUID\_boolean** (`Player, Looted`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#setHasPlayerLooted(java.util.UUID,boolean)

	- **@p** `Player` is a string.
	- **@p** `Looted` is a bool.
	- **@r** `A` bool.


- **setLock** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#setLock(java.lang.String)

	- **@p** `Key` is a string.


- **setLockItem** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#setLockItem(org.bukkit.inventory.ItemStack)

	- **@p** `Key` is an [ItemStack](ItemStack.aus.md).


- **setLootTable** (`Table`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#setLootTable(org.bukkit.loot.LootTable)

	- **@p** `Table` is a [LootTable](LootTable.aus.md).


- **setLootTable** (`Table, Seed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#setLootTable(org.bukkit.loot.LootTable,long)

	- **@p** `Table` is a [LootTable](LootTable.aus.md).
	- **@p** `Seed` is an int.


- **setMetadata** (`MetadataKey, NewMetadataValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#setMetadata(java.lang.String,org.bukkit.metadata.MetadataValue)

	- **@p** `MetadataKey` is a string.
	- **@p** `NewMetadataValue` is a [MetadataValue](MetadataValue.aus.md).


- **setNextRefill** (`RefillAt`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#setNextRefill(long)

	- **@p** `RefillAt` is an int.
	- **@r** `An` int.


- **setRawData** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#setRawData(byte)

	- **@p** `Data` is an int.


- **setSeed** (`Seed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#setSeed(long)

	- **@p** `Seed` is an int.


- **setType** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#setType(org.bukkit.Material)

	- **@p** `Type` is a string naming a [Material](Material.aus.md).


- **update** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#update()

	- **@r** `A` bool.


- **update** (`Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#update(boolean)

	- **@p** `Force` is a bool.
	- **@r** `A` bool.


- **update** (`Force, ApplyPhysics`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Dispenser.html#update(boolean,boolean)

	- **@p** `Force` is a bool.
	- **@p** `ApplyPhysics` is a bool.
	- **@r** `A` bool.




