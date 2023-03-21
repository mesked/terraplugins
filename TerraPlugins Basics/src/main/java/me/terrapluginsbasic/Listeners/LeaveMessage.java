package me.terrapluginsbasic.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeaveMessage implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {

        Player target = event.getPlayer();

        event.setQuitMessage(ChatColor.translateAlternateColorCodes('&', "&7[&c-&7] &7" + target));

    }


}
