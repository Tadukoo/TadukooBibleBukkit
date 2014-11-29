package com.gmail.realtadukoo.TBP.commands.args;

import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumTrans;
import com.gmail.realtadukoo.TBP.commands.Information;
import com.gmail.realtadukoo.TBP.commands.handling.Args;

public class Translation {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 2, "/bible translation [translation]")){
			return;
		}
		if(args.length == 2 && Args.tranCheck(sender, args[1]) != null){
			String tran = Args.tranCheck(sender, args[1]);
			EnumTrans etran = EnumTrans.KJV;
			etran = etran.fromString(tran);
			Information.tranInfo(sender, plugin, etran);
			return;
		}
		Information.tranList(sender, plugin);
	}
}
