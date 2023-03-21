package me.terrapluginsbasic.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinMessage implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Player target = event.getPlayer();

        event.setJoinMessage(ChatColor.translateAlternateColorCodes('&', "&7[&a+&7] &7" + target));

    }


}
