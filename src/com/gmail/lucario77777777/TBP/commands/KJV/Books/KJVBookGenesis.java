package com.gmail.lucario77777777.TBP.commands.KJV.Books;

import com.gmail.lucario77777777.TBP.commands.KJV.Books.KJVBook;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJVBookGenesis extends KJVBook {
	public KJVBookGenesis(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args.length <= 3){
			KJVBookGenesis1.Run(sender, args);
			return true;
		}else if(args.length >=4){
			if(args[3].equals("1")){
				KJVBookGenesis1.Run(sender, args);
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Genesis Chapter " + args[3] + " in KJV yet.");
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}