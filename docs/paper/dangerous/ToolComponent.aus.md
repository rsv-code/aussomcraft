# file: ToolComponent.aus

## class: ToolComponent

[20:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.ToolComponentShim) **extends: object** 

Generated shim for org.bukkit.inventory.meta.components.ToolComponent.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/components/ToolComponent.html
In Paper this is a
[ConfigurationSerializable](ConfigurationSerializable.aus.md).
Every method it inherits is declared here too, so there is
nothing to follow up to.
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addRule** (`Blocks, Speed, CorrectForDrops`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/components/ToolComponent.html#addRule(java.util.Collection,java.lang.Float,java.lang.Boolean)

	- **@p** `Blocks` is a list.
	- **@p** `Speed` is a double.
	- **@p** `CorrectForDrops` is a bool.
	- **@r** `A` ToolComponent.ToolRule.


- **addRule\_block\_speed\_correctfordrops** (`Block, Speed, CorrectForDrops`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/components/ToolComponent.html#addRule(org.bukkit.Material,java.lang.Float,java.lang.Boolean)

	- **@p** `Block` is a string naming a [Material](Material.aus.md).
	- **@p** `Speed` is a double.
	- **@p** `CorrectForDrops` is a bool.
	- **@r** `A` ToolComponent.ToolRule.


- **addRule\_tag\_speed\_correctfordrops** (`Tag, Speed, CorrectForDrops`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/components/ToolComponent.html#addRule(org.bukkit.Tag,java.lang.Float,java.lang.Boolean)

	- **@p** `Tag` is a [Tag](Tag.aus.md).
	- **@p** `Speed` is a double.
	- **@p** `CorrectForDrops` is a bool.
	- **@r** `A` ToolComponent.ToolRule.


- **getDamagePerBlock** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/components/ToolComponent.html#getDamagePerBlock()

	- **@r** `An` int.


- **getDefaultMiningSpeed** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/components/ToolComponent.html#getDefaultMiningSpeed()

	- **@r** `A` double.


- **getRules** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/components/ToolComponent.html#getRules()

	- **@r** `A` list.


- **removeRule** (`Rule`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/components/ToolComponent.html#removeRule(org.bukkit.inventory.meta.components.ToolComponent.ToolRule)

	- **@p** `Rule` is a ToolComponent.ToolRule.
	- **@r** `A` bool.


- **serialize** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/components/ToolComponent.html#serialize()

	- **@r** `A` map.


- **setDamagePerBlock** (`Damage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/components/ToolComponent.html#setDamagePerBlock(int)

	- **@p** `Damage` is an int.


- **setDefaultMiningSpeed** (`Speed`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/components/ToolComponent.html#setDefaultMiningSpeed(float)

	- **@p** `Speed` is a double.


- **setRules** (`Rules`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/inventory/meta/components/ToolComponent.html#setRules(java.util.List)

	- **@p** `Rules` is a list.




