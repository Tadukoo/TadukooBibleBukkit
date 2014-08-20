package com.gmail.lucario77777777.TBP.Enums;

import com.gmail.lucario77777777.TBP.TB;

public enum EnumBooks {
	GENESIS("Genesis", "Gen", "Ge", "Genesis is about creation, the fall of man, the great flood, God's " +
			"covenant with Abraham, Isaac, and Jacob, and how the Israelites end up in Egypt. It was " +
			"written by Moses and has 50 chapters.", "Its aliases are Gen and Ge.", "Moses", 1, 50, true),
	EXODUS("Exodus", "Exo", "Ex", "Exodus is about God freeing the Israelites from their bondage in Egypt " +
			"through Moses and 10 plagues, the reason for Passover, the Exodus of the Israelites from " +
			"Egypt,  the 10 Commandments, and priest and worship instructions. It was written by Moses and " +
			"has 40 chapters.", "Its aliases are Exo and Ex.", "Moses", 2, 40, true),
	LEVITICUS("Leviticus", "Lev", "Le", "Leviticus is about God's instructions for sacrifices, offerings, " +
			"the priesthood, unclean things, the Day of Atonement, and general laws for holy living. It was " +
			"written by Moses and has 27 chapters.", "Its aliases are Lev and Le.", "Moses", 3, 27, true),
	NUMBERS("Numbers", "Num", "Nu", "Numbers is about the preparation of the Israelite's journey into the " +
			"promised land and the start of this journey, including the sending of spies into the promised " +
			"land, the Israelites wandering in the desert for 40 years as punishment, and the appointment " +
			"of Joshua as leader after Moses is banished from entering the land. It was written by Moses " +
			"and has 36 chapters.", "Its aliases are Num and Nu.", "Moses", 4, 36, true),
	DEUTERONOMY("Deuteronomy", "Deu", "De", "Deuteronomy is about Moses reviewing the Israelite's history, " +
			"the Ten Commandments, the instructions on holy living, and committing the Israelites to " +
			"setting themselves apart unto God. Then Moses blesses each of the tribes, hands over his " +
			"authority to Joshua, and God allows him to see the promised land before he dies. It was " +
			"written by Moses and has 34 chapters.", "Its aliases are Deu and De.", "Moses", 5, 34, true),
	JOSHUA("Joshua", "Jos", "", "Its alias is Jos.", "Joshua", 6, 24, false),
	JUDGES("Judges", "Jud", "", "Its alias is Jud.", "Samuel", 7, 21, false),
	RUTH("Ruth", "Ru", "", "Its alias is Ru.", "Samuel", 8, 4, false),
	SAMUEL1("1Samuel", "1Sam", "1Sa", "", "Its aliases are 1 Sam and 1 Sa.", "Unknown", 9, 31, false),
	SAMUEL2("2Samuel", "2Sam", "2Sa", "", "Its aliases are 2 Sam and 2 Sa.", "Unknown", 10, 24, false),
	KINGS1("1Kings", "1Ki", "", "Its alias is 1 Ki.", "Unknown", 11, 22, false),
	KINGS2("2Kings", "2Ki", "", "Its alias is 2 Ki.", "Unknown", 12, 25, false),
	CHRONICLES1("1Chronicles", "1Chron", "1Ch", "", "Its aliases are 1 Chron and 1 Ch.", "Ezra", 13, 29,
			false),
	CHRONICLES2("2Chronicles", "2Chron", "2Ch", "", "Its aliases are 2 Chron and 2 Ch.", "Ezra", 14, 36,
			false),
	EZRA("Ezra", "Ezr", "", "Its alias is Ezr.", "Ezra", 15, 10, false),
	NEHEMIAH("Nehemiah", "Neh", "Ne", "", "Its aliases are Neh and Ne.", "Ezra", 16, 13, false),
	ESTHER("Esther", "Est", "Es", "", "Its aliases are Est and Es.", "Unknown", 17, 10, false),
	JOB("Job", "", "It has no aliases.", "Unknown", 18, 42, false),
	PSALMS("Psalms", "Psalm", "Ps", "Psalms is a book containing poetry. It was written by many people and " +
			"has 150 chapters.", "Its aliases are Psalm and Ps.", "Many people", 19, 150, true),
	PROVERBS("Proverbs", "Pro", "Pr", "Proverbs is a book of wise sayings by Solomon and a few other " +
			"people. It was written by Solomon and a few other people and has 31 chapters.",
			"Its aliases are Pro and Pr.", "Solomon", 20, 31, true),
	ECCLESIASTES("Ecclesiastes", "Ecc", "Ec", "", "Its aliases are Ecc and Ec.", "Solomon", 21, 12, false),
	SONGOFSONGS("SongofSongs", "SongofSolomon", "So", "", "Its alias is Song of Solomon.", "Solomon", 22, 8,
			false),
	ISAIAH("Isaiah", "Isa", "", "Its alias is Isa.", "Isaiah", 23, 66, false),
	JEREMIAH("Jeremiah", "Jer", "", "Its alias is Jer.", "Jeremiah", 24, 52, false),
	LAMENTATIONS("Lamentations", "Lam", "La", "", "Its aliases are Lam and La.", "Jeremiah", 25, 5, false),
	EZEKIEL("Ezekiel", "Eze", "", "Its alias is Eze.", "Ezekiel", 26, 48, false),
	DANIEL("Daniel", "Dan", "Da", "", "Its aliases are Dan and Da.", "Daniel", 27, 12, false),
	HOSEA("Hosea", "Hos", "Ho", "", "Its aliases are Hos and Ho", "Hosea", 28, 14, false),
	JOEL("Joel", "Joe", "", "Its alias is Joe", "Joel", 29, 3, false),
	AMOS("Amos", "Am", "", "Its alias is Am", "Amos", 30, 9, false),
	OBADIAH("Obadiah", "Oba", "Ob", "", "Its aliases are Oba and Ob.", "Obadiah", 31, 1, false),
	JONAH("Jonah", "Jon",  "", "Its alias is Jon.", "Jonah", 32, 4, false),
	MICAH("Micah",  "Mic", "", "Its alias is Mic.", "Micah", 33, 7, false),
	NAHUM("Nahum", "Nah", "Na",  "", "Its aliases are Nah and Na.", "Nahum", 34, 3, false),
	HABAKKUK("Habakkuk", "Hab", "", "Its alias is Hab.", "Habakkuk", 35, 3, false),
	ZEPHANIAH("Zephaniah", "Zep", "", "Its alias is Zep.", "Zephaniah", 36, 3, false),
	HAGGAI("Haggai", "Hag", "", "Its alias is Hag.", "Haggai", 37, 2, false),
	ZECHARIAH("Zechariah", "Zec", "", "Its alias is Zec.", "Zechariah", 38, 14, false),
	MALACHI("Malachi", "Mal", "", "Its alias is Mal.", "Malachi", 39, 4, false),
	MATTHEW("Matthew", "Mat", "Mt", "Matthew tells about Jesus' life. It was written by Matthew and has 28 " +
			"chapters.", "Its aliases are Mat and Mt.", "Matthew", 40, 28, true),
	MARK("Mark", "Mr", "Mark tells about Jesus' life. It was written by John Mark and has 16 chapters.", 
			"Its alias is Mr.", "John Mark", 41, 16, true),
	LUKE("Luke", "Lu", "Luke tells about Jesus' life. It was written by Luke and has 24 chapters.", 
			"Its alias is Lu.", "Luke", 42,	24, true),
	JOHN("John", "Joh", "John tells about Jesus' life. It was written by John and has 21 chapters.", 
			"Its alias is Joh.", "John", 43, 21, true),
	ACTS("Acts", "Ac", "Acts tells about what the apostles did after Jesus' ascension into Heaven. It was " +
			"written by Luke and has 28 chapters.", "Its alias is Ac.", "Luke", 44, 28, true),
	ROMANS("Romans", "Rom", "Ro", "Romans is a letter written to the believers in Rome about the " +
			"fundamentals of faith, God's sovereignty, and holy living. It was written by Paul and has " +
			"16 chapters.", "Its aliases are Rom and Ro.", "Paul", 45, 16, true),
	CORINTHIANS1("1Corinthians", "1Cor", "1Co", "1 Corinthians is a letter written to the church in Corinth " +
			"about difficulties and confusion in the church along with the resurrection. It was written by " +
			"Paul and has 16 chapters.", "Its aliases are 1 Cor and 1 Co.", "Paul", 46, 16, true),
	CORINTHIANS2("2Corinthians", "2Cor", "2Co", "2 Corinthians is a letter written to the church in Corinth " +
			"about being an apostle, preaching the Gospel, and testing your faith. It was written by Paul " +
			"and has 13 chapters.", "Its aliases are 2 Cor and 2 Co.", "Paul", 47, 13, true),
	GALATIANS("Galatians", "Gal", "Ga", "", "Its aliases are Gal and Ga.", "Paul", 48, 6, false),
	EPHESIANS("Ephesians", "Eph", "", "Its alias is Eph.", "Paul", 49, 6, false),
	PHILIPPIANS("Philippians", "Phili", "Php", "", "Its aliases are Phili and Php.", "Paul", 50, 4, false),
	COLOSSIANS("Colossians", "Col", "", "Its alias is Col.", "Paul", 51, 4, false),
	THESSALONIANS1("1Thessalonians", "1Thes", "1Th", "", "Its aliases are 1 Thes and 1 Th.", "Paul", 52, 5,
			false),
	THESSALONIANS2("2Thessalonians", "2Thes", "2Th", "", "Its aliases are 2 Thes and 2 Th.", "Paul", 53, 3,
			false),
	TIMOTHY1("1Timothy", "1Tim", "1Ti", "", "Its aliases are 1 Tim and 1 Ti.", "Paul", 54, 6, false),
	TIMOTHY2("2Timothy", "2Tim", "2Ti", "", "Its aliases are 2 Tim and 2 Ti.", "Paul", 55, 4, false),
	TITUS("Titus", "Tit", "", "Its alias is Tit.", "Paul", 56, 3, false),
	PHILEMON("Philemon", "Phile", "Phm", "", "Its aliases are Phil and Phm.", "Paul", 57, 1, false),
	HEBREWS("Hebrews", "Heb", "", "Its alias is Heb.", "Unknown", 58, 13, false),
	JAMES("James", "Jas", "", "Its alias is Jas.", "James", 59, 5, false),
	PETER1("1Peter", "1Pe", "", "Its alias is 1 Pe.", "Peter", 60, 5, false),
	PETER2("2Peter", "2Pe", "", "Its alias is 2 Pe.", "Peter", 61, 3, false),
	JOHN1("1John", "1Jo", "1 John teaches about how to discern true teachers. It was written by John and " +
			"has 5 chapters.", "Its alias is 1 Jo.", "John", 62, 5, true),
	JOHN2("2John", "2Jo", "2 John teaches about focusing on Jesus Christ. It was written by John and has " +
			"1 chapter.", "Its alias is 2 Jo.", "John", 63, 1, true),
	JOHN3("3John", "3Jo", "3 John teaches about loving God and other people. It was written by John and has " +
			"1 chapter.", "Its alias is 3 Jo.", "John", 64, 1, true),
	JUDE("Jude", "", "It has no alias.", "Jude", 65, 1, false),
	REVELATION("Revelation", "Rev", "Re", "", "Its aliases are Rev and Re.", "John", 66, 22, false);
	
