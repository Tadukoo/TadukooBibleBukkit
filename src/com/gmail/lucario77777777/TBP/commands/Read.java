package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumChps;

public class Read{
	public static void read(TB plugin, CommandSender sender, EnumBooks book, EnumChps echp, String bookName,
			String chp, String v, String tran){
		String pName = sender.getName();
		if(CommandExec.tranCheck(sender, tran) == null){
			return;
		}else{
			tran = CommandExec.tranCheck(sender, tran);
		}
		if(book.isAvailable(tran) == false){
			String bookMsg = book.getBook();
			bookMsg = bookMsg.replace("1", "1 ");
			bookMsg = bookMsg.replace("2", "2 ");
			bookMsg = bookMsg.replace("3", "3 ");
			bookMsg = bookMsg.replace("SongofSongs", "Song of Songs");
			sender.sendMessage(ChatColor.RED + "Sorry, " + book.getBook() + 
					" is not available yet in the " + tran.toUpperCase() + " translation.");
			return;
		}
		if(CommandExec.checkForYML(plugin, sender, tran, bookName) == false){
			return;
		}
		String ref = CommandExec.makeRef(book, chp, v);
		if(CommandExec.checkRef(plugin, sender, bookName, tran, ref) == false){
			return;
		}
		CommandExec.sendVerseToPlayer(plugin, sender, pName, bookName, chp, v, tran, ref);
	}
	
	public static void previous(TB plugin, CommandSender sender,  String[] args, EnumBooks book, 
			EnumChps echp){
		String rec[] = CommandExec.getpRecs("verse", sender.getName());
		if(rec[0].equalsIgnoreCase("Genesis") && rec[1].equalsIgnoreCase("1") && rec[2].equalsIgnoreCase("1")){
			sender.sendMessage(ChatColor.RED + "Genesis 1:1 is the first verse of the Bible. You can't " +
					"go back any farther!");
			return;
		}
		String bookName = rec[0];
		book = book.fromString(bookName);
		String chp = rec[1];
		int chapter = Integer.parseInt(chp);
		echp = echp.fromString(bookName);
		int verse = Integer.parseInt(rec[2]) - 1;
		String tran = rec[3];
		if(args.length >= 2){
			if(CommandExec.tranCheck(sender, args[1]) == null){
				return;
			}else{
				tran = CommandExec.tranCheck(sender, args[1]);
			}
		}
		if(verse > echp.getNum(chapter) || verse == 0){
			verse = 1;
			chapter--;
			if(chapter > book.getChp() || chapter == 0){
				chapter = 1;
				boolean cont = true;
				while(cont){
					bookName = book.numtoBook(book.getNum(), "int", "lower", null);
					book = book.fromString(bookName);
					if(book.isAvailable(tran)){
						cont = false;
					}
				}
			}
			chp = String.valueOf(chapter);
		}
		String v = String.valueOf(verse);
		if(CommandExec.checkForYML(plugin, sender, tran, bookName) == false){
			return;
		}
		String ref = CommandExec.makeRef(book, chp, v);
		if(CommandExec.checkRef(plugin, sender, bookName, tran, ref) == false){
			return;
		}
		String pName = sender.getName();
		CommandExec.sendVerseToPlayer(plugin, sender, pName, bookName, chp, v, tran, ref);
	}
	
	public static void next(TB plugin, CommandSender sender,  String[] args, EnumBooks book, EnumChps echp){
		String rec[] = CommandExec.getpRecs("verse", sender.getName());
		if(rec[0].equalsIgnoreCase("3John") && rec[1].equalsIgnoreCase("1") && rec[2].equalsIgnoreCase("14")){
			sender.sendMessage(ChatColor.RED + "3 John 1:14 is the last verse of the Bible that is " +
					"currently available in this plugin. You can't go forward any farther yet!");
			return;
		}
		String bookName = rec[0];
		book = book.fromString(bookName);
		String chp = rec[1];
		int chapter = Integer.parseInt(chp);
		echp = echp.fromString(bookName);
		int verse = Integer.parseInt(rec[2]) + 1;
		String tran = rec[3];
		if(args.length >= 2){
			if(CommandExec.tranCheck(sender, args[1]) == null){
				return;
			}else{
				tran = CommandExec.tranCheck(sender, args[1]);
			}
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
		if(CommandExec.checkForYML(plugin, sender, tran, bookName) == false){
			return;
		}
		String ref = CommandExec.makeRef(book, chp, v);
		if(CommandExec.checkRef(plugin, sender, bookName, tran, ref) == false){
			return;
		}
		String pName = sender.getName();
		CommandExec.sendVerseToPlayer(plugin, sender, pName, bookName, chp, v, tran, ref);
	}
	
	public static void last(TB plugin, CommandSender sender,  String tran){
		String rec[] = CommandExec.getpRecs("verse", sender.getName());
		String bookName = rec[0];
		EnumBooks book = EnumBooks.GENESIS;
		book = book.fromString(bookName);
		String chp = rec[1];
		String v = rec[2];
		if(tran == null){
			tran = rec[3];
		}		
		if(CommandExec.checkForYML(plugin, sender, tran, bookName) == false){
			return;
		}
		String ref = CommandExec.makeRef(book, chp, v);
		if(CommandExec.checkRef(plugin, sender, bookName, tran, ref) == false){
			return;
		}
		String pName = sender.getName();
		CommandExec.sendVerseToPlayer(plugin, sender, pName, bookName, chp, v, tran, ref);
	}
}
