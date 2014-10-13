package com.gmail.lucario77777777.TBP.commands.args;

import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.commands.Information;
import com.gmail.lucario77777777.TBP.commands.handling.Args;

public class Plugin {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 1, "/bible plugin")){
			return;
		}
		Information.pluginInfo(plugin, sender);
	}
}
