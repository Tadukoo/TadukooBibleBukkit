package com.gmail.lucario77777777.TBP.commands.KJV.Genesis;

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
		if(args.length <= 2){
			KJVGenesisCh1.Run(sender, args);
			return true;
		}else if(args.length >=3){
			if(args[2].equals("1")){
				KJVGenesisCh1.Run(sender, args);
				return true;
			}else if(args[2].equals("2")){
				KJVGenesisCh2.Run(sender, args);
				return true;
			}else if(args[2].equals("3")){
				KJVGenesisCh3.Run(sender, args);
				return true;
			}else if(args[2].equals("4")){
				KJVGenesisCh4.Run(sender, args);
				return true;
			}else if(args[2].equals("5")){
				KJVGenesisCh5.Run(sender, args);
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Genesis Chapter " + args[2] + " yet.");
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}