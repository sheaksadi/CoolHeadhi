package me.sheak.sadi.coolmobs.playerhead;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import java.util.ArrayList;
import java.util.List;

public class PlayerHead {
    public PlayerHead (Player player,Player killer){
        ItemStack item = new ItemStack(Material.PLAYER_HEAD, 1 );
        SkullMeta meta = (SkullMeta) item.getItemMeta();

        meta.setOwningPlayer(player);
        if(player.getName().equalsIgnoreCase("sheaksadi"))
            meta.setDisplayName(ChatColor.BLUE+""+ChatColor.BOLD+""+ player.getDisplayName() + "'s Head");
        else
            meta.setDisplayName(player.getDisplayName() + "'s Head");

        List<String> lore = new ArrayList<>();
        //esteregg code
        if(killer.getName().equalsIgnoreCase("sheaksadi"))
            lore.add(ChatColor.BOLD+""+ ChatColor.DARK_PURPLE+ "killed by The Great SheakSadi");
        else
            lore.add(ChatColor.GRAY+ "killed by "+killer.getDisplayName());

        meta.setLore(lore);
        item.setItemMeta(meta);
        player.getWorld().dropItemNaturally(player.getLocation(),item);
    }
}


