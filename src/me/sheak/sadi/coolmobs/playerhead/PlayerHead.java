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

        ItemStack material=killer.getInventory().getItemInMainHand();
        char[] sort= material.getType().toString().toCharArray();
        StringBuilder builder=new StringBuilder();
        boolean upperCase = true;
        builder.append('[');
        for(char s:sort){
            if(s == '_') {
                upperCase = true;
                builder.append(' ');
                continue;
            }
            if(upperCase) {
                builder.append(Character.toUpperCase( s));
                upperCase = false;
            }
            else
            builder.append(Character.toLowerCase(s));

        }
        builder.append(']');
        String killedItem=builder.toString();

        if(player.getPlayer().getUniqueId().toString().equals("066d9c4e-18c5-4e68-924d-28139d18c07a")) {
            meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "" + player.getDisplayName() + "'s Head");
        }
        else {
            meta.setDisplayName(ChatColor.YELLOW+""+ player.getDisplayName() + "'s Head");


        }
        List<String> lore = new ArrayList<>();
        //esteregg code
        try {
            if (killer.getInventory().getItemInMainHand().getItemMeta().hasDisplayName()) {
                killedItem = "[" + killer.getInventory().getItemInMainHand().getItemMeta().getDisplayName() + "]";
            }
        }catch (Exception e){
            killedItem ="Fist";
        }


        if(killer.getPlayer().getUniqueId().toString().equals("066d9c4e-18c5-4e68-924d-28139d18c07a")){
            lore.add(ChatColor.BOLD+""+ ChatColor.DARK_PURPLE+ "killed by The Great SheakSadi");

            if(killedItem.equalsIgnoreCase("Fist"))
                lore.add(ChatColor.BOLD+""+ ChatColor.DARK_PURPLE+ "With Fist" );
            else
                lore.add(ChatColor.BOLD+""+ ChatColor.DARK_PURPLE+ "Using " +ChatColor.AQUA+killedItem);

        }

        else {
            lore.add(ChatColor.GRAY + "killed by " + killer.getDisplayName());
            if(killedItem.equalsIgnoreCase("Fist"))
                lore.add(ChatColor.GRAY+ "With Fist" );
            else
                lore.add(ChatColor.GRAY + "Using "+ChatColor.AQUA + killedItem);
        }

        meta.setLore(lore);
        item.setItemMeta(meta);
        player.getWorld().dropItemNaturally(player.getLocation(),item);
    }
}


