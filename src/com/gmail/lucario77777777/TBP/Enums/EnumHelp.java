package com.gmail.lucario77777777.TBP.Enums;

public enum EnumHelp {
	TABLEOFCONTENTS(1, "toc", "toc", "toc", "toc", "nextPage", 1, false, "toc", "toc1", "tableofcontents",
			"toc", "tocs"),
	TABLEOFCONTENTS1(1, "toc", "toc", "toc", "toc", "nextPage", 1, false, "tableofcontents1", "tocs1"),
	TABLEOFCONTENTS2(2, "toc", "toc", "toc", "toc", "nextPage", 2, false, "toc2", "tableofcontents2", "tocs2"),
	TABLEOFCONTENTS3(3, "toc", "toc", "toc", "toc", "nextPage", 3, false, "toc3", "tableofcontents3", "tocs3"),
	TABLEOFCONTENTS4(4, "toc", "toc", "toc", "toc", "nextPage", 4, false, "toc4", "tableofcontents4", "tocs4"),
	TABLEOFCONTENTS5(5, "toc", "toc", "toc", "nextPage", "", 5, true, "toc5", "tableofcontents5", "tocs5"),
	READ(6, "read", "read.description", "read.aliases", "read.usage", "nextPageSpec", 1, false, "read",
			"readverse", "verseread", "readv", "vread"),
	READ1(6, "read", "read.description", "read.usage", "read.aliases", "nextPageSpec", 1, false, "bible",
			"/bible", "readverse1", "verseread1", "readv1"),
	READ1A(6, "read", "read.description", "read.aliases", "read.usage", "nextPageSpec", 1, false, "vread1",
			"bible1", "/bible1", "read1"),
	READ2(7, "read", "read.altusage", "read.defaults", "read.permission", "nextPageSpec", 2, false, "read2",
			"readv2", "vread2", "bible2", "/bible2"),
	READ3(8, "read", "read.replace1", "read.replace2", "read.replace3", "read.replace4", 3, true, "read3",
			"readv3", "vread3", "bible3", "/bible3"),
	SEND(9, "send", "send.description", "send.usage", "send.aliases", "nextPageSpec", 1, false, "send",
			"sendverse", "versesend", "giveverse", "versegive"),
	SEND1(9, "send", "send.description", "send.usage", "send.aliases", "nextPageSpec", 1, false, "sendv",
			"vsend", "givev", "vgive", "sendverse1"),
	SEND1A(9, "send", "send.description", "send.usage", "send.aliases", "nextPageSpec", 1, false, "versesend1",
			"giveverse1", "versegive1", "sendv1", "vsend1"),
	SEND1B(9, "send", "send.description", "send.usage", "send.aliases", "nextPageSpec", 1, false, "givev1",
			"vgive1", "send1"),
	SEND2(10, "send", "send.permission", "send.altusage", "send.anonynote", "", 2, true, "sendverse2",
			"versesend2", "giveverse2", "versegive2", "sendv2"),
	SEND2A(10, "send", "send.permission", "send.altusage", "send.anonynote", "", 2, true, "vsend2", "givev2",
			"vgive2", "send2"),
	PREVIOUS(11, "prev", "prev.description", "prev.usage", "prev.aliases", "nextPageSpec", 1, false,
			"previous", "pre", "prev", "back", "before"),
	PREVIOUS1(11, "prev", "prev.description", "prev.usage", "prev.aliases", "nextPageSpec", 1, false, "b4",
			"pre1", "prev1", "back1", "before1"),
	PREVIOUS1A(11, "prev", "prev.description", "prev.usage", "prev.aliases", "nextPageSpec", 1, false, "b41",
			"previous1"),
	PREVIOUS2(12, "prev", "prev.permission", "prev.warning", "", "", 2, true, "pre2", "prev2", "back2",
			"before2", "b42"),
	PREVIOUS2A(12, "prev", "prev.permission", "prev.warning", "", "", 2, true, "previous2"),
	NEXT(13, "next", "next.description", "next.usage", "next.aliases", "nextPageSpec", 1, false, "next",
			"forward", "for", "after", "aft"),
	NEXT1(13, "next", "next.description", "next.usage", "next.aliases", "nextPageSpec", 1, false, "nextverse",
			"versenext", "nextv", "vnext", "forward1"),
	NEXT1A(13, "next", "next.description", "next.usage", "next.aliases", "nextPageSpec", 1, false, "for1",
			"after1", "aft1", "nextverse1", "versenext1"),
	NEXT1B(13, "next", "next.description", "next.usage", "next.aliases", "nextPageSpec", 1, false, "nextv1",
			"vnext1", "next1"),
	NEXT2(14, "next", "next.permission", "next.warning", "", "", 2, true, "forward2", "for2", "after2", "aft2",
			"nextverse2"),
	NEXT2A(14, "next", "next.permission", "next.warning", "", "", 2, true, "versenext2", "nextv2", "vnext2",
			"next2"),
	LAST(15, "last", "last.description", "last.usage", "last.aliases", "last.permission", 1, true, "last",
			"saved", "save", "load", "lastverse"),
	LAST1(15, "last", "last.description", "last.usage", "last.aliases", "last.permission", 1, true, 
			"verselast", "lastv", "vlast", "versesaved", "savedverse"),
	LAST1A(15, "last", "last.description", "last.usage", "last.aliases", "last.permission", 1, true, "vsaved",
			"savedv", "vsave", "versesave", "loadverse"),
	LAST1B(15, "last", "last.description", "last.usage", "last.aliases", "last.permission", 1, true,
			"verseload", "vload", "loadv", "saved1", "save1"),
	LAST1C(15, "last", "last.description", "last.usage", "last.aliases", "last.permission", 1, true, "load1",
			"lastverse1", "verselast1", "lastv1", "vlast1"),
	LAST1D(15, "last", "last.description", "last.usage", "last.aliases", "last.permission", 1, true,
			"versesaved1", "savedverse1", "vsaved1", "savedv1", "vsave1"),
	LAST1E(15, "last", "last.description", "last.usage", "last.aliases", "last.permission", 1, true,
			"versesave1", "loadverse1", "verseload1", "vload1", "loadv1"),
	LAST1F(15, "last", "last.description", "last.usage", "last.aliases", "last.permission", 1, true, "last1"),
	RANDOM(16, "rand", "rand.description", "rand.usage", "rand.aliases", "nextPageSpec", 1, false, "random",
			"rand", "randomverse", "randomv", "verserandom"),
	RANDOM1(16, "rand", "rand.description", "rand.usage", "rand.aliases", "nextPageSpec", 1, false, "vrandom",
			"randverse", "randv", "verserand", "vrand"),
	RANDOM1A(16, "rand", "rand.description", "rand.usage", "rand.aliases", "nextPageSpec", 1, false, "rand1",
			"randomverse1", "randomv1", "verserandom1", "vrandom1"),
	RANDOM1B(16, "rand", "rand.description", "rand.usage", "rand.aliases", "nextPageSpec", 1, false, 
			"randverse1", "randv1", "verserand1", "vrand1", "random1"),
	RANDOM2(17, "rand", "rand.permission", "rand.note", "", "", 2, true, "rand2", "randomverse2", "randomv2",
			"verserandom2", "vrandom2"),
	RANDOM2A(17, "rand", "rand.permission", "rand.note", "", "", 2, true, "randverse2", "randv2", "verserand2",
			"vrand2", "random2"),
	GETBOOK(18, "getb", "getb.description", "getb.usage", "getb.aliases", "nextPageSpec", 1, false, "getbook",
			"book", "bookget", "getbible", "bibleget"),
	GETBOOK1(18, "getb", "getb.description", "getb.usage", "getb.aliases", "nextPageSpec", 1, false, "book1",
			"bookget1", "getbible1", "bibleget1", "getbook1"),
	GETBOOK1A(18, "getb", "getb.description", "getb.usage", "getb.aliases", "nextPageSpec", 1, false, "getb",
			"bget", "getb1", "bget1"),
	GETBOOK2(19, "getb", "getb.defaults", "getb.permission", "getb.note", "nextPageSpec", 2, false, "book2",
			"bookget2", "getbible2", "bibleget2", "getbook2"),
	GETBOOK2A(19, "getb", "getb.defaults", "getb.permission", "getb.note", "nextPageSpec", 2, false, "getb2",
			"bget2"),
	GETBOOK3(20, "getb", "getb.note2", "getb.note3", "getb.note4", "nextPageSpec", 3, false, "book3",
			"bookget3", "getbible3", "bibleget3", "getbook3"),
	GETBOOK3A(20, "getb", "getb.note2", "getb.note3", "getb.note4", "nextPageSpec", 3, false, "getb3",
			"bget3"),
	GETBOOK4(21, "getb", "getb.note5", "getb.note6", "getb.note7", "", 4, true, "book4", "bookget4",
			"getbible4", "bibleget4", "getbook4"),
	GETBOOK4A(21, "getb", "getb.note5", "getb.note6", "getb.note7", "", 4, true, "getb4", "bget4"),
	SENDBOOK(22, "sendb", "sendb.description", "sendb.usage", "sendb.aliases", "nextPageSpec", 1, false,
			"sendbook", "booksend", "sendbible", "biblesend", "givebook"),
	SENDBOOK1(22, "sendb", "sendb.description", "sendb.usage", "sendb.aliases", "nextPageSpec", 1, false,
			"bookgive", "biblegive", "givebible", "booksend1", "sendbible1"),
	SENDBOOK1A(22, "sendb", "sendb.description", "sendb.usage", "sendb.aliases", "nextPageSpec", 1, false,
			"biblesend1", "givebook1", "bookgive1", "biblegive1", "givebible1"),
	SENDBOOK1B(22, "sendb", "sendb.description", "sendb.usage", "sendb.aliases", "nextPageSpec", 1, false,
			"sendbook1", "sendb", "bsend", "giveb", "bgive"),
	SENDBOOK1C(22, "sendb", "sendb.description", "sendb.usage", "sendb.aliases", "nextPageSpec", 1, false,
			"sendb1", "bsend1", "giveb1", "bgive1"),
	SENDBOOK2(23, "sendb", "sendb.defaults", "sendb.permission", "sendb.note", "sendb.anonynote", 2, true,
			"booksend2", "sendbible2", "biblesend2", "givebook2", "bookgive2"),
	SENDBOOK2A(23, "sendb", "sendb.defaults", "sendb.permission", "sendb.note", "sendb.anonynote", 2, true,
			"biblegive2", "givebible2", "sendbook2", "sendb2", "bsend2"),
	SENDBOOK2B(23, "sendb", "sendb.defaults", "sendb.permission", "sendb.note", "sendb.anonynote", 2, true,
			"giveb2", "bgive2"),
	INFO(24, "info", "info.description", "info.usage", "info.aliases", "nextPageSpec", 1, false, "info",
			"about", "abt", "information", "about1"),
	INFO1(24, "info", "info.description", "info.usage", "info.aliases", "nextPageSpec", 1, false, "abt1",
			"information1", "info1"),
	INFO2(25, "info", "info.note", "info.note2", "info.note3", "nextPageSpec", 2, false, "about2", "abt2",
			"information2", "info2"),
	INFO3(26, "info", "info.note4", "info.note5", "", "", 3, true, "about3", "abt3", "information3", "info3"),
	PLUGIN(27, "plugin", "plugin.description", "plugin.usage", "plugin.aliases", "plugin.permission", 1, true,
			"plugin", "TB", "TadukooBible", "TadukooBibleinfo", "plugininfo"),
	PLUGIN1(27, "plugin", "plugin.description", "plugin.usage", "plugin.aliases", "plugin.permission", 1, true,
			"TB1", "TadukooBible1", "TadukooBibleinfo1", "plugininfo1", "plugin1"),
	BOOKS(28, "books", "", "", "", "", 1, false, "books", "bookslist", "listbooks", "booklist", "bookslist1"),
	BOOKS1(28, "books", "", "", "", "", 1, false, "listbooks1", "booklist1", "books1"),
	BOOKS2(29, "books", "", "", "", "", 2, true, "bookslist2", "listbooks2", "booklist2", "books2"),
	TRANSLATION(30, "tran", "", "", "", "", 1, true, "translation", "translations", "translist", "translationslist", 
			"listtrans"),
	TRANSLATION1(30, "tran", "", "", "", "", 1, true, "tran", "trans", "translationinfo", "translationsinfo", "transinfo"),
	TRANSLATION1A(30, "tran", "", "", "", "", 1, true, "traninfo", "translations1", "translist1", "translationslist1", 
			"listtrans1"),
	TRANSLATION1B(30, "tran", "", "", "", "", 1, true, "tran1", "trans1", "translationinfo1", "translationsinfo1",
			"transinfo1"),
	TRANSLATION1C(30, "tran", "", "", "", "", 1, true, "traninfo1", "translation1"),
	CONFIG(30, "config", "", "", "", "", 1, false, "config", "configuration", "settings", "set", "options"),
	CONFIG1(30, "config", "", "", "", "", 1, false, "configuration1", "settings1", "set1", "options1", "config1"),
	CONFIG2(31, "config", "", "", "", "", 2, true, "configuration2", "settings2", "set2", "options2", "config2"),
	ANNOUNCE(32, "ann", "", "", "", "", 1, false, "announce", "ann", "broadcast", "broad", "shout"),
	ANNOUNCE1(32, "ann", "", "", "", "", 1, false, "yell", "ann1", "broadcast1", "broad1", "shout1"),
	ANNOUNCE1A(32, "ann", "", "", "", "", 1, false, "yell1", "announce1"),
	ANNOUNCE2(33, "ann", "", "", "", "", 2, true, "ann2", "broadcast2", "broad2", "shout2", "yell2"),
	ANNOUNCE2A(33, "ann", "", "", "", "", 2, true, "announce2");
	
