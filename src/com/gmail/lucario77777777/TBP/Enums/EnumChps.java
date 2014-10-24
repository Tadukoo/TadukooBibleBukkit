package com.gmail.lucario77777777.TBP.Enums;

import com.gmail.lucario77777777.TBP.TB;

/*
 * This enum is used to look up how many verses are in each chapter of the Bible.
 * Each one defined only has 10 to limit the amount of constructors.
 */

public enum EnumChps {
	//Genesis
	GENESIS("Genesis", 1, 31, 25, 24, 26, 32, 22, 24, 22, 29, 32),
	GENESIS2("Genesis", 2, 32, 20, 18, 24, 21, 16, 27, 33, 38, 18),
	GENESIS3("Genesis", 3, 34, 24, 20, 67, 34, 35, 46, 22, 35, 43),
	GENESIS4("Genesis", 4, 55, 32, 20, 31, 29, 43, 36, 30, 23, 23),
	GENESIS5("Genesis", 5, 57, 38, 34, 34, 28, 34, 31, 22, 33, 26),
	
	//Exodus
	EXODUS("Exodus", 1, 22, 25, 22, 31, 23, 30, 25, 32, 35, 29),
	EXODUS2("Exodus", 2, 10, 51, 22, 31, 27, 36, 16, 27, 25, 26),
	EXODUS3("Exodus", 3, 36, 31, 33, 18, 40, 37, 21, 43, 46, 38),
	EXODUS4("Exodus", 4, 18, 35, 23, 35, 35, 38, 29, 31, 43, 38),
	
	//Leviticus
	LEVITICUS("Leviticus", 1, 17, 16, 17, 35, 19, 30, 38, 36, 24, 20),
	LEVITICUS2("Leviticus", 2, 47, 8, 59, 57, 33, 34, 16, 30, 37, 27),
	LEVITICUS3("Leviticus", 3, 24, 33, 44, 23, 55, 46, 34),
	
	//Numbers
	NUMBERS("Numbers", 1, 54, 34, 51, 49, 31, 27, 89, 26, 23, 36),
	NUMBERS2("Numbers", 2, 35, 16, 33, 45, 41, 50, 13, 32, 22, 29),
	NUMBERS3("Numbers", 3, 35, 41, 30, 25, 18, 65, 23, 31, 40, 16),
	NUMBERS4("Numbers", 4, 54, 42, 56, 29, 34, 13),
	
	//Deuteronomy
	DEUTERONOMY("Deuteronomy", 1, 46, 37, 29, 49, 33, 25, 26, 20, 29, 22),
	DEUTERONOMY2("Deuteronomy", 2, 32, 32, 18, 29, 23, 22, 20, 22, 21, 20),
	DEUTERONOMY3("Deuteronomy", 3, 23, 30, 25, 22, 19, 19, 26, 68, 29, 20),
	DEUTERONOMY4("Deuteronomy", 4, 30, 52, 29, 12),
	
	//Joshua
	JOSHUA("Joshua", 1, 18, 24, 17, 24, 15, 27, 26, 35, 27, 43),
	JOSHUA2("Joshua", 2, 23, 24, 33, 15, 63, 10, 18, 28, 51, 9),
	JOSHUA3("Joshua", 3, 45, 34, 16, 33),
	
	//Judges
	JUDGES("Judges", 1, 36, 23, 31, 24, 31, 40, 25, 35, 57, 18),
	JUDGES2("Judges", 2, 40, 15, 25, 20, 20, 31, 13, 31, 30, 48),
	JUDGES3("Judges", 3, 25),
	
	//Ruth
	RUTH("Ruth", 1, 22, 23, 18, 22),
	
	//1 Samuel
	SAMUEL1ST("1Samuel", 1, 28, 36, 21, 22, 12, 21, 17, 22, 27, 27),
	SAMUEL1ST2("1Samuel", 2, 15, 25, 23, 52, 35, 23, 58, 30, 24, 42),
	SAMUEL1ST3("1Samuel", 3, 15, 23, 29, 22, 44, 25, 12, 25, 11, 31),
	SAMUEL1ST4("1Samuel", 4, 13),
	
