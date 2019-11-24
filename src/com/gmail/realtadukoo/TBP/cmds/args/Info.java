package com.gmail.realtadukoo.TBP.cmds.args;

import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TB.Constants.EnumBible;
import com.gmail.realtadukoo.TB.Constants.EnumTranslation;
import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumCmds;
import com.gmail.realtadukoo.TBP.Enums.EnumPerms;
import com.gmail.realtadukoo.TBP.cmds.Information;
import com.gmail.realtadukoo.TBP.cmds.handling.Args;
import com.gmail.realtadukoo.TBP.cmds.handling.Checks;

public class Info {
	public static void run(TB plugin, CommandSender sender, String[] args, String playerType, boolean permsOn){
		if(Args.argsLengthCheck(sender, args, 1, 4, "/bible info [translation|book|\"plugin\"|" +
				"\"translations|\"\"books\"]")){
			return;
		}
		EnumCmds cmds = EnumCmds.INFO;
		EnumPerms perms = EnumPerms.STAR;
		if(args.length >= 2){
			if(EnumTranslation.fromAbbreviation(args[1]) != null && Checks.permCheck(playerType, plugin, sender, "bible",
					"info.translation", permsOn)){
				Information.tranInfo(sender, plugin, EnumTranslation.fromAbbreviation(args[1]));
				return;
			}else if(Args.isBook(cmds, args, 1) != null && Checks.permCheck(playerType, plugin, sender,
					"bible", "info.book", permsOn)){
				EnumBible book = Args.isBook(cmds, args, 1);
				Information.bookInfo(sender, plugin, book.getBook());
				return;
			}else if(Args.isCmd(cmds, args[1]) != null){
				cmds = Args.isCmd(cmds, args[1]);
				String cmd = cmds.getCmd();
				if(cmd.equalsIgnoreCase("translation") && Checks.permCheck(playerType, plugin, sender, "bible",
						"info.translation", permsOn)){
					Information.tranList(sender, plugin);
					return;
				}else if(cmd.equalsIgnoreCase("books") && Checks.permCheck(playerType, plugin, sender, "bible",
						"info.book", permsOn)){
					String part = "1";
					if(args.length == 3){
						part = args[2];
					}
					Information.booksList(sender, part);
					return;
				}else if(cmd.equalsIgnoreCase("permission") && Checks.permCheck(playerType, plugin, sender, 
						"bible", "info.permission", permsOn)){
					Information.perms(sender);
					return;
				}
			}else if(perms.fromString(args[1]) != null && Checks.permCheck(playerType, plugin, sender, "bible",
					"info.permission", permsOn)){
				perms = perms.fromString(args[1]);
				Information.permInfo(sender, perms);
				return;
			}
		}
		if(!Checks.permCheck(playerType, plugin, sender, "bible", "info.plugin", permsOn)){
			return;
		}
		Information.pluginInfo(plugin, sender);
	}
}
