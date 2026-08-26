# file: BukkitScheduler.aus

## class: BukkitScheduler

[15:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.BukkitSchedulerShim) **extends: object** 

Generated shim for org.bukkit.scheduler.BukkitScheduler.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitScheduler.html
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **cancelTask** (`TaskId`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitScheduler.html#cancelTask(int)

	- **@p** `TaskId` is an int.


- **cancelTasks** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitScheduler.html#cancelTasks(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).


- **getActiveWorkers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitScheduler.html#getActiveWorkers()

	- **@r** `A` list.


- **getPendingTasks** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitScheduler.html#getPendingTasks()

	- **@r** `A` list.


- **isCurrentlyRunning** (`TaskId`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitScheduler.html#isCurrentlyRunning(int)

	- **@p** `TaskId` is an int.
	- **@r** `A` bool.


- **isQueued** (`TaskId`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitScheduler.html#isQueued(int)

	- **@p** `TaskId` is an int.
	- **@r** `A` bool.


- **runTask** (`Plugin, Task`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitScheduler.html#runTask(org.bukkit.plugin.Plugin,org.bukkit.scheduler.BukkitRunnable)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Task` is a [BukkitRunnable](BukkitRunnable.aus.md).
	- **@r** `A` [BukkitTask](BukkitTask.aus.md).


- **runTaskAsynchronously** (`Plugin, Task`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitScheduler.html#runTaskAsynchronously(org.bukkit.plugin.Plugin,org.bukkit.scheduler.BukkitRunnable)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Task` is a [BukkitRunnable](BukkitRunnable.aus.md).
	- **@r** `A` [BukkitTask](BukkitTask.aus.md).


- **runTaskLater** (`Plugin, Task, Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitScheduler.html#runTaskLater(org.bukkit.plugin.Plugin,org.bukkit.scheduler.BukkitRunnable,long)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Task` is a [BukkitRunnable](BukkitRunnable.aus.md).
	- **@p** `Delay` is an int.
	- **@r** `A` [BukkitTask](BukkitTask.aus.md).


- **runTaskLaterAsynchronously** (`Plugin, Task, Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitScheduler.html#runTaskLaterAsynchronously(org.bukkit.plugin.Plugin,org.bukkit.scheduler.BukkitRunnable,long)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Task` is a [BukkitRunnable](BukkitRunnable.aus.md).
	- **@p** `Delay` is an int.
	- **@r** `A` [BukkitTask](BukkitTask.aus.md).


- **runTaskTimer** (`Plugin, Task, Delay, Period`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitScheduler.html#runTaskTimer(org.bukkit.plugin.Plugin,org.bukkit.scheduler.BukkitRunnable,long,long)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Task` is a [BukkitRunnable](BukkitRunnable.aus.md).
	- **@p** `Delay` is an int.
	- **@p** `Period` is an int.
	- **@r** `A` [BukkitTask](BukkitTask.aus.md).


- **runTaskTimerAsynchronously** (`Plugin, Task, Delay, Period`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitScheduler.html#runTaskTimerAsynchronously(org.bukkit.plugin.Plugin,org.bukkit.scheduler.BukkitRunnable,long,long)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Task` is a [BukkitRunnable](BukkitRunnable.aus.md).
	- **@p** `Delay` is an int.
	- **@p** `Period` is an int.
	- **@r** `A` [BukkitTask](BukkitTask.aus.md).


- **scheduleSyncDelayedTask** (`Plugin, Task`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitScheduler.html#scheduleSyncDelayedTask(org.bukkit.plugin.Plugin,org.bukkit.scheduler.BukkitRunnable)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Task` is a [BukkitRunnable](BukkitRunnable.aus.md).
	- **@r** `An` int.


- **scheduleSyncDelayedTask** (`Plugin, Task, Delay`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitScheduler.html#scheduleSyncDelayedTask(org.bukkit.plugin.Plugin,org.bukkit.scheduler.BukkitRunnable,long)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Task` is a [BukkitRunnable](BukkitRunnable.aus.md).
	- **@p** `Delay` is an int.
	- **@r** `An` int.


- **scheduleSyncRepeatingTask** (`Plugin, Task, Delay, Period`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scheduler/BukkitScheduler.html#scheduleSyncRepeatingTask(org.bukkit.plugin.Plugin,org.bukkit.scheduler.BukkitRunnable,long,long)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Task` is a [BukkitRunnable](BukkitRunnable.aus.md).
	- **@p** `Delay` is an int.
	- **@p** `Period` is an int.
	- **@r** `An` int.




