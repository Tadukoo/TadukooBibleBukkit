package com.gmail.lucario77777777.TBP.commands.KJV;

import com.gmail.lucario77777777.TBP.commands.KJV.KJVGenesis;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJVGenesisCh1 extends KJVGenesis {
	public KJVGenesisCh1(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args[3] == "1" || args[3] == null){
			sender.sendMessage(ChatColor.GREEN + "In the beginning God created the heavens and the earth.");
			return true;
		}else if(args[3] == "2"){
			sender.sendMessage(ChatColor.GREEN + "And the earth was without form, and void; and darkness was upon the face of the deep.");
			return true;
		}else if(args[3] == "3"){
			sender.sendMessage(ChatColor.GREEN + "And God said, Let there be light: and there was light.");
			return true;
		}else if(args[3] == "4"){
			sender.sendMessage(ChatColor.GREEN + "And God saw the light, that it was good: and God divided the light from the darkness.");
			return true;
		}else if(args[3] == "5"){
			sender.sendMessage(ChatColor.GREEN + "And God called the light Day, and the darkness he called Night. And the evening and the morning were the first day.");
			return true;
		}else if(args[3] == "6"){
			sender.sendMessage(ChatColor.GREEN + "And God said, Let there be a firmament in the midst of the waters, and let it divide the waters from the waters.");
			return true;
		}
		return false;
	}
}