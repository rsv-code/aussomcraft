# file: SignChangeEvent.aus

## class: SignChangeEvent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.SignChangeEventShim) **extends: object** 

Generated shim for org.bukkit.event.block.SignChangeEvent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/SignChangeEvent.html
In Paper this is a [Cancellable](Cancellable.aus.md) and
[BlockEvent](BlockEvent.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **getBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/SignChangeEvent.html#getBlock()

	- **@r** `A` [Block](Block.aus.md).


- **getEventName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/SignChangeEvent.html#getEventName()

	- **@r** `A` string.


- **getLine** (`Index`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/SignChangeEvent.html#getLine(int)

	- **@p** `Index` is an int.
	- **@r** `A` string.


- **getPlayer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/SignChangeEvent.html#getPlayer()

	- **@r** `A` [Player](Player.aus.md).


- **getSide** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/SignChangeEvent.html#getSide()

	- **@r** `A` string naming a [Side](Side.aus.md).


- **isAsynchronous** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/SignChangeEvent.html#isAsynchronous()

	- **@r** `A` bool.


- **isCancelled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/SignChangeEvent.html#isCancelled()

	- **@r** `A` bool.


- **line** (`Index`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/SignChangeEvent.html#line(int)

	- **@p** `Index` is an int.
	- **@r** `A` Component.


- **line** (`Index, Line`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/SignChangeEvent.html#line(int,net.kyori.adventure.text.Component)

	- **@p** `Index` is an int.
	- **@p** `Line` is a Component.


- **lines** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/SignChangeEvent.html#lines()

	- **@r** `A` list.


- **setCancelled** (`Cancel`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/SignChangeEvent.html#setCancelled(boolean)

	- **@p** `Cancel` is a bool.


- **setLine** (`Index, Line`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/SignChangeEvent.html#setLine(int,java.lang.String)

	- **@p** `Index` is an int.
	- **@p** `Line` is a string.


- **callEvent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/SignChangeEvent.html#callEvent()

	- **@r** `A` bool.


- **getHandlerList** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/SignChangeEvent.html#getHandlerList()

	- **@r** `A` [HandlerList](HandlerList.aus.md).


- **getHandlers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/event/block/SignChangeEvent.html#getHandlers()

	- **@r** `A` [HandlerList](HandlerList.aus.md).




