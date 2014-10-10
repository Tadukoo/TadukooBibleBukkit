package com.gmail.lucario77777777.TBP.commands.apocrypha;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.cmdhandling.Args;

public class ApoHelp {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 2, plugin.getLanguage().getString("apocrypha.commands.help"))){
			return;
		}
		sender.sendMessage(ChatColor.GREEN + plugin.getLanguage().getString("apocrypha.help.pages"));
	}
}
