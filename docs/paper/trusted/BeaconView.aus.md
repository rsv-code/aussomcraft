# file: BeaconView.aus

## class: BeaconView

[19:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.BeaconViewShim) **extends: object** 

Generated shim for org.bukkit.inventory.view.BeaconView.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html
In Paper this is a [InventoryView](InventoryView.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **close** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#close()



- **convertSlot** (`RawSlot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#convertSlot(int)

	- **@p** `RawSlot` is an int.
	- **@r** `An` int.


- **countSlots** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#countSlots()

	- **@r** `An` int.


- **getBottomInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#getBottomInventory()

	- **@r** `An` [Inventory](Inventory.aus.md).


- **getCursor** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#getCursor()

	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getInventory** (`RawSlot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#getInventory(int)

	- **@p** `RawSlot` is an int.
	- **@r** `An` [Inventory](Inventory.aus.md).


- **getItem** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#getItem(int)

	- **@p** `Slot` is an int.
	- **@r** `An` [ItemStack](ItemStack.aus.md).


- **getMenuType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#getMenuType()

	- **@r** `A` [MenuType](MenuType.aus.md).


- **getOriginalTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#getOriginalTitle()

	- **@r** `A` string.


- **getPlayer** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#getPlayer()

	- **@r** `A` [HumanEntity](HumanEntity.aus.md).


- **getPrimaryEffect** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#getPrimaryEffect()

	- **@r** `A` [PotionEffectType](PotionEffectType.aus.md).


- **getSecondaryEffect** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#getSecondaryEffect()

	- **@r** `A` [PotionEffectType](PotionEffectType.aus.md).


- **getSlotType** (`Slot`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#getSlotType(int)

	- **@p** `Slot` is an int.
	- **@r** `A` string naming an InventoryType.SlotType.


- **getTier** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#getTier()

	- **@r** `An` int.


- **getTitle** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#getTitle()

	- **@r** `A` string.


- **getTopInventory** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#getTopInventory()

	- **@r** `A` [BeaconInventory](BeaconInventory.aus.md).


- **getType** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#getType()

	- **@r** `An` string naming an [InventoryType](InventoryType.aus.md).


- **open** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#open()



- **setCursor** (`Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#setCursor(org.bukkit.inventory.ItemStack)

	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setItem** (`Slot, Item`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#setItem(int,org.bukkit.inventory.ItemStack)

	- **@p** `Slot` is an int.
	- **@p** `Item` is an [ItemStack](ItemStack.aus.md).


- **setPrimaryEffect** (`Effect`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#setPrimaryEffect(org.bukkit.potion.PotionEffectType)

	- **@p** `Effect` is a [PotionEffectType](PotionEffectType.aus.md).


- **setProperty** (`Prop, Value`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#setProperty(org.bukkit.inventory.InventoryView.Property,int)

	- **@p** `Prop` is a string naming an InventoryView.Property.
	- **@p** `Value` is an int.
	- **@r** `A` bool.


- **setSecondaryEffect** (`Effect`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#setSecondaryEffect(org.bukkit.potion.PotionEffectType)

	- **@p** `Effect` is a [PotionEffectType](PotionEffectType.aus.md).


- **setTitle** (`Title`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#setTitle(java.lang.String)

	- **@p** `Title` is a string.


- **title** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/view/BeaconView.html#title()

	- **@r** `A` Component.




