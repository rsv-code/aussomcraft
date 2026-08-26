# file: Conversation.aus

## class: Conversation

[15:14] (extern: com.lehman.aussomcraft.paper.gen.dangerous.ConversationShim) **extends: object** 

Generated shim for org.bukkit.conversations.Conversation.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversation.html
Tier: dangerous. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **abandon** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversation.html#abandon()



- **abandon** (`Details`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversation.html#abandon(org.bukkit.conversations.ConversationAbandonedEvent)

	- **@p** `Details` is a [ConversationAbandonedEvent](ConversationAbandonedEvent.aus.md).


- **acceptInput** (`Input`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversation.html#acceptInput(java.lang.String)

	- **@p** `Input` is a string.


- **addConversationAbandonedListener** (`Listener`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversation.html#addConversationAbandonedListener(org.bukkit.conversations.ConversationAbandonedListener)

	- **@p** `Listener` is a [ConversationAbandonedListener](ConversationAbandonedListener.aus.md).


- **begin** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversation.html#begin()



- **getCancellers** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversation.html#getCancellers()

	- **@r** `A` list.


- **getContext** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversation.html#getContext()

	- **@r** `A` [ConversationContext](ConversationContext.aus.md).


- **getForWhom** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversation.html#getForWhom()

	- **@r** `A` [Conversable](Conversable.aus.md).


- **getPrefix** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversation.html#getPrefix()

	- **@r** `A` [ConversationPrefix](ConversationPrefix.aus.md).


- **getState** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversation.html#getState()

	- **@r** `A` string naming a Conversation.ConversationState.


- **isLocalEchoEnabled** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversation.html#isLocalEchoEnabled()

	- **@r** `A` bool.


- **isModal** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversation.html#isModal()

	- **@r** `A` bool.


- **outputNextPrompt** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversation.html#outputNextPrompt()



- **removeConversationAbandonedListener** (`Listener`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversation.html#removeConversationAbandonedListener(org.bukkit.conversations.ConversationAbandonedListener)

	- **@p** `Listener` is a [ConversationAbandonedListener](ConversationAbandonedListener.aus.md).


- **setLocalEchoEnabled** (`LocalEchoEnabled`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversation.html#setLocalEchoEnabled(boolean)

	- **@p** `LocalEchoEnabled` is a bool.




