# file: BroadcastMessageEvent.aus

## class: BroadcastMessageEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.BroadcastMessageEventShim) **extends: object** 

Generated shim for org.bukkit.event.server.BroadcastMessageEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/BroadcastMessageEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[ServerEvent](ServerEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/BroadcastMessageEvent.html#getEventName()

	- **@r** `A` string.


- **getMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/BroadcastMessageEvent.html#getMessage()

	- **@r** `A` string.


- **getRecipients** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/BroadcastMessageEvent.html#getRecipients()

	- **@r** `A` list.


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/BroadcastMessageEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/BroadcastMessageEvent.html#isCancelled()

	- **@r** `A` bool.


- **message** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/BroadcastMessageEvent.html#message()

	- **@r** `A` Component.


- **message** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/BroadcastMessageEvent.html#message(net.kyori.adventure.text.Component)

	- **@p** `Message` is a Component.


- **setCancelled** (`Cancelled`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/BroadcastMessageEvent.html#setCancelled(boolean)

	- **@p** `Cancelled` is a bool.


- **setMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/BroadcastMessageEvent.html#setMessage(java.lang.String)

	- **@p** `Message` is a string.




