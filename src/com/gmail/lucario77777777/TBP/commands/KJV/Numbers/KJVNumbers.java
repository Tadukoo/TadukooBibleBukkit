package com.gmail.lucario77777777.TBP.commands.KJV.Numbers;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;
import com.gmail.lucario77777777.TBP.commands.KJV.KJV;

public class KJVNumbers extends KJV{
	public KJVNumbers(Main plugin){
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args){
		if(args.length <= 2){
			KJVNumbersCh1.Run(sender, args);
			return true;
		}else if(args.length >=3){
			if(args[2].equals("1")){
				KJVNumbersCh1.Run(sender, args);
				return true;
			}else if(args[2].equals("2")){
				KJVNumbersCh2.Run(sender, args);
				return true;
			}else if(args[2].equals("3")){
				KJVNumbersCh3.Run(sender, args);
				return true;
			}else if(args[2].equals("4")){
				KJVNumbersCh4.Run(sender, args);
				return true;
			}else if(args[2].equals("5")){
				KJVNumbersCh5.Run(sender, args);
				return true;
			}else if(args[2].equals("6")){
				KJVNumbersCh6.Run(sender, args);
				return true;
			}else if(args[2].equals("7")){
				KJVNumbersCh7.Run(sender, args);
				return true;
			}else if(args[2].equals("8")){
				KJVNumbersCh8.Run(sender, args);
				return true;
			}else if(args[2].equals("9")){
				KJVNumbersCh9.Run(sender, args);
				return true;
			}else if(args[2].equals("?")){
				sender.sendMessage(ChatColor.GREEN + "Numbers tells about the various laws that were given" +
						" to the Israelites by God.");
				sender.sendMessage(ChatColor.GREEN + "It was written by Moses.");
				sender.sendMessage(ChatColor.GREEN + "It has 36 chapters.");
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, Numbers only has 36 chapters.");
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}