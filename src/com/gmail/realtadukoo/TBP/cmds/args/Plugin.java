package com.gmail.realtadukoo.TBP.cmds.args;

import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.cmds.Information;
import com.gmail.realtadukoo.TBP.cmds.handling.Args;

public class Plugin {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 1, "/bible plugin")){
			return;
		}
		Information.pluginInfo(plugin, sender);
	}
}
