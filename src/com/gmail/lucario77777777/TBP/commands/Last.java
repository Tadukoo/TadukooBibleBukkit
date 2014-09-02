package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.cmdhandling.Args;
import com.gmail.lucario77777777.TBP.cmdhandling.Checks;
import com.gmail.lucario77777777.TBP.cmdhandling.Records;
import com.gmail.lucario77777777.TBP.cmdhandling.References;
import com.gmail.lucario77777777.TBP.cmdhandling.Sending;

public class Last {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 2, "/bible last [translation]")){
			return;
		}
		String tran = null;
		if(args.length == 2 && Args.tranCheck(sender, args[1]) != null){
			tran = Args.tranCheck(sender, args[1]);
		}
		String rec[] = Records.getpRecs("verse", sender.getName());
		String bookName = rec[0];
		EnumBooks book = EnumBooks.GENESIS;
		book = book.fromString(bookName);
		String chp = rec[1];
		String v = rec[2];
		if(tran == null){
			tran = rec[3];
		}
		if(!book.isAvailable(tran)){
			Args.bookNotAvailable(sender, book, tran);
			return;
		}
		if(!Checks.checkForYML(plugin, sender, bookName, tran)){
			return;
		}
		String ref = References.makeRef(book, chp, v);
		if(!References.checkRef(plugin, sender, bookName, tran, ref)){
			return;
		}
		String pName = sender.getName();
		Sending.sendVerseToPlayer(plugin, sender, pName, bookName, chp, v, tran, ref);
	}
}
