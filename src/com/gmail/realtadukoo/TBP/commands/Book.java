package com.gmail.realtadukoo.TBP.commands;

import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumBooks;

public class Book{
	
	@SuppressWarnings("deprecation")
	public static void Run(TB plugin, CommandSender sender, String tran, String bookName, String part,
			String type, String p, boolean anonymous, boolean bypass){
		String pName = null;
		Player player = null;
		if(type == "get"){
			player = (Player) sender;
			pName = player.getName();
		}else if(type == "send"){
			player = sender.getServer().getPlayer(p);
			pName = player.getName();
		}
		if(plugin.getigBook(bookName, tran).getString("Book" + part + "." + 1) == null){
			sender.sendMessage(ChatColor.RED + "That book does not exist.");
			return;
		}
		EnumBooks book = EnumBooks.GENESIS;
		book = book.fromString(bookName.toUpperCase());
		String author = book.getAuthor();
		String igbookName = book.getBook();
		igbookName = igbookName.replace("1", "1 ");
		igbookName = igbookName.replace("2", "2 ");
		igbookName = igbookName.replace("3", "3 ");
		igbookName = igbookName.replace("SongofSongs", "Song of Songs");
		book = null;
		ItemStack igbook = new ItemStack(Material.WRITTEN_BOOK, 1);
		
		BookMeta meta = (BookMeta) igbook.getItemMeta();
		
		meta.setTitle(igbookName + " Part " + part);
		meta.setAuthor(author);
		Boolean cont = true;
		int i = 1;
		String page;
		while(cont == true){
			if(plugin.getigBook(bookName, tran).getString("Book" + part + "." + i) == null){
				cont = false;
				break;
			}
			page = plugin.getigBook(bookName, tran).getString("Book" + part + "." + i);
			page = page.replaceAll("&", "§");
			meta.addPage(page);
			i++;
			if(i == 51){
				cont = false;
				break;
			}
		}
		igbook.setItemMeta(meta);
		if(player != null){
			player.getInventory().addItem(igbook);
			if(type == "send"){
				String senderName;
				if(anonymous){
					senderName = "anonymous";
				}else{
					senderName = sender.getName();
				}
				UUID ID = player.getUniqueId();
				if(!bypass){ // If not bypassed, do this.
					// If the sender is blocked
					if(TB.getpRec().getString(ID + ".blocked." + sender.getName() + ".book") != null && 
							!TB.getpRec().getBoolean(ID + ".blocked." + sender.getName() + ".book")){
						// Return a message to the sender.
						sender.sendMessage(ChatColor.RED + player.getName() + " has blocked you from sending "
								+ "books to him/her.");
						return;
					}else if(TB.getpRec().getString(ID + ".receive.book") != null && 
							!TB.getpRec().getBoolean(ID + ".receive.book")){
						// If the player has opted out of receiving books, return a message to the sender.
						sender.sendMessage(ChatColor.RED + player.getName() + "has opted out of receiving "
								+ "books.");
						return;
					}
				}
				player.sendMessage(ChatColor.GREEN + senderName + " sent you " + bookName + " Part " + 
						part + "!");
			}
			Records.savepRecs(plugin, "book", pName, bookName, null, null, tran, part);
		}else{
			sender.sendMessage(ChatColor.RED + p + " is not online!");
		}
		return;
	}

	public static void contains(TB plugin, CommandSender sender, String tran, String bookName, String part){
		String start = plugin.getigBook(bookName, tran).getString(bookName + part + "Start.c") + ":" +
				plugin.getigBook(bookName, tran).getString(bookName + part + "Start.v");
		String end = plugin.getigBook(bookName, tran).getString(bookName + part + "End.c") + ":" +
				plugin.getigBook(bookName, tran).getString(bookName + part + "End.v");
		if(start == null || end == null){
			sender.sendMessage(ChatColor.RED + "That part does not exist.");
			return;
		}
		sender.sendMessage(ChatColor.GREEN + bookName + " part " + part + " contains " + bookName + " " + start 
				+ "-" + end + ".");
	}
	
	public static void previous(TB plugin, CommandSender sender, String tran, String bookName, String part,
			String type, String p) {
		int bN = Integer.parseInt(part) - 1;
		String pNum = "";
		EnumBooks ebook = EnumBooks.GENESIS;
		String newBook = bookName;
		if(plugin.getigBook(bookName, tran).contains("Book" + bN)){
			pNum = String.valueOf(bN);
		}else{
			boolean cont = true;
			while(cont){
				newBook = ebook.numtoBook(0, "string", "lower", newBook);
				/*
				 * TODO: Add check for availability using EnumAvail.
				 * if(ebook.fromString(newBook).isAvailable(tran)){
					cont = false;
				}*/
			}
			pNum = "1";
		}
		Run(plugin, sender, tran, newBook, pNum, type, p, false, false);
	}
	
	public static void next(TB plugin, CommandSender sender, String tran, String bookName, String part,
			String type, String p) {
		int bN = Integer.parseInt(part) + 1;
		String pNum = "";
		EnumBooks ebook = EnumBooks.GENESIS;
		String newBook = bookName;
		if(plugin.getigBook(bookName, tran).contains("Book" + bN)){
			pNum = String.valueOf(bN);
		}else{
			boolean cont = true;
			while(cont){
				newBook = ebook.numtoBook(0, "string", "raise", newBook);
				/*
				 * TODO: Add check for availability using EnumAvail.
				 * if(ebook.fromString(newBook).isAvailable(tran)){
					cont = false;
				}*/
			}
			pNum = "1";
		}
		Run(plugin, sender, tran, newBook, pNum, type, p, false, false);
	}
	
	public static void list(TB plugin, CommandSender sender, String tran){
		Player player = (Player) sender;
		if(plugin.getigBook("List", tran).getString("Book1.1") == null){
			sender.sendMessage(ChatColor.RED + "Sorry, that book does not exist.");
			return;
		}
		String author = "Tadukoo";
		String igbookName = tran + " Books List";
		ItemStack igbook = new ItemStack(Material.WRITTEN_BOOK, 1);
		BookMeta meta = (BookMeta) igbook.getItemMeta();
		meta.setTitle(igbookName);
		meta.setAuthor(author);
		Boolean cont = true;
		int i = 1;
		String page;
		while(cont == true){
			if(plugin.getigBook("List", tran).getString("Book1." + i) == null){
				cont = false;
				break;
			}
			page = plugin.getigBook("List", tran).getString("Book1." + i);
			page = page.replaceAll("&", "§");
			meta.addPage(page);
			i++;
			if(i == 51){
				cont = false;
				break;
			}
		}
		igbook.setItemMeta(meta);
		player.getInventory().addItem(igbook);
		return;
	}
}