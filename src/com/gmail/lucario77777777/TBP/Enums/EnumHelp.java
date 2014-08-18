package com.gmail.lucario77777777.TBP.Enums;

public enum EnumHelp {
	TABLEOFCONTENTS("toc1", 1, "tableofcontents", "toc", "tocs"),
	TABLEOFCONTENTS1("toc1", 1, "tableofcontents1", "tocs1"),
	TABLEOFCONTENTS2("toc2", 2, "tableofcontents2", "tocs2"),
	TABLEOFCONTENTS3("toc3", 3, "tableofcontents3", "tocs3"),
	TABLEOFCONTENTS4("toc4", 4, "tableofcontents4", "tocs4"),
	TABLEOFCONTENTS5("toc5", 5, "tableofcontents5", "tocs5"),
	READ("read1", 6, "read", "readverse", "verseread", "readv", "vread", "bible", "/bible", "readverse1",
			"verseread1", "readv1"),
	READ1("read1", 6, "vread1", "bible1", "/bible1"),
	READ2("read2", 7, "readv2", "vread2", "bible2", "/bible2"),
	READ3("read3", 8, "readv3", "vread3", "bible3", "/bible3"),
	SEND("send1", 9, "send", "sendverse", "versesend", "giveverse", "versegive", "sendv", "vsend", "givev",
			"vgive", "sendverse1"),
	SEND1("send1", 9, "versesend1", "giveverse1", "versegive1", "sendv1", "vsend1", "givev1", "vgive1"),
	PREVIOUS("previous1", 10, "previous", "pre", "prev", "back", "before", "b4", "pre1", "prev1", "back1",
			"before1"),
	PREVIOUS1("previous1", 10, "b41"),
	NEXT("next1", 11, "next", "forward", "for", "after", "aft", "nextverse", "versenext", "nextv", "vnext",
			"forward1"),
	NEXT1("next1", 11, "for1", "after1", "aft1", "nextverse1", "versenext1", "nextv1", "vnext1"),
	LAST("last1", 12, "last", "saved", "save", "load", "lastverse", "verselast", "lastv", "vlast", 
			"versesaved", "savedverse"),
	LAST1("last1", 12, "vsaved", "savedv", "vsave", "versesave", "loadverse", "verseload", "vload", "loadv",
			"saved1", "save1"),
	LAST1A("last1", 12, "load1", "lastverse1", "verselast1", "lastv1", "vlast1", "versesaved1", "savedverse1",
			"vsaved1", "savedv1", "vsave1"),
	LAST1B("last1", 12, "versesave1", "loadverse1", "verseload1", "vload1", "loadv1"),
	RANDOM("random1", 13, "random", "rand", "randomverse", "randomv", "verserandom", "vrandom", "randverse",
			"randv", "verserand", "vrand"),
	RANDOM1("random1", 13, "rand1", "randomverse1", "randomv1", "verserandom1", "vrandom1", "randverse1",
			"randv1", "verserand1", "vrand1"),
	RANDOM2("random2", 14, "rand2", "randomverse2", "randomv2", "verserandom2", "vrandom2", "randverse2",
			"randv2", "verserand2", "vrand2"),
	GETBOOK("getbook1", 15, "getbook", "book", "bookget", "getbible", "bibleget", "book1", "bookget1",
			"getbible1", "bibleget1"),
	GETBOOK2("getbook2", 16, "book2", "bookget2", "getbible2", "bibleget2"),
	GETBOOK3("getbook3", 17, "book3", "bookget3", "getbible3", "bibleget3"),
	SENDBOOK("sendbook1", 18, "sendbook", "booksend", "sendbible", "biblesend", "givebook", "bookgive",
			"biblegive", "givebible", "booksend1", "sendbible1"),
	SENDBOOK1("sendbook1", 18, "biblesend1", "givebook1", "bookgive1", "biblegive1", "givebible1"),
	SENDBOOK2("sendbook2", 19, "booksend2", "sendbible2", "biblesend2", "givebook2", "bookgive2", "biblegive2",
			"givebible2"),
	INFO("info1", 20, "info", "about", "abt", "information", "about1", "abt1", "information1"),
	INFO2("info2", 21, "about2", "abt2", "information2"),
	PLUGIN("plugin1", 22, "plugin", "TB", "TadukooBible", "TadukooBibleinfo", "plugininfo", "TB1", 
			"TadukooBible1", "TadukooBibleinfo1", "plugininfo1"),
	BOOKS("books1", 23, "books", "bookslist", "listbooks", "booklist", "bookslist1", "listbooks1",
			"booklist1"),
	TRANSLATION("translation1", 24, "translation", "translations", "translist", "translationslist",
			"listtrans", "tran", "trans", "translations1", "translist1", "translationslist1"),
	TRANSLATION1("translation1", 24, "listtrans1", "tran1", "trans1"),
	CONFIG("config1", 25, "config", "configuration", "settings", "set", "options", "configuration1",
			"settings1", "set1", "options1"),
	ANNOUNCE("announce1", 26, "announce", "ann", "broadcast", "broad", "shout", "yell", "ann1", 
			"broadcast1", "broad1", "shout1"),
	ANNOUNCE1("announce1", 26, "yell1");
	
	private String page;
	private int num;
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
	
	private EnumHelp(String page, int num, String alias){
		this.page = page;
		this.num = num;
		this.alias = alias;
	}
	
	private EnumHelp(String page, int num, String alias, String alias2){
		this.page = page;
		this.num = num;
		this.alias = alias;
		this.alias2 = alias2;
	}
	
	private EnumHelp(String page, int num, String alias, String alias2, String alias3){
		this.page = page;
		this.num = num;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
	}
	
	private EnumHelp(String page, int num, String alias, String alias2, String alias3, String alias4){
		this.page = page;
		this.num = num;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
	}
	
	private EnumHelp(String page, int num, String alias, String alias2, String alias3, String alias4, 
			String alias5){
		this.page = page;
		this.num = num;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.alias5 = alias5;
	}
	
	private EnumHelp(String page, int num, String alias, String alias2, String alias3, String alias4, 
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
	
	private EnumHelp(String page, int num, String alias, String alias2, String alias3, String alias4, 
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
	
	private EnumHelp(String page, int num, String alias, String alias2, String alias3, String alias4, 
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
	
	private EnumHelp(String page, int num, String alias, String alias2, String alias3, String alias4, 
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
	
	private EnumHelp(String page, int num, String alias, String alias2, String alias3, String alias4, 
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
	
	public int getNum(){
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
				if (page.equalsIgnoreCase(c.getPage()) || page.equalsIgnoreCase(String.valueOf(c.getNum()))
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
