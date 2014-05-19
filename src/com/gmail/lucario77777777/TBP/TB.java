package com.gmail.lucario77777777.TBP;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.lucario77777777.TBP.commands.MainCommandExecutor;

public class TB extends JavaPlugin {
	public static TB plugin;
	PluginDescriptionFile pdfFile = this.getDescription();
	public FileConfiguration book = null;
	public File bookFile = null;
	public FileConfiguration igbook = null;
	public File igbookFile = null;
	public FileConfiguration pRec = null;
	public File pRecFile = null;
	public static TB instance;
	public Boolean perms = null;
	
	@Override
	public void onDisable () {
		savepRec();
		saveConfig();
	}
	@Override
	public void onEnable () {
		instance = this;
		reloadpRec();
		savepRec();
		getConfig().options().copyDefaults(true);
		saveConfig();
		getCommand("bible").setExecutor(new MainCommandExecutor(this));
		perms = getConfig().getBoolean("Permissions");
	}
	
	public FileConfiguration getBook(String tran, String bookName) {
		bookFile = new File(getDataFolder(), "bible/" + tran + "/" + bookName + ".yml");
		book = YamlConfiguration.loadConfiguration(bookFile);
		return book;
	}
	
	public void reloadigBook(String tran) {
	    if (igbookFile == null) {
	    igbookFile = new File(getDataFolder(), "bible/" + tran + "/" + tran + "bookconfig.yml");
	    }
	    igbook = YamlConfiguration.loadConfiguration(igbookFile);
	}
	
	public FileConfiguration getigBook(String tran) {
	    if (igbook == null) {
	        this.reloadigBook(tran);
	    }
	    return igbook;
	}
	
	public void saveigBook(String tran) {
	    if (igbook == null || igbookFile == null) {
	    return;
	    }
	    try {
	        getigBook(tran).save(igbookFile);
	    } catch (IOException ex) {
	        this.getLogger().log(Level.SEVERE, "Could not save config to " + igbookFile + ex);
	    }
	}
	
	public void reloadpRec() {
	    if (pRecFile == null) {
	    pRecFile = new File(getDataFolder(), "players.yml");
	    }
	    pRec = YamlConfiguration.loadConfiguration(pRecFile);
	}
	
	public FileConfiguration getpRec() {
	    if (pRec == null) {
	        this.reloadpRec();
	    }
	    return pRec;
	}
	
	public void savepRec() {
	    if (pRec == null || pRecFile == null) {
	    return;
	    }
	    try {
	        getpRec().save(pRecFile);
	    } catch (IOException ex) {
	        this.getLogger().log(Level.SEVERE, "Could not save player records to " + pRecFile + ex);
	    }
	}
}
