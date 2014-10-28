package com.gmail.realtadukoo.TBP;

import java.util.logging.Level;

import org.bukkit.configuration.file.FileConfiguration;

import com.gmail.realtadukoo.TBP.Enums.EnumBooks;
import com.gmail.realtadukoo.TBP.Enums.EnumChps;
import com.gmail.realtadukoo.TBP.Enums.EnumTrans;
import com.gmail.realtadukoo.TBP.commands.handling.Checks;

public class ConfigCheck {
	public static void run(TB plugin, FileConfiguration config){
		String version = plugin.pdfFile.getVersion();
		boolean ver = config.getString("Version") == version;
		if(!ver){
			config.set("Version", version);
			plugin.saveConfig();
		}
		boolean check;
		if(config.getString("startup-checks") != null){
			check = config.getBoolean("startup-checks");
		}else{
			check = true;
			config.set("startup-checks", true);
			plugin.saveConfig();
		}
		String language = config.getString("language");
		if(language.equalsIgnoreCase("English") || language.equalsIgnoreCase("en")){
			config.set("language", "en_US");
			plugin.saveConfig();
		}else{
			plugin.reloadLanguage();
			// reloadLanguage() will keep it the same or change it to en_US.
		}		
		if(check || !ver){
			String tran;
			String bookName;
			String chp;
			String v;
			String part;
			int chapter;
			int verse;
			EnumBooks book = EnumBooks.GENESIS;
			EnumChps echp = EnumChps.GENESIS;
			EnumTrans etran = EnumTrans.KJV;
			if(config.getString("DefaultTranslation") != null){
				tran = config.getString("DefaultTranslation");
				if(etran.fromString(tran) == null){
					plugin.getLogger().log(Level.WARNING, "DefaultTranslation: " + tran + " does not exist!");
					plugin.getLogger().log(Level.WARNING, "Setting DefaultTranslation to KJV...");
					config.set("DefaultTranslation", "KJV");
					plugin.saveConfig();
				}else{
					tran = etran.fromString(tran).getTran();
				}
			}else{
				tran = "KJV";
				config.set("DefaultTranslation", tran);
				plugin.saveConfig();
			}
			if(!config.getBoolean(tran)){
				plugin.getLogger().log(Level.WARNING, "DefaultTranslation: " + tran + " is marked as " +
						"unavailable later in config!");
				plugin.getLogger().log(Level.WARNING, "Setting " + tran + " to true...");
				config.set(tran, true);
				plugin.saveConfig();
			}
			int i = 0;
			while(i < 66){
				bookName = book.numtoBook(i + 1, "int", null, null);
				book = book.fromString(bookName);
				if(book.isAvailable(tran)){
					if(!Checks.checkForYML(plugin, null, bookName, tran)){
						plugin.getLogger().log(Level.SEVERE, "It appears that " + bookName + ".yml is " +
								"missing! This will cause issues!");
						plugin.getLogger().log(Level.SEVERE, "Please make sure you put the Tadukoo_Bible " +
								"folder into your plugins folder.");
					}
				}
				i++;
			}
			if(config.getString("DefaultBook") != null){
				bookName = config.getString("DefaultBook");
				book = book.fromString(bookName);
				bookName = book.getBook();
				if(!book.isAvailable(tran)){
					plugin.getLogger().log(Level.WARNING, "DefaultBook:" + bookName + " is not available in " +
							"the " + tran + "translation. Setting to Genesis...");
					config.set("DefaultBook", "Genesis");
					plugin.saveConfig();
				}
			}else{
				bookName = "Genesis";
				config.set("DefaultBook", bookName);
				plugin.saveConfig();
			}
			if(config.getString("DefaultChapter") != null){
				chp = config.getString("DefaultChapter");
				book = book.fromString(bookName);
				chapter = Integer.parseInt(chp);
				if(chapter < 1 || chapter > book.getChp()){
					plugin.getLogger().log(Level.WARNING, "DefaultChapter: " + chp + " does not exist in " + 
							bookName + ". Setting to 1.");
					config.set("DefaultChapter", "1");
					plugin.saveConfig();
				}
			}else{
				chp = "1";
				chapter = 1;
				book = book.fromString(bookName);
				config.set("DefaultChapter", "1");
				plugin.saveConfig();
			}
			if(config.getString("DefaultVerse") != null){
				v = config.getString("DefaultVerse");
				echp = echp.fromString(bookName, 0);
				verse = Integer.parseInt(v);
				if(verse < 1 || verse > echp.getNum(chapter)){
					plugin.getLogger().log(Level.WARNING, "DefaultVerse: " + v + " does not exist in " + 
							bookName + " Chapter " + chp + ". Setting to 1.");
					config.set("DefaultVerse", "1");
					plugin.saveConfig();
				}
			}else{
				v = "1";
				verse = 1;
				config.set("DefaultVerse", v);
				plugin.saveConfig();
			}
			if(config.getString("DefaultPart") != null){
				part = config.getString("DefaultPart");
				if(plugin.getigBook(bookName, tran).getString("Book" + part + ".1") == null){
					plugin.getLogger().log(Level.WARNING, bookName + " Book " + part + " does not exist. " +
							"Setting to 1.");
					config.set("DefaultPart", "1");
					plugin.saveConfig();
				}
			}else{
				part = "1";
				config.set("DefaultPart", "1");
				plugin.saveConfig();
			}
			if(config.getString("Permissions") == null){
				config.set("Permissions", true);
				plugin.saveConfig();
			}
			if(config.getString("Books") == null){
				config.set("Books", true);
				plugin.saveConfig();
			}
			if(config.getString("KJV") == null){
				config.set("KJV", true);
			}
		}
	}
}
