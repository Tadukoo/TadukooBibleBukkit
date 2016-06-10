package com.gmail.realtadukoo.TBP.Enums;

public enum EnumCmds {	
	/*
	 * Special cases.
	 */
	FIRST("1", true, new String[]{"one", "first", "1st"}, true, false),
	
	SECOND("2", true, new String[]{"two", "second", "2nd"}, true, false),
	
	THIRD("3", true, new String[]{"three", "third", "3rd"}, true, false),
	
	SONG("Song", true, null, true, false),
	
	ANONYMOUS("anonymous", true, new String[]{"anon", "an", "anony"}, false, false),
	
	BYPASS("bypass", true, new String[]{"pass", "passby", "force", "override"}, false, false),
	
	/*
	 * Actual Commands.
	 */
	READ("read", false, new String[]{"readverse", "verseread", "readv", "vread"}, true, false),
	
	SEND("send", false, new String[]{"sendverse", "versesend", "giveverse", "versegive", 
			"sendv", "vsend", "givev", "vgive"}, true, false),
			
	PREVIOUS("previous", false, new String[]{"pre", "prev", "back", "before", "b4"}, true, 
			false),
			
	NEXT("next", false, new String[]{"forward", "for", "after", "aft", "nextverse", 
			"versenext", "nextv", "vnext"}, true, false),
			
	LAST("last", false, new String[]{"saved", "save", "load", "lastverse", "verselast", 
			"lastv", "vlast", "savedverse", "savedverse", "vsaved", "savedv", "vsave", 
			"versesave", "loadverse", "verseload", "vload", "loadv"}, true, false),
			
	FAVORITE("favorite", false, new String[]{"fav", "favor", "like", "favoriteverse", 
			"versefavorite", "favverse", "versefav", "favorverse", "versefavor", 
			"likeverse", "verselike", "favoritev", "vfavorite", "favv", "vfav", "favorv", 
			"vfavor", "likev", "vlike"}, true, false),
			
	RANDOM("random", false, new String[]{"rand", "randomverse", "randomv", "verserandom", 
			"vrandom", "randverse", "randv", "verserand", "vrand"}, true, false),
			
	GETBOOK("getbook", false, new String[]{"book", "bookget", "getbible", "bibleget", "bget", 
			"getb"}, true, false),
	
	SENDBOOK("sendbook", false, new String[]{"booksend", "biblesend", "sendbible", "givebook", 
			"bookgive", "biblegive", "givebible", "sendb", "bsend", "giveb", "bgive"}, true, 
			false),
	
	STATISTICS("statistics", false, new String[]{"stats", "stat"}, true, false),
	
	INFO("info", false, new String[]{"about", "abt", "information"}, true, false),
	
	HELP("help", false, new String[]{"?", "commands", "commandshelp", "cmds", "cmdshelp"}, 
			true, false),
	
	PLUGIN("plugin", false, new String[]{"TB", "TadukooBible", "TadukooBibleinfo", 
			"plugininfo"}, true, false),
	
	DICTIONARY("dictionary", false, new String[]{"define", "meaning", "definition"}, false, 
			false),
	
	BOOKS("books", false, new String[]{"bookslist", "listbooks", "booklist", "booksinfo", 
			"bookinfo", "infobooks", "infobook"}, true, false),
	
	TRANSLATION("translation", false, new String[]{"translations", "translist", 
			"translationslist", "listtrans", "tran", "trans", "translationinfo", 
			"translationsinfo", "transinfo", "traninfo"}, true, false),
	
	PERMISSION("permission", false, new String[]{"perm", "perms"}, true, false),
	
	YOUTUBE("YouTube", false, new String[]{"videos", "video"}, false, false),
	
	BLOCK("block", false, new String[]{"ban"}, false, false),
	
	RECEIVE("receive", false, null, false, false),
	
	CONFIG("config", false, new String[]{"configuration", "settings", "set", "options"}, 
			true, false),
	
	ANNOUNCE("announce", false, new String[]{"ann", "broadcast", "broad", "shout", "yell"}, 
			true, false);
	
	private String cmd; // Command name
	private boolean special; // Special = not a command
	private String perm; // Permission to use command, set by checking EnumPerms
	private String[] aliases;
	private boolean available; // available with /bible
	private boolean apocAvailable; // available with /apocrypha
	
	EnumPerms perms = EnumPerms.STAR; // Set default EnumPerms
	
	private EnumCmds(String cmd, boolean special, String[] aliases, boolean available, 
			boolean apocAvailable){
		this.cmd = cmd;
		this.special = special;
		this.aliases = aliases;
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
	
	// Returns all aliases
	public String[] getAliases(){
		return aliases;
	}
	
	// Returns a command from a string
	public EnumCmds fromString(String command){
		if(command != null){
			for(EnumCmds c: EnumCmds.values()){
				if(command.equalsIgnoreCase(c.getCmd())){
					return c;
				}else{
					for(int i = 0; i < c.getAliases().length; i++){
						if(command.equalsIgnoreCase(c.getAliases()[i])){
							return c;
						}
					}
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
					if(checking.equalsIgnoreCase(c.getCmd())){
						return true;
					}else{
						for(int i = 0; i < c.getAliases().length; i++){
							if(checking.equalsIgnoreCase(c.getAliases()[i])){
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
}
