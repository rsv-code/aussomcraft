# file: UnsafeValues.aus

## class: UnsafeValues

[15:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.UnsafeValuesShim) **extends: object** 

Generated shim for org.bukkit.UnsafeValues.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **checkSupported** (`Pdf`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#checkSupported(org.bukkit.plugin.PluginDescriptionFile)

	- **@p** `Pdf` is a [PluginDescriptionFile](PluginDescriptionFile.aus.md).


- **deserializeStack** (`Args`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#deserializeStack(java.util.Map)

	- **@p** `Args` is a map.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **fromLegacy** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#fromLegacy(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@r** `A` string naming a [Material](Material.aus.md).


- **fromLegacy\_MaterialData** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#fromLegacy(org.bukkit.material.MaterialData)

	- **@p** `Material` is a [MaterialData](MaterialData.aus.md).
	- **@r** `A` string naming a [Material](Material.aus.md).


- **fromLegacy** (`Material, Data`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#fromLegacy(org.bukkit.Material,byte)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@p** `Data` is an int.
	- **@r** `A` [BlockData](BlockData.aus.md).


- **fromLegacy\_material\_itempriority** (`Material, ItemPriority`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#fromLegacy(org.bukkit.material.MaterialData,boolean)

	- **@p** `Material` is a [MaterialData](MaterialData.aus.md).
	- **@p** `ItemPriority` is a bool.
	- **@r** `A` string naming a [Material](Material.aus.md).


- **get** (`Registry, Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#get(io.papermc.paper.registry.RegistryKey,org.bukkit.NamespacedKey)

	- **@p** `Registry` is a [RegistryKey](RegistryKey.aus.md).
	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` [Keyed](Keyed.aus.md).


- **getDataVersion** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#getDataVersion()

	- **@r** `An` int.


- **getInternalPotionData** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#getInternalPotionData(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` PotionType.InternalPotionData.


- **getMainLevelName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#getMainLevelName()

	- **@r** `A` string.


- **getMaterial** (`Material, Version`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#getMaterial(java.lang.String,int)

	- **@p** `Material` is a string.
	- **@p** `Version` is an int.
	- **@r** `A` string naming a [Material](Material.aus.md).


- **getProtocolVersion** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#getProtocolVersion()

	- **@r** `An` int.


- **isLegacyPlugin** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#isLegacyPlugin(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@r** `A` bool.


- **isSupportedApiVersion** (`ApiVersion`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#isSupportedApiVersion(java.lang.String)

	- **@p** `ApiVersion` is a string.
	- **@r** `A` bool.


- **loadAdvancement** (`Key, Advancement`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#loadAdvancement(org.bukkit.NamespacedKey,java.lang.String)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@p** `Advancement` is a string.
	- **@r** `An` [Advancement](Advancement.aus.md).


- **loadAdvancements** (`Advancements, Persist`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#loadAdvancements(java.util.Map,boolean)

	- **@p** `Advancements` is a map.
	- **@p** `Persist` is a bool.
	- **@r** `A` list.


- **modifyItemStack** (`Item, Components`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#modifyItemStack(org.bukkit.inventory.ItemStack,java.lang.String)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).
	- **@p** `Components` is a string.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **nextEntityId** (`World`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#nextEntityId(org.bukkit.World)

	- **@p** `World` is a [World](World.aus.md).
	- **@r** `An` int.


- **removeAdvancement** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#removeAdvancement(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` bool.


- **toLegacy** (`Material`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/UnsafeValues.html#toLegacy(org.bukkit.Material)

	- **@p** `Material` is a string naming a [Material](Material.aus.md).
	- **@r** `A` string naming a [Material](Material.aus.md).




