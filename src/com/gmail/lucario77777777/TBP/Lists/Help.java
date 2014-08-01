package com.gmail.lucario77777777.TBP.Lists;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumHelp;

public class Help {
	public static void help(TB plugin, CommandSender sender, String[] args){
		String i;
		String num = "1";
		String numU = "2";
		String pages = "22";
		if(args.length >= 2){
			EnumHelp ehelp = EnumHelp.TABLEOFCONTENTS;
			if(ehelp.fromString(args[1]) != null){
				ehelp = ehelp.fromString(args[1]);
				i = ehelp.getPage();
				num = ehelp.getNum();
				numU = String.valueOf(Integer.parseInt(num) + 1);
			}else{
				i = args[1];
			}
		}else{
			i = "toc1";
		}
		if(i.equalsIgnoreCase("toc1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" Table of Contents (1/4).");
			sender.sendMessage(ChatColor.GREEN + "Page 5. /bible");
			sender.sendMessage(ChatColor.GREEN + "Page 8. /bible previous");
			sender.sendMessage(ChatColor.GREEN + "Page 9. /bible next");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help " + numU + " for the next page.");
			return;
		}else if(i.equalsIgnoreCase("toc2")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" Table of Contents (2/4).");
			sender.sendMessage(ChatColor.GREEN + "Page 10. /bible last");
			sender.sendMessage(ChatColor.GREEN + "Page 11. /bible random");
			sender.sendMessage(ChatColor.GREEN + "Page 13. /bible getbook");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help " + numU + " for the next page.");
			return;
		}else if(i.equalsIgnoreCase("toc3")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" Table of Contents (3/4)");
			sender.sendMessage(ChatColor.GREEN + "Page 16. /bible sendbook");
			sender.sendMessage(ChatColor.GREEN + "Page 18. /bible info");
			sender.sendMessage(ChatColor.GREEN + "Page 19. /bible books");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help " + numU + " for the next page.");
			return;
		}else if(i.equalsIgnoreCase("toc4")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" Table of Contents (4/4)");
			sender.sendMessage(ChatColor.GREEN + "Page 20. /bible translations");
			sender.sendMessage(ChatColor.GREEN + "Page 21. /bible config");
			sender.sendMessage(ChatColor.GREEN + "Page 22. /bible announce");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help " + numU + " for the next page.");
			return;
		}else if(i.equalsIgnoreCase("read1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible (1/3)");
			sender.sendMessage(ChatColor.GREEN + "Description: Shows you a Bible verse.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible [book] [chapter #] [verse #] [translation]");
			sender.sendMessage(ChatColor.GREEN + "Defaults: /bible Genesis 1 1 " + 
					plugin.getConfig().getString("DefaultTranslation"));
			sender.sendMessage(ChatColor.GREEN + "Type /bible help " + numU + " for more info about /bible.");
			return;
		}else if(i.equalsIgnoreCase("read2")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible Cont. (2/3)");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.verse.read");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help " + numU + " for info about replacements " +
					"in /bible.");
			return;
		}else if(i.equalsIgnoreCase("read3")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible Cont. (3/3)");
			sender.sendMessage(ChatColor.GREEN + "[chapter #] can be replaced with:");
			sender.sendMessage(ChatColor.GREEN + "# to list how many chapters are in that book.");
			sender.sendMessage(ChatColor.GREEN + "info or ? to tell information about that book.");
			sender.sendMessage(ChatColor.GREEN + "[verse #] can be replaced with #, info, or ? to list how " +
					"many verses are in that chapter.");
			return;
		}else if(i.equalsIgnoreCase("previous1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible previous (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Shows you the verse before the one you read " +
					"last.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible previous [translation]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: pre, prev, back, before, and b4.");
			sender.sendMessage(ChatColor.GREEN + "This will give a warning if you try to go before Genesis " +
					"1:1");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.verse.previous");
			return;
		}else if(i.equalsIgnoreCase("next1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible next (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Shows you the verse after the one you read " +
					"last.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible next [translation]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: pre, prev, back, before, and b4.");
			sender.sendMessage(ChatColor.GREEN + "This will give a warning if you try to go after 3 John " +
					"1:14");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.verse.next");
			return;
		}else if(i.equalsIgnoreCase("last1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible last (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Shows you the verse you read last.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible last [translation]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: saved, save, load, lastverse, verselast, lastv, " +
					"vlast, versesaved, savedverse, vsaved, savedv, vsave, versesave, loadverse, verseload, " +
					"vload, and loadv.");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.verse.last");
			return;
		}else if(i.equalsIgnoreCase("random1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible random (1/2)");
			sender.sendMessage(ChatColor.GREEN + "Description: Shows you a random verse of the Bible.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible random [book] [chapter] [translation]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: rand, randomverse, randomv, verserandom, " +
					"vrandom, randverse, randv, verserand, and vrand.");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help " + numU + " for more information and " +
					"the permission.");
			return;
		}else if(i.equalsIgnoreCase("random2")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible random Cont. (2/2)");
			sender.sendMessage(ChatColor.GREEN + "If no book or chapter are specified, they are random as " +
					"well.");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.verse.random");
			return;
		}else if(i.equalsIgnoreCase("getbook1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible getbook (1/3)");
			sender.sendMessage(ChatColor.GREEN + "Description: Gives you part of the Bible in book form.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible getbook [book] [part #] [translation] [?]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: book, bookget, bibleget, and getbible.");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help " + numU + " for defaults, permission, " +
					"and a note.");
			return;
		}else if(i.equalsIgnoreCase("getbook2")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible getbook Cont. (2/3)");
			sender.sendMessage(ChatColor.GREEN + "Defaults: /bible getbook Genesis 1 " + 
					plugin.getConfig().getString("DefaultTranslation"));
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.book.get");
			sender.sendMessage(ChatColor.GREEN + "Note: [part #] is not [chapter #]");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help " + numU + " for more options for this " +
					"command.");
			return;
		}else if(i.equalsIgnoreCase("getbook3")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible getbook Cont. (3/3)");
			sender.sendMessage(ChatColor.GREEN + "? is used to show what's in that part.");
			sender.sendMessage(ChatColor.GREEN + "[book] can be replaced with previous or its aliases to " +
					"get the previous book.");
			sender.sendMessage(ChatColor.GREEN + "[book] can be replaced with next or its aliases to get " +
					"the next book.");
			sender.sendMessage(ChatColor.GREEN + "[book] can be replaced with last or its aliases to get " +
					"the book you got the last time you typed the command.");
			return;
		}else if(i.equalsIgnoreCase("sendbook1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible sendbook (1/2)");
			sender.sendMessage(ChatColor.GREEN + "Description: Sends part of the Bible in book form to a " +
					"player.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible sendbook <player> [book] [part #] " +
					"[translation]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: booksend, sendbible, biblesend, givebook, " +
					"bookgive, biblegive, and givebible");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help " + numU + " for defaults, permission, " +
					"and a note.");
			return;
		}else if(i.equalsIgnoreCase("sendbook2")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible sendbook Cont. (2/2)");
			sender.sendMessage(ChatColor.GREEN + "Defaults: /bible sendbook <player> Genesis 1 " + 
					plugin.getConfig().getString("DefaultTranslation"));
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.book.give");
			sender.sendMessage(ChatColor.GREEN + "Note: [part #] is not [chapter #]");
			return;
		}else if(i.equalsIgnoreCase("info1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible info (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Tells you information about a specific " +
					"translation.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible info <translation>");
			sender.sendMessage(ChatColor.GREEN + "Aliases: about, abt, and information.");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.info.help");
			return;
		}else if(i.equalsIgnoreCase("books1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible books (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Lists all the books in the Bible.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible books [page]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: bookslist, listbooks, and booklist.");
			sender.sendMessage(ChatColor.GREEN + "Books in red are unavailable, while books in green are " +
					"available.");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.info.book");
			return;
		}else if(i.equalsIgnoreCase("translations1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible translations (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Lists available translations.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible translations");
			sender.sendMessage(ChatColor.GREEN + "Aliases: translist, translationslist, listtrans, " +
					"tran, and trans.");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.info.translation");
			return;
		}else if(i.equalsIgnoreCase("config1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible config (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Shows or changes a setting in the config.yml");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible config <setting> [value]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: configuration, settings, set, and options.");
			sender.sendMessage(ChatColor.GREEN + "Typing a value will set it to that value, while leaving " +
					"it out will show what the current value is.");
			sender.sendMessage(ChatColor.GREEN + "<setting> can be replace with list to list all the " +
					"settings.");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.op.config");
			return;
		}else if(i.equalsIgnoreCase("announce1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + num + "/" + pages +
					" /bible announce (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Announces a Bible verse to the server.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible announce <book> <chapter> <verse> " +
					"[translation]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: ann, broadcast, broad, shout, and yell.");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.op.announce");
			sender.sendMessage(ChatColor.GREEN + "You need TadukooBible.verse.announceget to see " +
					"announcements.");
			return;
		}
	}
}
