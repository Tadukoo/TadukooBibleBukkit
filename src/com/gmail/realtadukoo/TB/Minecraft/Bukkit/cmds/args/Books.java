package com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.args;

import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TB.API.Constants.EnumBible;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.TB;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.Enums.EnumCmds;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.Information;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.handling.Args;

public class Books {
	public static void run(CommandSender sender, TB plugin, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 4, "/bible books [page|book]")){
			return;
		}
		String bookListPage = "1";
		EnumCmds cmds = EnumCmds.BOOKS;
		if(args.length >= 2){
			if(Args.isBook(cmds, args, 1) != null){
				EnumBible book = Args.isBook(cmds, args, 1);
				Information.bookInfo(sender, plugin, book.getBook());
				return;
			}else{
				bookListPage = args[1];
			}
		}
		Information.booksList(sender, bookListPage);
	}
}
