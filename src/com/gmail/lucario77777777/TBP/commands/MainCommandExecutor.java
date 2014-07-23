package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandExecutor;

import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumChps;
import com.gmail.lucario77777777.TBP.Enums.EnumCmds;
import com.gmail.lucario77777777.TBP.Enums.EnumTrans;
import com.gmail.lucario77777777.TBP.Lists.BooksList;
import com.gmail.lucario77777777.TBP.Lists.Help;
import com.gmail.lucario77777777.TBP.Lists.TranslationsList;
import com.gmail.lucario77777777.TBP.TB;

public class MainCommandExecutor implements CommandExecutor {
	private TB plugin;
	public MainCommandExecutor(TB plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		EnumBooks book = EnumBooks.GENESIS;
		EnumChps echp = EnumChps.GENESIS;
		EnumCmds cmds = EnumCmds.HELP;
		String bookName = "Genesis", chp = "1", v = "1";
		String tran = plugin.getConfig().getString("DefaultTranslation").toUpperCase();
		String ref = null;
		Boolean permsOn = plugin.perms;
		
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
				String cmdType = "read";
				if(args.length >= 1){
					if(book.fromString(args[0].toUpperCase()) != null){
						book = book.fromString(args[0].toUpperCase());
					}else if(cmds.fromString(args[0].toUpperCase()) != null){
						cmds = cmds.fromString(args[0].toUpperCase());
						if(cmds.isAvailable() == false){
							sender.sendMessage(ChatColor.RED + "Sorry, " + cmds.getCmd() + " is not " +
									"available yet.");
							return true;
						}
						cmdType = cmds.getCmd();
					}else{
						sender.sendMessage(ChatColor.RED + "Sorry, that book/command does not exist.");
						return true;
					}
				}
				if(cmdType == "read" && permCheck(permsOn, playerType, sender, "use")){
					Read.read(plugin, sender, args, book, echp, bookName, chp, v, tran);
					return true;
				}else if((cmdType.equalsIgnoreCase("first") || cmdType.equalsIgnoreCase("second") ||
							cmdType.equalsIgnoreCase("third")) && 
							permCheck(permsOn, playerType, sender, "use")){
					tran = "all";
					bookName = "BibleConfig";
					ref = cmdType.toLowerCase();
					sendToPlayer(plugin, sender, tran, bookName, ref);
					return true;
				}else if(cmdType.equalsIgnoreCase("help") &&
						permCheck(permsOn, playerType, sender, "help")){
					Help.help(plugin, sender, args);
					return true;
				}else if(cmdType.equalsIgnoreCase("config") &&
						permCheck(permsOn, playerType, sender, "config")){
					Config.config(plugin, sender, args);
					return true;
				}else if(cmdType.equalsIgnoreCase("info") &&
						permCheck(permsOn, playerType, sender, "info")){
					Information.info(plugin, sender, args);
					return true;
				}else if(cmdType.equalsIgnoreCase("books") && 
						permCheck(permsOn, playerType, sender, "books")){
					BooksList.booksList(sender, args);
					return true;
				}else if(cmdType.equalsIgnoreCase("translations") && 
						permCheck(permsOn, playerType, sender, "translations")){
					TranslationsList.tranList(sender, plugin);
					return true;
				}else if(cmdType.equalsIgnoreCase("getbook") && consoleCheck(sender, playerType) 
						&& permCheck(permsOn, playerType, sender, "getbook")){
					GetBook.getbook(plugin, sender, args, bookName, chp, tran);
					return true;
				}else if(cmdType.equalsIgnoreCase("givebook") && 
						permCheck(permsOn, playerType, sender, "givebook")){
					GiveBook.givebook(plugin, sender, args, bookName, tran);
					return true;
				}else if(cmdType.equalsIgnoreCase("random") && 
						permCheck(permsOn, playerType, sender, "random")){
					CMDRandom.random(plugin, sender, args, bookName, chp, v, tran);
					return true;
				}else if(cmdType.equalsIgnoreCase("announce") &&
						permCheck(permsOn, playerType, sender, "announce")){
					
					Announce.announce(plugin, sender, args, tran);
					return true;
				}
			}
		}
		return false;
	}
	
	/*
	 * Checks
	 */
	
	private boolean consoleCheck(CommandSender sender, String playerType) {
		if(playerType == "console"){
			sender.sendMessage(ChatColor.RED + "You must be a player!");
			return false;
		}else{
			return true;
		}
	}

	public static boolean checkForYML(TB plugin, CommandSender sender, String tran, String bookName) {
		if(plugin.getBook(tran, bookName) == null){
			sender.sendMessage(ChatColor.RED + "Sorry, " + tran + "/" + bookName 
					+ ".yml does not exist.");
			return false;
		}else{
			return true;
		}
	}

	public static String tranCheck(TB plugin, CommandSender sender, String tran) {
		EnumTrans etran = EnumTrans.KJV;
		if(etran.fromString(tran) != null){
			etran = etran.fromString(tran);
			if(etran.isAvailable()){
				return etran.getTran();
			}
		}
		sender.sendMessage(ChatColor.RED + "Sorry, the " + tran + " translation is not available.");
		return null;
	}
	
	private static boolean permCheck(boolean permsOn, String playerType, CommandSender sender, String perm){
		if(permsOn == true && playerType == "player"){
			Player player = (Player) sender;
			if(player.hasPermission("TadukooBible." + perm)){
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "You don't have permission.");
				sender.sendMessage(ChatColor.RED + "You need TadukooBible." + perm);
				return false;
			}
		}else{
			return true;
		}
	}
	
	/*
	 * Sending
	 */
	
	public static void sendToPlayer(TB plugin, CommandSender sender, String bookName, String tran, String ref){
		String verse = plugin.getBook(tran, bookName).getString(ref);
		sender.sendMessage(ChatColor.GREEN + verse);
	}
	
	public static void broadcast(TB plugin, CommandSender sender, String bookName, String chp, String v,
			String tran, String ref){
		String verse = plugin.getBook(tran, bookName).getString(ref);
		Bukkit.broadcast(ChatColor.GREEN + verse, "TadukooBible.announceget");
		plugin.getLogger().info(sender.getName() + " broadcasted " + bookName + " " + chp + ":" 
				+ v + " from the " + tran + " translation.");
	}
	
	/*
	 * References
	 */
	
	public static String makeRef(EnumBooks book, String chp, String v){
		String ref = null;
		if(chp.equalsIgnoreCase("info") || chp.equalsIgnoreCase("?")){
			ref = book.getAlias() + "Info";
		}else if(chp.equalsIgnoreCase("#")){
			ref = book.getAlias() + "#";
		}else if(v.equalsIgnoreCase("#") || v.equalsIgnoreCase("?") || v.equalsIgnoreCase("info")){
			v = "info";
		}
		if(ref == null){
			ref = "ch" + chp + "v" + v;
		}
		return ref;
	}
	
	public static boolean checkRef(TB plugin, CommandSender sender, String bookName, String tran, String ref){
		if(plugin.getBook(tran, bookName).getString(ref) == null){
			sender.sendMessage(ChatColor.RED + "An error occurred. Please make sure you typed in a " +
					"chapter/verse that exists.");
			return false;
		}else{
			return true;
		}
	}
	
	/*
	 * Player records
	 */
	public static void savepRecs(String type, String pName, String tran, String bookName, String chp,
			String v, String part){
		if(TB.pR){
			if(type == "verse"){
				TB.getpRec().set(pName + ".lastRead.tran", tran);
				TB.getpRec().set(pName + ".lastRead.bookName", bookName);
				TB.getpRec().set(pName + ".lastRead.chp", chp);
				TB.getpRec().set(pName + ".lastRead.v", v);
			}else if(type == "book"){
				TB.getpRec().set(pName + ".lastbook.book", bookName);
				TB.getpRec().set(pName + ".lastbook.part", part);
				TB.getpRec().set(pName + ".lastbook.tran", tran);
			}
			TB.savepRec();
		}
	}
}
