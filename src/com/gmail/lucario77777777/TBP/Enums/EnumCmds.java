package com.gmail.lucario77777777.TBP.Enums;

public enum EnumCmds {
	// Special cases.
	FIRST("1", "verse.read", "one", "first", "1st", true, false),
	SECOND("2", "verse.read", "one", "second", "2nd", true, false),
	THIRD("3", "verse.read", "one", "third", "3rd", true, false),
	SONG("Song", "verse.read", true, false),
	ANONYMOUS("anonymous", "", "anon", "an", "anony", false, false),
	
	//Actual Commands.
	READ("read", "verse.read", "readverse", "verseread", "readv", "vread", true, false),
	SEND("send", "verse.send", "sendverse", "versesend", "giveverse", "versegive", "sendv", true, false),
	SEND2("send", "verse.send", "vsend", "givev", "vgive", true, false),
	PREVIOUS("previous", "verse.previous", "pre", "prev", "back", "before", "b4", true, false),
	NEXT("next", "verse.next", "forward", "for", "after", "aft", "nextverse", true, false),
	NEXT2("next", "verse.next", "versenext", "nextv", "vnext", true, false),
	LAST("last", "verse.last", "saved", "save", "load", "lastverse", "verselast", true, false),
	LAST2("last", "verse.last", "lastv", "vlast", "savedverse", "savedverse", "vsaved", true, false),
	LAST3("last", "verse.last", "savedv", "vsave", "versesave", "loadverse", "verseload", true, false),
	LAST4("last", "verse.last", "vload", "loadv", true, false),
	FAVORITE("favorite", "verse.favorite", "fav", "favor", "like", "favoriteverse", "versefavorite", false,
			false),
	FAVORITE2("favorite", "verse.favorite", "favverse", "versefav", "favorverse", "versefavor", "likeverse",
			false, false),
	FAVORITE3("favorite", "verse.favorite", "verselike", "favoritev", "vfavorite", "favv", "vfav", false,
			false),
	FAVORITE4("favorite", "verse.favorite", "favorv", "vfavor", "likev", "vlike", false, false),
	RANDOM("random", "verse.random", "rand", "randomverse", "randomv", "verserandom", "vrandom", true, false),
	RANDOM2("random", "verse.random", "randverse", "randv", "verserand", "vrand", true, false),
	GETBOOK("getbook", "book.get", "book", "bookget", "getbible", "bibleget", "bget", true, false),
	GETBOOK2("getbook", "book.get", "getb", true, false),
	SENDBOOK("sendbook", "book.send", "booksend", "biblesend", "sendbible", "givebook", "bookgive", true,
			false),
	SENDBOOK2("sendbook", "book.send", "biblegive", "givebible", "sendb", "bsend", "giveb", true, false),
	SENDBOOK3("sendbook", "book.send", "bgive", true, false),
	INFO("info", "use", "about", "abt", "information", true, false),
	HELP("help", "info.help", "?", "commands", "commandshelp", "cmds", "cmdshelp", true, false),
	PLUGIN("plugin", "info.plugin", "TB", "TadukooBible", "TadukooBibleinfo", "plugininfo", true, false),
	DICTIONARY("dictionary", "info.dictionary", "define", "meaning", false, false),
	BOOKS("books", "info.book", "bookslist", "listbooks", "booklist", "booksinfo", "bookinfo", true, false),
	BOOKS2("book", "info.book", "infobooks", "infobook", true, false),
	TRANSLATION("translation", "info.translation", "translations", "translist", "translationslist", 
			"listtrans", "tran", true, false),
	TRANSLATION2("translation", "info.translation", "trans", "translationinfo", "translationsinfo",
			"transinfo", "traninfo", true, false),
	YOUTUBE("YouTube", "", "videos", "video", false, false),
	BLOCK("block", "block.view", false, false),
	RECEIVE("receive", "receive", false, false),
	CONFIG("config", "op.config", "configuration", "settings", "set", "options", true, false),
	ANNOUNCE("announce", "op.announce", "ann", "broadcast", "broad", "shout", "yell", true, false);
	
	private String cmd;
	private String perm;
	private String alias;
	private String alias2;
	private String alias3;
	private String alias4;
	private String alias5;
	private boolean available;
	private boolean apocAvailable;
	
	private EnumCmds(String cmd, String perm, boolean available, boolean apocAvailable){
		this.cmd = cmd;
		this.perm = perm;
		this.available = available;
		this.apocAvailable = apocAvailable;
	}
	
	private EnumCmds(String cmd, String perm, String alias, boolean available, boolean apocAvailable){
		this.cmd = cmd;
		this.perm = perm;
		this.alias = alias;
		this.available = available;
		this.apocAvailable = apocAvailable;
	}
	
	private EnumCmds(String cmd, String perm, String alias, String alias2, boolean available, 
			boolean apocAvailable){
		this.cmd = cmd;
		this.perm = perm;
		this.alias = alias;
		this.alias2 = alias2;
		this.available = available;
		this.apocAvailable = apocAvailable;
	}
	
	private EnumCmds(String cmd, String perm, String alias, String alias2, String alias3, boolean available,
			boolean apocAvailable){
		this.cmd = cmd;
		this.perm = perm;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.available = available;
		this.apocAvailable = apocAvailable;
	}
	
	private EnumCmds(String cmd, String perm, String alias, String alias2, String alias3, String alias4, 
			boolean available, boolean apocAvailable){
		this.cmd = cmd;
		this.perm = perm;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.available = available;
		this.apocAvailable = apocAvailable;
	}
	
	private EnumCmds(String cmd, String perm, String alias, String alias2, String alias3, String alias4, 
			String alias5, boolean available, boolean apocAvailable){
		this.cmd = cmd;
		this.perm = perm;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.alias4 = alias4;
		this.alias5 = alias5;
		this.available = available;
		this.apocAvailable = apocAvailable;
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
