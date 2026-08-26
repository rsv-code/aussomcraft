# file: JavaPlugin.aus

## class: JavaPlugin

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.JavaPluginShim) **extends: object** 

Generated shim for org.bukkit.plugin.java.JavaPlugin.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html
In Paper this is a [PluginBase](PluginBase.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **equals** (`Obj`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#equals(java.lang.Object)

	- **@p** `Obj` is an Object.
	- **@r** `A` bool.


- **getCommand** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#getCommand(java.lang.String)

	- **@p** `A0` is a string.
	- **@r** `A` [PluginCommand](PluginCommand.aus.md).


- **getConfig** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#getConfig()

	- **@r** `A` [FileConfiguration](FileConfiguration.aus.md).


- **getDefaultBiomeProvider** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#getDefaultBiomeProvider(java.lang.String,java.lang.String)

	- **@p** `A0` is a string.
	- **@p** `A1` is a string.
	- **@r** `A` [BiomeProvider](BiomeProvider.aus.md).


- **getDefaultWorldGenerator** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#getDefaultWorldGenerator(java.lang.String,java.lang.String)

	- **@p** `A0` is a string.
	- **@p** `A1` is a string.
	- **@r** `A` [ChunkGenerator](ChunkGenerator.aus.md).


- **getDescription** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#getDescription()

	- **@r** `A` [PluginDescriptionFile](PluginDescriptionFile.aus.md).


- **getLifecycleManager** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#getLifecycleManager()

	- **@r** `A` [LifecycleEventManager](LifecycleEventManager.aus.md).


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#getName()

	- **@r** `A` string.


- **getPluginLoader** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#getPluginLoader()

	- **@r** `A` [PluginLoader](PluginLoader.aus.md).


- **getPluginMeta** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#getPluginMeta()

	- **@r** `A` [PluginMeta](PluginMeta.aus.md).


- **getServer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#getServer()

	- **@r** `A` [Server](Server.aus.md).


- **hashCode** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#hashCode()

	- **@r** `An` int.


- **isEnabled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#isEnabled()

	- **@r** `A` bool.


- **isNaggable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#isNaggable()

	- **@r** `A` bool.


- **namespace** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#namespace()

	- **@r** `A` string.


- **onDisable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#onDisable()



- **onEnable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#onEnable()



- **onLoad** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#onLoad()



- **registerCommand** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#registerCommand(java.lang.String,io.papermc.paper.command.brigadier.BasicCommand)

	- **@p** `A0` is a string.
	- **@p** `A1` is a [BasicCommand](BasicCommand.aus.md).


- **registerCommand\_String\_Collection\_BasicCommand** (`A0, A1, A2`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#registerCommand(java.lang.String,java.util.Collection,io.papermc.paper.command.brigadier.BasicCommand)

	- **@p** `A0` is a string.
	- **@p** `A1` is a list.
	- **@p** `A2` is a [BasicCommand](BasicCommand.aus.md).


- **registerCommand** (`A0, A1, A2`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#registerCommand(java.lang.String,java.lang.String,io.papermc.paper.command.brigadier.BasicCommand)

	- **@p** `A0` is a string.
	- **@p** `A1` is a string.
	- **@p** `A2` is a [BasicCommand](BasicCommand.aus.md).


- **registerCommand** (`A0, A1, A2, A3`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#registerCommand(java.lang.String,java.lang.String,java.util.Collection,io.papermc.paper.command.brigadier.BasicCommand)

	- **@p** `A0` is a string.
	- **@p** `A1` is a string.
	- **@p** `A2` is a list.
	- **@p** `A3` is a [BasicCommand](BasicCommand.aus.md).


- **reloadConfig** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#reloadConfig()



- **saveConfig** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#saveConfig()



- **saveDefaultConfig** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#saveDefaultConfig()



- **saveResource** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#saveResource(java.lang.String,boolean)

	- **@p** `A0` is a string.
	- **@p** `A1` is a bool.


- **setEnabled** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#setEnabled(boolean)

	- **@p** `A0` is a bool.


- **setNaggable** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#setNaggable(boolean)

	- **@p** `A0` is a bool.


- **toString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/JavaPlugin.html#toString()

	- **@r** `A` string.




