package com.gmail.realtadukoo.TBP.Enums;

import com.gmail.realtadukoo.TBP.TB;

public enum EnumPerms {
	// Star permissions
	STAR("TadukooBible.*", "*", "star", true),
	BIBLESTAR("TadukooBible.bible.*", "bible.*", "biblestar", true),
	VERSESTAR("TadukooBible.verse.*", "verse.*", "versestar", true),
	BOOKSTAR("TadukooBible.book.*", "book.*", "bookstar", true),
	INFOSTAR("TadukooBible.info.*", "info.*", "infostar", true),
	BLOCKSTAR("TadukooBible.block.*", "block.*", "blockstar", true),
	OPSTAR("TadukooBible.op.*", "op.*", "opstar", true),
	ANONYMOUSSTAR("TadukooBible.anonymous.*", "anonymous.*", "anonymousstar", true),
	BYPASSSTART("TadukooBible.bypass.*", "bypass.*", "bypassstar", true),
	APOCRYPHASTAR("TadukooBible.apocrypha.*", "apocrypha.*", "apocryphastar", true),
	
	// Generic permission
	USE("TadukooBible.use", "use", "use", false),
	
	// Translation permissions
	TRANSLATIONSTAR("TadukooBible.translation.*", "translation.*", "translationstar", true),
	TRANSLATIONDEFAULT("TadukooBible.translation.default", "translation.default", 
			"translationdefault", false),
	KJV("TadukooBible.translation.KJV", "translation.KJV", "KJV", false),
	
	// Verse permissions
	READ("TadukooBible.verse.read", "verse.read", "read", false),
	SEND("TadukooBible.verse.send", "verse.send", "send", false),
	VERSERECEIVE("TadukooBible.verse.receive", "verse.receive", "versereceive", false),
	PREVIOUS("TadukooBible.verse.previous", "verse.previous", "previous", false),
	NEXT("TadukooBible.verse.next", "verse.next", "next", false),
	LAST("TadukooBible.verse.last", "verse.last", "last", false),
	FAVORITE("TadukooBible.verse.favorite", "verse.favorite", "favorite", false),
	RANDOM("TadukooBible.verse.random", "verse.random", "random", false),
	ANNOUNCEGET("TadukooBible.verse.announceget", "verse.announceget", "announceget", false),
	
	// Book permissions
	GETBOOK("TadukooBible.book.get", "book.get", "getbook", false),
	SENDBOOK("TadukooBible.book.send", "book.send", "sendbook", false),
	RECEIVEBOOK("TadukooBible.book.receive", "book.receive", "receivebook", false),
	
	// Statistics permissions
	STATISTICSUSE("TadukooBible.statistics.use", "statistics.use", "statistics", false),
	STATISTICSOTHERS("TadukooBible.statistics.others", "statistics.others", "statisticsothers", 
			false),
	STATISTICSTOP("TadukooBible.statistics.top", "statistics.top", "statisticstop", false),
	
	// Info permissions
	HELP("TadukooBible.info.help", "info.help", "help", false),
	PLUGIN("TadukooBible.info.plugin", "info.plugin", "plugin", false),
	BOOKS("TadukooBible.info.book", "info.book", "books", false),
	TRANSLATION("TadukooBible.info.translation", "info.translation", "translation", false),
	PERMISSION("TadukooBible.info.permission", "info.permission", "permission", false),
	
	// Other non-op command permissions
	BLOCKVIEW("TadukooBible.block.view", "block.view", "blockview", false),
	BLOCKVERSE("TadukooBible.block.verse", "block.verse", "blockverse", false),
	BLOCKBOOK("TadukooBible.block.book", "block.book", "blockbook", false),
	BLOCKIMMUNE("TadukooBible.block.immune", "block.immune", "blockimmune", false),
	RECEIVE("TadukooBible.receive", "receive", "receive", false),
	
	// Op permissions
	CONFIG("TadukooBible.op.config", "op.config", "config", false),
	ANNOUNCE("TadukooBible.op.announce", "op.announce", "announce", false),
	
	// Anonymous permissions
	ANONYMOUSVERSE("TadukooBible.anonymous.verse", "anonymous.verse", "anonymousverse", false),
	ANONYMOUSBOOK("TadukooBible.anonymous.book", "anonymous.book", "anonymousbook", false),
	
	// Bypass permissions
	BYPASSVERSE("TadukooBible.bypass.verse", "bypass.verse", "bypassverse", false),
	BYPASSBOOK("TadukooBible.bypass.book", "bypass.book", "bypassbook", false),
	
