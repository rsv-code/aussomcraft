# file: ServerTickManager.aus

## class: ServerTickManager

[15:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.ServerTickManagerShim) **extends: object** 

Generated shim for org.bukkit.ServerTickManager.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ServerTickManager.html
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getFrozenTicksToRun** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ServerTickManager.html#getFrozenTicksToRun()

	- **@r** `An` int.


- **getTickRate** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ServerTickManager.html#getTickRate()

	- **@r** `A` double.


- **isFrozen** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ServerTickManager.html#isFrozen()

	- **@r** `A` bool.


- **isFrozen** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ServerTickManager.html#isFrozen(org.bukkit.entity.Entity)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@r** `A` bool.


- **isRunningNormally** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ServerTickManager.html#isRunningNormally()

	- **@r** `A` bool.


- **isSprinting** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ServerTickManager.html#isSprinting()

	- **@r** `A` bool.


- **isStepping** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ServerTickManager.html#isStepping()

	- **@r** `A` bool.


- **requestGameToSprint** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ServerTickManager.html#requestGameToSprint(int)

	- **@p** `Ticks` is an int.
	- **@r** `A` bool.


- **setFrozen** (`Frozen`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ServerTickManager.html#setFrozen(boolean)

	- **@p** `Frozen` is a bool.


- **setTickRate** (`Tick`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ServerTickManager.html#setTickRate(float)

	- **@p** `Tick` is a double.


- **stepGameIfFrozen** (`Ticks`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ServerTickManager.html#stepGameIfFrozen(int)

	- **@p** `Ticks` is an int.
	- **@r** `A` bool.


- **stopSprinting** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ServerTickManager.html#stopSprinting()

	- **@r** `A` bool.


- **stopStepping** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ServerTickManager.html#stopStepping()

	- **@r** `A` bool.




