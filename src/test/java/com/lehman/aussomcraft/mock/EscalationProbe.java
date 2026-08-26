package com.lehman.aussomcraft.mock;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockbukkit.mockbukkit.MockBukkit;
import org.mockbukkit.mockbukkit.ServerMock;
import org.mockbukkit.mockbukkit.entity.PlayerMock;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import com.lehman.aussomcraft.AussomCraftPlugin;

/** What a permission grant would actually have bought. */
public class EscalationProbe {
    private ServerMock server;
    private AussomCraftPlugin plugin;

    @BeforeEach public void setUp() {
        this.server = MockBukkit.mock();
        this.plugin = MockBukkit.load(AussomCraftPlugin.class);
    }
    @AfterEach public void tearDown() { MockBukkit.unmock(); }

    @Test public void whatAGrantBuys() {
        PlayerMock p = this.server.addPlayer("Mallory");
        System.out.println("ESC before dangerous = " + p.hasPermission("aussomcraft.dangerous"));
        System.out.println("ESC before trust     = " + p.hasPermission("aussomcraft.trust"));
        System.out.println("ESC before op cmd    = " + p.hasPermission("minecraft.command.op"));

        // exactly what PermissionAttachment.setPermission would have done
        PermissionAttachment a = p.addAttachment(this.plugin);
        a.setPermission("aussomcraft.dangerous", true);
        a.setPermission("aussomcraft.trust", true);
        p.recalculatePermissions();

        System.out.println("ESC after dangerous  = " + p.hasPermission("aussomcraft.dangerous"));
        System.out.println("ESC after trust      = " + p.hasPermission("aussomcraft.trust"));

        // is an attachment reachable from a fresh player, the route a script had?
        int withAttachment = 0, total = 0;
        PlayerMock q = this.server.addPlayer("Steve");
        for (PermissionAttachmentInfo i : q.getEffectivePermissions()) {
            total++;
            if (i.getAttachment() != null) withAttachment++;
        }
        System.out.println("ESC fresh player effective perms = " + total
            + ", with a non-null attachment = " + withAttachment);
    }
}
