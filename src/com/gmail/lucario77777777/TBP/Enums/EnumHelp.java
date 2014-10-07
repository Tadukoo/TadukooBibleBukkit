package com.gmail.lucario77777777.TBP.Enums;

public enum EnumHelp {
	TABLEOFCONTENTS(1, "toc1", 1, false, "tableofcontents", "toc", "tocs"),
	TABLEOFCONTENTS1(1, "toc1", 1, false, "tableofcontents1", "tocs1"),
	TABLEOFCONTENTS2(2, "toc2", 2, false, "tableofcontents2", "tocs2"),
	TABLEOFCONTENTS3(3, "toc3", 3, false, "tableofcontents3", "tocs3"),
	TABLEOFCONTENTS4(4, "toc4", 4, false, "tableofcontents4", "tocs4"),
	TABLEOFCONTENTS5(5, "toc5", 5, true, "tableofcontents5", "tocs5"),
	READ(6, "read1", 1, false, "read", "readverse", "verseread", "readv", "vread", "bible", "/bible",
			"readverse1", "verseread1", "readv1"),
	READ1(6, "read1", 1, false, "vread1", "bible1", "/bible1"),
	READ2(7, "read2", 2, false, "readv2", "vread2", "bible2", "/bible2"),
	READ3(8, "read3", 3, true, "readv3", "vread3", "bible3", "/bible3"),
	SEND(9, "send1", 1, false, "send", "sendverse", "versesend", "giveverse", "versegive", "sendv", "vsend",
			"givev", "vgive", "sendverse1"),
	SEND1(9, "send1", 1, false, "versesend1", "giveverse1", "versegive1", "sendv1", "vsend1", "givev1",
			"vgive1"),
	SEND2(10, "send2", 2, true, "sendverse2", "versesend2", "giveverse2", "versegive2", "sendv2", "vsend2",
			"givev2", "vgive2"),
	PREVIOUS(11, "previous1", 1, false, "previous", "pre", "prev", "back", "before", "b4", "pre1", "prev1",
			"back1", "before1"),
	PREVIOUS1(11, "previous1", 1, false, "b41"),
	PREVIOUS2(12, "previous2", 2, true, "pre2", "prev2", "back2", "before2", "b42"),
	NEXT(13, "next1", 1, false, "next", "forward", "for", "after", "aft", "nextverse", "versenext", "nextv",
			"vnext", "forward1"),
	NEXT1(13, "next1", 1, false, "for1", "after1", "aft1", "nextverse1", "versenext1", "nextv1", "vnext1"),
	NEXT2(14, "next2", 2, true, "forward2", "for2", "after2", "aft2", "nextverse2", "versenext2", "nextv2",
			"vnext2"),
	LAST(15, "last1", 1, true, "last", "saved", "save", "load", "lastverse", "verselast", "lastv", "vlast", 
			"versesaved", "savedverse"),
	LAST1(15, "last1", 1, true, "vsaved", "savedv", "vsave", "versesave", "loadverse", "verseload", "vload",
			"loadv", "saved1", "save1"),
	LAST1A(15, "last1", 1, true, "load1", "lastverse1", "verselast1", "lastv1", "vlast1", "versesaved1",
			"savedverse1", "vsaved1", "savedv1", "vsave1"),
	LAST1B(15, "last1", 1, true, "versesave1", "loadverse1", "verseload1", "vload1", "loadv1"),
	RANDOM(16, "random1", 1, false, "random", "rand", "randomverse", "randomv", "verserandom", "vrandom",
			"randverse", "randv", "verserand", "vrand"),
	RANDOM1(16, "random1", 1, false, "rand1", "randomverse1", "randomv1", "verserandom1", "vrandom1",
			"randverse1", "randv1", "verserand1", "vrand1"),
	RANDOM2(17, "random2", 2, true, "rand2", "randomverse2", "randomv2", "verserandom2", "vrandom2",
			"randverse2", "randv2", "verserand2", "vrand2"),
	GETBOOK(18, "getbook1", 1, false, "getbook", "book", "bookget", "getbible", "bibleget", "book1",
			"bookget1", "getbible1", "bibleget1"),
	GETBOOK2(19, "getbook2", 2, false, "book2", "bookget2", "getbible2", "bibleget2"),
	GETBOOK3(20, "getbook3", 3, true, "book3", "bookget3", "getbible3", "bibleget3"),
	SENDBOOK(21, "sendbook1", 1, false, "sendbook", "booksend", "sendbible", "biblesend", "givebook",
			"bookgive", "biblegive", "givebible", "booksend1", "sendbible1"),
	SENDBOOK1(21, "sendbook1", 1, false, "biblesend1", "givebook1", "bookgive1", "biblegive1", "givebible1"),
	SENDBOOK2(22, "sendbook2", 2, true, "booksend2", "sendbible2", "biblesend2", "givebook2", "bookgive2",
			"biblegive2", "givebible2"),
	INFO(23, "info1", 1, false, "info", "about", "abt", "information", "about1", "abt1", "information1"),
	INFO2(24, "info2", 2, true, "about2", "abt2", "information2"),
	PLUGIN(25, "plugin1", 1, true, "plugin", "TB", "TadukooBible", "TadukooBibleinfo", "plugininfo", "TB1", 
			"TadukooBible1", "TadukooBibleinfo1", "plugininfo1"),
	BOOKS(26, "books1", 1, true, "books", "bookslist", "listbooks", "booklist", "bookslist1", "listbooks1",
			"booklist1"),
	TRANSLATION(27, "translation1", 1, true, "translation", "translations", "translist", "translationslist",
			"listtrans", "tran", "trans", "translationinfo", "translationsinfo", "transinfo"),
	TRANSLATION1(27, "translation1", 1, true, "traninfo", "translations1", "translist1", "translationslist1", 
			"listtrans1", "tran1", "trans1", "translationinfo1", "translationsinfo1", "transinfo1"),
	TRANSLATION1A(27, "translation1", 1, true, "traninfo1"),
	CONFIG(28, "config1", 1, true, "config", "configuration", "settings", "set", "options", "configuration1",
			"settings1", "set1", "options1"),
	ANNOUNCE(29, "announce1", 1, true, "announce", "ann", "broadcast", "broad", "shout", "yell", "ann1", 
			"broadcast1", "broad1", "shout1"),
	ANNOUNCE1(29, "announce1", 1, true, "yell1");
	