	private String book;
	private String alias;
	private String alias2;
	private String alias3;
	private String desc;
	private String aliases;
	private String author;
	private int num;
	private int chp;
	private boolean KJV;
	
	private EnumBooks(String book, String desc, String aliases, String author, int num, int chp, boolean KJV){
		this.book = book;
		this.desc = desc;
		this.aliases = aliases;
		this.author = author;
		this.num = num;
		this.chp = chp;
		this.KJV = KJV;
	}
	
	private EnumBooks(String book, String alias, String desc, String aliases, String author, int num, int chp,
			boolean KJV){
		this.book = book;
		this.alias = alias;
		this.desc = desc;
		this.aliases = aliases;
		this.author = author;
		this.num = num;
		this.chp = chp;
		this.KJV = KJV;
	}
	
	private EnumBooks(String book, String alias, String alias2, String desc, String aliases, String author,
			int num, int chp, boolean KJV){
		this.book = book;
		this.alias = alias;
		this.alias2 = alias2;
		this.desc = desc;
		this.aliases = aliases;
		this.author = author;
		this.num = num;
		this.chp = chp;
		this.KJV = KJV;
	}
	
	private EnumBooks(String book, String alias, String alias2, String alias3, String desc, String aliases,
			String author, int num, int chp, boolean KJV){
		this.book = book;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.desc = desc;
		this.aliases = aliases;
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
	
	public String getAlias3(){
		return alias3;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getAliases(){
		return aliases;
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
	        if (command.equalsIgnoreCase(c.getBook()) || command.equalsIgnoreCase(c.getAlias())
	        		|| command.equalsIgnoreCase(c.getAlias2()) || command.equalsIgnoreCase(c.getAlias3())) {
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
