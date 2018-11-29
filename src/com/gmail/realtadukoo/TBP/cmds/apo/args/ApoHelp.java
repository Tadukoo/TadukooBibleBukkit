package com.gmail.realtadukoo.TBP.cmds.apo.args;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.cmds.handling.Args;

public class ApoHelp {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 2, plugin.getLanguage().getString("apocrypha.commands.help"))){
			return;
		}
		sender.sendMessage(ChatColor.GREEN + plugin.getLanguage().getString("apocrypha.help.pages"));
	}
}
