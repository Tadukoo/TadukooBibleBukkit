package com.gmail.realtadukoo.TBP.commands.args;

import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumBooks;
import com.gmail.realtadukoo.TBP.Enums.EnumChps;
import com.gmail.realtadukoo.TBP.Enums.EnumCmds;
import com.gmail.realtadukoo.TBP.Enums.EnumTrans;
import com.gmail.realtadukoo.TBP.commands.Verse;
import com.gmail.realtadukoo.TBP.commands.handling.Args;

public class Send {
	public static void run(TB plugin, String playerType, CommandSender sender, String[] args, boolean permsOn){
		if(Args.argsLengthCheck(sender, args, 4, 9, plugin.getLanguage().getString("help.pages.send.usage"))){
			return;
		}
		EnumBooks book = EnumBooks.GENESIS;
		EnumChps echp = EnumChps.GENESIS;
		EnumTrans etran = EnumTrans.KJV;
		book = book.getDefault();
		echp = echp.getDefault();
		etran = etran.getDefault();
		String bookName = book.getBook();
		String chp = TB.config.getString("default.chapter");
		String v = TB.config.getString("default.verse");
		String tran = etran.getTran();
		EnumCmds cmds = EnumCmds.READ;
		int i = 1;
		String pName = "";
		EnumCmds ecmd = EnumCmds.ANONYMOUS;
		boolean anonymous = false;
		boolean bypass = false;
		boolean bookSet = false, chpSet = false, vSet = false, tranSet = false, pSet = false;
		while(args.length >= i + 1 && args[i] != null){
			if(!bookSet && Args.isBook(book, cmds, args, i) != null){
				book = Args.isBook(book, cmds, args, i);
				bookName = book.getBook();
				echp = echp.fromString(bookName, 0);
				i = Args.getCurrentArg(book, cmds, args, i);
				bookSet = true;
			}else if(!anonymous && ecmd.fromString(args[i]) == EnumCmds.ANONYMOUS){
				anonymous = true;
			}else if(!bypass && ecmd.fromString(args[i]) == EnumCmds.BYPASS){
				bypass = true;
			}else if(!tranSet && Args.tranCheck(sender, args[i]) != null){
				tran = Args.tranCheck(sender, args[i]);
				tranSet = true;
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
						chpSet = true;
					}else if(chpSet && !vSet){
						int verse = Integer.parseInt(args[i]);
						v = String.valueOf(verse);
						i++;
						vSet = true;
					}else{
						Args.unknownArg(plugin, sender, args[i]);
						return;
					}
				}catch(NumberFormatException e){
					if(!pSet){
						pName = args[i];
						pSet = true;
					}else{
						Args.unknownArg(plugin, sender, args[i]);
						return;
					}
				}
			}
		}
		Verse.check(plugin, sender, bookName, chp, v, tran, book, echp, "send", pName, anonymous, bypass);
	}
}
