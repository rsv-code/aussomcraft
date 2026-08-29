# file: Bukkit.aus

## class: Bukkit

[15:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.BukkitShim) **extends: object** 

Generated shim for org.bukkit.Bukkit.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addRecipe** (`Recipe`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#addRecipe(org.bukkit.inventory.Recipe)

	- **@p** `Recipe` is a [Recipe](Recipe.aus.md).
	- **@r** `A` bool.


- **addRecipe** (`Recipe, ResendRecipes`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#addRecipe(org.bukkit.inventory.Recipe,boolean)

	- **@p** `Recipe` is a [Recipe](Recipe.aus.md).
	- **@p** `ResendRecipes` is a bool.
	- **@r** `A` bool.


- **banIP** (`Address`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#banIP(java.lang.String)

	- **@p** `Address` is a string.


- **broadcast** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#broadcast(net.kyori.adventure.text.Component)

	- **@p** `Message` is a Component.
	- **@r** `An` int.


- **broadcast\_Component\_String** (`Message, Permission`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#broadcast(net.kyori.adventure.text.Component,java.lang.String)

	- **@p** `Message` is a Component.
	- **@p** `Permission` is a string.
	- **@r** `An` int.


- **broadcast** (`Message, Permission`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#broadcast(java.lang.String,java.lang.String)

	- **@p** `Message` is a string.
	- **@p** `Permission` is a string.
	- **@r** `An` int.


- **broadcastMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#broadcastMessage(java.lang.String)

	- **@p** `Message` is a string.
	- **@r** `An` int.


- **clearRecipes** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#clearRecipes()



- **createBlockData\_material** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createBlockData(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@r** `A` [BlockData](BlockData.aus.md).


- **createBlockData** (`Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createBlockData(java.lang.String)

	- **@p** `Data` is a string.
	- **@r** `A` [BlockData](BlockData.aus.md).


- **createBlockData** (`Material, Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createBlockData(org.bukkit.Material,java.lang.String)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@p** `Data` is a string.
	- **@r** `A` [BlockData](BlockData.aus.md).


- **createChunkData** (`World`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createChunkData(org.bukkit.World)

	- **@p** `World` is a [World](World.aus.md).
	- **@r** `A` ChunkGenerator.ChunkData.


- **createExplorerMap** (`World, Location, StructureType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createExplorerMap(org.bukkit.World,org.bukkit.Location,org.bukkit.StructureType)

	- **@p** `World` is a [World](World.aus.md).
	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `StructureType` is a [StructureType](StructureType.aus.md).
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **createExplorerMap** (`World, Location, StructureType, MapIcon`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createExplorerMap(org.bukkit.World,org.bukkit.Location,org.bukkit.generator.structure.StructureType,org.bukkit.map.MapCursor.Type)

	- **@p** `World` is a [World](World.aus.md).
	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `StructureType` is a StructureStructureType.
	- **@p** `MapIcon` is a MapCursor.Type.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **createExplorerMap** (`World, Location, StructureType, Radius, FindUnexplored`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createExplorerMap(org.bukkit.World,org.bukkit.Location,org.bukkit.StructureType,int,boolean)

	- **@p** `World` is a [World](World.aus.md).
	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `StructureType` is a [StructureType](StructureType.aus.md).
	- **@p** `Radius` is an int.
	- **@p** `FindUnexplored` is a bool.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **createExplorerMap** (`World, Location, StructureType, MapIcon, Radius, FindUnexplored`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createExplorerMap(org.bukkit.World,org.bukkit.Location,org.bukkit.generator.structure.StructureType,org.bukkit.map.MapCursor.Type,int,boolean)

	- **@p** `World` is a [World](World.aus.md).
	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `StructureType` is a StructureStructureType.
	- **@p** `MapIcon` is a MapCursor.Type.
	- **@p** `Radius` is an int.
	- **@p** `FindUnexplored` is a bool.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **createInventory\_owner\_type** (`Owner, Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createInventory(org.bukkit.inventory.InventoryHolder,org.bukkit.event.inventory.InventoryType)

	- **@p** `Owner` is an [InventoryHolder](InventoryHolder.aus.md).
	- **@p** `Type` is an string naming an [InventoryType](InventoryType.aus.md).
	- **@r** `An` [Inventory](Inventory.aus.md).


- **createInventory** (`Owner, Size`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createInventory(org.bukkit.inventory.InventoryHolder,int)

	- **@p** `Owner` is an [InventoryHolder](InventoryHolder.aus.md).
	- **@p** `Size` is an int.
	- **@r** `An` [Inventory](Inventory.aus.md).


- **createInventory\_InventoryHolder\_InventoryType\_Component** (`Owner, Type, Title`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createInventory(org.bukkit.inventory.InventoryHolder,org.bukkit.event.inventory.InventoryType,net.kyori.adventure.text.Component)

	- **@p** `Owner` is an [InventoryHolder](InventoryHolder.aus.md).
	- **@p** `Type` is an string naming an [InventoryType](InventoryType.aus.md).
	- **@p** `Title` is a Component.
	- **@r** `An` [Inventory](Inventory.aus.md).


- **createInventory\_InventoryHolder\_InventoryType\_String** (`Owner, Type, Title`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createInventory(org.bukkit.inventory.InventoryHolder,org.bukkit.event.inventory.InventoryType,java.lang.String)

	- **@p** `Owner` is an [InventoryHolder](InventoryHolder.aus.md).
	- **@p** `Type` is an string naming an [InventoryType](InventoryType.aus.md).
	- **@p** `Title` is a string.
	- **@r** `An` [Inventory](Inventory.aus.md).


- **createInventory\_InventoryHolder\_int\_Component** (`Owner, Size, Title`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createInventory(org.bukkit.inventory.InventoryHolder,int,net.kyori.adventure.text.Component)

	- **@p** `Owner` is an [InventoryHolder](InventoryHolder.aus.md).
	- **@p** `Size` is an int.
	- **@p** `Title` is a Component.
	- **@r** `An` [Inventory](Inventory.aus.md).


- **createInventory** (`Owner, Size, Title`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createInventory(org.bukkit.inventory.InventoryHolder,int,java.lang.String)

	- **@p** `Owner` is an [InventoryHolder](InventoryHolder.aus.md).
	- **@p** `Size` is an int.
	- **@p** `Title` is a string.
	- **@r** `An` [Inventory](Inventory.aus.md).


- **createMap** (`World`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createMap(org.bukkit.World)

	- **@p** `World` is a [World](World.aus.md).
	- **@r** `A` [MapView](MapView.aus.md).


- **createMerchant** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createMerchant()

	- **@r** `A` [Merchant](Merchant.aus.md).


- **createMerchant\_Component** (`Title`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createMerchant(net.kyori.adventure.text.Component)

	- **@p** `Title` is a Component.
	- **@r** `A` [Merchant](Merchant.aus.md).


- **createMerchant** (`Title`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createMerchant(java.lang.String)

	- **@p** `Title` is a string.
	- **@r** `A` [Merchant](Merchant.aus.md).


- **createPlayerProfile** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createPlayerProfile(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` [PlayerProfile](PlayerProfile.aus.md).


- **createPlayerProfile\_uniqueid** (`UniqueId`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createPlayerProfile(java.util.UUID)

	- **@p** `UniqueId` is a string.
	- **@r** `A` [PlayerProfile](PlayerProfile.aus.md).


- **createPlayerProfile** (`UniqueId, Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createPlayerProfile(java.util.UUID,java.lang.String)

	- **@p** `UniqueId` is a string.
	- **@p** `Name` is a string.
	- **@r** `A` [PlayerProfile](PlayerProfile.aus.md).


- **createProfile** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createProfile(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` ProfilePlayerProfile.


- **createProfile\_uuid** (`Uuid`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createProfile(java.util.UUID)

	- **@p** `Uuid` is a string.
	- **@r** `A` ProfilePlayerProfile.


- **createProfile** (`Uuid, Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createProfile(java.util.UUID,java.lang.String)

	- **@p** `Uuid` is a string.
	- **@p** `Name` is a string.
	- **@r** `A` ProfilePlayerProfile.


- **createProfileExact** (`Uuid, Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createProfileExact(java.util.UUID,java.lang.String)

	- **@p** `Uuid` is a string.
	- **@p** `Name` is a string.
	- **@r** `A` ProfilePlayerProfile.


- **createWorld** (`Creator`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createWorld(org.bukkit.WorldCreator)

	- **@p** `Creator` is a [WorldCreator](WorldCreator.aus.md).
	- **@r** `A` [World](World.aus.md).


- **createWorldBorder** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#createWorldBorder()

	- **@r** `A` [WorldBorder](WorldBorder.aus.md).


- **dispatchCommand** (`Sender, CommandLine`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#dispatchCommand(org.bukkit.command.CommandSender,java.lang.String)

	- **@p** `Sender` is a [CommandSender](CommandSender.aus.md).
	- **@p** `CommandLine` is a string.
	- **@r** `A` bool.


- **forcesDefaultGameMode** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#forcesDefaultGameMode()

	- **@r** `A` bool.


- **getAdvancement** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getAdvancement(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `An` [Advancement](Advancement.aus.md).


- **getAllowEnd** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getAllowEnd()

	- **@r** `A` bool.


- **getAllowFlight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getAllowFlight()

	- **@r** `A` bool.


- **getAllowNether** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getAllowNether()

	- **@r** `A` bool.


- **getAmbientSpawnLimit** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getAmbientSpawnLimit()

	- **@r** `An` int.


- **getAnimalSpawnLimit** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getAnimalSpawnLimit()

	- **@r** `An` int.


- **getAsyncScheduler** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getAsyncScheduler()

	- **@r** `An` [AsyncScheduler](AsyncScheduler.aus.md).


- **getAverageTickTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getAverageTickTime()

	- **@r** `A` double.


- **getBanList** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getBanList(io.papermc.paper.ban.BanListType)

	- **@p** `Type` is a BanListType.
	- **@r** `A` [BanList](BanList.aus.md).


- **getBanList\_Type** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getBanList(org.bukkit.BanList.Type)

	- **@p** `Type` is a string naming a BanList.Type.
	- **@r** `A` [BanList](BanList.aus.md).


- **getBannedPlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getBannedPlayers()

	- **@r** `A` list.


- **getBossBar** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getBossBar(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` [KeyedBossBar](KeyedBossBar.aus.md).


- **getBukkitVersion** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getBukkitVersion()

	- **@r** `A` string.


- **getCommandAliases** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getCommandAliases()

	- **@r** `A` map.


- **getCommandMap** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getCommandMap()

	- **@r** `A` [CommandMap](CommandMap.aus.md).


- **getConnectionThrottle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getConnectionThrottle()

	- **@r** `An` int.


- **getConsoleSender** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getConsoleSender()

	- **@r** `A` [ConsoleCommandSender](ConsoleCommandSender.aus.md).


- **getCurrentTick** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getCurrentTick()

	- **@r** `An` int.


- **getDatapackManager** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getDatapackManager()

	- **@r** `A` [DatapackManager](DatapackManager.aus.md).


- **getDefaultGameMode** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getDefaultGameMode()

	- **@r** `A` string naming a [GameMode](GameMode.aus.md).


- **getEntity** (`Uuid`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getEntity(java.util.UUID)

	- **@p** `Uuid` is a string.
	- **@r** `An` [Entity](Entity.aus.md).


- **getEntityFactory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getEntityFactory()

	- **@r** `An` [EntityFactory](EntityFactory.aus.md).


- **getGenerateStructures** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getGenerateStructures()

	- **@r** `A` bool.


- **getGlobalRegionScheduler** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getGlobalRegionScheduler()

	- **@r** `A` [GlobalRegionScheduler](GlobalRegionScheduler.aus.md).


- **getHelpMap** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getHelpMap()

	- **@r** `A` [HelpMap](HelpMap.aus.md).


- **getHideOnlinePlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getHideOnlinePlayers()

	- **@r** `A` bool.


- **getIPBans** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getIPBans()

	- **@r** `A` list.


- **getIdleTimeout** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getIdleTimeout()

	- **@r** `An` int.


- **getInitialDisabledPacks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getInitialDisabledPacks()

	- **@r** `A` list.


- **getInitialEnabledPacks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getInitialEnabledPacks()

	- **@r** `A` list.


- **getIp** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getIp()

	- **@r** `A` string.


- **getItemFactory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getItemFactory()

	- **@r** `An` [ItemFactory](ItemFactory.aus.md).


- **getLootTable** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getLootTable(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` [LootTable](LootTable.aus.md).


- **getMap** (`Id`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getMap(int)

	- **@p** `Id` is an int.
	- **@r** `A` [MapView](MapView.aus.md).


- **getMaxChainedNeighborUpdates** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getMaxChainedNeighborUpdates()

	- **@r** `An` int.


- **getMaxPlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getMaxPlayers()

	- **@r** `An` int.


- **getMaxWorldSize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getMaxWorldSize()

	- **@r** `An` int.


- **getMessenger** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getMessenger()

	- **@r** `A` [Messenger](Messenger.aus.md).


- **getMinecraftVersion** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getMinecraftVersion()

	- **@r** `A` string.


- **getMobGoals** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getMobGoals()

	- **@r** `A` [MobGoals](MobGoals.aus.md).


- **getMonsterSpawnLimit** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getMonsterSpawnLimit()

	- **@r** `An` int.


- **getMotd** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getMotd()

	- **@r** `A` string.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getName()

	- **@r** `A` string.


- **getOfflinePlayer** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getOfflinePlayer(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `An` [OfflinePlayer](OfflinePlayer.aus.md).


- **getOfflinePlayer\_id** (`Id`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getOfflinePlayer(java.util.UUID)

	- **@p** `Id` is a string.
	- **@r** `An` [OfflinePlayer](OfflinePlayer.aus.md).


- **getOfflinePlayerIfCached** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getOfflinePlayerIfCached(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `An` [OfflinePlayer](OfflinePlayer.aus.md).


- **getOnlineMode** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getOnlineMode()

	- **@r** `A` bool.


- **getOnlinePlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getOnlinePlayers()

	- **@r** `A` list.


- **getOperators** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getOperators()

	- **@r** `A` list.


- **getPauseWhenEmptyTime** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getPauseWhenEmptyTime()

	- **@r** `An` int.


- **getPermissionMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getPermissionMessage()

	- **@r** `A` string.


- **getPlayer** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getPlayer(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` [Player](Player.aus.md).


- **getPlayer\_id** (`Id`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getPlayer(java.util.UUID)

	- **@p** `Id` is a string.
	- **@r** `A` [Player](Player.aus.md).


- **getPlayerExact** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getPlayerExact(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` [Player](Player.aus.md).


- **getPlayerUniqueId** (`PlayerName`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getPlayerUniqueId(java.lang.String)

	- **@p** `PlayerName` is a string.
	- **@r** `A` string.


- **getPluginCommand** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getPluginCommand(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` [PluginCommand](PluginCommand.aus.md).


- **getPluginManager** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getPluginManager()

	- **@r** `A` [PluginManager](PluginManager.aus.md).


- **getPort** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getPort()

	- **@r** `An` int.


- **getPotionBrewer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getPotionBrewer()

	- **@r** `A` [PotionBrewer](PotionBrewer.aus.md).


- **getRecipe** (`RecipeKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getRecipe(org.bukkit.NamespacedKey)

	- **@p** `RecipeKey` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` [Recipe](Recipe.aus.md).


- **getRecipesFor** (`Result`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getRecipesFor(org.bukkit.inventory.ItemStack)

	- **@p** `Result` is an [ItemStack](ItemStack.aus.md).
	- **@r** `A` list.


- **getRegionScheduler** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getRegionScheduler()

	- **@r** `A` RegionScheduler.


- **getResourcePack** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getResourcePack()

	- **@r** `A` string.


- **getResourcePackHash** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getResourcePackHash()

	- **@r** `A` string.


- **getResourcePackPrompt** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getResourcePackPrompt()

	- **@r** `A` string.


- **getScheduler** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getScheduler()

	- **@r** `A` [BukkitScheduler](BukkitScheduler.aus.md).


- **getScoreboardCriteria** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getScoreboardCriteria(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` [Criteria](Criteria.aus.md).


- **getScoreboardManager** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getScoreboardManager()

	- **@r** `A` [ScoreboardManager](ScoreboardManager.aus.md).


- **getServer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getServer()

	- **@r** `A` [Server](Server.aus.md).


- **getServerConfig** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getServerConfig()

	- **@r** `A` [ServerConfiguration](ServerConfiguration.aus.md).


- **getServerIcon** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getServerIcon()

	- **@r** `A` [CachedServerIcon](CachedServerIcon.aus.md).


- **getServerLinks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getServerLinks()

	- **@r** `A` [ServerLinks](ServerLinks.aus.md).


- **getServerResourcePack** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getServerResourcePack()

	- **@r** `A` [ResourcePack](ResourcePack.aus.md).


- **getServerTickManager** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getServerTickManager()

	- **@r** `A` [ServerTickManager](ServerTickManager.aus.md).


- **getServicesManager** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getServicesManager()

	- **@r** `A` [ServicesManager](ServicesManager.aus.md).


- **getShutdownMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getShutdownMessage()

	- **@r** `A` string.


- **getSimulationDistance** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getSimulationDistance()

	- **@r** `An` int.


- **getSpawnLimit** (`SpawnCategory`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getSpawnLimit(org.bukkit.entity.SpawnCategory)

	- **@p** `SpawnCategory` is a string naming a [SpawnCategory](SpawnCategory.aus.md).
	- **@r** `An` int.


- **getSpawnRadius** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getSpawnRadius()

	- **@r** `An` int.


- **getStructureManager** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getStructureManager()

	- **@r** `A` [StructureManager](StructureManager.aus.md).


- **getTicksPerAmbientSpawns** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getTicksPerAmbientSpawns()

	- **@r** `An` int.


- **getTicksPerAnimalSpawns** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getTicksPerAnimalSpawns()

	- **@r** `An` int.


- **getTicksPerMonsterSpawns** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getTicksPerMonsterSpawns()

	- **@r** `An` int.


- **getTicksPerSpawns** (`SpawnCategory`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getTicksPerSpawns(org.bukkit.entity.SpawnCategory)

	- **@p** `SpawnCategory` is a string naming a [SpawnCategory](SpawnCategory.aus.md).
	- **@r** `An` int.


- **getTicksPerWaterAmbientSpawns** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getTicksPerWaterAmbientSpawns()

	- **@r** `An` int.


- **getTicksPerWaterSpawns** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getTicksPerWaterSpawns()

	- **@r** `An` int.


- **getTicksPerWaterUndergroundCreatureSpawns** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getTicksPerWaterUndergroundCreatureSpawns()

	- **@r** `An` int.


- **getUnsafe** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getUnsafe()

	- **@r** `An` [UnsafeValues](UnsafeValues.aus.md).


- **getUpdateFolder** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getUpdateFolder()

	- **@r** `A` string.


- **getVersion** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getVersion()

	- **@r** `A` string.


- **getVersionMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getVersionMessage()

	- **@r** `A` string.


- **getViewDistance** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getViewDistance()

	- **@r** `An` int.


- **getWarningState** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getWarningState()

	- **@r** `A` string naming a Warning.WarningState.


- **getWaterAmbientSpawnLimit** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getWaterAmbientSpawnLimit()

	- **@r** `An` int.


- **getWaterAnimalSpawnLimit** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getWaterAnimalSpawnLimit()

	- **@r** `An` int.


- **getWaterUndergroundCreatureSpawnLimit** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getWaterUndergroundCreatureSpawnLimit()

	- **@r** `An` int.


- **getWhitelistedPlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getWhitelistedPlayers()

	- **@r** `A` list.


- **getWorld\_worldkey** (`WorldKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getWorld(org.bukkit.NamespacedKey)

	- **@p** `WorldKey` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` [World](World.aus.md).


- **getWorld** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getWorld(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` [World](World.aus.md).


- **getWorld\_uid** (`Uid`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getWorld(java.util.UUID)

	- **@p** `Uid` is a string.
	- **@r** `A` [World](World.aus.md).


- **getWorldType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getWorldType()

	- **@r** `A` string.


- **getWorlds** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#getWorlds()

	- **@r** `A` list.


- **hasWhitelist** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#hasWhitelist()

	- **@r** `A` bool.


- **isAcceptingTransfers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isAcceptingTransfers()

	- **@r** `A` bool.


- **isEnforcingSecureProfiles** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isEnforcingSecureProfiles()

	- **@r** `A` bool.


- **isGlobalTickThread** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isGlobalTickThread()

	- **@r** `A` bool.


- **isHardcore** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isHardcore()

	- **@r** `A` bool.


- **isLoggingIPs** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isLoggingIPs()

	- **@r** `A` bool.


- **isOwnedByCurrentRegion** (`Block`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isOwnedByCurrentRegion(org.bukkit.block.Block)

	- **@p** `Block` is a [Block](Block.aus.md).
	- **@r** `A` bool.


- **isOwnedByCurrentRegion\_entity** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isOwnedByCurrentRegion(org.bukkit.entity.Entity)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **isOwnedByCurrentRegion\_location** (`Location`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isOwnedByCurrentRegion(org.bukkit.Location)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **isOwnedByCurrentRegion** (`Location, SquareRadiusChunks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isOwnedByCurrentRegion(org.bukkit.Location,int)

	- **@p** `Location` is a [Location](Location.aus.md).
	- **@p** `SquareRadiusChunks` is an int.
	- **@r** `A` bool.


- **isOwnedByCurrentRegion\_world\_position** (`World, Position`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isOwnedByCurrentRegion(org.bukkit.World,io.papermc.paper.math.Position)

	- **@p** `World` is a [World](World.aus.md).
	- **@p** `Position` is a [Position](Position.aus.md).
	- **@r** `A` bool.


- **isOwnedByCurrentRegion\_world\_position\_squareradiuschunks** (`World, Position, SquareRadiusChunks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isOwnedByCurrentRegion(org.bukkit.World,io.papermc.paper.math.Position,int)

	- **@p** `World` is a [World](World.aus.md).
	- **@p** `Position` is a [Position](Position.aus.md).
	- **@p** `SquareRadiusChunks` is an int.
	- **@r** `A` bool.


- **isOwnedByCurrentRegion** (`World, ChunkX, ChunkZ`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isOwnedByCurrentRegion(org.bukkit.World,int,int)

	- **@p** `World` is a [World](World.aus.md).
	- **@p** `ChunkX` is an int.
	- **@p** `ChunkZ` is an int.
	- **@r** `A` bool.


- **isOwnedByCurrentRegion** (`World, ChunkX, ChunkZ, SquareRadiusChunks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isOwnedByCurrentRegion(org.bukkit.World,int,int,int)

	- **@p** `World` is a [World](World.aus.md).
	- **@p** `ChunkX` is an int.
	- **@p** `ChunkZ` is an int.
	- **@p** `SquareRadiusChunks` is an int.
	- **@r** `A` bool.


- **isOwnedByCurrentRegion** (`World, MinChunkX, MinChunkZ, MaxChunkX, MaxChunkZ`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isOwnedByCurrentRegion(org.bukkit.World,int,int,int,int)

	- **@p** `World` is a [World](World.aus.md).
	- **@p** `MinChunkX` is an int.
	- **@p** `MinChunkZ` is an int.
	- **@p** `MaxChunkX` is an int.
	- **@p** `MaxChunkZ` is an int.
	- **@r** `A` bool.


- **isPrimaryThread** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isPrimaryThread()

	- **@r** `A` bool.


- **isResourcePackRequired** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isResourcePackRequired()

	- **@r** `A` bool.


- **isStopping** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isStopping()

	- **@r** `A` bool.


- **isTickingWorlds** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isTickingWorlds()

	- **@r** `A` bool.


- **isWhitelistEnforced** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#isWhitelistEnforced()

	- **@r** `A` bool.


- **matchPlayer** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#matchPlayer(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` list.


- **motd** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#motd()

	- **@r** `A` Component.


- **motd** (`Motd`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#motd(net.kyori.adventure.text.Component)

	- **@p** `Motd` is a Component.


- **permissionMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#permissionMessage()

	- **@r** `A` Component.


- **reload** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#reload()



- **reloadCommandAliases** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#reloadCommandAliases()

	- **@r** `A` bool.


- **reloadData** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#reloadData()



- **reloadPermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#reloadPermissions()



- **reloadWhitelist** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#reloadWhitelist()



- **removeBossBar** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#removeBossBar(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` bool.


- **removeRecipe** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#removeRecipe(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` bool.


- **removeRecipe** (`Key, ResendRecipes`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#removeRecipe(org.bukkit.NamespacedKey,boolean)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@p** `ResendRecipes` is a bool.
	- **@r** `A` bool.


- **resetRecipes** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#resetRecipes()



- **restart** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#restart()



- **savePlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#savePlayers()



- **selectEntities** (`Sender, Selector`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#selectEntities(org.bukkit.command.CommandSender,java.lang.String)

	- **@p** `Sender` is a [CommandSender](CommandSender.aus.md).
	- **@p** `Selector` is a string.
	- **@r** `A` list.


- **setDefaultGameMode** (`Mode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#setDefaultGameMode(org.bukkit.GameMode)

	- **@p** `Mode` is a string naming a [GameMode](GameMode.aus.md).


- **setIdleTimeout** (`Threshold`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#setIdleTimeout(int)

	- **@p** `Threshold` is an int.


- **setMaxPlayers** (`MaxPlayers`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#setMaxPlayers(int)

	- **@p** `MaxPlayers` is an int.


- **setMotd** (`Motd`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#setMotd(java.lang.String)

	- **@p** `Motd` is a string.


- **setPauseWhenEmptyTime** (`Seconds`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#setPauseWhenEmptyTime(int)

	- **@p** `Seconds` is an int.


- **setServer** (`Server`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#setServer(org.bukkit.Server)

	- **@p** `Server` is a [Server](Server.aus.md).


- **setSpawnRadius** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#setSpawnRadius(int)

	- **@p** `Value` is an int.


- **setWhitelist** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#setWhitelist(boolean)

	- **@p** `Value` is a bool.


- **setWhitelistEnforced** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#setWhitelistEnforced(boolean)

	- **@p** `Value` is a bool.


- **shouldSendChatPreviews** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#shouldSendChatPreviews()

	- **@r** `A` bool.


- **shutdown** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#shutdown()



- **shutdownMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#shutdownMessage()

	- **@r** `A` Component.


- **spigot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#spigot()

	- **@r** `A` Server.Spigot.


- **suggestPlayerNamesWhenNullTabCompletions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#suggestPlayerNamesWhenNullTabCompletions()

	- **@r** `A` bool.


- **unbanIP** (`Address`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#unbanIP(java.lang.String)

	- **@p** `Address` is a string.


- **unloadWorld** (`Name, Save`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#unloadWorld(java.lang.String,boolean)

	- **@p** `Name` is a string.
	- **@p** `Save` is a bool.
	- **@r** `A` bool.


- **unloadWorld\_world\_save** (`World, Save`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#unloadWorld(org.bukkit.World,boolean)

	- **@p** `World` is a [World](World.aus.md).
	- **@p** `Save` is a bool.
	- **@r** `A` bool.


- **updateRecipes** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#updateRecipes()



- **updateResources** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Bukkit.html#updateResources()





