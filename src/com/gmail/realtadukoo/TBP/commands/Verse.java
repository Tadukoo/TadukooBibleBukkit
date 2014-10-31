package com.gmail.realtadukoo.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumBooks;
import com.gmail.realtadukoo.TBP.Enums.EnumChps;
import com.gmail.realtadukoo.TBP.commands.handling.Args;
import com.gmail.realtadukoo.TBP.commands.handling.Checks;

public class Verse {
	public static void read(TB plugin, CommandSender sender, String bookName, String chp, String v, String tran,
			EnumBooks book, EnumChps echp){
		if(Integer.parseInt(chp) > book.getChp()){
			String error = plugin.getLanguage().getString("command.error.chpdoesntexist");
			error = error.replaceAll("\\{book\\}", bookName);
			sender.sendMessage(ChatColor.RED + error);
			return;
		}
		if(Integer.parseInt(v) > echp.getNum(Integer.parseInt(chp))){
			String error = plugin.getLanguage().getString("command.error.vdoesntexist");
			error = error.replaceAll("\\{book\\}", bookName);
			error = error.replaceAll("\\{chp\\}", chp);
			sender.sendMessage(ChatColor.RED + error);
			return;
		}
		if(!book.isAvailable(tran)){
			Args.bookNotAvailable(sender, book, tran);
			return;
		}
		if(!Checks.checkForYML(plugin, sender, bookName, tran)){
			return;
		}
		String pName = sender.getName();
		String ref = References.makeRef(book, chp, v);
		if(!References.checkRef(plugin, sender, bookName, tran, ref)){
			return;
		}
		Sending.sendVerseToPlayer(plugin, sender, pName, bookName, chp, v, tran, ref);
	}
}
