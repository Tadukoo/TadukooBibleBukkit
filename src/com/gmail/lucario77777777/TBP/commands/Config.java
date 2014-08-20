package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;

public class Config {
	public static void config(TB plugin, CommandSender sender, String[] args){
		String setting = null;
		String value = null;
		//String fileName = null;
		if(args.length < 2){
			sender.sendMessage(ChatColor.RED + "Not enough arguments!");
			sender.sendMessage(ChatColor.RED + "/bible config <setting> [value]");
			return;
		}
		setting = args[1];
		if(args.length >= 3){
			value = args[2];
			/*if(args.length >= 4){
				fileName = args[3];
			}*/
		}
		if(setting.equalsIgnoreCase("list")){
			Settings.settings(sender);
			return;
		}
		if(value != null){
			plugin.getConfig().set(setting, value);
			sender.sendMessage(ChatColor.GREEN + setting + " is now set to " + value + ".");
			plugin.saveConfig();
			return;
		}else{
			value = plugin.getConfig().getString(setting);
			sender.sendMessage(ChatColor.GREEN + setting + " is set to " + value + ".");
			return;
		}
	}
}
