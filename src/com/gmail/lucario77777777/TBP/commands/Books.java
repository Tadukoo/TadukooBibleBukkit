package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumCmds;
import com.gmail.lucario77777777.TBP.cmdhandling.Args;
import com.gmail.lucario77777777.TBP.cmdhandling.Information;

public class Books {
	public static void run(CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 4, "/bible books [page|book]")){
			return;
		}
		String bookListPage = "1";
		EnumBooks book = EnumBooks.GENESIS;
		EnumCmds cmds = EnumCmds.BOOKS;
		if(args.length >= 2){
			if(Args.isBook(book, cmds, args, 1) != null){
				book = Args.isBook(book, cmds, args, 1);
				Information.bookInfo(sender, book);
				return;
			}else{
				bookListPage = args[1];
			}
		}
		Information.booksList(sender, bookListPage);
	}
}
