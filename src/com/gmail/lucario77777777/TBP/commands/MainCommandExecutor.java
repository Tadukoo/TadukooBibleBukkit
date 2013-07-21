package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandExecutor;

import com.gmail.lucario77777777.TBP.Main;
import com.gmail.lucario77777777.TBP.commands.KJV.KJV;

public class MainCommandExecutor implements CommandExecutor {
	


	public MainCommandExecutor(Main plugin) {
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		final String playerType;
		if (sender instanceof Player){
			playerType = "player";
		}else if(sender instanceof ConsoleCommandSender){
			playerType = "console";
		}else if(sender instanceof BlockCommandSender){
			playerType = "block";
		}else{
			playerType = "unknown";
		}
		if(cmd.getName().equalsIgnoreCase("bible")){
			if(playerType == "block" || playerType == "unknown"){
				sender.sendMessage(ChatColor.RED + "Unknown sender!");
				return true;
			}else{
				if(args.length == 0){
					sender.sendMessage(ChatColor.RED + "Not enough arguments!");
					return true;
				}else if(args.length >= 1){
					if(args[0].equalsIgnoreCase("kjv")){
						KJV.Run(sender, args, playerType);
						return true;
					}else if(args[0].equalsIgnoreCase("?") || args[0].equalsIgnoreCase("list")){
						Translations.List(sender);
						return true;
					}else{
						sender.sendMessage(ChatColor.RED + "Sorry, we don't have that translation yet.");
						return true;
					}
				}else{
					sender.sendMessage(ChatColor.RED + "An error occured.");
					return true;
				}
			}
		}
		return false;
	}
}