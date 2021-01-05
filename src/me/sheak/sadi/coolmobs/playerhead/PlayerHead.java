package me.sheak.sadi.coolmobs.playerhead;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;


import java.util.ArrayList;
import java.util.List;

public class PlayerHead {
    public PlayerHead (Player p1,Player p2){
        ItemStack item = new ItemStack(Material.PLAYER_HEAD, 1 );
        SkullMeta meta = (SkullMeta) item.getItemMeta();
        meta.setOwningPlayer(p1);
        if(p1.getName().equalsIgnoreCase("sheaksadi"))
            meta.setDisplayName(ChatColor.BLUE+""+ChatColor.BOLD+""+ p1.getDisplayName() + "'s Head");
        else
            meta.setDisplayName(p1.getDisplayName() + "'s Head");

        List<String> lore = new ArrayList<String>();
        //esteregg code
        if(p2.getName().equalsIgnoreCase("sheaksadi"))
            lore.add(ChatColor.BOLD+""+ ChatColor.DARK_PURPLE+ "killed by The Great SheakSadi");
        else
            lore.add(ChatColor.GRAY+ "killed by "+p2.getDisplayName());

        meta.setLore(lore);
        item.setItemMeta(meta);
        p1.getWorld().dropItemNaturally(p1.getLocation(),item);
    }
}
