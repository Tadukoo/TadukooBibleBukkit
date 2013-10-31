package com.gmail.lucario77777777.TBP.commands;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandExecutor;

import com.gmail.lucario77777777.TBP.Checker;
import com.gmail.lucario77777777.TBP.Lists;
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
		Boolean pR = plugin.getConfig().getBoolean("PlayerRecords");
		if(cmd.getName().equalsIgnoreCase("bible")){
			if(playerType == "block" || playerType == "unknown"){
				sender.sendMessage(ChatColor.RED + "Unknown sender!");
				return true;
			}else{
				EnumBooks book = EnumBooks.GENESIS;
				EnumCmds cmds = EnumCmds.HELP;
				String bookName = "Genesis";
				String chp = "1";
				String v = "1";
				String tran = plugin.getConfig().getString("DefaultTranslation").toUpperCase();
				String ref = null;
				String verse = null;
				String type = null;
				String i = "1";
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
					if(book.isAvailable() == false){
						sender.sendMessage(ChatColor.RED + "Sorry, " + book.getBook() + 
								" is not available yet.");
						return true;
					}
					if(args.length >= 2){
						chp = args[1];
						if(args.length >= 3){
							v = args[2];
							if(args.length >= 4){
								tran = args[3].toUpperCase();
							}
						}
					}
					bookName = book.getBook();
					if(tranCheck(plugin, sender, tran) == false){
						return true;
					}
				}else if(type == "cmd"){
					if(cmds.isAvailable() == false){
						sender.sendMessage(ChatColor.RED + "Sorry, " + cmds.getCmd() + " is not available yet.");
						return true;
					}
					String cmdType = cmds.getCmd();
					if(cmdType.equalsIgnoreCase("first") || cmdType.equalsIgnoreCase("second") ||
							cmdType.equalsIgnoreCase("third")){
						tran = "all";
						bookName = "BibleConfig";
						ref = cmdType.toLowerCase();
					}else if(cmdType.equalsIgnoreCase("help")){
						if(args.length >= 2){
							i = args[1];
						}
						if(permCheck(permsOn, playerType, sender, "help") == false){
							return true;
						}
						Lists.help(i, sender, plugin);
						return true;
					}else if(cmdType.equalsIgnoreCase("info")){
						if(args.length < 2){
							sender.sendMessage(ChatColor.RED + "Not enough arguments!");
							sender.sendMessage(ChatColor.RED + "/bible about|info|abt|information " +
									"<translation>");
							return true;
						}
						if(permCheck(permsOn, playerType, sender, "info") == false){
							return true;
						}
						tran = args[1].toUpperCase();
						bookName = tran;
						ref = "info";
						if(tranCheck(plugin, sender, tran) == false){
							return true;
						}
					}else if(cmdType.equalsIgnoreCase("books")){
						if(args.length >= 2){
							i = args[1];
						}
						if(permCheck(permsOn, playerType, sender, "books") == false){
							return true;
						}
						Lists.booksList(i, sender);
						return true;
					}else if(cmdType.equalsIgnoreCase("translations")){
						if(permCheck(permsOn, playerType, sender, "translations") == false){
							return true;
						}
						Lists.tranList(sender, plugin);
						return true;
					}else if(cmdType.equalsIgnoreCase("getbook")){
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
						bookName = chp;
						String part = v;
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
					}else if(cmdType.equalsIgnoreCase("random")){
						if(permCheck(permsOn, playerType, sender, "random") == false){
							return true;
						}
						Random generator = new Random();
						int rB;
						int rC;
						int rV;
						EnumBooks ebook = EnumBooks.GENESIS;
						if(args.length >= 2){
							bookName = args[1];
							if(args.length >= 3){
								chp = args[2];
								if(args.length >= 4){
									tran = args[3];
								}
							}else{
								ebook = ebook.fromString(bookName);
								int lim = ebook.getChp() + 1;
								rC = generator.nextInt(lim);
								chp = Integer.toString(rC);
							}
						}else{
							rB = generator.nextInt(67);
							bookName = ebook.numtoBook(rB, "int", null, null);
						}
						int lim = plugin.getBook(tran, bookName).getInt("ch" + chp + "Lim") + 1;
						rV = generator.nextInt(lim);
						v = Integer.toString(rV);
					}
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
	
	private static boolean tranCheck(Main plugin, CommandSender sender, String tran) {
		if(plugin.getConfig().getString(tran) == null || plugin.getConfig().getBoolean(tran) == false){
			sender.sendMessage(ChatColor.RED + "Sorry, that translation is not available.");
			return false;
		}else{
			return true;
		}
	}
	
	private static boolean permCheck(boolean permsOn, String playerType, CommandSender sender, String perm){
		if(permsOn == true && playerType == "player"){
			if(Checker.permCheck(sender, perm) == true){
				return true;
			}else{
				return false;
			}
		}else{
			return true;
		}
	}
}
