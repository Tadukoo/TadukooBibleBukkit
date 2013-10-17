package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import com.gmail.lucario77777777.TBP.Main;

public class Book extends MainCommandExecutor {
	public Book(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(Main plugin, CommandSender sender, String playerType, String tran, 
			String bookName, String part)
	{
		if(playerType != "player"){
			sender.sendMessage(ChatColor.RED + "You must be a player!");
			return true;
		}else{
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
				}
			}
			igbook.setItemMeta(meta);
			((Player) sender).getInventory().addItem(igbook);
			return true;
	}
}
}