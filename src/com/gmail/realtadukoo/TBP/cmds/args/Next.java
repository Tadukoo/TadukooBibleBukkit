package com.gmail.realtadukoo.TBP.cmds.args;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumBooks;
import com.gmail.realtadukoo.TBP.Enums.EnumChps;
import com.gmail.realtadukoo.TBP.cmds.Records;
import com.gmail.realtadukoo.TBP.cmds.Verse;
import com.gmail.realtadukoo.TBP.cmds.handling.Args;

public class Next {
	public static void run(TB plugin, CommandSender sender, String playerType, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 2, "/bible next [translation]")){
			return;
		}
		String tran = null;
		if(args.length == 2 && Args.tranCheck(sender, args[1]) != null){
			tran = Args.tranCheck(sender, tran);
		}
		String rec[] = Records.getPlayerRecords(plugin, playerType, "verse", sender.getName());
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
		echp = echp.fromString(bookName, 0);
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
					echp = echp.fromString(bookName, 0);
					cont = false;
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
		Verse.check(plugin, sender, playerType, bookName, chp, v, tran, book, echp, "get", null, false, false);
	}
}
