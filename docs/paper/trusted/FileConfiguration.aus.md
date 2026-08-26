# file: FileConfiguration.aus

## class: FileConfiguration

[20:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.FileConfigurationShim) **extends: object** 

Generated shim for org.bukkit.configuration.file.FileConfiguration.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html
In Paper this is a
[MemoryConfiguration](MemoryConfiguration.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addDefault** (`Path, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#addDefault(java.lang.String,java.lang.Object)

	- **@p** `Path` is a string.
	- **@p** `Value` is an Object.


- **addDefaults** (`Defaults`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#addDefaults(org.bukkit.configuration.Configuration)

	- **@p** `Defaults` is a [Configuration](Configuration.aus.md).


- **addDefaults\_Map** (`Defaults`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#addDefaults(java.util.Map)

	- **@p** `Defaults` is a map.


- **contains** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#contains(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` bool.


- **contains** (`Path, IgnoreDefault`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#contains(java.lang.String,boolean)

	- **@p** `Path` is a string.
	- **@p** `IgnoreDefault` is a bool.
	- **@r** `A` bool.


- **createPath** (`Section, Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#createPath(org.bukkit.configuration.ConfigurationSection,java.lang.String)

	- **@p** `Section` is a [ConfigurationSection](ConfigurationSection.aus.md).
	- **@p** `Key` is a string.
	- **@r** `A` string.


- **createPath** (`Section, Key, RelativeTo`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#createPath(org.bukkit.configuration.ConfigurationSection,java.lang.String,org.bukkit.configuration.ConfigurationSection)

	- **@p** `Section` is a [ConfigurationSection](ConfigurationSection.aus.md).
	- **@p** `Key` is a string.
	- **@p** `RelativeTo` is a [ConfigurationSection](ConfigurationSection.aus.md).
	- **@r** `A` string.


- **createSection** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#createSection(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` [ConfigurationSection](ConfigurationSection.aus.md).


- **createSection** (`Path, Map`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#createSection(java.lang.String,java.util.Map)

	- **@p** `Path` is a string.
	- **@p** `Map` is a map.
	- **@r** `A` [ConfigurationSection](ConfigurationSection.aus.md).


- **get** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#get(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `An` Object.


- **get** (`Path, Def`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#get(java.lang.String,java.lang.Object)

	- **@p** `Path` is a string.
	- **@p** `Def` is an Object.
	- **@r** `An` Object.


- **getBoolean** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getBoolean(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` bool.


- **getBoolean** (`Path, Def`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getBoolean(java.lang.String,boolean)

	- **@p** `Path` is a string.
	- **@p** `Def` is a bool.
	- **@r** `A` bool.


- **getBooleanList** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getBooleanList(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` list.


- **getByteList** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getByteList(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` list.


- **getCharacterList** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getCharacterList(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` list.


- **getColor** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getColor(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` [Color](Color.aus.md).


- **getColor** (`Path, Def`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getColor(java.lang.String,org.bukkit.Color)

	- **@p** `Path` is a string.
	- **@p** `Def` is a [Color](Color.aus.md).
	- **@r** `A` [Color](Color.aus.md).


- **getComments** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getComments(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` list.


- **getConfigurationSection** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getConfigurationSection(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` [ConfigurationSection](ConfigurationSection.aus.md).


- **getCurrentPath** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getCurrentPath()

	- **@r** `A` string.


- **getDefaultSection** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getDefaultSection()

	- **@r** `A` [ConfigurationSection](ConfigurationSection.aus.md).


- **getDefaults** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getDefaults()

	- **@r** `A` [Configuration](Configuration.aus.md).


- **getDouble** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getDouble(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` double.


- **getDouble** (`Path, Def`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getDouble(java.lang.String,double)

	- **@p** `Path` is a string.
	- **@p** `Def` is a double.
	- **@r** `A` double.


- **getDoubleList** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getDoubleList(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` list.


- **getFloatList** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getFloatList(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` list.


- **getInlineComments** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getInlineComments(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` list.


- **getInt** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getInt(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `An` int.


- **getInt** (`Path, Def`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getInt(java.lang.String,int)

	- **@p** `Path` is a string.
	- **@p** `Def` is an int.
	- **@r** `An` int.


- **getIntegerList** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getIntegerList(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` list.


- **getItemStack** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getItemStack(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getItemStack** (`Path, Def`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getItemStack(java.lang.String,org.bukkit.inventory.ItemStack)

	- **@p** `Path` is a string.
	- **@p** `Def` is an [ItemStack](ItemStack.aus.md).
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getKeys** (`Deep`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getKeys(boolean)

	- **@p** `Deep` is a bool.
	- **@r** `A` list.


- **getList** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getList(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` list.


- **getList** (`Path, Def`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getList(java.lang.String,java.util.List)

	- **@p** `Path` is a string.
	- **@p** `Def` is a list.
	- **@r** `A` list.


- **getLocation** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getLocation(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` [Location](Location.aus.md).


- **getLocation** (`Path, Def`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getLocation(java.lang.String,org.bukkit.Location)

	- **@p** `Path` is a string.
	- **@p** `Def` is a [Location](Location.aus.md).
	- **@r** `A` [Location](Location.aus.md).


- **getLong** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getLong(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `An` int.


- **getLong** (`Path, Def`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getLong(java.lang.String,long)

	- **@p** `Path` is a string.
	- **@p** `Def` is an int.
	- **@r** `An` int.


- **getLongList** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getLongList(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` list.


- **getMapList** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getMapList(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` list.


- **getName** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getName()

	- **@r** `A` string.


- **getOfflinePlayer** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getOfflinePlayer(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `An` [OfflinePlayer](OfflinePlayer.aus.md).


- **getOfflinePlayer** (`Path, Def`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getOfflinePlayer(java.lang.String,org.bukkit.OfflinePlayer)

	- **@p** `Path` is a string.
	- **@p** `Def` is an [OfflinePlayer](OfflinePlayer.aus.md).
	- **@r** `An` [OfflinePlayer](OfflinePlayer.aus.md).


- **getParent** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getParent()

	- **@r** `A` [ConfigurationSection](ConfigurationSection.aus.md).


- **getRichMessage** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getRichMessage(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` Component.


- **getRichMessage** (`Path, Fallback`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getRichMessage(java.lang.String,net.kyori.adventure.text.Component)

	- **@p** `Path` is a string.
	- **@p** `Fallback` is a Component.
	- **@r** `A` Component.


- **getRoot** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getRoot()

	- **@r** `A` [Configuration](Configuration.aus.md).


- **getShortList** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getShortList(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` list.


- **getString** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getString(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` string.


- **getString** (`Path, Def`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getString(java.lang.String,java.lang.String)

	- **@p** `Path` is a string.
	- **@p** `Def` is a string.
	- **@r** `A` string.


- **getStringList** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getStringList(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` list.


- **getValues** (`Deep`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getValues(boolean)

	- **@p** `Deep` is a bool.
	- **@r** `A` map.


- **getVector** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getVector(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` [Vector](Vector.aus.md).


- **getVector** (`Path, Def`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#getVector(java.lang.String,org.bukkit.util.Vector)

	- **@p** `Path` is a string.
	- **@p** `Def` is a [Vector](Vector.aus.md).
	- **@r** `A` [Vector](Vector.aus.md).


- **isBoolean** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#isBoolean(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` bool.


- **isColor** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#isColor(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` bool.


- **isConfigurationSection** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#isConfigurationSection(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` bool.


- **isDouble** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#isDouble(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` bool.


- **isInt** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#isInt(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` bool.


- **isItemStack** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#isItemStack(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` bool.


- **isList** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#isList(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` bool.


- **isLocation** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#isLocation(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` bool.


- **isLong** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#isLong(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` bool.


- **isOfflinePlayer** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#isOfflinePlayer(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` bool.


- **isSet** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#isSet(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` bool.


- **isString** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#isString(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` bool.


- **isVector** (`Path`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#isVector(java.lang.String)

	- **@p** `Path` is a string.
	- **@r** `A` bool.


- **loadFromString** (`Contents`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#loadFromString(java.lang.String)

	- **@p** `Contents` is a string.


- **options** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#options()

	- **@r** `A` [FileConfigurationOptions](FileConfigurationOptions.aus.md).


- **saveToString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#saveToString()

	- **@r** `A` string.


- **set** (`Path, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#set(java.lang.String,java.lang.Object)

	- **@p** `Path` is a string.
	- **@p** `Value` is an Object.


- **setComments** (`Path, Comments`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#setComments(java.lang.String,java.util.List)

	- **@p** `Path` is a string.
	- **@p** `Comments` is a list.


- **setDefaults** (`Defaults`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#setDefaults(org.bukkit.configuration.Configuration)

	- **@p** `Defaults` is a [Configuration](Configuration.aus.md).


- **setInlineComments** (`Path, Comments`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#setInlineComments(java.lang.String,java.util.List)

	- **@p** `Path` is a string.
	- **@p** `Comments` is a list.


- **setRichMessage** (`Path, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#setRichMessage(java.lang.String,net.kyori.adventure.text.Component)

	- **@p** `Path` is a string.
	- **@p** `Value` is a Component.


- **toString** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/configuration/file/FileConfiguration.html#toString()

	- **@r** `A` string.




