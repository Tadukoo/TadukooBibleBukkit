package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import com.gmail.lucario77777777.TBP.BookList;
import com.gmail.lucario77777777.TBP.Main;

public class Book extends MainCommandExecutor {
	public Book(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(Main plugin, CommandSender sender, String playerType, String tran, 
			String bookName, String part, String type, String p)
	{
		if(playerType != "player" && type == "get"){
			sender.sendMessage(ChatColor.RED + "You must be a player!");
			return true;
		}else{
			Player player = null;
			if(type == "get"){
				player = (Player) sender;
			}else if(type == "give"){
				player = sender.getServer().getPlayer(p);
			}
			if(plugin.getigBook(tran).getString(bookName + "Book" + part + "." + 1) == null){
				sender.sendMessage(ChatColor.RED + "That book does not exist.");
				return true;
			}
			EnumBooks book = EnumBooks.GENESIS;
			book = book.fromString(bookName.toUpperCase());
			String author = book.getAuthor();
			String igbookName = book.getBook();
			igbookName.replace("1", "1 ");
			igbookName.replace("2", "2 ");
			igbookName.replace("3", "3 ");
			igbookName.replace("SongofSongs", "Song of Songs");
			book = null;
			ItemStack igbook = new ItemStack(Material.WRITTEN_BOOK, 1);

			BookMeta meta = (BookMeta) igbook.getItemMeta();
			
			meta.setTitle(igbookName + " Part " + part);
			meta.setAuthor(author);
			Boolean cont = true;
			int i = 1;
			while(cont == true){
				if(plugin.getigBook(tran).getString(bookName + "Book" + part + "." + i) == null){
					cont = false;
					break;
				}
				meta.addPage(plugin.getigBook(tran).getString(bookName + "Book" + part + "." + i));
				i++;
				if(i == 51){
					cont = false;
					break;
				}
			}
			igbook.setItemMeta(meta);
			player.getInventory().addItem(igbook);
			return true;
	}
}

	public static void contains(Main plugin, CommandSender sender, String tran,
			String bookName, String part) {
		String start = plugin.getigBook(tran).getString(bookName + part + "Start");
		String end = plugin.getigBook(tran).getString(bookName + part + "End");
		if(start == null || end == null){
			sender.sendMessage(ChatColor.RED + "That part does not exist.");
			return;
		}
		sender.sendMessage(ChatColor.GREEN + bookName + " part " + part + " contains " + bookName + " " + start + 
				"-" + end + ".");
	}

	public static void next(Main plugin, CommandSender sender, String playerType, String tran,
			String bookName, String part, String type, String p) {
		int bN = Integer.parseInt(part) + 1;
		String pNum = "";
		String newBook = bookName;
		if(plugin.getigBook(tran).contains(bookName + "Book" + bN) == true){
			pNum = String.valueOf(bN);
		}else{
			newBook = BookList.raise(bookName);
			pNum = "1";
		}
		Run(plugin, sender, playerType, tran, newBook, pNum, type, p);
	}

	public static void previous(Main plugin, CommandSender sender,
			String playerType, String tran, String bookName, String part,
			String type, String p) {
		int bN = Integer.parseInt(part) - 1;
		String pNum = "";
		String newBook = bookName;
		if(plugin.getigBook(tran).contains(bookName + "Book" + bN) == true){
			pNum = String.valueOf(bN);
		}else{
			newBook = BookList.lower(bookName);
			pNum = "1";
		}
		Run(plugin, sender, playerType, tran, newBook, pNum, type, p);
	}
}