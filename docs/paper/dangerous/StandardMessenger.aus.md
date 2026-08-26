# file: StandardMessenger.aus

## class: StandardMessenger

[19:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.StandardMessengerShim) **extends: object** 

Generated shim for org.bukkit.plugin.messaging.StandardMessenger.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html
In Paper this is a [Messenger](Messenger.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getIncomingChannelRegistrations\_Plugin** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#getIncomingChannelRegistrations(org.bukkit.plugin.Plugin)

	- **@p** `A0` is a [Plugin](Plugin.aus.md).
	- **@r** `A` list.


- **getIncomingChannelRegistrations** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#getIncomingChannelRegistrations(java.lang.String)

	- **@p** `A0` is a string.
	- **@r** `A` list.


- **getIncomingChannelRegistrations** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#getIncomingChannelRegistrations(org.bukkit.plugin.Plugin,java.lang.String)

	- **@p** `A0` is a [Plugin](Plugin.aus.md).
	- **@p** `A1` is a string.
	- **@r** `A` list.


- **getIncomingChannels** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#getIncomingChannels()

	- **@r** `A` list.


- **getIncomingChannels** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#getIncomingChannels(org.bukkit.plugin.Plugin)

	- **@p** `A0` is a [Plugin](Plugin.aus.md).
	- **@r** `A` list.


- **getOutgoingChannels** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#getOutgoingChannels()

	- **@r** `A` list.


- **getOutgoingChannels** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#getOutgoingChannels(org.bukkit.plugin.Plugin)

	- **@p** `A0` is a [Plugin](Plugin.aus.md).
	- **@r** `A` list.


- **isIncomingChannelRegistered** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#isIncomingChannelRegistered(org.bukkit.plugin.Plugin,java.lang.String)

	- **@p** `A0` is a [Plugin](Plugin.aus.md).
	- **@p** `A1` is a string.
	- **@r** `A` bool.


- **isOutgoingChannelRegistered** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#isOutgoingChannelRegistered(org.bukkit.plugin.Plugin,java.lang.String)

	- **@p** `A0` is a [Plugin](Plugin.aus.md).
	- **@p** `A1` is a string.
	- **@r** `A` bool.


- **isRegistrationValid** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#isRegistrationValid(org.bukkit.plugin.messaging.PluginMessageListenerRegistration)

	- **@p** `A0` is a [PluginMessageListenerRegistration](PluginMessageListenerRegistration.aus.md).
	- **@r** `A` bool.


- **isReservedChannel** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#isReservedChannel(java.lang.String)

	- **@p** `A0` is a string.
	- **@r** `A` bool.


- **registerIncomingPluginChannel** (`A0, A1, A2`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#registerIncomingPluginChannel(org.bukkit.plugin.Plugin,java.lang.String,org.bukkit.plugin.messaging.PluginMessageListener)

	- **@p** `A0` is a [Plugin](Plugin.aus.md).
	- **@p** `A1` is a string.
	- **@p** `A2` is a PluginMessageListener.
	- **@r** `A` [PluginMessageListenerRegistration](PluginMessageListenerRegistration.aus.md).


- **registerOutgoingPluginChannel** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#registerOutgoingPluginChannel(org.bukkit.plugin.Plugin,java.lang.String)

	- **@p** `A0` is a [Plugin](Plugin.aus.md).
	- **@p** `A1` is a string.


- **unregisterIncomingPluginChannel** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#unregisterIncomingPluginChannel(org.bukkit.plugin.Plugin)

	- **@p** `A0` is a [Plugin](Plugin.aus.md).


- **unregisterIncomingPluginChannel** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#unregisterIncomingPluginChannel(org.bukkit.plugin.Plugin,java.lang.String)

	- **@p** `A0` is a [Plugin](Plugin.aus.md).
	- **@p** `A1` is a string.


- **unregisterIncomingPluginChannel** (`A0, A1, A2`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#unregisterIncomingPluginChannel(org.bukkit.plugin.Plugin,java.lang.String,org.bukkit.plugin.messaging.PluginMessageListener)

	- **@p** `A0` is a [Plugin](Plugin.aus.md).
	- **@p** `A1` is a string.
	- **@p** `A2` is a PluginMessageListener.


- **unregisterOutgoingPluginChannel** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#unregisterOutgoingPluginChannel(org.bukkit.plugin.Plugin)

	- **@p** `A0` is a [Plugin](Plugin.aus.md).


- **unregisterOutgoingPluginChannel** (`A0, A1`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#unregisterOutgoingPluginChannel(org.bukkit.plugin.Plugin,java.lang.String)

	- **@p** `A0` is a [Plugin](Plugin.aus.md).
	- **@p** `A1` is a string.


- **validateAndCorrectChannel** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#validateAndCorrectChannel(java.lang.String)

	- **@p** `A0` is a string.
	- **@r** `A` string.


- **validateChannel** (`A0`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/StandardMessenger.html#validateChannel(java.lang.String)

	- **@p** `A0` is a string.




