package com.gmail.lucario77777777.TBP;

import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.lucario77777777.TBP.commands.EnumBooks;

public class Checker {
	static Main plugin = Main.instance;
	
	/*
	 * Translation Checking
	 */
	
	public static void tranCheck() {
		tranDoCheck("KJV");
	}
	
	public static void tranSave() {
		tranDoSave("KJV");
	}
	
	public static void tranDoCheck(String tran) {
		if(plugin.getConfig().getBoolean(tran) == true){
			String type = "";
			if(plugin.getConfig().getString(tran + "BookCheck") != null){
				type = plugin.getConfig().getString(tran + "BookCheck");
			}
			if(type.equalsIgnoreCase("ignore")){
				return;
			}else{
				booksCheck(plugin, tran, type);
			}
		}
	}
	
	public static void tranDoSave(String tran) {
		if(plugin.getConfig().getBoolean(tran) == true){
			plugin.saveigBook(tran);
		}
	}
	
	/*
	 * Book Checking
	 */
	
	public static void booksCheck(Main plugin, String tran, String type) {
		Boolean cont = true;
		int i = 0;
		String book = null;
		EnumBooks ebook = EnumBooks.GENESIS;
		if(type.equalsIgnoreCase("check")){
			plugin.getLogger().log(Level.INFO, "Checking " + tran + " books.");
			while(cont == true){
				book = ebook.numtoBook(i, "int", "", "");
				i++;
				booksConfigCheck(plugin, tran, book);
				if(i == 66){
					cont = false;
					i = 0;
				}
			}
		}else if(type.equalsIgnoreCase("correct")){
			plugin.getLogger().log(Level.INFO, "Correcting " + tran + " books.");
			while(cont == true){
				book = ebook.numtoBook(i, "int", "", "");
				i++;
				bookCreate(plugin, tran, book, "fix");
				if(i == 66){
					cont = false;
					i = 0;
				}
			}
		}else if(type.equalsIgnoreCase("create")){
			plugin.getLogger().log(Level.INFO, "Creating " + tran + " books.");
			while(cont == true){
				book = ebook.numtoBook(i, "int", "", "");
				i++;
				bookCreate(plugin, tran, book, "write");
				if(i == 66){
					cont = false;
					i = 0;
				}
			}
		}else{
			plugin.getLogger().log(Level.WARNING, "You do not have " + tran + "BookCheck set correctly in the " +
					"config.yml. It should be ignore, check, correct, or create.");
		}
	}
	
	public static void booksConfigCheck(Main plugin, String tran, String bookName){
		plugin.getLogger().log(Level.INFO, "Checking for " + bookName + "...");
		if(plugin.getBook(tran, bookName).getString("ch1v1") != null){
			plugin.getLogger().log(Level.INFO, bookName + ".yml found. Checking for book config...");
			if(plugin.getigBook(tran).getBoolean(bookName + "Done") != true){
				plugin.getLogger().log(Level.INFO, bookName + " book config not found. Creating config...");
				BookDefine.run(plugin, tran, bookName, "write");
			}else{
				plugin.getLogger().log(Level.INFO, bookName + " book config found.");
				return;
			}
		}else{
			plugin.getLogger().log(Level.INFO, bookName + ".yml not found.");
			return;
		}
	}
	
	public static void bookCreate(Main plugin, String tran, String bookName, String cmd){
		plugin.getLogger().log(Level.INFO, "Checking for " + bookName + "...");
		if(plugin.getBook(tran, bookName).getString("ch1v1") != null){
			plugin.getLogger().log(Level.INFO, bookName + ".yml found. Creating/Overwriting book config...");
			BookDefine.run(plugin, tran, bookName, cmd);
		}else{
			plugin.getLogger().log(Level.INFO, bookName + ".yml not found.");
			return;
		}
	}
	
	/*
	 * Permissions Checking
	 */
	
	public static boolean permCheck(CommandSender sender, String perm){
		Player player = (Player) sender;
		if(player.hasPermission("TadukooBible." + perm)){
			return true;
		}else{
			sender.sendMessage(ChatColor.RED + "You don't have permission.");
			sender.sendMessage(ChatColor.RED + "You need TadukooBible." + perm);
			return false;
		}
	}
}
