# file: PlayerLoginEvent.aus

## class: PlayerLoginEvent

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.PlayerLoginEventShim) **extends: object** 

Generated shim for org.bukkit.event.player.PlayerLoginEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerLoginEvent.html
In Paper this is a [PlayerEvent](PlayerEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **allow** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerLoginEvent.html#allow()



- **disallow\_Result\_Component** (`Result, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerLoginEvent.html#disallow(org.bukkit.event.player.PlayerLoginEvent.Result,net.kyori.adventure.text.Component)

	- **@p** `Result` is a string naming a PlayerLoginEvent.Result.
	- **@p** `Message` is a Component.


- **disallow** (`Result, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerLoginEvent.html#disallow(org.bukkit.event.player.PlayerLoginEvent.Result,java.lang.String)

	- **@p** `Result` is a string naming a PlayerLoginEvent.Result.
	- **@p** `Message` is a string.


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerLoginEvent.html#getEventName()

	- **@r** `A` string.


- **getHostname** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerLoginEvent.html#getHostname()

	- **@r** `A` string.


- **getKickMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerLoginEvent.html#getKickMessage()

	- **@r** `A` string.


- **getPlayer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerLoginEvent.html#getPlayer()

	- **@r** `A` [Player](Player.aus.md).


- **getResult** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerLoginEvent.html#getResult()

	- **@r** `A` string naming a PlayerLoginEvent.Result.


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerLoginEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **kickMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerLoginEvent.html#kickMessage()

	- **@r** `A` Component.


- **kickMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerLoginEvent.html#kickMessage(net.kyori.adventure.text.Component)

	- **@p** `Message` is a Component.


- **setKickMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerLoginEvent.html#setKickMessage(java.lang.String)

	- **@p** `Message` is a string.


- **setResult** (`Result`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/PlayerLoginEvent.html#setResult(org.bukkit.event.player.PlayerLoginEvent.Result)

	- **@p** `Result` is a string naming a PlayerLoginEvent.Result.