	//2 Samuel
	SAMUEL2ND("2Samuel", 1, 27, 32, 39, 12, 25, 23, 29, 18, 13, 19),
	SAMUEL2ND2("2Samuel", 2, 27, 31, 39, 33, 37, 23, 29, 33, 43, 26),
	SAMUEL2ND3("2Samuel", 3, 22, 51, 39, 25),
	
	//1 Kings
	KINGS1ST("1Kings", 1, 53, 46, 28, 34, 18, 38, 51, 66, 28, 29),
	KINGS1ST2("1Kings", 2, 43, 33, 34, 31, 34, 34, 24, 46, 21, 43),
	KINGS1ST3("1Kings", 3, 29, 53),
	
	//2 Kings
	KINGS2ND("2Kings", 1, 18, 25, 27, 44, 27, 33, 20, 29, 37, 36),
	KINGS2ND2("2Kings", 2, 21, 21, 25, 29, 38, 20, 41, 37, 37, 21),
	KINGS2ND3("2Kings", 3, 26, 20, 37, 20, 30),
	
	//1 Chronicles
	CHRONICLES1ST("1Chronicles", 1, 54, 55, 24, 43, 26, 81, 40, 40, 44, 14),
	CHRONICLES1ST2("1Chronicles", 2, 47, 40, 14, 17, 29, 43, 27, 17, 19, 8),
	CHRONICLES1ST3("1Chronicles", 3, 30, 19, 32, 31, 31, 32, 34, 21, 30),
	
	//2 Chronicles
	CHRONICLES2ND("2Chronicles", 1, 17, 18, 17, 22, 14, 42, 22, 18, 31, 19),
	CHRONICLES2ND2("2Chronicles", 2, 23, 16, 22, 15, 19, 14, 19, 34, 11, 37),
	CHRONICLES2ND3("2Chronicles", 3, 20, 12, 21, 27, 28, 23, 9, 27, 36, 27),
	CHRONICLES2ND4("2Chronicles", 4, 21, 33, 25, 33, 27, 23),
	
	//Ezra
	EZRA("Ezra", 1, 11, 70, 13, 24, 17, 22, 28, 36, 15, 44),
	
	//Nehemiah
	NEHEMIAH("Nehemiah", 1, 11, 20, 32, 23, 19, 19, 73, 18, 38, 39),
	NEHEMIAH2("Nehemiah", 2, 36, 47, 31),
	
	//Esther
	ESTHER("Esther", 1, 22, 23, 15, 17, 14, 14, 10, 17, 32, 3),
	
	//Job
	JOB("Job", 1, 22, 13, 26, 21, 27, 30, 21, 22, 35, 22),
	JOB2("Job", 2, 20, 25, 28, 22, 35, 22, 16, 21, 29, 29),
	JOB3("Job", 3, 34, 30, 17, 25, 6, 14, 23, 28, 25, 31),
	JOB4("Job", 4, 40, 22, 33, 37, 16, 33, 24, 41, 30, 24),
	JOB5("Job", 5, 34, 17),
	
	//Psalms
	PSALMS("Psalms", 1, 6, 12, 8, 8, 12, 10, 17, 9, 20, 18),
	PSALMS2("Psalms", 2, 7, 8, 6, 7, 5, 11, 15, 50, 14, 9),
	PSALMS3("Psalms", 3, 13, 31, 6, 10, 22, 12, 14, 9, 11, 12),
	PSALMS4("Psalms", 4, 24, 11, 22, 22, 28, 12, 40, 22, 13, 17),
	PSALMS5("Psalms", 5, 13, 11, 5, 26, 17, 11, 9, 14, 20, 23),
	PSALMS6("Psalms", 6, 19, 9, 6, 7, 23, 13, 11, 11, 17, 12),
	PSALMS7("Psalms", 7, 8, 12, 11, 10, 13, 20, 7, 35, 36, 5),
	PSALMS8("Psalms", 8, 24, 20, 28, 23, 10, 12, 20, 72, 13, 19),
	PSALMS9("Psalms", 9, 16, 8, 18, 12, 13, 17, 7, 18, 52, 17),
	PSALMS10("Psalms", 10, 16, 15, 5, 23, 11, 13, 12, 9, 9, 5),
	PSALMS11("Psalms", 11, 8, 28, 22, 35, 45, 48, 43, 13, 31, 7),
	PSALMS12("Psalms", 12, 10, 10, 9, 8, 18, 19, 2, 29, 176, 7),
	PSALMS13("Psalms", 13, 8, 9, 4, 8, 5, 6, 5, 6, 8, 8),
	PSALMS14("Psalms", 14, 3, 18, 3, 3, 21, 26, 9, 8, 24, 13),
	PSALMS15("Psalms", 15, 10, 7, 12, 15, 21, 10, 20, 14, 9, 6),
	
