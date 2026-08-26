# file: PluginBase.aus

## class: PluginBase

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.PluginBaseShim) **extends: object** 

Generated shim for org.bukkit.plugin.PluginBase.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html
In Paper this is a [Plugin](Plugin.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **equals** (`Obj`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#equals(java.lang.Object)

	- **@p** `Obj` is an Object.
	- **@r** `A` bool.


- **getConfig** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#getConfig()

	- **@r** `A` [FileConfiguration](FileConfiguration.aus.md).


- **getDefaultBiomeProvider** (`WorldName, Id`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#getDefaultBiomeProvider(java.lang.String,java.lang.String)

	- **@p** `WorldName` is a string.
	- **@p** `Id` is a string.
	- **@r** `A` [BiomeProvider](BiomeProvider.aus.md).


- **getDefaultWorldGenerator** (`WorldName, Id`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#getDefaultWorldGenerator(java.lang.String,java.lang.String)

	- **@p** `WorldName` is a string.
	- **@p** `Id` is a string.
	- **@r** `A` [ChunkGenerator](ChunkGenerator.aus.md).


- **getDescription** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#getDescription()

	- **@r** `A` [PluginDescriptionFile](PluginDescriptionFile.aus.md).


- **getLifecycleManager** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#getLifecycleManager()

	- **@r** `A` [LifecycleEventManager](LifecycleEventManager.aus.md).


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#getName()

	- **@r** `A` string.


- **getPluginLoader** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#getPluginLoader()

	- **@r** `A` [PluginLoader](PluginLoader.aus.md).


- **getPluginMeta** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#getPluginMeta()

	- **@r** `A` [PluginMeta](PluginMeta.aus.md).


- **getServer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#getServer()

	- **@r** `A` [Server](Server.aus.md).


- **hashCode** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#hashCode()

	- **@r** `An` int.


- **isEnabled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#isEnabled()

	- **@r** `A` bool.


- **isNaggable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#isNaggable()

	- **@r** `A` bool.


- **namespace** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#namespace()

	- **@r** `A` string.


- **onDisable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#onDisable()



- **onEnable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#onEnable()



- **onLoad** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#onLoad()



- **reloadConfig** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#reloadConfig()



- **saveConfig** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#saveConfig()



- **saveDefaultConfig** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#saveDefaultConfig()



- **saveResource** (`ResourcePath, Replace`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#saveResource(java.lang.String,boolean)

	- **@p** `ResourcePath` is a string.
	- **@p** `Replace` is a bool.


- **setNaggable** (`CanNag`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginBase.html#setNaggable(boolean)

	- **@p** `CanNag` is a bool.




