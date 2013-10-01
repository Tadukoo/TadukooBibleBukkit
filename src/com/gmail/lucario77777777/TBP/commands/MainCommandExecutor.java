package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandExecutor;

import com.gmail.lucario77777777.TBP.Main;
import com.gmail.lucario77777777.TBP.commands.KJV.Books.KJVBook;

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
				String translation = null;
				EnumBooks book = EnumBooks.GENESIS;
				String bookName = null;
				String chp = null;
				String v = null;
				String ref = null;
				String verse = null;
				if(args.length == 0){
					sender.sendMessage(ChatColor.RED + "Not enough arguments!");
					return true;
				}
				if(args.length >= 1){
					if(args[0].equalsIgnoreCase("?") || args[0].equalsIgnoreCase("list")){
						String a = plugin.getConfig().getString("translations");
						String b = plugin.getConfig().getString("translationsList");
						sender.sendMessage(ChatColor.GREEN + a);
						sender.sendMessage(ChatColor.GREEN + b);
						return true;
					}else{
						translation = args[0];
					}
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
				if(plugin.getDataFolder() + "/" + translation == null){
					sender.sendMessage(ChatColor.RED + "Sorry, that translation is not available.");
					return true;
				}
				if(book.isAvailable() == true){
					switch(book){
					case GENESIS:
						bookName = "Genesis";
						break;
					case EXODUS:
						bookName = "Exodus";
						break;
					case LEVITICUS:
						bookName = "Leviticus";
						break;
					case NUMBERS:
						bookName = "Numbers";
						break;
					case DEUTERONOMY:
						bookName = "Deuteronomy";
						break;
					case JOSHUA:
						bookName = "Joshua";
						break;
					case JUDGES:
						bookName = "Judges";
						break;
					case RUTH:
						bookName = "Ruth";
						break;
					case SAMUEL1:
						bookName = "1Samuel";
						break;
					case SAMUEL2:
						bookName = "2Samuel";
						break;
					case KINGS1:
						bookName = "1Kings";
						break;
					case KINGS2:
						bookName = "2Kings";
						break;
					case CHRONICLES1:
						bookName = "1Chronicles";
						break;
					case CHRONICLES2:
						bookName = "2Chronicles";
						break;
					case EZRA:
						bookName = "Ezra";
						break;
					case NEHEMIAH:
						bookName = "Nehemiah";
						break;
					case ESTHER:
						bookName = "Esther";
						break;
					case JOB:
						bookName = "Job";
						break;
					case PSALMS:
						bookName = "Psalms";
						break;
					case PROVERBS:
						bookName = "Proverbs";
						break;
					case ECCLESIASTES:
						bookName = "Ecclesiastes";
						break;
					case SONGOFSONGS:
						bookName = "SongofSongs";
						break;
					case ISAIAH:
						bookName = "Isaiah";
						break;
					case JEREMIAH:
						bookName = "Jeremiah";
						break;
					case LAMENTATIONS:
						bookName = "Lamentations";
						break;
					case EZEKIEL:
						bookName = "Ezekiel";
						break;
					case DANIEL:
						bookName = "Daniel";
						break;
					case HOSEA:
						bookName = "Hosea";
						break;
					case JOEL:
						bookName = "Joel";
						break;
					case AMOS:
						bookName = "Amos";
						break;
					case OBADIAH:
						bookName = "Obadiah";
						break;
					case JONAH:
						bookName = "Jonah";
						break;
					case MICAH:
						bookName = "Micah";
						break;
					case NAHUM:
						bookName = "Nahum";
						break;
					case HABAKKUK:
						bookName = "Habakkuk";
						break;
					case ZEPHANIAH:
						bookName = "Zephaniah";
						break;
					case HAGGAI:
						bookName = "Haggai";
						break;
					case ZECHARIAH:
						bookName = "Zechariah";
						break;
					case MALACHI:
						bookName = "Malachi";
						break;
					case MATTHEW:
						bookName = "Matthew";
						break;
					case MARK:
						bookName = "Mark";
						break;
					case LUKE:
						bookName = "Luke";
						break;
					case JOHN:
						bookName = "John";
						break;
					case ACTS:
						bookName = "Acts";
						break;
					case ROMANS:
						bookName = "Romans";
						break;
					case CORINTHIANS1:
						bookName = "1Corinthians";
						break;
					case CORINTHIANS2:
						bookName = "2Corinthians";
						break;
					case GALATIANS:
						bookName = "Galatians";
						break;
					case EPHESIANS:
						bookName = "Ephesians";
						break;
					case PHILIPPIANS:
						bookName = "Philippians";
						break;
					case COLOSSIANS:
						bookName = "Colossians";
						break;
					case THESSALONIANS1:
						bookName = "1Thessalonians";
						break;
					case THESSALONIANS2:
						bookName = "2Thessalonians";
						break;
					case TIMOTHY1:
						bookName = "1Timothy";
						break;
					case TIMOTHY2:
						bookName = "2Timothy";
						break;
					case TITUS:
						bookName = "Titus";
						break;
					case PHILEMON:
						bookName = "Philemon";
						break;
					case HEBREWS:
						bookName = "Hebrews";
						break;
					case JAMES:
						bookName = "James";
						break;
					case PETER1:
						bookName = "1Peter";
						break;
					case PETER2:
						bookName = "2Peter";
						break;
					case JOHN1:
						bookName = "1John";
						break;
					case JOHN2:
						bookName = "2John";
						break;
					case JOHN3:
						bookName = "3John";
						break;
					case JUDE:
						bookName = "Jude";
						break;
					case REVELATION:
						bookName = "Revelation";
						break;
					case FIRST:
						verse = plugin.getConfig().getString("first");
						break;
					case SECOND:
						verse = plugin.getConfig().getString("second");
						break;
					case THIRD:
						verse = plugin.getConfig().getString("third");
						break;
					case INFO:
						bookName = translation;
						ref = "info";
						break;
					case BOOKS:
						BooksList.list1(sender);
						return true;
					case BOOKS2:
						BooksList.list2(sender);
						return true;
					case BOOKS3:
						BooksList.list3(sender);
						return true;
					case BOOKS4:
						BooksList.list4(sender);
						return true;
					case BOOKS5:
						BooksList.list5(sender);
						return true;
					case BOOK:
						KJVBook.Run(sender, args, playerType, plugin);
						return true;
					}
				}else if(book.isAvailable() == false){
					sender.sendMessage(ChatColor.RED + "Sorry, " + book.getBook() + " is not available yet.");
					return true;
				}
				if(plugin.getBook(translation, bookName) == null){
					sender.sendMessage(ChatColor.RED + "Sorry, " + bookName + " is not available.");
					return true;
				}
				if(chp == null){
					chp = "1";
				}
				if(v == null){
					v = "1";
				}
				if(ref == null){
					ref = "ch" + chp + "v" + v;
				}
				if(plugin.getBook(translation, bookName).getString(ref) == null){
					sender.sendMessage(ChatColor.RED + "An error occurred. Please make sure you typed in a " +
							"chapter/verse that exists.");
					return true;
				}
				if(plugin.getBook(translation, bookName).getString(ref) == null){
					sender.sendMessage(ChatColor.RED + "An error occurred.");
					return true;
				}
				if(verse == null){
					verse = plugin.getBook(translation, bookName).getString(ref);
				}
				sender.sendMessage(ChatColor.GREEN + verse);
				return true;
			}
		}
		return false;
	}
}