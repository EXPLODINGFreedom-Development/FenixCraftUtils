package com.efdevelopment.fenixcraftutils.commands;

import com.efdevelopment.fenixcraftutils.FenixCraftUtils;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import net.pravian.bukkitlib.util.LoggerUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandPermissions(source = SourceType.ANY)
public class Command_requestop extends BukkitCommand<FenixCraftUtils> {

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Bukkit.broadcastMessage(ChatColor.AQUA + sender.getName() + " Requests that someone OPs them.");
        LoggerUtils.info(sender.getName() + " requested op.");
        return true;
    }
    
}
