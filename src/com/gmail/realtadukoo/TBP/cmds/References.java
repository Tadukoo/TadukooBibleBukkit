package com.gmail.realtadukoo.TBP.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumBooks;

public class References {
	public static String makeRef(EnumBooks book, String chp, String v){
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
	
	public static boolean checkRef(TB plugin, CommandSender sender, String bookName, String tran, String ref){
		if(plugin.getBook(bookName, tran).getString(ref) == null){
			sender.sendMessage(ChatColor.RED + "An error occurred. Please make sure you typed in a " +
					"chapter/verse that exists.");
			return false;
		}else{
			return true;
		}
	}
	
	public static String[] breakDownRefNoTran(String ref){
		String[] refBroken = new String[3];
		String[] refBroken1 = ref.split(":");
		String[] refBroken2 = refBroken1[0].split(" ");
		
		refBroken[0] = "";
		for(int i = 0; i < refBroken2.length - 1; i++){
			refBroken[0] += refBroken2[i];
		}
		refBroken[1] = refBroken2[refBroken2.length - 1];
		refBroken[2] = refBroken1[1];
		
		return refBroken;
	}
}
