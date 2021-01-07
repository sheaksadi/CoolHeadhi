package me.sheak.sadi.coolmobs;

import me.sheak.sadi.coolmobs.events.EntityKilled;
import me.sheak.sadi.coolmobs.events.HeadBreak;
import me.sheak.sadi.coolmobs.events.PlayerKilled;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;





public class Main extends JavaPlugin {



    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        FileConfiguration config=this.getConfig();
        getServer().getPluginManager().registerEvents(new PlayerKilled(), this);
        getServer().getPluginManager().registerEvents(new HeadBreak(), this);
        getServer().getPluginManager().registerEvents(new EntityKilled(this), this);
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "Coolheads plugin is workink");
    }

    @Override
    public void onDisable() {

    }
}