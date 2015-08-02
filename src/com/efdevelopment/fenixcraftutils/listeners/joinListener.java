package com.efdevelopment.fenixcraftutils.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class joinListener implements Listener {
    
    public Main plugin;
    
    @EventHandler
    public void OnJoin(PlayerJoinEvent event) {
       Player p = (Player) event.getPlayer();
       String name = p.getName();
       //If player has not joined before
       if(!p.hasPlayedBefore()){
           p.sendMessage(ChatColor.GREEN + "[CONSOLE : CONSOLE] Welcome to FenixCraft! Please read /rules and dont grief!");
       }else{
           p.sendMessage(ChatColor.LIGHT_PURPLE + "Hey there " + name + ", welcome back!");
           Bukkit.broadcastMessage(ChatColor.YELLOW + "Welcome back to FenixCraft, " + name);
       }
        
    }
}