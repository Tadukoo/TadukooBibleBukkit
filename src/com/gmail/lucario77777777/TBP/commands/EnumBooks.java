package com.gmail.lucario77777777.TBP.commands;

public enum EnumBooks {
	GENESIS("Genesis", "Gen", "Moses", true, 1, 50),
	EXODUS("Exodus", "Exo", "Moses", true, 2, 40),
	LEVITICUS("Leviticus", "Lev", "Moses", true, 3, 27),
	NUMBERS("Numbers", "Num", "Moses", true, 4, 36),
	DEUTERONOMY("Deuteronomy", "Deu", "Moses", true, 5, 34),
	JOSHUA("Joshua", "Jos", "Joshua", false, 6, 24),
	JUDGES("Judges", "Jud", "Samuel", false, 7, 21),
	RUTH("Ruth", "Ruth", "Samuel", false, 8, 4),
	SAMUEL1("1Samuel", "1Sam", "Unknown", false, 9, 31),
	SAMUEL2("2Samuel", "2Sam", "Unknown", false, 10, 24),
	KINGS1("1Kings", "1Kings", "Unknown", false, 11, 22),
	KINGS2("2Kings", "2Kings", "Unknown", false, 12, 25),
	CHRONICLES1("1Chronicles", "1Chron", "Ezra", false, 13, 29),
	CHRONICLES2("2Chronicles", "2Chron", "Ezra", false, 14, 36),
	EZRA("Ezra", "Ezra","Ezra", false, 15, 10),
	NEHEMIAH("Nehemiah", "Neh", "Ezra", false, 16, 13),
	ESTHER("Esther", "Est", "Unknown", false, 17, 10),
	JOB("Job", "Job", "Unknown", false, 18, 42),
	PSALMS("Psalms", "Psalm", "Many people", false, 19, 150),
	PROVERBS("Proverbs", "Pro", "Solomon", false, 20, 31),
	ECCLESIASTES("Ecclesiastes", "Ecc", "Solomon", false, 21, 12),
	SONGOFSONGS("SongofSongs", "Song", "Solomon", false, 22, 8),
	ISAIAH("Isaiah", "Isa", "Isaiah", false, 23, 66),
	JEREMIAH("Jeremiah", "Jer", "Jeremiah", false, 24, 52),
	LAMENTATIONS("Lamentations", "Lam", "Jeremiah", false, 25, 5),
	EZEKIEL("Ezekiel", "Eze", "Ezekiel", false, 26, 48),
	DANIEL("Daniel", "Dan", "Daniel", false, 27, 12),
	HOSEA("Hosea", "Hosea", "Hosea", false, 28, 14),
	JOEL("Joel", "Joel", "Joel", false, 29, 3),
	AMOS("Amos", "Amos", "Amos", false, 30, 9),
	OBADIAH("Obadiah", "Oba", "Obadiah", false, 31, 1),
	JONAH("Jonah", "Jonah", "Jonah", false, 32, 4),
	MICAH("Micah", "Micah", "Micah", false, 33, 7),
	NAHUM("Nahum", "Nahum", "Nahum", false, 34, 3),
	HABAKKUK("Habakkuk", "Hab", "Habakkuk", false, 35, 3),
	ZEPHANIAH("Zephaniah", "Zep", "Zephaniah", false, 36, 3),
	HAGGAI("Haggai", "Hag", "Haggai", false, 37, 2),
	ZECHARIAH("Zechariah", "Zec", "Zechariah", false, 38, 14),
	MALACHI("Malachi", "Mal", "Malachi", false, 39, 4),
	MATTHEW("Matthew", "Mat", "Matthew", false, 40, 28),
	MARK("Mark", "Mark", "John Mark", false, 41, 16),
	LUKE("Luke", "Luke", "Luke", false, 42, 24),
	JOHN("John", "John", "John", false, 43, 21),
	ACTS("Acts", "Acts", "Luke", false, 44, 28),
	ROMANS("Romans", "Rom", "Paul", false, 45, 16),
	CORINTHIANS1("1Corinthians", "1Cor", "Paul", false, 46, 16),
	CORINTHIANS2("2Corinthians", "2Cor", "Paul", false, 47, 13),
	GALATIANS("Galatians", "Gal", "Paul", false, 48, 6),
	EPHESIANS("Ephesians", "Eph", "Paul", false, 49, 6),
	PHILIPPIANS("Philippians", "Phili", "Paul", false, 50, 4),
	COLOSSIANS("Colossians", "Col", "Paul", false, 51, 4),
	THESSALONIANS1("1Thessalonians", "1Thes", "Paul", false, 52, 5),
	THESSALONIANS2("2Thessalonians", "2Thes", "Paul", false, 53, 3),
	TIMOTHY1("1Timothy", "1Tim", "Paul", false, 54, 6),
	TIMOTHY2("2Timothy", "2Tim", "Paul", false, 55, 4),
	TITUS("Titus", "Tit", "Paul", false, 56, 3),
	PHILEMON("Philemon", "Phile", "Paul", false, 57, 1),
	HEBREWS("Hebrews", "Heb", "Unknown", false, 58, 13),
	JAMES("James", "James", "James", false, 59, 5),
	PETER1("1Peter", "1Peter", "Peter", false, 60, 5),
	PETER2("2Peter", "2Peter", "Peter", false, 61, 3),
	JOHN1("1John", "1John", "John", true, 62, 5),
	JOHN2("2John", "2John", "John", true, 63, 1),
	JOHN3("3John", "3John", "John", true, 64, 1),
	JUDE("Jude", "Jude", "Jude", false, 65, 1),
	REVELATION("Revelation", "Rev", "John", false, 66, 22);
	
	private String book;
	private String alias;
	private String author;
	private boolean available;
	private int num;
	private int chp;
	
	private EnumBooks(String book, String alias, String author, boolean available, int num, int chp){
		this.book = book;
		this.alias = alias;
		this.author = author;
		this.available = available;
		this.num = num;
		this.chp = chp;
	}
	
	public boolean isAvailable(){
		return available;
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
