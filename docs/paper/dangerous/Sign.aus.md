# file: Sign.aus

## class: Sign

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.SignShim) **extends: object** 

Generated shim for org.bukkit.block.Sign.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html
In Paper this is a [TileState](TileState.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **copy** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#copy()

	- **@r** `A` [BlockState](BlockState.aus.md).


- **copy** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#copy(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` [BlockState](BlockState.aus.md).


- **getAllowedEditor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getAllowedEditor()

	- **@r** `A` [Player](Player.aus.md).


- **getAllowedEditorUniqueId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getAllowedEditorUniqueId()

	- **@r** `A` string.


- **getBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getBlock()

	- **@r** `A` [Block](Block.aus.md).


- **getBlockData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getBlockData()

	- **@r** `A` [BlockData](BlockData.aus.md).


- **getChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getChunk()

	- **@r** `A` [Chunk](Chunk.aus.md).


- **getColor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getColor()

	- **@r** `A` string naming a [DyeColor](DyeColor.aus.md).


- **getDrops** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getDrops()

	- **@r** `A` list.


- **getDrops** (`Tool`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getDrops(org.bukkit.inventory.ItemStack)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` list.


- **getDrops** (`Tool, Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getDrops(org.bukkit.inventory.ItemStack,org.bukkit.entity.Entity)

	- **@p** `Tool` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@r** `A` list.


- **getInteractableSideFor** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getInteractableSideFor(org.bukkit.entity.Entity)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@r** `A` string naming a [Side](Side.aus.md).


- **getInteractableSideFor\_position** (`Position`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getInteractableSideFor(io.papermc.paper.math.Position)

	- **@p** `Position` is a [Position](Position.aus.md).
	- **@r** `A` string naming a [Side](Side.aus.md).


- **getInteractableSideFor** (`X, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getInteractableSideFor(double,double)

	- **@p** `X` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` string naming a [Side](Side.aus.md).


- **getLightLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getLightLevel()

	- **@r** `An` int.


- **getLine** (`Index`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getLine(int)

	- **@p** `Index` is an int.
	- **@r** `A` string.


- **getLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getLocation()

	- **@r** `A` [Location](Location.aus.md).


- **getLocation** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getLocation(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **getMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` list.


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getRawData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getRawData()

	- **@r** `An` int.


- **getSide** (`Side`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getSide(org.bukkit.block.sign.Side)

	- **@p** `Side` is a string naming a [Side](Side.aus.md).
	- **@r** `A` [SignSide](SignSide.aus.md).


- **getTargetSide** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getTargetSide(org.bukkit.entity.Player)

	- **@p** `Player` is a [Player](Player.aus.md).
	- **@r** `A` [SignSide](SignSide.aus.md).


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getType()

	- **@r** `A` string naming a [Material](Material.aus.md).


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **getX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getX()

	- **@r** `An` int.


- **getY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getY()

	- **@r** `An` int.


- **getZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#getZ()

	- **@r** `An` int.


- **hasMetadata** (`MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#hasMetadata(java.lang.String)

	- **@p** `MetadataKey` is a string.
	- **@r** `A` bool.


- **isCollidable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#isCollidable()

	- **@r** `A` bool.


- **isEditable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#isEditable()

	- **@r** `A` bool.


- **isGlowingText** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#isGlowingText()

	- **@r** `A` bool.


- **isPlaced** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#isPlaced()

	- **@r** `A` bool.


- **isSnapshot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#isSnapshot()

	- **@r** `A` bool.


- **isSuffocating** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#isSuffocating()

	- **@r** `A` bool.


- **isWaxed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#isWaxed()

	- **@r** `A` bool.


- **line** (`Index`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#line(int)

	- **@p** `Index` is an int.
	- **@r** `A` Component.


- **line** (`Index, Line`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#line(int,net.kyori.adventure.text.Component)

	- **@p** `Index` is an int.
	- **@p** `Line` is a Component.


- **lines** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#lines()

	- **@r** `A` list.


- **setAllowedEditorUniqueId** (`Uuid`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#setAllowedEditorUniqueId(java.util.UUID)

	- **@p** `Uuid` is a string.


- **setBlockData** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#setBlockData(org.bukkit.block.data.BlockData)

	- **@p** `Data` is a [BlockData](BlockData.aus.md).


- **setColor** (`Color`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#setColor(org.bukkit.DyeColor)

	- **@p** `Color` is a string naming a [DyeColor](DyeColor.aus.md).


- **setEditable** (`Editable`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#setEditable(boolean)

	- **@p** `Editable` is a bool.


- **setGlowingText** (`Glowing`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#setGlowingText(boolean)

	- **@p** `Glowing` is a bool.


- **setLine** (`Index, Line`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#setLine(int,java.lang.String)

	- **@p** `Index` is an int.
	- **@p** `Line` is a string.


- **setMetadata** (`MetadataKey, NewMetadataValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#setMetadata(java.lang.String,org.bukkit.metadata.MetadataValue)

	- **@p** `MetadataKey` is a string.
	- **@p** `NewMetadataValue` is a [MetadataValue](MetadataValue.aus.md).


- **setRawData** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#setRawData(byte)

	- **@p** `Data` is an int.


- **setType** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#setType(org.bukkit.Material)

	- **@p** `Type` is a string naming a [Material](Material.aus.md).


- **setWaxed** (`Waxed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#setWaxed(boolean)

	- **@p** `Waxed` is a bool.


- **update** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#update()

	- **@r** `A` bool.


- **update** (`Force`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#update(boolean)

	- **@p** `Force` is a bool.
	- **@r** `A` bool.


- **update** (`Force, ApplyPhysics`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#update(boolean,boolean)

	- **@p** `Force` is a bool.
	- **@p** `ApplyPhysics` is a bool.
	- **@r** `A` bool.


- **removeMetadata** (`MetadataKey, OwningPlugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/block/Sign.html#removeMetadata(java.lang.String,org.bukkit.plugin.Plugin)

	- **@p** `MetadataKey` is a string.
	- **@p** `OwningPlugin` is a [Plugin](Plugin.aus.md).