	private int num;
	private String title;
	private int minor;
	private boolean max;
	private String line1;
	private String line2;
	private String line3;
	private String line4;
	private String alias;
	private String alias2;
	private String alias3;
	private String alias4;
	private String alias5;
	
	private EnumHelp(int num, String title, String line1, String line2, String line3, String line4, int minor,
			boolean max, String alias){
		this.num = num;
		this.title = title;
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.line4 = line4;
		this.minor = minor;
		this.max = max;
		this.alias = alias;
	}
	
	private EnumHelp(int num, String title, String line1, String line2, String line3, String line4, int minor,
			boolean max, String alias, String alias2){
		this.num = num;
		this.title = title;
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.line4 = line4;
		this.minor = minor;
		this.max = max;
		this.alias = alias;
		this.alias2 = alias2;
	}
	
	private EnumHelp(int num, String title, String line1, String line2, String line3, String line4, int minor,
			boolean max, String alias, String alias2, String alias3){
		this.num = num;
		this.title = title;
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.line4 = line4;
		this.minor = minor;
		this.max = max;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
	}
	
	private EnumHelp(int num, String title, String line1, String line2, String line3, String line4, int minor,
			boolean max, String alias, String alias2, String alias3, String alias4){
		this.num = num;
		this.title = title;
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.line4 = line4;
		this.minor = minor;
		this.max = max;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
	}
	
