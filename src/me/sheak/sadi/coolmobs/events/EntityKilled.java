package me.sheak.sadi.coolmobs.events;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import me.sheak.sadi.coolmobs.mobhead.Mob;
import org.bukkit.Material;
import org.bukkit.block.Skull;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;

public class EntityKilled implements Listener {
    @EventHandler
    public void onkilled(EntityDeathEvent e){

        Entity entity =e.getEntity();

        LivingEntity ett = e.getEntity();

        if(!(ett.getKiller() instanceof  Player)){
            return;
        }

        Mob m =new Mob();
        String url= m.sortmob(e.getEntityType(),e.getEntity()) ;
        ItemStack item = getCustomSkull(url,e.getEntityType().toString().toLowerCase().substring(0, 1).toUpperCase() + e.getEntityType().toString().toLowerCase().substring(1)  +" head",e.getEntityType(),entity);

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

        ItemStack head = new ItemStack(Material.PLAYER_HEAD,1);
        if (url.isEmpty()) return head;

        SkullMeta skullMeta = (SkullMeta) head.getItemMeta();
        GameProfile profile = new GameProfile(UUID.randomUUID(), null);

        profile.getProperties().put("textures", new Property("textures", url));

        try {
            Method mtd = skullMeta.getClass().getDeclaredMethod("setProfile", GameProfile.class);
            mtd.setAccessible(true);
            mtd.invoke(skullMeta, profile);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
            ex.printStackTrace();
        }

        if (entity == EntityType.VILLAGER){
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
        if(entity == EntityType.SHEEP){
        Sheep sheep=(Sheep)ett;
        name=sheep.getColor().name().toLowerCase().substring(0, 1).toUpperCase() +sheep.getColor().name().toLowerCase().substring(1)+"Sheep Head";
            ;

        }


        skullMeta.setDisplayName(name);
        skullMeta.setLocalizedName(name);

        head.setItemMeta(skullMeta);




        return head;
    }
}