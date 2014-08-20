package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumTrans;

public class Info {
	public static void info(TB plugin, CommandSender sender, String[] args, EnumTrans etran){
		String info = "";
		if(args.length > 2){
			sender.sendMessage(ChatColor.RED + "Too many arguments!");
			return;
		}else if(args.length < 2){
			sender.sendMessage(ChatColor.RED + "Not enough arguments!");
		}else{
			String tran = args[1].toUpperCase();
			if(CommandExec.tranCheck(sender, tran) == null){
				return;
			}else{
				tran = CommandExec.tranCheck(sender, tran);
			}
			info = etran.fromString(tran).getDesc();
		}
		CommandExec.sendInfoToPlayer(plugin, sender, info);
	}
	
	public static void pluginInfo(TB plugin, CommandSender sender){
		sender.sendMessage(ChatColor.GREEN + "Plugin Name: " + plugin.getDescription().getName());
		sender.sendMessage(ChatColor.GREEN + "Author: " + plugin.getDescription().getAuthors());
		sender.sendMessage(ChatColor.GREEN + "Version: " + plugin.getDescription().getVersion());
	}
	
	public static void bookInfo(CommandSender sender, EnumBooks book) {
		sender.sendMessage(ChatColor.GREEN + book.getDesc());
		sender.sendMessage(ChatColor.GREEN + book.getAliases());
}
}
