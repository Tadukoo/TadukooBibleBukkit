package com.gmail.realtadukoo.TBP.Enums;

import com.gmail.realtadukoo.TBP.TB;

public enum EnumBooks {
	/*
	 * Old Testament
	 */
	//Pentateuch
	GENESIS("Genesis", "Gen", "Ge", "Moses", 50, true),
	EXODUS("Exodus", "Exo", "Ex", "Moses", 40, true),
	LEVITICUS("Leviticus", "Lev", "Le", "Moses", 27, true),
	NUMBERS("Numbers", "Num", "Nu", "Moses", 36, true),
	DEUTERONOMY("Deuteronomy", "Deu", "De", "Moses", 34, true),
	//History
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
	//Poetry/Wisdom/Writings
	JOB("Job", "Unknown", 42, true),
	PSALMS("Psalms", "Psalm", "Ps", "Many people", 150, true),
	PROVERBS("Proverbs", "Pro", "Pr", "Solomon", 31, true),
	ECCLESIASTES("Ecclesiastes", "Ecc", "Ec", "Solomon", 12, true),
	SONGOFSONGS("SongofSongs", "SongofSolomon", "So", "Solomon", 8, true),
	//Major Prophets
	ISAIAH("Isaiah", "Isa", "Isaiah", 66, true),
	JEREMIAH("Jeremiah", "Jer", "Jeremiah", 52, true),
	LAMENTATIONS("Lamentations", "Lam", "La", "Jeremiah", 5, true),
	EZEKIEL("Ezekiel", "Eze", "Ezekiel", 48, false),
	DANIEL("Daniel", "Dan", "Da", "Daniel", 12, false),
	//Minor Prophets
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
	
	/*
	 * New Testament
	 */
	//Gospels
	MATTHEW("Matthew", "Mat", "Mt", "Matthew", 28, true),
	MARK("Mark", "Mr", "John Mark", 16, true),
	LUKE("Luke", "Lu", "Luke", 24, true),
	JOHN("John", "Joh","John", 21, true),
	//History
	ACTS("Acts", "Ac", "Luke", 28, true),
	//Pauline Epistles
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
	//General Epistles
	HEBREWS("Hebrews", "Heb", "Unknown", 13, true),
	JAMES("James", "Jas", "James", 5, true),
	PETER1("1Peter", "1Pe", "Peter", 5, true),
	PETER2("2Peter", "2Pe", "Peter", 3, true),
	JOHN1("1John", "1Jo", "John", 5, true),
	JOHN2("2John", "2Jo", "John", 1, true),
	JOHN3("3John", "3Jo", "John", 1, true),
	JUDE("Jude", "Jude", 1, true),
	//Apocalypse/Prophecy
	REVELATION("Revelation", "Rev", "Re", "John", 22, true);
	
	private String book; // Book Name
	private String alias; // Alias 1
	private String alias2; // Alias 2
	private String author; // Book Author
	private int chp; // Number of Chapters
	private boolean KJV; // Availability in KJV, soon to be removed
	
	// No alias EnumBooks constructor
	private EnumBooks(String book, String author, int chp, boolean KJV){
		this.book = book;
		this.author = author;
		this.chp = chp;
		this.KJV = KJV;
	}
	
	// One alias EnumBooks constructor
	private EnumBooks(String book, String alias, String author, int chp, boolean KJV){
		this.book = book;
		this.alias = alias;
		this.author = author;
		this.chp = chp;
		this.KJV = KJV;
	}
	
	// Two alias EnumBooks constructor
	private EnumBooks(String book, String alias, String alias2, String author, int chp, boolean KJV){
		this.book = book;
		this.alias = alias;
		this.alias2 = alias2;
		this.author = author;
		this.chp = chp;
		this.KJV = KJV;
	}
	
	// Gets default book based on config.yml setting
	public EnumBooks getDefault(){
		EnumBooks defBook = fromString(TB.config.getString("default.book"));
		return defBook;
	}
	
	// Gets book name
	public String getBook(){
		return book;
	}
	
	// Gets alias 1.
	public String getAlias(){
		return alias;
	}
	
	// Gets alias 2.
	public String getAlias2(){
		return alias2;
	}
	
	// Gets author name.
	public String getAuthor(){
		return author;
	}
	
	// Gets number of chapters.
	public int getChp(){
		return chp;
	}
	
	// Gets availability for the specified translation (Soon to be removed).
	public boolean isAvailable(String tran){
		if(tran.equalsIgnoreCase("KJV")){
			return KJV;
		}
		return false;
	}
	
	// Gets an EnumBooks from a string by checking if the string matches the book name, alias, or 2nd alias.
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
	
	/*
	 *  Gets a book name based on the number of the book in Biblical order.
	 *  Also used to get previous or next book.
	 */
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
