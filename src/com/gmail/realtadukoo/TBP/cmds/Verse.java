package com.gmail.realtadukoo.TBP.cmds;

import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TB.Bible.EnumBibleChapters;
import com.gmail.realtadukoo.TBP.TB;
//import com.gmail.realtadukoo.TBP.commands.handling.Args; TODO: Add check for availability using EnumAvail.
import com.gmail.realtadukoo.TBP.cmds.handling.Checks;

public class Verse{
	public static void check(TB plugin, CommandSender sender, String playerType, 
			String bookName, String chp, String v, String tran, 
			String type, String pName, boolean anonymous, boolean bypass){
		if(Integer.parseInt(chp) > EnumBibleChapters.fromBook(bookName).getNumChapters()){
			String error = plugin.getLanguage().getString("command.error.chpdoesntexist");
			error = error.replaceAll("\\{book\\}", bookName);
			if(type.equalsIgnoreCase("auto-announce")){
				plugin.getLogger().log(Level.WARNING, ChatColor.RED + error);
			}else{
				sender.sendMessage(ChatColor.RED + error);
			}
			return;
		}
		
		EnumBibleChapters echp = EnumBibleChapters.fromBook(bookName);
		if(Integer.parseInt(v) > echp.getNum(Integer.parseInt(chp))){
			String error = plugin.getLanguage().getString("command.error.vdoesntexist");
			error = error.replaceAll("\\{book\\}", bookName);
			error = error.replaceAll("\\{chp\\}", chp);
			if(type.equalsIgnoreCase("auto-announce")){
				plugin.getLogger().log(Level.WARNING, ChatColor.RED + error);
			}else{
				sender.sendMessage(ChatColor.RED + error);
			}
			return;
		}
		
		/*
		 * TODO: Add check for availability using EnumAvail.
		 * if(!book.isAvailable(tran)){
			Args.bookNotAvailable(sender, book, tran);
			return;
		}*/
		
		if(!type.equalsIgnoreCase("auto-announce") && 
				!Checks.checkForYML(plugin, sender, bookName, tran)){
			return;
		}
		
		if(pName == null && !type.equalsIgnoreCase("auto-announce")){
			pName = sender.getName();
		}
		
		String ref = References.makeRef(bookName, chp, v);
		
		if(!type.equalsIgnoreCase("auto-announce") && 
				!References.checkRef(plugin, sender, bookName, tran, ref)){
			return;
		}
		
		if(type == "get"){
			Sending.getVerse(plugin, sender, playerType, pName, bookName, chp, v, tran, ref);
		}else if(type == "send"){
			Sending.sendVerseToOtherPlayer(plugin, sender, pName, bookName, chp, v, tran, ref, 
					anonymous, bypass);
		}else if(type == "announce"){
			Sending.broadcastVerse(plugin, sender, bookName, chp, v, tran, ref);
		}else if(type == "auto-announce"){
			Sending.broadcastVerse(plugin, bookName, chp, v, tran, ref);
		}
	}
}
