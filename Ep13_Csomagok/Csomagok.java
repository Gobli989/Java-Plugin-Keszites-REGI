package me.gobli989.tutorial;

import net.minecraft.server.v1_15_R1.PacketPlayOutUnloadChunk;
import org.bukkit.craftbukkit.v1_15_R1.entity.CraftPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class EP16_Csomagok implements Listener {

    @EventHandler
    public void onCmd(PlayerCommandPreprocessEvent e) {
        if(e.getMessage().equalsIgnoreCase("/exp")) {
            e.setCancelled(true);

            PacketPlayOutUnloadChunk packet = new PacketPlayOutUnloadChunk(-23, 16);

            ((CraftPlayer) e.getPlayer()).getHandle().playerConnection.sendPacket(packet);
        }
    }

}
