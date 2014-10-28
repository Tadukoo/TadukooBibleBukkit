package com.gmail.realtadukoo.TBP.Enums;

public enum EnumPerms {
	STAR("TadukooBible.*", "*", "star", "Gives all permissions.", 
			"use, verse.*, book.*, info.*, op.*, and anonymous.*"),
	VERSESTAR("TadukooBible.verse.*", "verse.*", "versestar", "Gives all verse permissions.",
			"read, send, receive, previous, next, last, random, and announceget"),
	BOOKSTAR("TadukooBible.book.*", "book.*", "bookstar", "Gives all book permissions.",
			"get, send, and receive"),
	INFOSTAR("TadukooBible.info.*", "info.*", "infostar", "Gives all info permissions.", 
			"help, plugin, book, translation, and permission"),
	OPSTAR("TadukooBible.op.*", "op.*", "opstar", "Gives all op permissions.", "announce and config"),
	ANONYMOUSSTAR("TadukooBible.anonymous.*", "anonymous.*", "anonymousstar", 
			"Gives all anonymous permissions.", "verse and book"),
	USE("TadukooBible.use", "use", "use", "Gives access to the plugin."),
	READ("TadukooBible.verse.read", "verse.read", "read", "Allows use of /bible read."),
	SEND("TadukooBible.verse.send", "verse.send", "send", "Allows use of /bible send."),
	VERSERECEIVE("TadukooBible.verse.receive", "verse.receive", "versereceive", 
			"Allows you to receive verses."),
	PREVIOUS("TadukooBible.verse.previous", "verse.previous", "previous", "Allows use of /bible previous."),
	NEXT("TadukooBible.verse.next", "verse.next", "next", "Allows use of /bible next."),
	LAST("TadukooBible.verse.last", "verse.last", "last", "Allows use of /bible last."),
	RANDOM("TadukooBible.verse.random", "verse.random", "random", "Allows use of /bible random"),
	ANNOUNCEGET("TadukooBible.verse.announceget", "verse.announceget", "announceget", 
			"Allows getting announced verses."),
	GETBOOK("TadukooBible.book.get", "book.get", "getbook", "Allows use of /bible getbook"),
	SENDBOOK("TadukooBible.book.send", "book.send", "sendbook", "Allows use of /bible sendbook."),
	RECEIVEBOOK("TadukooBible.book.receive", "book.receive", "receivebook", "Allows you to receive books."),
	HELP("TadukooBible.info.help", "info.help", "help", "Allows use of /bible help."),
	PLUGIN("TadukooBible.info.plugin", "info.plugin", "plugin", 
			"Allows use of /bible plugin and using /bible info for plugin info."),
	BOOKS("TadukooBible.info.book", "info.book", "books",
			"Allows use of /bible books and using /bible info for book info."),
	TRANSLATION("TadukooBible.info.translation", "info.translation", "translation", 
			"Allows use of /bible translation and using /bible info for translation info."),
	PERMISSION("TadukooBible.info.permission", "info.permission", "permission", 
			"Allows using /bible info for permission info."),
	CONFIG("TadukooBible.op.config", "op.config", "config", "config", "Allows use of /bible config."),
	ANNOUNCE("TadukooBible.op.announce", "op.announce", "announce", "Allows use of /bible announce."),
	ANONYMOUSVERSE("TadukooBible.anonymous.verse", "anonymous.verse", "anonymousverse", 
			"Allows you to send verses anonymously."),
	ANONYMOUSBOOK("TadukooBible.anonymous.book", "anonymous.book", "anonymousbook", 
			"Allows you to send books anonymously.");
	
	private String perm;
	private String shortPerm;
	private String nick;
	private String desc;
	private String children;
	
	private EnumPerms(String perm, String shortPerm, String nick, String desc, String children){
		this.perm = perm;
		this.shortPerm = shortPerm;
		this.nick = nick;
		this.desc = desc;
		this.children = children;
	}
	
	private EnumPerms(String perm, String shortPerm, String nick, String desc){
		this.perm = perm;
		this.shortPerm = shortPerm;
		this.nick = nick;
		this.desc = desc;
	}
	
	public String getPerm(){
		return perm;
	}
	
	public String getShortPerm(){
		return shortPerm;
	}
	
	public String getNick(){
		return nick;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getChildren(){
		return children;
	}
	
	public EnumPerms fromString(String perm){
	    if (perm != null){
	      for (EnumPerms c : EnumPerms.values()){
	    	  if(perm.equalsIgnoreCase("info")){
	    		  return USE;
	    	  }else if(perm.equalsIgnoreCase(c.getPerm()) || perm.equalsIgnoreCase(c.getShortPerm()) ||
	    			  perm.equalsIgnoreCase(c.getNick())){
	    		  return c;
	    	  }
	      }
	    }
	    return null;
	  }
}
