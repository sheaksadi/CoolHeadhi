package me.sheak.sadi.coolmobs;

import me.sheak.sadi.coolmobs.events.EntityKilled;
import me.sheak.sadi.coolmobs.events.PlayerKilled;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;





public class Main extends JavaPlugin {

    public File customConfigFile;
    public FileConfiguration customConfig;


    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerKilled(), this);
        getServer().getPluginManager().registerEvents(new EntityKilled(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "Coolheads plugin is workink");
    }

    @Override
    public void onDisable() {

    }
}