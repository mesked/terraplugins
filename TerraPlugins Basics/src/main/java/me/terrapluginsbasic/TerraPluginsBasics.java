package me.terrapluginsbasic;

import me.terrapluginsbasic.Listeners.JoinMessage;
import me.terrapluginsbasic.Listeners.LeaveMessage;
import me.terrapluginsbasic.Listeners.NewJoinMessage;
import org.bukkit.plugin.java.JavaPlugin;

public final class TerraPluginsBasics extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("<------------------------>");
        System.out.println("    Terra - Test");
        System.out.println("   Has been ENABLED!");
        System.out.println("<------------------------>");

        //Commands:


        //Listeners:

        getServer().getPluginManager().registerEvents(new JoinMessage(), this);
        getServer().getPluginManager().registerEvents(new LeaveMessage(), this);
        getServer().getPluginManager().registerEvents(new NewJoinMessage(), this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("<------------------------>");
        System.out.println("    Terra - Test");
        System.out.println("   Has been DISABLED!");
        System.out.println("<------------------------>");

    }
}