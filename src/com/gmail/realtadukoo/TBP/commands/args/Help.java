package com.gmail.realtadukoo.TBP.commands.args;

import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumHelp;
import com.gmail.realtadukoo.TBP.commands.HelpPages;
import com.gmail.realtadukoo.TBP.commands.handling.Args;

public class Help {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 2, plugin.getLanguage().getString("command.help"))){
			return;
		}
		EnumHelp ehelp = EnumHelp.TABLEOFCONTENTS;
		if(args.length == 2){
			if(ehelp.fromString(args[1]) != null){
				ehelp = ehelp.fromString(args[1]);
			}
		}
		String helpPage = ehelp.getTitle();
		int helpPageNum = ehelp.getNum();
		int helpPageNumU = helpPageNum + 1;
		int helpPageNumMinor = ehelp.getMinor();
		HelpPages.help(plugin, sender, helpPage, helpPageNum, helpPageNumU, helpPageNumMinor, ehelp);
	}
}
