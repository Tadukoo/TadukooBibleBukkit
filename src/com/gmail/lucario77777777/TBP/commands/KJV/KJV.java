package com.gmail.lucario77777777.TBP.commands.KJV;

import com.gmail.lucario77777777.TBP.commands.MainCommandExecutor;
import com.gmail.lucario77777777.TBP.commands.KJV.Books.KJVBook;
import com.gmail.lucario77777777.TBP.commands.KJV.Genesis.KJVGenesis;
//import com.gmail.lucario77777777.TBP.commands.KJV.Books.KJVBook;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJV extends MainCommandExecutor {
	public KJV(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args, String playerType)
	{
		if(args.length == 1){
			KJVGenesis.Run(sender, args);
			return true;
		}else if(args.length >=2){
			if(args[1].equalsIgnoreCase("Genesis") || args[1].equalsIgnoreCase("Gen")){
				KJVGenesis.Run(sender, args);
				return true;
			}else if(args[1].equals("?") || args[1].equalsIgnoreCase("info")){
				sender.sendMessage(ChatColor.GREEN + "KJV is the King James Version.");
				return true;
			}else if(args[1].equalsIgnoreCase("book")){
				KJVBook.Run(sender, args, playerType);
				return true;
			}else if(args[1].equalsIgnoreCase("books")){
				sender.sendMessage(ChatColor.GREEN + "Page 1 of 5");
				sender.sendMessage(ChatColor.GREEN + "The Books of the Bible are:");
				sender.sendMessage(ChatColor.YELLOW + "Genesis, " + ChatColor.RED + "Exodus, Leviticus, " +
						"Numbers, Deuteronomy, Joshua, Judges, Ruth, 1 Samuel, 2 Samuel, 1 Kings, 2 Kings, " +
						"1 Chronicles, 2 Chronicles");
				sender.sendMessage(ChatColor.GREEN + "Type /bible kjv books2 for the next page.");
				return true;
			}else if(args[1].equalsIgnoreCase("books2")){
				sender.sendMessage(ChatColor.GREEN + "Page 2 of 5");
				sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
				sender.sendMessage(ChatColor.RED + "Ezra, Nehemiah, Esther, Job, Psalms, Proverbs," +
						" Ecclesiastes, Song of Songs, Isaiah, Jeremiah, Lamentations, Ezekiel, Daniel");
				sender.sendMessage(ChatColor.GREEN + "Type /bible kjv books3 for the next page.");
				return true;
			}else if(args[1].equalsIgnoreCase("books3")){
				sender.sendMessage(ChatColor.GREEN + "Page 3 of 5");
				sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
				sender.sendMessage(ChatColor.RED + "Hosea, Joel, Amos, Obadiah, Jonah, Micah," +
						" Nahum, Habakkuk, Zephaniah, Haggai, Zechariah, Malachi, Matthew, Mark, Luke, John");
				sender.sendMessage(ChatColor.GREEN + "Type /bible kjv books4 for the next page.");
				return true;
			}else if(args[1].equalsIgnoreCase("books4")){
				sender.sendMessage(ChatColor.GREEN + "Page 4 of 5");
				sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
				sender.sendMessage(ChatColor.RED + "Acts, Romans, 1 Corinthians, 2 Corinthians, Galatians," +
						" Ephesian, Philippians, Colossians, 1 Thessalonians, 2 Thessalonians, 1 Timothy");
				sender.sendMessage(ChatColor.GREEN + "Type /bible kjv books5 for the next page.");
				return true;
			}else if(args[1].equalsIgnoreCase("books5")){
				sender.sendMessage(ChatColor.GREEN + "Page 5 of 5");
				sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
				sender.sendMessage(ChatColor.RED + "2 Timothy, Titus, Philemon, Hebrews, James, 1 Peter," +
						" 2 Peter, 1 John, 2 John, 3 John, Jude, and Revelation.");
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have " + args[1] + " in the King James Version yet, or it isn't a book of the Bible.");
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}