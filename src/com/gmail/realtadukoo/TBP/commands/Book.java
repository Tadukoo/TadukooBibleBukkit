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
import com.gmail.realtadukoo.TBP.commands.handling.Checks;

public class Book{
	
	@SuppressWarnings("deprecation")
	public static void checkAndRun(TB plugin, CommandSender sender, String playerType, String bookName,
			String part, String tran, EnumBooks book, String type, String pName, boolean anonymous, 
			boolean bypass, boolean permsOn){
		Player player = null;
		/*
		 * TODO: Add check for book availability using EnumAvail.
		 */
		if(plugin.getigBook(bookName, tran).getString("Book" + part + "." + 1) == null){
			sender.sendMessage(ChatColor.RED + "That book does not exist.");
			return;
		}
		if(type.equalsIgnoreCase("get")){
			player = (Player) sender;
		}else if(type.equalsIgnoreCase("send")){
			player = plugin.getServer().getPlayer(pName);
		}
		if(player == null){
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return;
		}
		pName = player.getName();
		if(anonymous && !Checks.permCheck(playerType, plugin, sender, "Bible", "anonymous.book", permsOn)){
			sender.sendMessage(ChatColor.RED + "You don't have permission to send anonymous books.");
			return;
		}
		if(bypass && !Checks.permCheck(playerType, plugin, sender, "Bible", "bypass.book", permsOn)){
			sender.sendMessage(ChatColor.RED + "You don't have permission to bypass book sending settings!");
			return;
		}
		if(type == "send" && !Checks.permCheck(playerType, plugin, player, "Bible", "book.receive", permsOn)){
			sender.sendMessage(ChatColor.RED + pName + " does not have permission to receive books.");
			return;
		}
		if(type == "send" && !player.isOnline()){
			sender.sendMessage(ChatColor.RED + pName + " is not online!");
			return;
		}
		UUID ID = player.getUniqueId();
		if(!bypass){
			if(TB.getpRec().getString(ID + ".blocked." + sender.getName() + ".book") != null && 
					!TB.getpRec().getBoolean(ID + ".blocked." + sender.getName() + ".book")){
				sender.sendMessage(ChatColor.RED + player.getName() + " has blocked you from sending books " +
						"to him/her.");
				return;
			}else if(TB.getpRec().getString(ID + ".receive.book") != null && 
					!TB.getpRec().getBoolean(ID + ".receive.book")){
				sender.sendMessage(ChatColor.RED + pName + "has opted out of receiving books.");
				return;
			}
		}
		book = book.fromString(bookName);
		String author = book.getAuthor();
		String igbookName = book.getBook();
		igbookName = igbookName.replace("1", "1 ");
		igbookName = igbookName.replace("2", "2 ");
		igbookName = igbookName.replace("3", "3 ");
		igbookName = igbookName.replace("SongofSongs", "Song of Songs");
		ItemStack igbook = new ItemStack(Material.WRITTEN_BOOK, 1);
		BookMeta meta = (BookMeta) igbook.getItemMeta();
		meta.setTitle(igbookName + " Part " + part);
		meta.setAuthor(author);
		int i = 1;
		String page;
		while(i <= 50){
			if(plugin.getigBook(bookName, tran).getString("Book" + part + "." + i) == null){
				i = 51;
				break;
			}
			page = plugin.getigBook(bookName, tran).getString("Book" + part + "." + i);
			page = page.replaceAll("&", "§");
			meta.addPage(page);
			i++;
		}
		igbook.setItemMeta(meta);
		player.getInventory().addItem(igbook);
		if(type == "send"){
			String senderName;
			if(anonymous){
				senderName = "anonymous";
			}else{
				senderName = sender.getName();
			}
			player.sendMessage(ChatColor.GREEN + senderName + " sent you " + bookName + " Part " + part + "!");
		}
		Records.savepRecs(plugin, playerType, "book", pName, bookName, null, null, tran, part);
		sender.sendMessage(ChatColor.GREEN + "Book sent!");
	}

	public static void contains(TB plugin, CommandSender sender, String tran, String bookName, String part){
		String start = plugin.getigBook(bookName, tran).getString("Book" + part + "Start.c") + ":" +
				plugin.getigBook(bookName, tran).getString("Book" + part + "Start.v");
		String end = plugin.getigBook(bookName, tran).getString("Book" + part + "End.c") + ":" +
				plugin.getigBook(bookName, tran).getString("Book" + part + "End.v");
		if(start == null || end == null){
			sender.sendMessage(ChatColor.RED + "That part does not exist.");
			return;
		}
		sender.sendMessage(ChatColor.GREEN + bookName + " part " + part + " contains " + bookName + " " + start 
				+ "-" + end + ".");
	}
	
	public static void previous(TB plugin, CommandSender sender, String playerType, String bookName, 
			String tran, String part, String type, String pName, boolean permsOn) {
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
				cont = false;
				/*
				 * TODO: Add check for availability using EnumAvail.
				 * if(ebook.fromString(newBook).isAvailable(tran)){
					cont = false;
				}*/
			}
			pNum = "1";
		}
		checkAndRun(plugin, sender, playerType, newBook, pNum, tran, ebook, type, pName, false, false, permsOn);
	}
	
	public static void next(TB plugin, CommandSender sender, String playerType, String bookName, String part,
			String tran, String type, String pName, boolean permsOn) {
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
				cont = false;
				/*
				 * TODO: Add check for availability using EnumAvail.
				 * if(ebook.fromString(newBook).isAvailable(tran)){
					cont = false;
				}*/
			}
			pNum = "1";
		}
		checkAndRun(plugin, sender, playerType, newBook, pNum, tran, ebook, type, pName, false, false, permsOn);
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