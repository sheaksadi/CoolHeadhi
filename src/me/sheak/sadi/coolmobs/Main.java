package me.sheak.sadi.coolmobs;

import me.sheak.sadi.coolmobs.events.EntityKilled;
import me.sheak.sadi.coolmobs.events.HeadBreak;
import me.sheak.sadi.coolmobs.events.PlayerKilled;
import org.bukkit.ChatColor;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;


public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new PlayerKilled(), this);
        getServer().getPluginManager().registerEvents(new HeadBreak(), this);
        getServer().getPluginManager().registerEvents(new EntityKilled(this), this);
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "Coolheads plugin is workin");
    }

    @Override
    public void onDisable() {

    }



}