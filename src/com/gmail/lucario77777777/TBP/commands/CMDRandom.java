package com.gmail.lucario77777777.TBP.commands;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumChps;

public class CMDRandom {
	public static void random(TB plugin, CommandSender sender, String[] args, String bookName, String chp,
			String v, String tran){
		Random generator = new Random();
		int rB;
		int rC;
		int rV;
		boolean bookSet = false;
		boolean chpSet = false;
		boolean vSet = false;
		EnumBooks book = EnumBooks.GENESIS;
		EnumChps echp = EnumChps.GENESIS;
		if(args.length >= 2){
			bookName = book.fromString(args[1]).getBook();
			bookSet = true;
			if(args.length >= 3){
				chp = args[2];
				chpSet = true;
				if(args.length >= 4){
					tran = args[3].toUpperCase();
				}
			}
		}
		if(bookSet == false){
			boolean cont = true;
			while(cont){
				rB = generator.nextInt(66) + 1;
				bookName = book.numtoBook(rB, "int", null, null);
				book = book.fromString(bookName);
				if(book.isAvailable(tran)){
					cont = false;
				}
			}
		}
		if(chpSet == false){
			book = book.fromString(bookName);
			int lim = book.getChp();
			rC = generator.nextInt(lim) + 1;
			chp = Integer.toString(rC);
		}
		if(vSet == false){
			echp = echp.fromString(book.getBook());
			int lim = echp.getNum(Integer.parseInt(chp));
			rV = generator.nextInt(lim) + 1;
			v = Integer.toString(rV);
		}
		if(MainCommandExecutor.tranCheck(plugin, sender, tran) == false){
			return;
		}
		if(MainCommandExecutor.checkForYML(plugin, sender, tran, bookName) == false){
			return;
		}
		String ref = Reference.make(book, chp, v);
		if(Reference.check(plugin, sender, bookName, tran, ref) == false){
			return;
		}
		String verse = plugin.getBook(tran, bookName).getString(ref);
		sender.sendMessage(ChatColor.GREEN + verse + " (" + bookName + " " + chp + ":" + v + " " + tran + ")");
	}
}
