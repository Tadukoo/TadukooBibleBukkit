package com.gmail.realtadukoo.TBP.commands.args;

import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumBooks;
import com.gmail.realtadukoo.TBP.commands.Records;
import com.gmail.realtadukoo.TBP.commands.References;
import com.gmail.realtadukoo.TBP.commands.Sending;
import com.gmail.realtadukoo.TBP.commands.handling.Args;
import com.gmail.realtadukoo.TBP.commands.handling.Checks;

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
		Sending.getVerse(plugin, sender, pName, bookName, chp, v, tran, ref);
	}
}
