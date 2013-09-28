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
	public FileConfiguration KJVNumbers = null;
	public File KJVNumbersFile = null;
	public FileConfiguration KJV1John = null;
	public File KJV1JohnFile = null;
	public FileConfiguration KJV2John = null;
	public File KJV2JohnFile = null;
	public FileConfiguration KJV3John = null;
	public File KJV3JohnFile = null;
	
	@Override
	public void onDisable () {
		saveConfig();
		saveKJVGenesisConfig();
		saveKJV1JohnConfig();
		saveKJV2JohnConfig();
		saveKJV3JohnConfig();
	}
	@Override
	public void onEnable () {
		getConfig().options().copyDefaults(true);
		saveConfig();
		reloadKJVGenesisConfig();
		getKJVGenesisConfig().options().copyDefaults(true);
		saveKJVGenesisConfig();
		reloadKJVNumbersConfig();
		getKJVNumbersConfig().options().copyDefaults(true);
		saveKJVNumbersConfig();
		reloadKJV1JohnConfig();
		getKJV1JohnConfig().options().copyDefaults(true);
		saveKJV1JohnConfig();
		reloadKJV2JohnConfig();
		getKJV2JohnConfig().options().copyDefaults(true);
		saveKJV2JohnConfig();
		reloadKJV3JohnConfig();
		getKJV3JohnConfig().options().copyDefaults(true);
		saveKJV3JohnConfig();
		getCommand("bible").setExecutor(new MainCommandExecutor(this));
		this.getLogger().log(Level.INFO,"Tadukoo Bible");
	}
	
	public void reloadKJVGenesisConfig() {
	    if (KJVGenesisFile == null || KJVGenesis == null) {
	    KJVGenesisFile = new File(getDataFolder(), "bible/KJV/Genesis.yml");
	    }
	    KJVGenesis = YamlConfiguration.loadConfiguration(KJVGenesisFile);
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
	
	public void reloadKJVNumbersConfig() {
		if (KJVNumbersFile == null || KJVNumbers == null) {
			KJVNumbersFile = new File(getDataFolder(), "bible/KJV/Numbers.yml");
		}
		KJVNumbers = YamlConfiguration.loadConfiguration(KJVNumbersFile);
		InputStream defConfigStream = this.getResource("bible/KJV/Numbers.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			KJVNumbers.setDefaults(defConfig);
		}
	}
	
	public FileConfiguration getKJVNumbersConfig() {
		if (KJVNumbers == null || KJVNumbersFile == null) {
			this.reloadKJVNumbersConfig();
		}
		return KJVNumbers;
	}
	
	public void saveKJVNumbersConfig() {
		if (KJVNumbers == null || KJVNumbersFile == null) {
			return;
		}
		try {
			getKJVNumbersConfig().save(KJVNumbersFile);
		} catch (IOException ex) {
			this.getLogger().log(Level.SEVERE, "Could not save config to " + KJVNumbersFile + ex);
		}
	}
	
	public void reloadKJV1JohnConfig() {
	    if (KJV1JohnFile == null || KJV1John == null) {
	    KJV1JohnFile = new File(getDataFolder(), "bible/KJV/1John.yml");
	    }
	    KJV1John = YamlConfiguration.loadConfiguration(KJV1JohnFile);
	    InputStream defConfigStream = this.getResource("bible/KJV/1John.yml");
	    if (defConfigStream != null) {
	        YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
	        KJV1John.setDefaults(defConfig);
	    }
	}
	
	public FileConfiguration getKJV1JohnConfig() {
	    if (KJV1John == null || KJV1JohnFile == null) {
	        this.reloadKJV1JohnConfig();
	    }
	    return KJV1John;
	}
	
	public void saveKJV1JohnConfig() {
	    if (KJV1John == null || KJV1JohnFile == null) {
	    return;
	    }
	    try {
	        getKJV1JohnConfig().save(KJV1JohnFile);
	    } catch (IOException ex) {
	        this.getLogger().log(Level.SEVERE, "Could not save config to " + KJV1JohnFile + ex);
	    }
	}
	
	public void reloadKJV2JohnConfig() {
		if (KJV2JohnFile == null || KJV2John == null){
			KJV2JohnFile = new File(getDataFolder(), "bible/KJV/2John.yml");
		}
		KJV2John = YamlConfiguration.loadConfiguration(KJV2JohnFile);
		InputStream defConfigStream = this.getResource("bible/KJV/2John.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			KJV2John.setDefaults(defConfig);
		}
	}
	
	public FileConfiguration getKJV2JohnConfig() {
		if (KJV2John == null || KJV2JohnFile == null) {
			this.reloadKJV2JohnConfig();
		}
		return KJV2John;
	}
	
	public void saveKJV2JohnConfig() {
		if (KJV2John == null || KJV2JohnFile == null) {
			return;
		}
		try {
			getKJV2JohnConfig().save(KJV2JohnFile);
		} catch (IOException ex) {
			this.getLogger().log(Level.SEVERE, "Could not save config to " + KJV2JohnFile + ex);
		}
	}
	
	public void reloadKJV3JohnConfig() {
		if (KJV3JohnFile == null || KJV3John == null){
			KJV3JohnFile = new File(getDataFolder(), "bible/KJV/3John.yml");
		}
		KJV3John = YamlConfiguration.loadConfiguration(KJV3JohnFile);
		InputStream defConfigStream = this.getResource("bible/KJV/3John.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			KJV3John.setDefaults(defConfig);
		}
	}
	
	public FileConfiguration getKJV3JohnConfig() {
		if (KJV3John == null || KJV3JohnFile == null) {
			this.reloadKJV3JohnConfig();
		}
		return KJV3John;
	}
	
	public void saveKJV3JohnConfig() {
		if (KJV3John == null || KJV3JohnFile == null){
			return;
		}
		try {
			getKJV3JohnConfig().save(KJV3JohnFile);
		} catch (IOException ex) {
			this.getLogger().log(Level.SEVERE, "Could not save config to " + KJV3JohnFile + ex);
		}
	}
}
