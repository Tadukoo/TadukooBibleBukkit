package com.gmail.lucario77777777.TBP;

import java.util.logging.Level;

public class CheckBooks {
	public static void check(Main plugin, String tran, String type) {
		Boolean cont = true;
		int i = 0;
		String book;
		if(type.equalsIgnoreCase("check")){
			plugin.getLogger().log(Level.INFO, "Checking " + tran + " books.");
			while(cont == true){
				book = BookList.getBook(i);
				i++;
				checkBook(plugin, tran, book);
				if(i == 66){
					cont = false;
				}
			}
		}else if(type.equalsIgnoreCase("correct")){
			plugin.getLogger().log(Level.INFO, "Correcting " + tran + " books.");
			while(cont == true){
				book = BookList.getBook(i);
				i++;
				createBook(plugin, tran, book, "fix");
				if(i == 66){
					cont = false;
				}
			}
		}else if(type.equalsIgnoreCase("create")){
			plugin.getLogger().log(Level.INFO, "Creating " + tran + " books.");
			while(cont == true){
				book = BookList.getBook(i);
				i++;
				createBook(plugin, tran, book, "write");
				if(i == 66){
					cont = false;
				}
			}
		}else{
			plugin.getLogger().log(Level.WARNING, "You do not have " + tran + "BookCheck set correctly in the " +
					"config.yml. It should be ignore, check, correct, or create.");
		}
	}
	
	public static void checkBook(Main plugin, String tran, String bookName){
		plugin.getLogger().log(Level.INFO, "Checking for " + bookName + "...");
		if(plugin.getBook(tran, bookName).getString("ch1v1") != null){
			plugin.getLogger().log(Level.INFO, bookName + ".yml found. Checking for book config...");
			if(plugin.getigBook(tran).getString(bookName + "Book" + 1 + "." + 1) == null){
				plugin.getLogger().log(Level.INFO, bookName + " Book config not found. Creating config...");
				BookDefine.run(plugin, tran, bookName, "write");
			}else{
				plugin.getLogger().log(Level.INFO, bookName + " config found.");
				return;
			}
		}else{
			plugin.getLogger().log(Level.INFO, bookName + ".yml not found.");
			return;
		}
	}
	
	public static void createBook(Main plugin, String tran, String bookName, String cmd){
		plugin.getLogger().log(Level.INFO, "Checking for " + bookName + "...");
		if(plugin.getBook(tran, bookName).getString("ch1v1") != null){
			plugin.getLogger().log(Level.INFO, bookName + ".yml found. Creating/Overwriting book config...");
			BookDefine.run(plugin, tran, bookName, cmd);
		}else{
			plugin.getLogger().log(Level.INFO, bookName + ".yml not found.");
			return;
		}
	}
}
