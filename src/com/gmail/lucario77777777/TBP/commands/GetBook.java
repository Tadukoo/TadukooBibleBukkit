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
					part = TB.getpRec().getString(pName + ".lastbook.part");
					tran = TB.getpRec().getString(pName + ".lastbook.tran");
					if(bookName.equalsIgnoreCase("Genesis") && part.equalsIgnoreCase("1")){
						sender.sendMessage(ChatColor.RED + "Sorry, Genesis Part 1 is the first book. You " +
								"can't go before it!");
						return;
					}
					Book.previous(plugin, sender, tran, bookName, part, bookType, p);
					return;
				}else if(spec.equalsIgnoreCase("next")){
					bookName = TB.getpRec().getString(pName + ".lastbook.book");
					part = TB.getpRec().getString(pName + ".lastbook.part");
					tran = TB.getpRec().getString(pName + ".lastbook.tran");
					if(bookName.equalsIgnoreCase("3John") && part.equalsIgnoreCase("1")){
						sender.sendMessage(ChatColor.RED + "Sorry, 3 John Part 1 is the last book currently " +
								"available in this plugin. You can't go after it!");
						return;
					}
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
				sender.sendMessage(ChatColor.RED + "You must type either previous, next, last, or " +
						"a book of the Bible.");
				return;
			}
			if(args.length >= 3){
				part = args[2];
				if(args.length >= 4){
					tran = args[3].toUpperCase();
					if(CommandExec.tranCheck(sender, tran) == null){
						return;
					}else{
						tran = CommandExec.tranCheck(sender, tran);
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
		if(!ebook.isAvailable(tran)){
			sender.sendMessage(ChatColor.RED + bookName + " is not available yet in the " + tran + 
					"translation.");
			return;
		}
		Book.Run(plugin, sender, tran, bookName, part, bookType, p);
		return;
	}
}
