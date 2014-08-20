package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumTrans;

public class Translation {
	public static void list(CommandSender sender, TB plugin) {
		String a = "The available translations are:";
		String b = "";
		if(plugin.getConfig().getBoolean("KJV") == true){
			b = b + "KJV";
		}
		sender.sendMessage(ChatColor.GREEN + a);
		sender.sendMessage(ChatColor.GREEN + b);
	}
	
	public static void info(CommandSender sender, TB plugin, EnumTrans etran){
		sender.sendMessage(ChatColor.GREEN + etran.getDesc());
		sender.sendMessage(ChatColor.GREEN + etran.getAliases());
	}
}
