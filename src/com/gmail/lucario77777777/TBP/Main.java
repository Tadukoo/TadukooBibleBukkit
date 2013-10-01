package com.gmail.lucario77777777.TBP;

import java.io.File;

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
	
	@Override
	public void onDisable () {
		saveConfig();
	}
	@Override
	public void onEnable () {
		getConfig().options().copyDefaults(true);
		saveConfig();
		getCommand("bible").setExecutor(new MainCommandExecutor(this));
	}
	
	public FileConfiguration getBook(String translation, String bookName) {
		bookFile = new File(getDataFolder(), "bible/" + translation + "/" + bookName + ".yml");
		book = YamlConfiguration.loadConfiguration(bookFile);
		return book;
	}
}
