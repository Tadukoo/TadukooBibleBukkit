package com.gmail.lucario77777777.TBP;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumChps;
import com.gmail.lucario77777777.TBP.Enums.EnumTrans;
import com.gmail.lucario77777777.TBP.cmdhandling.Checks;
import com.gmail.lucario77777777.TBP.cmdhandling.CommandExec;

public class TB extends JavaPlugin {
	public static TB plugin;
	PluginDescriptionFile pdfFile = this.getDescription();
	public static FileConfiguration config;
	public FileConfiguration book = null;
	public File bookFile = null;
	public FileConfiguration igbook = null;
	public File igbookFile = null;
	public String igbookTran = null;
	public String igbookBook = null;
	public static FileConfiguration pRec = null;
	public static File pRecFile = null;
	public Boolean perms = null;
	public static boolean pR;
	
	@Override
	public void onDisable () {
		savepRec();
		plugin = null;
		pdfFile = null;
		config = null;
		pRec = null;
		pRecFile = null;
		igbook = null;
		igbookFile = null;
		igbookTran = null;
		saveConfig();
	}
	@Override
	public void onEnable () {
		reloadpRec();
		savepRec();
		plugin = this;
		config = getConfig();
		pR = this.getConfig().getBoolean("PlayerRecords");
		perms = getConfig().getBoolean("Permissions");
		configCheck(plugin, config);
		getCommand("bible").setExecutor(new CommandExec(this, perms));
	}
	
	private static void configCheck(TB plugin, FileConfiguration config){
		String tran;
		String bookName;
		String chp;
		String v;
		String part;
		int chapter;
		int verse;
		EnumBooks book = EnumBooks.GENESIS;
		EnumChps echp = EnumChps.GENESIS;
		EnumTrans etran = EnumTrans.KJV;
		if(config.getString("DefaultTranslation") != null){
			tran = config.getString("DefaultTranslation");
			if(etran.fromString(tran) == null){
				plugin.getLogger().log(Level.WARNING, "DefaultTranslation: " + tran + " does not exist!");
				plugin.getLogger().log(Level.WARNING, "Setting DefaultTranslation to KJV...");
				config.set("DefaultTranslation", "KJV");
				plugin.saveConfig();
			}else{
				tran = etran.fromString(tran).getTran();
			}
		}else{
			tran = "KJV";
			config.set("DefaultTranslation", tran);
			plugin.saveConfig();
		}
		if(!config.getBoolean(tran)){
			plugin.getLogger().log(Level.WARNING, "DefaultTranslation: " + tran + " is marked as " +
					"unavailable later in config!");
			plugin.getLogger().log(Level.WARNING, "Setting " + tran + " to true...");
			config.set(tran, true);
			plugin.saveConfig();
		}
		int i = 0;
		while(i < 66){
			bookName = book.numtoBook(i + 1, "int", null, null);
			book = book.fromString(bookName);
			if(book.isAvailable(tran)){
				if(!Checks.checkForYML(plugin, null, bookName, tran)){
					plugin.getLogger().log(Level.SEVERE, "It appears that " + bookName + ".yml is missing! " +
							"This will cause issues!");
					plugin.getLogger().log(Level.SEVERE, "Please make sure you put the Tadukoo_Bible folder " +
							"into your plugins folder.");
				}
			}
			i++;
		}
		if(config.getString("DefaultBook") != null){
			bookName = config.getString("DefaultBook");
			book = book.fromString(bookName);
			bookName = book.getBook();
			if(!book.isAvailable(tran)){
				plugin.getLogger().log(Level.WARNING, "DefaultBook:" + bookName + " is not available in " +
						"the " + tran + "translation. Setting to Genesis...");
				config.set("DefaultBook", "Genesis");
				plugin.saveConfig();
			}
		}else{
			bookName = "Genesis";
			config.set("DefaultBook", bookName);
			plugin.saveConfig();
		}
		if(config.getString("DefaultChapter") != null){
			chp = config.getString("DefaultChapter");
			book = book.fromString(bookName);
			chapter = Integer.parseInt(chp);
			if(chapter < 1 || chapter > book.getChp()){
				plugin.getLogger().log(Level.WARNING, "DefaultChapter: " + chp + " does not exist in " + 
						bookName + ". Setting to 1.");
				config.set("DefaultChapter", "1");
				plugin.saveConfig();
			}
		}else{
			chp = "1";
			chapter = 1;
			book = book.fromString(bookName);
			config.set("DefaultChapter", "1");
			plugin.saveConfig();
		}
		if(config.getString("DefaultVerse") != null){
			v = config.getString("DefaultVerse");
			echp = echp.fromString(bookName);
			verse = Integer.parseInt(v);
			if(verse < 1 || verse > echp.getNum(chapter)){
				plugin.getLogger().log(Level.WARNING, "DefaultVerse: " + v + " does not exist in " + 
						bookName + " Chapter " + chp + ". Setting to 1.");
				config.set("DefaultVerse", "1");
				plugin.saveConfig();
			}
		}else{
			v = "1";
			verse = 1;
			config.set("DefaultVerse", v);
			plugin.saveConfig();
		}
		if(config.getString("DefaultPart") != null){
			part = config.getString("DefaultPart");
			if(plugin.getigBook(bookName, tran).getString("Book" + part + ".1") == null){
				plugin.getLogger().log(Level.WARNING, bookName + " Book " + part + " does not exist. " +
						"Setting to 1.");
				config.set("DefaultPart", "1");
				plugin.saveConfig();
			}
		}else{
			part = "1";
			config.set("DefaultPart", "1");
			plugin.saveConfig();
		}
		if(config.getString("Permissions") == null){
			config.set("Permissions", true);
			plugin.saveConfig();
		}
		if(config.getString("PlayerRecords") == null){
			config.set("PlayerRecords", true);
			plugin.saveConfig();
		}
		if(config.getString("Books") == null){
			config.set("Books", true);
			plugin.saveConfig();
		}
		if(config.getString("KJV") == null){
			config.set("KJV", true);
		}
	}
	
