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
	private boolean permsOn;
	public MainCommandExecutor(TB plugin, boolean permsOn) {
		this.plugin = plugin;
		this.permsOn = permsOn;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		EnumBooks book = EnumBooks.GENESIS;
		EnumChps echp = EnumChps.GENESIS;
		EnumCmds cmds = EnumCmds.HELP;
		String bookName = "Genesis", chp = "1", v = "1";
		String tran = plugin.getConfig().getString("DefaultTranslation").toUpperCase();
		String ref = null;
		
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
		
		if(cmd.getName().equalsIgnoreCase("bible") && permCheck(playerType, sender, "use")){
			if(playerType == "block" || playerType == "unknown"){
				sender.sendMessage(ChatColor.RED + "Unknown sender!");
				return true;
			}else{
				String cmdType = "read";
				String cmdPerm = "verse.read";
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
						cmdPerm = cmds.getPerm();
					}else{
						sender.sendMessage(ChatColor.RED + "Sorry, that book/command does not exist.");
						return true;
					}
				}
				if(permCheck(playerType, sender, cmdPerm)){
					if(cmdType.equalsIgnoreCase("read")){
						Read.read(plugin, sender, args, book, echp, bookName, chp, v, tran);
						return true;
					}else if((cmdType.equalsIgnoreCase("first") || cmdType.equalsIgnoreCase("second") ||
							cmdType.equalsIgnoreCase("third"))){
						tran = "all";
						bookName = "BibleConfig";
						ref = cmdType.toLowerCase();
						sendToPlayer(plugin, sender, tran, bookName, ref);
						return true;
					}else if(cmdType.equalsIgnoreCase("previous") && TB.pR){
						Read.previous(plugin, sender, args, book, echp);
						return true;
					}else if(cmdType.equalsIgnoreCase("next") && TB.pR){
						Read.next(plugin, sender, args, book, echp);
						return true;
					}else if(cmdType.equalsIgnoreCase("last") && TB.pR){
						Read.last(plugin, sender, args, book);
						return true;
					}else if(cmdType.equalsIgnoreCase("random")){
						CMDRandom.random(plugin, sender, args, bookName, chp, v, tran);
						return true;
					}else if(cmdType.equalsIgnoreCase("getbook") && consoleCheck(sender, playerType)){
						GetBook.getbook(plugin, sender, args, bookName, chp, tran);
						return true;
					}else if(cmdType.equalsIgnoreCase("sendbook")){
						SendBook.sendbook(plugin, sender, args, bookName, tran);
						return true;
					}else if(cmdType.equalsIgnoreCase("info")){
						Information.info(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("help")){
						Help.help(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("books")){
						BooksList.booksList(sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("translations")){
						TranslationsList.tranList(sender, plugin);
						return true;
					}else if(cmdType.equalsIgnoreCase("config")){
						Config.config(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("announce")){
						Announce.announce(plugin, sender, args, tran);
						return true;
					}
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
	
	private boolean permCheck(String playerType, CommandSender sender, String perm){
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
		Bukkit.broadcast(ChatColor.GREEN + verse, "TadukooBible.verse.announceget");
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
	public static String[] getpRecs(String type, String pName){
		String[] rec = new String[4];
		if(type == "verse"){
			rec[0] = TB.getpRec().getString(pName + ".lastRead.bookName");
			rec[1] = TB.getpRec().getString(pName + ".lastRead.chp");
			rec[2] = TB.getpRec().getString(pName + ".lastRead.v");
			rec[3] = TB.getpRec().getString(pName + ".lastRead.tran");
		}else if(type == "book"){
			rec[0] = TB.getpRec().getString(pName + ".lastbook.book");
			rec[1] = TB.getpRec().getString(pName + ".lastbook.part");
			rec[2] = TB.getpRec().getString(pName + ".lastbook.tran");
		}
		return rec;
	}
	
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
