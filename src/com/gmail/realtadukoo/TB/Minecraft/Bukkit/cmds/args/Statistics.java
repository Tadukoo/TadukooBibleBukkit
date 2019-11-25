package com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.args;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.realtadukoo.TB.Minecraft.Bukkit.TB;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.Enums.EnumStats;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.Records;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.handling.Args;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.handling.Checks;

public class Statistics{
	public static void run(TB plugin, CommandSender sender, String[] args, String playerType,
			boolean permsOn){
		if(Args.argsLengthCheck(sender, args, 1, 3, "/bible statistics [player|top] "
				+ "[statistic]")){
			return;
		}
		if(!Checks.permCheck(playerType, plugin, sender, "Bible", "statistics.use", permsOn)){
			sender.sendMessage(ChatColor.RED + "Sorry, you don't have permission: ");
			sender.sendMessage(ChatColor.RED + "TadukooBible.statistics.use");
			return;
		}
		if(args.length == 1){
			Records.listStatistics(plugin, (Player) sender);
		}else{
			EnumStats stats = EnumStats.VERSESREQUESTED;
			if(args[1].equalsIgnoreCase("top")){
				if(Checks.permCheck(playerType, plugin, sender, "Bible", "statistics.top", 
						permsOn)){
					if(Args.argsLengthCheck(sender, args, 2, 3, 
							"/bible statistics top [statistic]")){
						return;
					}
					if(stats.fromString(args[2]) != null){
						Records.listTopStatistic(plugin, sender, 
								stats.fromString(args[2]).getStatistic());
					}
				}else{
					sender.sendMessage(ChatColor.RED + "Sorry, you don't have permission: ");
					sender.sendMessage(ChatColor.RED + "TadukooBible.statistics.top");
				}
			}else if(stats.fromString(args[1]) != null){
				Records.listOneStatistic(plugin, (Player) sender, 
						stats.fromString(args[1]).getStatistic());
			}else{
				if(!Checks.permCheck(playerType, plugin, sender, "Bible", "statistics.others", 
						permsOn)){
					sender.sendMessage(ChatColor.RED + "Sorry, you don't have permission: ");
					sender.sendMessage(ChatColor.RED + "TadukooBible.statistics.others");
					return;
				}
				// TODO: Have it check for a Player's name and that the given Player has 
				// permission to check this player's statistics.
			}
		}
	}
}
