# file: PluginClassLoader.aus

## class: PluginClassLoader

[20:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.PluginClassLoaderShim) **extends: object** 

Generated shim for org.bukkit.plugin.java.PluginClassLoader.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/PluginClassLoader.html
In Paper this is a
[ConfiguredPluginClassLoader](ConfiguredPluginClassLoader.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **clearAssertionStatus** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/PluginClassLoader.html#clearAssertionStatus()



- **close** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/PluginClassLoader.html#close()



- **getConfiguration** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/PluginClassLoader.html#getConfiguration()

	- **@r** `A` [PluginMeta](PluginMeta.aus.md).


- **getGroup** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/PluginClassLoader.html#getGroup()

	- **@r** `A` [PluginClassLoaderGroup](PluginClassLoaderGroup.aus.md).


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/PluginClassLoader.html#getName()

	- **@r** `A` string.


- **getPlugin** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/PluginClassLoader.html#getPlugin()

	- **@r** `A` [JavaPlugin](JavaPlugin.aus.md).


- **init** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/PluginClassLoader.html#init(org.bukkit.plugin.java.JavaPlugin)

	- **@p** `Plugin` is a [JavaPlugin](JavaPlugin.aus.md).


- **initialize** (`JavaPlugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/PluginClassLoader.html#initialize(org.bukkit.plugin.java.JavaPlugin)

	- **@p** `JavaPlugin` is a [JavaPlugin](JavaPlugin.aus.md).


- **isRegisteredAsParallelCapable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/PluginClassLoader.html#isRegisteredAsParallelCapable()

	- **@r** `A` bool.


- **setClassAssertionStatus** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/PluginClassLoader.html#setClassAssertionStatus(java.lang.String,boolean)

	- **@p** `A0` is a string.
	- **@p** `A1` is a bool.


- **setDefaultAssertionStatus** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/PluginClassLoader.html#setDefaultAssertionStatus(boolean)

	- **@p** `A0` is a bool.


- **setPackageAssertionStatus** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/PluginClassLoader.html#setPackageAssertionStatus(java.lang.String,boolean)

	- **@p** `A0` is a string.
	- **@p** `A1` is a bool.


- **toString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/java/PluginClassLoader.html#toString()

	- **@r** `A` string.




