package com.gmail.lucario77777777.TBP.Enums;

import com.gmail.lucario77777777.TBP.TB;

public enum EnumBooks {
	GENESIS("Genesis", "Gen", "Ge", "Moses", 50, true),
	EXODUS("Exodus", "Exo", "Ex", "Moses", 40, true),
	LEVITICUS("Leviticus", "Lev", "Le", "Moses", 27, true),
	NUMBERS("Numbers", "Num", "Nu", "Moses", 36, true),
	DEUTERONOMY("Deuteronomy", "Deu", "De", "Moses", 34, true),
	JOSHUA("Joshua", "Jos", "Joshua", 24, true),
	JUDGES("Judges", "Jud", "Samuel", 21, true),
	RUTH("Ruth", "Ru", "Samuel", 4, true),
	SAMUEL1("1Samuel", "1Sam", "1Sa", "Unknown", 31, true),
	SAMUEL2("2Samuel", "2Sam", "2Sa", "Unknown", 24, true),
	KINGS1("1Kings", "1Ki", "Unknown", 22, true),
	KINGS2("2Kings", "2Ki", "Unknown", 25, true),
	CHRONICLES1("1Chronicles", "1Chron", "1Ch", "Ezra", 29, true),
	CHRONICLES2("2Chronicles", "2Chron", "2Ch", "Ezra", 36, true),
	EZRA("Ezra", "Ezr", "Ezra", 10, true),
	NEHEMIAH("Nehemiah", "Neh", "Ne", "Ezra", 13, true),
	ESTHER("Esther", "Est", "Es", "Unknown", 10, true),
	JOB("Job", "Unknown", 42, true),
	PSALMS("Psalms", "Psalm", "Ps", "Many people", 150, true),
	PROVERBS("Proverbs", "Pro", "Pr", "Solomon", 31, true),
	ECCLESIASTES("Ecclesiastes", "Ecc", "Ec", "Solomon", 12, true),
	SONGOFSONGS("SongofSongs", "SongofSolomon", "So", "Solomon", 8, true),
	ISAIAH("Isaiah", "Isa", "Isaiah", 66, false),
	JEREMIAH("Jeremiah", "Jer", "Jeremiah", 52, false),
	LAMENTATIONS("Lamentations", "Lam", "La", "Jeremiah", 5, false),
	EZEKIEL("Ezekiel", "Eze", "Ezekiel", 48, false),
	DANIEL("Daniel", "Dan", "Da", "Daniel", 12, false),
	HOSEA("Hosea", "Hos", "Ho", "Hosea", 14, true),
	JOEL("Joel", "Joe", "Joel", 3, true),
	AMOS("Amos", "Am", "Amos", 9, true),
	OBADIAH("Obadiah", "Oba", "Ob", "Obadiah", 1, true),
	JONAH("Jonah", "Jon", "Jonah", 4, true),
	MICAH("Micah",  "Mic", "Micah", 7, true),
	NAHUM("Nahum", "Nah", "Na", "Nahum", 3, true),
	HABAKKUK("Habakkuk", "Hab", "Habakkuk", 3, true),
	ZEPHANIAH("Zephaniah", "Zep", "Zephaniah", 3, true),
	HAGGAI("Haggai", "Hag", "Haggai", 2, true),
	ZECHARIAH("Zechariah", "Zec", "Zechariah", 14, true),
	MALACHI("Malachi", "Mal", "Malachi", 4, true),
	MATTHEW("Matthew", "Mat", "Mt", "Matthew", 28, true),
	MARK("Mark", "Mr", "John Mark", 16, true),
	LUKE("Luke", "Lu", "Luke", 24, true),
	JOHN("John", "Joh","John", 21, true),
	ACTS("Acts", "Ac", "Luke", 28, true),
	ROMANS("Romans", "Rom", "Ro", "Paul", 16, true),
	CORINTHIANS1("1Corinthians", "1Cor", "1Co", "Paul", 16, true),
	CORINTHIANS2("2Corinthians", "2Cor", "Paul", 13, true),
	GALATIANS("Galatians", "Gal", "Ga", "Paul", 6, true),
	EPHESIANS("Ephesians", "Eph", "Paul", 6, true),
	PHILIPPIANS("Philippians", "Phili", "Php", "Paul", 4, true),
	COLOSSIANS("Colossians", "Col", "Paul", 4, true),
	THESSALONIANS1("1Thessalonians", "1Thes", "1Th", "Paul", 5, true),
	THESSALONIANS2("2Thessalonians", "2Thes", "2Th", "Paul", 3, true),
	TIMOTHY1("1Timothy", "1Tim", "1Ti", "Paul", 6, true),
	TIMOTHY2("2Timothy", "2Tim", "2Ti", "Paul", 4, true),
	TITUS("Titus", "Tit", "Paul", 3, true),
	PHILEMON("Philemon", "Phile", "Phm", "Paul", 1, true),
	HEBREWS("Hebrews", "Heb", "Unknown", 13, true),
	JAMES("James", "Jas", "James", 5, true),
	PETER1("1Peter", "1Pe", "Peter", 5, true),
	PETER2("2Peter", "2Pe", "Peter", 3, true),
	JOHN1("1John", "1Jo", "John", 5, true),
	JOHN2("2John", "2Jo", "John", 1, true),
	JOHN3("3John", "3Jo", "John", 1, true),
	JUDE("Jude", "Jude", 1, true),
	REVELATION("Revelation", "Rev", "Re", "John", 22, true);
	
