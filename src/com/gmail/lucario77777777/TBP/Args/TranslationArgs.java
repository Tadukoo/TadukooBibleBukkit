package com.gmail.lucario77777777.TBP.Args;

import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumTrans;
import com.gmail.lucario77777777.TBP.commands.Translation;

public class TranslationArgs {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 2, "/bible translation [translation]")){
			return;
		}
		if(args.length == 2 && Args.tranCheck(sender, args[1]) != null){
			String tran = Args.tranCheck(sender, args[1]);
			EnumTrans etran = EnumTrans.KJV;
			etran = etran.fromString(tran);
			Translation.info(sender, plugin, etran);
			return;
		}
		Translation.list(sender, plugin);
	}
}
