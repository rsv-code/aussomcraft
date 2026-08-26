# file: PlayerCommonConnection.aus

## class: PlayerCommonConnection

[22:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.PlayerCommonConnectionShim) **extends: object** 

Generated shim for io.papermc.paper.connection.PlayerCommonConnection.
Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/connection/PlayerCommonConnection.html
In Paper this is a
[WritablePlayerCookieConnection](WritablePlayerCookieConnection.aus.md)
and
[ReadablePlayerCookieConnection](ReadablePlayerCookieConnection.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **disconnect** (`Component`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/connection/PlayerCommonConnection.html#disconnect(net.kyori.adventure.text.Component)

	- **@p** `Component` is a Component.


- **getClientBrandName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/connection/PlayerCommonConnection.html#getClientBrandName()

	- **@r** `A` string.


- **getClientOption** (`Type`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/connection/PlayerCommonConnection.html#getClientOption(com.destroystokyo.paper.ClientOption)

	- **@p** `Type` is a ClientOption.
	- **@r** `An` Object.


- **getListeningPluginChannels** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/connection/PlayerCommonConnection.html#getListeningPluginChannels()

	- **@r** `A` list.


- **isConnected** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/connection/PlayerCommonConnection.html#isConnected()

	- **@r** `A` bool.


- **isTransferred** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/connection/PlayerCommonConnection.html#isTransferred()

	- **@r** `A` bool.


- **sendLinks** (`Links`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/connection/PlayerCommonConnection.html#sendLinks(org.bukkit.ServerLinks)

	- **@p** `Links` is a [ServerLinks](ServerLinks.aus.md).


- **sendReportDetails** (`Details`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/connection/PlayerCommonConnection.html#sendReportDetails(java.util.Map)

	- **@p** `Details` is a map.


- **transfer** (`Host, Port`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/connection/PlayerCommonConnection.html#transfer(java.lang.String,int)

	- **@p** `Host` is a string.
	- **@p** `Port` is an int.




