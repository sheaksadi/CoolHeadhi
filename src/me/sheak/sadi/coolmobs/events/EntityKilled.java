package me.sheak.sadi.coolmobs.events;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import me.sheak.sadi.coolmobs.Main;
import me.sheak.sadi.coolmobs.mobhead.Mob;
import me.sheak.sadi.coolmobs.mobhead.MobType;
import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import java.lang.reflect.Field;
import java.util.Random;
import java.util.UUID;

public class EntityKilled implements Listener {
    Main plugin;
    public EntityKilled (Main instance){
        plugin=instance;
    }


    @EventHandler
    public void onkilled(EntityDeathEvent e){
        Entity entity =e.getEntity();
        LivingEntity ett = e.getEntity();

        if(ett.getKiller() == null){
            return;
        }

        if(entity instanceof Ageable){
            Ageable ageableentt =(Ageable)entity;
            if (!ageableentt.isAdult()){
                return;
            }
        }


        for (String key : plugin.getConfig().getConfigurationSection("Droppercent.Mobs").getKeys(false)) {
            if (key.equalsIgnoreCase(e.getEntityType().toString())) {
                double percent;
                percent = Double.parseDouble(plugin.getConfig().getString("Droppercent.Mobs." + key));


                Random random = new Random();


                int a = (int) (1 / percent);
                int b = random.nextInt(a) + 1;
                //testing code
                //ett.getKiller().sendMessage(b + "  in  " +  a +" when " +percent );


                if (b != 1) {
                    plugin.saveDefaultConfig();
                    return;

                }
            }
        }


        MobType mobType=new MobType();

        Mob m =new Mob();

        String url= m.sortmob(e.getEntityType(),e.getEntity()) ;

        if(url==null)
            return;

        String name=mobType.rsortmob(url);


        ItemStack item = getCustomSkull(url,name);

        if (item==null)
            return;



        entity.getWorld().dropItemNaturally(entity.getLocation(),item);

    }
    public ItemStack getCustomSkull(String url, String name) {

        if(url == null)
            return null;


        if(url.equals("custom4")){
            Random rand =new Random();
            if(rand.nextInt(5)+1==1)
                url="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDM2ODJiMDYyMDNiOWRlNGMyODU0MTA3MWEyNmNkYzM0MGRkMjVkNGMzNzJiNzAyM2VjMmY0MTIwMjFkNjJmNyJ9fX0";

            else if(rand.nextInt(5)+1==2)
                url="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjM3YzU4MTRhOTJmOGVjMGY2YWU5OTMzYWJlOTU0MmUxNjUxOTA3NjhlNzYwNDc4NTQzYWViZWVkNDAyN2MyNyJ9fX0";

            else if(rand.nextInt(5)+1==3)
                url="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzE5NmViOGQ1OTljNGZlZjUzYTk3MTc2YjcyZmY4ZmM0MWUzMmE2NmExNTlmZDQ1MTkwYTBkYTE1NDU4N2UxMiJ9fX0";

            else
                url="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWRhMTA4MjhmNjNiN2VjZGVmZDc2N2IzMjQ1ZmJkYWExM2MzZWMwYzZiMTM3NzRmMWVlOGQzMDdjMDM0YzM4MyJ9fX0";

        }

//     creates head

        ItemStack head = new ItemStack(Material.PLAYER_HEAD,1);
        if (url.isEmpty()) return head;

        UUID uuid=new UUID(-1975288126,203552561);

        SkullMeta skullMeta = (SkullMeta) head.getItemMeta();
        GameProfile profile = new GameProfile(uuid, null);

        profile.getProperties().put("textures", new Property("textures", url));

        try {
            Field mtd = skullMeta.getClass().getDeclaredField("profile");
            mtd.setAccessible(true);
            mtd.set(skullMeta, profile);
        } catch (IllegalAccessException | NoSuchFieldException ex) {
            ex.printStackTrace();
        }



        if(url.equals("custom1")){
            return new ItemStack(Material.ZOMBIE_HEAD);
        }
        if(url.equals("custom2")){
            return new ItemStack(Material.CREEPER_HEAD);
        }
        if(url.equals("custom3")){
            return new ItemStack(Material.SKELETON_SKULL);
        }


        skullMeta.setDisplayName(name);

        head.setItemMeta(skullMeta);

        return head;
    }
}
