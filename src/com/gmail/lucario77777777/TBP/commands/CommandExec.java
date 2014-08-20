package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandExecutor;

import com.gmail.lucario77777777.TBP.Args.BooksArgs;
import com.gmail.lucario77777777.TBP.Args.HelpArgs;
import com.gmail.lucario77777777.TBP.Args.LastArgs;
import com.gmail.lucario77777777.TBP.Args.PluginArgs;
import com.gmail.lucario77777777.TBP.Args.TranslationArgs;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumChps;
import com.gmail.lucario77777777.TBP.Enums.EnumCmds;
import com.gmail.lucario77777777.TBP.Enums.EnumTrans;
import com.gmail.lucario77777777.TBP.TB;

public class CommandExec implements CommandExecutor {
	private TB plugin;
	private boolean permsOn;
	public CommandExec(TB plugin, boolean permsOn) {
		this.plugin = plugin;
		this.permsOn = permsOn;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		/*
		 * Sets default book, chapter, verse, and translation.
		 */
		EnumBooks book = EnumBooks.GENESIS;
		EnumChps echp = EnumChps.GENESIS;
		EnumTrans etran = EnumTrans.KJV;
		book = book.getDefault();
		echp = echp.getDefault();
		etran = etran.getDefault();
		String bookName = book.getBook();
		String chp = TB.config.getString("DefaultChapter");
		String v = TB.config.getString("DefaultVerse");
		String part = TB.config.getString("DefaultPart");
		String tran = etran.getTran();
		
		/*
		 * Sets default command information.
		 */
		EnumCmds cmds = EnumCmds.READ;
		String cmdType = cmds.getCmd();
		String cmdPerm = cmds.getPerm();
		
		/*
		 * Used for special cases in the read command.
		 */
		int i = 0;
		String[] chpV;
		
		/*
		 * Used for the send command.
		 */
		String player;
		
		/*
		 * Used for the Random command.
		 */
		boolean bookSet = false;
		boolean chpSet = false;
		
		/*
		 * Determine Player Type
		 */
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
				//Don't yet know how to handle command block and unknown senders.
				sender.sendMessage(ChatColor.RED + "Unknown sender!");
				return true;
			}else{
				if(args.length >= 1){
					//Check if a book name was typed.
					if(isBook(book, cmds, args, 0) != null){
						book = isBook(book, cmds, args, 0);
						bookName = book.getBook();
					//Check if a command was typed.
					}else if(isCmd(cmds, args[0]) != null){
						cmds = isCmd(cmds, args[0]);
						//Check if the command is available.
						if(!cmds.isAvailable()){
							sender.sendMessage(ChatColor.RED + "Sorry, " + cmds.getCmd() + " is not " +
									"available yet.");
							return true;
						}
						cmdType = cmds.getCmd();
						cmdPerm = cmds.getPerm();
						if(cmds == EnumCmds.READ){
							i++;
						}
					}else{
						sender.sendMessage(ChatColor.RED + "Sorry, that book/command does not exist.");
						sender.sendMessage(ChatColor.RED + "For help, please type /bible help");
						return true;
					}
				}
				if(permCheck(playerType, sender, cmdPerm)){
					if(cmdType.equalsIgnoreCase("read")){
						if(argsLengthCheck(sender, args, 0, 7, "/bible [book] [chapter] [verse] " +
								"[translation] or /bible [book] [chapter:verse] [translation] or " +
								"/bible [alias] [book] [chapter] [verse] [translation]")){
							return true;
						}
						if(args.length >= i + 1 && isBook(book, cmds, args, i) != null){
							book = isBook(book, cmds, args, i);
							bookName = book.getBook();
							i = getCurrentArg(book, cmds, args, i);
							if(args.length >= i + 1){
								if(args[i].contains(":")){
									chpV = args[i].split(":");
									chp = chpV[0];
									v = chpV[1];
									i++;
								}else{
									chp = args[i];
									i++;
									if(args.length >= i + 1){
										v = args[i];
										i++;
									}
								}
								if(args.length >= i + 1){
									tran = args[i];
								}
							}
						}
						Read.read(plugin, sender, book, echp, bookName, chp, v, tran);
						return true;
					}else if(cmdType.equalsIgnoreCase("send")){
						if(argsLengthCheck(sender, args, 5, 8, "/bible send <player> <book> <chapter> " +
								"<verse> [translation] or /bible send <player> <book> <chapter:verse> " +
								"[translation]")){
							return true;
						}
						player = args[1];
						if(isBook(book, cmds, args, 2) != null){
							book = isBook(book, cmds, args, 2);
							bookName = book.getBook();
							i = getCurrentArg(book, cmds, args, 2);
							if(args.length >= i + 1){
								if(args[i].contains(":")){
									chpV = args[i].split(":");
									chp = chpV[0];
									v = chpV[1];
									i++;
								}else{
									chp = args[i];
									i++;
									if(args.length >= i + 1){
										v = args[i];
										i++;
									}else{
										sender.sendMessage(ChatColor.RED + "Not enough args!");
										sender.sendMessage(ChatColor.RED + "/bible send <player> <book> " +
												"<chapter> <verse> [translation]");
										return true;
									}
								}
								if(args.length >= i + 1 && tranCheck(sender, args[i]) != null){
										tran = args[i];
								}
							}else{
								sender.sendMessage(ChatColor.RED + "Not enough args!");
								sender.sendMessage(ChatColor.RED + "/bible send <player> <book> " +
										"<chapter> <verse> [translation]");
								return true;
							}
						}
						if(!book.isAvailable(tran)){
							sender.sendMessage(ChatColor.RED + "Sorry, that book is not yet available in " +
									"the " + tran + " translation.");
							return true;
						}
						Send.send(plugin, sender, player, book, bookName, chp, v, tran);
						sender.sendMessage(ChatColor.GREEN + "Verse sent!");
						return true;
					}else if(cmdType.equalsIgnoreCase("previous") && TB.pR){
						Read.previous(plugin, sender, args, book, echp);
						return true;
					}else if(cmdType.equalsIgnoreCase("next") && TB.pR){
						Read.next(plugin, sender, args, book, echp);
						return true;
					}else if(cmdType.equalsIgnoreCase("last") && TB.pR){
						LastArgs.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("random")){
						if(argsLengthCheck(sender, args, 1, 6, 
								"/bible random [book] [chapter] [translation]")){
							return true;
						}
						if(args.length >= 2){
							bookName = book.fromString(args[1]).getBook();
							bookSet = true;
							if(args.length >= 3){
								chp = args[2];
								chpSet = true;
								if(args.length == 4){
									tran = args[3].toUpperCase();
								}
							}
						}
						Randomcmd.random(plugin, sender, book, echp, bookName, chp, v, tran, 
								bookSet, chpSet);
						return true;
					}else if(cmdType.equalsIgnoreCase("getbook") && consoleCheck(sender, playerType)){
						if(argsLengthCheck(sender, args, 1, 5, "/bible getbook [book] [part] [translation] " +
								"[?] or /bible getbook list")){
							return true;
						}
						if(args.length >= 2){
							if(args[1].equalsIgnoreCase("list")){
								
							}
						}
						GetBook.getbook(plugin, sender, args, bookName, part, tran);
						return true;
					}else if(cmdType.equalsIgnoreCase("sendbook")){
						SendBook.sendbook(plugin, sender, args, bookName, tran);
						return true;
					}else if(cmdType.equalsIgnoreCase("info")){
						if(argsLengthCheck(sender, args, 1, 4, "/bible info [translation|book|\"plugin\"|" +
								"\"translations|\"\"books\"]")){
							return true;
						}
						if(args.length >= 2){
							if(etran.fromString(args[1]) != null && permCheck(playerType, sender, 
									"info.translation")){
								etran = etran.fromString(args[1]);
								Translation.info(sender, plugin, etran);
								return true;
							}else if(isBook(book, cmds, args, 1) != null && permCheck(playerType, sender, 
									"info.book")){
								book = isBook(book, cmds, args, 1);
								Info.bookInfo(sender, book);
								return true;
							}else if(args[1].equalsIgnoreCase("translations") && permCheck(playerType, sender,
									"info.translation")){
								Translation.list(sender, plugin);
								return true;
							}else if(args[1].equalsIgnoreCase("books") && permCheck(playerType, sender, 
									"info.book")){
								part = "1";
								if(args.length == 3){
									part = args[2];
								}
								Books.list(sender, part);
								return true;
							}
						}else if(permCheck(playerType, sender, "info.plugin")){
							Info.pluginInfo(plugin, sender);
							return true;
						}else{
							return true;
						}
					}else if(cmdType.equalsIgnoreCase("help")){
						HelpArgs.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("plugin")){
						PluginArgs.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("books")){
						BooksArgs.run(sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("translation")){
						TranslationArgs.run(plugin, sender, args);
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
	public boolean argsLengthCheck(CommandSender sender, String[] args, int min, int max, String usage){
		if(args.length < min){
			sender.sendMessage(ChatColor.RED + "Not enough args!");
			sender.sendMessage(ChatColor.RED + usage);
			return true;
		}else if(args.length > max){
			sender.sendMessage(ChatColor.RED + "Too many args!");
			sender.sendMessage(ChatColor.RED + usage);
			return true;
		}
		return false;
	}
	
	private boolean consoleCheck(CommandSender sender, String playerType) {
		if(playerType == "console"){
			sender.sendMessage(ChatColor.RED + "You must be a player!");
			return false;
		}else{
			return true;
		}
	}

	public static boolean checkForYML(TB plugin, CommandSender sender, String tran, String bookName) {
		if(plugin.getBook(bookName, tran) == null){
			sender.sendMessage(ChatColor.RED + "Sorry, " + tran + "/" + bookName 
					+ ".yml does not exist.");
			return false;
		}else{
			return true;
		}
	}

	public static String tranCheck(CommandSender sender, String tran) {
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
	
	public EnumBooks isBook(EnumBooks book, EnumCmds cmds, String[] args, int start){
		String name;
		if(args.length >= start + 1 && cmds.fromString(args[start]) != null){
			cmds = cmds.fromString(args[start]);
			String cmd = cmds.getCmd();
			if(cmd.equalsIgnoreCase("1") || cmd.equalsIgnoreCase("2") || cmd.equalsIgnoreCase("3")){
				if(args.length > start + 1){
					name = cmd + args[start + 1];
				}else{
					return null;
				}
			}else if(cmd.equalsIgnoreCase("Song")){
				if(args.length > start + 1 && args[start + 1].equalsIgnoreCase("of")){
					if(args.length > start + 2 && (args[start + 2].equalsIgnoreCase("songs")|| 
							args[start + 2].equalsIgnoreCase("solomon"))){
						name = "SongofSongs";
					}else{
						return null;
					}
				}else{
					name = "SongofSongs";
				}
			}else{
				return null;
			}
		}else{
			name = args[start];
		}
		if(book.fromString(name) != null){
			return book.fromString(name);
		}else{
			return null;
		}
	}
	
	private int getCurrentArg(EnumBooks book, EnumCmds cmds, String[] args, int i) {
		String name;
		if(args.length >= i + 1 && cmds.fromString(args[i]) != null){
			cmds = cmds.fromString(args[i]);
			String cmd = cmds.getCmd();
			if(cmd.equalsIgnoreCase("1") || cmd.equalsIgnoreCase("2") || cmd.equalsIgnoreCase("3")){
				if(args.length > i + 1){
					name = cmd + args[i + 1];
					if(book.fromString(name) != null){
						i = i + 2;
						return i;
					}else{
						i++;
						return i;
					}
				}else{
					i++;
					return i;
				}
			}else if(cmd.equalsIgnoreCase("Song")){
				if(args.length > i + 1 && args[i + 1].equalsIgnoreCase("of")){
					if(args.length > i + 2 && (args[i + 2].equalsIgnoreCase("songs")|| 
							args[i + 2].equalsIgnoreCase("solomon"))){
						name = "SongofSongs";
						if(book.fromString(name) != null){
							i = i + 3;
							return i;
						}else{
							i++;
							return i;
						}
					}else{
						i++;
						return i;
					}
				}else{
					name = "SongofSongs";
					i++;
					return i;
				}
			}else{
				i++;
				return i;
			}
		}else{
			i++;
			return i;
		}
	}
	
	public EnumCmds isCmd(EnumCmds cmds, String name){
		if(cmds.fromString(name) != null){
			return cmds.fromString(name);
		}else{
			return null;
		}
	}
	
	/*
	 * Sending
	 */
	
	public static void sendVerseToPlayer(TB plugin, CommandSender sender, String pName, String bookName,
			String chp, String v, String tran, String ref){
		String verse = plugin.getBook(bookName, tran).getString(ref);
		if(bookName.contains("1") || bookName.contains("2") || bookName.contains("3") || 
				bookName.contains("SongofSongs")){
			bookName = bookName.replace("1", "1 ");
			bookName = bookName.replace("2", "2 ");
			bookName = bookName.replace("3", "3 ");
			bookName = bookName.replace("SongofSongs", "Song of Songs");
		}
		sender.sendMessage(ChatColor.GREEN + verse + " (" + bookName + " " + chp + ":" + v + " " + 
		tran + ")");
		savepRecs("verse", pName, bookName, chp, v, tran, null);
	}
	
	public static void sendVerseToOtherPlayer(TB plugin, Player player, String bookName, String chp, String v,
			String tran, String ref){
		String verse = plugin.getBook(bookName, tran).getString(ref);
		if(bookName.contains("1") || bookName.contains("2") || bookName.contains("3") || 
				bookName.contains("SongofSongs")){
			bookName = bookName.replace("1", "1 ");
			bookName = bookName.replace("2", "2 ");
			bookName = bookName.replace("3", "3 ");
			bookName = bookName.replace("SongofSongs", "Song of Songs");
		}
		player.sendMessage(ChatColor.GREEN + verse + " (" + bookName + " " + chp + ":" + v + " " + 
		tran + ")");
	}
	
	public static void sendInfoToPlayer(TB plugin, CommandSender sender, String info){
		sender.sendMessage(ChatColor.GREEN + info);
	}
	
	public static void broadcast(TB plugin, CommandSender sender, String bookName, String chp, String v,
			String tran, String ref){
		String verse = plugin.getBook(bookName, tran).getString(ref);
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
		if(plugin.getBook(bookName, tran).getString(ref) == null){
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
	
	public static void savepRecs(String type, String pName, String bookName, String chp,
			String v, String tran, String part){
		if(TB.pR){
			if(type == "verse"){
				TB.getpRec().set(pName + ".lastRead.bookName", bookName);
				TB.getpRec().set(pName + ".lastRead.chp", chp);
				TB.getpRec().set(pName + ".lastRead.v", v);
				TB.getpRec().set(pName + ".lastRead.tran", tran);
			}else if(type == "book"){
				TB.getpRec().set(pName + ".lastbook.book", bookName);
				TB.getpRec().set(pName + ".lastbook.part", part);
				TB.getpRec().set(pName + ".lastbook.tran", tran);
			}
			TB.savepRec();
		}
	}
}
