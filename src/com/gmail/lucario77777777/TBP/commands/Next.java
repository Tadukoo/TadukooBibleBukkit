package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumChps;
import com.gmail.lucario77777777.TBP.cmdhandling.Args;
import com.gmail.lucario77777777.TBP.cmdhandling.Checks;
import com.gmail.lucario77777777.TBP.cmdhandling.Records;
import com.gmail.lucario77777777.TBP.cmdhandling.References;
import com.gmail.lucario77777777.TBP.cmdhandling.Sending;

public class Next {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(!Args.pRCheck(sender)){
			return;
		}
		if(Args.argsLengthCheck(sender, args, 1, 2, "/bible next [translation]")){
			return;
		}
		String tran = null;
		if(args.length == 2 && Args.tranCheck(sender, args[1]) != null){
			tran = Args.tranCheck(sender, tran);
		}
		String rec[] = Records.getpRecs("verse", sender.getName());
		if(rec[0].equalsIgnoreCase("3John") && rec[1].equalsIgnoreCase("1") && rec[2].equalsIgnoreCase("14")){
			sender.sendMessage(ChatColor.RED + "3 John 1:14 is the last verse of the Bible that is " +
					"currently available in this plugin. You can't go forward any farther yet!");
			return;
		}
		EnumBooks book = EnumBooks.GENESIS;
		EnumChps echp = EnumChps.GENESIS;
		String bookName = rec[0];
		book = book.fromString(bookName);
		String chp = rec[1];
		int chapter = Integer.parseInt(chp);
		echp = echp.fromString(bookName);
		int verse = Integer.parseInt(rec[2]) + 1;
		if(tran == null){
			tran = rec[3];
		}
		if(verse > echp.getNum(chapter)){
			verse = 1;
			chapter++;
			if(chapter > book.getChp()){
				chapter = 1;
				boolean cont = true;
				while(cont){
					bookName = book.numtoBook(book.getNum(), "int", "raise", null);
					book = book.fromString(bookName);
					if(book.isAvailable(tran)){
						cont = false;
					}
				}
			}
			chp = String.valueOf(chapter);
		}
		String v = String.valueOf(verse);
		if(!Checks.checkForYML(plugin, sender, tran, bookName)){
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
