package com.gmail.lucario77777777.TBP.commands.KJV.Books;

import com.gmail.lucario77777777.TBP.commands.KJV.Books.KJVBookGenesis;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.material.*;

import com.gmail.lucario77777777.TBP.Main;

public class KJVBookGenesis1 extends KJVBookGenesis {
	public KJVBookGenesis1(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		Material.WRITTEN_BOOK book;
		book.setTitle("Genesis Part 1");
		book.setAuthor("Moses");
		book.setPages("1: ");
		book.setPages("2: ");
		((Player) sender).getInventory().addItem(book);
		return true;
		}
}