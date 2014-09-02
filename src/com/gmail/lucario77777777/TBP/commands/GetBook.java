package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumCmds;
import com.gmail.lucario77777777.TBP.Enums.EnumTrans;
import com.gmail.lucario77777777.TBP.cmdhandling.Args;
import com.gmail.lucario77777777.TBP.cmdhandling.Book;
import com.gmail.lucario77777777.TBP.cmdhandling.Randomize;

public class Getbook {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 7, "/bible getbook [book] [part] [translation] " +
				"[?] or /bible getbook list")){
			return;
		}
		String pName = sender.getName();
		EnumBooks book = EnumBooks.GENESIS;
		EnumCmds cmds = EnumCmds.GETBOOK;
		EnumTrans etran = EnumTrans.KJV;
		book = book.getDefault();
		String part = plugin.getConfig().getString("DefaultPart");
		etran = etran.getDefault();
		String bookName = book.getBook();
		String tran = etran.getTran();
		int i = 2;
		boolean random = false;
		if(args.length >= 2){
			if(args[1].equalsIgnoreCase("list")){
				if(args.length == 3 && Args.tranCheck(sender, args[2]) != null){
					tran = Args.tranCheck(sender, args[2]);
				}
				Book.list(plugin, sender, tran);
				return;
			}else if(args[1].equalsIgnoreCase("random")){
				random = true;
			}else if(Args.isBook(book, cmds, args, 1) != null){
				book = Args.isBook(book, cmds, args, 1);
				bookName = book.getBook();
				i = Args.getCurrentArg(book, cmds, args, 1);
			}else if(cmds.fromString(args[1]) != null){
				String spec = cmds.fromString(args[1]).getCmd();
				if(spec.equalsIgnoreCase("previous") || spec.equalsIgnoreCase("next") || 
						spec.equalsIgnoreCase("last")){
					if(!Args.pRCheck(sender)){
						return;
					}
					bookName = TB.getpRec().getString(pName + ".lastbook.book");
					part = TB.getpRec().getString(pName + ".lastbook.part");
					tran = TB.getpRec().getString(pName + ".lastbook.tran");
					if(spec.equalsIgnoreCase("previous")){
						if(bookName.equalsIgnoreCase("Genesis") && part.equalsIgnoreCase("1")){
							sender.sendMessage(ChatColor.RED + "Sorry, Genesis Part 1 is the first book. " +
									"You can't go before it!");
							return;
						}
						Book.previous(plugin, sender, tran, bookName, part, "get", pName);
						return;
					}else if(spec.equalsIgnoreCase("next")){
						if(bookName.equalsIgnoreCase("Revelation") && part.equalsIgnoreCase("6")){
							sender.sendMessage(ChatColor.RED + "Sorry, Revelation Part 6 is the last book. " +
									"You can't go after it!");
							return;
						}
						Book.next(plugin, sender, tran, bookName, part, "get", pName);
						return;
					}
				}else{
					sender.sendMessage(ChatColor.RED + "Sorry, you must type either previous, next, last, or " +
							"a book of the Bible.");
				}
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, you must either type previous, next, last, or a " +
						"book of the Bible.");
			}
		}
		if(args.length >= i + 1){
			part = args[i];
			i++;
			if(args.length >= i + 1 && Args.tranCheck(sender, args[i]) != null){
				tran = Args.tranCheck(sender, tran);
				i++;
				if(args.length >= i + 1){
					if(args[i].equalsIgnoreCase("?")){
						Book.contains(plugin, sender, tran, bookName, part);
						return;
					}
				}
			}
		}
		if(random){
			if(args.length == 3 && Args.tranCheck(sender, args[2]) != null){
				tran = Args.tranCheck(sender, args[2]);
			}
			bookName = Randomize.book(book, tran);
			part = Randomize.part(plugin, book, bookName, tran);
		}
		if(!book.isAvailable(tran)){
			sender.sendMessage(ChatColor.RED + bookName + " is not available yet in the " + tran + 
					"translation.");
			return;
		}
		Book.Run(plugin, sender, tran, bookName, part, "get", pName, false);
		return;
	}
}
