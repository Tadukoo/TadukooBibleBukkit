package com.gmail.lucario77777777.TBP.commands.args;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumChps;
import com.gmail.lucario77777777.TBP.commands.Records;
import com.gmail.lucario77777777.TBP.commands.References;
import com.gmail.lucario77777777.TBP.commands.Sending;
import com.gmail.lucario77777777.TBP.commands.handling.Args;
import com.gmail.lucario77777777.TBP.commands.handling.Checks;

public class Next {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 2, "/bible next [translation]")){
			return;
		}
		String tran = null;
		if(args.length == 2 && Args.tranCheck(sender, args[1]) != null){
			tran = Args.tranCheck(sender, tran);
		}
		String rec[] = Records.getpRecs("verse", sender.getName());
		if(rec[0].equalsIgnoreCase("Revelation") && rec[1].equalsIgnoreCase("22") && 
				rec[2].equalsIgnoreCase("21")){
			sender.sendMessage(ChatColor.RED + "Revelation 22:21 is the last verse of the Bible. You can't " +
					"go forward any farther!");
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
					bookName = book.numtoBook(book.ordinal() + 1, "int", "raise", null);
					book = book.fromString(bookName);
					if(book.isAvailable(tran)){
						cont = false;
					}
				}
			}
			chp = String.valueOf(chapter);
		}
		String v = String.valueOf(verse);
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
