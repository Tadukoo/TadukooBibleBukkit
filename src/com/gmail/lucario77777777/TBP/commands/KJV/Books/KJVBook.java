package com.gmail.lucario77777777.TBP.commands.KJV.Books;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;
import com.gmail.lucario77777777.TBP.commands.MainCommandExecutor;

public class KJVBook extends MainCommandExecutor {
	public KJVBook(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args, String playerType, Main plugin)
	{
		if(playerType != "player"){
			sender.sendMessage(ChatColor.RED + "You must be a player!");
			return true;
		}else{
			if(args.length <= 2){
				KJVBookGenesis.Run(sender, args, plugin);
				return true;
			}else if(args.length >= 3){
				if(args[2].equalsIgnoreCase("Genesis") || args[2].equalsIgnoreCase("gen")){
					KJVBookGenesis.Run(sender, args, plugin);
					return true;
				}else{
					sender.sendMessage(ChatColor.RED + "Sorry, we don't have that book yet in KJV");
					return true;
				}
			}else{
				sender.sendMessage(ChatColor.RED + "An error occured.");
				return true;
			}
	}
}
}