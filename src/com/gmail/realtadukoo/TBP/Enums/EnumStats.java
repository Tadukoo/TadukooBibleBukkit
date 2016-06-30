package com.gmail.realtadukoo.TBP.Enums;

public enum EnumStats{
	VERSESREQUESTED("verses-requested", "Number of verses read by the player.", 
			new String[]{"verses-read", "v-requested", "v-read", "versesrequested", 
			"versesread", "vrequested", "vrequested", "vread"}), 
	
	VERSESRECEIVED("verses-received", "Number of verses received from other players.", 
			new String[]{"verses-got", "verses-in", "v-received", "v-got", "v-in", 
			"versesreceived", "versesgot", "versesin", "vreceived", "vgot", "vin"}),
	
	VERSESSENT("verses-sent", "Number of verses sent to other players.", 
			new String[]{"verses-delivered", "verses-given", "verses-out", "v-sent", 
			"v-delivered", "v-out", "v-given", "versessent", "versesdelivered", "verses-given", 
			"versesout", "vsent", "vdelivered", "vgiven", "vout"}),
	
	VERSESFAVORITED("verses-favorited", "Number of verses the player has favorited.",
			new String[]{"verses-faved", "verses-fav", "verses-liked", "v-favorited", 
			"v-faved", "v-fav", "v-liked", "versesfavorited", "versesfaved", "versesfav",
			"versesliked", "vfavorited", "vfaved", "vfav", "vliked"}),
			
	VERSESANNOUNCED("verses-announced", "Number of verses the player has announced.", 
			new String[]{"verses-ann", "verses-broadcast", "verses-broad", "verses-shout",
			"verses-yell", "v-announced", "v-ann", "v-broadcast", "v-broad", "v-shout", "v-yell",
			"versesannounced", "versesann", "versesbroadcast", "versesbroad", "versesshout",
			"versesyell", "vannounced", "vann", "vbroadcast", "vbroad", "vshout", "vyell"}),
	
	BOOKSREQUESTED("books-requested", "Number of books gotten by the player.", 
			new String[]{"books-read", "b-requested", "b-read", "booksrequested", "booksread",
			"brequested", "bread"}),
	
	BOOKSRECEIVED("books-received", "Number of books received from other players.",
			new String[]{"books-got", "books-in", "b-received", "b-got", "b-in",
			"booksreceived", "booksgot", "booksin", "breceived", "bgot", "bin"}),
	
	BOOKSSENT("books-sent", "Number of books sent to other players.",
			new String[]{"books-delivered", "books-given", "books-out", "b-sent", "b-delivered",
			"b-given", "b-out", "bookssent", "booksdelivered", "booksgiven", "booksout",
			"bsent", "bdelivered", "bgiven", "bout"});
	
	private String statistic;
	private String description;
	private String[] aliases;
	
	private EnumStats(String statistic, String description, String[] aliases){
		this.statistic = statistic;
		this.description = description;
		this.aliases = aliases;
	}
	
	public String getStatistic(){
		return statistic;
	}
	
	public String getDescription(){
		return description;
	}
	
	public String[] getAliases(){
		return aliases;
	}
	
	public EnumStats fromString(String command){
		if(command != null){
			for(EnumStats c: EnumStats.values()){
				if(command.equalsIgnoreCase(c.getStatistic())){
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
}
