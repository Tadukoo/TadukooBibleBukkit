package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandExecutor;

import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumChps;
import com.gmail.lucario77777777.TBP.Enums.EnumCmds;
import com.gmail.lucario77777777.TBP.Lists.BooksList;
import com.gmail.lucario77777777.TBP.Lists.Help;
import com.gmail.lucario77777777.TBP.Lists.SettingsList;
import com.gmail.lucario77777777.TBP.Lists.TranslationsList;
import com.gmail.lucario77777777.TBP.TB;

public class MainCommandExecutor implements CommandExecutor {
	private TB plugin;
	public MainCommandExecutor(TB plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		String eType = "normal";
		EnumBooks book = EnumBooks.GENESIS;
		EnumChps echp = EnumChps.GENESIS;
		EnumCmds cmds = EnumCmds.HELP;
		String bookName = "Genesis", chp = "1", v = "1";
		String tran = plugin.getConfig().getString("DefaultTranslation").toUpperCase();
		String ref = null, verse = null, type = null;
		String i = "1";
		Boolean permsOn = plugin.perms;
		Boolean pR = plugin.getConfig().getBoolean("PlayerRecords");
		
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
				if(args.length >= 1){
					if(book.fromString(args[0].toUpperCase()) != null){
						book = book.fromString(args[0].toUpperCase());
						type = "book";
					}else if(cmds.fromString(args[0].toUpperCase()) != null){
						cmds = cmds.fromString(args[0].toUpperCase());
						type = "cmd";
					}else{
						sender.sendMessage(ChatColor.RED + "Sorry, that book/command does not exist.");
						return true;
					}
				}
				if(type == "book"){
					Read.read(plugin, sender, args, book, echp, bookName, chp, v, tran);
					return true;
				}else if(type == "cmd"){
					if(cmds.isAvailable() == false){
						sender.sendMessage(ChatColor.RED + "Sorry, " + cmds.getCmd() + " is not available" +
								" yet.");
						return true;
					}
					String cmdType = cmds.getCmd();
					if(cmdType.equalsIgnoreCase("first") || cmdType.equalsIgnoreCase("second") ||
							cmdType.equalsIgnoreCase("third")){
						tran = "all";
						bookName = "BibleConfig";
						ref = cmdType.toLowerCase();
					}else if(cmdType.equalsIgnoreCase("help")){
						if(permCheck(permsOn, playerType, sender, "help") == false){
							return true;
						}
						if(args.length >= 2){
							i = args[1];
						}
						Help.help(i, sender, plugin);
						return true;
					}else if(cmdType.equalsIgnoreCase("config")){
						if(permCheck(permsOn, playerType, sender, "config") == false){
							return true;
						}
						String setting = null;
						String value = null;
						//String fileName = null;
						if(args.length < 2){
							sender.sendMessage(ChatColor.RED + "Not enough arguments!");
							sender.sendMessage(ChatColor.RED + "/bible config <setting> [value]");
							return true;
						}
						setting = args[1];
						if(args.length >= 3){
							value = args[2];
							/*if(args.length >= 4){
								fileName = args[3];
							}*/
						}
						if(setting.equalsIgnoreCase("list")){
							SettingsList.settings(sender);
							return true;
						}
						if(value != null){
							plugin.getConfig().set(setting, value);
							sender.sendMessage(ChatColor.GREEN + setting + " is now set to " + value + ".");
							plugin.saveConfig();
							return true;
						}else{
							value = plugin.getConfig().getString(setting);
							sender.sendMessage(ChatColor.GREEN + setting + " is set to " + value + ".");
							return true;
						}
					}else if(cmdType.equalsIgnoreCase("info")){
						if(permCheck(permsOn, playerType, sender, "info") == false){
							return true;
						}
						if(args.length < 2){
							sender.sendMessage(ChatColor.RED + "Not enough arguments!");
							sender.sendMessage(ChatColor.RED + "/bible about|info|abt|information " +
									"<translation>");
							return true;
						}
						tran = args[1].toUpperCase();
						bookName = tran;
						ref = "info";
						if(tranCheck(plugin, sender, tran) == false){
							return true;
						}
					}else if(cmdType.equalsIgnoreCase("books")){
						if(permCheck(permsOn, playerType, sender, "books") == false){
							return true;
						}
						if(args.length >= 2){
							i = args[1];
						}
						BooksList.booksList(i, sender);
						return true;
					}else if(cmdType.equalsIgnoreCase("translations")){
						if(permCheck(permsOn, playerType, sender, "translations") == false){
							return true;
						}
						TranslationsList.tranList(sender, plugin);
						return true;
					}else if(cmdType.equalsIgnoreCase("getbook")){
						if(playerType == "console"){
							sender.sendMessage(ChatColor.RED + "You must be a player!");
							return true;
						}
						if(permCheck(permsOn, playerType, sender, "getbook") == false){
							return true;
						}
						type = "get";
						String p = null;
						bookName = chp;
						String part = v;
						if(args.length >= 2){
							bookName = args[1];
							if(bookName.equalsIgnoreCase("previous") || bookName.equalsIgnoreCase("pre")
									|| bookName.equalsIgnoreCase("prev") || bookName.equalsIgnoreCase("back")
									|| bookName.equalsIgnoreCase("before") || bookName.equalsIgnoreCase("b4")){
								Player player = (Player) sender;
								String pl = player.toString();
								bookName = plugin.getpRec().getString(pl + ".lastbook.book");
								part = plugin.getpRec().getString(pl + "lastbook.part");
								tran = plugin.getpRec().getString(pl + ".lastbook.tran");
								Book.previous(plugin, sender, playerType, tran, bookName, part, type, p);
								return true;
							}else if(bookName.equalsIgnoreCase("next") || bookName.equalsIgnoreCase("forward")
									|| bookName.equalsIgnoreCase("for") || bookName.equalsIgnoreCase("after")
									|| bookName.equalsIgnoreCase("and") || bookName.equalsIgnoreCase("aft")){
								Player player = (Player) sender;
								String pl = player.toString();
								bookName = plugin.getpRec().getString(pl + ".lastbook.book");
								part = plugin.getpRec().getString(pl + ".lastbook.part");
								tran = plugin.getpRec().getString(pl + ".lastbook.tran");
								Book.next(plugin, sender, playerType, tran, bookName, part, type, p);
								return true;
							}else if(bookName.equalsIgnoreCase("last") || bookName.equalsIgnoreCase("saved")
									|| bookName.equalsIgnoreCase("save") || bookName.equalsIgnoreCase("load")){
								Player player = (Player) sender;
								String pl = player.toString();
								bookName = plugin.getpRec().getString(pl + ".lastbook.book");
								part = plugin.getpRec().getString(pl + ".lastbook.part");
								tran = plugin.getpRec().getString(pl + ".lastbook.tran");
							}
							if(args.length >= 3){
								part = args[2];
								if(args.length >= 4){
									tran = args[3].toUpperCase();
									if(tranCheck(plugin, sender, tran) == false){
										return true;
									}
									if(args.length >= 5){
										if(args[4].equalsIgnoreCase("?")){
											Book.contains(plugin, sender, tran, bookName, part);
											return true;
										}
									}
								}
							}
						}
						if(pR == true){
							Player player = (Player) sender;
							String pl = player.toString();
							plugin.getpRec().set(pl + ".lastbook.book", bookName);
							plugin.getpRec().set(pl + ".lastbook.part", part);
							plugin.getpRec().set(pl + ".lastbook.tran", tran);
							plugin.savepRec();
						}
						Book.Run(plugin, sender, playerType, tran, bookName, part, type, p);
						return true;
					}else if(cmdType.equalsIgnoreCase("givebook")){
						if(permCheck(permsOn, playerType, sender, "givebook") == false){
							return true;
						}
						type = "give";
						String p = null;
						String part = "1";
						if(args.length < 2){
							sender.sendMessage(ChatColor.RED + "Not enough arguments!");
							sender.sendMessage(ChatColor.RED + "/bible givebook <player>");
							return true;
						}else{
							p = args[1];
						}
						if(args.length >= 3){
							bookName = args[2];
							if(args.length >= 4){
								part = args[3];
								if(args.length >= 5){
									tran = args[4].toUpperCase();
									if(tranCheck(plugin, sender, tran) == false){
										return true;
									}
								}
							}
						}
						Book.Run(plugin, sender, playerType, tran, bookName, part, type, p);
						return true;
					}else if(cmdType.equalsIgnoreCase("random") && 
							permCheck(permsOn, playerType, sender, "random") == true){
						CMDRandom.random(plugin, sender, args, bookName, chp, v, tran);
						return true;
					}else if(cmdType.equalsIgnoreCase("announce")){
						if(permCheck(permsOn, playerType, sender, "announce") == false){
							return true;
						}
						if(args.length < 4){
							sender.sendMessage(ChatColor.RED + "Not enough arguments!");
							sender.sendMessage(ChatColor.RED + "/bible announce <book> <chapter> <verse> " +
									"[translation]");
							return true;
						}
						EnumBooks ebook = EnumBooks.GENESIS;
						bookName = ebook.fromString(args[1]).name();
						chp = args[2];
						v = args[3];
						if(args.length >= 5){
							tran = args[4];
						}
						eType = "broad";
					}
				}
				if(checkForYML(plugin, sender, tran, bookName) == false){
					return true;
				}
				if(ref == null){
					ref = Reference.make(book, chp, v);
				}
				if(Reference.check(plugin, sender, bookName, tran, ref) == false){
					return true;
				}
				if(verse == null){
					verse = plugin.getBook(tran, bookName).getString(ref);
				}
				if(eType.equalsIgnoreCase("normal")){
					sender.sendMessage(ChatColor.GREEN + verse);
					return true;
				}else if(eType.equalsIgnoreCase("broad")){
					Bukkit.broadcast(ChatColor.GREEN + verse, "TadukooBible.announceget");
					plugin.getLogger().info(sender.getName() + " broadcasted " + bookName + " " + chp + ":" 
							+ v + " from the " + tran + " translation.");
					return true;
				}
			}
		}
		return false;
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

	public static boolean tranCheck(TB plugin, CommandSender sender, String tran) {
		if(plugin.getConfig().getString(tran) == null || plugin.getConfig().getBoolean(tran) == false){
			sender.sendMessage(ChatColor.RED + "Sorry, the " + tran + " translation is not available.");
			return false;
		}else{
			return true;
		}
	}
	
	private static boolean permCheck(boolean permsOn, String playerType, CommandSender sender, String perm){
		if(permsOn == true && playerType == "player"){
			if(PermissionsChecker.permCheck(sender, perm) == true){
				return true;
			}else{
				return false;
			}
		}else{
			return true;
		}
	}
}
