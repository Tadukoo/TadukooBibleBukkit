package com.gmail.realtadukoo.TBP;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import org.bukkit.configuration.file.FileConfiguration;

import com.gmail.realtadukoo.TB.Bible.EnumTranslations;
import com.gmail.realtadukoo.TB.Constants.EnumBible;

public class ConfigCheck{
	/*
	 * Checks config.yml for errors.
	 */
	public static void run(TB plugin, FileConfiguration config){
		// Version = current plugin version.
		String version = plugin.pdfFile.getVersion();
		
		// ver = whether config file's defined plugin version matches actual plugin version.
		// (Used to help decide if a check is needed)
		boolean ver = config.getString("version") == version;
		
		// Check decides whether the config will be checked or not.
		boolean check = false;
		
		if(!ver){
			// If config version doesn't match actual version, config will be checked.
			config.set("version", version);
			plugin.saveConfig();
			check = true;
		}
		
		// If check is still false, check startup-checks whether to check config or not.
		if(config.getString("startup-checks") != null && !check){
			check = config.getBoolean("startup-checks");
		}else{
			// Set check and startup-checks to true if above failed.
			check = true;
			config.set("startup-checks", true);
			plugin.saveConfig();
		}
		// Get config's language setting.
		String language = config.getString("language");
		
		// If language is "English" rather than a language code, set it to en_US.
		if(language.equalsIgnoreCase("English") || language.equalsIgnoreCase("en")){
			config.set("language", "en_US");
			plugin.saveConfig();
		}else{
			// If not, use reloadLanguage() to set it.
			plugin.reloadLanguage();
			// reloadLanguage() will keep it the same or change it to en_US.
		}
		
		// If check is true, check this stuff.
		if(check){
			String tran; // Translation
			String bookName; // Book Name
			String chp; // Chapter
			String v; // Verse
			String part; // Part
			int chapter; // Chapter as a number rather than a string
			int verse; // Verse as a number rather than a string
			
			// If default translation is set in config, check that it exists, and set it to KJV if it doesn't. 
			if(config.getString("default.translation") != null){
				tran = config.getString("default.translation");
				if(EnumTranslations.fromAbbreviation(tran) == null){
					plugin.getLogger().log(Level.WARNING, "default.translation: " + tran + " does not exist!");
					plugin.getLogger().log(Level.WARNING, "Setting default.translation to KJV...");
					config.set("default.translation", "KJV");
					plugin.saveConfig();
				}else{
					// If default translation set in config exists, set tran to it.
					tran = EnumTranslations.fromAbbreviation(tran).getAbbreviation();
				}
			}else{
				// If no default translation is set, set it to KJV.
				tran = "KJV";
				config.set("DefaultTranslation", tran);
				plugin.saveConfig();
			}
			
			// Check that default translation is available in the config.
			if(!config.getBoolean(tran)){
				// If it isn't, set it to true.
				plugin.getLogger().log(Level.WARNING, "default.translation: " + tran + " is marked as " +
						"unavailable later in config!");
				plugin.getLogger().log(Level.WARNING, "Setting " + tran + " to true...");
				config.set(tran, true);
				plugin.saveConfig();
			}
			
			// Check that the yml files exist for all available books for the default translation.
			/*int i = 0;
			while(i < 66){
				EnumBible book = EnumBible.fromInt(i);
				 * TODO: Add check for availability using EnumAvail.
				 * if(book.isAvailable(tran)){
					if(!Checks.checkForYML(plugin, null, bookName, tran)){
						plugin.getLogger().log(Level.SEVERE, "It appears that " + bookName + ".yml is " +
								"missing! This will cause issues!");
						plugin.getLogger().log(Level.SEVERE, "Please make sure you put the Tadukoo_Bible " +
								"folder into your plugins folder.");
					}
				}
				i++;
			}*/
			
			// Check if default book is set.
			if(config.getString("default.book") != null){
				// If so, make sure it's available in the default translation.
				bookName = config.getString("default.book");
				/*EnumBible book = EnumBible.fromBook(bookName);
				 * TODO: Add check for availability using EnumAvail.
				 * if(!book.isAvailable(tran)){
					// If not, set it to Genesis.
					plugin.getLogger().log(Level.WARNING, "default.book:" + bookName + " is not available " +
							"in the " + tran + "translation. Setting to Genesis...");
					config.set("default.book", "Genesis");
					plugin.saveConfig();
				}*/
			}else{
				// If no default book is set, set it to Genesis.
				bookName = "Genesis";
				config.set("default.book", bookName);
				plugin.saveConfig();
			}
			
			// Check if a default chapter is set in the config.
			if(config.getString("default.chapter") != null){
				// If so, make sure it exists for the default book.
				chp = config.getString("default.chapter");
				EnumBible book = EnumBible.fromBook(bookName);
				chapter = Integer.parseInt(chp);
				if(chapter < 1 || chapter > book.getNumChapters()){
					// Set it to 1 if it doesn't exist.
					plugin.getLogger().log(Level.WARNING, "default.chapter: " + chp + " does not exist in " + 
							bookName + ". Setting to 1.");
					config.set("default.chapter", "1");
					plugin.saveConfig();
				}
			}else{
				// If default chapter is not set in the config, set it to 1.
				chp = "1";
				chapter = 1;
				config.set("default.chapter", "1");
				plugin.saveConfig();
			}
			
			// Check if default verse is set in the config.
			if(config.getString("default.verse") != null){
				// If so, check that it exists in the default chapter in the default book.
				v = config.getString("default.verse");
				EnumBible book = EnumBible.fromBook(bookName);
				verse = Integer.parseInt(v);
				if(verse < 1 || verse > book.getNum(chapter)){
					// If not, set it to 1.
					plugin.getLogger().log(Level.WARNING, "default.verse: " + v + " does not exist in " + 
							bookName + " Chapter " + chp + ". Setting to 1.");
					config.set("default.verse", "1");
					plugin.saveConfig();
				}
			}else{
				// If default verse is not set in the config, set it to 1.
				v = "1";
				verse = 1;
				config.set("default.verse", v);
				plugin.saveConfig();
			}
			
			// Check if default part is set in the config.
			if(config.getString("default.part") != null){
				// If so, check that it exists in the default book.
				part = config.getString("default.part");
				if(plugin.getigBook(bookName, tran).getString("Book" + part + ".1") == null){
					// If it doesn't exist, set it to 1.
					plugin.getLogger().log(Level.WARNING, bookName + " Book " + part + " does not exist. " +
							"Setting to 1.");
					config.set("default.part", "1");
					plugin.saveConfig();
				}
			}else{
				// If default part is not set in the config, set it to 1.
				part = "1";
				config.set("default.part", "1");
				plugin.saveConfig();
			}
			
			// If permissions isn't set, set it to true.
			if(config.getString("permissions") == null){
				config.set("permissions", true);
				plugin.saveConfig();
			}
			
			// If books isn't set, set it to true.
			if(config.getString("books") == null){
				config.set("books", true);
				plugin.saveConfig();
			}
			
			// If debug isn't set, set it to false.
			if(config.getString("debug") == null){
				config.set("debug", false);
				plugin.saveConfig();
			}
			
			// If player statistics isn't set, set it to true.
			if(config.getString("statistics.player.enabled") == null){
				config.set("statistics.player.enabled", true);
				plugin.saveConfig();
			}
			
			// If plugin statistics isn't set, set it to true.
			if(config.getString("statistics.plugin") == null){
				config.set("statistics.plugin", true);
				plugin.saveConfig();
			}
			
			// If KJV isn't set, set it to true.
			if(config.getString("KJV") == null){
				config.set("KJV", true);
			}
			
			// If OEB isn't set, set it to true.
			if(config.getString("OEB") == null){
				config.set("OEB", true);
			}
			
			// If auto-announce.enabled isn't set, set it to false by default.
			if(config.getString("auto-announce.enabled") == null){
				config.set("auto-announce.enabled", false);
			}
			
			// If auto-announce.randomize-list isn't set, set it to false by default.
			if(config.getString("auto-announce.randomize-list") == null){
				config.set("auto-announce.randomize-list", false);
			}
			
			// If auto-announce.delay isn't set, set it to 1 minute by default.
			if(config.getString("auto-announce.delay") == null){
				config.set("auto-announce.delay", 1);
			}
			
			// If auto-announce.verses isn't set, give it some verses.
			if(config.getStringList("auto-announce.verses") == null ||
					config.getStringList("auto-announce.verses").isEmpty()){
				List<String> verses = new ArrayList<String>();
				verses.add("Genesis 1:1");
				verses.add("John 3:16");
				verses.add("random");
				config.set("auto-announce.verses", verses);
			}
			
			// Save the config at this point.
			plugin.saveConfig();
		}
	}
}
