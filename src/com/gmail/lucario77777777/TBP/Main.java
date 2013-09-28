package com.gmail.lucario77777777.TBP;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.lucario77777777.TBP.commands.MainCommandExecutor;

public class Main extends JavaPlugin {
	public static Main plugin;
	PluginDescriptionFile pdfFile = this.getDescription();
	public FileConfiguration KJVGenesis = null;
	public File KJVGenesisFile = null;
	
	@Override
	public void onDisable () {
		saveConfig();
		saveKJVGenesisConfig();
	}
	@Override
	public void onEnable () {
		getConfig().options().copyDefaults(true);
		saveConfig();
		reloadKJVGenesisConfig();
		getKJVGenesisConfig().options().copyDefaults(true);
		saveKJVGenesisConfig();
		getCommand("bible").setExecutor(new MainCommandExecutor(this));
		this.getLogger().log(Level.INFO,"Tadukoo Bible");
	}
	
	public void reloadKJVGenesisConfig() {
	    if (KJVGenesisFile == null || KJVGenesis == null) {
	    KJVGenesisFile = new File(getDataFolder(), "bible/KJV/Genesis.yml");
	    }
	    KJVGenesis = YamlConfiguration.loadConfiguration(KJVGenesisFile);
	 
	    // Look for defaults in the jar
	    InputStream defConfigStream = this.getResource("bible/KJV/Genesis.yml");
	    if (defConfigStream != null) {
	        YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
	        KJVGenesis.setDefaults(defConfig);
	    }
	}
	
	public FileConfiguration getKJVGenesisConfig() {
	    if (KJVGenesis == null || KJVGenesisFile == null) {
	        this.reloadKJVGenesisConfig();
	    }
	    return KJVGenesis;
	}
	
	public void saveKJVGenesisConfig() {
	    if (KJVGenesis == null || KJVGenesisFile == null) {
	    return;
	    }
	    try {
	        getKJVGenesisConfig().save(KJVGenesisFile);
	    } catch (IOException ex) {
	        this.getLogger().log(Level.SEVERE, "Could not save config to " + KJVGenesisFile + ex);
	    }
	}
}
