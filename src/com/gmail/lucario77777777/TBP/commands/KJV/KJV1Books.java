package com.gmail.lucario77777777.TBP.commands.KJV;

import com.gmail.lucario77777777.TBP.commands.KJV.KJV;
import com.gmail.lucario77777777.TBP.commands.KJV.John1st.KJV1John;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJV1Books extends KJV {
	public KJV1Books(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args.length <= 2){
			sender.sendMessage(ChatColor.RED + "There is no book titled 1!");
			return true;
		}else if(args.length >=3){
			if(args[2].equalsIgnoreCase("Samuel")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have 1 Samuel yet.");
				return true;
			}else if(args[2].equalsIgnoreCase("Kings")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have 1 Kings yet.");
				return true;
			}else if(args[2].equalsIgnoreCase("Chronicles")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have 1 Chronicles yet.");
				return true;
			}else if(args[2].equalsIgnoreCase("Corinthians")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have 1 Corinthians yet.");
				return true;
			}else if(args[2].equalsIgnoreCase("Thessalonians")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have 1 Thessalonians yet.");
				return true;
			}else if(args[2].equalsIgnoreCase("Timothy")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have 1 Timothy yet.");
				return true;
			}else if(args[2].equalsIgnoreCase("Peter")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have 1 Peter yet.");
				return true;
			}else if(args[2].equalsIgnoreCase("John")){
				KJV1John.Run(sender, args);
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, there is no 1 " + args[2] + ".");
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}