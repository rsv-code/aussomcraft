# file: PersistentDataContainer.aus

## class: PersistentDataContainer

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.PersistentDataContainerShim) **extends: object** 

Generated shim for org.bukkit.persistence.PersistentDataContainer.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/persistence/PersistentDataContainer.html
In Paper this is a
[PersistentDataContainerView](PersistentDataContainerView.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **copyTo** (`Other, Replace`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/persistence/PersistentDataContainer.html#copyTo(org.bukkit.persistence.PersistentDataContainer,boolean)

	- **@p** `Other` is a [PersistentDataContainer](PersistentDataContainer.aus.md).
	- **@p** `Replace` is a bool.


- **get** (`Key, Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/persistence/PersistentDataContainer.html#get(org.bukkit.NamespacedKey,org.bukkit.persistence.PersistentDataType)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@p** `Type` is a [PersistentDataType](PersistentDataType.aus.md).
	- **@r** `An` Object.


- **getAdapterContext** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/persistence/PersistentDataContainer.html#getAdapterContext()

	- **@r** `A` [PersistentDataAdapterContext](PersistentDataAdapterContext.aus.md).


- **getKeys** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/persistence/PersistentDataContainer.html#getKeys()

	- **@r** `A` list.


- **getOrDefault** (`Key, Type, DefaultValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/persistence/PersistentDataContainer.html#getOrDefault(org.bukkit.NamespacedKey,org.bukkit.persistence.PersistentDataType,java.lang.Object)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@p** `Type` is a [PersistentDataType](PersistentDataType.aus.md).
	- **@p** `DefaultValue` is an Object.
	- **@r** `An` Object.


- **getSize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/persistence/PersistentDataContainer.html#getSize()

	- **@r** `An` int.


- **has** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/persistence/PersistentDataContainer.html#has(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` bool.


- **has** (`Key, Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/persistence/PersistentDataContainer.html#has(org.bukkit.NamespacedKey,org.bukkit.persistence.PersistentDataType)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@p** `Type` is a [PersistentDataType](PersistentDataType.aus.md).
	- **@r** `A` bool.


- **isEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/persistence/PersistentDataContainer.html#isEmpty()

	- **@r** `A` bool.


- **remove** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/persistence/PersistentDataContainer.html#remove(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).


- **set** (`Key, Type, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/persistence/PersistentDataContainer.html#set(org.bukkit.NamespacedKey,org.bukkit.persistence.PersistentDataType,java.lang.Object)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@p** `Type` is a [PersistentDataType](PersistentDataType.aus.md).
	- **@p** `Value` is an Object.




