package com.gmail.lucario77777777.TBP.Enums;

public enum EnumHelp {
	TABLEOFCONTENTS("toc1", "1", "one", "1st", "first", "tableofcontents", "toc", "tocs"),
	TABLEOFCONTENTS1("toc1", "1", "tableofcontents1", "tocs1"),
	TABLEOFCONTENTS2("toc2", "2", "two", "2nd", "second", "tableofcontents2", "tocs2"),
	TABLEOFCONTENTS3("toc3", "3", "three", "3rd", "third", "tableofcontents3", "tocs3"),
	TABLEOFCONTENTS4("toc4", "4", "four", "4th", "fourth", "tableofcontents4", "tocs4"),
	READ("read1", "5", "five", "5th", "fifth", "read", "readverse", "verseread", "readv", "vread", "bible", 
			"/bible"),
	READ1("read1", "5", "readverse1", "verseread1", "readv1", "vread1", "bible1", "/bible1"),
	READ2("read2", "6", "six", "6th", "sixth", "readv2", "vread2", "bible2", "/bible2"),
	READ3("read3", "7", "seven", "7th", "seventh", "readv3", "vread3", "bible3", "/bible3"),
	PREVIOUS("previous1", "8", "eight", "8th", "eighth", "previous", "pre", "prev", "back", "before", "b4", 
			"pre1"),
	PREVIOUS1("previous1", "8", "prev1", "back1", "before1", "b41"),
	NEXT("next1", "9", "nine", "9th", "ninth", "next", "forward", "for", "after", "aft", "nextverse", 
			"versenext"),
	NEXT1("next1", "9", "nextv", "vnext", "forward1", "for1", "after1", "aft1", "nextverse1", "versenext1",
			"nextv1", "vnext1"),
	LAST("last1", "10", "ten", "10th", "tenth", "last", "saved", "save", "load", "lastverse", "verselast",
			"lastv"),
	LAST1("last1", "10", "vlast", "versesaved", "savedverse", "vsaved", "savedv", "vsave", "versesave", 
			"loadverse", "verseload", "vload"),
	LAST1A("last1", "10", "loadv", "saved1", "save1", "load1", "lastverse1", "verselast1", "lastv1", 
			"vlast1", "versesaved1", "savedverse1"),
	LAST1B("last1", "10", "vsaved1", "savedv1", "vsave1", "versesave1", "loadverse1", "verseload1", "vload1",
			"loadv1"),
	RANDOM("random1", "11", "eleven", "11th", "eleventh", "random", "rand", "randomverse", "randomv", 
			"verserandom", "vrandom", "randverse"),
	RANDOM1("random1", "11", "randv", "verserand", "vrand", "rand1", "randomverse1", "randomv1",
			"verserandom1", "vrandom1", "randverse1", "randv1"),
	RANDOM1A("random1", "11", "verserand1", "vrand1"),
	RANDOM2("random2", "12", "twelve", "12th", "twelfth", "rand2", "randomverse2", "randomv2", "verserandom2",
			"vrandom2", "randverse2", "randv2"),
	RANDOM2A("random2", "12", "verserand2", "vrand2"),
	GETBOOK("getbook1", "13", "thirteen", "13th", "thirteenth", "getbook", "book", "bookget", "getbible",
			"bibleget", "book1", "bookget1"),
	GETBOOK1("getbook1", "13", "getbible1", "bibleget1"),
	GETBOOK2("getbook2", "14", "fourteen", "14th", "fourteenth", "book2", "bookget2", "getbible2",
			"bibleget2"),
	GETBOOK3("getbook3", "15", "fifteen", "15th", "fifteenth", "book3", "bookget3", "getbible3", "bibleget3"),
	SENDBOOK("sendbook1", "16", "sixteen", "16th", "sixteenth", "sendbook", "booksend", "sendbible",
			"biblesend", "givebook", "bookgive", "biblegive"),
	SENDBOOK1("sendbook1", "16", "givebible", "booksend1", "sendbible1", "biblesend1", "givebook1",
			"bookgive1", "biblegive1", "givebible1"),
	SENDBOOK2("sendbook2", "17", "seventeen", "17th", "seventeenth", "booksend2", "sendbible2", "biblesend2",
			"givebook2", "bookgive2", "biblegive2", "givebible2"),
	INFO("info1", "18", "eighteen", "18th", "eighteenth", "info", "about", "abt", "information", "about1",
			"abt1", "information1"),
	BOOKS("books1", "19", "nineteen", "19th", "nineteenth", "books", "bookslist", "listbooks", "booklist",
			"bookslist1", "listbooks1", "booklist1"),
	TRANSLATIONS("translations1", "20", "twenty", "20th", "twentieth", "translations", "translist",
			"translationslist", "listtrans", "tran", "trans", "translist1"),
	TRANSLATIONS1("translations1", "20", "translationslist1", "listtrans1", "tran1", "trans1"),
	CONFIG("config1", "21", "twentyone", "21st", "twentyfirst", "config", "configuration", "settings", "set",
			"options", "configuration1", "settings1"),
	CONFIG1("config1", "21", "set1", "options1"),
	ANNOUNCE("announce1", "22", "twentytwo", "22nd", "twentysecond", "announce", "ann", "broadcast", "broad",
			"shout", "yell", "ann1"),
	ANNOUNCE1("announce1", "22", "broadcast1", "broad1", "shout1", "yell1");
	
