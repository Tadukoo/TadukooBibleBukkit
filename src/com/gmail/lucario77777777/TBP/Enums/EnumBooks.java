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
	JOSHUA("Joshua", "Jos", "Joshua is about the Israelites entering the promised land, conquering it, " +
			"dividing it among the tribes, and Joshua's death, leaving a great challenge for everyone. It " +
			"was written by Joshua and has 24 chapters.", "Its alias is Jos.", "Joshua", 6, 24, false),
	JUDGES("Judges", "Jud", "Judges is about the various judges God raised up for the Israelites to get " +
			"them back on track with following God after each time they rebelled. It was written by Samuel " +
			"and has 21 chapters.", "Its alias is Jud.", "Samuel", 7, 21, false),
	RUTH("Ruth", "Ru", "Ruth is a story about how Ruth came to marry Boaz. It shows the love and " +
			"faithfulness God desires us to have for Him. It was written by Samuel and has 4 chapters.",
			"Its alias is Ru.", "Samuel", 8, 4, false),
	SAMUEL1("1Samuel", "1Sam", "1Sa", "1 Samuel is a book about Samuel, the last judge of Israel. During " +
			"his time, Israel wants a king to rule over them, and Saul is selected. Saul turns against God, " +
			"and David is chosen as the next king. The author is unknown, but it has 31 chapters.",
			"Its aliases are 1 Sam and 1 Sa.", "Unknown", 9, 31, false),
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
	PSALMS("Psalms", "Psalm", "Ps", "Psalms is a book containing songs and poetry. 73 Psalms were written " +
			"by David, 12 by Asaph, 9 by the sons of Korah, 3 by Solomon, 1 by Ethan, 1 by Moses, and 51 " +
			"without a known author. Psalms is mainly about praising God, totaling 150 Psalms.", "Its " +
			"aliases are Psalm and Ps.", "Many people", 19, 150, true),
	PROVERBS("Proverbs", "Pro", "Pr", "Proverbs is a book of wise sayings by Solomon, Lemuel, and Agur. " +
			"It talks about seeking wisdom in your youth, holy living, wisdom for leaders, and heeding your " +
			"parents' advice. It has 31 chapters.", "Its aliases are Pro and Pr.", "Solomon", 20, 31, true),
	ECCLESIASTES("Ecclesiastes", "Ecc", "Ec", "", "Its aliases are Ecc and Ec.", "Solomon", 21, 12, true),
	SONGOFSONGS("SongofSongs", "SongofSolomon", "So", "", "Its alias is Song of Solomon.", "Solomon", 22, 8,
			true),
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
	MATTHEW("Matthew", "Mat", "Mt", "Matthew tells about Jesus' life, including His birth, genealogy, " +
			"ministry, miracles, teachings, death, and resurrection. It was written by Matthew and has 28 " +
			"chapters.", "Its aliases are Mat and Mt.", "Matthew", 40, 28, true),
	MARK("Mark", "Mr", "Mark tells about Jesus' life, including His baptism, temptation, ministry, " +
			"selection of His disciples, teachings, blessings, miracles, death, and resurrection. It was " +
			"written by John Mark and has 16 chapters.", "Its alias is Mr.", "John Mark", 41, 16, true),
	LUKE("Luke", "Lu", "Luke tells about Jesus' life, including His birth, baptism, ministry, teachings, " +
			"healings, betrayal, death, and resurrection. It was written by Luke and has 24 chapters.", 
			"Its alias is Lu.", "Luke", 42,	24, true),
	JOHN("John", "Joh", "John tells about Jesus' life, including His ministry, Last Supper, teachings, " +
			"death, burial, and resurrection. It was written by John and has 21 chapters.", "Its alias is " +
					"Joh.", "John", 43, 21, true),
	ACTS("Acts", "Ac", "Acts tells about what the apostles did after Jesus' ascension into Heaven, " +
			"including the starting of the Christian church, proclaiming the Gospel to Gentiles, and Paul's " +
			"journeys and difficulties. It was written by Luke and has 28 chapters.", "Its alias is Ac.",
			"Luke", 44, 28, true),
	ROMANS("Romans", "Rom", "Ro", "Romans is a letter written to the believers in Rome about the " +
			"fundamentals of faith, God's sovereignty, and holy living. It was written by Paul and has " +
			"16 chapters.", "Its aliases are Rom and Ro.", "Paul", 45, 16, true),
	CORINTHIANS1("1Corinthians", "1Cor", "1Co", "1 Corinthians is a letter written to the church in Corinth " +
			"about difficulties and confusion in the church along with the resurrection. It was written by " +
			"Paul and has 16 chapters.", "Its aliases are 1 Cor and 1 Co.", "Paul", 46, 16, true),
	CORINTHIANS2("2Corinthians", "2Cor", "2Co", "2 Corinthians is a letter written to the church in Corinth " +
			"about being an apostle, preaching the Gospel, and testing your faith. It was written by Paul " +
			"and has 13 chapters.", "Its aliases are 2 Cor and 2 Co.", "Paul", 47, 13, true),
	GALATIANS("Galatians", "Gal", "Ga", "Galatians is a letter written by Paul warning about false " +
			"teachers and teaching about salvation, the fruits of the Spirit, and walking by the Spirit. It " +
			"has 6 chapters.", "Its aliases are Gal and Ga.", "Paul", 48, 6, true),
	EPHESIANS("Ephesians", "Eph", "Ephesians is a letter written by Paul while he was in prison about being " +
			"chosen by God, living as a servant of God, and the armor of God. It has 6 chapters.",
			"Its alias is Eph.", "Paul", 49, 6, true),
	PHILIPPIANS("Philippians", "Phili", "Php", "Philippians is a letter written by Paul while he was in " +
			"prison about joy through suffering, the humanity of Jesus, and joy in Christ. It has 4 chapters.",
			"Its aliases are Phili and Php.", "Paul", 50, 4, true),
	COLOSSIANS("Colossians", "Col", "Colossians is a letter written by Paul while he was in prison about " +
			"the divinity of Jesus, holy living, and focusing on God. It has 4 chapters.",
			"Its alias is Col.", "Paul", 51, 4, true),
	THESSALONIANS1("1Thessalonians", "1Thes", "1Th", "1 Thessalonians is a letter written by Paul about " +
			"faith, hope, love, the Second Coming, continual prayer, and examining the spirits. It has 5 " +
			"chapters.", "Its aliases are 1 Thes and 1 Th.", "Paul", 52, 5, true),
	THESSALONIANS2("2Thessalonians", "2Thes", "2Th", "2 Thessalonians is a letter written by Paul about " +
			"the Second Coming, perseverance through persecution, and signs of the end times. It has 3 " +
			"chapters.", "Its aliases are 2 Thes and 2 Th.", "Paul", 53, 3, true),
	TIMOTHY1("1Timothy", "1Tim", "1Ti", "1 Timothy is a letter written by Paul about fighting the good " +
			"fight, salvation, church leadership, and relationships within the church. It has 6 chapters.",
			"Its aliases are 1 Tim and 1 Ti.", "Paul", 54, 6, true),
	TIMOTHY2("2Timothy", "2Tim", "2Ti", "2 Timothy is a letter written by Paul about remaining faithful, " +
			"endurance through persecution, and being a preacher of the Gospel. It has 4 chapters.",
			"Its aliases are 2 Tim and 2 Ti.", "Paul", 55, 4, true),
	TITUS("Titus", "Tit", "Titus is a letter written by Paul about qualifications for church leaders, holy " +
			"living, and salvation. It has 3 chapters.", "Its alias is Tit.", "Paul", 56, 3, true),
	PHILEMON("Philemon", "Phile", "Phm", "Philemon is a letter written by Paul while he was in prison to " +
			"Philemon for forgiveness for Philemon's slave, Onesimus, who ran away and accepted Christ. It " +
			"has 1 chapter.", "Its aliases are Phil and Phm.", "Paul", 57, 1, true),
	HEBREWS("Hebrews", "Heb", "Hebrews is a letter written by an anonymous author about Jesus being God, " +
			"the New Covenant as being better than the Old Testament, and the power of faith. It has 13 " +
			"chapters.", "Its alias is Heb.", "Unknown", 58, 13, true),
	JAMES("James", "Jas", "James is a letter written by James about testing your faith, putting your faith " +
			"into action, works being evidence of faith, and submitting to God. It has 5 chapters.",
			"Its alias is Jas.", "James", 59, 5, true),
	PETER1("1Peter", "1Pe", "1 Peter is a letter written by Peter about holy living, serving God, and being " +
			"alert to deception. It has 5 chapters.", "Its alias is 1 Pe.", "Peter", 60, 5, true),
	PETER2("2Peter", "2Pe", "2 Peter is a letter written by Peter about the truth of the Gospel and the " +
			"end times. It has 3 chapters.", "Its alias is 2 Pe.", "Peter", 61, 3, true),
	JOHN1("1John", "1Jo", "1 John teaches about how to discern true teachers, the love of God, and " +
			"overcoming faith. It was written by John and has 5 chapters.", "Its alias is 1 Jo.", "John", 62,
			5, true),
	JOHN2("2John", "2Jo", "2 John teaches about focusing on Jesus Christ and not following false teachers. " +
			"It was written by John and has 1 chapter.", "Its alias is 2 Jo.", "John", 63, 1, true),
	JOHN3("3John", "3Jo", "3 John teaches about loving God and other people by walking in the truth. It " +
			"was written by John and has 1 chapter.", "Its alias is 3 Jo.", "John", 64, 1, true),
	JUDE("Jude", "Jude warns us to avoid false teachers and remember the words of the prophets. It was " +
			"written by Jude and has 1 chapter.", "It has no alias.", "Jude", 65, 1, true),
	REVELATION("Revelation", "Rev", "Re", "Revelation is a book of prophecy about what will happen in the " +
			"future concerning the end times. It was written by John and has 22 chapters.", "Its aliases " +
			"are Rev and Re.", "John", 66, 22, true);
	
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
