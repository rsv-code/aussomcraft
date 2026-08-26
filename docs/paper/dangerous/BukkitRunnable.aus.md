# file: BukkitRunnable.aus

## class: BukkitRunnable

[15:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.BukkitRunnableShim) **extends: object** 

Generated shim for org.bukkit.scheduler.BukkitRunnable.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitRunnable.html
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **cancel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitRunnable.html#cancel()



- **getTaskId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitRunnable.html#getTaskId()

	- **@r** `An` int.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitRunnable.html#isCancelled()

	- **@r** `A` bool.


- **run** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitRunnable.html#run()



- **runTask** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitRunnable.html#runTask(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@r** `A` [BukkitTask](BukkitTask.aus.md).


- **runTaskAsynchronously** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitRunnable.html#runTaskAsynchronously(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@r** `A` [BukkitTask](BukkitTask.aus.md).


- **runTaskLater** (`Plugin, Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitRunnable.html#runTaskLater(org.bukkit.plugin.Plugin,long)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Delay` is an int.
	- **@r** `A` [BukkitTask](BukkitTask.aus.md).


- **runTaskLaterAsynchronously** (`Plugin, Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitRunnable.html#runTaskLaterAsynchronously(org.bukkit.plugin.Plugin,long)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Delay` is an int.
	- **@r** `A` [BukkitTask](BukkitTask.aus.md).


- **runTaskTimer** (`Plugin, Delay, Period`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitRunnable.html#runTaskTimer(org.bukkit.plugin.Plugin,long,long)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Delay` is an int.
	- **@p** `Period` is an int.
	- **@r** `A` [BukkitTask](BukkitTask.aus.md).


- **runTaskTimerAsynchronously** (`Plugin, Delay, Period`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitRunnable.html#runTaskTimerAsynchronously(org.bukkit.plugin.Plugin,long,long)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Delay` is an int.
	- **@p** `Period` is an int.
	- **@r** `A` [BukkitTask](BukkitTask.aus.md).




