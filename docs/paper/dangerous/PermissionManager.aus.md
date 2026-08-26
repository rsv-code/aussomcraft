# file: PermissionManager.aus

## class: PermissionManager

[15:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.PermissionManagerShim) **extends: object** 

Generated shim for io.papermc.paper.plugin.PermissionManager.
Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/PermissionManager.html
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addPermission** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/PermissionManager.html#addPermission(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).


- **addPermissions** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/PermissionManager.html#addPermissions(java.util.List)

	- **@p** `Perm` is a list.


- **clearPermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/PermissionManager.html#clearPermissions()



- **getDefaultPermSubscriptions** (`Op`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/PermissionManager.html#getDefaultPermSubscriptions(boolean)

	- **@p** `Op` is a bool.
	- **@r** `A` list.


- **getDefaultPermissions** (`Op`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/PermissionManager.html#getDefaultPermissions(boolean)

	- **@p** `Op` is a bool.
	- **@r** `A` list.


- **getPermission** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/PermissionManager.html#getPermission(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` [Permission](Permission.aus.md).


- **getPermissionSubscriptions** (`Permission`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/PermissionManager.html#getPermissionSubscriptions(java.lang.String)

	- **@p** `Permission` is a string.
	- **@r** `A` list.


- **getPermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/PermissionManager.html#getPermissions()

	- **@r** `A` list.


- **recalculatePermissionDefaults** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/PermissionManager.html#recalculatePermissionDefaults(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).


- **removePermission\_perm** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/PermissionManager.html#removePermission(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).


- **removePermission** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/PermissionManager.html#removePermission(java.lang.String)

	- **@p** `Name` is a string.


- **subscribeToDefaultPerms** (`Op, Permissible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/PermissionManager.html#subscribeToDefaultPerms(boolean,org.bukkit.permissions.Permissible)

	- **@p** `Op` is a bool.
	- **@p** `Permissible` is a [Permissible](Permissible.aus.md).


- **subscribeToPermission** (`Permission, Permissible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/PermissionManager.html#subscribeToPermission(java.lang.String,org.bukkit.permissions.Permissible)

	- **@p** `Permission` is a string.
	- **@p** `Permissible` is a [Permissible](Permissible.aus.md).


- **unsubscribeFromDefaultPerms** (`Op, Permissible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/PermissionManager.html#unsubscribeFromDefaultPerms(boolean,org.bukkit.permissions.Permissible)

	- **@p** `Op` is a bool.
	- **@p** `Permissible` is a [Permissible](Permissible.aus.md).


- **unsubscribeFromPermission** (`Permission, Permissible`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/plugin/PermissionManager.html#unsubscribeFromPermission(java.lang.String,org.bukkit.permissions.Permissible)

	- **@p** `Permission` is a string.
	- **@p** `Permissible` is a [Permissible](Permissible.aus.md).




