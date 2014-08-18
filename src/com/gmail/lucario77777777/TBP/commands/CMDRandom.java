package com.gmail.lucario77777777.TBP.commands;

import java.util.Random;

import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumChps;

public class CMDRandom {
	public static void random(TB plugin, CommandSender sender, EnumBooks book, EnumChps echp, String bookName,
			String chp, String v, String tran, boolean bookSet, boolean chpSet){
		Random generator = new Random();
		int rB;
		int rC;
		int rV;
		boolean vSet = false;
		String pName = sender.getName();
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
		if(MainCommandExecutor.tranCheck(plugin, sender, tran) == null){
			return;
		}else{
			tran = MainCommandExecutor.tranCheck(plugin, sender, tran);
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
}
