package com.gmail.lucario77777777.TBP.Info;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class Books {
	public static void list(CommandSender sender, String page){
		if(page.equalsIgnoreCase("2")){
			sender.sendMessage(ChatColor.GREEN + "Page 2 of 5");
			sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
			sender.sendMessage(ChatColor.RED + "1 Chronicles, 2 Chronicles, Ezra, Nehemiah, Esther, Job,");
			sender.sendMessage(ChatColor.GREEN + "Psalms, Proverbs," + ChatColor.RED + " Ecclesiastes, Song " +
					"of Songs, Isaiah");
			sender.sendMessage(ChatColor.GREEN + "Type /bible books 3 for the next page.");
		}else if(page.equalsIgnoreCase("3")){
			sender.sendMessage(ChatColor.GREEN + "Page 3 of 5");
			sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
			sender.sendMessage(ChatColor.RED + "Jeremiah, Lamentations, Ezekiel, Daniel, Hosea, Joel, Amos,");
			sender.sendMessage(ChatColor.RED + "Obadiah, Jonah, Micah, Nahum, Habakkuk, Zephaniah, Haggai");
			sender.sendMessage(ChatColor.GREEN + "Type /bible books 4 for the next page.");
		}else if(page.equalsIgnoreCase("4")){
			sender.sendMessage(ChatColor.GREEN + "Page 4 of 5");
			sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
			sender.sendMessage(ChatColor.RED + "Zechariah, Malachi, " + ChatColor.GREEN + "Matthew, Mark, " +
					"Luke, John, Acts, Romans,");
			sender.sendMessage(ChatColor.GREEN + "1 Corinthians, 2 Corinthians," + ChatColor.RED + 
					" Galatians, Ephesians, Philippians");
			sender.sendMessage(ChatColor.GREEN + "Type /bible books 5 for the next page.");
		}else if(page.equalsIgnoreCase("5")){
			sender.sendMessage(ChatColor.GREEN + "Page 5 of 5");
			sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
			sender.sendMessage(ChatColor.RED + "Colossians, 1 Thessalonians, 2 Thessalonians, 1 Timothy,");
			sender.sendMessage(ChatColor.RED + "2 Timothy, Titus, Philemon, Hebrews, James, 1 Peter, 2 Peter,");
			sender.sendMessage(ChatColor.GREEN + "1 John, 2 John, 3 John, " + ChatColor.RED + "Jude, and " +
					"Revelation.");
		}else{
			sender.sendMessage(ChatColor.GREEN + "Page 1 of 5");
			sender.sendMessage(ChatColor.GREEN + "The Books of the Bible are:");
			sender.sendMessage(ChatColor.GREEN + "Genesis, Exodus, Leviticus, Numbers, Deuteronomy, " +
					ChatColor.RED + "Joshua,");
			sender.sendMessage(ChatColor.RED+ "Judges, Ruth, 1 Samuel, 2 Samuel, 1 Kings, 2 Kings");
			sender.sendMessage(ChatColor.GREEN + "Type /bible books 2 for the next page.");
		}
	}
}
