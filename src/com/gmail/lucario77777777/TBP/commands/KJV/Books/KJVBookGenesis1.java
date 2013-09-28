package com.gmail.lucario77777777.TBP.commands.KJV.Books;

import com.gmail.lucario77777777.TBP.commands.KJV.Books.KJVBookGenesis;

import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import com.gmail.lucario77777777.TBP.Main;

public class KJVBookGenesis1 extends KJVBookGenesis {
	public KJVBookGenesis1(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args, Main plugin)
	{
		ItemStack book = new ItemStack(Material.WRITTEN_BOOK, 1);

		BookMeta meta = (BookMeta) book.getItemMeta();
		
		meta.setTitle("Genesis Part 1");
		meta.setAuthor("Moses");/*
		meta.addPage("Chapter 1" + "\n 1 " + KJVBibleGenesisCh1.getV1() + "\n 2 " + KJVBibleGenesisCh1.getV2() +
				"\n 3 " + KJVBibleGenesisCh1.getV3());
		meta.addPage(" 4 " + KJVBibleGenesisCh1.getV4() + "\n 5 " + KJVBibleGenesisCh1.getV5());
		meta.addPage(" 6 " + KJVBibleGenesisCh1.getV6() + "\n 7 " + KJVBibleGenesisCh1.getV7());
		meta.addPage(" 8 " + KJVBibleGenesisCh1.getV8() + "\n 9 " + KJVBibleGenesisCh1.getV9());
		meta.addPage(" 10 " + KJVBibleGenesisCh1.getV10() + "\n 11 " + KJVBibleGenesisCh1.getV11());*/
		book.setItemMeta(meta);
		((Player) sender).getInventory().addItem(book);
		return true;
		}
}