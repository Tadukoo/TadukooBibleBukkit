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
	public FileConfiguration KJVExo = null;
	public File KJVExoFile = null;
	public FileConfiguration KJVLev = null;
	public File KJVLevFile = null;
	public FileConfiguration KJVNum = null;
	public File KJVNumFile = null;
	public FileConfiguration KJVDeu = null;
	public File KJVDeuFile = null;
	public FileConfiguration KJVMat = null;
	public File KJVMatFile = null;
	public FileConfiguration KJVMark = null;
	public File KJVMarkFile =null;
	public FileConfiguration KJVLuke = null;
	public File KJVLukeFile = null;
	public FileConfiguration KJVJohn = null;
	public File KJVJohnFile = null;
	public FileConfiguration KJV1John = null;
	public File KJV1JohnFile = null;
	public FileConfiguration KJV2John = null;
	public File KJV2JohnFile = null;
	public FileConfiguration KJV3John = null;
	public File KJV3JohnFile = null;
	public FileConfiguration Test = null;
	public File TestFile = null;
	
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
		reloadKJVExo();
		reloadKJVLev();
		reloadKJVNum();
		//reloadKJVDeu();
		//reloadKJVMat();
		//reloadKJVMark();
		//reloadKJVLuke();
		//reloadKJVJohn();
		reloadKJV1John();
		reloadKJV2John();
		reloadKJV3John();
	}
	
	public void defaultKJV() {
		getKJVGen().options().copyDefaults(true);
		getKJVExo().options().copyDefaults(true);
		getKJVLev().options().copyDefaults(true);
		getKJVNum().options().copyDefaults(true);
		//getKJVDeu().options().copyDefaults(true);
		//getKJVMat().options().copyDefaults(true);
		//getKJVMark().options().copyDefaults(true);
		//getKJVLuke().options().copyDefaults(true);
		//getKJVJohn().options().copyDefaults(true);
		getKJV1John().options().copyDefaults(true);
		getKJV2John().options().copyDefaults(true);
		getKJV3John().options().copyDefaults(true);
	}
	
	public void saveKJV() {
		saveKJVGen();
		saveKJVExo();
		saveKJVLev();
		saveKJVNum();
		//saveKJVDeu();
		//saveKJVMat();
		//saveKJVMark();
		//saveKJVLuke();
		//saveKJVJohn();
		saveKJV1John();
		saveKJV2John();
		saveKJV3John();
	}
	
	/*
	 * Genesis.yml
	*/
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
	
	/*
	 * Exodus.yml
	*/
	public void reloadKJVExo() {
		if (KJVExoFile == null || KJVExo == null) {
			KJVExoFile = new File(getDataFolder(), "bible/KJV/Exodus.yml");
		}
		KJVExo = YamlConfiguration.loadConfiguration(KJVExoFile);
		InputStream defConfigStream = this.getResource("bible/KJV/Exodus.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			KJVExo.setDefaults(defConfig);
		}
	}
	
	public FileConfiguration getKJVExo() {
		if(KJVExoFile == null || KJVExo == null) {
			this.reloadKJVExo();
		}
		return KJVExo;
	}
	
	public void saveKJVExo() {
		if (KJVExoFile == null || KJVExo == null){
			return;
		}
		try {
			getKJVExo().save(KJVExoFile);
		} catch (IOException ex) {
			this.getLogger().log(Level.SEVERE, "Could not save config to " + KJVExoFile + ex);
		}
	}
	
	/*
	 * Leviticus.yml
	 */
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
	
	/*
	 * Numbers.yml
	 */
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
	
	/*
	 * Deuteronomy.yml
	 */
	public void reloadKJVDeu() {
		if (KJVDeuFile == null || KJVDeu == null) {
			KJVDeuFile = new File(getDataFolder(), "bible/KJV/Deuteronomy.yml");
		}
		KJVDeu = YamlConfiguration.loadConfiguration(KJVDeuFile);
		InputStream defConfigStream = this.getResource("bible/KJV/Deuteronomy.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
			KJVDeu.setDefaults(defConfig);
		}
	}
	
	public FileConfiguration getKJVDeu() {
		if (KJVDeuFile == null || KJVDeu == null){
			this.reloadKJVDeu();
		}
		return KJVDeu;
	}
	
	public void saveKJVDeu() {
		if (KJVDeu == null || KJVDeuFile == null) {
			return;
		}
		try {
			getKJVDeu().save(KJVDeuFile);
		} catch (IOException ex) {
			this.getLogger().log(Level.SEVERE, "Could not save config to " + KJVDeuFile + ex);
		}
	}
	
	/*
	 * Matthew.yml
	 */
	public void reloadKJVMat() {
		if (KJVMatFile == null || KJVMat == null) {
			KJVMatFile = new File(getDataFolder(), "bible/KJV/Matthew.yml");
		}
		KJVMat = YamlConfiguration.loadConfiguration(KJVMatFile);
		InputStream defConfigStream = this.getResource("bible/KJV/Matthew.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(KJVMatFile);
			KJVMat.setDefaults(defConfig);
		}
	}
	
	public FileConfiguration getKJVMat() {
		if (KJVMat == null || KJVMatFile == null) {
			this.reloadKJVMat();
		}
		return KJVMat;
	}
	
	public void saveKJVMat() {
		if (KJVMat == null || KJVMatFile == null) {
			return;
		}
		try {
			getKJVMat().save(KJVMatFile);
		} catch (IOException ex) {
			this.getLogger().log(Level.SEVERE, "Could not save config to " + KJVMatFile + ex);
		}
	}
	
	/*
	 * Mark.yml
	 */
	public void reloadKJVMark() {
		if (KJVMarkFile == null || KJVMark == null) {
			KJVMarkFile = new File(getDataFolder(), "bible/KJV/Mark.yml");
		}
		KJVMark = YamlConfiguration.loadConfiguration(KJVMarkFile);
		InputStream defConfigStream = this.getResource("bible/KJV/Mark.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(KJVMarkFile);
			KJVMark.setDefaults(defConfig);
		}
	}
	
	public FileConfiguration getKJVMark() {
		if (KJVMark == null || KJVMarkFile == null) {
			this.reloadKJVMark();
		}
		return KJVMark;
	}
	
	public void saveKJVMark() {
		if (KJVMark == null || KJVMarkFile == null) {
			return;
		}
		try {
			getKJVMark().save(KJVMarkFile);
		} catch (IOException ex) {
			this.getLogger().log(Level.SEVERE, "Could not save config to " + KJVMarkFile + ex);
		}
	}
	
	/*
	 * Luke.yml
	 */
	public void reloadKJVLuke() {
		if (KJVLukeFile == null || KJVLuke == null) {
			KJVLukeFile = new File(getDataFolder(), "bible/KJV/Luke.yml");
		}
		KJVLuke = YamlConfiguration.loadConfiguration(KJVLukeFile);
		InputStream defConfigStream = this.getResource("bible/KJV/Luke.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(KJVLukeFile);
			KJVLuke.setDefaults(defConfig);
		}
	}
	
	public FileConfiguration getKJVLuke() {
		if (KJVLuke == null || KJVLukeFile == null) {
			this.reloadKJVLuke();
		}
		return KJVLuke;
	}
	
	public void saveKJVLuke() {
		if (KJVLuke == null || KJVLukeFile == null) {
			return;
		}
		try {
			getKJVLuke().save(KJVLukeFile);
		} catch (IOException ex) {
			this.getLogger().log(Level.SEVERE, "Could not save config to " + KJVLukeFile + ex);
		}
	}
	
	/*
	 * John.yml
	 */
	public void reloadKJVJohn() {
		if (KJVJohnFile == null || KJVJohn == null) {
			KJVJohnFile = new File(getDataFolder(), "bible/KJV/John.yml");
		}
		KJVJohn = YamlConfiguration.loadConfiguration(KJVJohnFile);
		InputStream defConfigStream = this.getResource("bible/KJV/John.yml");
		if (defConfigStream != null) {
			YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(KJVJohnFile);
			KJVJohn.setDefaults(defConfig);
		}
	}
	
	public FileConfiguration getKJVJohn() {
		if (KJVJohn == null || KJVJohnFile == null) {
			this.reloadKJVJohn();
		}
		return KJVJohn;
	}
	
	public void saveKJVJohn() {
		if (KJVJohn == null || KJVJohnFile == null) {
			return;
		}
		try {
			getKJVJohn().save(KJVJohnFile);
		} catch (IOException ex) {
			this.getLogger().log(Level.SEVERE, "Could not save config to " + KJVJohnFile + ex);
		}
	}
	
	/*
	 * 1John.yml
	 */
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
	
	/*
	 * 2John.yml
	 */
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
	
	/*
	 * 3John.yml
	 */
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