	private EnumHelp(int num, String title, String line1, String line2, String line3, String line4, int minor,
			boolean max, String alias, String alias2, String alias3, String alias4, String alias5){
		this.num = num;
		this.title = title;
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.line4 = line4;
		this.minor = minor;
		this.max = max;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.alias5 = alias5;
	}
	
	public String getTitle(){
		return title;
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
			if(title.contains("1")){
				temp = title.replace("1", "");
			}else if(title.contains("2")){
				temp = title.replace("2", "");
				i = 2;
			}else if(title.contains("3")){
				temp = title.replace("3", "");
				i = 3;
			}else if(title.contains("4")){
				temp = title.replace("4", "");
				i = 4;
			}else if(title.contains("5")){
				temp = title.replace("5", "");
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
	
	public String getLine1(){
		return line1;
	}
	
	public String getLine2(){
		return line2;
	}
	
	public String getLine3(){
		return line3;
	}
	
	public String getLine4(){
		return line4;
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
	
	public EnumHelp fromString(String page) {
		if (page != null) {
			for (EnumHelp c : EnumHelp.values()) {
				if (page.equalsIgnoreCase(String.valueOf(c.getNum())) || page.equalsIgnoreCase(c.getAlias())
						|| page.equalsIgnoreCase(c.getAlias2()) || page.equalsIgnoreCase(c.getAlias3()) 
						|| page.equalsIgnoreCase(c.getAlias4()) || page.equalsIgnoreCase(c.getAlias5())) {
					return c;
				}
			}
		}
		return null;
	}
}
