package com.gmail.realtadukoo.TBP.commands.args;

import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.commands.Information;
import com.gmail.realtadukoo.TBP.commands.handling.Args;

public class Plugin {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 1, "/bible plugin")){
			return;
		}
		Information.pluginInfo(plugin, sender);
	}
}
