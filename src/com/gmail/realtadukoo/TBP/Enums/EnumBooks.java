package com.gmail.realtadukoo.TBP.Enums;

import com.gmail.realtadukoo.TBP.TB;

public enum EnumBooks {
	/*
	 * Old Testament
	 */
	//Pentateuch
	GENESIS("Genesis", "Gen", "Ge", "Moses", 50),
	EXODUS("Exodus", "Exo", "Ex", "Moses", 40),
	LEVITICUS("Leviticus", "Lev", "Le", "Moses", 27),
	NUMBERS("Numbers", "Num", "Nu", "Moses", 36),
	DEUTERONOMY("Deuteronomy", "Deu", "De", "Moses", 34),
	//History
	JOSHUA("Joshua", "Jos", "Joshua", 24),
	JUDGES("Judges", "Jud", "Samuel", 21),
	RUTH("Ruth", "Ru", "Samuel", 4),
	SAMUEL1("1Samuel", "1Sam", "1Sa", "Unknown", 31),
	SAMUEL2("2Samuel", "2Sam", "2Sa", "Unknown", 24),
	KINGS1("1Kings", "1Ki", "Unknown", 22),
	KINGS2("2Kings", "2Ki", "Unknown", 25),
	CHRONICLES1("1Chronicles", "1Chron", "1Ch", "Ezra", 29),
	CHRONICLES2("2Chronicles", "2Chron", "2Ch", "Ezra", 36),
	EZRA("Ezra", "Ezr", "Ezra", 10),
	NEHEMIAH("Nehemiah", "Neh", "Ne", "Ezra", 13),
	ESTHER("Esther", "Est", "Es", "Unknown", 10),
	//Poetry/Wisdom/Writings
	JOB("Job", "Unknown", 42),
	PSALMS("Psalms", "Psalm", "Ps", "Many people", 150),
	PROVERBS("Proverbs", "Pro", "Pr", "Solomon", 31),
	ECCLESIASTES("Ecclesiastes", "Ecc", "Ec", "Solomon", 12),
	SONGOFSONGS("SongofSongs", "SongofSolomon", "So", "Solomon", 8),
	//Major Prophets
	ISAIAH("Isaiah", "Isa", "Isaiah", 66),
	JEREMIAH("Jeremiah", "Jer", "Jeremiah", 52),
	LAMENTATIONS("Lamentations", "Lam", "La", "Jeremiah", 5),
	EZEKIEL("Ezekiel", "Eze", "Ezekiel", 48),
	DANIEL("Daniel", "Dan", "Da", "Daniel", 12),
	//Minor Prophets
	HOSEA("Hosea", "Hos", "Ho", "Hosea", 14),
	JOEL("Joel", "Joe", "Joel", 3),
	AMOS("Amos", "Am", "Amos", 9),
	OBADIAH("Obadiah", "Oba", "Ob", "Obadiah", 1),
	JONAH("Jonah", "Jon", "Jonah", 4),
	MICAH("Micah",  "Mic", "Micah", 7),
	NAHUM("Nahum", "Nah", "Na", "Nahum", 3),
	HABAKKUK("Habakkuk", "Hab", "Habakkuk", 3),
	ZEPHANIAH("Zephaniah", "Zep", "Zephaniah", 3),
	HAGGAI("Haggai", "Hag", "Haggai", 2),
	ZECHARIAH("Zechariah", "Zec", "Zechariah", 14),
	MALACHI("Malachi", "Mal", "Malachi", 4),
	
	/*
	 * New Testament
	 */
	//Gospels
	MATTHEW("Matthew", "Mat", "Mt", "Matthew", 28),
	MARK("Mark", "Mr", "John Mark", 16),
	LUKE("Luke", "Lu", "Luke", 24),
	JOHN("John", "Joh","John", 21),
	//History
	ACTS("Acts", "Ac", "Luke", 28),
	//Pauline Epistles
	ROMANS("Romans", "Rom", "Ro", "Paul", 16),
	CORINTHIANS1("1Corinthians", "1Cor", "1Co", "Paul", 16),
	CORINTHIANS2("2Corinthians", "2Cor", "Paul", 13),
	GALATIANS("Galatians", "Gal", "Ga", "Paul", 6),
	EPHESIANS("Ephesians", "Eph", "Paul", 6),
	PHILIPPIANS("Philippians", "Phili", "Php", "Paul", 4),
	COLOSSIANS("Colossians", "Col", "Paul", 4),
	THESSALONIANS1("1Thessalonians", "1Thes", "1Th", "Paul", 5),
	THESSALONIANS2("2Thessalonians", "2Thes", "2Th", "Paul", 3),
	TIMOTHY1("1Timothy", "1Tim", "1Ti", "Paul", 6),
	TIMOTHY2("2Timothy", "2Tim", "2Ti", "Paul", 4),
	TITUS("Titus", "Tit", "Paul", 3),
	PHILEMON("Philemon", "Phile", "Phm", "Paul", 1),
	//General Epistles
	HEBREWS("Hebrews", "Heb", "Unknown", 13),
	JAMES("James", "Jas", "James", 5),
	PETER1("1Peter", "1Pe", "Peter", 5),
	PETER2("2Peter", "2Pe", "Peter", 3),
	JOHN1("1John", "1Jo", "John", 5),
	JOHN2("2John", "2Jo", "John", 1),
	JOHN3("3John", "3Jo", "John", 1),
	JUDE("Jude", "Jude", 1),
	//Apocalypse/Prophecy
	REVELATION("Revelation", "Rev", "Re", "John", 22);
	
	private String book; // Book Name
	private String alias; // Alias 1
	private String alias2; // Alias 2
	private String author; // Book Author
	private int chp; // Number of Chapters
	
	// No alias EnumBooks constructor
	private EnumBooks(String book, String author, int chp){
		this.book = book;
		this.author = author;
		this.chp = chp;
	}
	
	// One alias EnumBooks constructor
	private EnumBooks(String book, String alias, String author, int chp){
		this.book = book;
		this.alias = alias;
		this.author = author;
		this.chp = chp;
	}
	
	// Two alias EnumBooks constructor
	private EnumBooks(String book, String alias, String alias2, String author, int chp){
		this.book = book;
		this.alias = alias;
		this.alias2 = alias2;
		this.author = author;
		this.chp = chp;
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
