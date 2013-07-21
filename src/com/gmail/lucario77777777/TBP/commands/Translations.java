package com.gmail.lucario77777777.TBP.commands;

import com.gmail.lucario77777777.TBP.commands.MainCommandExecutor;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class Translations extends MainCommandExecutor {
	public Translations(Main plugin) {
		super(plugin);
	}
	
	public static boolean List(CommandSender sender)
	{
		sender.sendMessage(ChatColor.GREEN + "The available translations are:");
		sender.sendMessage(ChatColor.GREEN + "KJV");
		return true;
	}
}