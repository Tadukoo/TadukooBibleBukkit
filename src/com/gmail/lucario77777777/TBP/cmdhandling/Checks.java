package com.gmail.lucario77777777.TBP.cmdhandling;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumChps;

public class Checks {
	public static boolean consoleCheck(CommandSender sender, String playerType) {
		if(playerType == "console"){
			sender.sendMessage(ChatColor.RED + "You must be a player!");
			return false;
		}else{
			return true;
		}
	}

	public static boolean checkForYML(TB plugin, CommandSender sender, String tran, String bookName) {
		if(plugin.getBook(bookName, tran) == null){
			if(sender != null){
				sender.sendMessage(ChatColor.RED + "Sorry, " + tran + "/" + bookName 
					+ ".yml does not exist.");
			}
			return false;
		}else{
			return true;
		}
	}
	
	public static boolean permCheck(String playerType, CommandSender sender, String perm, boolean permsOn){
		if(permsOn && playerType == "player"){
			Player player = (Player) sender;
			if(player.hasPermission("TadukooBible." + perm)){
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "You don't have permission.");
				sender.sendMessage(ChatColor.RED + "You need TadukooBible." + perm);
				return false;
			}
		}else{
			return true;
		}
	}
	
	public static String bookCheck(CommandSender sender, EnumBooks book, String bookName, String chp, String v){
		try{
			EnumChps echp = EnumChps.GENESIS;
			echp = echp.fromString(bookName);
			if(Integer.parseInt(chp) > book.getChp()){
				sender.sendMessage(ChatColor.RED + "That chapter does not exist in " + bookName + "!");
				return null;
			}
			if(Integer.parseInt(v) > echp.getNum(Integer.parseInt(chp))){
				sender.sendMessage(ChatColor.RED + "That verse does not exist in " + bookName + " Chapter" + 
						chp + "!");
				return null;
			}
		}catch(NumberFormatException e){
			sender.sendMessage(ChatColor.RED + "Chapter and verse must be numbers!");
			sender.sendMessage(ChatColor.RED + "/bible announce <book> <chapter> <verse> [translation]");
			return null;
		}
		String ref = References.makeRef(book, chp, v);
		return ref;
	}
}
