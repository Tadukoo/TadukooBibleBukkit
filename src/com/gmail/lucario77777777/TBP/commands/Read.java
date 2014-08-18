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
		if(MainCommandExecutor.tranCheck(plugin, sender, tran) == null){
			return;
		}else{
			tran = MainCommandExecutor.tranCheck(plugin, sender, tran);
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
		if(MainCommandExecutor.checkForYML(plugin, sender, tran, bookName) == false){
			return;
		}
		String ref = MainCommandExecutor.makeRef(book, chp, v);
		if(MainCommandExecutor.checkRef(plugin, sender, bookName, tran, ref) == false){
			return;
		}
		MainCommandExecutor.sendVerseToPlayer(plugin, sender, pName, bookName, chp, v, tran, ref);
	}
	
	public static void previous(TB plugin, CommandSender sender,  String[] args, EnumBooks book, 
			EnumChps echp){
		String rec[] = MainCommandExecutor.getpRecs("verse", sender.getName());
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
			if(MainCommandExecutor.tranCheck(plugin, sender, args[1]) == null){
				return;
			}else{
				tran = MainCommandExecutor.tranCheck(plugin, sender, args[1]);
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
		if(MainCommandExecutor.checkForYML(plugin, sender, tran, bookName) == false){
			return;
		}
		String ref = MainCommandExecutor.makeRef(book, chp, v);
		if(MainCommandExecutor.checkRef(plugin, sender, bookName, tran, ref) == false){
			return;
		}
		String pName = sender.getName();
		MainCommandExecutor.sendVerseToPlayer(plugin, sender, pName, bookName, chp, v, tran, ref);
	}
	
	public static void next(TB plugin, CommandSender sender,  String[] args, EnumBooks book, EnumChps echp){
		String rec[] = MainCommandExecutor.getpRecs("verse", sender.getName());
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
			if(MainCommandExecutor.tranCheck(plugin, sender, args[1]) == null){
				return;
			}else{
				tran = MainCommandExecutor.tranCheck(plugin, sender, args[1]);
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
		if(MainCommandExecutor.checkForYML(plugin, sender, tran, bookName) == false){
			return;
		}
		String ref = MainCommandExecutor.makeRef(book, chp, v);
		if(MainCommandExecutor.checkRef(plugin, sender, bookName, tran, ref) == false){
			return;
		}
		String pName = sender.getName();
		MainCommandExecutor.sendVerseToPlayer(plugin, sender, pName, bookName, chp, v, tran, ref);
	}
	
	public static void last(TB plugin, CommandSender sender,  String[] args, EnumBooks book){
		String rec[] = MainCommandExecutor.getpRecs("verse", sender.getName());
		String bookName = rec[0];
		book = book.fromString(bookName);
		String chp = rec[1];
		String v = rec[2];
		String tran = rec[3];
		if(args.length >= 2){
			if(MainCommandExecutor.tranCheck(plugin, sender, args[1]) == null){
				return;
			}else{
				tran = MainCommandExecutor.tranCheck(plugin, sender, args[1]);
			}
		}
		if(MainCommandExecutor.checkForYML(plugin, sender, tran, bookName) == false){
			return;
		}
		String ref = MainCommandExecutor.makeRef(book, chp, v);
		if(MainCommandExecutor.checkRef(plugin, sender, bookName, tran, ref) == false){
			return;
		}
		String pName = sender.getName();
		MainCommandExecutor.sendVerseToPlayer(plugin, sender, pName, bookName, chp, v, tran, ref);
	}
}
