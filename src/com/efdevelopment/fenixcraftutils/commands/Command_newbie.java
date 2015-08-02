package com.efdevelopment.fenixcraftutils.commands;

import com.efdevelopment.fenixcraftutils.FenixCraftUtils;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



@CommandPermissions(source = SourceType.ANY)
public class Command_newbie extends BukkitCommand<FenixCraftUtils> {
    
    public boolean run(final CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Bukkit.broadcastMessage(ChatColor.GREEN + "[CONSOLE : CONSOLE] Remember to read the rules and not grief! Thank you and have fun!" );
        return true;
        
    }

}