	private String book;
	private String alias;
	private String alias2;
	private String author;
	private int chp;
	private boolean KJV;
	
	private EnumBooks(String book, String author, int chp, boolean KJV){
		this.book = book;
		this.author = author;
		this.chp = chp;
		this.KJV = KJV;
	}
	
	private EnumBooks(String book, String alias, String author, int chp, boolean KJV){
		this.book = book;
		this.alias = alias;
		this.author = author;
		this.chp = chp;
		this.KJV = KJV;
	}
	
	private EnumBooks(String book, String alias, String alias2, String author, int chp, boolean KJV){
		this.book = book;
		this.alias = alias;
		this.alias2 = alias2;
		this.author = author;
		this.chp = chp;
		this.KJV = KJV;
	}
	
	public EnumBooks getDefault(){
		EnumBooks defBook = fromString(TB.config.getString("DefaultBook"));
		return defBook;
	}
	
	public String getBook(){
		return book;
	}
	
	public String getAlias(){
		return alias;
	}
	
	public String getAlias2(){
		return alias2;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public int getChp(){
		return chp;
	}
	
	public boolean isAvailable(String tran){
		if(tran.equalsIgnoreCase("KJV")){
			return KJV;
		}
		return false;
	}
	
	public EnumBooks fromString(String command) {
	    if (command != null) {
	      for (EnumBooks c : EnumBooks.values()) {
	        if (command.equalsIgnoreCase(c.getBook()) || command.equalsIgnoreCase(c.getAlias())
	        		|| command.equalsIgnoreCase(c.getAlias2())) {
	          return c;
	        }
	      }
	    }
	    return null;
	  }
	
	public String numtoBook(int num, String type, String alter, String name){
		if(type == "int"){
			if(alter == "raise"){
				num = num + 1;
			}else if(alter == "lower"){
				num = num - 1;
			}
			for (EnumBooks c : EnumBooks.values()) {
				if (num == c.ordinal() + 1){
					return c.getBook();
				}
			}
		}else if(type == "string"){
			EnumBooks book = EnumBooks.GENESIS;
			book = book.fromString(name);
			num = book.ordinal() + 1;
			if(alter == "raise"){
				num = num + 1;
			}else if(alter == "lower"){
				num = num - 1;
			}
			for (EnumBooks c : EnumBooks.values()) {
				if (num == c.ordinal() + 1){
					return c.getBook();
				}
			}
		}
		return null;
	}
}
