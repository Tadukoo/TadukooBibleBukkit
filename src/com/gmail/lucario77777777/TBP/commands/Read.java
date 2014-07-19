package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumChps;

public class Read {
	public static void read(TB plugin, CommandSender sender,  String[] args, EnumBooks book, 
			EnumChps echp, String bookName, String chp, String v, String tran){
		if(book.isAvailable(tran) == false){
			sender.sendMessage(ChatColor.RED + "Sorry, " + book.getBook() + 
					" is not available yet in the " + tran.toUpperCase() + " translation.");
			return;
		}
		if(args.length >= 2){
			try{
				if(args[1].equalsIgnoreCase("#") || args[1].equalsIgnoreCase("?")
						|| args[1].equalsIgnoreCase("info") || Integer.parseInt(args[1]) <= book.getChp()){
					echp = echp.fromString(book.getBook());
					chp = args[1];
				}else{
					sender.sendMessage(ChatColor.RED + "Sorry, that chapter does not exist in " + 
							book.getBook() + ".");
					return;
				}
			}catch(NumberFormatException e){
				sender.sendMessage(ChatColor.RED + "Sorry, you must either type #, ?, info, or a number.");
				return;
			}
			if(args.length >= 3){
				try{
					if(args[2].equalsIgnoreCase("#") || args[2].equalsIgnoreCase("?") ||
						args[2].equalsIgnoreCase("info") || 
						Integer.parseInt(args[2]) <= echp.getNum(Integer.parseInt(args[1]))){
						v = args[2];
					}else{
						sender.sendMessage(ChatColor.RED + "Sorry, that verse does not exist " +
							"in " + book.getBook() + " Chapter " + chp + ".");
						return;
					}
				}catch(NumberFormatException e){
					sender.sendMessage(ChatColor.RED + "Sorry, you must either type #, ?, info, or a number.");
					return;
				}
				if(args.length >= 4){
					tran = args[3].toUpperCase();
				}
			}
		}
		bookName = book.getBook();
		if(MainCommandExecutor.tranCheck(plugin, sender, tran) == false){
			return;
		}
		if(MainCommandExecutor.checkForYML(plugin, sender, tran, bookName) == false){
			return;
		}
		String ref = Reference.make(book, chp, v);
		if(Reference.check(plugin, sender, bookName, tran, ref) == false){
			return;
		}
		String verse = plugin.getBook(tran, bookName).getString(ref);
		sender.sendMessage(ChatColor.GREEN + verse);
	}
}
