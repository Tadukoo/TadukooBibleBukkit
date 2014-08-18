package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;

public class Send {
	@SuppressWarnings("deprecation")
	public static void send(TB plugin, CommandSender sender, String pName, EnumBooks book, String bookName,
			String chp, String v, String tran){
		Player player = plugin.getServer().getPlayer(pName);
		if(player.isOnline()){
			String ref = MainCommandExecutor.makeRef(book, chp, v);
			if(!MainCommandExecutor.checkRef(plugin, sender, bookName, tran, ref)){
				return;
			}
			MainCommandExecutor.sendVerseToOtherPlayer(plugin, player, bookName, chp, v, tran, ref);
		}else{
			sender.sendMessage(ChatColor.RED + pName + " is not online!");
		}
	}
}
