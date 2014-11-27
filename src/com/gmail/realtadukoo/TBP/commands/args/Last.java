package com.gmail.realtadukoo.TBP.commands.args;

import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumBooks;
import com.gmail.realtadukoo.TBP.Enums.EnumChps;
import com.gmail.realtadukoo.TBP.commands.Records;
import com.gmail.realtadukoo.TBP.commands.Verse;
import com.gmail.realtadukoo.TBP.commands.handling.Args;

public class Last {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 2, "/bible last [translation]")){
			return;
		}
		EnumChps echp = EnumChps.GENESIS;
		String tran = null;
		if(args.length == 2 && Args.tranCheck(sender, args[1]) != null){
			tran = Args.tranCheck(sender, args[1]);
		}
		String rec[] = Records.getpRecs(plugin, "verse", sender.getName());
		String bookName = rec[0];
		EnumBooks book = EnumBooks.GENESIS;
		book = book.fromString(bookName);
		String chp = rec[1];
		String v = rec[2];
		if(tran == null){
			tran = rec[3];
		}
		/*
		 * TODO: Add check for availability using EnumAvail.
		 * if(!book.isAvailable(tran)){
			Args.bookNotAvailable(sender, book, tran);
			return;
		}*/
		Verse.check(plugin, sender, bookName, chp, v, tran, book, echp, "get", null, false, false);
	}
}
