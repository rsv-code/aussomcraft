# file: AsyncPlayerPreLoginEvent.aus

## class: AsyncPlayerPreLoginEvent

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.AsyncPlayerPreLoginEventShim) **extends: object** 

Generated shim for org.bukkit.event.player.AsyncPlayerPreLoginEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html
In Paper this is a [Event](Event.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **allow** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#allow()



- **disallow\_Result\_Component** (`Result, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#disallow(org.bukkit.event.player.AsyncPlayerPreLoginEvent.Result,net.kyori.adventure.text.Component)

	- **@p** `Result` is a string naming an AsyncPlayerPreLoginEvent.Result.
	- **@p** `Message` is a Component.


- **disallow\_Result\_Component2** (`Result, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#disallow(org.bukkit.event.player.PlayerPreLoginEvent.Result,net.kyori.adventure.text.Component)

	- **@p** `Result` is a string naming a PlayerPreLoginEvent.Result.
	- **@p** `Message` is a Component.


- **disallow** (`Result, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#disallow(org.bukkit.event.player.AsyncPlayerPreLoginEvent.Result,java.lang.String)

	- **@p** `Result` is a string naming an AsyncPlayerPreLoginEvent.Result.
	- **@p** `Message` is a string.


- **disallow\_Result\_String** (`Result, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#disallow(org.bukkit.event.player.PlayerPreLoginEvent.Result,java.lang.String)

	- **@p** `Result` is a string naming a PlayerPreLoginEvent.Result.
	- **@p** `Message` is a string.


- **getConnection** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#getConnection()

	- **@r** `A` [PlayerLoginConnection](PlayerLoginConnection.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#getEventName()

	- **@r** `A` string.


- **getHostname** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#getHostname()

	- **@r** `A` string.


- **getKickMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#getKickMessage()

	- **@r** `A` string.


- **getLoginResult** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#getLoginResult()

	- **@r** `A` string naming an AsyncPlayerPreLoginEvent.Result.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#getName()

	- **@r** `A` string.


- **getPlayerProfile** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#getPlayerProfile()

	- **@r** `A` [PlayerProfile](PlayerProfile.aus.md).


- **getResult** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#getResult()

	- **@r** `A` string naming a PlayerPreLoginEvent.Result.


- **getUniqueId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#getUniqueId()

	- **@r** `A` string.


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isTransferred** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#isTransferred()

	- **@r** `A` bool.


- **kickMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#kickMessage()

	- **@r** `A` Component.


- **kickMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#kickMessage(net.kyori.adventure.text.Component)

	- **@p** `Message` is a Component.


- **setKickMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#setKickMessage(java.lang.String)

	- **@p** `Message` is a string.


- **setLoginResult** (`Result`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#setLoginResult(org.bukkit.event.player.AsyncPlayerPreLoginEvent.Result)

	- **@p** `Result` is a string naming an AsyncPlayerPreLoginEvent.Result.


- **setPlayerProfile** (`Profile`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#setPlayerProfile(com.destroystokyo.paper.profile.PlayerProfile)

	- **@p** `Profile` is a [PlayerProfile](PlayerProfile.aus.md).


- **setResult** (`Result`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/player/AsyncPlayerPreLoginEvent.html#setResult(org.bukkit.event.player.PlayerPreLoginEvent.Result)

	- **@p** `Result` is a string naming a PlayerPreLoginEvent.Result.




