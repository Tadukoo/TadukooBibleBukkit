package com.gmail.lucario77777777.TBP.commands;

public enum EnumBooks {
	GENESIS("Genesis", "Gen", true),
	EXODUS("Exodus", "Exo", true),
	LEVITICUS("Leviticus", "Lev", true),
	NUMBERS("Numbers", "Num", true),
	DEUTERONOMY("Deuteronomy", "Deu", false),
	JOSHUA("Joshua", "Jos", false),
	JUDGES("Judges", "Jud", false),
	RUTH("Ruth", "Ruth", false),
	SAMUEL1("1Samuel", "1Sam", false),
	SAMUEL2("2Samuel", "2Sam", false),
	KINGS1("1Kings", "1Kings", false),
	KINGS2("2Kings", "2Kings", false),
	CHRONICLES1("1Chronicles", "1Chron", false),
	CHRONICLES2("2Chronicles", "2Chron", false),
	EZRA("Ezra", "Ezra", false),
	NEHEMIAH("Nehemiah", "Neh", false),
	ESTHER("Esther", "Est", false),
	JOB("Job", "Job", false),
	PSALMS("Psalms", "Psalm", false),
	PROVERBS("Proverbs", "Pro", false),
	ECCLESIASTES("Ecclesiastes", "Ecc", false),
	SONGOFSONGS("SongofSongs", "Song", false),
	ISAIAH("Isaiah", "Isa", false),
	JEREMIAH("Jeremiah", "Jer", false),
	LAMENTATIONS("Lamentations", "Lam", false),
	EZEKIEL("Ezekiel", "Eze", false),
	DANIEL("Daniel", "Dan", false),
	HOSEA("Hosea", "Hosea", false),
	JOEL("Joel", "Joel", false),
	AMOS("Amos", "Amos", false),
	OBADIAH("Obadiah", "Oba", false),
	JONAH("Jonah", "Jonah", false),
	MICAH("Micah", "Micah", false),
	NAHUM("Nahum", "Nahum", false),
	HABAKKUK("Habakkuk", "Hab", false),
	ZEPHANIAH("Zephaniah", "Zep", false),
	HAGGAI("Haggai", "Hag", false),
	ZECHARIAH("Zechariah", "Zec", false),
	MALACHI("Malachi", "Mal", false),
	MATTHEW("Matthew", "Mat", false),
	MARK("Mark", "Mark", false),
	LUKE("Luke", "Luke", false),
	JOHN("John", "John", false),
	ACTS("Acts", "Acts", false),
	ROMANS("Romans", "Rom", false),
	CORINTHIANS1("1Corinthians", "1Cor", false),
	CORINTHIANS2("2Corinthians", "2Cor", false),
	GALATIANS("Galatians", "Gal", false),
	EPHESIANS("Ephesians", "Eph", false),
	PHILIPPIANS("Philippians", "Phili", false),
	COLOSSIANS("Colossians", "Col", false),
	THESSALONIANS1("1Thessalonians", "1Thes", false),
	THESSALONIANS2("2Thessalonians", "2Thes", false),
	TIMOTHY1("1Timothy", "1Tim", false),
	TIMOTHY2("2Timothy", "2Tim", false),
	TITUS("Titus", "Tit", false),
	PHILEMON("Philemon", "Phile", false),
	HEBREWS("Hebrews", "Heb", false),
	JAMES("James", "James", false),
	PETER1("1Peter", "1Peter", false),
	PETER2("2Peter", "2Peter", false),
	JOHN1("1John", "1John", true),
	JOHN2("2John", "2John", true),
	JOHN3("3John", "3John", true),
	JUDE("Jude", "Jude", false),
	REVELATION("Revelation", "Rev", false),
	FIRST("First", "1", true),
	SECOND("Second", "2", true),
	THIRD("Third", "3", true),
	INFO("info", "?", true),
	BOOKS("books", "list", true),
	BOOKS2("books2", "list2", true),
	BOOKS3("books3", "list3", true),
	BOOKS4("books4", "list4", true),
	BOOKS5("books5", "list5", true),
	BOOK("book", null, true);
	
	private String book;
	private String alias;
	private boolean available;
	
	private EnumBooks(String book, String alias, boolean available){
		this.book = book;
		this.alias = alias;
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
