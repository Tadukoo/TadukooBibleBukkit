package com.gmail.lucario77777777.TBP.commands.KJV.Exodus;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;
import com.gmail.lucario77777777.TBP.commands.KJV.KJV;

public class KJVExodus extends KJV{
	public KJVExodus(Main plugin){
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args){
		if(args.length <= 2){
			KJVExodusCh1.Run(sender, args);
			return true;
		}else if(args.length >=3){
			if(args[2].equals("1")){
				KJVExodusCh1.Run(sender, args);
				return true;
			}else if(args[2].equals("2")){
				KJVExodusCh2.Run(sender, args);
				return true;
			}else if(args[2].equals("?")){
				sender.sendMessage(ChatColor.GREEN + "Exodus tells about the Exodus from Egypt up to the laws" +
						" given to the Israelites by God.");
				sender.sendMessage(ChatColor.GREEN + "It was written by Moses.");
				sender.sendMessage(ChatColor.GREEN + "It has 40 chapters.");
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Exodus Chapter " + args[2] + " yet.");
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}