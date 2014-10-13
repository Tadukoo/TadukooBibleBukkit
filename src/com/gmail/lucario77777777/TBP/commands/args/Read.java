package com.gmail.lucario77777777.TBP.commands.args;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumChps;
import com.gmail.lucario77777777.TBP.Enums.EnumCmds;
import com.gmail.lucario77777777.TBP.Enums.EnumTrans;
import com.gmail.lucario77777777.TBP.commands.Information;
import com.gmail.lucario77777777.TBP.commands.Verse;
import com.gmail.lucario77777777.TBP.commands.handling.Args;

public class Read {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 0, 7, plugin.getLanguage().getString("help.pages.read.usage"))){
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
		boolean cont = true;
		boolean bookSet = false;
		boolean chpSet = false;
		boolean vSet = false;
		boolean tranSet = false;
		while(cont){
			if(args.length >= i + 1){
				if(!bookSet && Args.isBook(book, cmds, args, i) != null){
					book = Args.isBook(book, cmds, args, i);
					bookName = book.getBook();
					echp = echp.fromString(bookName);
					i = Args.getCurrentArg(book, cmds, args, i);
					bookSet = true;
				}else if(args[i].equalsIgnoreCase("info") || args[i].equalsIgnoreCase("?") || 
						args[i].equalsIgnoreCase("#")){
					if(vSet || (chpSet && !bookSet)){
						sender.sendMessage(ChatColor.RED + 
								plugin.getLanguage().getString("command.error.generic"));
						return;
					}else if(bookSet && !chpSet){
						Information.bookInfo(sender, plugin, book);
						cont = false;
						break;
					}else if(bookSet && chpSet){
						Information.chpInfo(sender, plugin, echp, chp);
						cont = false;
						break;
					}
				}else if(!tranSet && Args.tranCheck(sender, args[i]) != null){
					tran = Args.tranCheck(sender, args[i]);
					i++;
				}else if(!chpSet && !vSet && args[i].contains(":")){
					String[] chpV = args[i].split(":");
					chp = chpV[0];
					v = chpV[1];
					i++;
					chpSet = true;
					vSet = true;
				}else{
					try{
						if(!chpSet && !vSet){
							int c = Integer.parseInt(args[i]);
							chp = String.valueOf(c);
							i++;
						}else if(chpSet && !vSet){
							int verse = Integer.parseInt(args[i]);
							v = String.valueOf(verse);
							i++;
						}else{
							Args.unknownArg(plugin, sender, args[i]);
							cont = false;
							return;
						}
					}catch(NumberFormatException e){
						Args.unknownArg(plugin, sender, args[i]);
						cont = false;
						return;
					}
				}
			}else{
				cont = false;
			}
		}
		Verse.read(plugin, sender, bookName, chp, v, tran, book, echp);
	}
}
