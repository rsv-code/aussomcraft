# file: ProfileBanList.aus

## class: ProfileBanList

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.ProfileBanListShim) **extends: object** 

Generated shim for org.bukkit.ban.ProfileBanList.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html
In Paper this is a [BanList](BanList.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addBan\_Object\_String\_Duration\_String** (`Target, Reason, Expires, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#addBan(java.lang.Object,java.lang.String,java.time.Duration,java.lang.String)

	- **@p** `Target` is an Object.
	- **@p** `Reason` is a string.
	- **@p** `Expires` is a Duration.
	- **@p** `Source` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **addBan\_Object\_String\_Instant\_String** (`Target, Reason, Expires, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#addBan(java.lang.Object,java.lang.String,java.time.Instant,java.lang.String)

	- **@p** `Target` is an Object.
	- **@p** `Reason` is a string.
	- **@p** `Expires` is an Instant.
	- **@p** `Source` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **addBan\_PlayerProfile\_String\_Date\_String** (`Target, Reason, Expires, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#addBan(com.destroystokyo.paper.profile.PlayerProfile,java.lang.String,java.util.Date,java.lang.String)

	- **@p** `Target` is a ProfilePlayerProfile.
	- **@p** `Reason` is a string.
	- **@p** `Expires` is a Date.
	- **@p** `Source` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **addBan\_PlayerProfile\_String\_Date\_String2** (`Target, Reason, Expires, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#addBan(org.bukkit.profile.PlayerProfile,java.lang.String,java.util.Date,java.lang.String)

	- **@p** `Target` is a [PlayerProfile](PlayerProfile.aus.md).
	- **@p** `Reason` is a string.
	- **@p** `Expires` is a Date.
	- **@p** `Source` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **addBan\_PlayerProfile\_String\_Duration\_String** (`Target, Reason, Duration, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#addBan(org.bukkit.profile.PlayerProfile,java.lang.String,java.time.Duration,java.lang.String)

	- **@p** `Target` is a [PlayerProfile](PlayerProfile.aus.md).
	- **@p** `Reason` is a string.
	- **@p** `Duration` is a Duration.
	- **@p** `Source` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **addBan\_PlayerProfile\_String\_Instant\_String** (`Target, Reason, Expires, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#addBan(org.bukkit.profile.PlayerProfile,java.lang.String,java.time.Instant,java.lang.String)

	- **@p** `Target` is a [PlayerProfile](PlayerProfile.aus.md).
	- **@p** `Reason` is a string.
	- **@p** `Expires` is an Instant.
	- **@p** `Source` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **addBan** (`Target, Reason, Expires, Source`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#addBan(java.lang.String,java.lang.String,java.util.Date,java.lang.String)

	- **@p** `Target` is a string.
	- **@p** `Reason` is a string.
	- **@p** `Expires` is a Date.
	- **@p** `Source` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **getBanEntries** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#getBanEntries()

	- **@r** `A` list.


- **getBanEntry\_Object** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#getBanEntry(java.lang.Object)

	- **@p** `Target` is an Object.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **getBanEntry\_PlayerProfile** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#getBanEntry(org.bukkit.profile.PlayerProfile)

	- **@p** `Target` is a [PlayerProfile](PlayerProfile.aus.md).
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **getBanEntry** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#getBanEntry(java.lang.String)

	- **@p** `Target` is a string.
	- **@r** `A` [BanEntry](BanEntry.aus.md).


- **getEntries** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#getEntries()

	- **@r** `A` list.


- **isBanned\_Object** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#isBanned(java.lang.Object)

	- **@p** `Target` is an Object.
	- **@r** `A` bool.


- **isBanned\_PlayerProfile** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#isBanned(org.bukkit.profile.PlayerProfile)

	- **@p** `Target` is a [PlayerProfile](PlayerProfile.aus.md).
	- **@r** `A` bool.


- **isBanned** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#isBanned(java.lang.String)

	- **@p** `Target` is a string.
	- **@r** `A` bool.


- **pardon\_Object** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#pardon(java.lang.Object)

	- **@p** `Target` is an Object.


- **pardon\_PlayerProfile** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#pardon(org.bukkit.profile.PlayerProfile)

	- **@p** `Target` is a [PlayerProfile](PlayerProfile.aus.md).


- **pardon** (`Target`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/ban/ProfileBanList.html#pardon(java.lang.String)

	- **@p** `Target` is a string.




