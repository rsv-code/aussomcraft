# file: PotionBrewer.aus

## class: PotionBrewer

[15:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.PotionBrewerShim) **extends: object** 

Generated shim for org.bukkit.potion.PotionBrewer.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionBrewer.html
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **addPotionMix** (`PotionMix`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionBrewer.html#addPotionMix(io.papermc.paper.potion.PotionMix)

	- **@p** `PotionMix` is a [PotionMix](PotionMix.aus.md).


- **createEffect** (`Potion, Duration, Amplifier`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionBrewer.html#createEffect(org.bukkit.potion.PotionEffectType,int,int)

	- **@p** `Potion` is a [PotionEffectType](PotionEffectType.aus.md).
	- **@p** `Duration` is an int.
	- **@p** `Amplifier` is an int.
	- **@r** `A` [PotionEffect](PotionEffect.aus.md).


- **getEffects** (`Type, Upgraded, Extended`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionBrewer.html#getEffects(org.bukkit.potion.PotionType,boolean,boolean)

	- **@p** `Type` is a string naming a [PotionType](PotionType.aus.md).
	- **@p** `Upgraded` is a bool.
	- **@p** `Extended` is a bool.
	- **@r** `A` list.


- **getEffectsFromDamage** (`Damage`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionBrewer.html#getEffectsFromDamage(int)

	- **@p** `Damage` is an int.
	- **@r** `A` list.


- **removePotionMix** (`Key`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionBrewer.html#removePotionMix(org.bukkit.NamespacedKey)

	- **@p** `Key` is a [NamespacedKey](NamespacedKey.aus.md).


- **resetPotionMixes** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/potion/PotionBrewer.html#resetPotionMixes()