	// Apocrypha permissions
	APOCRYPHAUSE("TadukooBible.apocrypha.use", "apocrypha.use", "apocryphause", false),
	APOCRYPHAHELP("TadukooBible.apocrypha.info.help", "apocrypha.info.help", "apocryphahelp", 
			false),
	
	// Debug permission
	DEBUG("TadukooBible.debug", "debug", "debug", false);
	
	private String perm; // Actual permission
	private String shortPerm; // Permission without TadukooBible.
	private String nick; // Nickname of permission
	private boolean children; // Whether it has children or not
	
	// Constructor
	private EnumPerms(String perm, String shortPerm, String nick, boolean children){
		this.perm = perm;
		this.shortPerm = shortPerm;
		this.nick = nick;
		this.children = children;
	}
	
	// Returns full permission
	public String getPerm(){
		return perm;
	}
	
	// Returns short permission
	public String getShortPerm(){
		return shortPerm;
	}
	
	// Returns nickname
	public String getNick(){
		return nick;
	}
	
	// Returns description from language file
	public String getDesc(){
		TB plugin = TB.plugin;
		return plugin.getLanguage(false).getString("permissions." + nick + ".desc");
	}
	
	// Returns children from language file if they exist
	public String getChildren(){
		TB plugin = TB.plugin;
		if(children){
			return plugin.getLanguage(false).getString("permissions." + nick + ".children");
		}else{
			return null;
		}
	}
	
	/*
	 *  Returns an EnumPerms from a string.
	 *  The string can replace book with b, verse with v, and star with *.
	 *  The string must match either the perm, shortPerm, or Nick of the permission.
	 *  The string may include "."'s or exclude them.
	 */
	public EnumPerms fromString(String perm){
	    if (perm != null){
	    	String perm1 = perm, perm2 = perm, perm3 = perm;
	    	boolean check1 = false, check2 = false, check3 = false;
	    	if(perm.contains("b")){
	    		perm1 = perm.replaceAll("b", "book");
	    		check1 = true;
	    	}
	    	if(perm.contains("v")){
	    		perm2 = perm.replaceAll("v", "verse");
	    		check2 = true;
	    	}
	    	if(perm.contains("*")){
	    		// Doesn't work
	    		//perm3 = perm.replaceAll("*", "star");
	    		//check3 = true;
	    	}
	    	for (EnumPerms c : EnumPerms.values()){
	    		if(perm.equalsIgnoreCase("info")){
	    			return USE;
	    		}else if(perm.equalsIgnoreCase("block")){
	    			return BLOCKVIEW;
	    		}else if(check3 && (perm3.equalsIgnoreCase(c.getPerm()) || 
	    				perm3.equalsIgnoreCase(c.getShortPerm()) || 
	    				perm3.equalsIgnoreCase(c.getNick()) || 
	    				perm3.equalsIgnoreCase(c.getPerm().replaceAll(".", "")) || 
	    				perm3.equalsIgnoreCase(c.getShortPerm().replaceAll(".", "")))){
	    			return c;
	    		}else if(check2 && (perm2.equalsIgnoreCase(c.getPerm()) || 
	    				perm2.equalsIgnoreCase(c.getShortPerm()) || 
	    				perm2.equalsIgnoreCase(c.getNick()) || 
	    				perm2.equalsIgnoreCase(c.getPerm().replaceAll(".", "")) || 
	    				perm2.equalsIgnoreCase(c.getShortPerm().replaceAll(".", "")))){
	    			return c;
	    		}else if(check1 && (perm1.equalsIgnoreCase(c.getPerm()) || 
	    				perm1.equalsIgnoreCase(c.getShortPerm()) || 
	    				perm1.equalsIgnoreCase(c.getNick()) || 
	    				perm1.equalsIgnoreCase(c.getPerm().replaceAll(".", "")) || 
	    				perm1.equalsIgnoreCase(c.getShortPerm().replaceAll(".", "")))){
	    			return c;
	    		}else if(perm.equalsIgnoreCase(c.getPerm()) || 
	    				perm.equalsIgnoreCase(c.getShortPerm()) ||
	    				perm.equalsIgnoreCase(c.getNick()) || 
	    				perm.equalsIgnoreCase(c.getPerm().replaceAll(".", "")) || 
	    				perm.equalsIgnoreCase(c.getShortPerm().replaceAll(".", ""))){
	    			return c;
	    		}
	    	}
	    }
	    return null;
	}
}
