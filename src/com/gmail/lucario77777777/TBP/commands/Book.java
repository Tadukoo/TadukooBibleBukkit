package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;

public class Book{
	
	@SuppressWarnings("deprecation")
	public static boolean Run(TB plugin, CommandSender sender, String tran, String bookName, String part,
			String type, String p)
	{
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
			return true;
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
			page = page.replaceAll("&", "�");
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
			CommandExec.savepRecs("book", pName, bookName, null, null, tran, part);
		}else{
			sender.sendMessage(ChatColor.RED + p + " is not online!");
		}
		return true;
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
		sender.sendMessage(ChatColor.GREEN + bookName + " part " + part + " contains " + bookName + " " + start + 
				"-" + end + ".");
	}
	
	public static void previous(TB plugin, CommandSender sender, String tran, String bookName, String part,
			String type, String p) {
		int bN = Integer.parseInt(part) - 1;
		String pNum = "";
		EnumBooks ebook = EnumBooks.GENESIS;
		String newBook = bookName;
		if(plugin.getigBook(bookName, tran).contains(newBook + "Book" + bN)){
			pNum = String.valueOf(bN);
		}else{
			boolean cont = true;
			while(cont){
				newBook = ebook.numtoBook(0, "string", "lower", newBook);
				if(ebook.fromString(newBook).isAvailable(tran)){
					cont = false;
				}
			}
			pNum = "1";
		}
		Run(plugin, sender, tran, newBook, pNum, type, p);
	}
	
	public static void next(TB plugin, CommandSender sender, String tran, String bookName, String part,
			String type, String p) {
		int bN = Integer.parseInt(part) + 1;
		String pNum = "";
		EnumBooks ebook = EnumBooks.GENESIS;
		String newBook = bookName;
		if(plugin.getigBook(bookName, tran).contains(newBook + "Book" + bN)){
			pNum = String.valueOf(bN);
		}else{
			boolean cont = true;
			while(cont){
				newBook = ebook.numtoBook(0, "string", "raise", newBook);
				if(ebook.fromString(newBook).isAvailable(tran)){
					cont = false;
				}
			}
			pNum = "1";
		}
		Run(plugin, sender, tran, newBook, pNum, type, p);
	}
}