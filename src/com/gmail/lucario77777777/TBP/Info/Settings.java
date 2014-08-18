package com.gmail.lucario77777777.TBP.Info;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class Settings {
	public static void settings(CommandSender sender) {
		sender.sendMessage(ChatColor.GREEN + "DefaultTranslation, DefaultBook, DefaultChapter, DefaultVerse, " +
				"Permissions, PlayerRecords, Books, and KJV.");
	}
}
