package com.gmail.realtadukoo.TBP;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import com.gmail.realtadukoo.TBP.cmds.handling.BComExec;
import com.gmail.realtadukoo.TBPB.TBB;
import com.gmail.realtadukoo.TC.TC;

public class TB extends JavaPlugin{
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
	public static FileConfiguration playerRecords = null;
	public static File playerRecordsFile = null;
	
	// Used for statistics.yml file
	public static FileConfiguration statistics = null;
	public static File statisticsFile = null;
	
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
	
	// Used for Tadukoo Bible Books
	public static boolean TadukooBibleBooks;
	public static TBB TadukooBibleBooksClass;
	
	// Used for auto-announcing verses.
	private AutoAnnounce announcer;
	
	@Override
	public void onDisable(){
		// Save player records
		savePlayerRecords();
		
		// Set everything to null to prevent memory leaks
		plugin = null;
		pdfFile = null;
		config = null;
		playerRecords = null;
		playerRecordsFile = null;
		igbook = null;
		igbookFile = null;
		igbookTran = null;
		
		// Save config.yml
		saveConfig();
	}
	@Override
	public void onEnable(){
		// Load players.yml
		reloadPlayerRecords();
		
		// Save players.yml in case the file didn't exist.
		savePlayerRecords();
		
		// Set plugin so other classes may use this class through it.
		plugin = this;
		
		// Set config.yml
		config = getConfig();
		
		// Check config.yml for issues.
		ConfigCheck.run(plugin, config);
		
		// Load the language that will be used.
		reloadLanguage();
		
		// Set permissions to on or off.
		perms = getConfig().getBoolean("permissions");
		
		//Check for other Tadukoo plugins.
		checkTadukooPlugins();
		
		// Load commands from the command executor class.
		getCommand("bible").setExecutor(new BComExec(this, perms));
		getCommand("apocrypha").setExecutor(new BComExec(this, perms));
		getCommand("t").setExecutor(new BComExec(this, perms));
		
		// Register event (PlayerJoinEvent saves UUID and player name)
		getServer().getPluginManager().registerEvents(new BPlayerListener(this), this);
		
		if(config.getBoolean("auto-announce.enabled")){
			announcer = new AutoAnnounce();
			
			new BukkitRunnable(){
			    @Override
			    public void run(){
			    	boolean random = config.getBoolean("auto-announce.randomize-list");
					List<String> verses = config.getStringList("auto-announce.verses");
					
			        announcer.doVerse(plugin, verses, random);
			    }
			}.runTaskTimer(this, 100, 1200*config.getInt("auto-announce.delay"));
		}
	}
	
	/*
	 * Checks for other Tadukoo plugins (Used for /t)
	 */
	private void checkTadukooPlugins(){
		if(getServer().getPluginManager().getPlugin("Tadukoo_Adjustments") != null || 
				getServer().getPluginManager().getPlugin("Tadukoo_Bible_Books") != null || 
				getServer().getPluginManager().getPlugin("Tadukoo_Core") != null ||
				getServer().getPluginManager().getPlugin("Tadukoo_Chat") != null ||
				getServer().getPluginManager().getPlugin("Tadukoo_Essentials") != null ||
				getServer().getPluginManager().getPlugin("Tadukoo_Fake_Op") != null ||
				getServer().getPluginManager().getPlugin("Tadukoo_Mob_Spawning") != null ||
				getServer().getPluginManager().getPlugin("Tadukoo_Perms") != null ||
				getServer().getPluginManager().getPlugin("Tadukoo_Vanilla_Feel") != null){
			otherTPlugin = true;
		}else{
			otherTPlugin = false;
		}
		if(otherTPlugin){
			/*
			 *  Add checks for other plugins and run the classes' updateTadukooPlugins functions.
			 */
			if(getServer().getPluginManager().getPlugin("Tadukoo_Core") != null){
				TadukooCore = true;
				TadukooCoreClass = (TC) getServer().getPluginManager().getPlugin("Tadukoo_Core");
				TadukooCoreClass.updateTadukooPlugins(true, false, false, false, false, false, false, false, 
						false);
			}else{
				TadukooCore = false;
			}
			
			if(getServer().getPluginManager().getPlugin("Tadukoo_Bible_Books") != null){
				TadukooBibleBooks = true;
				TadukooBibleBooksClass = (TBB) getServer().getPluginManager().getPlugin("Tadukoo_Bible_Books");
			}else{
				TadukooBibleBooks = false;
			}
		}else{
			TadukooCore = false;
			TadukooBibleBooks = false;
		}
	}
	
	/*
	 * Used by other Tadukoo plugins so that none are missed.
	 */
	public void updateTadukooPlugins(boolean Bible, boolean BibleBooks, boolean Chat, boolean Core, 
			boolean Essentials, boolean FakeOp, boolean MobSpawning, boolean Perms, boolean VanillaFeel){
		if(BibleBooks){
			TadukooBibleBooks = true;
			TadukooBibleBooksClass = (TBB) getServer().getPluginManager().getPlugin("Tadukoo_Bible_Books");
		}else if(Core){
			TadukooCore = true;
			TadukooCoreClass = (TC) getServer().getPluginManager().getPlugin("Tadukoo_Core");
		}else if(Chat || Essentials || FakeOp || MobSpawning || Perms || VanillaFeel){
			otherTPlugin = true;
		}
	}
	
