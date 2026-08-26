# file: Pathfinder.aus

## class: Pathfinder

[15:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.PathfinderShim) **extends: object** 

Generated shim for com.destroystokyo.paper.entity.Pathfinder.
Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **canFloat** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#canFloat()

	- **@r** `A` bool.


- **canOpenDoors** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#canOpenDoors()

	- **@r** `A` bool.


- **canPassDoors** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#canPassDoors()

	- **@r** `A` bool.


- **findPath** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#findPath(org.bukkit.entity.Entity)

	- **@p** `Target` is an [Entity](Entity.aus.md).
	- **@r** `A` Pathfinder.PathResult.


- **findPath\_LivingEntity** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#findPath(org.bukkit.entity.LivingEntity)

	- **@p** `Target` is a [LivingEntity](LivingEntity.aus.md).
	- **@r** `A` Pathfinder.PathResult.


- **findPath\_Location** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#findPath(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` Pathfinder.PathResult.


- **findPath** (`Target, ReachRange`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#findPath(org.bukkit.entity.Entity,int)

	- **@p** `Target` is an [Entity](Entity.aus.md).
	- **@p** `ReachRange` is an int.
	- **@r** `A` Pathfinder.PathResult.


- **findPath\_loc\_reachrange** (`Loc, ReachRange`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#findPath(org.bukkit.Location,int)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `ReachRange` is an int.
	- **@r** `A` Pathfinder.PathResult.


- **getCurrentPath** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#getCurrentPath()

	- **@r** `A` Pathfinder.PathResult.


- **getEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#getEntity()

	- **@r** `A` [Mob](Mob.aus.md).


- **hasPath** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#hasPath()

	- **@r** `A` bool.


- **moveTo** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#moveTo(org.bukkit.entity.Entity)

	- **@p** `Target` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **moveTo\_LivingEntity** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#moveTo(org.bukkit.entity.LivingEntity)

	- **@p** `Target` is a [LivingEntity](LivingEntity.aus.md).
	- **@r** `A` bool.


- **moveTo\_Location** (`Loc`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#moveTo(org.bukkit.Location)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@r** `A` bool.


- **moveTo\_PathResult** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#moveTo(com.destroystokyo.paper.entity.Pathfinder.PathResult)

	- **@p** `Path` is a Pathfinder.PathResult.
	- **@r** `A` bool.


- **moveTo** (`Target, Speed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#moveTo(org.bukkit.entity.Entity,double)

	- **@p** `Target` is an [Entity](Entity.aus.md).
	- **@p** `Speed` is a double.
	- **@r** `A` bool.


- **moveTo\_LivingEntity\_double** (`Target, Speed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#moveTo(org.bukkit.entity.LivingEntity,double)

	- **@p** `Target` is a [LivingEntity](LivingEntity.aus.md).
	- **@p** `Speed` is a double.
	- **@r** `A` bool.


- **moveTo\_Location\_double** (`Loc, Speed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#moveTo(org.bukkit.Location,double)

	- **@p** `Loc` is a [Location](Location.aus.md).
	- **@p** `Speed` is a double.
	- **@r** `A` bool.


- **moveTo\_PathResult\_double** (`Path, Speed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#moveTo(com.destroystokyo.paper.entity.Pathfinder.PathResult,double)

	- **@p** `Path` is a Pathfinder.PathResult.
	- **@p** `Speed` is a double.
	- **@r** `A` bool.


- **setCanFloat** (`CanFloat`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#setCanFloat(boolean)

	- **@p** `CanFloat` is a bool.


- **setCanOpenDoors** (`CanOpenDoors`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#setCanOpenDoors(boolean)

	- **@p** `CanOpenDoors` is a bool.


- **setCanPassDoors** (`CanPassDoors`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#setCanPassDoors(boolean)

	- **@p** `CanPassDoors` is a bool.


- **stopPathfinding** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/entity/Pathfinder.html#stopPathfinding()





