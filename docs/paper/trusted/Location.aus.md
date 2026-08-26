# file: Location.aus

## class: Location

[21:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.LocationShim) **extends: object** 

Generated shim for org.bukkit.Location.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html
In Paper this is a
[ConfigurationSerializable](ConfigurationSerializable.aus.md) and
[FinePosition](FinePosition.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getBlock()

	- **@r** `A` [Block](Block.aus.md).


- **getPitch** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getPitch()

	- **@r** `A` double.


- **getWorld** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getWorld()

	- **@r** `A` [World](World.aus.md).


- **getX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getX()

	- **@r** `A` double.


- **getY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getY()

	- **@r** `A` double.


- **getYaw** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getYaw()

	- **@r** `A` double.


- **getZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getZ()

	- **@r** `A` double.


- **add** (`Vec`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#add(org.bukkit.Location)

	- **@p** `Vec` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **add\_Vector** (`Vec`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#add(org.bukkit.util.Vector)

	- **@p** `Vec` is a [Vector](Vector.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **add** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#add(double,double,double)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` [Location](Location.aus.md).


- **add** (`Base, X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#add(org.bukkit.Location,double,double,double)

	- **@p** `Base` is a [Location](Location.aus.md).
	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` [Location](Location.aus.md).


- **addRotation** (`Rotation`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#addRotation(io.papermc.paper.math.Rotation)

	- **@p** `Rotation` is a [Rotation](Rotation.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **addRotation** (`Yaw, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#addRotation(float,float)

	- **@p** `Yaw` is a double.
	- **@p** `Pitch` is a double.
	- **@r** `A` [Location](Location.aus.md).


- **blockX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#blockX()

	- **@r** `An` int.


- **blockY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#blockY()

	- **@r** `An` int.


- **blockZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#blockZ()

	- **@r** `An` int.


- **checkFinite** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#checkFinite()



- **clone** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#clone()

	- **@r** `A` [Location](Location.aus.md).


- **createExplosion** (`Power`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#createExplosion(float)

	- **@p** `Power` is a double.
	- **@r** `A` bool.


- **createExplosion\_source\_power** (`Source, Power`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#createExplosion(org.bukkit.entity.Entity,float)

	- **@p** `Source` is an [Entity](Entity.aus.md).
	- **@p** `Power` is a double.
	- **@r** `A` bool.


- **createExplosion** (`Power, SetFire`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#createExplosion(float,boolean)

	- **@p** `Power` is a double.
	- **@p** `SetFire` is a bool.
	- **@r** `A` bool.


- **createExplosion\_source\_power\_setfire** (`Source, Power, SetFire`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#createExplosion(org.bukkit.entity.Entity,float,boolean)

	- **@p** `Source` is an [Entity](Entity.aus.md).
	- **@p** `Power` is a double.
	- **@p** `SetFire` is a bool.
	- **@r** `A` bool.


- **createExplosion** (`Power, SetFire, BreakBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#createExplosion(float,boolean,boolean)

	- **@p** `Power` is a double.
	- **@p** `SetFire` is a bool.
	- **@p** `BreakBlocks` is a bool.
	- **@r** `A` bool.


- **createExplosion** (`Source, Power, SetFire, BreakBlocks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#createExplosion(org.bukkit.entity.Entity,float,boolean,boolean)

	- **@p** `Source` is an [Entity](Entity.aus.md).
	- **@p** `Power` is a double.
	- **@p** `SetFire` is a bool.
	- **@p** `BreakBlocks` is a bool.
	- **@r** `A` bool.


- **deserialize** (`Args`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#deserialize(java.util.Map)

	- **@p** `Args` is a map.
	- **@r** `A` [Location](Location.aus.md).


- **distance** (`O`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#distance(org.bukkit.Location)

	- **@p** `O` is a [Location](Location.aus.md).
	- **@r** `A` double.


- **distanceSquared** (`O`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#distanceSquared(org.bukkit.Location)

	- **@p** `O` is a [Location](Location.aus.md).
	- **@r** `A` double.


- **equals** (`Obj`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#equals(java.lang.Object)

	- **@p** `Obj` is an Object.
	- **@r** `A` bool.


- **getBlockX** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getBlockX()

	- **@r** `An` int.


- **getBlockY** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getBlockY()

	- **@r** `An` int.


- **getBlockZ** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getBlockZ()

	- **@r** `An` int.


- **getChunk** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getChunk()

	- **@r** `A` [Chunk](Chunk.aus.md).


- **getDirection** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getDirection()

	- **@r** `A` [Vector](Vector.aus.md).


- **getNearbyEntities** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getNearbyEntities(double,double,double)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` list.


- **getNearbyLivingEntities** (`Radius`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getNearbyLivingEntities(double)

	- **@p** `Radius` is a double.
	- **@r** `A` list.


- **getNearbyLivingEntities** (`XzRadius, YRadius`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getNearbyLivingEntities(double,double)

	- **@p** `XzRadius` is a double.
	- **@p** `YRadius` is a double.
	- **@r** `A` list.


- **getNearbyLivingEntities** (`XRadius, YRadius, ZRadius`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getNearbyLivingEntities(double,double,double)

	- **@p** `XRadius` is a double.
	- **@p** `YRadius` is a double.
	- **@p** `ZRadius` is a double.
	- **@r** `A` list.


- **getNearbyPlayers** (`Radius`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getNearbyPlayers(double)

	- **@p** `Radius` is a double.
	- **@r** `A` list.


- **getNearbyPlayers** (`XzRadius, YRadius`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getNearbyPlayers(double,double)

	- **@p** `XzRadius` is a double.
	- **@p** `YRadius` is a double.
	- **@r** `A` list.


- **getNearbyPlayers** (`XRadius, YRadius, ZRadius`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getNearbyPlayers(double,double,double)

	- **@p** `XRadius` is a double.
	- **@p** `YRadius` is a double.
	- **@p** `ZRadius` is a double.
	- **@r** `A` list.


- **getRotation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#getRotation()

	- **@r** `A` [Rotation](Rotation.aus.md).


- **hashCode** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#hashCode()

	- **@r** `An` int.


- **isBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#isBlock()

	- **@r** `A` bool.


- **isChunkLoaded** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#isChunkLoaded()

	- **@r** `A` bool.


- **isFine** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#isFine()

	- **@r** `A` bool.


- **isFinite** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#isFinite()

	- **@r** `A` bool.


- **isGenerated** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#isGenerated()

	- **@r** `A` bool.


- **isWorldLoaded** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#isWorldLoaded()

	- **@r** `A` bool.


- **length** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#length()

	- **@r** `A` double.


- **lengthSquared** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#lengthSquared()

	- **@r** `A` double.


- **locToBlock** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#locToBlock(double)

	- **@p** `Loc` is a double.
	- **@r** `An` int.


- **multiply** (`M`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#multiply(double)

	- **@p** `M` is a double.
	- **@r** `A` [Location](Location.aus.md).


- **normalizePitch** (`Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#normalizePitch(float)

	- **@p** `Pitch` is a double.
	- **@r** `A` double.


- **normalizeYaw** (`Yaw`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#normalizeYaw(float)

	- **@p** `Yaw` is a double.
	- **@r** `A` double.


- **offset** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#offset(double,double,double)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` [FinePosition](FinePosition.aus.md).


- **offset\_int\_int\_int** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#offset(int,int,int)

	- **@p** `X` is an int.
	- **@p** `Y` is an int.
	- **@p** `Z` is an int.
	- **@r** `A` [FinePosition](FinePosition.aus.md).


- **serialize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#serialize()

	- **@r** `A` map.


- **set** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#set(double,double,double)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` [Location](Location.aus.md).


- **setDirection** (`Vector`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#setDirection(org.bukkit.util.Vector)

	- **@p** `Vector` is a [Vector](Vector.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **setPitch** (`Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#setPitch(float)

	- **@p** `Pitch` is a double.


- **setRotation** (`Rotation`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#setRotation(io.papermc.paper.math.Rotation)

	- **@p** `Rotation` is a [Rotation](Rotation.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **setRotation** (`Yaw, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#setRotation(float,float)

	- **@p** `Yaw` is a double.
	- **@p** `Pitch` is a double.
	- **@r** `A` [Location](Location.aus.md).


- **setWorld** (`World`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#setWorld(org.bukkit.World)

	- **@p** `World` is a [World](World.aus.md).


- **setX** (`X`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#setX(double)

	- **@p** `X` is a double.


- **setY** (`Y`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#setY(double)

	- **@p** `Y` is a double.


- **setYaw** (`Yaw`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#setYaw(float)

	- **@p** `Yaw` is a double.


- **setZ** (`Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#setZ(double)

	- **@p** `Z` is a double.


- **subtract** (`Vec`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#subtract(org.bukkit.Location)

	- **@p** `Vec` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **subtract\_Vector** (`Vec`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#subtract(org.bukkit.util.Vector)

	- **@p** `Vec` is a [Vector](Vector.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **subtract** (`X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#subtract(double,double,double)

	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` [Location](Location.aus.md).


- **subtract** (`Base, X, Y, Z`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#subtract(org.bukkit.Location,double,double,double)

	- **@p** `Base` is a [Location](Location.aus.md).
	- **@p** `X` is a double.
	- **@p** `Y` is a double.
	- **@p** `Z` is a double.
	- **@r** `A` [Location](Location.aus.md).


- **subtractRotation** (`Rotation`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#subtractRotation(io.papermc.paper.math.Rotation)

	- **@p** `Rotation` is a [Rotation](Rotation.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **subtractRotation** (`Yaw, Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#subtractRotation(float,float)

	- **@p** `Yaw` is a double.
	- **@p** `Pitch` is a double.
	- **@r** `A` [Location](Location.aus.md).


- **toBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#toBlock()

	- **@r** `A` [BlockPosition](BlockPosition.aus.md).


- **toBlockKey** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#toBlockKey()

	- **@r** `An` int.


- **toBlockLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#toBlockLocation()

	- **@r** `A` [Location](Location.aus.md).


- **toCenter** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#toCenter()

	- **@r** `A` [FinePosition](FinePosition.aus.md).


- **toCenterLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#toCenterLocation()

	- **@r** `A` [Location](Location.aus.md).


- **toHighestLocation** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#toHighestLocation()

	- **@r** `A` [Location](Location.aus.md).


- **toHighestLocation** (`HeightMap`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#toHighestLocation(org.bukkit.HeightMap)

	- **@p** `HeightMap` is a string naming a [HeightMap](HeightMap.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **toLocation** (`World`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#toLocation(org.bukkit.World)

	- **@p** `World` is a [World](World.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **toString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#toString()

	- **@r** `A` string.


- **toVector** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#toVector()

	- **@r** `A` [Vector](Vector.aus.md).


- **x** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#x()

	- **@r** `A` double.


- **y** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#y()

	- **@r** `A` double.


- **z** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#z()

	- **@r** `A` double.


- **zero** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/Location.html#zero()

	- **@r** `A` [Location](Location.aus.md).




