package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumChps;
import com.gmail.lucario77777777.TBP.Enums.EnumPerms;
import com.gmail.lucario77777777.TBP.Enums.EnumTrans;

public class Information {
	public static void pluginInfo(TB plugin, CommandSender sender){
		sender.sendMessage(ChatColor.GREEN + "Plugin Name: " + plugin.getDescription().getName());
		sender.sendMessage(ChatColor.GREEN + "Author: " + plugin.getDescription().getAuthors());
		sender.sendMessage(ChatColor.GREEN + "Version: " + plugin.getDescription().getVersion());
	}
	
	public static void bookInfo(CommandSender sender, TB plugin, EnumBooks book) {
		String bookName = book.getBook();
		String desc = plugin.getLanguage().getString("books." + bookName);
		String aliases = "";
		if(book.getAlias() == null){
			aliases = plugin.getLanguage().getString("aliases.none");
		}else{
			if(book.getAlias2() == null){
				aliases = plugin.getLanguage().getString("aliases.one");
				aliases = aliases.replaceAll("{alias1}", book.getAlias());
			}else{
				aliases = plugin.getLanguage().getString("aliases.two");
				aliases = aliases.replaceAll("{alias1}", book.getAlias());
				aliases = aliases.replaceAll("{alias2}", book.getAlias2());
			}
		}
		sender.sendMessage(ChatColor.GREEN + desc);
		sender.sendMessage(ChatColor.GREEN + aliases);
	}
	
	public static void chpInfo(CommandSender sender, TB plugin, EnumChps echp, String chp){
		String msg = plugin.getLanguage().getString("command.info.chpinfo");
		String bookName = echp.getBook();
		msg = msg.replaceAll("{book}", bookName);
		msg = msg.replaceAll("{chp}", chp);
		int v = echp.getNum(Integer.parseInt(chp));
		String vNum = String.valueOf(v);
		msg = msg.replaceAll("{vNum}", vNum);
		sender.sendMessage(ChatColor.GREEN + msg);
	}
	
	public static void booksList(CommandSender sender, String page){
		if(page.equalsIgnoreCase("2")){
			sender.sendMessage(ChatColor.GREEN + "Page 2 of 5");
			sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
			sender.sendMessage(ChatColor.RED + "1 Chronicles, 2 Chronicles, Ezra, Nehemiah, Esther, Job,");
			sender.sendMessage(ChatColor.GREEN + "Psalms, Proverbs, Ecclesiastes, Song of Songs," + 
			ChatColor.RED + " Isaiah");
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
			sender.sendMessage(ChatColor.GREEN + "1 Corinthians, 2 Corinthians, Galatians, Ephesians, " +
					"Philippians");
			sender.sendMessage(ChatColor.GREEN + "Type /bible books 5 for the next page.");
		}else if(page.equalsIgnoreCase("5")){
			sender.sendMessage(ChatColor.GREEN + "Page 5 of 5");
			sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
			sender.sendMessage(ChatColor.GREEN + "Colossians, 1 Thessalonians, 2 Thessalonians, 1 Timothy,");
			sender.sendMessage(ChatColor.GREEN + "2 Timothy, Titus, Philemon, Hebrews, James, 1 Peter, " +
					"2 Peter,");
			sender.sendMessage(ChatColor.GREEN + "1 John, 2 John, 3 John, Jude, and Revelation.");
		}else{
			sender.sendMessage(ChatColor.GREEN + "Page 1 of 5");
			sender.sendMessage(ChatColor.GREEN + "The Books of the Bible are:");
			sender.sendMessage(ChatColor.GREEN + "Genesis, Exodus, Leviticus, Numbers, Deuteronomy, " +
					ChatColor.RED + "Joshua,");
			sender.sendMessage(ChatColor.RED + "Judges, Ruth, 1 Samuel, 2 Samuel, 1 Kings, 2 Kings");
			sender.sendMessage(ChatColor.GREEN + "Type /bible books 2 for the next page.");
		}
	}
	
	public static void tranList(CommandSender sender, TB plugin) {
		String a = "The available translations are:";
		String b = "";
		if(plugin.getConfig().getBoolean("KJV") == true){
			b = b + "KJV";
		}
		sender.sendMessage(ChatColor.GREEN + a);
		sender.sendMessage(ChatColor.GREEN + b);
	}
	
	public static void tranInfo(CommandSender sender, TB plugin, EnumTrans etran){
		String tran = etran.getTran();
		String desc = plugin.getLanguage().getString("translations." + tran);
		String aliases = plugin.getLanguage().getString("aliases.none");
		if(etran.getAlias() != null){
			if(etran.getAlias2() != null){
				if(etran.getAlias3() != null){
					aliases = plugin.getLanguage().getString("aliases.three");
					aliases = aliases.replace("{alias3}", etran.getAlias3());
				}else{
					aliases = plugin.getLanguage().getString("aliases.two");
				}
				aliases = aliases.replace("{alias2}", etran.getAlias2());
			}else{
				aliases = plugin.getLanguage().getString("aliases.one");
			}
			aliases = aliases.replace("{alias1}", etran.getAlias());
		}
		sender.sendMessage(ChatColor.GREEN + desc);
		sender.sendMessage(ChatColor.GREEN + aliases);
	}
	
	public static void settings(CommandSender sender) {
		sender.sendMessage(ChatColor.GREEN + "DefaultTranslation, DefaultBook, DefaultChapter, " +
				"DefaultVerse, Permissions, PlayerRecords, Books, and KJV.");
	}
	
	public static void permInfo(CommandSender sender, EnumPerms perms){
		sender.sendMessage(ChatColor.GREEN + perms.getDesc());
		sender.sendMessage(ChatColor.GREEN + "Its children are: " + perms.getChildren());
	}
	
	public static void perms(CommandSender sender){
		sender.sendMessage(ChatColor.GREEN + "All permissions start with TadukooBible. followed by what's " +
				"below.");
		sender.sendMessage(ChatColor.GREEN + "*, use, verse.*, book.*, info.*, op.*, anonymous.*, " +
				"verse.read, verse.send, verse.receive, verse.previous, verse.next, verse.last, " +
				"verse.random, verse.announceget, book.get, book.send, book.receive, info.help, " +
				"info.plugin, info.book, info.translation, info.permission, op.config, op.announce, " +
				"anonymous.verse, and anonymous.book");
	}
}
