package com.gmail.lucario77777777.TBP.Enums;

public enum EnumCmds {
	// Special cases.
	FIRST("first", "first", "1", "1st", null, null, null, true),
	SECOND("second", "second", "2", "2nd", null, null, null, true),
	THIRD("third", "third", "3", "3rd", null, null, null, true),
	
	//Actual Commands.
	HELP("help", "help", "?", "commands", "commandshelp", "cmds", "cmdshelp", true),
	CONFIG("config", "config", "configuration", "settings", "set", "options", null, true),
	INFO("info", "info", "about", "abt", "information", null, null, true),
	BOOKS("books", "books", "bookslist", "listbooks", "booklist", null, null, true),
	TRANSLATIONS("translations", "translations", "translist", "translationslist", "listtrans", "tran", "trans",
			true),
	GETBOOK("getbook", "getbook", "book", "bookget", "bible", "getbible", "bibleget", true),
	GIVEBOOK("givebook", "givebook", "bookgive", "biblegive", "givebible", null, null, true),
	RANDOM("random", "random", "rand", "randomverse", "randomv", "verserandom", "vrandom", true),
	RANDOM2("random", "randverse", "randv", "verserand", "vrand", null, null, true),
	ANNOUNCE("announce", "announce", "ann", "broadcast", "broad", "shout", "yell", true),
	PREVIOUS("previous", "previous", "pre", "prev", "back", "before", "b4", false),
	NEXT("next", "next", "forward", "for", "after", "aft", "nextverse", false),
	NEXT2("next", "versenext", "nextv", "vnext", null, null, null, false),
	LAST("last", "last", "saved", "save", "load", "lastverse", "verselast", false),
	LAST2("last", "lastv", "vlast", "savedverse", "savedverse", "vsaved", "savedv", false),
	LAST3("last", "vsave", "versesave", "loadverse", "verseload", "vload", "loadv", false);
	
	//Command Name.
	private String cmd;
	
	//Command Name or 7th or 13th alias.
	private String alias;
	
	//2nd, 8th, or 14th alias.
	private String alias2;
	
	//3rd, 9th, or 15th alias.
	private String alias3;
	
	//4th, 10th, or 16th alias.
	private String alias4;
	
	//5th, 11th, or 17th alias.
	private String alias5;
	
	//6th, 12th, or 18th alias.
	private String alias6;
	
	//Whether you can use that command or not.
	private boolean available;
	
	private EnumCmds(String cmd, String alias, String alias2, String alias3, String alias4, String alias5,
			String alias6, boolean available){
		this.cmd = cmd;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.alias5 = alias5;
		this.alias6 = alias6;
		this.available = available;
	}
	
	/*
	 * Checks if a command is available.
	 */
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
	
	public String getAlias6(){
		return alias6;
	}
	
	public EnumCmds fromString(String command) {
	    if (command != null) {
	      for (EnumCmds c : EnumCmds.values()) {
	        if (command.equalsIgnoreCase(c.getAlias()) || command.equalsIgnoreCase(c.getAlias2()) || 
	        		command.equalsIgnoreCase(c.getAlias3()) || command.equalsIgnoreCase(c.getAlias4()) ||
	        		command.equalsIgnoreCase(c.getAlias5()) || command.equalsIgnoreCase(c.getAlias6())) {
	          return c;
	        }
	      }
	    }
	    return null;
	  }
}
