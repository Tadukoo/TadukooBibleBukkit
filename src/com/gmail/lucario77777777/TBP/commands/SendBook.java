package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;

public class SendBook {
	public static void sendbook(TB plugin, CommandSender sender, String[] args,
			String bookName, String tran){
		String bookType = "send";
		String p = null;
		String part = "1";
		EnumBooks ebook = EnumBooks.GENESIS;
		if(args.length < 2){
			sender.sendMessage(ChatColor.RED + "Not enough arguments!");
			sender.sendMessage(ChatColor.RED + "/bible sendbook <player>");
			return;
		}else{
			p = args[1];
		}
		if(args.length >= 3){
			if(ebook.fromString(args[2]) != null){
				ebook = ebook.fromString(args[2]);
				bookName = ebook.getBook();
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, that book does not exist.");
				return;
			}
			if(args.length >= 4){
				part = args[3];
				if(args.length >= 5){
					tran = args[4].toUpperCase();
					if(CommandExec.tranCheck(sender, tran) == null){
						return;
					}else{
						tran = CommandExec.tranCheck(sender, tran);
					}
				}
			}
		}
		Book.Run(plugin, sender, tran, bookName, part, bookType, p);
	}
}
