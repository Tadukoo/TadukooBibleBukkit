package com.gmail.realtadukoo.TBP.Enums;

public enum EnumCmds {	
	// Special cases.
	FIRST("1", true, "one", "first", "1st", true, false),
	SECOND("2", true, "one", "second", "2nd", true, false),
	THIRD("3", true, "one", "third", "3rd", true, false),
	SONG("Song", true, true, false),
	ANONYMOUS("anonymous", true, "anon", "an", "anony", false, false),
	
	//Actual Commands.
	READ("read", false, "readverse", "verseread", "readv", "vread", true, false),
	SEND("send", false, "sendverse", "versesend", "giveverse", "versegive", "sendv", true, false),
	SEND2("send", false, "vsend", "givev", "vgive", true, false),
	PREVIOUS("previous", false, "pre", "prev", "back", "before", "b4", true, false),
	NEXT("next", false, "forward", "for", "after", "aft", "nextverse", true, false),
	NEXT2("next", false, "versenext", "nextv", "vnext", true, false),
	LAST("last", false, "saved", "save", "load", "lastverse", "verselast", true, false),
	LAST2("last", false, "lastv", "vlast", "savedverse", "savedverse", "vsaved", true, false),
	LAST3("last", false, "savedv", "vsave", "versesave", "loadverse", "verseload", true, false),
	LAST4("last", false, "vload", "loadv", true, false),
	FAVORITE("favorite", false, "fav", "favor", "like", "favoriteverse", "versefavorite", true, false),
	FAVORITE2("favorite", false, "favverse", "versefav", "favorverse", "versefavor", "likeverse", true, 
			false),
	FAVORITE3("favorite", false, "verselike", "favoritev", "vfavorite", "favv", "vfav", true, false),
	FAVORITE4("favorite", false, "favorv", "vfavor", "likev", "vlike", true, false),
	RANDOM("random", false, "rand", "randomverse", "randomv", "verserandom", "vrandom", true, false),
	RANDOM2("random", false, "randverse", "randv", "verserand", "vrand", true, false),
	GETBOOK("getbook", false, "book", "bookget", "getbible", "bibleget", "bget", true, false),
	GETBOOK2("getbook", false, "getb", true, false),
	SENDBOOK("sendbook", false, "booksend", "biblesend", "sendbible", "givebook", "bookgive", true, false),
	SENDBOOK2("sendbook", false, "biblegive", "givebible", "sendb", "bsend", "giveb", true, false),
	SENDBOOK3("sendbook", false, "bgive", true, false),
	INFO("info", false, "about", "abt", "information", true, false),
	HELP("help", false, "?", "commands", "commandshelp", "cmds", "cmdshelp", true, false),
	PLUGIN("plugin", false, "TB", "TadukooBible", "TadukooBibleinfo", "plugininfo", true, false),
	DICTIONARY("dictionary", false, "define", "meaning", false, false),
	BOOKS("books", false, "bookslist", "listbooks", "booklist", "booksinfo", "bookinfo", true, false),
	BOOKS2("books", false, "infobooks", "infobook", true, false),
	TRANSLATION("translation", false, "translations", "translist", "translationslist", "listtrans", "tran", 
			true, false),
	TRANSLATION2("translation", false, "trans", "translationinfo", "translationsinfo", "transinfo", "traninfo",
			true, false),
	YOUTUBE("YouTube", false, "videos", "video", false, false),
	BLOCK("block", false, false, false),
	RECEIVE("receive", false, false, false),
	CONFIG("config", false, "configuration", "settings", "set", "options", true, false),
	ANNOUNCE("announce", false, "ann", "broadcast", "broad", "shout", "yell", true, false);
	
	private String cmd;
	private boolean special;
	private String perm;
	private String alias;
	private String alias2;
	private String alias3;
	private String alias4;
	private String alias5;
	private boolean available;
	private boolean apocAvailable;
	
	EnumPerms perms = EnumPerms.STAR;
	
	private EnumCmds(String cmd, boolean special, boolean available, boolean apocAvailable){
		this.cmd = cmd;
		this.special = special;
		this.available = available;
		this.apocAvailable = apocAvailable;
		if(!special && (available || apocAvailable)){
			perms = perms.fromString(cmd);
			this.perm = perms.getShortPerm();
		}else{
			this.perm = perms.fromString("info").getShortPerm();
		}
	}
	
	private EnumCmds(String cmd, boolean special, String alias, boolean available, boolean apocAvailable){
		this.cmd = cmd;
		this.special = special;
		this.alias = alias;
		this.available = available;
		this.apocAvailable = apocAvailable;
		if(!special && (available || apocAvailable)){
			perms = perms.fromString(cmd);
			this.perm = perms.getShortPerm();
		}else{
			this.perm = perms.fromString("info").getShortPerm();
		}
	}
	
	private EnumCmds(String cmd, boolean special, String alias, String alias2, boolean available,
			boolean apocAvailable){
		this.cmd = cmd;
		this.special = special;
		this.alias = alias;
		this.alias2 = alias2;
		this.available = available;
		this.apocAvailable = apocAvailable;
		if(!special && (available || apocAvailable)){
			perms = perms.fromString(cmd);
			this.perm = perms.getShortPerm();
		}else{
			this.perm = perms.fromString("info").getShortPerm();
		}
	}
	
	private EnumCmds(String cmd, boolean special, String alias, String alias2, String alias3,
			boolean available, boolean apocAvailable){
		this.cmd = cmd;
		this.special = special;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.available = available;
		this.apocAvailable = apocAvailable;
		if(!special && (available || apocAvailable)){
			perms = perms.fromString(cmd);
			this.perm = perms.getShortPerm();
		}else{
			this.perm = perms.fromString("info").getShortPerm();
		}
	}
	
	private EnumCmds(String cmd, boolean special, String alias, String alias2, String alias3, String alias4, 
			boolean available, boolean apocAvailable){
		this.cmd = cmd;
		this.special = special;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.available = available;
		this.apocAvailable = apocAvailable;
		if(!special && (available || apocAvailable)){
			perms = perms.fromString(cmd);
			this.perm = perms.getShortPerm();
		}else{
			this.perm = perms.fromString("info").getShortPerm();
		}
	}
	
	private EnumCmds(String cmd, boolean special, String alias, String alias2, String alias3, String alias4, 
			String alias5, boolean available, boolean apocAvailable){
		this.cmd = cmd;
		this.special = special;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.alias5 = alias5;
		this.available = available;
		this.apocAvailable = apocAvailable;
		if(!special && (available || apocAvailable)){
			perms = perms.fromString(cmd);
			this.perm = perms.getShortPerm();
		}else{
			this.perm = perms.fromString("info").getShortPerm();
		}
	}
	
	public boolean isAvailable(String type){
		if(type == "Bible"){
			return available;
		}else if(type == "Apocrypha"){
			return apocAvailable;
		}else{
			return false;
		}
	}
	
	public String getCmd(){
		return cmd;
	}
	
	public boolean isSpecial(){
		return special;
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
