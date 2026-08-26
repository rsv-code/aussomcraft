# file: PersistentDataContainerView.aus

## class: PersistentDataContainerView

[15:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.PersistentDataContainerViewShim) **extends: object** 

Generated shim for io.papermc.paper.persistence.PersistentDataContainerView.
Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/persistence/PersistentDataContainerView.html
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **copyTo** (`Other, Replace`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/persistence/PersistentDataContainerView.html#copyTo(org.bukkit.persistence.PersistentDataContainer,boolean)

	- **@p** `Other` is a [PersistentDataContainer](PersistentDataContainer.aus.md).
	- **@p** `Replace` is a bool.


- **get** (`Key, Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/persistence/PersistentDataContainerView.html#get(org.bukkit.NamespacedKey,org.bukkit.persistence.PersistentDataType)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@p** `Type` is a [PersistentDataType](PersistentDataType.aus.md).
	- **@r** `An` Object.


- **getAdapterContext** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/persistence/PersistentDataContainerView.html#getAdapterContext()

	- **@r** `A` [PersistentDataAdapterContext](PersistentDataAdapterContext.aus.md).


- **getKeys** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/persistence/PersistentDataContainerView.html#getKeys()

	- **@r** `A` list.


- **getOrDefault** (`Key, Type, DefaultValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/persistence/PersistentDataContainerView.html#getOrDefault(org.bukkit.NamespacedKey,org.bukkit.persistence.PersistentDataType,java.lang.Object)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@p** `Type` is a [PersistentDataType](PersistentDataType.aus.md).
	- **@p** `DefaultValue` is an Object.
	- **@r** `An` Object.


- **getSize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/persistence/PersistentDataContainerView.html#getSize()

	- **@r** `An` int.


- **has** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/persistence/PersistentDataContainerView.html#has(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` bool.


- **has** (`Key, Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/persistence/PersistentDataContainerView.html#has(org.bukkit.NamespacedKey,org.bukkit.persistence.PersistentDataType)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@p** `Type` is a [PersistentDataType](PersistentDataType.aus.md).
	- **@r** `A` bool.


- **isEmpty** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/persistence/PersistentDataContainerView.html#isEmpty()

	- **@r** `A` bool.




