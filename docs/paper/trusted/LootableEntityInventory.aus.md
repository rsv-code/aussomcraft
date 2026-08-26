# file: LootableEntityInventory.aus

## class: LootableEntityInventory

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.LootableEntityInventoryShim) **extends: object** 

Generated shim for com.destroystokyo.paper.loottable.LootableEntityInventory.
Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html
In Paper this is a [LootableInventory](LootableInventory.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **canPlayerLoot** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#canPlayerLoot(java.util.UUID)

	- **@p** `Player` is a string.
	- **@r** `A` bool.


- **clearLootTable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#clearLootTable()



- **getEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#getEntity()

	- **@r** `An` [Entity](Entity.aus.md).


- **getLastFilled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#getLastFilled()

	- **@r** `An` int.


- **getLastLooted** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#getLastLooted(org.bukkit.entity.Player)

	- **@p** `Player` is a [Player](Player.aus.md).
	- **@r** `An` int.


- **getLastLooted\_UUID** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#getLastLooted(java.util.UUID)

	- **@p** `Player` is a string.
	- **@r** `An` int.


- **getLootTable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#getLootTable()

	- **@r** `A` [LootTable](LootTable.aus.md).


- **getNextRefill** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#getNextRefill()

	- **@r** `An` int.


- **getSeed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#getSeed()

	- **@r** `An` int.


- **hasBeenFilled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#hasBeenFilled()

	- **@r** `A` bool.


- **hasLootTable** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#hasLootTable()

	- **@r** `A` bool.


- **hasPendingRefill** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#hasPendingRefill()

	- **@r** `A` bool.


- **hasPlayerLooted** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#hasPlayerLooted(org.bukkit.entity.Player)

	- **@p** `Player` is a [Player](Player.aus.md).
	- **@r** `A` bool.


- **hasPlayerLooted\_UUID** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#hasPlayerLooted(java.util.UUID)

	- **@p** `Player` is a string.
	- **@r** `A` bool.


- **isRefillEnabled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#isRefillEnabled()

	- **@r** `A` bool.


- **setHasPlayerLooted** (`Player, Looted`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#setHasPlayerLooted(org.bukkit.entity.Player,boolean)

	- **@p** `Player` is a [Player](Player.aus.md).
	- **@p** `Looted` is a bool.
	- **@r** `A` bool.


- **setHasPlayerLooted\_UUID\_boolean** (`Player, Looted`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#setHasPlayerLooted(java.util.UUID,boolean)

	- **@p** `Player` is a string.
	- **@p** `Looted` is a bool.
	- **@r** `A` bool.


- **setLootTable** (`Table`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#setLootTable(org.bukkit.loot.LootTable)

	- **@p** `Table` is a [LootTable](LootTable.aus.md).


- **setLootTable** (`Table, Seed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#setLootTable(org.bukkit.loot.LootTable,long)

	- **@p** `Table` is a [LootTable](LootTable.aus.md).
	- **@p** `Seed` is an int.


- **setNextRefill** (`RefillAt`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#setNextRefill(long)

	- **@p** `RefillAt` is an int.
	- **@r** `An` int.


- **setSeed** (`Seed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/loottable/LootableEntityInventory.html#setSeed(long)

	- **@p** `Seed` is an int.




