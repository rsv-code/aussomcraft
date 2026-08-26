# file: Scoreboard.aus

## class: Scoreboard

[15:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.ScoreboardShim) **extends: object** 

Generated shim for org.bukkit.scoreboard.Scoreboard.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **clearSlot** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#clearSlot(org.bukkit.scoreboard.DisplaySlot)

	- **@p** `Slot` is a string naming a [DisplaySlot](DisplaySlot.aus.md).


- **getEntityTeam** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#getEntityTeam(org.bukkit.entity.Entity)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@r** `A` [Team](Team.aus.md).


- **getEntries** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#getEntries()

	- **@r** `A` list.


- **getEntryTeam** (`Entry`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#getEntryTeam(java.lang.String)

	- **@p** `Entry` is a string.
	- **@r** `A` [Team](Team.aus.md).


- **getObjective\_slot** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#getObjective(org.bukkit.scoreboard.DisplaySlot)

	- **@p** `Slot` is a string naming a [DisplaySlot](DisplaySlot.aus.md).
	- **@r** `An` [Objective](Objective.aus.md).


- **getObjective** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#getObjective(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `An` [Objective](Objective.aus.md).


- **getObjectives** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#getObjectives()

	- **@r** `A` list.


- **getObjectivesByCriteria\_Criteria** (`Criteria`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#getObjectivesByCriteria(org.bukkit.scoreboard.Criteria)

	- **@p** `Criteria` is a [Criteria](Criteria.aus.md).
	- **@r** `A` list.


- **getObjectivesByCriteria** (`Criteria`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#getObjectivesByCriteria(java.lang.String)

	- **@p** `Criteria` is a string.
	- **@r** `A` list.


- **getPlayerTeam** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#getPlayerTeam(org.bukkit.OfflinePlayer)

	- **@p** `Player` is an [OfflinePlayer](OfflinePlayer.aus.md).
	- **@r** `A` [Team](Team.aus.md).


- **getPlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#getPlayers()

	- **@r** `A` list.


- **getScores\_player** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#getScores(org.bukkit.OfflinePlayer)

	- **@p** `Player` is an [OfflinePlayer](OfflinePlayer.aus.md).
	- **@r** `A` list.


- **getScores** (`Entry`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#getScores(java.lang.String)

	- **@p** `Entry` is a string.
	- **@r** `A` list.


- **getScoresFor** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#getScoresFor(org.bukkit.entity.Entity)

	- **@p** `Entity` is an [Entity](Entity.aus.md).
	- **@r** `A` list.


- **getTeam** (`TeamName`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#getTeam(java.lang.String)

	- **@p** `TeamName` is a string.
	- **@r** `A` [Team](Team.aus.md).


- **getTeams** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#getTeams()

	- **@r** `A` list.


- **registerNewObjective** (`Name, Criteria`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#registerNewObjective(java.lang.String,java.lang.String)

	- **@p** `Name` is a string.
	- **@p** `Criteria` is a string.
	- **@r** `An` [Objective](Objective.aus.md).


- **registerNewObjective\_String\_Criteria\_Component** (`Name, Criteria, DisplayName`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#registerNewObjective(java.lang.String,org.bukkit.scoreboard.Criteria,net.kyori.adventure.text.Component)

	- **@p** `Name` is a string.
	- **@p** `Criteria` is a [Criteria](Criteria.aus.md).
	- **@p** `DisplayName` is a Component.
	- **@r** `An` [Objective](Objective.aus.md).


- **registerNewObjective\_String\_Criteria\_String** (`Name, Criteria, DisplayName`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#registerNewObjective(java.lang.String,org.bukkit.scoreboard.Criteria,java.lang.String)

	- **@p** `Name` is a string.
	- **@p** `Criteria` is a [Criteria](Criteria.aus.md).
	- **@p** `DisplayName` is a string.
	- **@r** `An` [Objective](Objective.aus.md).


- **registerNewObjective\_String\_String\_Component** (`Name, Criteria, DisplayName`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#registerNewObjective(java.lang.String,java.lang.String,net.kyori.adventure.text.Component)

	- **@p** `Name` is a string.
	- **@p** `Criteria` is a string.
	- **@p** `DisplayName` is a Component.
	- **@r** `An` [Objective](Objective.aus.md).


- **registerNewObjective** (`Name, Criteria, DisplayName`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#registerNewObjective(java.lang.String,java.lang.String,java.lang.String)

	- **@p** `Name` is a string.
	- **@p** `Criteria` is a string.
	- **@p** `DisplayName` is a string.
	- **@r** `An` [Objective](Objective.aus.md).


- **registerNewObjective\_String\_Criteria\_Component\_RenderType** (`Name, Criteria, DisplayName, RenderType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#registerNewObjective(java.lang.String,org.bukkit.scoreboard.Criteria,net.kyori.adventure.text.Component,org.bukkit.scoreboard.RenderType)

	- **@p** `Name` is a string.
	- **@p** `Criteria` is a [Criteria](Criteria.aus.md).
	- **@p** `DisplayName` is a Component.
	- **@p** `RenderType` is a string naming a [RenderType](RenderType.aus.md).
	- **@r** `An` [Objective](Objective.aus.md).


- **registerNewObjective\_String\_Criteria\_String\_RenderType** (`Name, Criteria, DisplayName, RenderType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#registerNewObjective(java.lang.String,org.bukkit.scoreboard.Criteria,java.lang.String,org.bukkit.scoreboard.RenderType)

	- **@p** `Name` is a string.
	- **@p** `Criteria` is a [Criteria](Criteria.aus.md).
	- **@p** `DisplayName` is a string.
	- **@p** `RenderType` is a string naming a [RenderType](RenderType.aus.md).
	- **@r** `An` [Objective](Objective.aus.md).


- **registerNewObjective\_String\_String\_Component\_RenderType** (`Name, Criteria, DisplayName, RenderType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#registerNewObjective(java.lang.String,java.lang.String,net.kyori.adventure.text.Component,org.bukkit.scoreboard.RenderType)

	- **@p** `Name` is a string.
	- **@p** `Criteria` is a string.
	- **@p** `DisplayName` is a Component.
	- **@p** `RenderType` is a string naming a [RenderType](RenderType.aus.md).
	- **@r** `An` [Objective](Objective.aus.md).


- **registerNewObjective** (`Name, Criteria, DisplayName, RenderType`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#registerNewObjective(java.lang.String,java.lang.String,java.lang.String,org.bukkit.scoreboard.RenderType)

	- **@p** `Name` is a string.
	- **@p** `Criteria` is a string.
	- **@p** `DisplayName` is a string.
	- **@p** `RenderType` is a string naming a [RenderType](RenderType.aus.md).
	- **@r** `An` [Objective](Objective.aus.md).


- **registerNewTeam** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#registerNewTeam(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` [Team](Team.aus.md).


- **resetScores\_player** (`Player`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#resetScores(org.bukkit.OfflinePlayer)

	- **@p** `Player` is an [OfflinePlayer](OfflinePlayer.aus.md).


- **resetScores** (`Entry`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#resetScores(java.lang.String)

	- **@p** `Entry` is a string.


- **resetScoresFor** (`Entity`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/scoreboard/Scoreboard.html#resetScoresFor(org.bukkit.entity.Entity)

	- **@p** `Entity` is an [Entity](Entity.aus.md).




