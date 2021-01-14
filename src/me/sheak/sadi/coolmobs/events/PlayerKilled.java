package me.sheak.sadi.coolmobs.events;

import me.sheak.sadi.coolmobs.playerhead.PlayerHead;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerKilled implements Listener {
    @EventHandler
    public void onkilled(PlayerDeathEvent e){
        Player p =e.getEntity();
        if(p.isDead()){
            Player p1= p.getKiller();
            if (p1 != null){
                new PlayerHead(p,p1);
            }
        }

    }

}
