package com.lehman.aussomcraft.mock.otherplugin;

import java.util.Set;
import org.bukkit.entity.Player;

/**
 * Stands in for another plugin's event that happens to share a simple name
 * with one untrusted was granted, and extends it.
 *
 * A staff-only channel built this way is the case that matters: the text is
 * not public chat, but the class is a subclass of the event that carries
 * public chat.
 */
public class AsyncPlayerChatEvent extends org.bukkit.event.player.AsyncPlayerChatEvent {
    public AsyncPlayerChatEvent(Player who, String message, Set<Player> players) {
        super(false, who, message, players);
    }
}
