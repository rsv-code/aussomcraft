# file: AbstractChatEvent.aus

## class: AbstractChatEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.AbstractChatEventShim) **extends: object** 

Generated shim for io.papermc.paper.event.player.AbstractChatEvent.
Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/AbstractChatEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[PlayerEvent](PlayerEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/AbstractChatEvent.html#getEventName()

	- **@r** `A` string.


- **getPlayer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/AbstractChatEvent.html#getPlayer()

	- **@r** `A` [Player](Player.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/AbstractChatEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/AbstractChatEvent.html#isCancelled()

	- **@r** `A` bool.


- **message** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/AbstractChatEvent.html#message()

	- **@r** `A` Component.


- **message** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/AbstractChatEvent.html#message(net.kyori.adventure.text.Component)

	- **@p** `Message` is a Component.


- **originalMessage** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/AbstractChatEvent.html#originalMessage()

	- **@r** `A` Component.


- **renderer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/AbstractChatEvent.html#renderer()

	- **@r** `A` [ChatRenderer](ChatRenderer.aus.md).


- **renderer** (`Renderer`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/AbstractChatEvent.html#renderer(io.papermc.paper.chat.ChatRenderer)

	- **@p** `Renderer` is a [ChatRenderer](ChatRenderer.aus.md).


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/AbstractChatEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **viewers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/AbstractChatEvent.html#viewers()

	- **@r** `A` list.


- **callEvent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/AbstractChatEvent.html#callEvent()

	- **@r** `A` bool.


- **getHandlers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/event/player/AbstractChatEvent.html#getHandlers()

	- **@r** `A` [HandlerList](HandlerList.aus.md).




