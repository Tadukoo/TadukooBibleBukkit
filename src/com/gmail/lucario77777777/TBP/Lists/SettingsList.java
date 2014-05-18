package com.gmail.lucario77777777.TBP.Lists;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class SettingsList {
	public static void settings(CommandSender sender) {
		sender.sendMessage(ChatColor.GREEN + "DefaultTranslation, Permissions, PlayerRecords, KJV, " +
				"BookConfigChapterNotifications, and KJVBookCheck.");
	}
}
