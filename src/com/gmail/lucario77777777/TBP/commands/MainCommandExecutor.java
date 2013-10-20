package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandExecutor;

import com.gmail.lucario77777777.TBP.Main;

public class MainCommandExecutor implements CommandExecutor {
	private Main plugin;
	public MainCommandExecutor(Main plugin) {
		this.plugin = plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		final String playerType;
		if (sender instanceof Player){
			playerType = "player";
		}else if(sender instanceof ConsoleCommandSender){
			playerType = "console";
		}else if(sender instanceof BlockCommandSender){
			playerType = "block";
		}else{
			playerType = "unknown";
		}
		if(cmd.getName().equalsIgnoreCase("bible")){
			if(playerType == "block" || playerType == "unknown"){
				sender.sendMessage(ChatColor.RED + "Unknown sender!");
				return true;
			}else{
				String tran = null;
				boolean tranAvl = false;
				EnumBooks book = EnumBooks.GENESIS;
				String bookName = null;
				String chp = null;
				String v = null;
				String ref = null;
				String verse = null;
				String part = null;
				if(args.length == 0){
					sender.sendMessage(ChatColor.RED + "Not enough arguments!");
					return true;
				}
				if(args.length >= 1){
					if(args[0].equalsIgnoreCase("?") || args[0].equalsIgnoreCase("list")){
						Translations.Run(sender, plugin);
						return true;
					}else{
						tran = args[0].toUpperCase();
						if(plugin.getConfig().getBoolean(tran)){
							tranAvl = plugin.getConfig().getBoolean(tran);
						}else{
							tranAvl = false;
						}
					}
				}
				if(tranAvl == false){
					sender.sendMessage(ChatColor.RED + "Sorry, that translation is not available.");
					return true;
				}
				if(args.length >= 2){
					if (book.fromString(args[1].toUpperCase()) != null){
						book = book.fromString(args[1].toUpperCase());
					}else{
						sender.sendMessage(ChatColor.RED + "That book does not exist.");
						return true;
					}
				}
				if(args.length >= 3){
					chp = args[2];
				}
				if(args.length >= 4){
					v = args[3];
				}
				if(book.isAvailable() == true){
					bookName = book.getBook();
					if(bookName.equalsIgnoreCase("first")){
						tran = "all";
						bookName = "BibleConfig";
						ref = "first";
					}else if(bookName.equalsIgnoreCase("second")){
						tran = "all";
						bookName = "BibleConfig";
						ref = "second";
					}else if(bookName.equalsIgnoreCase("third")){
						tran = "all";
						bookName = "BibleConfig";
						ref = "third";
					}else if(bookName.equalsIgnoreCase("info")){
						bookName = tran;
						ref = "info";
					}else if(bookName.equalsIgnoreCase("books")){
						BooksList.list1(sender);
						return true;
					}else if(bookName.equalsIgnoreCase("books2")){
						BooksList.list2(sender);
						return true;
					}else if(bookName.equalsIgnoreCase("books3")){
						BooksList.list3(sender);
						return true;
					}else if(bookName.equalsIgnoreCase("books4")){
						BooksList.list4(sender);
						return true;
					}else if(bookName.equalsIgnoreCase("books5")){
						BooksList.list5(sender);
						return true;
					}else if(bookName.equalsIgnoreCase("book")){
						if(chp != null){
							bookName = chp;
						}else{
							bookName = "Genesis";
						}
						if(v != null){
							part = v;
						}else{
							part = "1";
						}
						Book.Run(plugin, sender, playerType, tran, bookName, part);
						return true;
					}
				}else if(book.isAvailable() == false){
					sender.sendMessage(ChatColor.RED + "Sorry, " + book.getBook() + " is not available yet.");
					return true;
				}
				if(plugin.getBook(tran, bookName) == null){
					sender.sendMessage(ChatColor.RED + "Sorry, " + tran + "/" + bookName 
							+ ".yml does not exist.");
					return true;
				}
				if(chp == null){
					chp = "1";
				}
				if(v == null){
					v = "1";
				}
				if(chp.equalsIgnoreCase("info") || chp.equalsIgnoreCase("?")){
					ref = book.getAlias() + "Info";
				}
				if(chp.equalsIgnoreCase("#")){
					ref = book.getAlias() + "#";
				}
				if(v.equalsIgnoreCase("#") || v.equalsIgnoreCase("?") || v.equalsIgnoreCase("info")){
					v = "info";
				}
				if(ref == null){
					ref = "ch" + chp + "v" + v;
				}
				if(plugin.getBook(tran, bookName).getString(ref) == null){
					sender.sendMessage(ChatColor.RED + "An error occurred. Please make sure you typed in a " +
							"chapter/verse that exists.");
					return true;
				}
				if(plugin.getBook(tran, bookName).getString(ref) == null){
					sender.sendMessage(ChatColor.RED + "An error occurred.");
					return true;
				}
				if(verse == null){
					verse = plugin.getBook(tran, bookName).getString(ref);
				}
				sender.sendMessage(ChatColor.GREEN + verse);
				return true;
			}
		}
		return false;
	}
}