	//Proverbs
	PROVERBS("Proverbs", 1, 33, 22, 35, 27, 23, 35, 27, 36, 18, 32),
	PROVERBS2("Proverbs", 2, 31, 28, 25, 35, 33, 33, 28, 24, 29, 30),
	PROVERBS3("Proverbs", 3, 31, 29, 35, 34, 28, 28, 27, 28, 27, 33),
	PROVERBS4("Proverbs", 4, 31),
	
	//Ecclesiastes
	ECCLESIASTES("Ecclesiastes", 1, 18, 26, 22, 16, 20, 12, 29, 17, 18, 20),
	ECCLESIASTES2("Ecclesiastes", 2, 10, 14),
	
	//Song of Songs/Solomon
	SONGOFSONGS("SongofSongs", 1, 17, 17, 11, 16, 16, 13, 13, 14),
	
	//Isaiah
	ISAIAH("Isaiah", 1, 0),
	ISAIAH2("Isaiah", 2, 0),
	ISAIAH3("Isaiah", 3, 0),
	ISAIAH4("Isaiah", 4, 0),
	ISAIAH5("Isaiah", 5, 0),
	ISAIAH6("Isaiah", 6, 0),
	ISAIAH7("Isaiah", 7, 0),
	
	//Jeremiah
	JEREMIAH("Jeremiah", 1, 0),
	JEREMIAH2("Jeremiah", 2, 0),
	JEREMIAH3("Jeremiah", 3, 0),
	JEREMIAH4("Jeremiah", 4, 0),
	JEREMIAH5("Jeremiah", 5, 0),
	JEREMIAH6("Jeremiah", 6, 0),
	
	//Lamentations
	LAMENTATIONS("Lamentations", 1, 0),
	
	//Ezekiel
	EZEKIEL("Ezekiel", 1, 0),
	EZEKIEL2("Ezekiel", 2, 0),
	EZEKIEL3("Ezekiel", 3, 0),
	EZEKIEL4("Ezekiel", 4, 0),
	EZEKIEL5("Ezekiel", 5, 0),
	
	//Daniel
	DANIEL("Daniel", 1, 0),
	DANIEL2("Daniel", 2, 0),
	
	//Hosea
	HOSEA("Hosea", 1, 11, 23, 5, 19, 15, 11, 16, 14, 17, 15),
	HOSEA2("Hosea", 2, 12, 14, 16, 9),
	
	//Joel
	JOEL("Joel", 1, 20, 32, 21),
	
	//Amos
	AMOS("Amos", 1, 15, 16, 15, 13, 27, 14, 17, 14, 15),
	
	//Obadiah
	OBADIAH("Obadiah", 1, 21),
	
	//Jonah
	JONAH("Jonah", 1, 17, 10, 10, 11),
	
	//Micah
	MICAH("Micah", 1, 16, 13, 12, 13, 15, 16, 20),
	
	//Nahum
	NAHUM("Nahum", 1, 15, 13, 19),
	
	//Habakkuk
	HABAKKUK("Habakkuk", 1, 17, 20, 19),
	
	//Zephaniah
	ZEPHANIAH("Zephaniah", 1, 18, 15, 20),
	
	//Haggai
	HAGGAI("Haggai", 1, 15, 23),
	
	//Zechariah
	ZECHARIAH("Zechariah", 1, 21, 13, 10, 14, 11, 15, 14, 23, 17, 12),
	ZECHARIAH2("Zechariah", 2, 17, 14, 9, 21),
	
	//Malachi
	MALACHI("Malachi", 1, 14, 17, 18, 6),
	
	//Matthew
	MATTHEW("Matthew", 1, 25, 23, 17, 25, 48, 34, 29, 34, 38, 42),
	MATTHEW2("Matthew", 2, 30, 50, 58, 36, 39, 28, 27, 35, 30, 34),
	MATTHEW3("Matthew", 3, 46, 46, 39, 51, 46, 75, 66, 20),
	
