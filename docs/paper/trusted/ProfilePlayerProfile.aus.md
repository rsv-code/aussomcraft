# file: ProfilePlayerProfile.aus

## class: ProfilePlayerProfile

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.ProfilePlayerProfileShim) **extends: object** 

Generated shim for com.destroystokyo.paper.profile.PlayerProfile.
Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html
In Paper this is a [PlayerProfile](PlayerProfile.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **clearProperties** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#clearProperties()



- **clone** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#clone()

	- **@r** `A` ProfilePlayerProfile.


- **complete** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#complete()

	- **@r** `A` bool.


- **complete** (`Textures`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#complete(boolean)

	- **@p** `Textures` is a bool.
	- **@r** `A` bool.


- **complete** (`Textures, OnlineMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#complete(boolean,boolean)

	- **@p** `Textures` is a bool.
	- **@p** `OnlineMode` is a bool.
	- **@r** `A` bool.


- **completeFromCache** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#completeFromCache()

	- **@r** `A` bool.


- **completeFromCache** (`OnlineMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#completeFromCache(boolean)

	- **@p** `OnlineMode` is a bool.
	- **@r** `A` bool.


- **completeFromCache** (`LookupUUID, OnlineMode`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#completeFromCache(boolean,boolean)

	- **@p** `LookupUUID` is a bool.
	- **@p** `OnlineMode` is a bool.
	- **@r** `A` bool.


- **getId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#getId()

	- **@r** `A` string.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#getName()

	- **@r** `A` string.


- **getProperties** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#getProperties()

	- **@r** `A` list.


- **getTextures** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#getTextures()

	- **@r** `A` [PlayerTextures](PlayerTextures.aus.md).


- **getUniqueId** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#getUniqueId()

	- **@r** `A` string.


- **hasProperty** (`Property`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#hasProperty(java.lang.String)

	- **@p** `Property` is a string.
	- **@r** `A` bool.


- **hasTextures** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#hasTextures()

	- **@r** `A` bool.


- **isComplete** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#isComplete()

	- **@r** `A` bool.


- **removeProperties** (`Properties`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#removeProperties(java.util.Collection)

	- **@p** `Properties` is a list.
	- **@r** `A` bool.


- **removeProperty\_ProfileProperty** (`Property`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#removeProperty(com.destroystokyo.paper.profile.ProfileProperty)

	- **@p** `Property` is a [ProfileProperty](ProfileProperty.aus.md).
	- **@r** `A` bool.


- **removeProperty** (`Property`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#removeProperty(java.lang.String)

	- **@p** `Property` is a string.
	- **@r** `A` bool.


- **serialize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#serialize()

	- **@r** `A` map.


- **setId** (`Uuid`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#setId(java.util.UUID)

	- **@p** `Uuid` is a string.
	- **@r** `A` string.


- **setName** (`Name`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#setName(java.lang.String)

	- **@p** `Name` is a string.
	- **@r** `A` string.


- **setProperties** (`Properties`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#setProperties(java.util.Collection)

	- **@p** `Properties` is a list.


- **setProperty** (`Property`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#setProperty(com.destroystokyo.paper.profile.ProfileProperty)

	- **@p** `Property` is a [ProfileProperty](ProfileProperty.aus.md).


- **setTextures** (`Textures`)

	> Paper: https://jd.papermc.io/paper/1.21.10/com/destroystokyo/paper/profile/PlayerProfile.html#setTextures(org.bukkit.profile.PlayerTextures)

	- **@p** `Textures` is a [PlayerTextures](PlayerTextures.aus.md).




