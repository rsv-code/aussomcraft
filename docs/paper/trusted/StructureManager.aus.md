# file: StructureManager.aus

## class: StructureManager

[15:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.StructureManagerShim) **extends: object** 

Generated shim for org.bukkit.structure.StructureManager.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/StructureManager.html
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **copy** (`Structure`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/StructureManager.html#copy(org.bukkit.structure.Structure)

	- **@p** `Structure` is a [Structure](Structure.aus.md).
	- **@r** `A` [Structure](Structure.aus.md).


- **createStructure** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/StructureManager.html#createStructure()

	- **@r** `A` [Structure](Structure.aus.md).


- **deleteStructure** (`StructureKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/StructureManager.html#deleteStructure(org.bukkit.NamespacedKey)

	- **@p** `StructureKey` is a [NamespacedKey](NamespacedKey.aus.md).


- **deleteStructure** (`StructureKey, Unregister`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/StructureManager.html#deleteStructure(org.bukkit.NamespacedKey,boolean)

	- **@p** `StructureKey` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@p** `Unregister` is a bool.


- **getStructure** (`StructureKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/StructureManager.html#getStructure(org.bukkit.NamespacedKey)

	- **@p** `StructureKey` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` [Structure](Structure.aus.md).


- **getStructures** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/StructureManager.html#getStructures()

	- **@r** `A` map.


- **loadStructure** (`StructureKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/StructureManager.html#loadStructure(org.bukkit.NamespacedKey)

	- **@p** `StructureKey` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` [Structure](Structure.aus.md).


- **loadStructure** (`StructureKey, Register`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/StructureManager.html#loadStructure(org.bukkit.NamespacedKey,boolean)

	- **@p** `StructureKey` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@p** `Register` is a bool.
	- **@r** `A` [Structure](Structure.aus.md).


- **registerStructure** (`StructureKey, Structure`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/StructureManager.html#registerStructure(org.bukkit.NamespacedKey,org.bukkit.structure.Structure)

	- **@p** `StructureKey` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@p** `Structure` is a [Structure](Structure.aus.md).
	- **@r** `A` [Structure](Structure.aus.md).


- **saveStructure** (`StructureKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/StructureManager.html#saveStructure(org.bukkit.NamespacedKey)

	- **@p** `StructureKey` is a [NamespacedKey](NamespacedKey.aus.md).


- **saveStructure** (`StructureKey, Structure`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/StructureManager.html#saveStructure(org.bukkit.NamespacedKey,org.bukkit.structure.Structure)

	- **@p** `StructureKey` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@p** `Structure` is a [Structure](Structure.aus.md).


- **unregisterStructure** (`StructureKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/StructureManager.html#unregisterStructure(org.bukkit.NamespacedKey)

	- **@p** `StructureKey` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` [Structure](Structure.aus.md).




