# file: PluginManager.aus

## class: PluginManager

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.PluginManagerShim) **extends: object** 

Generated shim for org.bukkit.plugin.PluginManager.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html
In Paper this is a [PermissionManager](PermissionManager.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addPermission** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#addPermission(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).


- **addPermissions** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#addPermissions(java.util.List)

	- **@p** `Perm` is a list.


- **callEvent** (`Event`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#callEvent(org.bukkit.event.Event)

	- **@p** `Event` is an [Event](Event.aus.md).


- **clearPermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#clearPermissions()



- **clearPlugins** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#clearPlugins()



- **disablePlugin** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#disablePlugin(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).


- **disablePlugins** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#disablePlugins()



- **enablePlugin** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#enablePlugin(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).


- **getDefaultPermSubscriptions** (`Op`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#getDefaultPermSubscriptions(boolean)

	- **@p** `Op` is a bool.
	- **@r** `A` list.


- **getDefaultPermissions** (`Op`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#getDefaultPermissions(boolean)

	- **@p** `Op` is a bool.
	- **@r** `A` list.


- **getPermission** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#getPermission(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` [Permission](Permission.aus.md).


- **getPermissionSubscriptions** (`Permission`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#getPermissionSubscriptions(java.lang.String)

	- **@p** `Permission` is a string.
	- **@r** `A` list.


- **getPermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#getPermissions()

	- **@r** `A` list.


- **getPlugin** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#getPlugin(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` [Plugin](Plugin.aus.md).


- **isPluginEnabled\_plugin** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#isPluginEnabled(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@r** `A` bool.


- **isPluginEnabled** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#isPluginEnabled(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **isTransitiveDependency** (`PluginMeta, DependencyConfig`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#isTransitiveDependency(io.papermc.paper.plugin.configuration.PluginMeta,io.papermc.paper.plugin.configuration.PluginMeta)

	- **@p** `PluginMeta` is a [PluginMeta](PluginMeta.aus.md).
	- **@p** `DependencyConfig` is a [PluginMeta](PluginMeta.aus.md).
	- **@r** `A` bool.


- **overridePermissionManager** (`Plugin, PermissionManager`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#overridePermissionManager(org.bukkit.plugin.Plugin,io.papermc.paper.plugin.PermissionManager)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `PermissionManager` is a [PermissionManager](PermissionManager.aus.md).


- **recalculatePermissionDefaults** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#recalculatePermissionDefaults(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).


- **registerEvents** (`Listener, Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#registerEvents(org.bukkit.event.Listener,org.bukkit.plugin.Plugin)

	- **@p** `Listener` is a Listener.
	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).


- **removePermission\_perm** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#removePermission(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).


- **removePermission** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#removePermission(java.lang.String)

	- **@p** `Name` is a string.


- **subscribeToDefaultPerms** (`Op, Permissible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#subscribeToDefaultPerms(boolean,org.bukkit.permissions.Permissible)

	- **@p** `Op` is a bool.
	- **@p** `Permissible` is a [Permissible](Permissible.aus.md).


- **subscribeToPermission** (`Permission, Permissible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#subscribeToPermission(java.lang.String,org.bukkit.permissions.Permissible)

	- **@p** `Permission` is a string.
	- **@p** `Permissible` is a [Permissible](Permissible.aus.md).


- **unsubscribeFromDefaultPerms** (`Op, Permissible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#unsubscribeFromDefaultPerms(boolean,org.bukkit.permissions.Permissible)

	- **@p** `Op` is a bool.
	- **@p** `Permissible` is a [Permissible](Permissible.aus.md).


- **unsubscribeFromPermission** (`Permission, Permissible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#unsubscribeFromPermission(java.lang.String,org.bukkit.permissions.Permissible)

	- **@p** `Permission` is a string.
	- **@p** `Permissible` is a [Permissible](Permissible.aus.md).


- **useTimings** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/PluginManager.html#useTimings()

	- **@r** `A` bool.




