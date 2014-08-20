package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;

public class Announce {
	public static void announce(TB plugin, CommandSender sender, String[] args, String tran){
		if(args.length < 4){
			sender.sendMessage(ChatColor.RED + "Not enough arguments!");
			sender.sendMessage(ChatColor.RED + "/bible announce <book> <chapter> <verse> " +
					"[translation]");
			return;
		}
		EnumBooks book = EnumBooks.GENESIS;
		String bookName = book.fromString(args[1]).name();
		String chp = args[2];
		String v = args[3];
		if(args.length >= 5){
			tran = args[4];
		}
		CommandExec.checkForYML(plugin, sender, tran, bookName);
		String ref = CommandExec.makeRef(book, chp, v);
		CommandExec.broadcast(plugin, sender, bookName, chp, v, tran, ref);
	}
}
