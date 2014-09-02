package com.gmail.lucario77777777.TBP.cmdhandling;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.lucario77777777.TBP.TB;

public class Sending {
	public static void sendVerseToPlayer(TB plugin, CommandSender sender, String pName, String bookName,
			String chp, String v, String tran, String ref){
		String verse = plugin.getBook(bookName, tran).getString(ref);
		if(bookName.contains("1") || bookName.contains("2") || bookName.contains("3") || 
				bookName.contains("SongofSongs")){
			bookName = bookName.replace("1", "1 ");
			bookName = bookName.replace("2", "2 ");
			bookName = bookName.replace("3", "3 ");
			bookName = bookName.replace("SongofSongs", "Song of Songs");
		}
		sender.sendMessage(ChatColor.GREEN + verse + " (" + bookName + " " + chp + ":" + v + " " + 
		tran + ")");
		Records.savepRecs("verse", pName, bookName, chp, v, tran, null);
	}
	
	public static void sendVerseToOtherPlayer(TB plugin, CommandSender sender, Player player, String bookName,
			String chp, String v, String tran, String ref, boolean anonymous){
		String verse = plugin.getBook(bookName, tran).getString(ref);
		if(bookName.contains("1") || bookName.contains("2") || bookName.contains("3") || 
				bookName.contains("SongofSongs")){
			bookName = bookName.replace("1", "1 ");
			bookName = bookName.replace("2", "2 ");
			bookName = bookName.replace("3", "3 ");
			bookName = bookName.replace("SongofSongs", "Song of Songs");
		}
		String senderName;
		if(anonymous){
			senderName = "anonymous";
		}else{
			senderName = sender.getName();
		}
		player.sendMessage(ChatColor.GOLD + "[" + senderName + "->" + player.getName() + "] " + 
		ChatColor.GREEN + verse + " (" + bookName + " " + chp + ":" + v + " " + tran + ")");
	}
	
	public static void sendInfoToPlayer(TB plugin, CommandSender sender, String info){
		sender.sendMessage(ChatColor.GREEN + info);
	}
	
	public static void broadcast(TB plugin, CommandSender sender, String bookName, String chp, String v,
			String tran, String ref){
		String verse = plugin.getBook(bookName, tran).getString(ref);
		Bukkit.broadcast(ChatColor.GREEN + verse + " (" + bookName + " " + chp + ":" + v + " " + tran + ")",
				"TadukooBible.verse.announceget");
		plugin.getLogger().info(sender.getName() + " broadcasted " + bookName + " " + chp + ":" 
				+ v + " from the " + tran + " translation.");
	}
}
