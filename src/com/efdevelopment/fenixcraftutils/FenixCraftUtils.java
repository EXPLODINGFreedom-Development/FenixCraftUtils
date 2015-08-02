package com.efdevelopment.fenixcraftutils;

import com.efdevelopment.fenixcraftutils.commands.Command_adminrules;
import com.efdevelopment.fenixcraftutils.commands.Command_fenixcraftutils;
import com.efdevelopment.fenixcraftutils.commands.Command_griefreport;
import com.efdevelopment.fenixcraftutils.commands.Command_groupmanager;
import com.efdevelopment.fenixcraftutils.commands.Command_newbie;
import com.efdevelopment.fenixcraftutils.commands.Command_requesthelp;
import com.efdevelopment.fenixcraftutils.commands.Command_requestop;
import com.efdevelopment.fenixcraftutils.commands.Command_adminlist;
import com.efdevelopment.fenixcraftutils.listeners.joinListener;
import net.pravian.bukkitlib.BukkitLib;
import net.pravian.bukkitlib.command.BukkitCommandHandler;
import net.pravian.bukkitlib.config.YamlConfig;
import net.pravian.bukkitlib.implementation.BukkitPlugin;
import net.pravian.bukkitlib.util.LoggerUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class FenixCraftUtils extends BukkitPlugin {
    public static ChatColor CHAT_BOT;
    
    public FenixCraftUtils plugin;
    public YamlConfig config;
    public BukkitCommandHandler handler;
    
    @Override
    public void onLoad() {
        this.plugin = this;
        this.handler = new BukkitCommandHandler(plugin);
    }
    
    @Override
    public void onEnable() {
        BukkitLib.init(plugin);
        config = new YamlConfig(plugin, "config.yml", true);
        config.load();
        
        register(new joinListener());
        
        handler.setCommandLocation(Command_fenixcraftutils.class.getPackage());
        handler.setCommandLocation(Command_groupmanager.class.getPackage());
        handler.setCommandLocation(Command_adminlist.class.getPackage());
        handler.setCommandLocation(Command_adminrules.class.getPackage());
        handler.setCommandLocation(Command_newbie.class.getPackage());
        handler.setCommandLocation(Command_griefreport.class.getPackage());
        handler.setCommandLocation(Command_requestop.class.getPackage());
        handler.setCommandLocation(Command_requesthelp.class.getPackage());
                
        LoggerUtils.info(plugin, "for " + config.getString("server-name") + " Version: " + plugin.getVersion() + " by " + plugin.getAuthor() + " is enabled.");
  }
    
  @Override
  public void onDisable() {
     LoggerUtils.info(plugin, "for " + config.getString("server-name") + " Version: " + plugin.getVersion() + " by " + plugin.getAuthor() + " was disabled."); 
      
  }
  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
      return handler.handleCommand(sender, cmd, commandLabel, args); 
  }
  
}
