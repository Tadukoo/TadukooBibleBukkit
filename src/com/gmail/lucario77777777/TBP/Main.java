package com.gmail.lucario77777777.TBP;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.lucario77777777.TBP.commands.MainCommandExecutor;

public class Main extends JavaPlugin {
    public final Logger logger = Logger.getLogger("Minecraft");
	public static Main plugin;
	PluginDescriptionFile pdfFile = this.getDescription();
	
	@Override
	public void onDisable () {
		getLogger().info("Tadukoo Bible is disabled!");
	}
	@Override
	public void onEnable () {
		getLogger().info("Tadukoo Bible is enabled!");
		getCommand("bible").setExecutor(new MainCommandExecutor(this));
	}
}
