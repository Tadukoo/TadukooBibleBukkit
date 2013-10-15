package com.gmail.lucario77777777.TBP;

public class CheckTranslations {
	static Main plugin = Main.instance;
	public static void check() {
		if(plugin.getConfig().getBoolean("KJV") == true){
			String type = "";
			if(plugin.getConfig().getString("KJVBookCheck") != null){
				type = plugin.getConfig().getString("KJVBookCheck");
			}
			if(type.equalsIgnoreCase("ignore")){
				return;
			}
			CheckBooks.check(plugin, "KJV", type);
		}
	}
	
	public static void save() {
		if(plugin.getConfig().getBoolean("KJV") == true){
			plugin.saveigBook("KJV");
		}
	}
}
