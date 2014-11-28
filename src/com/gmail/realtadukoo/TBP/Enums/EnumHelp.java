package com.gmail.realtadukoo.TBP.Enums;

public enum EnumHelp {
	TABLEOFCONTENTS(1, "toc", "toc", "toc", "toc", "nextPage", 1, false, "toc", "toc1", "tableofcontents",
			"toc", "tocs"),
	TABLEOFCONTENTS1(1, "toc", "toc", "toc", "toc", "nextPage", 1, false, "tableofcontents1", "tocs1"),
	TABLEOFCONTENTS2(2, "toc", "toc", "toc", "toc", "nextPage", 2, false, "toc2", "tableofcontents2", "tocs2"),
	TABLEOFCONTENTS3(3, "toc", "toc", "toc", "toc", "nextPage", 3, false, "toc3", "tableofcontents3", "tocs3"),
	TABLEOFCONTENTS4(4, "toc", "toc", "toc", "toc", "nextPage", 4, false, "toc4", "tableofcontents4", "tocs4"),
	TABLEOFCONTENTS5(5, "toc", "toc", "toc", "toc", "nextPage", 5, false, "toc5", "tableofcontents5", "tocs5"),
	TABLEOFCONTENTS6(6, "toc", "toc", "toc", "toc", "nextPage", 6, true, "toc6", "tableofcontents6", "tocs6"),
	READ(7, "read", "read.description", "read.aliases", "read.usage", "nextPageSpec", 1, false, "read",
			"readverse", "verseread", "readv", "vread"),
	READ1(7, "read", "read.description", "read.usage", "read.aliases", "nextPageSpec", 1, false, "bible",
			"/bible", "readverse1", "verseread1", "readv1"),
	READ1A(7, "read", "read.description", "read.aliases", "read.usage", "nextPageSpec", 1, false, "vread1",
			"bible1", "/bible1", "read1"),
	READ2(8, "read", "read.altusage", "read.defaults", "read.permission", "nextPageSpec", 2, false, "read2",
			"readv2", "vread2", "bible2", "/bible2"),
	READ3(9, "read", "read.replace1", "read.replace2", "read.replace3", "read.replace4", 3, true, "read3",
			"readv3", "vread3", "bible3", "/bible3"),
	SEND(10, "send", "send.description", "send.usage", "send.aliases", "nextPageSpec", 1, false, "send",
			"sendverse", "versesend", "giveverse", "versegive"),
	SEND1(10, "send", "send.description", "send.usage", "send.aliases", "nextPageSpec", 1, false, "sendv",
			"vsend", "givev", "vgive", "sendverse1"),
	SEND1A(10, "send", "send.description", "send.usage", "send.aliases", "nextPageSpec", 1, false, "versesend1",
			"giveverse1", "versegive1", "sendv1", "vsend1"),
	SEND1B(10, "send", "send.description", "send.usage", "send.aliases", "nextPageSpec", 1, false, "givev1",
			"vgive1", "send1"),
	SEND2(11, "send", "send.permission", "send.altusage", "send.anonynote", "send.bypassnote", 2, true, 
			"sendverse2", "versesend2", "giveverse2", "versegive2", "sendv2"),
	SEND2A(11, "send", "send.permission", "send.altusage", "send.anonynote", "send.bypassnote", 2, true, 
			"vsend2", "givev2", "vgive2", "send2"),
	PREVIOUS(12, "prev", "prev.description", "prev.usage", "prev.aliases", "nextPageSpec", 1, false,
			"previous", "pre", "prev", "back", "before"),
	PREVIOUS1(12, "prev", "prev.description", "prev.usage", "prev.aliases", "nextPageSpec", 1, false, "b4",
			"pre1", "prev1", "back1", "before1"),
	PREVIOUS1A(12, "prev", "prev.description", "prev.usage", "prev.aliases", "nextPageSpec", 1, false, "b41",
			"previous1"),
	PREVIOUS2(13, "prev", "prev.permission", "prev.warning", "", "", 2, true, "pre2", "prev2", "back2",
			"before2", "b42"),
	PREVIOUS2A(13, "prev", "prev.permission", "prev.warning", "", "", 2, true, "previous2"),
	NEXT(14, "next", "next.description", "next.usage", "next.aliases", "nextPageSpec", 1, false, "next",
			"forward", "for", "after", "aft"),
	NEXT1(14, "next", "next.description", "next.usage", "next.aliases", "nextPageSpec", 1, false, "nextverse",
			"versenext", "nextv", "vnext", "forward1"),
	NEXT1A(14, "next", "next.description", "next.usage", "next.aliases", "nextPageSpec", 1, false, "for1",
			"after1", "aft1", "nextverse1", "versenext1"),
	NEXT1B(14, "next", "next.description", "next.usage", "next.aliases", "nextPageSpec", 1, false, "nextv1",
			"vnext1", "next1"),
	NEXT2(15, "next", "next.permission", "next.warning", "", "", 2, true, "forward2", "for2", "after2", "aft2",
			"nextverse2"),
	NEXT2A(15, "next", "next.permission", "next.warning", "", "", 2, true, "versenext2", "nextv2", "vnext2",
			"next2"),
	LAST(16, "last", "last.description", "last.usage", "last.aliases", "last.permission", 1, true, "last",
			"saved", "save", "load", "lastverse"),
	LAST1(16, "last", "last.description", "last.usage", "last.aliases", "last.permission", 1, true, 
			"verselast", "lastv", "vlast", "versesaved", "savedverse"),
	LAST1A(16, "last", "last.description", "last.usage", "last.aliases", "last.permission", 1, true, "vsaved",
			"savedv", "vsave", "versesave", "loadverse"),
	LAST1B(16, "last", "last.description", "last.usage", "last.aliases", "last.permission", 1, true,
			"verseload", "vload", "loadv", "saved1", "save1"),
	LAST1C(16, "last", "last.description", "last.usage", "last.aliases", "last.permission", 1, true, "load1",
			"lastverse1", "verselast1", "lastv1", "vlast1"),
	LAST1D(16, "last", "last.description", "last.usage", "last.aliases", "last.permission", 1, true,
			"versesaved1", "savedverse1", "vsaved1", "savedv1", "vsave1"),
	LAST1E(16, "last", "last.description", "last.usage", "last.aliases", "last.permission", 1, true,
			"versesave1", "loadverse1", "verseload1", "vload1", "loadv1"),
	LAST1F(16, "last", "last.description", "last.usage", "last.aliases", "last.permission", 1, true, "last1"),
	FAVORITE(17, "favorite", "favorite.description", "favorite.usage", "favorite.aliases", "nextPageSpec", 1,
			false, "fav", "favor", "like", "favoriteverse", "versefavorite"),
	FAVORITE1(17, "favorite", "favorite.description", "favorite.usage", "favorite.aliases", "nextPageSpec", 1,
			false, "favorite1", "favverse", "versefav", "favorverse", "versefavor"),
	FAVORITE1A(17, "favorite", "favorite.description", "favorite.usage", "favorite.aliases", "nextPageSpec", 
			1, false, "likeverse", "verselike", "favoritev", "vfavorite", "favv"),
	FAVORITE1B(17, "favorite", "favorite.description", "favorite.usage", "favorite.aliases", "nextPageSpec", 
			1, false, "vfav", "favorv", "vfavor", "likev", "vlike"),
	FAVORITE1C(17, "favorit1", "favorite.description", "favorite.usage", "favorite.aliases", "nextPageSpec", 
			1, false, "fav1", "favor1", "like1", "favoriteverse1", "versefavorite1"),
	FAVORITE1D(17, "favorite", "favorite.description", "favorite.usage", "favorite.aliases", "nextPageSpec", 
			1, false, "favverse1", "versefav1", "favorverse1", "versefavor1", "likeverse1"),
	FAVORITE1E(17, "favorite", "favorite.description", "favorite.usage", "favorite.aliases", "nextPageSpec", 
			1, false, "verselike1", "favoritev1", "vfavorite1", "favv1", "vfav1"),
	FAVORITE1F(17, "favorite", "favorite.description", "favorite.usage", "favorite.aliases", "nextPageSpec", 
			1, false, "favorv1", "vfavor1", "likev1", "vlike1"),
	FAVORITE2(18, "favorite", "favorite.permission", "favorite.note", "", "", 2, true, "fav2", "favor2", 
			"like2", "favoriteverse2", "versefavorite2"),
	FAVORITE2A(18, "favorite", "favorite.permission", "favorite.note", "", "", 2, true, "favverse2", 
			"versefav2", "favorverse2", "versefavor2", "likeverse2"),
	FAVORITE2B(18, "favorite", "favorite.permission", "favorite.note", "", "", 2, true, "verselike2", 
			"favoritev2", "vfavorite2", "favv2", "vfav2"),
	FAVORITE2C(18, "favorite", "favorite.permission", "favorite.note", "", "", 2, true, "favorv2", "vfavor2", 
			"likev2", "vlike2", "favorite2"),
	RANDOM(19, "rand", "rand.description", "rand.usage", "rand.aliases", "nextPageSpec", 1, false, "random",
			"rand", "randomverse", "randomv", "verserandom"),
	RANDOM1(19, "rand", "rand.description", "rand.usage", "rand.aliases", "nextPageSpec", 1, false, "vrandom",
			"randverse", "randv", "verserand", "vrand"),
	RANDOM1A(19, "rand", "rand.description", "rand.usage", "rand.aliases", "nextPageSpec", 1, false, "rand1",
			"randomverse1", "randomv1", "verserandom1", "vrandom1"),
	RANDOM1B(19, "rand", "rand.description", "rand.usage", "rand.aliases", "nextPageSpec", 1, false, 
			"randverse1", "randv1", "verserand1", "vrand1", "random1"),
	RANDOM2(20, "rand", "rand.permission", "rand.note", "", "", 2, true, "rand2", "randomverse2", "randomv2",
			"verserandom2", "vrandom2"),
	RANDOM2A(20, "rand", "rand.permission", "rand.note", "", "", 2, true, "randverse2", "randv2", "verserand2",
			"vrand2", "random2"),
	GETBOOK(21, "getb", "getb.description", "getb.usage", "getb.aliases", "nextPageSpec", 1, false, "getbook",
			"book", "bookget", "getbible", "bibleget"),
	GETBOOK1(21, "getb", "getb.description", "getb.usage", "getb.aliases", "nextPageSpec", 1, false, "book1",
			"bookget1", "getbible1", "bibleget1", "getbook1"),
	GETBOOK1A(21, "getb", "getb.description", "getb.usage", "getb.aliases", "nextPageSpec", 1, false, "getb",
			"bget", "getb1", "bget1"),
	GETBOOK2(22, "getb", "getb.defaults", "getb.permission", "getb.note", "nextPageSpec", 2, false, "book2",
			"bookget2", "getbible2", "bibleget2", "getbook2"),
	GETBOOK2A(22, "getb", "getb.defaults", "getb.permission", "getb.note", "nextPageSpec", 2, false, "getb2",
			"bget2"),
	GETBOOK3(23, "getb", "getb.note2", "getb.note3", "getb.note4", "nextPageSpec", 3, false, "book3",
			"bookget3", "getbible3", "bibleget3", "getbook3"),
	GETBOOK3A(23, "getb", "getb.note2", "getb.note3", "getb.note4", "nextPageSpec", 3, false, "getb3",
			"bget3"),
	GETBOOK4(24, "getb", "getb.note5", "getb.note6", "getb.note7", "", 4, true, "book4", "bookget4",
			"getbible4", "bibleget4", "getbook4"),
	GETBOOK4A(24, "getb", "getb.note5", "getb.note6", "getb.note7", "", 4, true, "getb4", "bget4"),
	SENDBOOK(25, "sendb", "sendb.description", "sendb.usage", "sendb.aliases", "nextPageSpec", 1, false,
			"sendbook", "booksend", "sendbible", "biblesend", "givebook"),
	SENDBOOK1(25, "sendb", "sendb.description", "sendb.usage", "sendb.aliases", "nextPageSpec", 1, false,
			"bookgive", "biblegive", "givebible", "booksend1", "sendbible1"),
	SENDBOOK1A(25, "sendb", "sendb.description", "sendb.usage", "sendb.aliases", "nextPageSpec", 1, false,
			"biblesend1", "givebook1", "bookgive1", "biblegive1", "givebible1"),
	SENDBOOK1B(25, "sendb", "sendb.description", "sendb.usage", "sendb.aliases", "nextPageSpec", 1, false,
			"sendbook1", "sendb", "bsend", "giveb", "bgive"),
	SENDBOOK1C(25, "sendb", "sendb.description", "sendb.usage", "sendb.aliases", "nextPageSpec", 1, false,
			"sendb1", "bsend1", "giveb1", "bgive1"),
	SENDBOOK2(26, "sendb", "sendb.defaults", "sendb.permission", "sendb.note", "nextPageSpec", 2, false,
			"booksend2", "sendbible2", "biblesend2", "givebook2", "bookgive2"),
	SENDBOOK2A(26, "sendb", "sendb.defaults", "sendb.permission", "sendb.note", "nextPageSpec", 2, false,
			"biblegive2", "givebible2", "sendbook2", "sendb2", "bsend2"),
	SENDBOOK2B(26, "sendb", "sendb.defaults", "sendb.permission", "sendb.note", "nextPageSpec", 2, false,
			"giveb2", "bgive2"),
	SENDBOOK3(27, "sendb", "sendb.anonynote", "sendb.bypassnote", "", "", 3, true, "booksend3", "sendbible3", 
			"biblesend3", "givebook3", "bookgive3"),
	SENDBOOK3A(27, "sendb", "sendb.anonynote", "sendb.bypassnote", "", "", 3, true, "biblegive3", "givebible3",
			"sendbook3", "sendb3", "bsend3"),
	SENDBOOK3B(27, "sendb", "sendb.anonynote", "sendb.bypassnote", "", "", 3, true, "giveb3", "bgive3"),
	INFO(28, "info", "info.description", "info.usage", "info.aliases", "nextPageSpec", 1, false, "info",
			"about", "abt", "information", "about1"),
	INFO1(28, "info", "info.description", "info.usage", "info.aliases", "nextPageSpec", 1, false, "abt1",
			"information1", "info1"),
	INFO2(29, "info", "info.note", "info.note2", "info.note3", "nextPageSpec", 2, false, "about2", "abt2",
			"information2", "info2"),
	INFO3(30, "info", "info.note4", "info.note5", "", "", 3, true, "about3", "abt3", "information3", "info3"),
	PLUGIN(31, "plugin", "plugin.description", "plugin.usage", "plugin.aliases", "plugin.permission", 1, true,
			"plugin", "TB", "TadukooBible", "TadukooBibleinfo", "plugininfo"),
	PLUGIN1(31, "plugin", "plugin.description", "plugin.usage", "plugin.aliases", "plugin.permission", 1, true,
			"TB1", "TadukooBible1", "TadukooBibleinfo1", "plugininfo1", "plugin1"),
	BOOKS(32, "books", "books.description", "books.usage", "books.aliases", "nextPageSpec", 1, false, "books",
			"bookslist", "listbooks", "booklist", "bookslist1"),
	BOOKS1(32, "books", "books.description", "books.usage", "books.aliases", "nextPageSpec", 1, false,
			"listbooks1", "booklist1", "books1"),
	BOOKS2(33, "books", "books.permission", "books.note", "", "", 2, true, "bookslist2", "listbooks2",
			"booklist2", "books2"),
	TRANSLATION(34, "tran", "tran.description", "tran.usage", "tran.aliases", "tran.permission", 1, true,
			"translation", "translations", "translist", "translationslist", "listtrans"),
	TRANSLATION1(34, "tran", "tran.description", "tran.usage", "tran.aliases", "tran.permission", 1, true,
			"tran", "trans", "translationinfo", "translationsinfo", "transinfo"),
	TRANSLATION1A(34, "tran", "tran.description", "tran.usage", "tran.aliases", "tran.permission", 1, true,
			"traninfo", "translations1", "translist1", "translationslist1", "listtrans1"),
	TRANSLATION1B(34, "tran", "tran.description", "tran.usage", "tran.aliases", "tran.permission", 1, true,
			"tran1", "trans1", "translationinfo1", "translationsinfo1", "transinfo1"),
	TRANSLATION1C(34, "tran", "tran.description", "tran.usage", "tran.aliases", "tran.permission", 1, true,
			"traninfo1", "translation1"),
	PERMISSION(35, "perm", "perm.description", "perm.usage", "perm.aliases", "perm.permission", 1, true, 
			"permission", "perms", "permission1", "perm1", "perms1"),
	CONFIG(36, "config", "config.description", "config.usage", "config.aliases", "nextPageSpec", 1, false,
			"config", "configuration", "settings", "set", "options"),
	CONFIG1(36, "config", "config.description", "config.usage", "config.aliases", "nextPageSpec", 1, false,
			"configuration1", "settings1", "set1", "options1", "config1"),
	CONFIG2(37, "config", "config.permission", "config.note", "config.note2", "", 2, true, "configuration2",
			"settings2", "set2", "options2", "config2"),
	ANNOUNCE(38, "ann", "ann.description", "ann.usage", "ann.aliases", "nextPageSpec", 1, false, "announce",
			"ann", "broadcast", "broad", "shout"),
	ANNOUNCE1(38, "ann", "ann.description", "ann.usage", "ann.aliases", "nextPageSpec", 1, false, "yell",
			"ann1", "broadcast1", "broad1", "shout1"),
	ANNOUNCE1A(38, "ann", "ann.description", "ann.usage", "ann.aliases", "nextPageSpec", 1, false, "yell1",
			"announce1"),
	ANNOUNCE2(39, "ann", "ann.permission", "ann.altusage", "ann.note", "", 2, true, "ann2", "broadcast2", 
			"broad2", "shout2", "yell2"),
	ANNOUNCE2A(39, "ann", "ann.permission", "ann.altusage", "ann.note", "", 2, true, "announce2");
	
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
		if(!max){
			int i = minor;
			boolean cont = true;
			String test;
			while(cont){
				test = title + i;
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
