# file: MetadataStore.aus

## class: MetadataStore

[15:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.MetadataStoreShim) **extends: object** 

Generated shim for org.bukkit.metadata.MetadataStore.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/metadata/MetadataStore.html
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getMetadata** (`Subject, MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/metadata/MetadataStore.html#getMetadata(java.lang.Object,java.lang.String)

	- **@p** `Subject` is an Object.
	- **@p** `MetadataKey` is a string.
	- **@r** `A` list.


- **hasMetadata** (`Subject, MetadataKey`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/metadata/MetadataStore.html#hasMetadata(java.lang.Object,java.lang.String)

	- **@p** `Subject` is an Object.
	- **@p** `MetadataKey` is a string.
	- **@r** `A` bool.


- **setMetadata** (`Subject, MetadataKey, NewMetadataValue`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/metadata/MetadataStore.html#setMetadata(java.lang.Object,java.lang.String,org.bukkit.metadata.MetadataValue)

	- **@p** `Subject` is an Object.
	- **@p** `MetadataKey` is a string.
	- **@p** `NewMetadataValue` is a [MetadataValue](MetadataValue.aus.md).


- **invalidateAll** (`OwningPlugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/metadata/MetadataStore.html#invalidateAll(org.bukkit.plugin.Plugin)

	- **@p** `OwningPlugin` is a [Plugin](Plugin.aus.md).


- **removeMetadata** (`Subject, MetadataKey, OwningPlugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/metadata/MetadataStore.html#removeMetadata(java.lang.Object,java.lang.String,org.bukkit.plugin.Plugin)

	- **@p** `Subject` is an Object.
	- **@p** `MetadataKey` is a string.
	- **@p** `OwningPlugin` is a [Plugin](Plugin.aus.md).