	private int num;
	private String page;
	private int minor;
	private boolean max;
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
	
	private EnumHelp(int num, String page, int minor, boolean max, String alias){
		this.num = num;
		this.page = page;
		this.minor = minor;
		this.max = max;
		this.alias = alias;
	}
	
	private EnumHelp(int num, String page, int minor, boolean max, String alias, String alias2){
		this.num = num;
		this.page = page;
		this.minor = minor;
		this.max = max;
		this.alias = alias;
		this.alias2 = alias2;
	}
	
	private EnumHelp(int num, String page, int minor, boolean max, String alias, String alias2, String alias3){
		this.num = num;
		this.page = page;
		this.minor = minor;
		this.max = max;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
	}
	
	private EnumHelp(int num, String page, int minor, boolean max, String alias, String alias2, String alias3,
			String alias4){
		this.num = num;
		this.page = page;
		this.minor = minor;
		this.max = max;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
	}
	
	private EnumHelp(int num, String page, int minor, boolean max, String alias, String alias2, String alias3,
			String alias4, String alias5){
		this.num = num;
		this.page = page;
		this.minor = minor;
		this.max = max;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.alias5 = alias5;
	}
	
	private EnumHelp(int num, String page, int minor, boolean max, String alias, String alias2, String alias3,
			String alias4, String alias5, String alias6){
		this.num = num;
		this.page = page;
		this.minor = minor;
		this.max = max;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.alias5 = alias5;
		this.alias6 = alias6;
	}
	
	private EnumHelp(int num, String page, int minor, boolean max, String alias, String alias2, String alias3,
			String alias4, String alias5, String alias6, String alias7){
		this.num = num;
		this.page = page;
		this.minor = minor;
		this.max = max;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.alias5 = alias5;
		this.alias6 = alias6;
		this.alias7 = alias7;
	}
	
	private EnumHelp(int num, String page, int minor, boolean max, String alias, String alias2, String alias3,
			String alias4, String alias5, String alias6, String alias7, String alias8){
		this.num = num;
		this.page = page;
		this.minor = minor;
		this.max = max;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.alias5 = alias5;
		this.alias6 = alias6;
		this.alias7 = alias7;
		this.alias8 = alias8;
	}
	
	private EnumHelp(int num, String page, int minor, boolean max, String alias, String alias2, String alias3,
			String alias4, String alias5, String alias6, String alias7, String alias8, String alias9){
		this.num = num;
		this.page = page;
		this.minor = minor;
		this.max = max;
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
	
	private EnumHelp(int num, String page, int minor, boolean max, String alias, String alias2, String alias3,
			String alias4, String alias5, String alias6, String alias7, String alias8, String alias9, 
			String alias10){
		this.num = num;
		this.page = page;
		this.minor = minor;
		this.max = max;
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
	
	public int getMinor(){
		return minor;
	}
	
	public int getMax(){
		if(max){
			return minor;
		}else{
			String temp = "";
			int i = 1;
			if(page.contains("1")){
				temp = page.replace("1", "");
			}else if(page.contains("2")){
				temp = page.replace("2", "");
				i = 2;
			}else if(page.contains("3")){
				temp = page.replace("3", "");
				i = 3;
			}else if(page.contains("4")){
				temp = page.replace("4", "");
				i = 4;
			}else if(page.contains("5")){
				temp = page.replace("5", "");
				i = 5;
			}
			boolean cont = true;
			String test;
			while(cont){
				test = temp + i;
				if(fromString(test).max){
					cont = false;
					return fromString(test).minor;
				}else if(i > 10){
					cont = false;
					return 0;
				}else{
					i++;
				}
			}
		}
		return minor;
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
