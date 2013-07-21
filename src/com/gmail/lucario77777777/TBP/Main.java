package com.gmail.lucario77777777.TBP;

import java.util.logging.Level;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.lucario77777777.TBP.commands.MainCommandExecutor;

public class Main extends JavaPlugin {
	public static Main plugin;
	PluginDescriptionFile pdfFile = this.getDescription();
	
	@Override
	public void onDisable () {
	}
	@Override
	public void onEnable () {
		getCommand("bible").setExecutor(new MainCommandExecutor(this));
		this.getLogger().log(Level.INFO,"Tadukoo Bible");
	}
}
