package com.gmail.realtadukoo.TBP;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.realtadukoo.TBP.commands.handling.BibleCommandExec;
import com.gmail.realtadukoo.TC.TC;

public class TB extends JavaPlugin {
	// Used by other classes to use functions in here
	public static TB plugin;
	
	// plugin.yml
	PluginDescriptionFile pdfFile = this.getDescription();
	
	// config.yml
	public static FileConfiguration config;
	
	// Used for <book>.yml files
	public FileConfiguration book = null;
	public File bookFile = null;
	
	// Used for Minecraft book yml files (<book>Book.yml)
	public FileConfiguration igbook = null;
	public File igbookFile = null;
	public String igbookTran = null;
	public String igbookBook = null;
	
	// Used for players.yml file
	public static FileConfiguration pRec = null;
	public static File pRecFile = null;
	
	// Used for language files
	public static FileConfiguration language = null;
	public static File languageFile = null;
	
	// Used for playerList.yml
	public static FileConfiguration players;
	public static File playersFile;
	
	// Used for if permissions are on or off
	public Boolean perms = null;
	
	// Used for /t, for other Tadukoo plugins
	public static boolean otherTPlugin;
	public static boolean TadukooCore;
	public static TC TadukooCoreClass;
	
	@Override
	public void onDisable () {
		// Save player records
		savepRec();
		
		// Set everything to null to prevent memory leaks
		plugin = null;
		pdfFile = null;
		config = null;
		pRec = null;
		pRecFile = null;
		igbook = null;
		igbookFile = null;
		igbookTran = null;
		
		// Save config.yml
		saveConfig();
	}
	@Override
	public void onEnable () {
		// Load players.yml
		reloadpRec();
		
		// Save players.yml in case the file didn't exist.
		savepRec();
		
		// Set plugin so other classes may use this class through it.
		plugin = this;
		
		// Set config.yml
		config = getConfig();
		
		// Check config.yml for issues.
		ConfigCheck.run(plugin, config);
		
		// Load the language that will be used.
		reloadLanguage();
		
		// Set permissions to on or off.
		perms = getConfig().getBoolean("Permissions");
		
		//Check for other Tadukoo plugins.
		checkForOtherTadukooPlugins();
		
		// Load commands from the command executor class.
		getCommand("bible").setExecutor(new BibleCommandExec(this, perms));
		getCommand("apocrypha").setExecutor(new BibleCommandExec(this, perms));
		getCommand("t").setExecutor(new BibleCommandExec(this, perms));
		
		// Register event (PlayerJoinEvent saves UUID and player name)
		getServer().getPluginManager().registerEvents(new BiblePlayerListener(this), this);
	}
	
	/*
	 * Checks for other Tadukoo plugins (Used for /t)
	 */
	private void checkForOtherTadukooPlugins() {
		if(getServer().getPluginManager().getPlugin("Tadukoo_Adjustments") != null || 
				getServer().getPluginManager().getPlugin("Tadukoo_Bible_Books") != null || 
				getServer().getPluginManager().getPlugin("Tadukoo_Essentials") != null ||
				getServer().getPluginManager().getPlugin("Tadukoo_Fake_Op") != null ||
				getServer().getPluginManager().getPlugin("Tadukoo_Mob_Spawning") != null ||
				getServer().getPluginManager().getPlugin("Tadukoo_Perms") != null ||
				getServer().getPluginManager().getPlugin("Tadukoo_Vanilla_Feel") != null){
			otherTPlugin = true;
		}else{
			otherTPlugin = false;
		}
		if(getServer().getPluginManager().getPlugin("Tadukoo_Core") != null){
			TadukooCore = true;
			TadukooCoreClass = (TC) getServer().getPluginManager().getPlugin("Tadukoo_Core");
		}else{
			TadukooCore = false;
		}
	}
	
	/*
	 * Gets a book of the Bible in the translation specified.
	 */
	public FileConfiguration getBook(String bookName, String tran) {
		bookFile = new File(getDataFolder(), tran + "/" + bookName + ".yml");
		book = YamlConfiguration.loadConfiguration(bookFile);
		return book;
	}
	
	/*
	 * Loads a yml file for Minecraft books in the translation specified.
	 */
	public void reloadigBook(String bookName, String tran) {
	    igbookFile = new File(getDataFolder(), tran + "/" + bookName + "Book.yml");
	    igbook = YamlConfiguration.loadConfiguration(igbookFile);
	    igbookBook = bookName;
	    igbookTran = tran;
	}
	
	/*
	 * Gets a yml file for Minecraft books in the translation specified.
	 */
	public FileConfiguration getigBook(String bookName, String tran) {
	    if (igbook == null || (igbookTran != null && tran != igbookTran) || 
	    		(igbookBook != null && bookName != igbookBook)) {
	        this.reloadigBook(bookName, tran);
	    }
	    return igbook;
	}
	
	/*
	 * Saves a yml file for Minecraft books in the translation specified.
	 */
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
	
	/*
	 * Load players.yml
	 */
	public void reloadpRec() {
	    if (pRecFile == null) {
	    	pRecFile = new File(getDataFolder(), "players.yml");
	    }
	    pRec = YamlConfiguration.loadConfiguration(pRecFile);
	}
	
	/*
	 * Get players.yml
	 */
	public static FileConfiguration getpRec() {
	    if (pRec == null) {
	        plugin.reloadpRec();
	    }
	    return pRec;
	}
	
	/*
	 * Save players.yml
	 */
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
	
	/*
	 * Load a language.
	 */
	public void reloadLanguage(){
		String Language = config.getString("language");
		
	    if (languageFile == null) {
	    	languageFile = new File(getDataFolder(), "languages/" + Language + ".yml");
	    }
	    language = YamlConfiguration.loadConfiguration(languageFile);
	 
	    Reader defConfigFile = this.getTextResource("languages/" + Language + ".yml");
	    if (defConfigFile == null) {
	    	this.getLogger().log(Level.WARNING, "Couldn't find " + Language + " language file in plugin!");
	    	this.getLogger().log(Level.WARNING, "Setting to en_US...");
	    	config.set("language", "en_US");
	    	saveConfig();
	    	defConfigFile = this.getTextResource("languages/en_US.yml");
	    }
	    YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigFile);
	    language.setDefaults(defConfig);
	}
	
	/*
	 * Get a language.
	 */
	public FileConfiguration getLanguage() {
	    if (language == null) {
	        this.reloadLanguage();
	    }
	    return language;
	}
	
	/*
	 * Load playerList.yml
	 */
	public void reloadPlayerList() {
		if(TadukooCore){
			TadukooCoreClass.reloadPlayerList();
		}else{
			if (playersFile == null) {
				playersFile = new File(getDataFolder(), "playerList.yml");
			}
			players = YamlConfiguration.loadConfiguration(playersFile);
		}
	}
	
	/*
	 * Get playerList.yml
	 */
	public FileConfiguration getPlayerList() {
		if(TadukooCore){
			return TadukooCoreClass.getPlayerList();
		}else{
			if (players == null) {
				plugin.reloadPlayerList();
			}
			return players;
		}
	}
	
	/*
	 * Save playerList.yml
	 */
	public void savePlayerList() {
		if(TadukooCore){
			TadukooCoreClass.savePlayerList();
		}else{
			if (players == null || playersFile == null) {
				return;
			}
			try {
				getPlayerList().save(playersFile);
			} catch (IOException ex) {
				plugin.getLogger().log(Level.SEVERE, "Could not save player records to " + playersFile + ex);
			}
		}
	}
}
