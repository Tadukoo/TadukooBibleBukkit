package com.gmail.lucario77777777.TBP.commands.KJV.John3rd;

import com.gmail.lucario77777777.TBP.commands.KJV.KJV;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJV3John extends KJV {
	public KJV3John(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args.length <= 3){
			KJV3JohnCh1.Run(sender, args);
			return true;
		}else if(args.length >=4){
			if(args[3].equals("1")){
				KJV3JohnCh1.Run(sender, args);
				return true;
			}else if(args[3].equals("?")){
				sender.sendMessage(ChatColor.GREEN + "3 John teaches about loving God and other people.");
				sender.sendMessage(ChatColor.GREEN + "It was written by the apostle John.");
				sender.sendMessage(ChatColor.GREEN + "It has 1 chapter.");
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, 3 John only has 1 chapter.");
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}