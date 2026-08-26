# file: BoundingBox.aus

## class: BoundingBox

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.BoundingBoxShim) **extends: object** 

Generated shim for org.bukkit.util.BoundingBox.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html
In Paper this is a
[ConfigurationSerializable](ConfigurationSerializable.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **clone** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#clone()

	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **contains** (`Other`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#contains(org.bukkit.util.BoundingBox)

	- **@p** `Other` is a [BoundingBox](BoundingBox.aus.md).
	- **@r** `A` bool.


- **contains\_position** (`Position`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#contains(org.bukkit.util.Vector)

	- **@p** `Position` is a [Vector](Vector.aus.md).
	- **@r** `A` bool.


- **contains** (`Min, Max`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#contains(org.bukkit.util.Vector,org.bukkit.util.Vector)

	- **@p** `Min` is a [Vector](Vector.aus.md).
	- **@p** `Max` is a [Vector](Vector.aus.md).
	- **@r** `A` bool.


- **contains** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#contains(double,double,double)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` bool.


- **copy** (`Other`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#copy(org.bukkit.util.BoundingBox)

	- **@p** `Other` is a [BoundingBox](BoundingBox.aus.md).
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **deserialize** (`Args`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#deserialize(java.util.Map)

	- **@p** `Args` is a map.
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **equals** (`Obj`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#equals(java.lang.Object)

	- **@p** `Obj` is an Object.
	- **@r** `A` bool.


- **expand\_Vector** (`Expansion`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#expand(org.bukkit.util.Vector)

	- **@p** `Expansion` is a [Vector](Vector.aus.md).
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **expand** (`Expansion`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#expand(double)

	- **@p** `Expansion` is a double.
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **expand** (`BlockFace, Expansion`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#expand(org.bukkit.block.BlockFace,double)

	- **@p** `BlockFace` is a string naming a [BlockFace](BlockFace.aus.md).
	- **@p** `Expansion` is a double.
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **expand\_direction\_expansion** (`Direction, Expansion`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#expand(org.bukkit.util.Vector,double)

	- **@p** `Direction` is a [Vector](Vector.aus.md).
	- **@p** `Expansion` is a double.
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **expand** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#expand(double,double,double)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **expand** (`DirX, DirY, DirZ, Expansion`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#expand(double,double,double,double)

	- **@p** `DirX` is a double.
	- **@p** `DirY` is a double.
	- **@p** `DirZ` is a double.
	- **@p** `Expansion` is a double.
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **expand** (`NegativeX, NegativeY, NegativeZ, PositiveX, PositiveY, PositiveZ`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#expand(double,double,double,double,double,double)

	- **@p** `NegativeX` is a double.
	- **@p** `NegativeY` is a double.
	- **@p** `NegativeZ` is a double.
	- **@p** `PositiveX` is a double.
	- **@p** `PositiveY` is a double.
	- **@p** `PositiveZ` is a double.
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **expandDirectional** (`Direction`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#expandDirectional(org.bukkit.util.Vector)

	- **@p** `Direction` is a [Vector](Vector.aus.md).
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **expandDirectional** (`DirX, DirY, DirZ`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#expandDirectional(double,double,double)

	- **@p** `DirX` is a double.
	- **@p** `DirY` is a double.
	- **@p** `DirZ` is a double.
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **getCenter** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#getCenter()

	- **@r** `A` [Vector](Vector.aus.md).


- **getCenterX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#getCenterX()

	- **@r** `A` double.


- **getCenterY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#getCenterY()

	- **@r** `A` double.


- **getCenterZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#getCenterZ()

	- **@r** `A` double.


- **getHeight** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#getHeight()

	- **@r** `A` double.


- **getMax** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#getMax()

	- **@r** `A` [Vector](Vector.aus.md).


- **getMaxX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#getMaxX()

	- **@r** `A` double.


- **getMaxY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#getMaxY()

	- **@r** `A` double.


- **getMaxZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#getMaxZ()

	- **@r** `A` double.


- **getMin** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#getMin()

	- **@r** `A` [Vector](Vector.aus.md).


- **getMinX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#getMinX()

	- **@r** `A` double.


- **getMinY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#getMinY()

	- **@r** `A` double.


- **getMinZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#getMinZ()

	- **@r** `A` double.


- **getVolume** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#getVolume()

	- **@r** `A` double.


- **getWidthX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#getWidthX()

	- **@r** `A` double.


- **getWidthZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#getWidthZ()

	- **@r** `A` double.


- **hashCode** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#hashCode()

	- **@r** `An` int.


- **intersection** (`Other`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#intersection(org.bukkit.util.BoundingBox)

	- **@p** `Other` is a [BoundingBox](BoundingBox.aus.md).
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **of** (`Block`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#of(org.bukkit.block.Block)

	- **@p** `Block` is a [Block](Block.aus.md).
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **of** (`Corner1, Corner2`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#of(org.bukkit.block.Block,org.bukkit.block.Block)

	- **@p** `Corner1` is a [Block](Block.aus.md).
	- **@p** `Corner2` is a [Block](Block.aus.md).
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **of\_Location\_Location** (`Corner1, Corner2`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#of(org.bukkit.Location,org.bukkit.Location)

	- **@p** `Corner1` is a [Location](Location.aus.md).
	- **@p** `Corner2` is a [Location](Location.aus.md).
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **of\_Vector\_Vector** (`Corner1, Corner2`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#of(org.bukkit.util.Vector,org.bukkit.util.Vector)

	- **@p** `Corner1` is a [Vector](Vector.aus.md).
	- **@p** `Corner2` is a [Vector](Vector.aus.md).
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **of** (`Center, X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#of(org.bukkit.Location,double,double,double)

	- **@p** `Center` is a [Location](Location.aus.md).
	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **of\_Vector\_double\_double\_double** (`Center, X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#of(org.bukkit.util.Vector,double,double,double)

	- **@p** `Center` is a [Vector](Vector.aus.md).
	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **overlaps** (`Other`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#overlaps(org.bukkit.util.BoundingBox)

	- **@p** `Other` is a [BoundingBox](BoundingBox.aus.md).
	- **@r** `A` bool.


- **overlaps** (`Min, Max`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#overlaps(org.bukkit.util.Vector,org.bukkit.util.Vector)

	- **@p** `Min` is a [Vector](Vector.aus.md).
	- **@p** `Max` is a [Vector](Vector.aus.md).
	- **@r** `A` bool.


- **rayTrace** (`Start, Direction, MaxDistance`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#rayTrace(org.bukkit.util.Vector,org.bukkit.util.Vector,double)

	- **@p** `Start` is a [Vector](Vector.aus.md).
	- **@p** `Direction` is a [Vector](Vector.aus.md).
	- **@p** `MaxDistance` is a double.
	- **@r** `A` [RayTraceResult](RayTraceResult.aus.md).


- **resize** (`X1, Y1, Z1, X2, Y2, Z2`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#resize(double,double,double,double,double,double)

	- **@p** `X1` is a double.
	- **@p** `Y1` is a double.
	- **@p** `Z1` is a double.
	- **@p** `X2` is a double.
	- **@p** `Y2` is a double.
	- **@p** `Z2` is a double.
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **serialize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#serialize()

	- **@r** `A` map.


- **shift** (`Shift`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#shift(org.bukkit.Location)

	- **@p** `Shift` is a [Location](Location.aus.md).
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **shift\_Vector** (`Shift`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#shift(org.bukkit.util.Vector)

	- **@p** `Shift` is a [Vector](Vector.aus.md).
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **shift** (`ShiftX, ShiftY, ShiftZ`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#shift(double,double,double)

	- **@p** `ShiftX` is a double.
	- **@p** `ShiftY` is a double.
	- **@p** `ShiftZ` is a double.
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **toString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#toString()

	- **@r** `A` string.


- **union** (`Other`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#union(org.bukkit.util.BoundingBox)

	- **@p** `Other` is a [BoundingBox](BoundingBox.aus.md).
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **union\_Location** (`Position`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#union(org.bukkit.Location)

	- **@p** `Position` is a [Location](Location.aus.md).
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **union\_Vector** (`Position`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#union(org.bukkit.util.Vector)

	- **@p** `Position` is a [Vector](Vector.aus.md).
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).


- **union** (`PosX, PosY, PosZ`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/util/BoundingBox.html#union(double,double,double)

	- **@p** `PosX` is a double.
	- **@p** `PosY` is a double.
	- **@p** `PosZ` is a double.
	- **@r** `A` [BoundingBox](BoundingBox.aus.md).




