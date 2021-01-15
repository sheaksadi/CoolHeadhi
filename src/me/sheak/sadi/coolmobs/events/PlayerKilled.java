package me.sheak.sadi.coolmobs.events;

import me.sheak.sadi.coolmobs.playerhead.PlayerHead;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerKilled implements Listener {
    @EventHandler
    public void onkilled(PlayerDeathEvent e){
        Player player =e.getEntity();
        if(player.isDead()){
            Player killer= player.getKiller();
            if (killer != null){
                new PlayerHead(player,killer);
            }
        }

    }

}
