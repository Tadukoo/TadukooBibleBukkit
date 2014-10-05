package com.gmail.lucario77777777.TBP.Enums;

import com.gmail.lucario77777777.TBP.TB;

public enum EnumBooks {
	GENESIS(1, "Genesis", "Gen", "Ge", "Moses", 50, true),
	EXODUS(2, "Exodus", "Exo", "Ex", "Moses", 40, true),
	LEVITICUS(3, "Leviticus", "Lev", "Le", "Moses", 27, true),
	NUMBERS(4, "Numbers", "Num", "Nu", "Moses", 36, true),
	DEUTERONOMY(5, "Deuteronomy", "Deu", "De", "Moses", 34, true),
	JOSHUA(6, "Joshua", "Jos", "Joshua", 24, true),
	JUDGES(7, "Judges", "Jud", "Samuel", 21, true),
	RUTH(8, "Ruth", "Ru", "Samuel", 4, true),
	SAMUEL1(9, "1Samuel", "1Sam", "1Sa", "Unknown", 31, true),
	SAMUEL2(10, "2Samuel", "2Sam", "2Sa", "Unknown", 24, true),
	KINGS1(11, "1Kings", "1Ki", "Unknown", 22, true),
	KINGS2(12, "2Kings", "2Ki", "Unknown", 25, true),
	CHRONICLES1(13, "1Chronicles", "1Chron", "1Ch", "Ezra", 29, true),
	CHRONICLES2(14, "2Chronicles", "2Chron", "2Ch", "Ezra", 36, true),
	EZRA(15, "Ezra", "Ezr", "Ezra", 10, true),
	NEHEMIAH(16, "Nehemiah", "Neh", "Ne", "Ezra", 13, true),
	ESTHER(17, "Esther", "Est", "Es", "Unknown", 10, true),
	JOB(18, "Job", "Unknown", 42, true),
	PSALMS(19, "Psalms", "Psalm", "Ps", "Many people", 150, true),
	PROVERBS(20, "Proverbs", "Pro", "Pr", "Solomon", 31, true),
	ECCLESIASTES(21, "Ecclesiastes", "Ecc", "Ec", "Solomon", 12, true),
	SONGOFSONGS(22, "SongofSongs", "SongofSolomon", "So", "Solomon", 8, true),
	ISAIAH(23, "Isaiah", "Isa", "Isaiah", 66, false),
	JEREMIAH(24, "Jeremiah", "Jer", "Jeremiah", 52, false),
	LAMENTATIONS(25, "Lamentations", "Lam", "La", "Jeremiah", 5, false),
	EZEKIEL(26, "Ezekiel", "Eze", "Ezekiel", 48, false),
	DANIEL(27, "Daniel", "Dan", "Da", "Daniel", 12, false),
	HOSEA(28, "Hosea", "Hos", "Ho", "Hosea", 14, false),
	JOEL(29, "Joel", "Joe", "Joel", 3, false),
	AMOS(30, "Amos", "Am", "Amos", 9, false),
	OBADIAH(31, "Obadiah", "Oba", "Ob", "Obadiah", 1, false),
	JONAH(32, "Jonah", "Jon", "Jonah", 4, false),
	MICAH(33, "Micah",  "Mic", "Micah", 7, false),
	NAHUM(34, "Nahum", "Nah", "Na", "Nahum", 3, false),
	HABAKKUK(35, "Habakkuk", "Hab", "Habakkuk", 3, false),
	ZEPHANIAH(36, "Zephaniah", "Zep", "Zephaniah", 3, false),
	HAGGAI(37, "Haggai", "Hag", "Haggai", 2, false),
	ZECHARIAH(38, "Zechariah", "Zec", "Zechariah", 14, false),
	MALACHI(39, "Malachi", "Mal", "Malachi", 4, false),
	MATTHEW(40, "Matthew", "Mat", "Mt", "Matthew", 28, true),
	MARK(41, "Mark", "Mr", "John Mark", 16, true),
	LUKE(42, "Luke", "Lu", "Luke", 24, true),
	JOHN(43, "John", "Joh","John", 21, true),
	ACTS(44, "Acts", "Ac", "Luke", 28, true),
	ROMANS(45, "Romans", "Rom", "Ro", "Paul", 16, true),
	CORINTHIANS1(46, "1Corinthians", "1Cor", "1Co", "Paul", 16, true),
	CORINTHIANS2(47, "2Corinthians", "2Cor", "Paul", 13, true),
	GALATIANS(48, "Galatians", "Gal", "Ga", "Paul", 6, true),
	EPHESIANS(49, "Ephesians", "Eph", "Paul", 6, true),
	PHILIPPIANS(50, "Philippians", "Phili", "Php", "Paul", 4, true),
	COLOSSIANS(51, "Colossians", "Col", "Paul", 4, true),
	THESSALONIANS1(52, "1Thessalonians", "1Thes", "1Th", "Paul", 5, true),
	THESSALONIANS2(53, "2Thessalonians", "2Thes", "2Th", "Paul", 3, true),
	TIMOTHY1(54, "1Timothy", "1Tim", "1Ti", "Paul", 6, true),
	TIMOTHY2(55, "2Timothy", "2Tim", "2Ti", "Paul", 4, true),
	TITUS(56, "Titus", "Tit", "Paul", 3, true),
	PHILEMON(57, "Philemon", "Phile", "Phm", "Paul", 1, true),
	HEBREWS(58, "Hebrews", "Heb", "Unknown", 13, true),
	JAMES(59, "James", "Jas", "James", 5, true),
	PETER1(60, "1Peter", "1Pe", "Peter", 5, true),
	PETER2(61, "2Peter", "2Pe", "Peter", 3, true),
	JOHN1(62, "1John", "1Jo", "John", 5, true),
	JOHN2(63, "2John", "2Jo", "John", 1, true),
	JOHN3(64, "3John", "3Jo", "John", 1, true),
	JUDE(65, "Jude", "Jude", 1, true),
	REVELATION(66, "Revelation", "Rev", "Re", "John", 22, true);
	
	private int num;
	private String book;
	private String alias;
	private String alias2;
	private String author;
	private int chp;
	private boolean KJV;
	
	private EnumBooks(int num, String book, String author, int chp, boolean KJV){
		this.num = num;
		this.book = book;
		this.author = author;
		this.chp = chp;
		this.KJV = KJV;
	}
	
	private EnumBooks(int num, String book, String alias, String author, int chp, boolean KJV){
		this.num = num;
		this.book = book;
		this.alias = alias;
		this.author = author;
		this.chp = chp;
		this.KJV = KJV;
	}
	
	private EnumBooks(int num, String book, String alias, String alias2, String author, int chp, boolean KJV){
		this.num = num;
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
	
	public int getNum(){
		return num;
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
