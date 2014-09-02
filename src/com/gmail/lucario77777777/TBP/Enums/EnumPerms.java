package com.gmail.lucario77777777.TBP.Enums;

public enum EnumPerms {
	STAR("TadukooBible.*", "*", "Gives all permissions.", "use, verse.*, book.*, info.*, op.*, and anonymous.*",
			true),
	VERSESTAR("TadukooBible.verse.*", "verse.*", "Gives all verse permissions.", "read, send, receive, " +
			"previous, next, last, random, and announceget", true),
	BOOKSTAR("TadukooBible.book.*", "book.*", "Gives all book permissions.", "get, send, and receive", true),
	INFOSTAR("TadukooBible.info.*", "info.*", "Gives all info permissions.", "help, plugin, book, " +
			"translation, and permission", true),
	OPSTAR("TadukooBible.op.*", "op.*", "Gives all op permissions.", "announce and config", true),
	ANONYMOUSSTAR("TadukooBible.anonymous.*", "anonymous.*", "Gives all anonymous permissions.", "verse and " +
			"book", true),
	USE("TadukooBible.use", "use", "Gives access to the plugin.", true),
	VERSEREAD("TadukooBible.verse.read", "verse.read", "Allows use of /bible read.", true),
	VERSESEND("TadukooBible.verse.send", "verse.send", "Allows use of /bible send.", true),
	VERSERECEIVE("TadukooBible.verse.receive", "verse.receive", "Allows you to receive verses.", true),
	VERSEPREVIOUS("TadukooBible.verse.previous", "verse.previous", "Allows use of /bible previous.", true),
	VERSENEXT("TadukooBible.verse.next", "verse.next", "Allows use of /bible next.", true),
	VERSELAST("TadukooBible.verse.last", "verse.last", "Allows use of /bible last.", true),
	VERSERANDOM("TadukooBible.verse.random", "verse.random", "Allows use of /bible random", true),
	VERSEANNOUNCEGET("TadukooBible.verse.announceget", "verse.announceget", "Allows getting announced verses.",
			true),
	BOOKGET("TadukooBible.book.get", "book.get", "Allows use of /bible getbook", true),
	BOOKSEND("TadukooBible.book.send", "book.send", "Allows use of /bible sendbook.", true),
	BOOKRECEIVE("TadukooBible.book.receive", "book.receive", "Allows you to receive books.", true),
	INFOHELP("TadukooBible.info.help", "info.help", "Allows use of /bible help.", true),
	INFOPLUGIN("TadukooBible.info.plugin", "info.plugin", "Allows use of /bible plugin and using /bible info " +
			"for plugin info.", true),
	INFOBOOK("TadukooBible.info.book", "info.book", "Allows use of /bible books and using /bible info for " +
			"book info.", true),
	INFOTRANSLATION("TadukooBible.info.translation", "info.translation", "Allows use of /bible translation " +
			"and using /bible info for translation info.", true),
	INFOPERMISSION("TadukooBible.info.permission", "info.permission", "Allows using /bible info for " +
			"permission info.", true),
	OPCONFIG("TadukooBible.op.config", "op.config", "Allows use of /bible config.", true),
	OPANNOUNCE("TadukooBible.op.announce", "op.announce", "Allows use of /bible announce.", true),
	ANONYMOUSVERSE("TadukooBible.anonymous.verse", "anonymous.verse", "Allows you to send verses anonymously.",
			true),
	ANONYMOUSBOOK("TadukooBible.anonymous.book", "anonymous.book", "Allows you to send books anonymously.",
			true);
	
	private String perm;
	private String shortPerm;
	private String desc;
	private String children;
	private boolean available;
	
	private EnumPerms(String perm, String shortPerm, String desc, String children, boolean available){
		this.perm = perm;
		this.shortPerm = shortPerm;
		this.desc = desc;
		this.children = children;
		this.available = available;
	}
	
	private EnumPerms(String perm, String shortPerm, String desc, boolean available){
		this.perm = perm;
		this.shortPerm = shortPerm;
		this.desc = desc;
		this.available = available;
	}
	
	public String getPerm(){
		return perm;
	}
	
	public String getShortPerm(){
		return shortPerm;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getChildren(){
		return children;
	}
	
	public boolean isAvailable(){
		return available;
	}
	
	public EnumPerms fromString(String perm) {
	    if (perm != null) {
	      for (EnumPerms c : EnumPerms.values()) {
	        if (perm.equalsIgnoreCase(c.getPerm()) || perm.equalsIgnoreCase(c.getShortPerm())) {
	          return c;
	        }
	      }
	    }
	    return null;
	  }
}
