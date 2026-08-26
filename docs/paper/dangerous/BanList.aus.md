# file: BanList.aus

## class: BanList

[15:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.BanListShim) **extends: object** 

Generated shim for org.bukkit.BanList.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/BanList.html
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addBan\_Object\_String\_Date\_String** (`Target, Reason, Expires, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/BanList.html#addBan(java.lang.Object,java.lang.String,java.util.Date,java.lang.String)

	- **@p** `Target` is an Object.
	- **@p** `Reason` is a string.
	- **@p** `Expires` is a Date.
	- **@p** `Source` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **addBan\_Object\_String\_Duration\_String** (`Target, Reason, Expires, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/BanList.html#addBan(java.lang.Object,java.lang.String,java.time.Duration,java.lang.String)

	- **@p** `Target` is an Object.
	- **@p** `Reason` is a string.
	- **@p** `Expires` is a Duration.
	- **@p** `Source` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **addBan\_Object\_String\_Instant\_String** (`Target, Reason, Expires, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/BanList.html#addBan(java.lang.Object,java.lang.String,java.time.Instant,java.lang.String)

	- **@p** `Target` is an Object.
	- **@p** `Reason` is a string.
	- **@p** `Expires` is an Instant.
	- **@p** `Source` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **addBan** (`Target, Reason, Expires, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/BanList.html#addBan(java.lang.String,java.lang.String,java.util.Date,java.lang.String)

	- **@p** `Target` is a string.
	- **@p** `Reason` is a string.
	- **@p** `Expires` is a Date.
	- **@p** `Source` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **getBanEntries** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/BanList.html#getBanEntries()

	- **@r** `A` list.


- **getBanEntry\_Object** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/BanList.html#getBanEntry(java.lang.Object)

	- **@p** `Target` is an Object.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **getBanEntry** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/BanList.html#getBanEntry(java.lang.String)

	- **@p** `Target` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **getEntries** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/BanList.html#getEntries()

	- **@r** `A` list.


- **isBanned\_Object** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/BanList.html#isBanned(java.lang.Object)

	- **@p** `Target` is an Object.
	- **@r** `A` bool.


- **isBanned** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/BanList.html#isBanned(java.lang.String)

	- **@p** `Target` is a string.
	- **@r** `A` bool.


- **pardon\_Object** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/BanList.html#pardon(java.lang.Object)

	- **@p** `Target` is an Object.


- **pardon** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/BanList.html#pardon(java.lang.String)

	- **@p** `Target` is a string.




