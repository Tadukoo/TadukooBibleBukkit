package com.gmail.realtadukoo.TBP.cmds.args;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TB.Enums.EnumTranslations;
import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumBooks;
import com.gmail.realtadukoo.TBP.Enums.EnumCmds;
import com.gmail.realtadukoo.TBP.cmds.Records;
import com.gmail.realtadukoo.TBP.cmds.Verse;
import com.gmail.realtadukoo.TBP.cmds.handling.Args;
import com.gmail.realtadukoo.TBP.cmds.handling.Checks;

public class Send {
	public static void run(TB plugin, String playerType, CommandSender sender, String[] args, boolean permsOn){
		if(Args.argsLengthCheck(sender, args, 3, 10, plugin.getLanguage().getString("help.pages.send.usage"))){
			return;
		}
		EnumBooks book = EnumBooks.GENESIS;
		EnumTranslations etran = EnumTranslations.fromAbbreviation(TB.config.getString("default.translation"));
		book = book.getDefault();
		String bookName = book.getBook();
		String chp = TB.config.getString("default.chapter");
		String v = TB.config.getString("default.verse");
		String tran = etran.getAbbreviation();
		EnumCmds cmds = EnumCmds.READ;
		int i = 1;
		String pName = "";
		EnumCmds ecmd = EnumCmds.ANONYMOUS;
		boolean anonymous = false;
		boolean bypass = false;
		boolean bookSet = false, chpSet = false, vSet = false, tranSet = false, playerSet = false;
		boolean favorite = false;
		while(args.length >= i + 1 && args[i] != null){
			if(!bookSet && Args.isBook(book, cmds, args, i) != null){
				book = Args.isBook(book, cmds, args, i);
				bookName = book.getBook();
				i = Args.getCurrentArg(book, cmds, args, i);
				bookSet = true;
			}else if(!anonymous && ecmd.fromString(args[i]) == EnumCmds.ANONYMOUS){
				if(Checks.permCheck(playerType, plugin, sender, "Bible", "anonymous.verse", permsOn)){
					anonymous = true;
				}else{
					sender.sendMessage(ChatColor.RED + "Sorry, you don't have permission to send anonymous "
							+ "verses.");
					return;
				}
				i++;
			}else if(!bypass && ecmd.fromString(args[i]) == EnumCmds.BYPASS){
				if(Checks.permCheck(playerType, plugin, sender, "Bible", "bypass.verse", permsOn)){
					bypass = true;
				}else{
					sender.sendMessage(ChatColor.RED + "Sorry, you don't have permission to bypass verse "
							+ "sending settings.");
					return;
				}
				i++;
			}else if(!tranSet && Args.tranCheck(sender, args[i]) != null){
				tran = Args.tranCheck(sender, args[i]);
				tranSet = true;
				i++;
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
					if(!playerSet){
						pName = args[i];
						playerSet = true;
						i++;
					}else{
						Args.unknownArg(plugin, sender, args[i]);
						return;
					}
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
		if(!playerSet || !bookSet || !chpSet || !vSet){
			sender.sendMessage(ChatColor.RED + plugin.getLanguage().getString("help.pages.send.usage"));
			return;
		}
		Verse.check(plugin, sender, playerType, bookName, chp, v, tran, book, "send", pName, anonymous, bypass);
	}
}
