# file: Permission.aus

## class: Permission

[15:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.PermissionShim) **extends: object** 

Generated shim for org.bukkit.permissions.Permission.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permission.html
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addParent\_perm\_value** (`Perm, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permission.html#addParent(org.bukkit.permissions.Permission,boolean)

	- **@p** `Perm` is a [Permission](Permission.aus.md).
	- **@p** `Value` is a bool.


- **addParent** (`Name, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permission.html#addParent(java.lang.String,boolean)

	- **@p** `Name` is a string.
	- **@p** `Value` is a bool.
	- **@r** `A` [Permission](Permission.aus.md).


- **getChildren** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permission.html#getChildren()

	- **@r** `A` map.


- **getDefault** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permission.html#getDefault()

	- **@r** `A` string naming a [PermissionDefault](PermissionDefault.aus.md).


- **getDescription** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permission.html#getDescription()

	- **@r** `A` string.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permission.html#getName()

	- **@r** `A` string.


- **getPermissibles** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permission.html#getPermissibles()

	- **@r** `A` list.


- **loadPermission** (`Name, Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permission.html#loadPermission(java.lang.String,java.util.Map)

	- **@p** `Name` is a string.
	- **@p** `Data` is a map.
	- **@r** `A` [Permission](Permission.aus.md).


- **loadPermission** (`Name, Data, Def, Output`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permission.html#loadPermission(java.lang.String,java.util.Map,org.bukkit.permissions.PermissionDefault,java.util.List)

	- **@p** `Name` is a string.
	- **@p** `Data` is a map.
	- **@p** `Def` is a string naming a [PermissionDefault](PermissionDefault.aus.md).
	- **@p** `Output` is a list.
	- **@r** `A` [Permission](Permission.aus.md).


- **loadPermissions** (`Data, Error, Def`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permission.html#loadPermissions(java.util.Map,java.lang.String,org.bukkit.permissions.PermissionDefault)

	- **@p** `Data` is a map.
	- **@p** `Error` is a string.
	- **@p** `Def` is a string naming a [PermissionDefault](PermissionDefault.aus.md).
	- **@r** `A` list.


- **recalculatePermissibles** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permission.html#recalculatePermissibles()



- **setDefault** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permission.html#setDefault(org.bukkit.permissions.PermissionDefault)

	- **@p** `Value` is a string naming a [PermissionDefault](PermissionDefault.aus.md).


- **setDescription** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permission.html#setDescription(java.lang.String)

	- **@p** `Value` is a string.




