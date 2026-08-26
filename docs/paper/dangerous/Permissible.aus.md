# file: Permissible.aus

## class: Permissible

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.PermissibleShim) **extends: object** 

Generated shim for org.bukkit.permissions.Permissible.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permissible.html
In Paper this is a [ServerOperator](ServerOperator.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getEffectivePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permissible.html#getEffectivePermissions()

	- **@r** `A` list.


- **hasPermission\_perm** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permissible.html#hasPermission(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).
	- **@r** `A` bool.


- **hasPermission** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permissible.html#hasPermission(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **isOp** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permissible.html#isOp()

	- **@r** `A` bool.


- **isPermissionSet\_perm** (`Perm`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permissible.html#isPermissionSet(org.bukkit.permissions.Permission)

	- **@p** `Perm` is a [Permission](Permission.aus.md).
	- **@r** `A` bool.


- **isPermissionSet** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permissible.html#isPermissionSet(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` bool.


- **recalculatePermissions** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permissible.html#recalculatePermissions()



- **addAttachment** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permissible.html#addAttachment(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permissible.html#addAttachment(org.bukkit.plugin.Plugin,int)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Ticks` is an int.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Name, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permissible.html#addAttachment(org.bukkit.plugin.Plugin,java.lang.String,boolean)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Name` is a string.
	- **@p** `Value` is a bool.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **addAttachment** (`Plugin, Name, Value, Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permissible.html#addAttachment(org.bukkit.plugin.Plugin,java.lang.String,boolean,int)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Name` is a string.
	- **@p** `Value` is a bool.
	- **@p** `Ticks` is an int.
	- **@r** `A` [PermissionAttachment](PermissionAttachment.aus.md).


- **removeAttachment** (`Attachment`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permissible.html#removeAttachment(org.bukkit.permissions.PermissionAttachment)

	- **@p** `Attachment` is a [PermissionAttachment](PermissionAttachment.aus.md).


- **setOp** (`Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/permissions/Permissible.html#setOp(boolean)

	- **@p** `Value` is a bool.




