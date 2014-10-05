package com.gmail.lucario77777777.TBP.cmdhandling;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumHelp;

public class HelpPages {
	private static int readPage = EnumHelp.READ.getNum();
	private static int sendPage = EnumHelp.SEND.getNum();
	private static int previousPage = EnumHelp.PREVIOUS.getNum();
	private static int nextPage = EnumHelp.NEXT.getNum();
	private static int lastPage = EnumHelp.LAST.getNum();
	private static int randomPage = EnumHelp.RANDOM.getNum();
	private static int getbookPage = EnumHelp.GETBOOK.getNum();
	private static int sendbookPage = EnumHelp.SENDBOOK.getNum();
	private static int infoPage = EnumHelp.INFO.getNum();
	private static int pluginPage = EnumHelp.PLUGIN.getNum();
	private static int booksPage = EnumHelp.BOOKS.getNum();
	private static int translationPage = EnumHelp.TRANSLATION.getNum();
	private static int configPage = EnumHelp.CONFIG.getNum();
	private static int announcePage = EnumHelp.ANNOUNCE.getNum();
	private static int maxPages = EnumHelp.ANNOUNCE.getNum();
	
	public static void help(TB plugin, CommandSender sender, String page, int helpPage, int helpPageU){
		String heading = plugin.getLanguage().getString("help.heading");
		heading = heading.replaceAll("{helpPage}", String.valueOf(helpPage));
		heading = heading.replaceAll("{maxPages}", String.valueOf(maxPages));
		String line1 = "", line2 = "", line3 = "", line4 = "";
		String pageNext = plugin.getLanguage().getString("help.nextPage.generic");
		pageNext = pageNext.replaceAll("{nextPage}", String.valueOf(helpPageU));
		String pageNextspec = plugin.getLanguage().getString("help.nextPage.specific");
		pageNextspec = pageNextspec.replaceAll("{nextPage}", String.valueOf(helpPageU));
		if(page.equalsIgnoreCase("toc1")){
			heading = heading.replaceAll("title}", plugin.getLanguage().getString("help.titles.toc"));
			heading = heading.replaceAll("{minorPage}", String.valueOf(1));
			heading = heading.replaceAll("{maxMinorPages}", String.valueOf(5));
			line1 = plugin.getLanguage().getString("help.pages.toc");
			line2 = line1;
			line3 = line1;
			line1 = line1.replaceAll("{pageType}", String.valueOf(readPage));
			line1 = line1.replaceAll(" {command}", "");
			line2 = line2.replaceAll("{pageType}", String.valueOf(sendPage));
			line2 = line2.replaceAll("{command}", plugin.getLanguage().getString("commands.send"));
			line3 = line3.replaceAll("{pageType}", String.valueOf(previousPage));
			line3 = line3.replaceAll("{command}", plugin.getLanguage().getString("commands.previous"));
			line4 = pageNext;
		}else if(page.equalsIgnoreCase("toc2")){
			heading = heading.replaceAll("{title}", plugin.getLanguage().getString("help.titles.toc"));
			heading = heading.replaceAll("{minorPage}", String.valueOf(2));
			heading = heading.replaceAll("{maxMinorPages}", String.valueOf(5));
			line1 = plugin.getLanguage().getString("help.pages.toc");
			line2 = line1;
			line3 = line1;
			line1 = line1.replaceAll("{pageType}", String.valueOf(nextPage));
			line1 = line1.replaceAll("{command}", plugin.getLanguage().getString("commands.next"));
			line2 = line2.replaceAll("{pageType}", String.valueOf(lastPage));
			line2 = line2.replaceAll("{command}", plugin.getLanguage().getString("commands.last"));
			line3 = line3.replaceAll("{pageType}", String.valueOf(randomPage));
			line3 = line3.replaceAll("{command}", plugin.getLanguage().getString("commands.random"));
			line4 = pageNext;
		}else if(page.equalsIgnoreCase("toc3")){
			heading = heading.replaceAll("{title}", plugin.getLanguage().getString("help.titles.toc"));
			heading = heading.replaceAll("{minorPage}", String.valueOf(3));
			heading = heading.replaceAll("{maxMinorPages}", String.valueOf(5));
			line1 = plugin.getLanguage().getString("help.pages.toc");
			line2 = line1;
			line3 = line1;
			line1 = line1.replaceAll("{pageType}", String.valueOf(getbookPage));
			line1 = line1.replaceAll("{command}", plugin.getLanguage().getString("commands.getbook"));
			line2 = line2.replaceAll("{pageType}", String.valueOf(sendbookPage));
			line2 = line2.replaceAll("{command}", plugin.getLanguage().getString("commands.sendbook"));
			line3 = line3.replaceAll("{pageType}", String.valueOf(infoPage));
			line3 = line3.replaceAll("{command}", plugin.getLanguage().getString("commands.info"));
			line4 = pageNext;
		}else if(page.equalsIgnoreCase("toc4")){
			heading = heading.replaceAll("{title}", plugin.getLanguage().getString("help.titles.toc"));
			heading = heading.replaceAll("{minorPage}", String.valueOf(4));
			heading = heading.replaceAll("{maxMinorPages}", String.valueOf(5));
			line1 = plugin.getLanguage().getString("help.pages.toc");
			line2 = line1;
			line3 = line1;
			line1 = line1.replaceAll("{pageType}", String.valueOf(pluginPage));
			line1 = line1.replaceAll("{commands}", plugin.getLanguage().getString("commands.plugin"));
			line2 = line2.replaceAll("{pageType}", String.valueOf(booksPage));
			line2 = line2.replaceAll("{commands}", plugin.getLanguage().getString("commands.books"));
			line3 = line3.replaceAll("{pageType}", String.valueOf(translationPage));
			line3 = line3.replaceAll("{commands}", plugin.getLanguage().getString("commands.translation"));
			line4 = pageNext;
		}else if(page.equalsIgnoreCase("toc5")){
			heading = heading.replaceAll("{title}", plugin.getLanguage().getString("help.titles.toc"));
			heading = heading.replaceAll("{minorPage}", String.valueOf(5));
			heading = heading.replaceAll("{maxMinorPages}", String.valueOf(5));
			line1 = plugin.getLanguage().getString("help.pages.toc");
			line2 = line1;
			line1 = line1.replaceAll("{pageType}", String.valueOf(configPage));
			line1 = line1.replaceAll("{commands}", plugin.getLanguage().getString("commands.config"));
			line2 = line2.replaceAll("{pageType}", String.valueOf(announcePage));
			line2 = line2.replaceAll("{commands}", plugin.getLanguage().getString("commands.announce"));
			line3 = pageNext;
		}else if(page.equalsIgnoreCase("read1")){
			heading = heading.replaceAll("{title}", plugin.getLanguage().getString("help.titles.read"));
			heading = heading.replaceAll("{minorPage}", String.valueOf(1));
			heading = heading.replaceAll("{maxMinorPages}", String.valueOf(3));
			line1 = plugin.getLanguage().getString("help.pages.read.description");
			line2 = plugin.getLanguage().getString("help.pages.read.aliases");
			line3 = plugin.getLanguage().getString("help.pages.read.usage");
			line4 = pageNextspec.replaceAll("{command}", "/bible");
		}else if(page.equalsIgnoreCase("read2")){
			heading = heading.replaceAll("{title}", plugin.getLanguage().getString("help.titles.read"));
			heading = heading.replaceAll("{minorPage}", String.valueOf(2));
			heading = heading.replaceAll("{maxMinorPages}", String.valueOf(3));
			line1 = plugin.getLanguage().getString("help.pages.read.altusage");
			line2 = plugin.getLanguage().getString("help.pages.read.defaults");
			line2 = line2.replaceAll("{defBook}", plugin.getConfig().getString("DefaultBook"));
			line2 = line2.replaceAll("{defChp}", plugin.getConfig().getString("DefaultChapter"));
			line2 = line2.replaceAll("{defV}", plugin.getConfig().getString("DefaultVerse"));
			line2 = line2.replaceAll("{defTran}", plugin.getConfig().getString("DefaultTranslation"));
			line3 = plugin.getLanguage().getString("help.pages.read.permission");
			line4 = pageNextspec.replaceAll("{command}", "/bible");
		}else if(page.equalsIgnoreCase("read3")){
			heading = heading.replaceAll("{title}", plugin.getLanguage().getString("help.titles.read"));
			heading = heading.replaceAll("{minorPage}", String.valueOf(3));
			heading = heading.replaceAll("{maxMinorPages}", String.valueOf(3));
			line1 = plugin.getLanguage().getString("help.pages.read.replace1");
			line2 = plugin.getLanguage().getString("help.pages.read.replace2");
			line3 = plugin.getLanguage().getString("help.pages.read.replace3");
			line4 = plugin.getLanguage().getString("help.pages.read.replace4");
		}else if(page.equalsIgnoreCase("send1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages +
					" /bible send (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Sends a Bible verse to someone.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible send <player> <book> <chapter> <verse> " +
					"[translation] [\"anonymous\"] or /bible send <player> <book> <chapter:verse> " +
					"[translation] [\"anonymous\"]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: sendverse, versesend, giveverse, versegive, " +
					"sendv, vsend, givev, and vgive.");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.verse.send");
			sender.sendMessage(ChatColor.GREEN + "Typing anonymous makes it so that you are anonymous in " +
					"sending the verse. This requires the TadukooBible.anonymous.verse permission.");
			return;
		}else if(page.equalsIgnoreCase("previous1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages +
					" /bible previous (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Shows you the verse before the one you read " +
					"last.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible previous [translation]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: pre, prev, back, before, and b4.");
			sender.sendMessage(ChatColor.GREEN + "This will give a warning if you try to go before Genesis " +
					"1:1");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.verse.previous");
			return;
		}else if(page.equalsIgnoreCase("next1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages +
					" /bible next (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Shows you the verse after the one you read " +
					"last.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible next [translation]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: pre, prev, back, before, and b4.");
			sender.sendMessage(ChatColor.GREEN + "This will give a warning if you try to go after 3 John " +
					"1:14");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.verse.next");
			return;
		}else if(page.equalsIgnoreCase("last1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages +
					" /bible last (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Shows you the verse you read last.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible last [translation]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: saved, save, load, lastverse, verselast, lastv, " +
					"vlast, versesaved, savedverse, vsaved, savedv, vsave, versesave, loadverse, verseload, " +
					"vload, and loadv.");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.verse.last");
			return;
		}else if(page.equalsIgnoreCase("random1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages +
					" /bible random (1/2)");
			sender.sendMessage(ChatColor.GREEN + "Description: Shows you a random verse of the Bible.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible random [book] [chapter] [translation]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: rand, randomverse, randomv, verserandom, " +
					"vrandom, randverse, randv, verserand, and vrand.");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help " + helpPageU + " for more information " +
					"and the permission.");
			return;
		}else if(page.equalsIgnoreCase("random2")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages +
					" /bible random Cont. (2/2)");
			sender.sendMessage(ChatColor.GREEN + "If no book or chapter are specified, they are random as " +
					"well.");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.verse.random");
			return;
		}else if(page.equalsIgnoreCase("getbook1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages +
					" /bible getbook (1/3)");
			sender.sendMessage(ChatColor.GREEN + "Description: Gives you part of the Bible in book form.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible getbook [book] [part #] [translation] [?]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: book, bookget, bibleget, and getbible.");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help " + helpPageU + " for defaults, " +
					"permission, and a note.");
			return;
		}else if(page.equalsIgnoreCase("getbook2")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages +
					" /bible getbook Cont. (2/3)");
			sender.sendMessage(ChatColor.GREEN + "Defaults: /bible getbook Genesis 1 " + 
					plugin.getConfig().getString("DefaultTranslation"));
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.book.get");
			sender.sendMessage(ChatColor.GREEN + "Note: [part #] is not [chapter #]");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help " + helpPageU + " for more options for " +
					"this command.");
			return;
		}else if(page.equalsIgnoreCase("getbook3")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages +
					" /bible getbook Cont. (3/3)");
			sender.sendMessage(ChatColor.GREEN + "? is used to show what's in that part.");
			sender.sendMessage(ChatColor.GREEN + "[book] can be replaced with previous or its aliases to " +
					"get the previous book.");
			sender.sendMessage(ChatColor.GREEN + "[book] can be replaced with next or its aliases to get " +
					"the next book.");
			sender.sendMessage(ChatColor.GREEN + "[book] can be replaced with last or its aliases to get " +
					"the book you got the last time you typed the command.");
			sender.sendMessage(ChatColor.GREEN + "[book] can be replaced with list to get a book containing " +
					"a list of all the books for the translation.");
			sender.sendMessage(ChatColor.GREEN + "[book] can be replaced with random to get a random book.");
			return;
		}else if(page.equalsIgnoreCase("sendbook1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages +
					" /bible sendbook (1/2)");
			sender.sendMessage(ChatColor.GREEN + "Description: Sends part of the Bible in book form to a " +
					"player.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible sendbook <player> <book> <part> " +
					"[translation] [\"anonymous\"]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: booksend, sendbible, biblesend, givebook, " +
					"bookgive, biblegive, and givebible");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help " + helpPageU + " for defaults, " +
					"permission, and a note.");
			return;
		}else if(page.equalsIgnoreCase("sendbook2")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages +
					" /bible sendbook Cont. (2/2)");
			sender.sendMessage(ChatColor.GREEN + "Defaults: /bible sendbook <player> <book> <part> " + 
					plugin.getConfig().getString("DefaultTranslation"));
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.book.send");
			sender.sendMessage(ChatColor.GREEN + "Note: [part #] is not [chapter #]");
			sender.sendMessage(ChatColor.GREEN + "Typing anonymous at the end makes it so that you are " +
					"anonymous in sending the book. This requires the TadukooBible.anonymous.book " +
					"permission.");
			return;
		}else if(page.equalsIgnoreCase("info1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages +
					" /bible info (1/2)");
			sender.sendMessage(ChatColor.GREEN + "Description: Tells you information about the plugin, " +
					"a translation, a book of the Bible, a permission, or lists books, translations, or " +
					"permissions.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible info [translation|book|permission|" +
					"\"plugin\"|\"books\"|\"translations\"|\"permissions\"] [page]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: about, abt, and information.");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help " + helpPageU + " for more information " +
					"about the permissions and usage.");
			return;
		}else if(page.equalsIgnoreCase("info2")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages + 
					" /bible info (2/2)");
			sender.sendMessage(ChatColor.GREEN + "Using no parameters defaults to showing plugin info.");
			sender.sendMessage(ChatColor.GREEN + "To view plugin info, you need the " +
					"TadukooBible.info.plugin permission.");
			sender.sendMessage(ChatColor.GREEN + "To view info about a book, you need the " +
					"TadukooBible.info.book permission.");
			sender.sendMessage(ChatColor.GREEN + "To view info about a translation, you need the " +
					"TadukooBible.info.translation permission.");
			sender.sendMessage(ChatColor.GREEN + "To view info about a permission, you need the " +
					"TadukooBible.info.permission permission.");
			return;
		}else if(page.equalsIgnoreCase("plugin1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages +
					" /bible plugin (1/#)");
			sender.sendMessage(ChatColor.GREEN + "Description: Shows info about the plugin.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible plugin");
			sender.sendMessage(ChatColor.GREEN + "Aliases: TB, TadukooBible, TadukooBibleinfo, and " +
					"plugininfo.");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.info.plugin");
			return;
		}else if(page.equalsIgnoreCase("books1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages +
					" /bible books (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Lists all the books in the Bible or shows " +
					"info about a book.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible books [page|book]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: bookslist, listbooks, booklist, booksinfo, " +
					"bookinfo, infobooks, and infobook.");
			sender.sendMessage(ChatColor.GREEN + "Books in red are unavailable, while books in green are " +
					"available.");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.info.book");
			return;
		}else if(page.equalsIgnoreCase("translation1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages +
					" /bible translation (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Lists available translations or shows info " +
					"about a translation.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible translation [translation]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: translations, translist, translationslist, " +
					"listtrans, tran, trans, translationinfo, translationsinfo, transinfo, and traninfo.");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.info.translation");
			return;
		}else if(page.equalsIgnoreCase("config1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages +
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
		}else if(page.equalsIgnoreCase("announce1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page " + helpPage + "/" + maxPages +
					" /bible announce (1/1)");
			sender.sendMessage(ChatColor.GREEN + "Description: Announces a Bible verse to the server.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible announce <book> <chapter> <verse> " +
					"[translation] or /bible announce <book> <chapter:verse> [translation]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: ann, broadcast, broad, shout, and yell.");
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.op.announce");
			sender.sendMessage(ChatColor.GREEN + "You need TadukooBible.verse.announceget to see " +
					"announcements.");
			return;
		}
		sender.sendMessage(ChatColor.GREEN + heading);
		sender.sendMessage(ChatColor.GREEN + line1);
		if(line2 != ""){
			sender.sendMessage(ChatColor.GREEN + line2);
			if(line3 != ""){
				sender.sendMessage(ChatColor.GREEN + line3);
				if(line4 != ""){
					sender.sendMessage(ChatColor.GREEN + line4);
				}
			}
		}
	}
}
