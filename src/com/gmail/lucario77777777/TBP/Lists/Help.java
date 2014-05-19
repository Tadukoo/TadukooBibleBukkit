package com.gmail.lucario77777777.TBP.Lists;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;

public class Help {
	public static void help(String i, CommandSender sender, TB plugin){
		/*******************************************************
		 *          Page 1/17 Table of Contents (1/3)          *
		 *                                                     *
		 *******************************************************/
		if(i.equalsIgnoreCase("1") || i.equalsIgnoreCase("toc") || i.equalsIgnoreCase("tableofcontents")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 1/17 Table of Contents (1/3).");
			sender.sendMessage(ChatColor.GREEN + "Page 4. /bible");
			sender.sendMessage(ChatColor.GREEN + "Page 6. /bible config");
			sender.sendMessage(ChatColor.GREEN + "Page 7. /bible info");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help 2 for the next page.");
			return;
		/*******************************************************
		 *          Page 2/17 Table of Contents (2/3)          *
		 *                                                     *
		 *******************************************************/
		}else if(i.equalsIgnoreCase("2") || i.equalsIgnoreCase("toc2") || 
				i.equalsIgnoreCase("tableofcontents2")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 2/17 Table of Contents (2/3).");
			sender.sendMessage(ChatColor.GREEN + "Page 8. /bible books");
			sender.sendMessage(ChatColor.GREEN + "Page 9. /bible translations");
			sender.sendMessage(ChatColor.GREEN + "Page 10. /bible getbook");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help 3 for the next page.");
			return;
		/*******************************************************
		 *          Page 3/17 Table of Contents (3/3)          *
		 *                                                     *
		 *******************************************************/
		}else if(i.equalsIgnoreCase("3") || i.equalsIgnoreCase("toc3") || 
				i.equalsIgnoreCase("tableofcontents3")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 3/17 Table of Contents (3/3)");
			sender.sendMessage(ChatColor.GREEN + "Page 13. /bible givebook");
			sender.sendMessage(ChatColor.GREEN + "Page 14. /bible random");
			sender.sendMessage(ChatColor.GREEN + "Page 17. /bible announce");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help 4 for the next page.");
			return;
		/*******************************************************
		 *              Page 4/17 /bible (1/2)                 *
		 *                                                     *
		 *******************************************************/
		}else if(i.equalsIgnoreCase("4") || i.equalsIgnoreCase("bible") || i.equalsIgnoreCase("read")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 4/17 /bible (1/2)");
			sender.sendMessage(ChatColor.GREEN + "Description: Shows you a Bible verse.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible [book] [chapter #] [verse #] [translation]");
			sender.sendMessage(ChatColor.GREEN + "Defaults: /bible Genesis 1 1 " + 
					plugin.getConfig().getString("DefaultTranslation"));
			sender.sendMessage(ChatColor.GREEN + "Type /bible help 5 for info about replacements in /bible.");
			return;
		/*******************************************************
		 *              Page 5/17 /bible (2/2)                 *
		 *                                                     *
		 *******************************************************/
		}else if(i.equalsIgnoreCase("5") || i.equalsIgnoreCase("bible2") || i.equalsIgnoreCase("read2")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 5/17 /bible Cont. (2/2)");
			sender.sendMessage(ChatColor.GREEN + "[chapter #] can be replaced with:");
			sender.sendMessage(ChatColor.GREEN + "# to list how many chapters are in that book.");
			sender.sendMessage(ChatColor.GREEN + "info or ? to tell information about that book.");
			sender.sendMessage(ChatColor.GREEN + "[verse #] can be replaced with #, info, or ? to list how " +
					"many verses are in that chapter.");
			return;
		/*******************************************************
		 *          Page 6/17 /bible config (1/1)              *
		 *                                                     *
		 *******************************************************/
		}else if(i.equalsIgnoreCase("6") || i.equalsIgnoreCase("config") || i.equalsIgnoreCase("configuration")
				|| i.equalsIgnoreCase("settings") || i.equalsIgnoreCase("set") || i.equalsIgnoreCase("options")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 6/17 /bible config (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Shows or changes a setting in the config.yml");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible config <setting> [value]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: configuration, settings, set, and options.");
			sender.sendMessage(ChatColor.GREEN + "Typing a value will set it to that value, while leaving it" +
					" out will show what the current value is.");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.config");
			return;
		/*******************************************************
		 *            Page 7/17 /bible info (1/1)              *
		 *                                                     *
		 *******************************************************/
		}else if(i.equalsIgnoreCase("7") || i.equalsIgnoreCase("info") || i.equalsIgnoreCase("about") ||
				i.equalsIgnoreCase("abt") || i.equalsIgnoreCase("information")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 7/17 /bible info (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Tells you information about a specific " +
					"translation.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible info <translation>");
			sender.sendMessage(ChatColor.GREEN + "Aliases: about, abt, and information.");
			return;
		/*******************************************************
		 *          Page 8/17 /bible books (1/1)               *
		 *                                                     *
		 *******************************************************/
		}else if(i.equalsIgnoreCase("8") || i.equalsIgnoreCase("books") || i.equalsIgnoreCase("bookslist") ||
				i.equalsIgnoreCase("listbooks") || i.equalsIgnoreCase("booklist")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 8/17 /bible books (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Lists all the books in the Bible.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible books [page]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: bookslist, listbooks, and booklist.");
			sender.sendMessage(ChatColor.GREEN + "Red = unavailable, Yellow = Partially Available, " +
					"Green = Completely available.");
			return;
		/*******************************************************
		 *       Page 9/17 /bible translations (1/1)           *
		 *                                                     *
		 *******************************************************/
		}else if(i.equalsIgnoreCase("9") || i.equalsIgnoreCase("translations") || 
				i.equalsIgnoreCase("translist") || i.equalsIgnoreCase("translationslist") ||
				i.equalsIgnoreCase("listtrans") || i.equalsIgnoreCase("tran") || i.equalsIgnoreCase("trans")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 9/17 /bible translations (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Lists available translations.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible translations");
			sender.sendMessage(ChatColor.GREEN + "Aliases: translist, translationslist, listtrans, " +
					"tran, and trans.");
			return;
		/*******************************************************
		 *        Page 10/17 /bible getbook (1/3)              *
		 *                                                     *
		 *******************************************************/
		}else if(i.equalsIgnoreCase("10") || i.equalsIgnoreCase("getbook") || i.equalsIgnoreCase("book") ||
				i.equalsIgnoreCase("bookget") || i.equalsIgnoreCase("bible") || i.equalsIgnoreCase("bibleget") ||
				i.equalsIgnoreCase("getbible")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 10/17 /bible getbook (1/3)");
			sender.sendMessage(ChatColor.GREEN + "Description: Gives you a book of part of the Bible.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible getbook [book] [part #] [translation] [?]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: book, bookget, bible, bibleget, and getbible.");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help 11 for defaults, permission, and a note.");
			return;
		/*******************************************************
		 *        Page 11/17 /bible getbook (2/3)              *
		 *                                                     *
		 *******************************************************/
		}else if(i.equalsIgnoreCase("11") || i.equalsIgnoreCase("getbook2") || i.equalsIgnoreCase("book2") ||
				i.equalsIgnoreCase("bookget2") || i.equalsIgnoreCase("bible2") || 
				i.equalsIgnoreCase("bibleget2") || i.equalsIgnoreCase("getbible2")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 11/17 /bible getbook Cont. (2/3)");
			sender.sendMessage(ChatColor.GREEN + "Defaults: /bible getbook Genesis 1 " + 
					plugin.getConfig().getString("DefaultTranslation"));
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.getbook");
			sender.sendMessage(ChatColor.GREEN + "Note: [part #] is not [chapter #]");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help 12 for more options for this command.");
			return;
		/*******************************************************
		 *        Page 12/17 /bible getbook (3/3)              *
		 *                                                     *
		 *******************************************************/
		}else if(i.equalsIgnoreCase("12") || i.equalsIgnoreCase("getbook3") || i.equalsIgnoreCase("book3") ||
				i.equalsIgnoreCase("bookget3") || i.equalsIgnoreCase("bible3") || 
				i.equalsIgnoreCase("bibleget3") || i.equalsIgnoreCase("getbible3")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 12/17 /bible getbook Cont. (3/3)");
			sender.sendMessage(ChatColor.GREEN + "? is used to show what's in that part.");
			sender.sendMessage(ChatColor.GREEN + "[book] can be replaced with previous, pre, prev, back, " +
					"before, or b4 to get the previous book.");
			sender.sendMessage(ChatColor.GREEN + "[book] can be replaced with next, forward, for, after, or " +
					"aft to get the next book.");
			sender.sendMessage(ChatColor.GREEN + "[book] can be replaced with last, saved, save, or load to " +
					"get the book you got the last time you typed the command.");
			return;
		/*******************************************************
		 *        Page 13/17 /bible givebook (1/2)             *
		 *                                                     *
		 *******************************************************/
		}else if(i.equalsIgnoreCase("13") || i.equalsIgnoreCase("givebook") || i.equalsIgnoreCase("bookgive") ||
				i.equalsIgnoreCase("biblegive") || i.equalsIgnoreCase("givebible")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 13/17 /bible givebook (1/2)");
			sender.sendMessage(ChatColor.GREEN + "Description: Gives someone else a book of part of the Bible.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible givebook <player> [book] [part #] " +
					"[translation]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: bookgive, biblegive, and givebible.");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help 14 for defaults, permission, and a note.");
			return;
		/*******************************************************
		 *        Page 14/17 /bible givebook (2/2)             *
		 *                                                     *
		 *******************************************************/
		}else if(i.equalsIgnoreCase("14") || i.equalsIgnoreCase("givebook2") || i.equalsIgnoreCase("bookgive2")
				|| i.equalsIgnoreCase("biblegive2") || i.equalsIgnoreCase("givebible2")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 14/17 /bible givebook Cont. (2/2)");
			sender.sendMessage(ChatColor.GREEN + "Defaults: /bible givebook <player> Genesis 1 " + 
					plugin.getConfig().getString("DefaultTranslation"));
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.givebook");
			sender.sendMessage(ChatColor.GREEN + "Note: [part #] is not [chapter #]");
			return;
		/*******************************************************
		 *         Page 15/17 /bible random (1/2)              *
		 *                                                     *
		 *******************************************************/
		}else if(i.equalsIgnoreCase("15") || i.equalsIgnoreCase("random") || i.equalsIgnoreCase("rand") ||
				i.equalsIgnoreCase("randomverse") || i.equalsIgnoreCase("randomv") ||
				i.equalsIgnoreCase("verserandom") || i.equalsIgnoreCase("vrandom") || 
				i.equalsIgnoreCase("randverse") || i.equalsIgnoreCase("randv") || 
				i.equalsIgnoreCase("verserand") || i.equalsIgnoreCase("vrand")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 15/17 /bible random (1/2)");
			sender.sendMessage(ChatColor.GREEN + "Description: Shows you a random verse of the Bible.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible random [book] [chapter] [translation]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: rand, randomverse, randomv, verserandom, vrandom, " +
					"randverse, randv, verserand, and vrand.");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help 16 for more information and the permission.");
			return;
		/*******************************************************
		 *         Page 16/17 /bible random (2/2)              *
		 *                                                     *
		 *******************************************************/
		}else if(i.equalsIgnoreCase("16") || i.equalsIgnoreCase("random2") || i.equalsIgnoreCase("rand2") ||
				i.equalsIgnoreCase("randomverse2") || i.equalsIgnoreCase("randomv2") ||
				i.equalsIgnoreCase("verserandom2") || i.equalsIgnoreCase("vrandom2") || 
				i.equalsIgnoreCase("randverse2") || i.equalsIgnoreCase("randv2") || 
				i.equalsIgnoreCase("verserand2") || i.equalsIgnoreCase("vrand2")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 16/17 /bible random Cont. (2/2)");
			sender.sendMessage(ChatColor.GREEN + "If no book or chapter are specified, they are random as " +
					"well.");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.random");
			return;
		/*******************************************************
		 *           Page 17/17 /bible announce (1/1)          *
		 *                                                     *
		 *******************************************************/
		}else if(i.equalsIgnoreCase("17") || i.equalsIgnoreCase("announce") || i.equalsIgnoreCase("ann") || 
				i.equalsIgnoreCase("broadcast") || i.equalsIgnoreCase("broad")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 17/17 /bible announce (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Broadcasts a Bible verse.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible announce <book> <chapter> <verse> " +
					"[translation]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: ann, broadcast, and broad.");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.announce");
			sender.sendMessage(ChatColor.GREEN + "You need TadukooBible.announceget to see announcements.");
			return;
		}
	}
}
