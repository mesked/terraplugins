package me.terrapluginsbasic.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class NewJoinMessage implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Player target = event.getPlayer();

        if(!event.getPlayer().hasPlayedBefore()) {
            event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lNEW &7[&a+&7] &7" + target));
        }
    }

    }

