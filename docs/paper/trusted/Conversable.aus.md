# file: Conversable.aus

## class: Conversable

[15:14] (extern: com.lehman.aussomcraft.paper.gen.trusted.ConversableShim) **extends: object** 

Generated shim for org.bukkit.conversations.Conversable.
Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversable.html
Tier: trusted. Do not edit.

#### Methods

- **\_\_opEq\_\_** (`A0`)


- **abandonConversation** (`Conversation`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversable.html#abandonConversation(org.bukkit.conversations.Conversation)

	- **@p** `Conversation` is a [Conversation](Conversation.aus.md).


- **abandonConversation** (`Conversation, Details`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversable.html#abandonConversation(org.bukkit.conversations.Conversation,org.bukkit.conversations.ConversationAbandonedEvent)

	- **@p** `Conversation` is a [Conversation](Conversation.aus.md).
	- **@p** `Details` is a [ConversationAbandonedEvent](ConversationAbandonedEvent.aus.md).


- **acceptConversationInput** (`Input`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversable.html#acceptConversationInput(java.lang.String)

	- **@p** `Input` is a string.


- **beginConversation** (`Conversation`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversable.html#beginConversation(org.bukkit.conversations.Conversation)

	- **@p** `Conversation` is a [Conversation](Conversation.aus.md).
	- **@r** `A` bool.


- **isConversing** ()

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversable.html#isConversing()

	- **@r** `A` bool.


- **sendRawMessage** (`Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversable.html#sendRawMessage(java.lang.String)

	- **@p** `Message` is a string.


- **sendRawMessage** (`Sender, Message`)

	> Paper: https://jd.papermc.io/paper/1.21.10/org/bukkit/conversations/Conversable.html#sendRawMessage(java.util.UUID,java.lang.String)

	- **@p** `Sender` is a string.
	- **@p** `Message` is a string.




