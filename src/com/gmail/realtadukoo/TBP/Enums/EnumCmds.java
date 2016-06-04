package com.gmail.realtadukoo.TBP.Enums;

public enum EnumCmds {	
	// Special cases.
	FIRST("1", true, "one", "first", "1st", true, false),
	SECOND("2", true, "one", "second", "2nd", true, false),
	THIRD("3", true, "one", "third", "3rd", true, false),
	SONG("Song", true, true, false),
	ANONYMOUS("anonymous", true, "anon", "an", "anony", false, false),
	BYPASS("bypass", true, "pass", "passby", "force", "override", false, false),
	
	/*
	 * Actual Commands.
	 */
	// /bible read
	READ("read", false, "readverse", "verseread", "readv", "vread", true, false),
	
	// /bible send
	SEND("send", false, "sendverse", "versesend", "giveverse", "versegive", "sendv", true, false),
	SEND2("send", false, "vsend", "givev", "vgive", true, false),
	
	// /bible previous
	PREVIOUS("previous", false, "pre", "prev", "back", "before", "b4", true, false),
	
	// /bible next
	NEXT("next", false, "forward", "for", "after", "aft", "nextverse", true, false),
	NEXT2("next", false, "versenext", "nextv", "vnext", true, false),
	
	// /bible last
	LAST("last", false, "saved", "save", "load", "lastverse", "verselast", true, false),
	LAST2("last", false, "lastv", "vlast", "savedverse", "savedverse", "vsaved", true, false),
	LAST3("last", false, "savedv", "vsave", "versesave", "loadverse", "verseload", true, false),
	LAST4("last", false, "vload", "loadv", true, false),
	
	// /bible favorite
	FAVORITE("favorite", false, "fav", "favor", "like", "favoriteverse", "versefavorite", true, false),
	FAVORITE2("favorite", false, "favverse", "versefav", "favorverse", "versefavor", "likeverse", true, 
			false),
	FAVORITE3("favorite", false, "verselike", "favoritev", "vfavorite", "favv", "vfav", true, false),
	FAVORITE4("favorite", false, "favorv", "vfavor", "likev", "vlike", true, false),
	
	// /bible random
	RANDOM("random", false, "rand", "randomverse", "randomv", "verserandom", "vrandom", true, false),
	RANDOM2("random", false, "randverse", "randv", "verserand", "vrand", true, false),
	
	// /bible getbook
	GETBOOK("getbook", false, "book", "bookget", "getbible", "bibleget", "bget", true, false),
	GETBOOK2("getbook", false, "getb", true, false),
	
	// /bible sendbook
	SENDBOOK("sendbook", false, "booksend", "biblesend", "sendbible", "givebook", "bookgive", true, false),
	SENDBOOK2("sendbook", false, "biblegive", "givebible", "sendb", "bsend", "giveb", true, false),
	SENDBOOK3("sendbook", false, "bgive", true, false),
	
	// /bible info
	INFO("info", false, "about", "abt", "information", true, false),
	
	// /bible help
	HELP("help", false, "?", "commands", "commandshelp", "cmds", "cmdshelp", true, false),
	
	// /bible plugin
	PLUGIN("plugin", false, "TB", "TadukooBible", "TadukooBibleinfo", "plugininfo", true, false),
	
	// /bible dictionary
	DICTIONARY("dictionary", false, "define", "meaning", "definition", false, false),
	
	// /bible books
	BOOKS("books", false, "bookslist", "listbooks", "booklist", "booksinfo", "bookinfo", true, false),
	BOOKS2("books", false, "infobooks", "infobook", true, false),
	
	// /bible translation
	TRANSLATION("translation", false, "translations", "translist", "translationslist", "listtrans", "tran", 
			true, false),
	TRANSLATION2("translation", false, "trans", "translationinfo", "translationsinfo", "transinfo", "traninfo",
			true, false),
	
	// /bible permission
	PERMISSION("permission", false, "perm", "perms", true, false),
	
	// /bible youtube
	YOUTUBE("YouTube", false, "videos", "video", false, false),
	
	// /bible block
	BLOCK("block", false, "ban", false, false),
	
	// /bible receive
	RECEIVE("receive", false, false, false),
	
	// /bible config
	CONFIG("config", false, "configuration", "settings", "set", "options", true, false),
	
	// /bible announce
	ANNOUNCE("announce", false, "ann", "broadcast", "broad", "shout", "yell", true, false);
	
	private String cmd; // Command name
	private boolean special; // Special = not a command
	private String perm; // Permission to use command, set by checking EnumPerms
	private String alias; // alias 1, 6, etc.
	private String alias2; // alias 2, 7, etc.
	private String alias3; // alias 3, 8, etc.
	private String alias4; // alias 4, 9, etc.
	private String alias5; // alias 5, 10, etc.
	private boolean available; // available with /bible
	private boolean apocAvailable; // available with /apocrypha
	
	EnumPerms perms = EnumPerms.STAR; // Set default EnumPerms
	
	// Constructor for no aliases
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
	
	// Constructor for 1 alias
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
	
	// Constructor for 2 aliases
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
	
	// Constructor for 3 aliases
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
	
	// Constructor for 4 aliases
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
	
	// Constructor for 5 aliases
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
	
	// Check availability in /bible or /apocrypha
	public boolean isAvailable(String type){
		if(type == "Bible"){
			return available;
		}else if(type == "Apocrypha"){
			return apocAvailable;
		}else{
			return false;
		}
	}
	
	// Returns command name
	public String getCmd(){
		return cmd;
	}
	
	// Returns whether it's not a command or is
	public boolean isSpecial(){
		return special;
	}
	
	// Returns permission
	public String getPerm(){
		return perm;
	}
	
	// Returns alias 1, 6, or etc.
	public String getAlias(){
		return alias;
	}
	
	// Returns alias 2, 7, or etc.
	public String getAlias2(){
		return alias2;
	}
	
	// Returns alias 3, 8, or etc.
	public String getAlias3(){
		return alias3;
	}
	
	// Returns alias 4, 9, or etc.
	public String getAlias4(){
		return alias4;
	}
	
	// Returns alias 5, 10, or etc.
	public String getAlias5(){
		return alias5;
	}
	
	// Returns a command from a string
	public EnumCmds fromString(String command){
		if(command != null){
			for(EnumCmds c: EnumCmds.values()){
				if(command.equalsIgnoreCase(c.getCmd()) || command.equalsIgnoreCase(c.getAlias()) ||
					command.equalsIgnoreCase(c.getAlias2()) || command.equalsIgnoreCase(c.getAlias3()) || 
					command.equalsIgnoreCase(c.getAlias4()) || command.equalsIgnoreCase(c.getAlias5())){
					return c;
				}
			}
		}
		return null;
	}
	
	// Returns whether the String contains the cmd or alias of the given Command.
	public boolean containsCommand(String command, String checking){
		if(command != null && checking != null){
			for(EnumCmds c: EnumCmds.values()){
				if(command.equalsIgnoreCase(c.getCmd())){
					if(checking.contains(":")){
						checking = checking.split(":")[0];
					}
					if(checking.equalsIgnoreCase(c.getCmd()) || checking.equalsIgnoreCase(c.getAlias()) || 
						checking.equalsIgnoreCase(c.getAlias2()) || checking.equalsIgnoreCase(c.getAlias3()) ||
						checking.equalsIgnoreCase(c.getAlias4()) || checking.equalsIgnoreCase(c.getAlias5())){
						return true;
					}
				}
			}
		}
		return false;
	}
}
