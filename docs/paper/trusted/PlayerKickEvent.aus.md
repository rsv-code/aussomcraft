# file: PlayerKickEvent.aus

## class: PlayerKickEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.PlayerKickEventShim) **extends: object** 

Generated shim for org.bukkit.event.player.PlayerKickEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerKickEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[PlayerEvent](PlayerEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getCause** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerKickEvent.html#getCause()

	- **@r** `A` string naming a PlayerKickEvent.Cause.


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerKickEvent.html#getEventName()

	- **@r** `A` string.


- **getLeaveMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerKickEvent.html#getLeaveMessage()

	- **@r** `A` string.


- **getPlayer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerKickEvent.html#getPlayer()

	- **@r** `A` [Player](Player.aus.md).


- **getReason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerKickEvent.html#getReason()

	- **@r** `A` string.


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerKickEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerKickEvent.html#isCancelled()

	- **@r** `A` bool.


- **leaveMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerKickEvent.html#leaveMessage()

	- **@r** `A` Component.


- **leaveMessage** (`LeaveMessage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerKickEvent.html#leaveMessage(net.kyori.adventure.text.Component)

	- **@p** `LeaveMessage` is a Component.


- **reason** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerKickEvent.html#reason()

	- **@r** `A` Component.


- **reason** (`KickReason`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerKickEvent.html#reason(net.kyori.adventure.text.Component)

	- **@p** `KickReason` is a Component.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerKickEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setLeaveMessage** (`LeaveMessage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerKickEvent.html#setLeaveMessage(java.lang.String)

	- **@p** `LeaveMessage` is a string.


- **setReason** (`KickReason`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerKickEvent.html#setReason(java.lang.String)

	- **@p** `KickReason` is a string.




