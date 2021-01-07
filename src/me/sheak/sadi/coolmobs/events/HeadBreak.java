package me.sheak.sadi.coolmobs.events;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.datafixers.types.templates.List;
import me.sheak.sadi.coolmobs.mobhead.MobType;
import net.minecraft.server.v1_16_R3.BlockPosition;
import net.minecraft.server.v1_16_R3.NBTTagCompound;
import net.minecraft.server.v1_16_R3.TileEntity;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_16_R3.block.CraftBlock;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockDataMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Random;
import java.util.UUID;

public class HeadBreak implements Listener {
    @EventHandler
    public void onbreak(BlockBreakEvent e){
        Block block= e.getBlock();
        if (block.getType()== Material.PLAYER_HEAD){
            int x=e.getBlock().getLocation().getBlockX();
            int y=e.getBlock().getLocation().getBlockY();
            int z=e.getBlock().getLocation().getBlockZ();

            CraftWorld ws = (CraftWorld) e.getBlock().getLocation().getWorld(); //W is your normal bukkit world . . . I'm using player.getWorld()
            NBTTagCompound ntc = null;
            BlockPosition bp =new BlockPosition(x,y,z);
            TileEntity te = ws.getHandle().getTileEntity(bp);
            if (te != null)
            {
                ntc = new NBTTagCompound();
                te.save(ntc);
               // e.getPlayer().sendMessage(ntc.toString());
                String blockntb=ntc.toString();
                String[] s =blockntb.split("\"",3);
                String url =s[1];
                //Collection<ItemStack> itemStacks=block.getDrops();
               // ItemStack item=itemStacks.iterator().next();

                MobType mobType =new MobType();

                String name = mobType.rsortmob(url);

                if(name==null)
                    return;

                //ItemMeta meta =item.getItemMeta();

               // meta.setDisplayName(name);

                //item.setItemMeta(meta);

                e.setDropItems(false);

                    ItemStack head =getCustomSkull(url,name);




                block.getLocation().getWorld().dropItemNaturally(block.getLocation(),head);



            }


        }
    }



    public ItemStack getCustomSkull(String url, String name) {

        if(url == null)
            return null;
        //String name = type;


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






        String finalName =name.replace("_"," ");

        skullMeta.setDisplayName(finalName);
        skullMeta.setLocalizedName(finalName);




        head.setItemMeta(skullMeta);






        //ItemStack itemStack=CraftItemStack.asBukkitCopy(stack) ;

        return head;
    }
}


