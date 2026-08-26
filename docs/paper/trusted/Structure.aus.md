# file: Structure.aus

## class: Structure

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.StructureShim) **extends: object** 

Generated shim for org.bukkit.structure.Structure.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/Structure.html
In Paper this is a
[PersistentDataHolder](PersistentDataHolder.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **fill** (`Origin, Size, IncludeEntities`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/Structure.html#fill(org.bukkit.Location,org.bukkit.util.BlockVector,boolean)

	- **@p** `Origin` is a [Location](Location.aus.md).
	- **@p** `Size` is a [BlockVector](BlockVector.aus.md).
	- **@p** `IncludeEntities` is a bool.


- **fill\_corner1\_corner2\_includeentities** (`Corner1, Corner2, IncludeEntities`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/Structure.html#fill(org.bukkit.Location,org.bukkit.Location,boolean)

	- **@p** `Corner1` is a [Location](Location.aus.md).
	- **@p** `Corner2` is a [Location](Location.aus.md).
	- **@p** `IncludeEntities` is a bool.


- **getEntities** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/Structure.html#getEntities()

	- **@r** `A` list.


- **getEntityCount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/Structure.html#getEntityCount()

	- **@r** `An` int.


- **getPaletteCount** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/Structure.html#getPaletteCount()

	- **@r** `An` int.


- **getPalettes** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/Structure.html#getPalettes()

	- **@r** `A` list.


- **getPersistentDataContainer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/Structure.html#getPersistentDataContainer()

	- **@r** `A` [PersistentDataContainer](PersistentDataContainer.aus.md).


- **getSize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/structure/Structure.html#getSize()

	- **@r** `A` [BlockVector](BlockVector.aus.md).




