# file: PlayerGameModeChangeEvent.aus

## class: PlayerGameModeChangeEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.PlayerGameModeChangeEventShim) **extends: object** 

Generated shim for org.bukkit.event.player.PlayerGameModeChangeEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerGameModeChangeEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[PlayerEvent](PlayerEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **cancelMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerGameModeChangeEvent.html#cancelMessage()

	- **@r** `A` Component.


- **cancelMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerGameModeChangeEvent.html#cancelMessage(net.kyori.adventure.text.Component)

	- **@p** `Message` is a Component.


- **getCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerGameModeChangeEvent.html#getCause()

	- **@r** `A` string naming a PlayerGameModeChangeEvent.Cause.


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerGameModeChangeEvent.html#getEventName()

	- **@r** `A` string.


- **getNewGameMode** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerGameModeChangeEvent.html#getNewGameMode()

	- **@r** `A` string naming a [GameMode](GameMode.aus.md).


- **getPlayer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerGameModeChangeEvent.html#getPlayer()

	- **@r** `A` [Player](Player.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerGameModeChangeEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerGameModeChangeEvent.html#isCancelled()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerGameModeChangeEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.




