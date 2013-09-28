package com.gmail.lucario77777777.TBP.commands.KJV;

import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJVNumbers extends KJV{
	public KJVNumbers(Main plugin){
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args, Main plugin){
		String chp = null;
		String v = null;
		String verse = null;
		if(args.length >=3){
			if(args[2].equalsIgnoreCase("?") || args[2].equalsIgnoreCase("info")){
				verse = plugin.getKJVNum().getString("NumInfo");
			}else if(args[2].equalsIgnoreCase("#")){
				verse = plugin.getKJVNum().getString("Num#");
			}else{
				chp = args[2];
				if(args.length == 3){
					v = "1";
				}else if(args[3].equalsIgnoreCase("info") || args[3].equalsIgnoreCase("?") 
						|| args[3].equalsIgnoreCase("#")){
					v = "info";
				}else{
					v = args[3];
				}
			}
		}
		if(chp == null){
			chp = "1";
		}
		if(v == null){
			v = "1";
		}
		try{
			if(verse == null){
				String ref = "ch" + chp + "v" + v;
				verse = plugin.getKJVNum().getString(ref);
			}
			sender.sendMessage(ChatColor.GREEN + verse);
		}catch(Exception e){
			plugin.getLogger().log(Level.SEVERE, "An error occurred. Error: " + e);
			sender.sendMessage(ChatColor.RED + "An error occurred. Error: " + e);
			sender.sendMessage(ChatColor.RED + "Please check to make sure you typed in a verse/ " +
					"chapter number that exists.");
		}
		return true;
	}
}