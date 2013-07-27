package com.gmail.lucario77777777.TBP.commands.KJV;

import com.gmail.lucario77777777.TBP.commands.KJV.KJV;
import com.gmail.lucario77777777.TBP.commands.KJV.John2nd.KJV2John;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJV2Books extends KJV {
	public KJV2Books(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args.length <= 2){
			sender.sendMessage(ChatColor.RED + "There is no book titled 2!");
			return true;
		}else if(args.length >=3){
			if(args[2].equalsIgnoreCase("Samuel") || args[2].equalsIgnoreCase("Sam")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have 2 Samuel yet.");
				return true;
			}else if(args[2].equalsIgnoreCase("Kings")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have 2 Kings yet.");
				return true;
			}else if(args[2].equalsIgnoreCase("Chronicles") || args[2].equalsIgnoreCase("Chr")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have 2 Chronicles yet.");
				return true;
			}else if(args[2].equalsIgnoreCase("Corinthians") || args[2].equalsIgnoreCase("Cor")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have 2 Corinthians yet.");
				return true;
			}else if(args[2].equalsIgnoreCase("Thessalonians") || args[2].equalsIgnoreCase("Thes")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have 2 Thessalonians yet.");
				return true;
			}else if(args[2].equalsIgnoreCase("Timothy") || args[2].equalsIgnoreCase("Tim")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have 2 Timothy yet.");
				return true;
			}else if(args[2].equalsIgnoreCase("Peter")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have 2 Peter yet.");
				return true;
			}else if(args[2].equalsIgnoreCase("John")){
				KJV2John.Run(sender, args);
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, there is no 2 " + args[2] + ".");
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}