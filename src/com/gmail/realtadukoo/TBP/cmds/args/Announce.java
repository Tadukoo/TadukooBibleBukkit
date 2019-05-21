package com.gmail.realtadukoo.TBP.cmds.args;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TB.Bible.EnumBible;
import com.gmail.realtadukoo.TB.Bible.EnumTranslations;
import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumCmds;
import com.gmail.realtadukoo.TBP.cmds.Records;
import com.gmail.realtadukoo.TBP.cmds.Verse;
import com.gmail.realtadukoo.TBP.cmds.handling.Args;

public class Announce {
	public static void run(TB plugin, CommandSender sender, String playerType, String[] args){
		if(Args.argsLengthCheck(sender, args, 2, 7, plugin.getLanguage().getString("help.pages.ann.usage"))){
			return;
		}
		EnumBible book;
		EnumTranslations etran = EnumTranslations.fromAbbreviation(TB.config.getString("default.translation"));
		String bookName = null;
		String chp = null;
		String v = null;
		String tran = etran.getAbbreviation();
		EnumCmds cmds = EnumCmds.ANNOUNCE;
		boolean bookSet = false, chpSet = false, vSet = false, tranSet = false;
		boolean favorite = false;
		//boolean previous = false, next = false, last = false;
		int i = 1;
		while(args.length >= i + 1 && args[i] != null){
			if(!bookSet && Args.isBook(cmds, args, i) != null){
				book = Args.isBook(cmds, args, i);
				bookName = book.getBook();
				i = Args.getCurrentArg(cmds, args, i);
				bookSet = true;
			}else if(!chpSet && !vSet && args[i].contains(":")){
				String[] chpV = args[i].split(":");
				if(cmds.fromString(chpV[0]) == EnumCmds.FAVORITE){
					favorite = true;
					chp = chpV[1];
					chpSet = true;
				}else{
					chp = chpV[0];
					v = chpV[1];
					chpSet = true;
					vSet = true;
				}
				i++;
			}else if(!tranSet && Args.tranCheck(sender, args[i]) != null){
				tran = Args.tranCheck(sender, args[i]);
				tranSet = true;
				i++;
			/*}else if(!previous && cmds.fromString(args[i]) == EnumCmds.PREVIOUS){
				previous = true;
				i++;
			}else if(!next && cmds.fromString(args[i]) == EnumCmds.NEXT){
				next = true;
				i++;
			}else if(!last && cmds.fromString(args[i]) == EnumCmds.LAST){
				last = true;
				i++;*/
			}else if(!favorite && (cmds.fromString(args[i]) == EnumCmds.FAVORITE)){
				favorite = true;
				i++;
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
					Args.unknownArg(plugin, sender, args[i]);
					return;
				}
			}
		}
		if(favorite && chpSet){
			int num = Integer.parseInt(chp);
			String rec[] = Records.getFavorite(plugin, playerType, sender.getName(), num);
			bookName = rec[0];
			chp = rec[1];
			v = rec[2];
			tran = rec[3];
			bookSet = true;
			chpSet = true;
			vSet = true;
		}
		if(!bookSet || !chpSet || !vSet){
			sender.sendMessage(ChatColor.RED + plugin.getLanguage().getString("help.pages.ann.usage"));
			return;
		}
		Verse.check(plugin, sender, playerType, bookName, chp, v, tran, "announce", null, false, false);
	}
}
