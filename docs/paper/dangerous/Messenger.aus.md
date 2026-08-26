# file: Messenger.aus

## class: Messenger

[15:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.MessengerShim) **extends: object** 

Generated shim for org.bukkit.plugin.messaging.Messenger.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getIncomingChannelRegistrations\_plugin** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#getIncomingChannelRegistrations(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@r** `A` list.


- **getIncomingChannelRegistrations** (`Channel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#getIncomingChannelRegistrations(java.lang.String)

	- **@p** `Channel` is a string.
	- **@r** `A` list.


- **getIncomingChannelRegistrations** (`Plugin, Channel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#getIncomingChannelRegistrations(org.bukkit.plugin.Plugin,java.lang.String)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Channel` is a string.
	- **@r** `A` list.


- **getIncomingChannels** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#getIncomingChannels()

	- **@r** `A` list.


- **getIncomingChannels** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#getIncomingChannels(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@r** `A` list.


- **getOutgoingChannels** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#getOutgoingChannels()

	- **@r** `A` list.


- **getOutgoingChannels** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#getOutgoingChannels(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@r** `A` list.


- **isIncomingChannelRegistered** (`Plugin, Channel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#isIncomingChannelRegistered(org.bukkit.plugin.Plugin,java.lang.String)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Channel` is a string.
	- **@r** `A` bool.


- **isOutgoingChannelRegistered** (`Plugin, Channel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#isOutgoingChannelRegistered(org.bukkit.plugin.Plugin,java.lang.String)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Channel` is a string.
	- **@r** `A` bool.


- **isRegistrationValid** (`Registration`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#isRegistrationValid(org.bukkit.plugin.messaging.PluginMessageListenerRegistration)

	- **@p** `Registration` is a [PluginMessageListenerRegistration](PluginMessageListenerRegistration.aus.md).
	- **@r** `A` bool.


- **isReservedChannel** (`Channel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#isReservedChannel(java.lang.String)

	- **@p** `Channel` is a string.
	- **@r** `A` bool.


- **registerIncomingPluginChannel** (`Plugin, Channel, Listener`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#registerIncomingPluginChannel(org.bukkit.plugin.Plugin,java.lang.String,org.bukkit.plugin.messaging.PluginMessageListener)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Channel` is a string.
	- **@p** `Listener` is a PluginMessageListener.
	- **@r** `A` [PluginMessageListenerRegistration](PluginMessageListenerRegistration.aus.md).


- **registerOutgoingPluginChannel** (`Plugin, Channel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#registerOutgoingPluginChannel(org.bukkit.plugin.Plugin,java.lang.String)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Channel` is a string.


- **unregisterIncomingPluginChannel** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#unregisterIncomingPluginChannel(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).


- **unregisterIncomingPluginChannel** (`Plugin, Channel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#unregisterIncomingPluginChannel(org.bukkit.plugin.Plugin,java.lang.String)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Channel` is a string.


- **unregisterIncomingPluginChannel** (`Plugin, Channel, Listener`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#unregisterIncomingPluginChannel(org.bukkit.plugin.Plugin,java.lang.String,org.bukkit.plugin.messaging.PluginMessageListener)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Channel` is a string.
	- **@p** `Listener` is a PluginMessageListener.


- **unregisterOutgoingPluginChannel** (`Plugin`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#unregisterOutgoingPluginChannel(org.bukkit.plugin.Plugin)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).


- **unregisterOutgoingPluginChannel** (`Plugin, Channel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/plugin/messaging/Messenger.html#unregisterOutgoingPluginChannel(org.bukkit.plugin.Plugin,java.lang.String)

	- **@p** `Plugin` is a [Plugin](Plugin.aus.md).
	- **@p** `Channel` is a string.




