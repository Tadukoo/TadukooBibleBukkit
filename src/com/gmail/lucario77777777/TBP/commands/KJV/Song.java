package com.gmail.lucario77777777.TBP.commands.KJV;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class Song extends KJV{
	public Song(Main plugin) {
		super(plugin);
	}
	public static boolean Run (CommandSender sender, String[] args){
		if(args.length == 2){
			sender.sendMessage(ChatColor.RED + "Sorry, we don't have Song of Songs/Solomon yet.");
			return true;
		}else if(args.length >= 3){
			if(args.length == 3){
				if(args[2].equalsIgnoreCase("of")){
					sender.sendMessage(ChatColor.RED + "Sorry, we don't have Song of Songs/Solomon yet.");
					return true;
				}else{
					sender.sendMessage(ChatColor.RED + "Song " + args[2] + " is not a book of the Bible.");
					return true;
					}
			}else if(args.length >= 4){
				if(args[3].equalsIgnoreCase("Songs") || args[3].equalsIgnoreCase("Solomon")){
					sender.sendMessage(ChatColor.RED + "Sorry, we don't have Song of Songs/Solomon yet.");
					return true;
				}else{
					sender.sendMessage(ChatColor.RED + "Song of " + args[3] + " is not a book of the Bible");
					return true;
				}
			}else{
				sender.sendMessage(ChatColor.RED + "An error occured.");
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}
