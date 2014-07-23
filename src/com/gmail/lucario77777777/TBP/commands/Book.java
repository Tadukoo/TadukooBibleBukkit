package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;

public class Book extends MainCommandExecutor {
	public Book(TB plugin) {
		super(plugin);
	}
	
	@SuppressWarnings("deprecation")
	public static boolean Run(TB plugin, CommandSender sender, String tran, String bookName, String part,
			String type, String p)
	{
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
		if(player != null){
			player.getInventory().addItem(igbook);
		}else{
			sender.sendMessage(ChatColor.RED + p + " is not online!");
		}
		return true;
}

	public static void contains(TB plugin, CommandSender sender, String tran, String bookName, String part){
		String start = plugin.getigBook(tran).getString(bookName + part + "Start");
		String end = plugin.getigBook(tran).getString(bookName + part + "End");
		if(start == null || end == null){
			sender.sendMessage(ChatColor.RED + "That part does not exist.");
			return;
		}
		sender.sendMessage(ChatColor.GREEN + bookName + " part " + part + " contains " + bookName + " " + start + 
				"-" + end + ".");
	}

	public static void next(TB plugin, CommandSender sender, String tran, String bookName, String part,
			String type, String p) {
		int bN = Integer.parseInt(part) + 1;
		String pNum = "";
		EnumBooks ebook = EnumBooks.GENESIS;
		String newBook = bookName;
		if(plugin.getigBook(tran).contains(bookName + "Book" + bN) == true){
			pNum = String.valueOf(bN);
		}else{
			newBook = ebook.numtoBook(0, "string", "raise", bookName);
			pNum = "1";
		}
		Run(plugin, sender, tran, newBook, pNum, type, p);
	}

	public static void previous(TB plugin, CommandSender sender, String tran, String bookName, String part,
			String type, String p) {
		int bN = Integer.parseInt(part) - 1;
		String pNum = "";
		EnumBooks ebook = EnumBooks.GENESIS;
		String newBook = bookName;
		if(plugin.getigBook(tran).contains(bookName + "Book" + bN) == true){
			pNum = String.valueOf(bN);
		}else{
			newBook = ebook.numtoBook(0, "string", "lower", bookName);
			pNum = "1";
		}
		Run(plugin, sender, tran, newBook, pNum, type, p);
	}
}