package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumCmds;
import com.gmail.lucario77777777.TBP.Enums.EnumTrans;
import com.gmail.lucario77777777.TBP.cmdhandling.Args;
import com.gmail.lucario77777777.TBP.cmdhandling.Checks;
import com.gmail.lucario77777777.TBP.cmdhandling.Sending;

public class Announce {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 3, 7, "/bible announce <book> <chapter> <verse> [translation] " +
				"or /bible announce <book> <chapter:verse> [translation]")){
			return;
		}
		EnumBooks book = EnumBooks.GENESIS;
		EnumTrans etran = EnumTrans.KJV;
		etran = etran.getDefault();
		String bookName = book.getBook();
		String chp = null;
		String v = null;
		String tran = etran.getTran();
		EnumCmds cmds = EnumCmds.ANNOUNCE;
		int i = 2;
		if(Args.isBook(book, cmds, args, 1) != null){
			book = Args.isBook(book, cmds, args, 1);
			bookName = book.getBook();
			i = Args.getCurrentArg(book, cmds, args, 1);
		}else{
			sender.sendMessage(ChatColor.RED + args[1] + " must be a book!");
			return;
		}
		if(args.length >= i + 1){
			if(args[i].contains(":")){
				String[] chpV = args[i].split(":");
				chp = chpV[0];
				v = chpV[1];
				i++;
			}else{
				chp = args[i];
				i++;
				if(args.length >= i + 1){
					v = args[i];
					i++;
				}else{
					sender.sendMessage(ChatColor.RED + "Not enough args!");
					sender.sendMessage(ChatColor.RED + "/bible announce <book> <chapter> <verse> " +
							"[translation] or /bible announce <book> <chapter:verse> [translation]");
					return;
				}
			}
		}else{
			sender.sendMessage(ChatColor.RED + "Not enough args!");
			sender.sendMessage(ChatColor.RED + "/bible announce <book> <chapter> <verse> [translation] or " +
					"/bible announce <book> <chapter:verse> [translation]");
			return;
		}
		if(args.length == i + 1 && Args.tranCheck(sender, args[i]) != null){
			tran = Args.tranCheck(sender, args[i]);
		}
		if(!book.isAvailable(tran)){
			return;
		}
		if(!Checks.checkForYML(plugin, sender, tran, bookName)){
			return;
		}
		String ref = Checks.bookCheck(sender, book, bookName, chp, v);
		if(ref == null){
			return;
		}
		Sending.broadcast(plugin, sender, bookName, chp, v, tran, ref);
	}
}
