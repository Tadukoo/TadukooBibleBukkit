package com.gmail.lucario77777777.TBP.Enums;

import com.gmail.lucario77777777.TBP.TB;

public enum EnumChps {
	GENESIS("Genesis", 1, 31, 25, 24, 26, 32, 22, 24, 22, 29, 32),
	GENESIS2("Genesis", 2, 32, 20, 18, 24, 21, 16, 27, 33, 38, 18),
	GENESIS3("Genesis", 3, 34, 24, 20, 67, 34, 35, 46, 22, 35, 43),
	GENESIS4("Genesis", 4, 55, 32, 20, 31, 29, 43, 36, 30, 23, 23),
	GENESIS5("Genesis", 5, 57, 38, 34, 34, 28, 34, 31, 22, 33, 26),
	EXODUS("Exodus", 1, 22, 25, 22, 31, 23, 30, 25, 32, 35, 29),
	EXODUS2("Exodus", 2, 10, 51, 22, 31, 27, 36, 16, 27, 25, 26),
	EXODUS3("Exodus", 3, 36, 31, 33, 18, 40, 37, 21, 43, 46, 38),
	EXODUS4("Exodus", 4, 18, 35, 23, 35, 35, 38, 29, 31, 43, 38),
	LEVITICUS("Leviticus", 1, 17, 16, 17, 35, 19, 30, 38, 36, 24, 20),
	LEVITICUS2("Leviticus", 2, 47, 8, 59, 57, 33, 34, 16, 30, 37, 27),
	LEVITICUS3("Leviticus", 3, 24, 33, 44, 23, 55, 46, 34),
	NUMBERS("Numbers", 1, 54, 34, 51, 49, 31, 27, 89, 26, 23, 36),
	NUMBERS2("Numbers", 2, 35, 16, 33, 45, 41, 50, 13, 32, 22, 29),
	NUMBERS3("Numbers", 3, 35, 41, 30, 25, 18, 65, 23, 31, 40, 16),
	NUMBERS4("Numbers", 4, 54, 42, 56, 29, 34, 13),
	DEUTERONOMY("Deuteronomy", 1, 46, 37, 29, 49, 33, 25, 26, 20, 29, 22),
	DEUTERONOMY2("Deuteronomy", 2, 32, 32, 18, 29, 23, 22, 20, 22, 21, 20),
	DEUTERONOMY3("Deuteronomy", 3, 23, 30, 25, 22, 19, 19, 26, 68, 29, 20),
	DEUTERONOMY4("Deuteronomy", 4, 30, 52, 29, 12),
	JOSHUA("Joshua", 1, 0),
	JOSHUA2("Joshua", 2, 0),
	JOSHUA3("Joshua", 3, 0),
	JUDGES("Judges", 1, 0),
	JUDGES2("Judges", 2, 0),
	JUDGES3("Judges", 3, 0),
	RUTH("Ruth", 1, 0),
	SAMUEL1ST("1Samuel", 1, 0),
	SAMUEL1ST2("1Samuel", 2, 0),
	SAMUEL1ST3("1Samuel", 3, 0),
	SAMUEL1ST4("1Samuel", 4, 0),
	SAMUEL2ND("2Samuel", 1, 0),
	SAMUEL2ND2("2Samuel", 2, 0),
	SAMUEL2ND3("2Samuel", 3, 0),
	KINGS1ST("1Kings", 1, 0),
	KINGS1ST2("1Kings", 2, 0),
	KINGS1ST3("1Kings", 3, 0),
	KINGS2ND("2Kings", 1, 0),
	KINGS2ND2("2Kings", 2, 0),
	KINGS2ND3("2Kings", 3, 0),
	CHRONICLES1ST("1Chronicles", 1, 0),
	CHRONICLES1ST2("1Chronicles", 2, 0),
	CHRONICLES1ST3("1Chronicles", 3, 0),
	CHRONICLES2ND("2Chronicles", 1, 0),
	CHRONICLES2ND2("2Chronicles", 2, 0),
	CHRONICLES2ND3("2Chronicles", 3, 0),
	CHRONICLES2ND4("2Chronicles", 4, 0),
	EZRA("Ezra", 1, 0),
	NEHEMIAH("Nehemiah", 1, 0),
	NEHEMIAH2("Nehemiah", 2, 0),
	ESTHER("Esther", 1, 0),
	JOB("Job", 1, 0),
	JOB2("Job", 2, 0),
	JOB3("Job", 3, 0),
	JOB4("Job", 4, 0),
	JOB5("Job", 5, 0),
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
	PROVERBS("Proverbs", 1, 33, 22, 35, 27, 23, 35, 27, 36, 18, 32),
	PROVERBS2("Proverbs", 2, 31, 28, 25, 35, 33, 33, 28, 24, 29, 30),
	PROVERBS3("Proverbs", 3, 31, 29, 35, 34, 28, 28, 27, 28, 27, 33),
	PROVERBS4("Proverbs", 4, 31),
	ECCLESIASTES("Ecclesiastes", 1, 0),
	ECCLESIASTES2("Ecclesiastes", 2, 0),
	SONGOFSONGS("SongofSongs", 1, 0),
	ISAIAH("Isaiah", 1, 0),
	ISAIAH2("Isaiah", 2, 0),
	ISAIAH3("Isaiah", 3, 0),
	ISAIAH4("Isaiah", 4, 0),
	ISAIAH5("Isaiah", 5, 0),
	ISAIAH6("Isaiah", 6, 0),
	ISAIAH7("Isaiah", 7, 0),
	JEREMIAH("Jeremiah", 1, 0),
	JEREMIAH2("Jeremiah", 2, 0),
	JEREMIAH3("Jeremiah", 3, 0),
	JEREMIAH4("Jeremiah", 4, 0),
	JEREMIAH5("Jeremiah", 5, 0),
	JEREMIAH6("Jeremiah", 6, 0),
	LAMENTATIONS("Lamentations", 1, 0),
	EZEKIEL("Ezekiel", 1, 0),
	EZEKIEL2("Ezekiel", 2, 0),
	EZEKIEL3("Ezekiel", 3, 0),
	EZEKIEL4("Ezekiel", 4, 0),
	EZEKIEL5("Ezekiel", 5, 0),
	DANIEL("Daniel", 1, 0),
	DANIEL2("Daniel", 2, 0),
	HOSEA("Hosea", 1, 0),
	HOSEA2("Hosea", 2, 0),
	JOEL("Joel", 1, 0),
	AMOS("Amos", 1, 0),
	OBADIAH("Obadiah", 1, 0),
	JONAH("Jonah", 1, 0),
	MICAH("Micah", 1, 0),
	NAHUM("Nahum", 1, 0),
	HABAKKUK("Habakkuk", 1, 0),
	ZEPHANIAH("Zephaniah", 1, 0),
	HAGGAI("Haggai", 1, 0),
	ZECHARIAH("Zechariah", 1, 0),
	ZECHARIAH2("Zechariah", 2, 0),
	MALACHI("Malachi", 1, 0),
	MATTHEW("Matthew", 1, 25, 23, 17, 25, 48, 34, 29, 34, 38, 42),
	MATTHEW2("Matthew", 2, 30, 50, 58, 36, 39, 28, 27, 35, 30, 34),
	MATTHEW3("Matthew", 3, 46, 46, 39, 51, 46, 75, 66, 20),
	MARK("Mark", 1, 45, 28, 35, 41, 43, 56, 37, 38, 50, 52),
	MARK2("Mark", 2, 33, 44, 37, 72, 47, 20),
	LUKE("Luke", 1, 80, 52, 38, 44, 39, 49, 50, 56, 62, 42),
	LUKE2("Luke", 2, 54, 59, 35, 35, 32, 31, 37, 43, 48, 47),
	LUKE3("Luke", 3, 38, 71, 56, 53),
	JOHN("John", 1, 51, 25, 36, 54, 47, 71, 53, 59, 41, 42),
	JOHN2("John", 2, 57, 50, 38, 31, 27, 33, 26, 40, 42, 31),
	JOHN3("John", 3, 25),
	ACTS("Acts", 1, 26, 47, 26, 37, 42, 15, 60, 40, 43, 48),
	ACTS2("Acts", 2, 30, 25, 52, 28, 41, 40, 34, 28, 41, 38),
	ACTS3("Acts", 3, 40, 30, 35, 27, 27, 32, 44, 31),
	ROMANS("Romans", 1, 32, 29, 31, 25, 21, 23, 25, 39, 33, 21),
	ROMANS2("Romans", 2, 36, 21, 14, 23, 33, 27),
	CORINTHIANS1ST("1Corinthians", 1, 31, 16, 23, 21, 13, 20, 40, 13, 27, 33),
	CORINTHIANS1ST2("1Corinthians", 2, 34, 31, 13, 40, 58, 24),
	CORINTHIANS2ND("2Corinthians", 1, 24, 17, 18, 18, 21, 18, 16, 24, 15, 18),
	CORINTHIANS2ND2("2Corinthians", 2, 33, 21, 14),
	GALATIANS("Galatians", 1, 24, 21, 29, 31, 26, 18),
	EPHESIANS("Ephesians", 1, 23, 22, 21, 32, 33, 24),
	PHILIPPIANS("Philippians", 1, 30, 30, 21, 23),
	COLOSSIANS("Colossians", 1, 29, 23, 25, 18),
	THESSALONIANS1ST("1Thessalonians", 1, 0),
	THESSALONIANS2ND("2Thessalonians", 1, 0),
	TIMOTHY1ST("1Timothy", 1, 0),
	TIMOTHY2ND("2Timothy", 1, 0),
	TITUS("Titus", 1, 0),
	PHILEMON("Philemon", 1, 0),
	HEBREWS("Hebrews", 1, 0),
	HEBREWS2("Hebrews", 2, 0),
	JAMES("James", 1, 0),
	PETER1ST("1Peter", 1, 0),
	PETER2ND("2Peter", 1, 0),
	JOHN1ST("1John", 1, 10, 29, 24, 21, 21),
	JOHN2ND("2John", 1, 13),
	JOHN3RD("3John", 1, 14),
	JUDE("Jude", 1, 25),
	REVELATION("Revelation", 1, 20, 29, 22, 11, 14, 17, 17, 13, 21, 11),
	REVELATION2("Revelation", 2, 19, 17, 18, 20, 8, 21, 18, 24, 21, 15),
	REVELATION3("Revelation", 3, 27, 21);
	
