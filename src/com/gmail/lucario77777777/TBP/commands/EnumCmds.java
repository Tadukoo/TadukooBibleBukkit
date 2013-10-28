package com.gmail.lucario77777777.TBP.commands;

public enum EnumCmds {
	// Special cases.
	FIRST("first", "first", "1", null, true),
	SECOND("second", "second", "2", null, true),
	THIRD("third", "third", "3", null, true),
	
	//Actual Commands.
	HELP("help", "help", "?", "commands", true),
	HELP2("help", "commandshelp", "cmds", "cmdshelp", true),
	INFO("info", "info", "about", "abt", true),
	INFO2("info", "information", null, null, true),
	BOOKS("books", "books", "bookslist", "listbooks", true),
	BOOKS2("books", "booklist", null, null, true),
	TRANSLATIONS("translations", "translations", "translist", "translationslist", true),
	TRANSLATIONS2("translations", "listtrans", "tran", "trans", true),
	GETBOOK("getbook", "getbook", "book", "bookget", true),
	GIVEBOOK("givebook", "givebook", "bookgive", null, false),
	ANNOUNCE("announce", "announce", "ann", "broadcast", false),
	ANNOUNCE2("announce", "broad", null, null, false),
	PREVIOUS("previous", "previous", "pre", "prev", false),
	PREVIOUS2("previous", "back", null, null, false),
	NEXT("next", "next", "forward", "for", false);
	
	//Command Name.
	private String cmd;
	
	//Command Name or 4th alias.
	private String alias;
	
	//2nd or 5th alias.
	private String alias2;
	
	//3rd or 6th alias.
	private String alias3;
	
	//Whether you can use that command or not.
	private boolean available;
	
	private EnumCmds(String cmd, String alias, String alias2, String alias3, boolean available){
		this.cmd = cmd;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
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
	
	public EnumCmds fromString(String command) {
		/*
		 * Checks a string against all the aliases of a command and returns the command that contains that
		 * alias.
		 */
	    if (command != null) {
	      for (EnumCmds c : EnumCmds.values()) {
	        if (command.equalsIgnoreCase(c.getAlias()) || command.equalsIgnoreCase(c.getAlias2()) || 
	        		command.equalsIgnoreCase(c.getAlias3())) {
	          return c;
	        }
	      }
	    }
	    return null;
	  }
}