	//Mark
	MARK("Mark", 1, 45, 28, 35, 41, 43, 56, 37, 38, 50, 52),
	MARK2("Mark", 2, 33, 44, 37, 72, 47, 20),
	
	//Luke
	LUKE("Luke", 1, 80, 52, 38, 44, 39, 49, 50, 56, 62, 42),
	LUKE2("Luke", 2, 54, 59, 35, 35, 32, 31, 37, 43, 48, 47),
	LUKE3("Luke", 3, 38, 71, 56, 53),
	
	//John
	JOHN("John", 1, 51, 25, 36, 54, 47, 71, 53, 59, 41, 42),
	JOHN2("John", 2, 57, 50, 38, 31, 27, 33, 26, 40, 42, 31),
	JOHN3("John", 3, 25),
	
	//Acts
	ACTS("Acts", 1, 26, 47, 26, 37, 42, 15, 60, 40, 43, 48),
	ACTS2("Acts", 2, 30, 25, 52, 28, 41, 40, 34, 28, 41, 38),
	ACTS3("Acts", 3, 40, 30, 35, 27, 27, 32, 44, 31),
	
	//Romans
	ROMANS("Romans", 1, 32, 29, 31, 25, 21, 23, 25, 39, 33, 21),
	ROMANS2("Romans", 2, 36, 21, 14, 23, 33, 27),
	
	//1 Corinthians
	CORINTHIANS1ST("1Corinthians", 1, 31, 16, 23, 21, 13, 20, 40, 13, 27, 33),
	CORINTHIANS1ST2("1Corinthians", 2, 34, 31, 13, 40, 58, 24),
	
	//2 Corinthians
	CORINTHIANS2ND("2Corinthians", 1, 24, 17, 18, 18, 21, 18, 16, 24, 15, 18),
	CORINTHIANS2ND2("2Corinthians", 2, 33, 21, 14),
	
	//Galatians
	GALATIANS("Galatians", 1, 24, 21, 29, 31, 26, 18),
	
	//Ephesians
	EPHESIANS("Ephesians", 1, 23, 22, 21, 32, 33, 24),
	
	//Philippians
	PHILIPPIANS("Philippians", 1, 30, 30, 21, 23),
	
	//Colossians
	COLOSSIANS("Colossians", 1, 29, 23, 25, 18),
	
	//1 Thessalonians
	THESSALONIANS1ST("1Thessalonians", 1, 10, 20, 13, 18, 28),
	
	//2 Thessalonians
	THESSALONIANS2ND("2Thessalonians", 1, 12, 17, 18),
	
	//1 Timothy
	TIMOTHY1ST("1Timothy", 1, 20, 15, 16, 16, 25, 21),
	
	//2 Timothy
	TIMOTHY2ND("2Timothy", 1, 18, 26, 17, 22),
	
	//Titus
	TITUS("Titus", 1, 16, 15, 15),
	
	//Philemon
	PHILEMON("Philemon", 1, 25),
	
	//Hebrews
	HEBREWS("Hebrews", 1, 14, 18, 19, 16, 14, 20, 28, 13, 28, 39),
	HEBREWS2("Hebrews", 2, 40, 29, 25),
	
	//James
	JAMES("James", 1, 27, 26, 18, 17, 20),
	
	//1 Peter
	PETER1ST("1Peter", 1, 25, 25, 22, 19, 14),
	
	//2 Peter
	PETER2ND("2Peter", 1, 21, 22, 18),
	
	//1 John
	JOHN1ST("1John", 1, 10, 29, 24, 21, 21),
	
	//2 John
	JOHN2ND("2John", 1, 13),
	
	//3 John
	JOHN3RD("3John", 1, 14),
	
	//Jude
	JUDE("Jude", 1, 25),
	
	//Revelation
	REVELATION("Revelation", 1, 20, 29, 22, 11, 14, 17, 17, 13, 21, 11),
	REVELATION2("Revelation", 2, 19, 17, 18, 20, 8, 21, 18, 24, 21, 15),
	REVELATION3("Revelation", 3, 27, 21);
	
	// Used to identify the book that it's for.
	private String book;
	
