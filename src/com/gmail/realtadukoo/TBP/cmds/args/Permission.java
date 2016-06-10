package com.gmail.realtadukoo.TBP.cmds.args;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumPerms;
import com.gmail.realtadukoo.TBP.cmds.Information;
import com.gmail.realtadukoo.TBP.cmds.handling.Args;

public class Permission {
	public static void run(TB plugin, CommandSender sender, String[] args){
		if(Args.argsLengthCheck(sender, args, 1, 2, "/bible permission [permission]")){
			return;
		}
		EnumPerms perms = EnumPerms.STAR;
		if(args.length >= 2){
			if(perms.fromString(args[1]) != null){
				perms = perms.fromString(args[1]);
				Information.permInfo(sender, perms);
				return;
			}else{
				sender.sendMessage(ChatColor.RED + "An error occured.");
				return;
			}
		}else{
			Information.perms(sender);
		}
	}
}
