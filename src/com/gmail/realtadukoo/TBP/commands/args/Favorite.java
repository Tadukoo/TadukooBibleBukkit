package com.gmail.realtadukoo.TBP.commands.args;

import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumBooks;
import com.gmail.realtadukoo.TBP.Enums.EnumChps;
import com.gmail.realtadukoo.TBP.Enums.EnumCmds;
import com.gmail.realtadukoo.TBP.Enums.EnumTrans;
import com.gmail.realtadukoo.TBP.commands.Records;
import com.gmail.realtadukoo.TBP.commands.handling.Args;
import com.gmail.realtadukoo.TBP.commands.handling.Checks;

public class Favorite {
	public static void run(TB plugin, CommandSender sender, String playerType, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 7, 
				plugin.getLanguage().getString("help.pages.favorite.usage"))){
			return;
		}
		String rec[] = Records.getpRecs(plugin, playerType, "verse", sender.getName());
		String bookName = rec[0];
		String chp = rec[1];
		String v = rec[2];
		String tran = rec[3];
		EnumBooks book = EnumBooks.GENESIS;
		EnumChps echp = EnumChps.GENESIS;
		EnumTrans etran = EnumTrans.KJV;
		book = book.fromString(bookName);
		echp = echp.fromString(bookName, 0);
		etran = etran.fromString(tran);
		EnumCmds cmds = EnumCmds.FAVORITE;
		int page = 1;
		int i = 1;
		boolean bookSet = false, chpSet = false, vSet = false, tranSet = false, pageSet = false;
		boolean list = false;
		while(args.length >= i +1 && args[i] != null){
			if(!list && args[i].equalsIgnoreCase("list")){
				list = true;
				i++;
			}else if(!list && !bookSet && Args.isBook(book, cmds, args, i) != null){
				book = Args.isBook(book, cmds, args, i);
				bookName = book.getBook();
				echp = echp.fromString(bookName, 0);
				i = Args.getCurrentArg(book, cmds, args, i);
				bookSet = true;
			}else if(!list && !tranSet && Args.tranCheck(sender, args[i]) != null){
				tran = Args.tranCheck(sender, args[i]);
				i++;
				tranSet = true;
				if(!Checks.tranPerm(plugin, sender, tran)){
					return;
				}
			}else if(!list && !chpSet && !vSet && args[i].contains(":")){
				String[] chpV = args[i].split(":");
				chp = chpV[0];
				v = chpV[1];
				i++;
				chpSet = true;
				vSet = true;
			}else{
				try{
					if(!list && !chpSet && !vSet){
						int c = Integer.parseInt(args[i]);
						chp = String.valueOf(c);
						i++;
						chpSet = true;
					}else if(!list && chpSet && !vSet){
						int verse = Integer.parseInt(args[i]);
						v = String.valueOf(verse);
						i++;
						vSet = true;
					}else if(list && !pageSet){
						page = Integer.parseInt(args[i]);
						i++;
						pageSet = true;
					}else{
						Args.unknownArg(plugin, sender, args[i]);
						return;
					}
				}catch(NumberFormatException e){
					Args.unknownArg(plugin, sender, args[i]);
					return;
				}
			}
		}
		String pName = sender.getName();
		if(list){
			Records.listFavorites(plugin, sender, playerType, pName, page);
		}else{
			Records.saveFavorite(plugin, playerType, bookName, chp, v, tran, pName);
		}
	}
}
