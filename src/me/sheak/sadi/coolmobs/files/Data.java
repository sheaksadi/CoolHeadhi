package me.sheak.sadi.coolmobs.files;

import me.sheak.sadi.coolmobs.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;

public class Data {
    private Main plugin ;
    private FileConfiguration dataconfig=null;
    private File configfile =null;


    public Data (Main plugin){
        this.plugin=plugin;
        saveDefault();

    }
    public  void reloadconfig (){
        if(this.configfile==null)
            this.configfile=new File(this.plugin.getDataFolder(),"textures.yml");

        this.dataconfig= YamlConfiguration.loadConfiguration(this.configfile);

        InputStream defaultstream=this.plugin.getResource("textures.yml");

        if(defaultstream!=null){
            YamlConfiguration defaultconfig=YamlConfiguration.loadConfiguration(new InputStreamReader(defaultstream));
            this.dataconfig.setDefaults(defaultconfig);

        }
    }
    public  FileConfiguration getconfig(){
        if(this.dataconfig==null)
            reloadconfig();
        return this.dataconfig;
    }
    public void  saveconfig (){
        if(this.dataconfig==null||this.configfile==null)
            return;

        try {
            this.getconfig().save(this.configfile);
        } catch (IOException e) {
            this.plugin.getLogger().log(Level.SEVERE,"could not save to "+this.configfile,e);
        }
    }

    public void  saveDefault () {
        if (this.configfile == null)
            this.configfile = new File(this.plugin.getDataFolder(), "texture.yml");

        if (!this.configfile.exists()){
            this.plugin.saveResource("texture.yml",false);
        }
    }

}
