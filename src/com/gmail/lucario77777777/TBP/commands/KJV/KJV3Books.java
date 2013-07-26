package com.gmail.lucario77777777.TBP.commands.KJV;

import com.gmail.lucario77777777.TBP.commands.KJV.KJV;
import com.gmail.lucario77777777.TBP.commands.KJV.John3rd.KJV3John;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJV3Books extends KJV {
	public KJV3Books(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args.length <= 2){
			sender.sendMessage(ChatColor.RED + "There is no book titled 3!");
			return true;
		}else if(args.length >=3){
			if(args[2].equalsIgnoreCase("John")){
				KJV3John.Run(sender, args);
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, there is no 3 " + args[2] + ".");
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}