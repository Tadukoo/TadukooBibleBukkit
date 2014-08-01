package com.gmail.lucario77777777.TBP.Lists;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class BooksList {
	public static void booksList(CommandSender sender, String[] args){
		String i = "1";
		if(args.length >= 2){
			i = args[1];
		}
		if(i.equalsIgnoreCase("1")){
			sender.sendMessage(ChatColor.GREEN + "Page 1 of 5");
			sender.sendMessage(ChatColor.GREEN + "The Books of the Bible are:");
			sender.sendMessage(ChatColor.GREEN + "Genesis, Exodus, Leviticus, Numbers, Deuteronomy, " +
					ChatColor.RED + "Joshua,");
			sender.sendMessage(ChatColor.RED+ "Judges, Ruth, 1 Samuel, 2 Samuel, 1 Kings, 2 Kings");
			sender.sendMessage(ChatColor.GREEN + "Type /bible books 2 for the next page.");
		}else if(i.equalsIgnoreCase("2")){
			sender.sendMessage(ChatColor.GREEN + "Page 2 of 5");
			sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
			sender.sendMessage(ChatColor.RED + "1 Chronicles, 2 Chronicles, Ezra, Nehemiah, Esther, Job,");
			sender.sendMessage(ChatColor.GREEN + "Psalms," + ChatColor.RED + " Proverbs, Ecclesiastes, Song " +
					"of Songs, Isaiah");
			sender.sendMessage(ChatColor.GREEN + "Type /bible books 3 for the next page.");
		}else if(i.equalsIgnoreCase("3")){
			sender.sendMessage(ChatColor.GREEN + "Page 3 of 5");
			sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
			sender.sendMessage(ChatColor.RED + "Jeremiah, Lamentations, Ezekiel, Daniel, Hosea, Joel, Amos,");
			sender.sendMessage(ChatColor.RED + "Obadiah, Jonah, Micah, Nahum, Habakkuk, Zephaniah, Haggai");
			sender.sendMessage(ChatColor.GREEN + "Type /bible books 4 for the next page.");
		}else if(i.equalsIgnoreCase("4")){
			sender.sendMessage(ChatColor.GREEN + "Page 4 of 5");
			sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
			sender.sendMessage(ChatColor.RED + "Zechariah, Malachi, " + ChatColor.GREEN + "Matthew, Mark, " +
					"Luke, John, " + ChatColor.RED + "Acts, Romans,");
			sender.sendMessage(ChatColor.RED + "1 Corinthians, 2 Corinthians, Galatians, Ephesians, " +
					"Philippians");
			sender.sendMessage(ChatColor.GREEN + "Type /bible books 5 for the next page.");
		}else if(i.equalsIgnoreCase("5")){
			sender.sendMessage(ChatColor.GREEN + "Page 5 of 5");
			sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
			sender.sendMessage(ChatColor.RED + "Colossians, 1 Thessalonians, 2 Thessalonians, 1 Timothy,");
			sender.sendMessage(ChatColor.RED + "2 Timothy, Titus, Philemon, Hebrews, James, 1 Peter, 2 Peter,");
			sender.sendMessage(ChatColor.GREEN + "1 John, 2 John, 3 John, " + ChatColor.RED + "Jude, and " +
					"Revelation.");
		}else{
			sender.sendMessage(ChatColor.RED + "Try typing /bible books.");
		}
	}
}
