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
	public FileConfiguration KJVGen = null;
	public File KJVGenFile = null;
	public FileConfiguration KJVLev = null;
	public File KJVLevFile = null;
	public FileConfiguration KJVNum = null;
	public File KJVNumFile = null;
	public FileConfiguration KJV1John = null;
	public File KJV1JohnFile = null;
	public FileConfiguration KJV2John = null;
	public File KJV2JohnFile = null;
	public FileConfiguration KJV3John = null;
	public File KJV3JohnFile = null;
	
	@Override
	public void onDisable () {
		saveConfig();
		saveKJV();
	}
	@Override
	public void onEnable () {
		getConfig().options().copyDefaults(true);
		saveConfig();
		reloadKJV();
		defaultKJV();
		saveKJV();
		getCommand("bible").setExecutor(new MainCommandExecutor(this));
	}
	
	public void reloadKJV() {
		reloadKJVGen();
		reloadKJVLev();
		reloadKJVNum();
		reloadKJV1John();
		reloadKJV2John();
		reloadKJV3John();
	}
	
	public void defaultKJV() {
		getKJVGen().options().copyDefaults(true);
		getKJVLev().options().copyDefaults(true);
		getKJVNum().options().copyDefaults(true);
		getKJV1John().options().copyDefaults(true);
		getKJV2John().options().copyDefaults(true);
		getKJV3John().options().copyDefaults(true);
	}
	
	public void saveKJV() {
		saveKJVGen();
		saveKJVLev();
		saveKJVNum();
		saveKJV1John();
		saveKJV2John();
		saveKJV3John();
	}
	
	public void reloadKJVGen() {
	    if (KJVGenFile == null || KJVGen == null) {
	    KJVGenFile = new File(getDataFolder(), "bible/KJV/Genesis.yml");
	    }
	    KJVGen = YamlConfiguration.loadConfiguration(KJVGenFile);
	    InputStream defConfigStream = this.getResource("bible/KJV/Genesis.yml");
	    if (defConfigStream != null) {
	        YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
	        KJVGen.setDefaults(defConfig);
	    }
	}
	
	public FileConfiguration getKJVGen() {
	    if (KJVGen == null || KJVGenFile == null) {
	        this.reloadKJVGen();
	    }
	    return KJVGen;
	}
	
	public void saveKJVGen() {
	    if (KJVGen == null || KJVGenFile == null) {
	    return;
	    }
	    try {
	        getKJVGen().save(KJVGenFile);
	    } catch (IOException ex) {
	        this.getLogger().log(Level.SEVERE, "Could not save config to " + KJVGenFile + ex);
	    }
	}
	
	public void reloadKJVLev() {
		if (KJVLevFile == null || KJVLev == null) {
			KJVLevFile = new File(getDataFolder(), "bible/KJV/Leviticus.yml");
		}
		KJVLev = YamlConfiguration.loadConfiguration(KJVLevFile);
		InputStream defConfigStream = this.getResource("bible/KJV/Leviticus.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			KJVLev.setDefaults(defConfig);
		}
	}
	
	public FileConfiguration getKJVLev() {
		if (KJVLev == null || KJVLevFile == null){
			this.reloadKJVLev();
		}
		return KJVLev;
	}
	
	public void saveKJVLev() {
		if (KJVLev == null || KJVLevFile == null) {
		    return;
		    }
		    try {
		        getKJVLev().save(KJVLevFile);
		    } catch (IOException ex) {
		        this.getLogger().log(Level.SEVERE, "Could not save config to " + KJVLevFile + ex);
		    }
	}
	
	public void reloadKJVNum() {
		if (KJVNumFile == null || KJVNum == null) {
			KJVNumFile = new File(getDataFolder(), "bible/KJV/Numbers.yml");
		}
		KJVNum = YamlConfiguration.loadConfiguration(KJVNumFile);
		InputStream defConfigStream = this.getResource("bible/KJV/Numbers.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			KJVNum.setDefaults(defConfig);
		}
	}
	
	public FileConfiguration getKJVNum() {
		if (KJVNum == null || KJVNumFile == null) {
			this.reloadKJVNum();
		}
		return KJVNum;
	}
	
	public void saveKJVNum() {
		if (KJVNum == null || KJVNumFile == null) {
			return;
		}
		try {
			getKJVNum().save(KJVNumFile);
		} catch (IOException ex) {
			this.getLogger().log(Level.SEVERE, "Could not save config to " + KJVNumFile + ex);
		}
	}
	
	public void reloadKJV1John() {
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
	
	public FileConfiguration getKJV1John() {
	    if (KJV1John == null || KJV1JohnFile == null) {
	        this.reloadKJV1John();
	    }
	    return KJV1John;
	}
	
	public void saveKJV1John() {
	    if (KJV1John == null || KJV1JohnFile == null) {
	    return;
	    }
	    try {
	        getKJV1John().save(KJV1JohnFile);
	    } catch (IOException ex) {
	        this.getLogger().log(Level.SEVERE, "Could not save config to " + KJV1JohnFile + ex);
	    }
	}
	
	public void reloadKJV2John() {
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
	
	public FileConfiguration getKJV2John() {
		if (KJV2John == null || KJV2JohnFile == null) {
			this.reloadKJV2John();
		}
		return KJV2John;
	}
	
	public void saveKJV2John() {
		if (KJV2John == null || KJV2JohnFile == null) {
			return;
		}
		try {
			getKJV2John().save(KJV2JohnFile);
		} catch (IOException ex) {
			this.getLogger().log(Level.SEVERE, "Could not save config to " + KJV2JohnFile + ex);
		}
	}
	
	public void reloadKJV3John() {
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
	
	public FileConfiguration getKJV3John() {
		if (KJV3John == null || KJV3JohnFile == null) {
			this.reloadKJV3John();
		}
		return KJV3John;
	}
	
	public void saveKJV3John() {
		if (KJV3John == null || KJV3JohnFile == null){
			return;
		}
		try {
			getKJV3John().save(KJV3JohnFile);
		} catch (IOException ex) {
			this.getLogger().log(Level.SEVERE, "Could not save config to " + KJV3JohnFile + ex);
		}
	}
}