	private String book;
	private int part;
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
	
	private EnumChps(String book, int part, int chp1){
		this.book = book;
		this.part = part;
		this.chp1 = chp1;
	}
	
	private EnumChps(String book, int part, int chp1, int chp2){
		this.book = book;
		this.part = part;
		this.chp1 = chp1;
		this.chp2 = chp2;
	}
	
	private EnumChps(String book, int part, int chp1, int chp2, int chp3){
		this.book = book;
		this.part = part;
		this.chp1 = chp1;
		this.chp2 = chp2;
		this.chp3 = chp3;
	}
	
	private EnumChps(String book, int part, int chp1, int chp2, int chp3, int chp4){
		this.book = book;
		this.part = part;
		this.chp1 = chp1;
		this.chp2 = chp2;
		this.chp3 = chp3;
		this.chp4 = chp4;
	}
	
	private EnumChps(String book, int part, int chp1, int chp2, int chp3, int chp4, int chp5){
		this.book = book;
		this.part = part;
		this.chp1 = chp1;
		this.chp2 = chp2;
		this.chp3 = chp3;
		this.chp4 = chp4;
		this.chp5 = chp5;
	}
	
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
	
	public EnumChps getDefault(){
		EnumChps defBook = fromString(TB.config.getString("DefaultBook"));
		return defBook;
	}
	
