package com.gmail.realtadukoo.TBP.cmds;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.realtadukoo.TBP.TB;

public class Sending {
	// Sends a verse to the sender.
	public static void getVerse(TB plugin, CommandSender sender, String playerType, String pName, 
			String bookName, String chp, String v, String tran, String ref){
		// Get the verse from the file.
		String verse = plugin.getBook(bookName, tran).getString(ref);
		if(bookName.contains("1") || bookName.contains("2") || bookName.contains("3") || 
				bookName.contains("SongofSongs")){
			// Change the book name to have spaces where needed.
			bookName = bookName.replace("1", "1 ");
			bookName = bookName.replace("2", "2 ");
			bookName = bookName.replace("3", "3 ");
			bookName = bookName.replace("SongofSongs", "Song of Songs");
		}
		// Send the verse to the player along with the reference.
		sender.sendMessage(ChatColor.GREEN + verse + " (" + bookName + " " + chp + ":" + v + " " + 
		tran + ")");
		// Record this verse in the players.yml file.
		Records.savepRecs(plugin, playerType, "verse", pName, bookName, chp, v, tran, null);
	}
	
	/*
	 *  Used for sending verses to players other than yourself.
	 *  Sender = person who typed command, pName = name of person to send verse to, bookName, chp, v, and tran 
	 *  are used after the verse to form the reference, ref = reference, which is used to get the verse, 
	 *  anonymous decides whether the person will know who sent it or not, and bypass is used to bypass 
	 *  being blocked or if the player opted out of receiving verses.
	 */
	public static void sendVerseToOtherPlayer(TB plugin, CommandSender sender, String pName, String bookName,
			String chp, String v, String tran, String ref, boolean anonymous, boolean bypass){
		// Get the verse from the file.
		String verse = plugin.getBook(bookName, tran).getString(ref);
		// Get the player.
		@SuppressWarnings("deprecation")
		Player player = plugin.getServer().getPlayer(pName);
		// Check if player is online.
		if(!player.isOnline()){
			sender.sendMessage(ChatColor.RED + pName + " is not online!");
			return;
		}
		// Check if player has permission to receive verses.
		if(!player.hasPermission("TadukooBible.verse.receive")){
			sender.sendMessage(ChatColor.RED + player.getName() + " does not have permission to receive " +
					"verses!");
			sender.sendMessage(ChatColor.RED + "TadukooBible.verse.receive");
			return;
		}
		if(bookName.contains("1") || bookName.contains("2") || bookName.contains("3") || 
				bookName.contains("SongofSongs")){
			// Adds spaces to the book name where needed.
			bookName = bookName.replace("1", "1 ");
			bookName = bookName.replace("2", "2 ");
			bookName = bookName.replace("3", "3 ");
			bookName = bookName.replace("SongofSongs", "Song of Songs");
		}
		String senderName; // Used to say who sent the verse.
		if(anonymous){
			senderName = "anonymous";
		}else{
			senderName = sender.getName();
		}
		UUID ID = player.getUniqueId(); // Used for in players.yml
		if(!bypass){ // If not bypassed, do this.
			// If the sender is blocked
			if(TB.getpRec().getString(ID + ".blocked." + sender.getName() + ".verse") != null && 
					!TB.getpRec().getBoolean(ID + ".blocked." + sender.getName() + ".verse")){
				// Return a message to the sender.
				sender.sendMessage(ChatColor.RED + player.getName() + " has blocked you from sending verses " +
						"to him/her.");
				return;
			}else if(TB.getpRec().getString(ID + ".receive.verse") != null && 
					!TB.getpRec().getBoolean(ID + ".receive.verse")){
				// If the player has opted out of receiving verses, return a message to the sender.
				sender.sendMessage(ChatColor.RED + player.getName() + "has opted out of receiving verses.");
				return;
			}
		}
		// Send the player a message that the sender sent them a verse and then the verse and reference.
		player.sendMessage(ChatColor.GOLD + "[" + senderName + "->" + player.getName() + "] " + 
		ChatColor.GREEN + verse + " (" + bookName + " " + chp + ":" + v + " " + tran + ")");
		sender.sendMessage(ChatColor.GREEN + "Verse sent!");
	}
	
	// Sends information to a player.
	public static void sendInfoToPlayer(TB plugin, CommandSender sender, String info){
		sender.sendMessage(ChatColor.GREEN + info);
	}
	
	// Broadcasts a verse to the server.
	public static void broadcastVerse(TB plugin, CommandSender sender, String bookName, String chp, String v,
			String tran, String ref){
		// Get verse from the file.
		String verse = plugin.getBook(bookName, tran).getString(ref);
		// Broadcast the verse to anyone who has the TadukooBible.verse.announceget permission.
		Bukkit.broadcast(ChatColor.GREEN + verse + " (" + bookName + " " + chp + ":" + v + " " + tran + ")",
				"TadukooBible.verse.announceget");
		// Log this to the console.
		plugin.getLogger().info(sender.getName() + " broadcasted " + bookName + " " + chp + ":" 
				+ v + " from the " + tran + " translation.");
	}
}
