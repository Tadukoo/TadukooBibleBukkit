package com.gmail.lucario77777777.TBP;

public class CheckTranslations {
	static Main plugin = Main.instance;
	public static void check() {
		if(plugin.getConfig().getBoolean("KJV") == true){
			CheckBooks.check(plugin, "KJV");
		}
	}
	
	public static void save() {
		if(plugin.getConfig().getBoolean("KJV") == true){
			plugin.saveigBook("KJV");
		}
	}
}
