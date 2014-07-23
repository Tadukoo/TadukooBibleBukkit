package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;

public class GiveBook {
	public static void givebook(TB plugin, CommandSender sender, String[] args,
			String bookName, String tran){
		String bookType = "give";
		String p = null;
		String part = "1";
		if(args.length < 2){
			sender.sendMessage(ChatColor.RED + "Not enough arguments!");
			sender.sendMessage(ChatColor.RED + "/bible givebook <player>");
			return;
		}else{
			p = args[1];
		}
		if(args.length >= 3){
			bookName = args[2];
			if(args.length >= 4){
				part = args[3];
				if(args.length >= 5){
					tran = args[4].toUpperCase();
					if(MainCommandExecutor.tranCheck(plugin, sender, tran) == null){
						return;
					}else{
						tran = MainCommandExecutor.tranCheck(plugin, sender, tran);
					}
				}
			}
		}
		Book.Run(plugin, sender, tran, bookName, part, bookType, p);
	}
}