	public String getBook(){
		return book;
	}
	
	public int getPart(){
		return part;
	}
	
	public int getNum(int i){
		EnumChps echp = this;
		if(i > 10 && i <= 20){
			echp = switchChp(this.book, 2);
			i = i - 10;
		}else if(i > 20 && i <= 30){
			echp = switchChp(this.book, 3);
			i = i - 20;
		}else if(i > 30 && i <= 40){
			echp = switchChp(this.book, 4);
			i = i - 30;
		}else if(i > 40 && i <= 50){
			echp = switchChp(this.book, 5);
			i = i - 40;
		}else if(i > 50 && i <= 60){
			echp = switchChp(this.book, 6);
			i = i - 50;
		}else if(i > 60 && i <= 70){
			echp = switchChp(this.book, 7);
			i = i - 60;
		}else if(i > 70 && i <= 80){
			echp = switchChp(this.book, 8);
			i = i - 70;
		}else if(i > 80 && i <= 90){
			echp = switchChp(this.book, 9);
			i = i - 80;
		}else if(i > 90 && i <= 100){
			echp = switchChp(this.book, 10);
			i = i - 90;
		}else if(i > 100 && i <= 110){
			echp = switchChp(this.book, 11);
			i = i - 100;
		}else if(i > 110 && i <= 120){
			echp = switchChp(this.book, 12);
			i = i - 110;
		}else if(i > 120 && i <= 130){
			echp = switchChp(this.book, 13);
			i = i - 120;
		}else if(i > 130 && i <= 140){
			echp = switchChp(this.book, 14);
			i = i - 130;
		}else if(i > 140 && i <= 150){
			echp = switchChp(this.book, 15);
			i = i - 140;
		}
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
			return 0;
		}
	}
	
	public EnumChps switchChp(String command, int i) {
	    if (command != null) {
	      for (EnumChps c : EnumChps.values()) {
	        if (command.equalsIgnoreCase(c.getBook()) && c.getPart() == i) {
	          return c;
	        }
	      }
	    }
	    return null;
	}
	
	public EnumChps fromString(String command) {
	    if (command != null) {
	      for (EnumChps c : EnumChps.values()) {
	        if (command.equalsIgnoreCase(c.getBook()) && c.getPart() == 1) {
	          return c;
	        }
	      }
	    }
	    return null;
	}
}
