package com.gmail.lucario77777777.TBP.commands;

public enum EnumBooks {
	GENESIS("Genesis", "Gen", "Moses", true),
	EXODUS("Exodus", "Exo", "Moses", true),
	LEVITICUS("Leviticus", "Lev", "Moses", true),
	NUMBERS("Numbers", "Num", "Moses", true),
	DEUTERONOMY("Deuteronomy", "Deu", "Moses", true),
	JOSHUA("Joshua", "Jos", "Joshua", false),
	JUDGES("Judges", "Jud", "Samuel", false),
	RUTH("Ruth", "Ruth", "Samuel", false),
	SAMUEL1("1Samuel", "1Sam", "Unknown", false),
	SAMUEL2("2Samuel", "2Sam", "Unknown", false),
	KINGS1("1Kings", "1Kings", "Unknown", false),
	KINGS2("2Kings", "2Kings", "Unknown", false),
	CHRONICLES1("1Chronicles", "1Chron", "Ezra", false),
	CHRONICLES2("2Chronicles", "2Chron", "Ezra", false),
	EZRA("Ezra", "Ezra","Ezra", false),
	NEHEMIAH("Nehemiah", "Neh", "Ezra", false),
	ESTHER("Esther", "Est", "Unknown", false),
	JOB("Job", "Job", "Unknown", false),
	PSALMS("Psalms", "Psalm", "Many people", false),
	PROVERBS("Proverbs", "Pro", "Solomon", false),
	ECCLESIASTES("Ecclesiastes", "Ecc", "Solomon", false),
	SONGOFSONGS("SongofSongs", "Song", "Solomon", false),
	ISAIAH("Isaiah", "Isa", "Isaiah", false),
	JEREMIAH("Jeremiah", "Jer", "Jeremiah", false),
	LAMENTATIONS("Lamentations", "Lam", "Jeremiah", false),
	EZEKIEL("Ezekiel", "Eze", "Ezekiel", false),
	DANIEL("Daniel", "Dan", "Daniel", false),
	HOSEA("Hosea", "Hosea", "Hosea", false),
	JOEL("Joel", "Joel", "Joel", false),
	AMOS("Amos", "Amos", "Amos", false),
	OBADIAH("Obadiah", "Oba", "Obadiah", false),
	JONAH("Jonah", "Jonah", "Jonah", false),
	MICAH("Micah", "Micah", "Micah", false),
	NAHUM("Nahum", "Nahum", "Nahum", false),
	HABAKKUK("Habakkuk", "Hab", "Habakkuk", false),
	ZEPHANIAH("Zephaniah", "Zep", "Zephaniah", false),
	HAGGAI("Haggai", "Hag", "Haggai", false),
	ZECHARIAH("Zechariah", "Zec", "Zechariah", false),
	MALACHI("Malachi", "Mal", "Malachi", false),
	MATTHEW("Matthew", "Mat", "Matthew", false),
	MARK("Mark", "Mark", "John Mark", false),
	LUKE("Luke", "Luke", "Luke", false),
	JOHN("John", "John", "John", false),
	ACTS("Acts", "Acts", "Luke", false),
	ROMANS("Romans", "Rom", "Paul", false),
	CORINTHIANS1("1Corinthians", "1Cor", "Paul", false),
	CORINTHIANS2("2Corinthians", "2Cor", "Paul", false),
	GALATIANS("Galatians", "Gal", "Paul", false),
	EPHESIANS("Ephesians", "Eph", "Paul", false),
	PHILIPPIANS("Philippians", "Phili", "Paul", false),
	COLOSSIANS("Colossians", "Col", "Paul", false),
	THESSALONIANS1("1Thessalonians", "1Thes", "Paul", false),
	THESSALONIANS2("2Thessalonians", "2Thes", "Paul", false),
	TIMOTHY1("1Timothy", "1Tim", "Paul", false),
	TIMOTHY2("2Timothy", "2Tim", "Paul", false),
	TITUS("Titus", "Tit", "Paul", false),
	PHILEMON("Philemon", "Phile", "Paul", false),
	HEBREWS("Hebrews", "Heb", "Unknown", false),
	JAMES("James", "James", "James", false),
	PETER1("1Peter", "1Peter", "Peter", false),
	PETER2("2Peter", "2Peter", "Peter", false),
	JOHN1("1John", "1John", "John", true),
	JOHN2("2John", "2John", "John", true),
	JOHN3("3John", "3John", "John", true),
	JUDE("Jude", "Jude", "Jude", false),
	REVELATION("Revelation", "Rev", "John", false);
	
	private String book;
	private String alias;
	private String author;
	private boolean available;
	
	private EnumBooks(String book, String alias, String author, boolean available){
		this.book = book;
		this.alias = alias;
		this.author = author;
		this.available = available;
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
}
