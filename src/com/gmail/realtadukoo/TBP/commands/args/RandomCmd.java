package com.gmail.realtadukoo.TBP.commands.args;

import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumBooks;
import com.gmail.realtadukoo.TBP.Enums.EnumChps;
import com.gmail.realtadukoo.TBP.Enums.EnumCmds;
import com.gmail.realtadukoo.TBP.Enums.EnumTrans;
import com.gmail.realtadukoo.TBP.commands.Randomize;
import com.gmail.realtadukoo.TBP.commands.Verse;
import com.gmail.realtadukoo.TBP.commands.handling.Args;

public class RandomCmd {
	public static void run(TB plugin, CommandSender sender, String playerType, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 6, "/bible random [book] [chapter] [translation]")){
			return;
		}
		EnumBooks book = EnumBooks.GENESIS;
		EnumChps echp = EnumChps.GENESIS;
		EnumCmds cmds = EnumCmds.RANDOM;
		EnumTrans etran = EnumTrans.KJV;
		etran = etran.getDefault();
		String bookName = null, chp = null, v = null;
		String tran = etran.getTran();
		boolean bookSet = false, chpSet = false, vSet = false, tranSet = false;
		int i = 1;
		while(args.length >= i + 1 && args[i] != null){
			if(!bookSet && Args.isBook(book, cmds, args, i) != null){
				book = Args.isBook(book, cmds, args, i);
				bookName = book.getBook();
				bookSet = true;
				i = Args.getCurrentArg(book, cmds, args, i);
			}else if(!tranSet && Args.tranCheck(sender, args[i]) != null){
				tran = Args.tranCheck(sender, args[i]);
				tranSet = true;
				i++;
			}else{
				try{
					if(!chpSet){
						int c = Integer.parseInt(args[i]);
						chp = String.valueOf(c);
						i++;
						chpSet = true;
					}else{
						Args.unknownArg(plugin, sender, args[i]);
						return;
					}
				}catch(NumberFormatException e){
					Args.unknownArg(plugin, sender, args[i]);
					return;
				}
			}
		}
		if(bookSet == false){
			bookName = Randomize.book(book, tran);
			book = book.fromString(bookName);
			echp = echp.fromString(bookName, 0);
		}
		if(chpSet == false){
			chp = Randomize.chapter(book, bookName);
		}
		if(vSet == false){
			v = Randomize.verse(book, echp, chp);
		}
		Verse.check(plugin, sender, playerType, bookName, chp, v, tran, book, echp, "get", null, false, false);
	}
}
