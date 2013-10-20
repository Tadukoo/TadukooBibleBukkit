package com.gmail.lucario77777777.TBP;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.lucario77777777.TBP.commands.MainCommandExecutor;

public class Main extends JavaPlugin {
	public static Main plugin;
	PluginDescriptionFile pdfFile = this.getDescription();
	public FileConfiguration book = null;
	public File bookFile = null;
	public FileConfiguration igbook = null;
	public File igbookFile = null;
	public static Main instance;
	
	@Override
	public void onDisable () {
		saveConfig();
		CheckTranslations.save();
	}
	@Override
	public void onEnable () {
		instance = this;
		getConfig().options().copyDefaults(true);
		saveConfig();
		getCommand("bible").setExecutor(new MainCommandExecutor(this));
		CheckTranslations.check();
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
}
