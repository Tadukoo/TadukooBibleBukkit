package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumHelp;
import com.gmail.lucario77777777.TBP.cmdhandling.Args;
import com.gmail.lucario77777777.TBP.cmdhandling.HelpPages;

public class Help {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 2, "/bible help [page|command]")){
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
