package com.gmail.lucario77777777.TBP.commands.KJV.John1st;

import com.gmail.lucario77777777.TBP.commands.KJV.KJV;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJV1John extends KJV {
	public KJV1John(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args.length <= 3){
			KJV1JohnCh1.Run(sender, args);
			return true;
		}else if(args.length >=4){
			if(args[3].equals("1")){
				KJV1JohnCh1.Run(sender, args);
				return true;
			}else if(args[3].equals("2")){
				KJV1JohnCh2.Run(sender, args);
				return true;
			}else if(args[3].equals("3")){
				KJV1JohnCh3.Run(sender, args);
				return true;
			}else if(args[3].equals("4")){
				KJV1JohnCh4.Run(sender, args);
				return true;
			}else if(args[3].equals("5")){
				KJV1JohnCh5.Run(sender, args);
				return true;
			}else if(args[3].equals("?")){
				sender.sendMessage(ChatColor.GREEN + "1 John teaches about how to discern true teachers.");
				sender.sendMessage(ChatColor.GREEN + "It was written by the apostle John.");
				sender.sendMessage(ChatColor.GREEN + "It has 5 chapters.");
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, 1 John only has 5 chapters.");
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}