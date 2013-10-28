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
		Boolean permsOn = plugin.perms;
		if(cmd.getName().equalsIgnoreCase("bible")){
			if(playerType == "block" || playerType == "unknown"){
				sender.sendMessage(ChatColor.RED + "Unknown sender!");
				return true;
			}else{
				EnumBooks book = EnumBooks.GENESIS;
				String cmdBook = null;
				String bookName = "Genesis";
				String chp = "1";
				String v = "1";
				String tran = plugin.getConfig().getString("DefaultTranslation").toUpperCase();
				String ref = null;
				String verse = null;
				if(args.length >= 1){
					if(book.fromString(args[0].toUpperCase()) != null){
						book = book.fromString(args[0].toUpperCase());
					}else{
						sender.sendMessage(ChatColor.RED + "Sorry, that book/command does not exist.");
						return true;
					}
				}
				if(args.length >= 2){
					chp = args[1];
				}
				if(args.length >= 3){
					v = args[2];
				}
				if(args.length >= 4){
					tran = args[3].toUpperCase();
				}
				if(plugin.getConfig().getString(tran) == null || plugin.getConfig().getBoolean(tran) == false){
					sender.sendMessage(ChatColor.RED + "Sorry, that translation is not available.");
					return true;
				}
				if(book.isAvailable() == true){
					cmdBook = book.getBook();
					if(cmdBook.equalsIgnoreCase("first") || cmdBook.equalsIgnoreCase("second") || 
							cmdBook.equalsIgnoreCase("third")){
						tran = "all";
						bookName = "BibleConfig";
						ref = cmdBook.toLowerCase();
					}else if(cmdBook.equalsIgnoreCase("info")){
						if(args.length < 2){
							sender.sendMessage(ChatColor.RED + "Not enough arguments!");
							sender.sendMessage(ChatColor.RED + "/bible ?|info <translation>");
							return true;
						}
						tran = chp;
						bookName = tran;
						ref = "info";
					}else if(cmdBook.equalsIgnoreCase("books")){
						String i = chp;
						BooksList.list(i, sender);
						return true;
					}else if(cmdBook.equalsIgnoreCase("translations")){
						Translations.Run(sender, plugin);
						return true;
					}else if(cmdBook.equalsIgnoreCase("getBook")){
						if(permsOn == true && playerType == "player"){
							Player player = (Player) sender;
							if(Permissions.check(sender, player, "getbook") == false){
								return true;
							}
						}
						if(chp != "1"){
							bookName = chp;
						}
						String part = v;
						Book.Run(plugin, sender, playerType, tran, bookName, part);
						return true;
					}else{
						bookName = cmdBook;
					}
				}else{
					sender.sendMessage(ChatColor.RED + "Sorry, " + book.getBook() + " is not available yet.");
					return true;
				}
				if(plugin.getBook(tran, bookName) == null){
					sender.sendMessage(ChatColor.RED + "Sorry, " + tran + "/" + bookName 
							+ ".yml does not exist.");
					return true;
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