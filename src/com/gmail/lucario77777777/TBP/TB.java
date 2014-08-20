package com.gmail.lucario77777777.TBP;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.lucario77777777.TBP.commands.CommandExec;

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
		config = getConfig();
		pR = this.getConfig().getBoolean("PlayerRecords");
		perms = getConfig().getBoolean("Permissions");
		getCommand("bible").setExecutor(new CommandExec(this, perms));
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