	private String page;
	private String num;
	private String alias;
	private String alias2;
	private String alias3;
	private String alias4;
	private String alias5;
	private String alias6;
	private String alias7;
	private String alias8;
	private String alias9;
	private String alias10;
	
	private EnumHelp(String page, String num, String alias){
		this.page = page;
		this.num = num;
		this.alias = alias;
	}
	
	private EnumHelp(String page, String num, String alias, String alias2){
		this.page = page;
		this.num = num;
		this.alias = alias;
		this.alias2 = alias2;
	}
	
	private EnumHelp(String page, String num, String alias, String alias2, String alias3){
		this.page = page;
		this.num = num;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
	}
	
	private EnumHelp(String page, String num, String alias, String alias2, String alias3, String alias4){
		this.page = page;
		this.num = num;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
	}
	
	private EnumHelp(String page, String num, String alias, String alias2, String alias3, String alias4, 
			String alias5){
		this.page = page;
		this.num = num;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.alias5 = alias5;
	}
	
	private EnumHelp(String page, String num, String alias, String alias2, String alias3, String alias4, 
			String alias5, String alias6){
		this.page = page;
		this.num = num;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.alias5 = alias5;
		this.alias6 = alias6;
	}
	
	private EnumHelp(String page, String num, String alias, String alias2, String alias3, String alias4, 
			String alias5, String alias6, String alias7){
		this.page = page;
		this.num = num;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.alias5 = alias5;
		this.alias6 = alias6;
		this.alias7 = alias7;
	}
	
	private EnumHelp(String page, String num, String alias, String alias2, String alias3, String alias4, 
			String alias5, String alias6, String alias7, String alias8){
		this.page = page;
		this.num = num;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.alias5 = alias5;
		this.alias6 = alias6;
		this.alias7 = alias7;
		this.alias8 = alias8;
	}
	
	private EnumHelp(String page, String num, String alias, String alias2, String alias3, String alias4, 
			String alias5, String alias6, String alias7, String alias8, String alias9){
		this.page = page;
		this.num = num;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.alias5 = alias5;
		this.alias6 = alias6;
		this.alias7 = alias7;
		this.alias8 = alias8;
		this.alias9 = alias9;
	}
	
	private EnumHelp(String page, String num, String alias, String alias2, String alias3, String alias4, 
			String alias5, String alias6, String alias7, String alias8, String alias9, String alias10){
		this.page = page;
		this.num = num;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.alias5 = alias5;
		this.alias6 = alias6;
		this.alias7 = alias7;
		this.alias8 = alias8;
		this.alias9 = alias9;
		this.alias10 = alias10;
	}
	
	public String getPage(){
		return page;
	}
	
	public String getNum(){
		return num;
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
	
	public String getAlias4(){
		return alias4;
	}
	
	public String getAlias5(){
		return alias5;
	}
	
	public String getAlias6(){
		return alias6;
	}
	
	public String getAlias7(){
		return alias7;
	}
	
	public String getAlias8(){
		return alias8;
	}
	
	public String getAlias9(){
		return alias9;
	}
	
	public String getAlias10(){
		return alias10;
	}
	
	public EnumHelp fromString(String page) {
		if (page != null) {
			for (EnumHelp c : EnumHelp.values()) {
				if (page.equalsIgnoreCase(c.getPage()) || page.equalsIgnoreCase(c.getNum())
						|| page.equalsIgnoreCase(c.getAlias()) || page.equalsIgnoreCase(c.getAlias2()) 
						|| page.equalsIgnoreCase(c.getAlias3()) || page.equalsIgnoreCase(c.getAlias4()) 
						|| page.equalsIgnoreCase(c.getAlias5()) || page.equalsIgnoreCase(c.getAlias6())
						|| page.equalsIgnoreCase(c.getAlias7()) || page.equalsIgnoreCase(c.getAlias8())
						|| page.equalsIgnoreCase(c.getAlias9()) || page.equalsIgnoreCase(c.getAlias10())) {
					return c;
				}
			}
		}
		return null;
	}
}
