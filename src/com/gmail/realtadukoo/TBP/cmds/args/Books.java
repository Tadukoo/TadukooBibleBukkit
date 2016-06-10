package com.gmail.realtadukoo.TBP.cmds.args;

import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumBooks;
import com.gmail.realtadukoo.TBP.Enums.EnumCmds;
import com.gmail.realtadukoo.TBP.cmds.Information;
import com.gmail.realtadukoo.TBP.cmds.handling.Args;

public class Books {
	public static void run(CommandSender sender, TB plugin, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 4, "/bible books [page|book]")){
			return;
		}
		String bookListPage = "1";
		EnumBooks book = EnumBooks.GENESIS;
		EnumCmds cmds = EnumCmds.BOOKS;
		if(args.length >= 2){
			if(Args.isBook(book, cmds, args, 1) != null){
				book = Args.isBook(book, cmds, args, 1);
				Information.bookInfo(sender, plugin, book);
				return;
			}else{
				bookListPage = args[1];
			}
		}
		Information.booksList(sender, bookListPage);
	}
}
