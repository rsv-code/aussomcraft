# file: Plugin.aus

## class: Plugin

[20:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.PluginShim) **extends: object** 

Generated shim for org.bukkit.plugin.Plugin.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html
In Paper this is a
[LifecycleEventOwner](LifecycleEventOwner.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getConfig** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#getConfig()

	- **@r** `A` [FileConfiguration](FileConfiguration.aus.md).


- **getDefaultBiomeProvider** (`WorldName, Id`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#getDefaultBiomeProvider(java.lang.String,java.lang.String)

	- **@p** `WorldName` is a string.
	- **@p** `Id` is a string.
	- **@r** `A` [BiomeProvider](BiomeProvider.aus.md).


- **getDefaultWorldGenerator** (`WorldName, Id`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#getDefaultWorldGenerator(java.lang.String,java.lang.String)

	- **@p** `WorldName` is a string.
	- **@p** `Id` is a string.
	- **@r** `A` [ChunkGenerator](ChunkGenerator.aus.md).


- **getDescription** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#getDescription()

	- **@r** `A` [PluginDescriptionFile](PluginDescriptionFile.aus.md).


- **getLifecycleManager** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#getLifecycleManager()

	- **@r** `A` [LifecycleEventManager](LifecycleEventManager.aus.md).


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#getName()

	- **@r** `A` string.


- **getPluginLoader** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#getPluginLoader()

	- **@r** `A` [PluginLoader](PluginLoader.aus.md).


- **getPluginMeta** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#getPluginMeta()

	- **@r** `A` [PluginMeta](PluginMeta.aus.md).


- **getServer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#getServer()

	- **@r** `A` [Server](Server.aus.md).


- **isEnabled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#isEnabled()

	- **@r** `A` bool.


- **isNaggable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#isNaggable()

	- **@r** `A` bool.


- **namespace** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#namespace()

	- **@r** `A` string.


- **onDisable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#onDisable()



- **onEnable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#onEnable()



- **onLoad** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#onLoad()



- **reloadConfig** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#reloadConfig()



- **saveConfig** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#saveConfig()



- **saveDefaultConfig** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#saveDefaultConfig()



- **saveResource** (`ResourcePath, Replace`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#saveResource(java.lang.String,boolean)

	- **@p** `ResourcePath` is a string.
	- **@p** `Replace` is a bool.


- **setNaggable** (`CanNag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/Plugin.html#setNaggable(boolean)

	- **@p** `CanNag` is a bool.




