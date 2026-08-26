# file: PlayerDeathEvent.aus

## class: PlayerDeathEvent

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.PlayerDeathEventShim) **extends: object** 

Generated shim for org.bukkit.event.entity.PlayerDeathEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html
In Paper this is a [EntityDeathEvent](EntityDeathEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getDeathMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getDeathMessage()

	- **@r** `A` string.


- **getEntity** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getEntity()

	- **@r** `A` [Player](Player.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getEventName()

	- **@r** `A` string.


- **getPlayer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getPlayer()

	- **@r** `A` [Player](Player.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#isCancelled()

	- **@r** `A` bool.


- **deathMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#deathMessage()

	- **@r** `A` Component.


- **deathMessage** (`DeathMessage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#deathMessage(net.kyori.adventure.text.Component)

	- **@p** `DeathMessage` is a Component.


- **deathScreenMessageOverride** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#deathScreenMessageOverride()

	- **@r** `A` Component.


- **deathScreenMessageOverride** (`DeathScreenMessageOverride`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#deathScreenMessageOverride(net.kyori.adventure.text.Component)

	- **@p** `DeathScreenMessageOverride` is a Component.


- **getDamageSource** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getDamageSource()

	- **@r** `A` [DamageSource](DamageSource.aus.md).


- **getDeathSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getDeathSound()

	- **@r** `A` [Sound](Sound.aus.md).


- **getDeathSoundCategory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getDeathSoundCategory()

	- **@r** `A` string naming a [SoundCategory](SoundCategory.aus.md).


- **getDeathSoundPitch** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getDeathSoundPitch()

	- **@r** `A` double.


- **getDeathSoundVolume** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getDeathSoundVolume()

	- **@r** `A` double.


- **getDroppedExp** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getDroppedExp()

	- **@r** `An` int.


- **getDrops** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getDrops()

	- **@r** `A` list.


- **getEntityType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getEntityType()

	- **@r** `An` string naming an [EntityType](EntityType.aus.md).


- **getItemsToKeep** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getItemsToKeep()

	- **@r** `A` list.


- **getKeepInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getKeepInventory()

	- **@r** `A` bool.


- **getKeepLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getKeepLevel()

	- **@r** `A` bool.


- **getNewExp** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getNewExp()

	- **@r** `An` int.


- **getNewLevel** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getNewLevel()

	- **@r** `An` int.


- **getNewTotalExp** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getNewTotalExp()

	- **@r** `An` int.


- **getReviveHealth** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getReviveHealth()

	- **@r** `A` double.


- **getShowDeathMessages** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getShowDeathMessages()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setDeathMessage** (`DeathMessage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#setDeathMessage(java.lang.String)

	- **@p** `DeathMessage` is a string.


- **setDeathSound** (`Sound`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#setDeathSound(org.bukkit.Sound)

	- **@p** `Sound` is a [Sound](Sound.aus.md).


- **setDeathSoundCategory** (`SoundCategory`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#setDeathSoundCategory(org.bukkit.SoundCategory)

	- **@p** `SoundCategory` is a string naming a [SoundCategory](SoundCategory.aus.md).


- **setDeathSoundPitch** (`Pitch`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#setDeathSoundPitch(float)

	- **@p** `Pitch` is a double.


- **setDeathSoundVolume** (`Volume`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#setDeathSoundVolume(float)

	- **@p** `Volume` is a double.


- **setDroppedExp** (`Exp`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#setDroppedExp(int)

	- **@p** `Exp` is an int.


- **setKeepInventory** (`KeepInventory`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#setKeepInventory(boolean)

	- **@p** `KeepInventory` is a bool.


- **setKeepLevel** (`KeepLevel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#setKeepLevel(boolean)

	- **@p** `KeepLevel` is a bool.


- **setNewExp** (`Exp`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#setNewExp(int)

	- **@p** `Exp` is an int.


- **setNewLevel** (`Level`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#setNewLevel(int)

	- **@p** `Level` is an int.


- **setNewTotalExp** (`TotalExp`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#setNewTotalExp(int)

	- **@p** `TotalExp` is an int.


- **setReviveHealth** (`ReviveHealth`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#setReviveHealth(double)

	- **@p** `ReviveHealth` is a double.


- **setShouldDropExperience** (`DoExpDrop`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#setShouldDropExperience(boolean)

	- **@p** `DoExpDrop` is a bool.


- **setShouldPlayDeathSound** (`PlayDeathSound`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#setShouldPlayDeathSound(boolean)

	- **@p** `PlayDeathSound` is a bool.


- **setShowDeathMessages** (`DisplayDeathMessage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#setShowDeathMessages(boolean)

	- **@p** `DisplayDeathMessage` is a bool.


- **shouldDropExperience** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#shouldDropExperience()

	- **@r** `A` bool.


- **shouldPlayDeathSound** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#shouldPlayDeathSound()

	- **@r** `A` bool.


- **callEvent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#callEvent()

	- **@r** `A` bool.


- **getHandlerList** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getHandlerList()

	- **@r** `A` [HandlerList](HandlerList.aus.md).


- **getHandlers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/entity/PlayerDeathEvent.html#getHandlers()

	- **@r** `A` [HandlerList](HandlerList.aus.md).




