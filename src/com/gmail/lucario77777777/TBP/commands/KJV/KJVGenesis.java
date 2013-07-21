package com.gmail.lucario77777777.TBP.commands.KJV;

import com.gmail.lucario77777777.TBP.commands.KJV.KJV;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJVGenesis extends KJV {
	public KJVGenesis(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args[2] == "1" || args[2] == null){
			KJVGenesisCh1.Run(sender, args);
			return true;
		}else{
			sender.sendMessage(ChatColor.RED + "Sorry, we don't have Genesis Chapter " + args[2] + " yet.");
			return true;
		}
	}
}