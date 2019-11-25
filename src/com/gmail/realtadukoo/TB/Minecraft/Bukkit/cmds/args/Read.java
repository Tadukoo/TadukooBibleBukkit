package com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.args;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TB.API.Constants.EnumBible;
import com.gmail.realtadukoo.TB.API.Constants.EnumTranslation;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.TB;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.Enums.EnumCmds;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.Information;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.Records;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.Verse;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.handling.Args;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.handling.Checks;

public class Read {
	public static void run(TB plugin, CommandSender sender, String playerType, String[] args){
		if(Args.argsLengthCheck(sender, args, 0, 7, plugin.getLanguage().getString("help.pages.read.usage"))){
			return;
		}
		EnumTranslation etran = EnumTranslation.fromAbbreviation(TB.config.getString("default.translation"));
		EnumBible book = EnumBible.fromBook(TB.config.getString("default.book"));
		String bookName = book.getBook();
		String chp = TB.config.getString("default.chapter");
		String v = TB.config.getString("default.verse");
		String tran = etran.getAbbreviation();
		EnumCmds cmds = EnumCmds.READ;
		int i = 0;
		if(args.length >= 1 && Args.isCmd(cmds, args[0]) == EnumCmds.READ){
			i++;
		}
		boolean bookSet = false, chpSet = false, vSet = false, tranSet = false;
		boolean favorite = false;
		while(args.length >= i + 1 && args[i] != null){
			if(!bookSet && Args.isBook(cmds, args, i) != null){
				book = Args.isBook(cmds, args, i);
				bookName = book.getBook();
				i = Args.getCurrentArg(cmds, args, i);
				bookSet = true;
			}else if(args[i].equalsIgnoreCase("info") || args[i].equalsIgnoreCase("?") || 
					args[i].equalsIgnoreCase("#")){
				if(vSet || (chpSet && !bookSet)){
					sender.sendMessage(ChatColor.RED + plugin.getLanguage().getString("command.error.generic"));
					return;
				}else if(bookSet && !chpSet){
					Information.bookInfo(sender, plugin, bookName);
					return;
				}else if(bookSet && chpSet){
					Information.chpInfo(sender, plugin, book, chp);
					return;
				}
			}else if(!tranSet && Args.tranCheck(sender, args[i]) != null){
				tran = Args.tranCheck(sender, args[i]);
				i++;
				tranSet = true;
				if(!Checks.tranPerm(plugin, sender, tran)){
					return;
				}
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
		}
		Verse.check(plugin, sender, playerType, bookName, chp, v, tran, "get", null, false, false);
	}
}
