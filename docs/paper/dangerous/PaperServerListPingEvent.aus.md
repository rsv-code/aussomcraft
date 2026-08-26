# file: PaperServerListPingEvent.aus

## class: PaperServerListPingEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.PaperServerListPingEventShim) **extends: object** 

Generated shim for com.destroystokyo.paper.event.server.PaperServerListPingEvent.
Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[ServerListPingEvent](ServerListPingEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getClient** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#getClient()

	- **@r** `A` [StatusClient](StatusClient.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#getEventName()

	- **@r** `A` string.


- **getHostname** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#getHostname()

	- **@r** `A` string.


- **getListedPlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#getListedPlayers()

	- **@r** `A` list.


- **getMaxPlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#getMaxPlayers()

	- **@r** `An` int.


- **getMotd** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#getMotd()

	- **@r** `A` string.


- **getNumPlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#getNumPlayers()

	- **@r** `An` int.


- **getPlayerSample** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#getPlayerSample()

	- **@r** `A` list.


- **getProtocolVersion** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#getProtocolVersion()

	- **@r** `An` int.


- **getServerIcon** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#getServerIcon()

	- **@r** `A` [CachedServerIcon](CachedServerIcon.aus.md).


- **getVersion** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#getVersion()

	- **@r** `A` string.


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#isCancelled()

	- **@r** `A` bool.


- **motd** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#motd()

	- **@r** `A` Component.


- **motd** (`Motd`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#motd(net.kyori.adventure.text.Component)

	- **@p** `Motd` is a Component.


- **setCancelled** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#setCancelled(boolean)

	- **@p** `A0` is a bool.


- **setHidePlayers** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#setHidePlayers(boolean)

	- **@p** `A0` is a bool.


- **setMaxPlayers** (`MaxPlayers`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#setMaxPlayers(int)

	- **@p** `MaxPlayers` is an int.


- **setMotd** (`Motd`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#setMotd(java.lang.String)

	- **@p** `Motd` is a string.


- **setNumPlayers** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#setNumPlayers(int)

	- **@p** `A0` is an int.


- **setProtocolVersion** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#setProtocolVersion(int)

	- **@p** `A0` is an int.


- **setServerIcon** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#setServerIcon(org.bukkit.util.CachedServerIcon)

	- **@p** `A0` is a [CachedServerIcon](CachedServerIcon.aus.md).


- **setVersion** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#setVersion(java.lang.String)

	- **@p** `A0` is a string.


- **shouldHidePlayers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#shouldHidePlayers()

	- **@r** `A` bool.


- **shouldSendChatPreviews** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#shouldSendChatPreviews()

	- **@r** `A` bool.


- **callEvent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#callEvent()

	- **@r** `A` bool.


- **getHandlerList** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#getHandlerList()

	- **@r** `A` [HandlerList](HandlerList.aus.md).


- **getHandlers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/event/server/PaperServerListPingEvent.html#getHandlers()

	- **@r** `A` [HandlerList](HandlerList.aus.md).




