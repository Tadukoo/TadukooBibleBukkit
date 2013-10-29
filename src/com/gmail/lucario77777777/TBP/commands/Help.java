package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class Help {
	public static void Run(String i, CommandSender sender, Main plugin){
		if(i.equalsIgnoreCase("1")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Table of Contents.");
			sender.sendMessage(ChatColor.GREEN + "Page 3. /bible");
			sender.sendMessage(ChatColor.GREEN + "Page 5. /bible info");
			sender.sendMessage(ChatColor.GREEN + "Page 6. /bible books");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help 2 for the next page.");
			return;
		}else if(i.equalsIgnoreCase("2")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Table of Contents Page 2.");
			sender.sendMessage(ChatColor.GREEN + "Page 7. /bible translations");
			sender.sendMessage(ChatColor.GREEN + "Page 8. /bible getbook");
			sender.sendMessage(ChatColor.GREEN + "Page 10. /bible givebook");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help 3 for the next page.");
			return;
		}else if(i.equalsIgnoreCase("3")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 3 /bible");
			sender.sendMessage(ChatColor.GREEN + "Description: Shows you a Bible verse.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible [book] [chapter #] [verse #] [translation]");
			sender.sendMessage(ChatColor.GREEN + "Defaults: /bible Genesis 1 1 " + 
					plugin.getConfig().getString("DefaultTranslation"));
			sender.sendMessage(ChatColor.GREEN + "Type /bible help 4 for info about replacements in /bible.");
			return;
		}else if(i.equalsIgnoreCase("4")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 4 /bible Cont.");
			sender.sendMessage(ChatColor.GREEN + "[chapter #] can be replaced with:");
			sender.sendMessage(ChatColor.GREEN + "# to list how many chapters are in that book.");
			sender.sendMessage(ChatColor.GREEN + "info or ? to tell information about that book.");
			sender.sendMessage(ChatColor.GREEN + "[verse #] can be replaced with #, info, or ? to list how " +
					"many verses are in that chapter.");
			return;
		}else if(i.equalsIgnoreCase("5")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 5 /bible info");
			sender.sendMessage(ChatColor.GREEN + "Description: Tells you information about a specific " +
					"translation.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible info <translation>");
			sender.sendMessage(ChatColor.GREEN + "Aliases: about, abt, and information.");
			return;
		}else if(i.equalsIgnoreCase("6")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 6 /bible books");
			sender.sendMessage(ChatColor.GREEN + "Description: Lists all the books in the Bible.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible books [page]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: bookslist, listbooks, and booklist.");
			sender.sendMessage(ChatColor.GREEN + "Red = unavailable, Yellow = Partially Available, " +
					"Green = Completely available.");
			return;
		}else if(i.equalsIgnoreCase("7")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 7 /bible translations");
			sender.sendMessage(ChatColor.GREEN + "Description: Lists available translations.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible translations");
			sender.sendMessage(ChatColor.GREEN + "Aliases: translist, translationslist, listtrans, " +
					"tran, and trans.");
			return;
		}else if(i.equalsIgnoreCase("8")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 8 /bible getbook");
			sender.sendMessage(ChatColor.GREEN + "Description: Gives you a book of part of the Bible.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible getbook [book] [part #] [translation]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: book, bookget, bible, bibleget, and getbible.");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help 9 for defaults, permission, and a note.");
			return;
		}else if(i.equalsIgnoreCase("9")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 9 /bible getbook Cont.");
			sender.sendMessage(ChatColor.GREEN + "Defaults: /bible getbook Genesis 1 " + 
					plugin.getConfig().getString("DefaultTranslation"));
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.getbook");
			sender.sendMessage(ChatColor.GREEN + "Note: [part #] is not [chapter #]");
			return;
		}else if(i.equalsIgnoreCase("10")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 10 /bible givebook");
			sender.sendMessage(ChatColor.GREEN + "Description: Gives someone else a book of part of the Bible.");
			sender.sendMessage(ChatColor.GREEN + "Usage: /bible givebook <player> [book] [part #] [translation]");
			sender.sendMessage(ChatColor.GREEN + "Aliases: bookgive, biblegive, and givebible.");
			sender.sendMessage(ChatColor.GREEN + "Type /bible help 11 for defaults, permission, and a note.");
			return;
		}else if(i.equalsIgnoreCase("11")){
			sender.sendMessage(ChatColor.GREEN + "TadukooBible Help Page 11 /bible givebook Cont.");
			sender.sendMessage(ChatColor.GREEN + "Defaults: /bible givebook <player> Genesis 1 " + 
					plugin.getConfig().getString("DefaultTranslation"));
			sender.sendMessage(ChatColor.GREEN + "Permission: TadukooBible.givebook");
			sender.sendMessage(ChatColor.GREEN + "Note: [part #] is not [chapter #]");
			return;
		}
	}
}
