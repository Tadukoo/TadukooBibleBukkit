package com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.args;

import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TB.Minecraft.Bukkit.TB;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.Records;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.Verse;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.handling.Args;

public class Last {
	public static void run(TB plugin, CommandSender sender, String playerType, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 2, "/bible last [translation]")){
			return;
		}
		String tran = null;
		if(args.length == 2 && Args.tranCheck(sender, args[1]) != null){
			tran = Args.tranCheck(sender, args[1]);
		}
		String rec[] = Records.getPlayerRecords(plugin, playerType, "verse", sender.getName());
		String bookName = rec[0];
		String chp = rec[1];
		String v = rec[2];
		if(tran == null){
			tran = rec[3];
		}
		/*
		 * TODO: Add check for availability using EnumAvail.
		 * if(!book.isAvailable(tran)){
			Args.bookNotAvailable(sender, book, tran);
			return;
		}*/
		Verse.check(plugin, sender, playerType, bookName, chp, v, tran, "get", null, false, false);
	}
}
