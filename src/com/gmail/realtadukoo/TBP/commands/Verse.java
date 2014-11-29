package com.gmail.realtadukoo.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumBooks;
import com.gmail.realtadukoo.TBP.Enums.EnumChps;
//import com.gmail.realtadukoo.TBP.commands.handling.Args; TODO: Add check for availability using EnumAvail.
import com.gmail.realtadukoo.TBP.commands.handling.Checks;

public class Verse {
	public static void check(TB plugin, CommandSender sender, String playerType, String bookName, String chp, 
			String v, String tran, EnumBooks book, EnumChps echp, String type, String pName, boolean anonymous, 
			boolean bypass){
		if(Integer.parseInt(chp) > book.getChp()){
			String error = plugin.getLanguage().getString("command.error.chpdoesntexist");
			error = error.replaceAll("\\{book\\}", bookName);
			sender.sendMessage(ChatColor.RED + error);
			return;
		}
		if(Integer.parseInt(v) > echp.getNum(Integer.parseInt(chp))){
			String error = plugin.getLanguage().getString("command.error.vdoesntexist");
			error = error.replaceAll("\\{book\\}", bookName);
			error = error.replaceAll("\\{chp\\}", chp);
			sender.sendMessage(ChatColor.RED + error);
			return;
		}
		/*
		 * TODO: Add check for availability using EnumAvail.
		 * if(!book.isAvailable(tran)){
			Args.bookNotAvailable(sender, book, tran);
			return;
		}*/
		if(!Checks.checkForYML(plugin, sender, bookName, tran)){
			return;
		}
		if(pName == null){
			pName = sender.getName();
		}
		String ref = References.makeRef(book, chp, v);
		if(!References.checkRef(plugin, sender, bookName, tran, ref)){
			return;
		}
		if(type == "get"){
			Sending.getVerse(plugin, sender, playerType, pName, bookName, chp, v, tran, ref);
		}else if(type == "send"){
			Sending.sendVerseToOtherPlayer(plugin, sender, pName, bookName, chp, v, tran, ref, anonymous, bypass);
		}else if(type == "announce"){
			Sending.broadcastVerse(plugin, sender, bookName, chp, v, tran, ref);
		}
	}
}