	// Used to move between them to find the right chapter if it's above 10.
	private int part;
	
	// Chapters 1 - 10, 11 - 20, 21 - 30, or etc.
	private int chp1;
	private int chp2;
	private int chp3;
	private int chp4;
	private int chp5;
	private int chp6;
	private int chp7;
	private int chp8;
	private int chp9;
	private int chp10;
	
	// Define just 1 chapter.
	private EnumChps(String book, int part, int chp1){
		this.book = book;
		this.part = part;
		this.chp1 = chp1;
	}
	
	// Define 2 chapters.
	private EnumChps(String book, int part, int chp1, int chp2){
		this.book = book;
		this.part = part;
		this.chp1 = chp1;
		this.chp2 = chp2;
	}
	
	// Define 3 chapters.
	private EnumChps(String book, int part, int chp1, int chp2, int chp3){
		this.book = book;
		this.part = part;
		this.chp1 = chp1;
		this.chp2 = chp2;
		this.chp3 = chp3;
	}
	
	// Define 4 chapters.
	private EnumChps(String book, int part, int chp1, int chp2, int chp3, int chp4){
		this.book = book;
		this.part = part;
		this.chp1 = chp1;
		this.chp2 = chp2;
		this.chp3 = chp3;
		this.chp4 = chp4;
	}
	
	// Define 5 chapters.
	private EnumChps(String book, int part, int chp1, int chp2, int chp3, int chp4, int chp5){
		this.book = book;
		this.part = part;
		this.chp1 = chp1;
		this.chp2 = chp2;
		this.chp3 = chp3;
		this.chp4 = chp4;
		this.chp5 = chp5;
	}
	
	// Define 6 chapters.
	private EnumChps(String book, int part, int chp1, int chp2, int chp3, int chp4, int chp5, int chp6){
		this.book = book;
		this.part = part;
		this.chp1 = chp1;
		this.chp2 = chp2;
		this.chp3 = chp3;
		this.chp4 = chp4;
		this.chp5 = chp5;
		this.chp6 = chp6;
	}
	
	// Define 7 chapters.
	private EnumChps(String book, int part, int chp1, int chp2, int chp3, int chp4, int chp5, int chp6, 
			int chp7){
		this.book = book;
		this.part = part;
		this.chp1 = chp1;
		this.chp2 = chp2;
		this.chp3 = chp3;
		this.chp4 = chp4;
		this.chp5 = chp5;
		this.chp6 = chp6;
		this.chp7 = chp7;
	}
	
	// Define 8 chapters.
	private EnumChps(String book, int part, int chp1, int chp2, int chp3, int chp4, int chp5, int chp6, 
			int chp7, int chp8){
		this.book = book;
		this.part = part;
		this.chp1 = chp1;
		this.chp2 = chp2;
		this.chp3 = chp3;
		this.chp4 = chp4;
		this.chp5 = chp5;
		this.chp6 = chp6;
		this.chp7 = chp7;
		this.chp8 = chp8;
	}
	
	// Define 9 chapters.
	private EnumChps(String book, int part, int chp1, int chp2, int chp3, int chp4, int chp5, int chp6, 
			int chp7, int chp8, int chp9){
		this.book = book;
		this.part = part;
		this.chp1 = chp1;
		this.chp2 = chp2;
		this.chp3 = chp3;
		this.chp4 = chp4;
		this.chp5 = chp5;
		this.chp6 = chp6;
		this.chp7 = chp7;
		this.chp8 = chp8;
		this.chp9 = chp9;
	}
	
	// Define all 10 chapters.
	private EnumChps(String book, int part, int chp1, int chp2, int chp3, int chp4, int chp5, int chp6, 
			int chp7, int chp8, int chp9, int chp10){
		this.book = book;
		this.part = part;
		this.chp1 = chp1;
		this.chp2 = chp2;
		this.chp3 = chp3;
		this.chp4 = chp4;
		this.chp5 = chp5;
		this.chp6 = chp6;
		this.chp7 = chp7;
		this.chp8 = chp8;
		this.chp9 = chp9;
		this.chp10 = chp10;
	}
	
	// Get the default book from the config file.
	public EnumChps getDefault(){
		EnumChps defBook = fromString(TB.config.getString("DefaultBook"), 1);
		return defBook;
	}
	
