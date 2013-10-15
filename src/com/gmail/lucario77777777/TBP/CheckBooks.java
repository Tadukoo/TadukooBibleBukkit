package com.gmail.lucario77777777.TBP;

import java.util.logging.Level;

public class CheckBooks {
	public static void check(Main plugin, String tran) {
		plugin.getLogger().log(Level.INFO, "Checking " + tran + "books.");
		checkBook(plugin, tran, "Genesis");
		checkBook(plugin, tran, "Exodus");
		checkBook(plugin, tran, "Leviticus");
		checkBook(plugin, tran, "Numbers");
		checkBook(plugin, tran, "Deuteronomy");
		checkBook(plugin, tran, "Joshua");
		checkBook(plugin, tran, "Judges");
		checkBook(plugin, tran, "Ruth");
		checkBook(plugin, tran, "1Samuel");
		checkBook(plugin, tran, "2Samuel");
		checkBook(plugin, tran, "1Kings");
		checkBook(plugin, tran, "2Kings");
		checkBook(plugin, tran, "1Chronicles");
		checkBook(plugin, tran, "2Chronicles");
		checkBook(plugin, tran, "Ezra");
		checkBook(plugin, tran, "Nehemiah");
		checkBook(plugin, tran, "Esther");
		checkBook(plugin, tran, "Job");
		checkBook(plugin, tran, "Psalms");
		checkBook(plugin, tran, "Proverbs");
		checkBook(plugin, tran, "Ecclesiastes");
		checkBook(plugin, tran, "SongofSongs");
		checkBook(plugin, tran, "Isaiah");
		checkBook(plugin, tran, "Jeremiah");
		checkBook(plugin, tran, "Lamentations");
		checkBook(plugin, tran, "Ezekiel");
		checkBook(plugin, tran, "Daniel");
		checkBook(plugin, tran, "Hosea");
		checkBook(plugin, tran, "Joel");
		checkBook(plugin, tran, "Amos");
		checkBook(plugin, tran, "Obadiah");
		checkBook(plugin, tran, "Jonah");
		checkBook(plugin, tran, "Micah");
		checkBook(plugin, tran, "Nahum");
		checkBook(plugin, tran, "Habbakuk");
		checkBook(plugin, tran, "Zephaniah");
		checkBook(plugin, tran, "Haggai");
		checkBook(plugin, tran, "Zechariah");
		checkBook(plugin, tran, "Malachi");
		checkBook(plugin, tran, "Matthew");
		checkBook(plugin, tran, "Mark");
		checkBook(plugin, tran, "Luke");
		checkBook(plugin, tran, "John");
		checkBook(plugin, tran, "Acts");
		checkBook(plugin, tran, "Romans");
		checkBook(plugin, tran, "1Corinthians");
		checkBook(plugin, tran, "2Corinthians");
		checkBook(plugin, tran, "Galatians");
		checkBook(plugin, tran, "Ephesians");
		checkBook(plugin, tran, "Philippians");
		checkBook(plugin, tran, "Colossians");
		checkBook(plugin, tran, "1Thessalonians");
		checkBook(plugin, tran, "2Thessalonians");
		checkBook(plugin, tran, "1Timothy");
		checkBook(plugin, tran, "2Timothy");
		checkBook(plugin, tran, "Titus");
		checkBook(plugin, tran, "Philemon");
		checkBook(plugin, tran, "Hebrews");
		checkBook(plugin, tran, "James");
		checkBook(plugin, tran, "1Peter");
		checkBook(plugin, tran, "2Peter");
		checkBook(plugin, tran, "1John");
		checkBook(plugin, tran, "2John");
		checkBook(plugin, tran, "3John");
		checkBook(plugin, tran, "Jude");
		checkBook(plugin, tran, "Revelation");
	}
	
	public static void checkBook(Main plugin, String tran, String bookName){
		plugin.getLogger().log(Level.INFO, "Checking for " + bookName + "...");
		if(plugin.getBook(tran, bookName).getString("ch1v1") != null){
			plugin.getLogger().log(Level.INFO, bookName + ".yml found. Checking for book config...");
			if(plugin.getigBook(tran).getString(bookName + "Book" + 1 + "." + 1) == null){
				plugin.getLogger().log(Level.INFO, bookName + " Book config not found. Creating config...");
				BookDefine.run(plugin, tran, bookName);
			}else{
				plugin.getLogger().log(Level.INFO, bookName + " config found.");
				return;
			}
		}else{
			plugin.getLogger().log(Level.INFO, bookName + ".yml not found.");
			return;
		}
	}
}
