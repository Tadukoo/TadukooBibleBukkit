package com.gmail.lucario77777777.TBP.Enums;

public enum EnumCmds {
	// Special cases.
	FIRST("1", "verse.read", "one", "first", "1st", true),
	SECOND("2", "verse.read", "one", "second", "2nd", true),
	THIRD("3", "verse.read", "one", "third", "3rd", true),
	SONG("Song", "verse.read", true),
	
	//Actual Commands.
	READ("read", "verse.read", "readverse", "verseread", "readv", "vread", true),
	SEND("send", "verse.send", "sendverse", "versesend", "giveverse", "versegive", "sendv", true),
	SEND2("send", "verse.send", "vsend", "givev", "vgive", true),
	PREVIOUS("previous", "verse.previous", "pre", "prev", "back", "before", "b4", true),
	NEXT("next", "verse.next", "forward", "for", "after", "aft", "nextverse", true),
	NEXT2("next", "verse.next", "versenext", "nextv", "vnext", true),
	LAST("last", "verse.last", "saved", "save", "load", "lastverse", "verselast", true),
	LAST2("last", "verse.last", "lastv", "vlast", "savedverse", "savedverse", "vsaved", true),
	LAST3("last", "verse.last", "savedv", "vsave", "versesave", "loadverse", "verseload", true),
	LAST4("last", "verse.last", "vload", "loadv", true),
	RANDOM("random", "verse.random", "rand", "randomverse", "randomv", "verserandom", "vrandom", true),
	RANDOM2("random", "verse.random", "randverse", "randv", "verserand", "vrand", true),
	GETBOOK("getbook", "book.get", "book", "bookget", "getbible", "bibleget", "bget", true),
	GETBOOK2("getbook", "book.get", "getb", true),
	SENDBOOK("sendbook", "book.send", "booksend", "biblesend", "sendbible", "givebook", "bookgive", true),
	SENDBOOK2("sendbook", "book.send", "biblegive", "givebible", "sendb", "bsend", "giveb", true),
	SENDBOOK3("sendbook", "book.send", "bgive", true),
	INFO("info", "use", "about", "abt", "information", true),
	HELP("help", "info.help", "?", "commands", "commandshelp", "cmds", "cmdshelp", true),
	PLUGIN("plugin", "info.plugin", "TB", "TadukooBible", "TadukooBibleinfo", "plugininfo", true),
	BOOKS("books", "info.book", "bookslist", "listbooks", "booklist", "booksinfo", "bookinfo", true),
	BOOKS2("book", "info.book", "infobooks", "infobook", true),
	TRANSLATION("translation", "info.translation", "translations", "translist", "translationslist", 
			"listtrans", "tran", true),
	TRANSLATION2("translation", "info.translation", "trans", "translationinfo", "translationsinfo",
			"transinfo", "traninfo", true),
	CONFIG("config", "op.config", "configuration", "settings", "set", "options", true),
	ANNOUNCE("announce", "op.announce", "ann", "broadcast", "broad", "shout", "yell", true);
	
	private String cmd;
	
	private String perm;
	
	private String alias;
	
	private String alias2;
	
	private String alias3;
	
	private String alias4;
	
	private String alias5;
	
	private boolean available;
	
	private EnumCmds(String cmd, String perm, boolean available){
		this.cmd = cmd;
		this.perm = perm;
		this.available = available;
	}
	
	private EnumCmds(String cmd, String perm, String alias, boolean available){
		this.cmd = cmd;
		this.perm = perm;
		this.alias = alias;
		this.available = available;
	}
	
	private EnumCmds(String cmd, String perm, String alias, String alias2, boolean available){
		this.cmd = cmd;
		this.perm = perm;
		this.alias = alias;
		this.alias2 = alias2;
		this.available = available;
	}
	
	private EnumCmds(String cmd, String perm, String alias, String alias2, String alias3, boolean available){
		this.cmd = cmd;
		this.perm = perm;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.available = available;
	}
	
	private EnumCmds(String cmd, String perm, String alias, String alias2, String alias3, String alias4, 
			boolean available){
		this.cmd = cmd;
		this.perm = perm;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.available = available;
	}
	
	private EnumCmds(String cmd, String perm, String alias, String alias2, String alias3, String alias4, 
			String alias5, boolean available){
		this.cmd = cmd;
		this.perm = perm;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.alias5 = alias5;
		this.available = available;
	}
	
	public boolean isAvailable(){
		return available;
	}
	
	public String getCmd(){
		return cmd;
	}
	
	public String getPerm(){
		return perm;
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
	
	public EnumCmds fromString(String command) {
	    if (command != null) {
	      for (EnumCmds c : EnumCmds.values()) {
	        if (command.equalsIgnoreCase(c.getCmd()) || command.equalsIgnoreCase(c.getAlias()) ||
	        		command.equalsIgnoreCase(c.getAlias2()) || command.equalsIgnoreCase(c.getAlias3()) || 
	        		command.equalsIgnoreCase(c.getAlias4()) || command.equalsIgnoreCase(c.getAlias5())) {
	          return c;
	        }
	      }
	    }
	    return null;
	  }
}
