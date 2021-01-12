package me.sheak.sadi.coolmobs.events;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import de.leonhard.storage.Yaml;
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
import java.security.PublicKey;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public class EntityKilled implements Listener {
    Main plugin;

    public EntityKilled (Main instance){
        plugin=instance;
    }

    public String getname(String url){


        for (String key : plugin.getConfig().getConfigurationSection("Mobtags").getKeys(false)) {
            for (String key1 : plugin.getConfig().getConfigurationSection("Mobtags."+key).getKeys(false)) {
                if (plugin.getConfig().getString("Mobtags." + key).equalsIgnoreCase("url")) {
                    if (plugin.getConfig().getString("Mobtags." + key + "." + key1).equalsIgnoreCase(url)) {
                        return plugin.getConfig().getString("Mobtags."+key+".name");
                    }
                }

            }
        }


        return null;
    }
    public String geturl(EntityType entityType){

        return null;
    }





    @EventHandler
    public void onkilled(EntityDeathEvent e){
       // plugin.saveDefaultConfig();

        Entity entity =e.getEntity();

        LivingEntity ett = e.getEntity();



        if(!(ett.getKiller() instanceof  Player)){
            return;
        }
       // AtomicBoolean xo = new AtomicBoolean(false);


        for (String key : plugin.getConfig().getConfigurationSection("Droppercent.Mobs").getKeys(false)) {
            if (key.equalsIgnoreCase(e.getEntityType().toString())) {
                Double percent = Double.valueOf(0);
                percent = Double.parseDouble(plugin.getConfig().getString("Droppercent.Mobs." + key));


                Random random = new Random();


                int a = (int) (1 / percent);
                int b = random.nextInt(a) + 1;
                //testing code
                ett.getKiller().sendMessage(a + "  d  " + percent + "  " + b);


                if (b != 1) {
                    plugin.saveDefaultConfig();
                   // return;

                }

            }
        }


        // if(xo.get() ==true)
          //return;


        MobType mobType=new MobType();


      //  Yaml yaml =new Yaml("mobs","plugins/CoolHeads");


      //  ett.getKiller().sendMessage(yaml.getOrDefault("dad","y"));


        Mob m =new Mob();
        String url= m.sortmob(e.getEntityType(),e.getEntity()) ;
        //String name=mobType.rsortmob(url);
        ett.getKiller().sendMessage("s");
        String name=getname(url);
        ett.getKiller().sendMessage(name);

        ItemStack item = getCustomSkull(url,name,e.getEntityType(),entity);

        if (item==null)
            return;

        SkullMeta meta = (SkullMeta) item.getItemMeta();
/*
        if(e.getEntityType().toString()=="ZOMBIE"){
            ItemStack it =new ItemStack(Material.SKELETON_SKULL);
            entity.getWorld().dropItemNaturally(entity.getLocation(),it);
            ett.getKiller().sendMessage("k");
            return ;
        }
        if(e.getEntityType()==EntityType.CREEPER){
            ItemStack it =new ItemStack(Material.SKELETON_SKULL);
            entity.getWorld().dropItemNaturally(entity.getLocation(),it);
            ett.getKiller().sendMessage("k");
            return ;
        }
        if(e.getEntityType().equals(EntityType.SKELETON) ){
            ItemStack it =new ItemStack(Material.SKELETON_SKULL);
            entity.getWorld().dropItemNaturally(entity.getLocation(),it);
            ett.getKiller().sendMessage("k");
            return ;
        }
*/


        entity.getWorld().dropItemNaturally(entity.getLocation(),item);

    }
    public ItemStack getCustomSkull(String url, String name, EntityType entity,Entity ett) {

        if(url == null)
            return null;
        //String name = type;
        if(url=="custom4"){
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




        if(url=="costom1"){
            ItemStack it =new ItemStack(Material.ZOMBIE_HEAD);
            return it;
        }
        if(url=="costom2"){
            ItemStack it =new ItemStack(Material.CREEPER_HEAD);
            return it;
        }
        if(url=="costom3"){
            ItemStack it =new ItemStack(Material.SKELETON_SKULL);
            return it;
        }

        /*   if (entity == EntityType.VILLAGER){
            Villager villager=(Villager) ett;
            name= villager.getProfession().toString().toLowerCase().substring(0, 1).toUpperCase() +villager.getProfession().toString().toLowerCase().substring(1)+"'s Head";

            if(villager.getProfession().toString()=="NONE")
                name = "Unemployed Villeger head";
        }
        if(url=="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTZiNzRlMDUyYjc0Mjg4Nzk5YmE2ZDlmMzVjNWQwMjIxY2Y4YjA0MzMxNTQ3ZWMyZjY4ZDczNTk3YWUyYzliIn19fQ")
            name="Angry Pollinated Bee Head";

        if(url=="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTQwMDIyM2YxZmE1NDc0MWQ0MjFkN2U4MDQ2NDA5ZDVmM2UxNWM3ZjQzNjRiMWI3Mzk5NDAyMDhmM2I2ODZkNCJ9fX0")
            name="Angry Bee Head";

        if(url=="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjcyN2QwYWIwM2Y1Y2QwMjJmODcwNWQzZjdmMTMzY2E0OTIwZWFlOGUxZTQ3YjUwNzQ0MzNhMTM3ZTY5MWU0ZSJ9fX0")
            name="Pollinated Bee Head";

        if(entity == EntityType.SHEEP){
        Sheep sheep=(Sheep)ett;
        name=sheep.getColor().name().toLowerCase().substring(0, 1).toUpperCase() +sheep.getColor().name().toLowerCase().substring(1)+" Sheep Head";
        }
        if(url=="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjMzMzI2NzY1YTE5MGViZjkwZDU0ODZkNzFmMjBlMjU5N2U0YmVlMmEzOTFmZWNiYmQ4MGRlYmZlMWY4MmQ3OCJ9fX0")
            name="Jeb_  Head";
        if(entity==EntityType.CAT){
            Cat cat=(Cat)ett;
            name=cat.getCatType().toString().toLowerCase().substring(0, 1).toUpperCase() +cat.getCatType().toString().toLowerCase().substring(1)+"Cat Head";
        }
        if(url=="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGZkMTBjOGU3NWY2NzM5OGM0NzU4N2QyNWZjMTQ2ZjMxMWMwNTNjYzVkMGFlYWI4NzkwYmNlMzZlZTg4ZjVmOCJ9fX0")
            name="Tuxedo Cat Head";

        if(url=="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjExM2RiZDNjNmEwNzhhMTdiNGVkYjc4Y2UwN2Q4MzZjMzhkYWNlNTAyN2Q0YjBhODNmZDYwZTdjYTdhMGZjYiJ9fX0")
            name="Ginger Cat Head";

        if(entity==EntityType.HORSE){
            Horse horse=(Horse)ett;
            name=horse.getColor().name().toLowerCase().substring(0, 1).toUpperCase() +horse.getColor().name().toLowerCase().substring(1)+" Horse Head";

        }

        if(url=="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDE0MzYzNzdlYjRjNGI0ZTM5ZmIwZTFlZDg4OTlmYjYxZWUxODE0YTkxNjliOGQwODcyOWVmMDFkYzg1ZDFiYSJ9fX0")
            name="Arctic Fox Head";

        if(url=="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2U2NDY2MzAyYTVhYjQzOThiNGU0NzczNDk4MDhlNWQ5NDAyZWEzYWQ4ZmM0MmUyNDQ2ZTRiZWQwYTVlZDVlIn19fQ")
            name="Brown Mushroom_cow Head";

        if(entity==EntityType.PANDA){
            Panda panda =(Panda)ett;
            name=panda.getMainGene().toString() .toLowerCase().substring(0, 1).toUpperCase() +panda.getMainGene().toString() .toLowerCase().substring(1)+" Panda Head";

        }
        if(url=="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTlkZjQ3ZTAxNWQ1YzFjNjhkNzJiZTExYmI2NTYzODBmYzZkYjUzM2FhYjM4OTQxYTkxYjFkM2Q1ZTM5NjQ5NyJ9fX0")
            name="Panda Head";

        if(entity==EntityType.PARROT){
            Parrot parrot=(Parrot)ett;
            name=parrot.getVariant().toString() .toLowerCase().substring(0, 1).toUpperCase() +parrot.getVariant().toString() .toLowerCase().substring(1)+" Parrot Head";

        }
        if(entity==EntityType.RABBIT){
            Rabbit rabbit =(Rabbit)ett;
            name=rabbit.getRabbitType().toString() .toLowerCase().substring(0, 1).toUpperCase() +rabbit.getRabbitType().toString() .toLowerCase().substring(1)+" Rabbit Head";

        }

        if(entity == EntityType.TRADER_LLAMA){
            TraderLlama traderLlama=(TraderLlama) ett;
            name=traderLlama.getColor().name().toLowerCase().substring(0, 1).toUpperCase() +traderLlama.getColor().name().toLowerCase().substring(1)+" Trader Llama Head";
        }

        if (entity == EntityType.ZOMBIE_VILLAGER){
            ZombieVillager zvillager=(ZombieVillager) ett;
            name= zvillager.getVillagerProfession().toString().toLowerCase().substring(0, 1).toUpperCase() +zvillager.getVillagerProfession().toString().toLowerCase().substring(1)+" Zombie Villager Head";

            if(zvillager.getVillagerProfession().toString()=="NONE")
                name = "Unemployed Villeger head";
        }
        if(url=="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzE5NmViOGQ1OTljNGZlZjUzYTk3MTc2YjcyZmY4ZmM0MWUzMmE2NmExNTlmZDQ1MTkwYTBkYTE1NDU4N2UxMiJ9fX0")
            name="Invulnerable Wither Head";

        if(url=="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjM3YzU4MTRhOTJmOGVjMGY2YWU5OTMzYWJlOTU0MmUxNjUxOTA3NjhlNzYwNDc4NTQzYWViZWVkNDAyN2MyNyJ9fX0")
            name="Armored Wither Head";

        if(url=="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDM2ODJiMDYyMDNiOWRlNGMyODU0MTA3MWEyNmNkYzM0MGRkMjVkNGMzNzJiNzAyM2VjMmY0MTIwMjFkNjJmNyJ9fX0")
            name="Armored Invulnerable Wither Head";

        if(url=="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGQxYWE3ZTNiOTU2NGIzODQ2ZjFkZWExNGYxYjFjY2JmMzk5YmJiMjNiOTUyZGJkN2VlYzQxODAyYTI4OWM5NiJ9fX0")
            name="Angry Wolf Head";
        if(url=="eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjcxMzA4NWE1NzUyN2U0NTQ1OWMzOGZhYTdiYjkxY2FiYjM4MWRmMzFjZjJiZjc5ZDY3YTA3MTU2YjZjMjMwOSJ9fX0")
             name="Shivering Strider Head"; */




        //String finalName =name.replace("_"," ");

        skullMeta.setDisplayName(name);
        skullMeta.setLocalizedName(name);




        head.setItemMeta(skullMeta);






        //ItemStack itemStack=CraftItemStack.asBukkitCopy(stack) ;

        return head;
    }
}