	// Get the book in the specific enum.
	public String getBook(){
		return book;
	}
	
	// Get the part (used to determine whether it's chapters 1 - 10, 11 - 20, or whatever.
	public int getPart(){
		return part;
	}
	
	/*
	 *  Gets the number of verses in a specific chapter. Only works for i <= 150, this limit is due to the 
	 *  book with the most chapters (Psalms) having 150 chapters.
	 */
	public int getNum(int i){
		EnumChps echp = this;
		if(i > 10 && i <= 20){
			// If it's 11 - 20, switch to part 2 and remove 10 from i.
			echp = fromString(this.book, 2);
			i = i - 10;
		}else if(i > 20 && i <= 30){
			// If it's 21 - 30, switch to part 3 and remove 20 from i.
			echp = fromString(this.book, 3);
			i = i - 20;
		}else if(i > 30 && i <= 40){
			// If it's 31 - 40, switch to part 4 and remove 30 from i.
			echp = fromString(this.book, 4);
			i = i - 30;
		}else if(i > 40 && i <= 50){
			// If it's 41 - 50, switch to part 5 and remove 40 from i.
			echp = fromString(this.book, 5);
			i = i - 40;
		}else if(i > 50 && i <= 60){
			// If it's 51 - 60, switch to part 6 and remove 50 from i.
			echp = fromString(this.book, 6);
			i = i - 50;
		}else if(i > 60 && i <= 70){
			// If it's 61 - 70, switch to part 7 and remove 60 from i.
			echp = fromString(this.book, 7);
			i = i - 60;
		}else if(i > 70 && i <= 80){
			// If it's 71 - 80, switch to part 8 and remove 70 from i.
			echp = fromString(this.book, 8);
			i = i - 70;
		}else if(i > 80 && i <= 90){
			// If it's 81 - 90, switch to part 9 and remove 80 from i.
			echp = fromString(this.book, 9);
			i = i - 80;
		}else if(i > 90 && i <= 100){
			// If it's 91 - 100, switch to part 10 and remove 90 from i.
			echp = fromString(this.book, 10);
			i = i - 90;
		}else if(i > 100 && i <= 110){
			// If it's 101 - 110, switch to part 11 and remove 100 from i.
			echp = fromString(this.book, 11);
			i = i - 100;
		}else if(i > 110 && i <= 120){
			// If it's 111 - 120, switch to part 12 and remove 110 from i.
			echp = fromString(this.book, 12);
			i = i - 110;
		}else if(i > 120 && i <= 130){
			// If it's 121 - 130, switch to part 13 and remove 120 from i.
			echp = fromString(this.book, 13);
			i = i - 120;
		}else if(i > 130 && i <= 140){
			// If it's 131 - 140, switch to part 14 and remove 130 from i.
			echp = fromString(this.book, 14);
			i = i - 130;
		}else if(i > 140 && i <= 150){
			// If it's 141 - 150, switch to part 15 and remove 140 from i.
			echp = fromString(this.book, 15);
			i = i - 140;
		}
		// Returns the amount of verses for the specified chapter.
		if(i == 1){
			return echp.chp1;
		}else if(i == 2){
			return echp.chp2;
		}else if(i == 3){
			return echp.chp3;
		}else if(i == 4){
			return echp.chp4;
		}else if(i == 5){
			return echp.chp5;
		}else if(i == 6){
			return echp.chp6;
		}else if(i == 7){
			return echp.chp7;
		}else if(i == 8){
			return echp.chp8;
		}else if(i == 9){
			return echp.chp9;
		}else if(i == 10){
			return echp.chp10;
		}else{
			// This should only happen if something went wrong.
			return 0;
		}
	}
	
	/*
	 *  This is used to switch between the enums, The command is the book name, i is the part number.
	 */
	public EnumChps fromString(String command, int i) {
	    if (command != null) {
	    	for (EnumChps c : EnumChps.values()) {
	    		if(i == 0 && command.equalsIgnoreCase(c.getBook()) && c.getPart() == 1) {
	    			return c;
	    		}else if(command.equalsIgnoreCase(c.getBook()) && c.getPart() == i){
	    			return c;
	    		}
	    	}
	    }
	    return null;
	}
}
