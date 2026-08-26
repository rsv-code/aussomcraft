# file: Registry.aus

## class: Registry

[15:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.RegistryShim) **extends: object** 

Generated shim for org.bukkit.Registry.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Registry.html
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **get** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Registry.html#get(org.bukkit.NamespacedKey)

	- **@p** `A0` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` [Keyed](Keyed.aus.md).


- **get\_TypedKey** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Registry.html#get(io.papermc.paper.registry.TypedKey)

	- **@p** `A0` is a [TypedKey](TypedKey.aus.md).
	- **@r** `A` [Keyed](Keyed.aus.md).


- **getKey** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Registry.html#getKey(org.bukkit.Keyed)

	- **@p** `A0` is a [Keyed](Keyed.aus.md).
	- **@r** `A` [NamespacedKey](NamespacedKey.aus.md).


- **getKeyOrThrow** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Registry.html#getKeyOrThrow(org.bukkit.Keyed)

	- **@p** `A0` is a [Keyed](Keyed.aus.md).
	- **@r** `A` [NamespacedKey](NamespacedKey.aus.md).


- **getOrThrow** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Registry.html#getOrThrow(org.bukkit.NamespacedKey)

	- **@p** `A0` is a [NamespacedKey](NamespacedKey.aus.md).
	- **@r** `A` [Keyed](Keyed.aus.md).


- **getOrThrow\_TypedKey** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Registry.html#getOrThrow(io.papermc.paper.registry.TypedKey)

	- **@p** `A0` is a [TypedKey](TypedKey.aus.md).
	- **@r** `A` [Keyed](Keyed.aus.md).


- **getTag** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Registry.html#getTag(io.papermc.paper.registry.tag.TagKey)

	- **@p** `A0` is a [TagKey](TagKey.aus.md).
	- **@r** `A` [Tag](Tag.aus.md).


- **getTagValues** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Registry.html#getTagValues(io.papermc.paper.registry.tag.TagKey)

	- **@p** `A0` is a [TagKey](TagKey.aus.md).
	- **@r** `A` list.


- **getTags** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Registry.html#getTags()

	- **@r** `A` list.


- **hasTag** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Registry.html#hasTag(io.papermc.paper.registry.tag.TagKey)

	- **@p** `A0` is a [TagKey](TagKey.aus.md).
	- **@r** `A` bool.


- **match** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Registry.html#match(java.lang.String)

	- **@p** `A0` is a string.
	- **@r** `A` [Keyed](Keyed.aus.md).


- **size** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Registry.html#size()

	- **@r** `An` int.




