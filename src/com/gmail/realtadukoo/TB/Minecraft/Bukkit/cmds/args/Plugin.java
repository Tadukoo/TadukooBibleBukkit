package com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.args;

import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TB.Minecraft.Bukkit.TB;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.Information;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.handling.Args;

public class Plugin {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 1, "/bible plugin")){
			return;
		}
		Information.pluginInfo(plugin, sender);
	}
}
