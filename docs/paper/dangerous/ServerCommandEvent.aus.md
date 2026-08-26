# file: ServerCommandEvent.aus

## class: ServerCommandEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.ServerCommandEventShim) **extends: object** 

Generated shim for org.bukkit.event.server.ServerCommandEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/ServerCommandEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[ServerEvent](ServerEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **callEvent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/ServerCommandEvent.html#callEvent()

	- **@r** `A` bool.


- **getCommand** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/ServerCommandEvent.html#getCommand()

	- **@r** `A` string.


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/ServerCommandEvent.html#getEventName()

	- **@r** `A` string.


- **getHandlerList** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/ServerCommandEvent.html#getHandlerList()

	- **@r** `A` [HandlerList](HandlerList.aus.md).


- **getHandlers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/ServerCommandEvent.html#getHandlers()

	- **@r** `A` [HandlerList](HandlerList.aus.md).


- **getSender** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/ServerCommandEvent.html#getSender()

	- **@r** `A` [CommandSender](CommandSender.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/ServerCommandEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/ServerCommandEvent.html#isCancelled()

	- **@r** `A` bool.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/ServerCommandEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setCommand** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/server/ServerCommandEvent.html#setCommand(java.lang.String)

	- **@p** `Message` is a string.




