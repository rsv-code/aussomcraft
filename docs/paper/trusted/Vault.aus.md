# file: Vault.aus

## class: Vault

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.VaultShim) **extends: object** 

Generated shim for org.bukkit.block.Vault.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html
In Paper this is a [TileState](TileState.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addRewardedPlayer** (`PlayerUUID`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#addRewardedPlayer(java.util.UUID)

	- **@p** `PlayerUUID` is a string.
	- **@r** `A` bool.


- **copy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#copy()

	- **@r** `A` [BlockState](BlockState.aus.md).


- **copy** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#copy(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [BlockState](BlockState.aus.md).


- **getActivationRange** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getActivationRange()

	- **@r** `A` double.


- **getBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getBlock()

	- **@r** `A` [Block](Block.aus.md).


- **getBlockData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getBlockData()

	- **@r** `A` [BlockData](BlockData.aus.md).


- **getChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getChunk()

	- **@r** `A` [Chunk](Chunk.aus.md).


- **getConnectedPlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getConnectedPlayers()

	- **@r** `A` list.


- **getDeactivationRange** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getDeactivationRange()

	- **@r** `A` double.


- **getDisplayedItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getDisplayedItem()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getDisplayedLootTable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getDisplayedLootTable()

	- **@r** `A` [LootTable](LootTable.aus.md).


- **getDrops** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getDrops()

	- **@r** `A` list.


- **getDrops** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getDrops(org.bukkit.inventory.ItemStack)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` list.


- **getDrops** (`Tool, Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getDrops(org.bukkit.inventory.ItemStack,org.bukkit.entity.Entity)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@r** `A` list.


- **getKeyItem** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getKeyItem()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getLightLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getLightLevel()

	- **@r** `An` int.


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getLocation** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getLocation(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **getLootTable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getLootTable()

	- **@r** `A` [LootTable](LootTable.aus.md).


- **getMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` list.


- **getNextStateUpdateTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getNextStateUpdateTime()

	- **@r** `An` int.


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getRawData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getRawData()

	- **@r** `An` int.


- **getRewardedPlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getRewardedPlayers()

	- **@r** `A` list.


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getType()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **getX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getX()

	- **@r** `An` int.


- **getY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getY()

	- **@r** `An` int.


- **getZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#getZ()

	- **@r** `An` int.


- **hasConnectedPlayer** (`PlayerUUID`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#hasConnectedPlayer(java.util.UUID)

	- **@p** `PlayerUUID` is a string.
	- **@r** `A` bool.


- **hasMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#hasMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` bool.


- **hasRewardedPlayer** (`PlayerUUID`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#hasRewardedPlayer(java.util.UUID)

	- **@p** `PlayerUUID` is a string.
	- **@r** `A` bool.


- **isCollidable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#isCollidable()

	- **@r** `A` bool.


- **isPlaced** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#isPlaced()

	- **@r** `A` bool.


- **isSnapshot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#isSnapshot()

	- **@r** `A` bool.


- **isSuffocating** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#isSuffocating()

	- **@r** `A` bool.


- **removeRewardedPlayer** (`PlayerUUID`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#removeRewardedPlayer(java.util.UUID)

	- **@p** `PlayerUUID` is a string.
	- **@r** `A` bool.


- **setActivationRange** (`ActivationRange`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#setActivationRange(double)

	- **@p** `ActivationRange` is a double.


- **setBlockData** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#setBlockData(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).


- **setDeactivationRange** (`DeactivationRange`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#setDeactivationRange(double)

	- **@p** `DeactivationRange` is a double.


- **setDisplayedItem** (`DisplayedItem`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#setDisplayedItem(org.bukkit.inventory.ItemStack)

	- **@p** `DisplayedItem` is an [ItemStack](ItemStack.aus.md).


- **setDisplayedLootTable** (`LootTable`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#setDisplayedLootTable(org.bukkit.loot.LootTable)

	- **@p** `LootTable` is a [LootTable](LootTable.aus.md).


- **setKeyItem** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#setKeyItem(org.bukkit.inventory.ItemStack)

	- **@p** `Key` is an [ItemStack](ItemStack.aus.md).


- **setLootTable** (`LootTable`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#setLootTable(org.bukkit.loot.LootTable)

	- **@p** `LootTable` is a [LootTable](LootTable.aus.md).


- **setMetadata** (`MetadataKey, NewMetadataValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#setMetadata(java.lang.String,org.bukkit.metadata.MetadataValue)

	- **@p** `MetadataKey` is a string.
	- **@p** `NewMetadataValue` is a [MetadataValue](MetadataValue.aus.md).


- **setNextStateUpdateTime** (`NextStateUpdateTime`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#setNextStateUpdateTime(long)

	- **@p** `NextStateUpdateTime` is an int.


- **setRawData** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#setRawData(byte)

	- **@p** `Data` is an int.


- **setType** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#setType(org.bukkit.Material)

	- **@p** `Type` is a string naming a [Material](Material.aus.md).


- **update** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#update()

	- **@r** `A` bool.


- **update** (`Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#update(boolean)

	- **@p** `Force` is a bool.
	- **@r** `A` bool.


- **update** (`Force, ApplyPhysics`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Vault.html#update(boolean,boolean)

	- **@p** `Force` is a bool.
	- **@p** `ApplyPhysics` is a bool.
	- **@r** `A` bool.




