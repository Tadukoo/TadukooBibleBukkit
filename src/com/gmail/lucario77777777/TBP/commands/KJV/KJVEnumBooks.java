package com.gmail.lucario77777777.TBP.commands.KJV;

public enum KJVEnumBooks {
	GENESIS("Genesis", "Gen", true),
	EXODUS("Exodus", "Exo", true),
	LEVITICUS("Leviticus", "Lev", true),
	NUMBERS("Numbers", "Num", true),
	DEUTERONOMY("Deuteronomy", "Deu", false),
	JOSHUA("Joshua", "Jos", false),
	JUDGES("Judges", "Jud", false),
	RUTH("Ruth", null, false),
	SAMUEL1("1Samuel", "1Sam", false),
	SAMUEL2("2Samuel", "2Sam", false),
	KINGS1("1Kings", null, false),
	KINGS2("2Kings", null, false),
	CHRONICLES1("1Chronicles", "1Chron", false),
	CHRONICLES2("2Chronicles", "2Chron", false),
	EZRA("Ezra", null, false),
	NEHEMIAH("Nehemiah", "Neh", false),
	ESTHER("Esther", "Est", false),
	JOB("Job", null, false),
	PSALMS("Psalms", "Psalm", false),
	PROVERBS("Proverbs", "Pro", false),
	ECCLESIASTES("Ecclesiastes", "Ecc", false),
	SONGOFSONGS("SongofSongs", "Song", false),
	ISAIAH("Isaiah", "Isa", false),
	JEREMIAH("Jeremiah", "Jer", false),
	LAMENTATIONS("Lamentations", "Lam", false),
	EZEKIEL("Ezekiel", "Eze", false),
	DANIEL("Daniel", "Dan", false),
	HOSEA("Hosea", null, false),
	JOEL("Joel", null, false),
	AMOS("Amos", null, false),
	OBADIAH("Obadiah", "Oba", false),
	JONAH("Jonah", null, false),
	MICAH("Micah", null, false),
	NAHUM("Nahum", null, false),
	HABAKKUK("Habakkuk", "Hab", false),
	ZEPHANIAH("Zephaniah", "Zep", false),
	HAGGAI("Haggai", "Hag", false),
	ZECHARIAH("Zechariah", "Zec", false),
	MALACHI("Malachi", "Mal", false),
	MATTHEW("Matthew", "Mat", false),
	MARK("Mark", null, false),
	LUKE("Luke", null, false),
	JOHN("John", null, false),
	ACTS("Acts", null, false),
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
	JAMES("James", null, false),
	PETER1("1Peter", null, false),
	PETER2("2Peter", null, false),
	JOHN1("1John", null, true),
	JOHN2("2John", null, true),
	JOHN3("3John", null, true),
	JUDE("Jude", null, false),
	REVELATION("Revelation", "Rev", false),
	FIRST("First", "1", true),
	SECOND("Second", "2", true),
	THIRD("Third", "3", true),
	INFO("info", "?", true),
	BOOKS("books", "books1", true),
	BOOKS2("books2", null, true),
	BOOKS3("books3", null, true),
	BOOKS4("books4", null, true),
	BOOKS5("books5", null, true),
	BOOK("book", null, true);
	
	private String book;
	private String alias;
	private boolean available;
	
	private KJVEnumBooks(String book, String alias, boolean available){
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
	
	public KJVEnumBooks fromString(String command) {
	    if (command != null) {
	      for (KJVEnumBooks c : KJVEnumBooks.values()) {
	        if (command.equalsIgnoreCase(c.getBook()) || command.equalsIgnoreCase(c.getAlias())) {
	          return c;
	        }
	      }
	    }
	    return null;
	  }
}
