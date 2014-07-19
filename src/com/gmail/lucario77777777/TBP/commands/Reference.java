package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;

public class Reference {
	public static String make(EnumBooks book, String chp, String v){
		String ref = null;
		if(chp.equalsIgnoreCase("info") || chp.equalsIgnoreCase("?")){
			ref = book.getAlias() + "Info";
		}else if(chp.equalsIgnoreCase("#")){
			ref = book.getAlias() + "#";
		}else if(v.equalsIgnoreCase("#") || v.equalsIgnoreCase("?") || v.equalsIgnoreCase("info")){
			v = "info";
		}
		if(ref == null){
			ref = "ch" + chp + "v" + v;
		}
		return ref;
	}
	
	public static boolean check(TB plugin, CommandSender sender, String bookName, String tran, String ref){
		if(plugin.getBook(tran, bookName).getString(ref) == null){
			sender.sendMessage(ChatColor.RED + "An error occurred. Please make sure you typed in a " +
					"chapter/verse that exists.");
			return false;
		}else{
			return true;
		}
	}
}
