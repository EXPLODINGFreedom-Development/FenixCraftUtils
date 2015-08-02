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
public class Command_fenixcraftutils extends BukkitCommand<FenixCraftUtils> {
public YamlConfig config;
    
    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(ChatColor.GREEN + "This Plugin is made by Alco_Rs11 for the FenixCraft All-OP Server.");
        sender.sendMessage(ChatColor.RED + "This plugin is version: " + plugin.getVersion());
        return true;
    }
    
}