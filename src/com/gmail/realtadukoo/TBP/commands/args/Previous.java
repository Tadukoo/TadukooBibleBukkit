package com.gmail.realtadukoo.TBP.commands.args;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumBooks;
import com.gmail.realtadukoo.TBP.Enums.EnumChps;
import com.gmail.realtadukoo.TBP.commands.Records;
import com.gmail.realtadukoo.TBP.commands.References;
import com.gmail.realtadukoo.TBP.commands.Sending;
import com.gmail.realtadukoo.TBP.commands.handling.Args;
import com.gmail.realtadukoo.TBP.commands.handling.Checks;

public class Previous {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 2, "/bible previous [translation]")){
			return;
		}
		String tran = null;
		if(args.length == 2 && Args.tranCheck(sender, args[1]) != null){
			tran = Args.tranCheck(sender, tran);
		}
		String rec[] = Records.getpRecs("verse", sender.getName());
		if(rec[0].equalsIgnoreCase("Genesis") && rec[1].equalsIgnoreCase("1") && rec[2].equalsIgnoreCase("1")){
			sender.sendMessage(ChatColor.RED + "Genesis 1:1 is the first verse of the Bible. You can't " +
					"go back any farther!");
			return;
		}
		EnumBooks book = EnumBooks.GENESIS;
		EnumChps echp = EnumChps.GENESIS;
		String bookName = rec[0];
		book = book.fromString(bookName);
		String chp = rec[1];
		int chapter = Integer.parseInt(chp);
		echp = echp.fromString(bookName, 0);
		int verse = Integer.parseInt(rec[2]) - 1;
		if(tran == null){
			tran = rec[3];
		}
		if(verse > echp.getNum(chapter) || verse == 0){
			verse = 1;
			chapter--;
			if(chapter > book.getChp() || chapter == 0){
				chapter = 1;
				boolean cont = true;
				while(cont){
					bookName = book.numtoBook(book.ordinal() + 1, "int", "lower", null);
					book = book.fromString(bookName);
					/*
					 * TODO: Add check for availability using EnumAvail.
					 * if(book.isAvailable(tran)){
						cont = false;
					}*/
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
		Sending.getVerse(plugin, sender, pName, bookName, chp, v, tran, ref);
	}
}
