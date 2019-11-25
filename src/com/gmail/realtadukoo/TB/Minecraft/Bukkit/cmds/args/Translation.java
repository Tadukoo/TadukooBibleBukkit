package com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.args;

import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TB.API.Constants.EnumTranslation;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.TB;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.Information;
import com.gmail.realtadukoo.TB.Minecraft.Bukkit.cmds.handling.Args;

public class Translation {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 2, "/bible translation [translation]")){
			return;
		}
		if(args.length == 2 && Args.tranCheck(sender, args[1]) != null){
			String tran = Args.tranCheck(sender, args[1]);
			EnumTranslation etran = EnumTranslation.fromAbbreviation(tran);
			Information.tranInfo(sender, plugin, etran);
			return;
		}
		Information.tranList(sender, plugin);
	}
}
