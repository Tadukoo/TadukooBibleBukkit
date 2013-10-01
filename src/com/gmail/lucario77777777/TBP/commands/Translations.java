package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class Translations {

	public static void Run(CommandSender sender, Main plugin) {
		String a = "The available translations are:";
		String b = "";
		if(plugin.getConfig().getBoolean("KJV") == true){
			b = b + "KJV";
		}
		sender.sendMessage(ChatColor.GREEN + a);
		sender.sendMessage(ChatColor.GREEN + b);
	}

}
