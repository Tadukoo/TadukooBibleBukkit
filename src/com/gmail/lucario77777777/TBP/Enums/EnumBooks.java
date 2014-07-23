package com.gmail.lucario77777777.TBP.Enums;

public enum EnumBooks {
	GENESIS("Genesis", "Gen", "Moses", 1, 50, true),
	EXODUS("Exodus", "Exo", "Moses", 2, 40, true),
	LEVITICUS("Leviticus", "Lev", "Moses", 3, 27, true),
	NUMBERS("Numbers", "Num", "Moses", 4, 36, true),
	DEUTERONOMY("Deuteronomy", "Deu", "Moses", 5, 34, true),
	JOSHUA("Joshua", "Jos", "Joshua", 6, 24, false),
	JUDGES("Judges", "Jud", "Samuel", 7, 21, false),
	RUTH("Ruth", "Samuel", 8, 4, false),
	SAMUEL1("1Samuel", "1Sam", "Unknown", 9, 31, false),
	SAMUEL2("2Samuel", "2Sam", "Unknown", 10, 24, false),
	KINGS1("1Kings", "Unknown", 11, 22, false),
	KINGS2("2Kings", "Unknown", 12, 25, false),
	CHRONICLES1("1Chronicles", "1Chron", "Ezra", 13, 29, false),
	CHRONICLES2("2Chronicles", "2Chron", "Ezra", 14, 36, false),
	EZRA("Ezra", "Ezra", 15, 10, false),
	NEHEMIAH("Nehemiah", "Neh", "Ezra", 16, 13, false),
	ESTHER("Esther", "Est", "Unknown", 17, 10, false),
	JOB("Job", "Unknown", 18, 42, false),
	PSALMS("Psalms", "Psalm", "Many people", 19, 150, false),
	PROVERBS("Proverbs", "Pro", "Solomon", 20, 31, false),
	ECCLESIASTES("Ecclesiastes", "Ecc", "Solomon", 21, 12, false),
	SONGOFSONGS("SongofSongs", "Song", "Solomon", 22, 8, false),
	ISAIAH("Isaiah", "Isa", "Isaiah", 23, 66, false),
	JEREMIAH("Jeremiah", "Jer", "Jeremiah", 24, 52, false),
	LAMENTATIONS("Lamentations", "Lam", "Jeremiah", 25, 5, false),
	EZEKIEL("Ezekiel", "Eze", "Ezekiel", 26, 48, false),
	DANIEL("Daniel", "Dan", "Daniel", 27, 12, false),
	HOSEA("Hosea", "Hos", "Hosea", 28, 14, false),
	JOEL("Joel", "Joel", 29, 3, false),
	AMOS("Amos", "Amos", 30, 9, false),
	OBADIAH("Obadiah", "Oba", "Obadiah", 31, 1, false),
	JONAH("Jonah", "Jonah", "Jonah", 32, 4, false),
	MICAH("Micah", "Micah", "Micah", 33, 7, false),
	NAHUM("Nahum", "Nahum", "Nahum", 34, 3, false),
	HABAKKUK("Habakkuk", "Hab", "Habakkuk", 35, 3, false),
	ZEPHANIAH("Zephaniah", "Zep", "Zephaniah", 36, 3, false),
	HAGGAI("Haggai", "Hag", "Haggai", 37, 2, false),
	ZECHARIAH("Zechariah", "Zec", "Zechariah", 38, 14, false),
	MALACHI("Malachi", "Mal", "Malachi", 39, 4, false),
	MATTHEW("Matthew", "Mat", "Matthew", 40, 28, true),
	MARK("Mark", "John Mark", 41, 16, true),
	LUKE("Luke", "Luke", 42, 24, true),
	JOHN("John", "John", 43, 21, true),
	ACTS("Acts", "Luke", 44, 28, false),
	ROMANS("Romans", "Rom", "Paul", 45, 16, false),
	CORINTHIANS1("1Corinthians", "1Cor", "Paul", 46, 16, false),
	CORINTHIANS2("2Corinthians", "2Cor", "Paul", 47, 13, false),
	GALATIANS("Galatians", "Gal", "Paul", 48, 6, false),
	EPHESIANS("Ephesians", "Eph", "Paul", 49, 6, false),
	PHILIPPIANS("Philippians", "Phili", "Paul", 50, 4, false),
	COLOSSIANS("Colossians", "Col", "Paul", 51, 4, false),
	THESSALONIANS1("1Thessalonians", "1Thes", "Paul", 52, 5, false),
	THESSALONIANS2("2Thessalonians", "2Thes", "Paul", 53, 3, false),
	TIMOTHY1("1Timothy", "1Tim", "Paul", 54, 6, false),
	TIMOTHY2("2Timothy", "2Tim", "Paul", 55, 4, false),
	TITUS("Titus", "Tit", "Paul", 56, 3, false),
	PHILEMON("Philemon", "Phile", "Paul", 57, 1, false),
	HEBREWS("Hebrews", "Heb", "Unknown", 58, 13, false),
	JAMES("James", "James", 59, 5, false),
	PETER1("1Peter", "Peter", 60, 5, false),
	PETER2("2Peter", "Peter", 61, 3, false),
	JOHN1("1John", "John", 62, 5, true),
	JOHN2("2John", "John", 63, 1, true),
	JOHN3("3John", "John", 64, 1, true),
	JUDE("Jude", "Jude", 65, 1, false),
	REVELATION("Revelation", "Rev", "John", 66, 22, false);
	
	private String book;
	private String alias;
	private String author;
	private int num;
	private int chp;
	private boolean KJV;
	
	private EnumBooks(String book, String alias, String author, int num, int chp, boolean KJV){
		this.book = book;
		this.alias = alias;
		this.author = author;
		this.num = num;
		this.chp = chp;
		this.KJV = KJV;
	}
	
	private EnumBooks(String book, String author, int num, int chp, boolean KJV){
		this.book = book;
		this.author = author;
		this.num = num;
		this.chp = chp;
		this.KJV = KJV;
	}
	
	public boolean isAvailable(String tran){
		if(tran.equalsIgnoreCase("KJV")){
			return KJV;
		}
		return false;
	}
	
	public String getBook(){
		return book;
	}
	
	public String getAlias(){
		return alias;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public int getNum(){
		return num;
	}
	
	public int getChp(){
		return chp;
	}
	
	public EnumBooks fromString(String command) {
	    if (command != null) {
	      for (EnumBooks c : EnumBooks.values()) {
	        if (command.equalsIgnoreCase(c.getBook()) || command.equalsIgnoreCase(c.getAlias())) {
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
				if (num == c.getNum()){
					return c.getBook();
				}
			}
		}else if(type == "string"){
			EnumBooks book = EnumBooks.GENESIS;
			book = book.fromString(name);
			num = book.getNum();
			if(alter == "raise"){
				num = num + 1;
			}else if(alter == "lower"){
				num = num - 1;
			}
			for (EnumBooks c : EnumBooks.values()) {
				if (num == c.getNum()){
					return c.getBook();
				}
			}
		}
		return null;
	}
}