	/*
	 * Gets a book of the Bible in the translation specified.
	 */
	public FileConfiguration getBook(String bookName, String tran){
		bookFile = new File(getDataFolder(), tran + "/" + bookName + ".yml");
		book = YamlConfiguration.loadConfiguration(bookFile);
		return book;
	}
	
	/*
	 * Loads a yml file for Minecraft books in the translation specified.
	 */
	public void reloadigBook(String bookName, String tran){
	    igbookFile = new File(getDataFolder(), tran + "/" + bookName + "Book.yml");
	    igbook = YamlConfiguration.loadConfiguration(igbookFile);
	    igbookBook = bookName;
	    igbookTran = tran;
	}
	
	/*
	 * Gets a yml file for Minecraft books in the translation specified.
	 */
	public FileConfiguration getigBook(String bookName, String tran){
	    if(igbook == null || (igbookTran != null && tran != igbookTran) || 
	    		(igbookBook != null && bookName != igbookBook)){
	        this.reloadigBook(bookName, tran);
	    }
	    return igbook;
	}
	
	/*
	 * Saves a yml file for Minecraft books in the translation specified.
	 */
	public void saveigBook(String bookName, String tran){
	    if(igbook == null || igbookFile == null){
	    	return;
	    }
	    
	    try{
	        getigBook(bookName, tran).save(igbookFile);
	    }catch(IOException ex){
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
	public void reloadPlayerRecords(){
	    if(playerRecordsFile == null){
	    	playerRecordsFile = new File(getDataFolder(), "players.yml");
	    }
	    
	    playerRecords = YamlConfiguration.loadConfiguration(playerRecordsFile);
	}
	
	/*
	 * Get players.yml
	 */
	public static FileConfiguration getPlayerRecords(){
	    if(playerRecords == null){
	        plugin.reloadPlayerRecords();
	    }
	    return playerRecords;
	}
	
	/*
	 * Save players.yml
	 */
	public static void savePlayerRecords(){
	    if(playerRecords == null || playerRecordsFile == null){
	    	return;
	    }
	    
	    try{
	        getPlayerRecords().save(playerRecordsFile);
	    }catch(IOException ex){
	        plugin.getLogger().log(Level.SEVERE, "Could not save player records to " + playerRecordsFile + ex);
	    }
	}
	
	/*
	 * Load statistics.yml
	 */
	public void reloadStatistics(){
	    if(statisticsFile == null){
	    	statisticsFile = new File(getDataFolder(), "statistics.yml");
	    }
	    
	    statistics = YamlConfiguration.loadConfiguration(statisticsFile);
	}
	
	/*
	 * Get statistics.yml
	 */
	public static FileConfiguration getStatistics(){
	    if(statistics == null){
	        plugin.reloadStatistics();
	    }
	    return statistics;
	}
	
	/*
	 * Save statistics.yml
	 */
	public static void saveStatistics(){
	    if(statistics == null || statisticsFile == null){
	    	return;
	    }
	    
	    try{
	        getStatistics().save(statisticsFile);
	    }catch(IOException ex){
	        plugin.getLogger().log(Level.SEVERE, "Could not save statistics to " + 
	        	statisticsFile + ex);
	    }
	}
	
	/*
	 * Load a language.
	 */
	public void reloadLanguage(){
		String Language = config.getString("language");
		
	    if(languageFile == null){
	    	languageFile = new File(getDataFolder(), "languages/" + Language + ".yml");
	    }
	    
	    language = YamlConfiguration.loadConfiguration(languageFile);
	 
	    Reader defConfigFile = this.getTextResource("languages/" + Language + ".yml");
	    if(defConfigFile == null){
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
	public FileConfiguration getLanguage(boolean Core){
		if(Core && TadukooCore){
			TadukooCoreClass.getLanguage();
		}
		
	    if(language == null){
	        this.reloadLanguage();
	    }
	    
	    return language;
	}
	
	/*
	 * Load playerList.yml
	 */
	public void reloadPlayerList(){
		if(TadukooCore){
			TadukooCoreClass.reloadPlayerList();
		}else{
			if(playersFile == null){
				playersFile = new File(getDataFolder(), "playerList.yml");
			}
			
			players = YamlConfiguration.loadConfiguration(playersFile);
		}
	}
	
	/*
	 * Get a UUID from playerList.yml
	 */
	public UUID getUUID(String player){
		if(TadukooCore){
			return TadukooCoreClass.getUUID(player);
		}else{
			if(players == null){
				plugin.reloadPlayerList();
			}
			
			return UUID.fromString(players.getString(player));
		}
	}
	
	/*
	 * Set a UUID in playerList.yml
	 */
	public void setUUID(String player, UUID ID){
		if(TadukooCore){
			TadukooCoreClass.setUUID(player, ID);
		}else{
			if(players == null){
				plugin.reloadPlayerList();
			}
			
			players.set(player, ID.toString());
		}
	}
	
	/*
	 * Save playerList.yml
	 */
	public void savePlayerList(){
		if(TadukooCore){
			TadukooCoreClass.savePlayerList();
		}else{
			if(players == null || playersFile == null){
				return;
			}
			
			try{
				players.save(playersFile);
			}catch(IOException ex){
				plugin.getLogger().log(Level.SEVERE, "Could not save player records to " + playersFile + ex);
			}
		}
	}
}
