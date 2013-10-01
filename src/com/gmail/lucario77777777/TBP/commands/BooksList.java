package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class BooksList {
	public static void list1(CommandSender sender){
		sender.sendMessage(ChatColor.GREEN + "Page 1 of 5");
		sender.sendMessage(ChatColor.GREEN + "The Books of the Bible are:");
		sender.sendMessage(ChatColor.GREEN + "Genesis, Exodus, Leviticus, " + ChatColor.YELLOW + "Numbers, " +
				ChatColor.RED + "Deuteronomy, Joshua, Judges, Ruth, 1 Samuel, 2 Samuel, 1 Kings, " +
				"2 Kings, 1 Chronicles, 2 Chronicles");
		sender.sendMessage(ChatColor.GREEN + "Type /bible kjv books2 for the next page.");
	}
	
	public static void list2(CommandSender sender){
		sender.sendMessage(ChatColor.GREEN + "Page 2 of 5");
		sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
		sender.sendMessage(ChatColor.RED + "Ezra, Nehemiah, Esther, Job, Psalms, Proverbs," +
				" Ecclesiastes, Song of Songs, Isaiah, Jeremiah, Lamentations, Ezekiel, Daniel");
		sender.sendMessage(ChatColor.GREEN + "Type /bible kjv books3 for the next page.");
	}
	
	public static void list3(CommandSender sender){
		sender.sendMessage(ChatColor.GREEN + "Page 3 of 5");
		sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
		sender.sendMessage(ChatColor.RED + "Hosea, Joel, Amos, Obadiah, Jonah, Micah," +
				" Nahum, Habakkuk, Zephaniah, Haggai, Zechariah, Malachi, Matthew, Mark, Luke, John");
		sender.sendMessage(ChatColor.GREEN + "Type /bible kjv books4 for the next page.");
	}
	
	public static void list4(CommandSender sender){
		sender.sendMessage(ChatColor.GREEN + "Page 4 of 5");
		sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
		sender.sendMessage(ChatColor.RED + "Acts, Romans, 1 Corinthians, 2 Corinthians, Galatians," +
				" Ephesians, Philippians, Colossians, 1 Thessalonians, 2 Thessalonians, 1 Timothy");
		sender.sendMessage(ChatColor.GREEN + "Type /bible kjv books5 for the next page.");
	}
	
	public static void list5(CommandSender sender){
		sender.sendMessage(ChatColor.GREEN + "Page 5 of 5");
		sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
		sender.sendMessage(ChatColor.RED + "2 Timothy, Titus, Philemon, Hebrews, James, 1 Peter," +
				" 2 Peter, " + ChatColor.GREEN + "1 John, 2 John, 3 John, " + ChatColor.RED + "Jude, " +
						"and Revelation.");
	}
}
