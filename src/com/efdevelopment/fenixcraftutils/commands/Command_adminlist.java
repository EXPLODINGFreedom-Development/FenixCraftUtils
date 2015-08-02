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
public class Command_adminlist extends BukkitCommand<FenixCraftUtils> {
public YamlConfig config;
    
    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(ChatColor.RED + "§e---- §6Admins §e----");
        sender.sendMessage(ChatColor.GRAY + "§8- Former Admins:");
        sender.sendMessage(ChatColor.RED + "§f -");
        sender.sendMessage(ChatColor.AQUA + "§e- Admins:");
        sender.sendMessage(ChatColor.RED + "§f - §6Alco_Rs11, Kinaru"); 
        sender.sendMessage(ChatColor.DARK_GREEN + "§b- Super Admins:");
        sender.sendMessage(ChatColor.RED + "§f - §6"); 
        sender.sendMessage(ChatColor.LIGHT_PURPLE + "§d- Senior Admins:");
        sender.sendMessage(ChatColor.RED + "§f - §6");
        sender.sendMessage(ChatColor.BLUE + "§6- Executives:");
        sender.sendMessage(ChatColor.RED + "§f - §6");
        sender.sendMessage(ChatColor.BLUE + "§a- Specialists:");
        sender.sendMessage(ChatColor.RED + "§f - §6");
        sender.sendMessage(ChatColor.DARK_RED + "§5- System-Admins:");
        sender.sendMessage(ChatColor.RED + "§f- §6");
        sender.sendMessage(ChatColor.DARK_RED + "§4- Owners:");
        sender.sendMessage(ChatColor.RED + "§f - §6NL_Fenix_NL");
        return true;
        
          }
    {
       }

    }
 

