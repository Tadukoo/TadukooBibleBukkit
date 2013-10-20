package com.gmail.lucario77777777.TBP;

public class CheckTranslations {
	static Main plugin = Main.instance;
	public static void check() {
		doCheck("KJV");
	}
	
	public static void save() {
		doSave("KJV");
	}
	
	public static void doCheck(String tran) {
		if(plugin.getConfig().getBoolean(tran) == true){
			String type = "";
			if(plugin.getConfig().getString(tran + "BookCheck") != null){
				type = plugin.getConfig().getString(tran + "BookCheck");
			}
			if(type.equalsIgnoreCase("ignore")){
				return;
			}else{
				CheckBooks.check(plugin, tran, type);
			}
		}
	}
	
	public static void doSave(String tran) {
		if(plugin.getConfig().getBoolean(tran) == true){
			plugin.saveigBook(tran);
		}
	}
}
