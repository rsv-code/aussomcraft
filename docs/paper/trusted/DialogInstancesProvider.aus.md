# file: DialogInstancesProvider.aus

## class: DialogInstancesProvider

[15:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.DialogInstancesProviderShim) **extends: object** 

Generated shim for io.papermc.paper.registry.data.dialog.DialogInstancesProvider.
Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **actionButtonBuilder** (`Label`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#actionButtonBuilder(net.kyori.adventure.text.Component)

	- **@p** `Label` is a Component.
	- **@r** `An` ActionButton.Builder.


- **booleanBuilder** (`Key, Label`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#booleanBuilder(java.lang.String,net.kyori.adventure.text.Component)

	- **@p** `Key` is a string.
	- **@p** `Label` is a Component.
	- **@r** `A` BooleanDialogInput.Builder.


- **commandTemplate** (`Template`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#commandTemplate(java.lang.String)

	- **@p** `Template` is a string.
	- **@r** `A` DialogAction.CommandTemplateAction.


- **confirmation** (`YesButton, NoButton`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#confirmation(io.papermc.paper.registry.data.dialog.ActionButton,io.papermc.paper.registry.data.dialog.ActionButton)

	- **@p** `YesButton` is an [ActionButton](ActionButton.aus.md).
	- **@p** `NoButton` is an [ActionButton](ActionButton.aus.md).
	- **@r** `A` [ConfirmationType](ConfirmationType.aus.md).


- **dialogBaseBuilder** (`Title`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#dialogBaseBuilder(net.kyori.adventure.text.Component)

	- **@p** `Title` is a Component.
	- **@r** `A` DialogBase.Builder.


- **dialogList** (`Dialogs`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#dialogList(io.papermc.paper.registry.set.RegistrySet)

	- **@p** `Dialogs` is a [RegistrySet](RegistrySet.aus.md).
	- **@r** `A` DialogListType.Builder.


- **instance** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#instance()

	- **@r** `A` [DialogInstancesProvider](DialogInstancesProvider.aus.md).


- **itemDialogBodyBuilder** (`ItemStack`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#itemDialogBodyBuilder(org.bukkit.inventory.ItemStack)

	- **@p** `ItemStack` is an [ItemStack](ItemStack.aus.md).
	- **@r** `An` ItemDialogBody.Builder.


- **multiAction** (`Actions`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#multiAction(java.util.List)

	- **@p** `Actions` is a list.
	- **@r** `A` MultiActionType.Builder.


- **multilineOptions** (`MaxLines, Height`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#multilineOptions(java.lang.Integer,java.lang.Integer)

	- **@p** `MaxLines` is an int.
	- **@p** `Height` is an int.
	- **@r** `A` TextDialogInput.MultilineOptions.


- **notice** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#notice()

	- **@r** `A` [NoticeType](NoticeType.aus.md).


- **notice** (`Action`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#notice(io.papermc.paper.registry.data.dialog.ActionButton)

	- **@p** `Action` is an [ActionButton](ActionButton.aus.md).
	- **@r** `A` [NoticeType](NoticeType.aus.md).


- **numberRangeBuilder** (`Key, Label, Start, End`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#numberRangeBuilder(java.lang.String,net.kyori.adventure.text.Component,float,float)

	- **@p** `Key` is a string.
	- **@p** `Label` is a Component.
	- **@p** `Start` is a double.
	- **@p** `End` is a double.
	- **@r** `A` NumberRangeDialogInput.Builder.


- **plainMessageDialogBody** (`Component`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#plainMessageDialogBody(net.kyori.adventure.text.Component)

	- **@p** `Component` is a Component.
	- **@r** `A` [PlainMessageDialogBody](PlainMessageDialogBody.aus.md).


- **plainMessageDialogBody** (`Component, Width`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#plainMessageDialogBody(net.kyori.adventure.text.Component,int)

	- **@p** `Component` is a Component.
	- **@p** `Width` is an int.
	- **@r** `A` [PlainMessageDialogBody](PlainMessageDialogBody.aus.md).


- **serverLinks** (`ExitAction, Columns, ButtonWidth`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#serverLinks(io.papermc.paper.registry.data.dialog.ActionButton,int,int)

	- **@p** `ExitAction` is an [ActionButton](ActionButton.aus.md).
	- **@p** `Columns` is an int.
	- **@p** `ButtonWidth` is an int.
	- **@r** `A` [ServerLinksType](ServerLinksType.aus.md).


- **singleOptionBuilder** (`Key, Label, Entries`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#singleOptionBuilder(java.lang.String,net.kyori.adventure.text.Component,java.util.List)

	- **@p** `Key` is a string.
	- **@p** `Label` is a Component.
	- **@p** `Entries` is a list.
	- **@r** `A` SingleOptionDialogInput.Builder.


- **singleOptionEntry** (`Id, Display, Initial`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#singleOptionEntry(java.lang.String,net.kyori.adventure.text.Component,boolean)

	- **@p** `Id` is a string.
	- **@p** `Display` is a Component.
	- **@p** `Initial` is a bool.
	- **@r** `A` SingleOptionDialogInput.OptionEntry.


- **textBuilder** (`Key, Label`)

	> Paper: https://jd.papermc.io/paper/1.21.10/io/papermc/paper/registry/data/dialog/DialogInstancesProvider.html#textBuilder(java.lang.String,net.kyori.adventure.text.Component)

	- **@p** `Key` is a string.
	- **@p** `Label` is a Component.
	- **@r** `A` TextDialogInput.Builder.




