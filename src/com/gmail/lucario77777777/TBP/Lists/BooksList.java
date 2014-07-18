package com.gmail.lucario77777777.TBP.Lists;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class BooksList {
	public static void booksList(String i, CommandSender sender){
		if(i.equalsIgnoreCase("1")){
			sender.sendMessage(ChatColor.GREEN + "Page 1 of 5");
			sender.sendMessage(ChatColor.GREEN + "The Books of the Bible are:");
			sender.sendMessage(ChatColor.GREEN + "Genesis, Exodus, Leviticus, Numbers, Deuteronomy, " +
					ChatColor.RED + "Joshua, Judges, Ruth, 1 Samuel, 2 Samuel, 1 Kings, " +
					"2 Kings, 1 Chronicles, 2 Chronicles");
			sender.sendMessage(ChatColor.GREEN + "Type /bible books 2 for the next page.");
		}else if(i.equalsIgnoreCase("2")){
			sender.sendMessage(ChatColor.GREEN + "Page 2 of 5");
			sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
			sender.sendMessage(ChatColor.RED + "Ezra, Nehemiah, Esther, Job, Psalms, Proverbs," +
					" Ecclesiastes, Song of Songs, Isaiah, Jeremiah, Lamentations, Ezekiel, Daniel");
			sender.sendMessage(ChatColor.GREEN + "Type /bible books 3 for the next page.");
		}else if(i.equalsIgnoreCase("3")){
			sender.sendMessage(ChatColor.GREEN + "Page 3 of 5");
			sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
			sender.sendMessage(ChatColor.RED + "Hosea, Joel, Amos, Obadiah, Jonah, Micah," +
					" Nahum, Habakkuk, Zephaniah, Haggai, Zechariah, Malachi, " + ChatColor.GREEN + "Matthew, " 
							+ "Mark, Luke, " + ChatColor.RED + "John");
			sender.sendMessage(ChatColor.GREEN + "Type /bible books 4 for the next page.");
		}else if(i.equalsIgnoreCase("4")){
			sender.sendMessage(ChatColor.GREEN + "Page 4 of 5");
			sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
			sender.sendMessage(ChatColor.RED + "Acts, Romans, 1 Corinthians, 2 Corinthians, Galatians," +
					" Ephesians, Philippians, Colossians, 1 Thessalonians, 2 Thessalonians, 1 Timothy");
			sender.sendMessage(ChatColor.GREEN + "Type /bible books 5 for the next page.");
		}else if(i.equalsIgnoreCase("5")){
			sender.sendMessage(ChatColor.GREEN + "Page 5 of 5");
			sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
			sender.sendMessage(ChatColor.RED + "2 Timothy, Titus, Philemon, Hebrews, James, 1 Peter," +
					" 2 Peter, " + ChatColor.GREEN + "1 John, 2 John, 3 John, " + ChatColor.RED + "Jude, " +
							"and Revelation.");
		}else{
			sender.sendMessage(ChatColor.RED + "Try typing /bible books.");
		}
	}
}
