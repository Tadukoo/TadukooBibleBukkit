package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumCmds;

public class GetBook {
	public static void getbook(TB plugin, CommandSender sender, String[] args, String bookName, String chp,
			String tran){
		String bookType = "get";
		String p = null;
		String part = chp;
		Player player = (Player) sender;
		String pName = player.getName();
		EnumCmds ecmd = EnumCmds.HELP;
		EnumBooks ebook = EnumBooks.GENESIS;
		if(args.length >= 2){
			if(ebook.fromString(args[1]) != null){
				ebook = ebook.fromString(args[1]);
				bookName = ebook.getBook();
			}else if(TB.pR && ecmd.fromString(args[1]) != null){
				String spec = ecmd.fromString(args[1]).getCmd();
				if(spec.equalsIgnoreCase("previous")){
					bookName = TB.getpRec().getString(pName + ".lastbook.book");
					part = TB.getpRec().getString(pName + "lastbook.part");
					tran = TB.getpRec().getString(pName + ".lastbook.tran");
					Book.previous(plugin, sender, tran, bookName, part, bookType, p);
					return;
				}else if(spec.equalsIgnoreCase("next")){
					bookName = TB.getpRec().getString(pName + ".lastbook.book");
					part = TB.getpRec().getString(pName + ".lastbook.part");
					tran = TB.getpRec().getString(pName + ".lastbook.tran");
					Book.next(plugin, sender, tran, bookName, part, bookType, p);
					return;
				}else if(spec.equalsIgnoreCase("last")){
					bookName = TB.getpRec().getString(pName + ".lastbook.book");
					part = TB.getpRec().getString(pName + ".lastbook.part");
					tran = TB.getpRec().getString(pName + ".lastbook.tran");
				}else{
					sender.sendMessage(ChatColor.RED + "Sorry, you must either type previous, next, last, " +
							"or a book of the Bible.");
					return;
				}
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, that book does not exist.");
				return;
			}
			if(args.length >= 3){
				part = args[2];
				if(args.length >= 4){
					tran = args[3].toUpperCase();
					if(MainCommandExecutor.tranCheck(plugin, sender, tran) == null){
						return;
					}else{
						tran = MainCommandExecutor.tranCheck(plugin, sender, tran);
					}
					if(args.length >= 5){
						if(args[4].equalsIgnoreCase("?")){
							Book.contains(plugin, sender, tran, bookName, part);
							return;
						}
					}
				}
			}
		}
		if(ebook.isAvailable(tran) == false){
			sender.sendMessage(ChatColor.RED + bookName + " is not available yet in the " + tran + 
					"translation.");
			return;
		}
		MainCommandExecutor.savepRecs("book", pName, tran, bookName, chp, null, part);
		Book.Run(plugin, sender, tran, bookName, part, bookType, p);
		return;
	}
}
