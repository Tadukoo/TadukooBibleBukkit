package com.gmail.lucario77777777.TBP.Enums;

public enum EnumCmds {
	// Special cases.
	FIRST("first", "1", "1st", true),
	SECOND("second", "2", "2nd", true),
	THIRD("third", "3", "3rd", true),
	
	//Actual Commands.
	READ("read", "readv", "vread", false),
	SEND("send", "sendverse", "versesend", "giveverse", "versegive", "sendv", false),
	SEND2("send", "vsend", "givev", "vgive", false),
	HELP("help", "?", "commands", "commandshelp", "cmds", "cmdshelp", true),
	CONFIG("config", "configuration", "settings", "set", "options", true),
	INFO("info", "about", "abt", "information", true),
	BOOKS("books", "bookslist", "listbooks", "booklist", true),
	TRANSLATIONS("translations", "translist", "translationslist", "listtrans", "tran", "trans", true),
	GETBOOK("getbook", "book", "bookget", "bible", "getbible", "bibleget", true),
	SENDBOOK("sendbook", "booksend", "biblesend", "sendbible", "givebook", "bookgive", true),
	SENDBOOK2("sendbook", "biblegive", "givebible", true),
	RANDOM("random", "rand", "randomverse", "randomv", "verserandom", "vrandom", true),
	RANDOM2("random", "randverse", "randv", "verserand", "vrand", true),
	ANNOUNCE("announce", "ann", "broadcast", "broad", "shout", "yell", true),
	PREVIOUS("previous", "pre", "prev", "back", "before", "b4", true),
	NEXT("next", "forward", "for", "after", "aft", "nextverse", true),
	NEXT2("next", "versenext", "nextv", "vnext", true),
	LAST("last", "saved", "save", "load", "lastverse", "verselast", true),
	LAST2("last", "lastv", "vlast", "savedverse", "savedverse", "vsaved", true),
	LAST3("last", "savedv", "vsave", "versesave", "loadverse", "verseload", true),
	LAST4("last", "vload", "loadv", true);
	
	private String cmd;
	
	private String alias;
	
	private String alias2;
	
	private String alias3;
	
	private String alias4;
	
	private String alias5;
	
	private boolean available;
	
	private EnumCmds(String cmd, boolean available){
		this.cmd = cmd;
		this.available = available;
	}
	
	private EnumCmds(String cmd, String alias, boolean available){
		this.cmd = cmd;
		this.alias = alias;
		this.available = available;
	}
	
	private EnumCmds(String cmd, String alias, String alias2, boolean available){
		this.cmd = cmd;
		this.alias = alias;
		this.alias2 = alias2;
		this.available = available;
	}
	
	private EnumCmds(String cmd, String alias, String alias2, String alias3, boolean available){
		this.cmd = cmd;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.available = available;
	}
	
	private EnumCmds(String cmd, String alias, String alias2, String alias3, String alias4, boolean available){
		this.cmd = cmd;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.available = available;
	}
	
	private EnumCmds(String cmd, String alias, String alias2, String alias3, String alias4, String alias5,
			boolean available){
		this.cmd = cmd;
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
