package com.gmail.realtadukoo.TBP.cmds.args;

import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TB.Enums.EnumTranslations;
import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.cmds.Information;
import com.gmail.realtadukoo.TBP.cmds.handling.Args;

public class Translation {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 2, "/bible translation [translation]")){
			return;
		}
		if(args.length == 2 && Args.tranCheck(sender, args[1]) != null){
			String tran = Args.tranCheck(sender, args[1]);
			EnumTranslations etran = EnumTranslations.fromAbbreviation(tran);
			Information.tranInfo(sender, plugin, etran);
			return;
		}
		Information.tranList(sender, plugin);
	}
}
