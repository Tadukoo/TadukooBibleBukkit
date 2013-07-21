package com.gmail.lucario77777777.TBP.commands.KJV.Books;

import com.gmail.lucario77777777.TBP.commands.KJV.Books.KJVBookGenesis;
import com.gmail.lucario77777777.TBP.commands.KJV.bible.Genesis.KJVBibleGenesisCh1;

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
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		ItemStack book = new ItemStack(Material.WRITTEN_BOOK, 1);

		BookMeta meta = (BookMeta) book.getItemMeta();
		
		meta.setTitle("Genesis Part 1");
		meta.setAuthor("Moses");
		meta.addPage("Chapter 1" + "\n 1 " + KJVBibleGenesisCh1.getV1() + "\n 2 " + KJVBibleGenesisCh1.getV2() +
				"\n 3 " + KJVBibleGenesisCh1.getV3());
		meta.addPage(" 4 " + KJVBibleGenesisCh1.getV4() + "\n 5 " + KJVBibleGenesisCh1.getV5());
		book.setItemMeta(meta);
		((Player) sender).getInventory().addItem(book);
		return true;
		}
}