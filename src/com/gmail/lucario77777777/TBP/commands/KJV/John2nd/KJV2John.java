package com.gmail.lucario77777777.TBP.commands.KJV.John2nd;

import com.gmail.lucario77777777.TBP.commands.KJV.KJV;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJV2John extends KJV {
	public KJV2John(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args.length <= 2){
			KJV2JohnCh1.Run(sender, args);
			return true;
		}else if(args.length >=3){
			if(args[2].equals("1")){
				KJV2JohnCh1.Run(sender, args);
				return true;
			}else if(args[2].equals("?")){
				sender.sendMessage(ChatColor.GREEN + "2 John teaches about focusing on Jesus Christ.");
				sender.sendMessage(ChatColor.GREEN + "It was written by the apostle John.");
				sender.sendMessage(ChatColor.GREEN + "It has 1 chapter.");
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, 2 John only has 1 chapter.");
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}