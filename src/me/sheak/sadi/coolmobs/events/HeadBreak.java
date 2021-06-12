package me.sheak.sadi.coolmobs.events;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import me.sheak.sadi.coolmobs.mobhead.MobType;
import net.minecraft.core.BlockPosition;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.level.block.entity.TileEntity;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import java.lang.reflect.Field;
import java.util.UUID;


public class HeadBreak implements Listener {
    @EventHandler
    public void on_break(BlockBreakEvent e){
        Block block= e.getBlock();
        if (block.getType()== Material.PLAYER_HEAD){
            int x=e.getBlock().getLocation().getBlockX();
            int y=e.getBlock().getLocation().getBlockY();
            int z=e.getBlock().getLocation().getBlockZ();

            //getting url from block (head)
            CraftWorld ws = (CraftWorld) e.getBlock().getLocation().getWorld();
            NBTTagCompound ntc;
            BlockPosition bp =new BlockPosition(x,y,z);
            TileEntity te = ws.getHandle().getTileEntity(bp);
            if (te != null)
            {
                ntc = new NBTTagCompound();
                te.save(ntc);
                String blockntb=ntc.toString();
                String[] s =blockntb.split("\"",3);
                String url =s[1];


                MobType mobType =new MobType();

                String name = mobType.rsortmob(url);

                if(name==null)
                    return;

                e.setDropItems(false);

                ItemStack head =getCustomSkull(url,name);


                block.getLocation().getWorld().dropItemNaturally(block.getLocation(),head);

            }
        }
    }

    public ItemStack getCustomSkull(String url, String name) {

        if(url == null)
            return null;


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

        skullMeta.setDisplayName(name);

        head.setItemMeta(skullMeta);


        return head;
    }
}


