package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumCmds;
import com.gmail.lucario77777777.TBP.Enums.EnumPerms;
import com.gmail.lucario77777777.TBP.Enums.EnumTrans;
import com.gmail.lucario77777777.TBP.cmdhandling.Args;
import com.gmail.lucario77777777.TBP.cmdhandling.Checks;
import com.gmail.lucario77777777.TBP.cmdhandling.Information;

public class Info {
	public static void run(TB plugin, CommandSender sender, String[] args, String playerType, boolean permsOn){
		if(Args.argsLengthCheck(sender, args, 1, 4, "/bible info [translation|book|\"plugin\"|" +
				"\"translations|\"\"books\"]")){
			return;
		}
		EnumTrans etran = EnumTrans.KJV;
		EnumBooks book = EnumBooks.GENESIS;
		EnumCmds cmds = EnumCmds.INFO;
		EnumPerms perms = EnumPerms.STAR;
		if(args.length >= 2){
			if(etran.fromString(args[1]) != null && Checks.permCheck(playerType, plugin, sender, "bible",
					"info.translation", permsOn)){
				etran = etran.fromString(args[1]);
				Information.tranInfo(sender, plugin, etran);
				return;
			}else if(Args.isBook(book, cmds, args, 1) != null && Checks.permCheck(playerType, plugin, sender,
					"bible", "info.book", permsOn)){
				book = Args.isBook(book, cmds, args, 1);
				Information.bookInfo(sender, plugin, book);
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
				}
			}else if(args[1].equalsIgnoreCase("permissions") && Checks.permCheck(playerType, plugin, sender,
					"bible", "info.permission", permsOn)){
				Information.perms(sender);
				return;
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