	public FileConfiguration getBook(String bookName, String tran) {
		bookFile = new File(getDataFolder(), tran + "/" + bookName + ".yml");
		book = YamlConfiguration.loadConfiguration(bookFile);
		return book;
	}
	
	public void reloadigBook(String bookName, String tran) {
	    igbookFile = new File(getDataFolder(), tran + "/" + bookName + "Book.yml");
	    igbook = YamlConfiguration.loadConfiguration(igbookFile);
	    igbookBook = bookName;
	    igbookTran = tran;
	}
	
	public FileConfiguration getigBook(String bookName, String tran) {
	    if (igbook == null || (igbookTran != null && tran != igbookTran) || 
	    		(igbookBook != null && bookName != igbookBook)) {
	        this.reloadigBook(bookName, tran);
	    }
	    return igbook;
	}
	
	public void saveigBook(String bookName, String tran) {
	    if (igbook == null || igbookFile == null) {
	    return;
	    }
	    try {
	        getigBook(bookName, tran).save(igbookFile);
	    } catch (IOException ex) {
	        this.getLogger().log(Level.SEVERE, "Could not save config to " + igbookFile + ex);
	    }
	    igbook = null;
	    igbookFile = null;
	    igbookBook = null;
	    igbookTran = null;
	}
	
	public void reloadpRec() {
	    if (pRecFile == null) {
	    pRecFile = new File(getDataFolder(), "players.yml");
	    }
	    pRec = YamlConfiguration.loadConfiguration(pRecFile);
	}
	
	public static FileConfiguration getpRec() {
	    if (pRec == null) {
	        plugin.reloadpRec();
	    }
	    return pRec;
	}
	
	public static void savepRec() {
	    if (pRec == null || pRecFile == null) {
	    return;
	    }
	    try {
	        getpRec().save(pRecFile);
	    } catch (IOException ex) {
	        plugin.getLogger().log(Level.SEVERE, "Could not save player records to " + pRecFile + ex);
	    }
	}
}
