package com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.args;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TB.Minecraft.Bukkit.TB;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.Information;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.Sending;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.handling.Args;

public class Config {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 2, 3, "/bible config <setting> [value]")){
			return;
		}
		String setting = args[1];
		String value = null;
		if(args.length == 3){
			value = args[2];
		}
		if(setting.equalsIgnoreCase("list")){
			Information.settings(sender);
			return;
		}else if(plugin.getConfig().getString(setting) == null){
			sender.sendMessage(ChatColor.RED + "Sorry, that setting doesn't exist or is set to null.");
			return;
		}
		String message = null;
		if(value != null){
			plugin.getConfig().set(setting, value);
			plugin.saveConfig();
			message = setting + " is now set to " + value + ".";
		}else{
			value = plugin.getConfig().getString(setting);
			message = setting + " is set to " + value + ".";
		}
		Sending.sendInfoToPlayer(plugin, sender, message);
	}
}
