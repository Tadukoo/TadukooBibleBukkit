package com.gmail.realtadukoo.TBP.cmds.args;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TB.Constants.EnumBible;
import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.cmds.Records;
import com.gmail.realtadukoo.TBP.cmds.Verse;
import com.gmail.realtadukoo.TBP.cmds.handling.Args;

public class Previous {
	public static void run(TB plugin, CommandSender sender, String playerType, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 3, "/bible previous [type] [translation]")){
			return;
		}
		String tran = null, type = "verse";
		if(args.length >= 2){
			for(int i = 1; i < args.length; i++){
				if(Args.tranCheck(sender, args[i]) != null){
					tran = Args.tranCheck(sender, tran);
				}else if(args[i].equalsIgnoreCase("verse") || args[i].equalsIgnoreCase("v") ||
						args[i].equalsIgnoreCase("chapter") || args[i].equalsIgnoreCase("chp") || 
						args[i].equalsIgnoreCase("book") || args[i].equalsIgnoreCase("b")){
					type = args[i];
				}else{
					Args.unknownArg(plugin, sender, args[i]);
				}
			}
		}
		
		if(type.equalsIgnoreCase("v")){
			type = "verse";
		}else if(type.equalsIgnoreCase("chp")){
			type = "chapter";
		}else if(type.equalsIgnoreCase("b")){
			type = "book";
		}
		
		String rec[] = Records.getPlayerRecords(plugin, playerType, "verse", sender.getName());
		if(rec[0].equalsIgnoreCase("Genesis") && rec[1].equalsIgnoreCase("1") && rec[2].equalsIgnoreCase("1")){
			sender.sendMessage(ChatColor.RED + "Genesis 1:1 is the first verse of the Bible. You can't " +
					"go back any farther!");
			return;
		}
		String bookName = rec[0];
		EnumBible book = EnumBible.fromBook(bookName);
		String chp = rec[1];
		int chapter = Integer.parseInt(chp);
		int verse = Integer.parseInt(rec[2]);
		
		if(type.equalsIgnoreCase("verse")){
			if(verse != 1){
				verse--;
			}else{
				if(chapter != 1){
					chapter--;
				}else{
					boolean cont = true;
					while(cont){
						book = EnumBible.fromInt(book.ordinal());
						bookName = book.getBook();
						cont = false;
						/*
						 * TODO: Add check for availability using EnumAvail.
						 * if(book.isAvailable(tran)){
							cont = false;
						}*/
					}
					chapter = book.getNumChapters();
				}
				verse = book.getNum(chapter);
				chp = String.valueOf(chapter);
			}
		}
		
		if(type.equalsIgnoreCase("chapter")){
			if(verse != 1){
				verse = 1;
			}else{
				if(chapter != 1){
					chapter--;
				}else{
					boolean cont = true;
					while(cont){
						book = EnumBible.fromInt(book.ordinal());
						bookName = book.getBook();
						cont = false;
						/*
						 * TODO: Add check for availability using EnumAvail.
						 * if(book.isAvailable(tran)){
							cont = false;
						}*/
					}
					chapter = book.getNumChapters();
				}
				chp = String.valueOf(chapter);
			}
		}
		
		if(type.equalsIgnoreCase("book")){
			if(verse != 1 || chapter != 1){
				verse = 1;
				chapter = 1;
				chp = String.valueOf(chapter);
			}else{
				boolean cont = true;
				while(cont){
					book = EnumBible.fromInt(book.ordinal());
					bookName = book.getBook();
					cont = false;
					/*
					 * TODO: Add check for availability using EnumAvail.
					 * if(book.isAvailable(tran)){
						cont = false;
					}*/
				}
			}
		}
		if(tran == null){
			tran = rec[3];
		}
		
		String v = String.valueOf(verse);
		Verse.check(plugin, sender, playerType, bookName, chp, v, tran, "get", null, false, false);
	}
}
