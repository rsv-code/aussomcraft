# file: PaperClassLoaderStorage.aus

## class: PaperClassLoaderStorage

[15:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.PaperClassLoaderStorageShim) **extends: object** 

Generated shim for io.papermc.paper.plugin.provider.classloader.PaperClassLoaderStorage.
Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/provider/classloader/PaperClassLoaderStorage.html
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **instance** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/provider/classloader/PaperClassLoaderStorage.html#instance()

	- **@r** `A` [PaperClassLoaderStorage](PaperClassLoaderStorage.aus.md).


- **registerAccessBackedGroup** (`ClassLoader, Access`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/provider/classloader/PaperClassLoaderStorage.html#registerAccessBackedGroup(io.papermc.paper.plugin.provider.classloader.ConfiguredPluginClassLoader,io.papermc.paper.plugin.provider.classloader.ClassLoaderAccess)

	- **@p** `ClassLoader` is a [ConfiguredPluginClassLoader](ConfiguredPluginClassLoader.aus.md).
	- **@p** `Access` is a [ClassLoaderAccess](ClassLoaderAccess.aus.md).
	- **@r** `A` [PluginClassLoaderGroup](PluginClassLoaderGroup.aus.md).


- **registerOpenGroup** (`ClassLoader`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/provider/classloader/PaperClassLoaderStorage.html#registerOpenGroup(io.papermc.paper.plugin.provider.classloader.ConfiguredPluginClassLoader)

	- **@p** `ClassLoader` is a [ConfiguredPluginClassLoader](ConfiguredPluginClassLoader.aus.md).
	- **@r** `A` [PluginClassLoaderGroup](PluginClassLoaderGroup.aus.md).


- **registerSpigotGroup** (`PluginClassLoader`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/provider/classloader/PaperClassLoaderStorage.html#registerSpigotGroup(org.bukkit.plugin.java.PluginClassLoader)

	- **@p** `PluginClassLoader` is a [PluginClassLoader](PluginClassLoader.aus.md).
	- **@r** `A` [PluginClassLoaderGroup](PluginClassLoaderGroup.aus.md).


- **registerUnsafePlugin** (`PluginLoader`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/provider/classloader/PaperClassLoaderStorage.html#registerUnsafePlugin(io.papermc.paper.plugin.provider.classloader.ConfiguredPluginClassLoader)

	- **@p** `PluginLoader` is a [ConfiguredPluginClassLoader](ConfiguredPluginClassLoader.aus.md).
	- **@r** `A` bool.


- **unregisterClassloader** (`ConfiguredPluginClassLoader`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/provider/classloader/PaperClassLoaderStorage.html#unregisterClassloader(io.papermc.paper.plugin.provider.classloader.ConfiguredPluginClassLoader)

	- **@p** `ConfiguredPluginClassLoader` is a [ConfiguredPluginClassLoader](ConfiguredPluginClassLoader.aus.md).




