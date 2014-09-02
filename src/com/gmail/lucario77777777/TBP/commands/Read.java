package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumChps;
import com.gmail.lucario77777777.TBP.Enums.EnumCmds;
import com.gmail.lucario77777777.TBP.Enums.EnumTrans;
import com.gmail.lucario77777777.TBP.cmdhandling.Args;
import com.gmail.lucario77777777.TBP.cmdhandling.Checks;
import com.gmail.lucario77777777.TBP.cmdhandling.References;
import com.gmail.lucario77777777.TBP.cmdhandling.Sending;

public class Read {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 0, 7, "/bible [book] [chapter] [verse] " +
				"[translation] or /bible [book] [chapter:verse] [translation] or " +
				"/bible [alias] [book] [chapter] [verse] [translation]")){
			return;
		}
		EnumBooks book = EnumBooks.GENESIS;
		EnumChps echp = EnumChps.GENESIS;
		EnumTrans etran = EnumTrans.KJV;
		book = book.getDefault();
		echp = echp.getDefault();
		etran = etran.getDefault();
		String bookName = book.getBook();
		String chp = TB.config.getString("DefaultChapter");
		String v = TB.config.getString("DefaultVerse");
		String tran = etran.getTran();
		EnumCmds cmds = EnumCmds.READ;
		int i = 0;
		if(args.length >= 1 && Args.isCmd(cmds, args[0]) == EnumCmds.READ){
			i++;
		}
		if(args.length >= i + 1 && Args.isBook(book, cmds, args, i) != null){
			book = Args.isBook(book, cmds, args, i);
			bookName = book.getBook();
			i = Args.getCurrentArg(book, cmds, args, i);
			if(args.length >= i + 1){
				if(args[i].equalsIgnoreCase("info") ||args[i].equalsIgnoreCase("?")){
					String msg = book.getDesc();
					sender.sendMessage(ChatColor.GREEN + msg);
					return;
				}else if(args[i].equalsIgnoreCase("#")){
					String msg = bookName + " has " + book.getChp() + " chapters.";
					sender.sendMessage(ChatColor.GREEN + msg);
					return;
				}else if(args[i].contains(":")){
					String[] chpV = args[i].split(":");
					chp = chpV[0];
					v = chpV[1];
					i++;
				}else{
					chp = args[i];
					i++;
					if(Integer.parseInt(chp) > book.getNum()){
						sender.sendMessage(ChatColor.RED + bookName + " does not have that many chapters!");
						return;
					}
					if(args.length >= i + 1){
						if(args[i].equalsIgnoreCase("#")){
							String msg = bookName + " Chapter " + chp + " has " + 
									echp.getNum(Integer.parseInt(chp)) + " verses.";
							sender.sendMessage(ChatColor.GREEN + msg);
							return;
						}else{
							v = args[i];
							i++;
							if(Integer.parseInt(v) > echp.getNum(Integer.parseInt(chp))){
								sender.sendMessage(ChatColor.RED + bookName + " Chapter " + chp + " does not " +
										"have that many verses!");
								return;
							}
						}
					}
				}
				if(args.length >= i + 1 && Args.tranCheck(sender, args[i]) != null){
					tran = Args.tranCheck(sender, args[i]);
				}
			}
		}
		if(!book.isAvailable(tran)){
			Args.bookNotAvailable(sender, book, tran);
			return;
		}
		if(!Checks.checkForYML(plugin, sender, bookName, tran)){
			return;
		}
		String pName = sender.getName();
		String ref = References.makeRef(book, chp, v);
		if(!References.checkRef(plugin, sender, bookName, tran, ref)){
			return;
		}
		Sending.sendVerseToPlayer(plugin, sender, pName, bookName, chp, v, tran, ref);
	}
}
