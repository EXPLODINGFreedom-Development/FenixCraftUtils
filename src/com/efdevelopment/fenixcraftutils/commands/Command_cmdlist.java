package com.efdevelopment.fenixcraftutils.commands;

import com.efdevelopment.fenixcraftutils.FenixCraftUtils;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import net.pravian.bukkitlib.config.YamlConfig;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandPermissions(source = SourceType.ANY)
public class Command_cmdlist extends BukkitCommand<FenixCraftUtils> {
public YamlConfig config;
    
    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(ChatColor.RED + "§e---- §6Command Help §e----");
        sender.sendMessage(ChatColor.GRAY + "§6/adminlist§f: Displays a list of all the admins and their ranks.");
        sender.sendMessage(ChatColor.GRAY + "§6/adminrules§f: Displays a list of all the administrator rules.");
        sender.sendMessage(ChatColor.GRAY + "§6/cmdlist§f: Displays a list of all the FenixCraftUtilities Commands.");
        sender.sendMessage(ChatColor.GRAY + "§6/fenixcraftutils§f: Shows basic informaton about the plugin.");
        sender.sendMessage(ChatColor.GRAY + "§6/griefreport§f: Alert Admins that you found grief.");
        sender.sendMessage(ChatColor.GRAY + "§6/goupmanager§f: Fool the stupid ones. Alias: /permissionsex");
        sender.sendMessage(ChatColor.GRAY + "§6/requestop§f: Tell others that you need OP.");
        
        return true;
        
          }
    {
       }

    }
 
