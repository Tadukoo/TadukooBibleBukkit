package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.lucario77777777.TBP.TB;

public class GetBook {
	public static void getbook(TB plugin, CommandSender sender, String[] args, String playerType,
			String bookName, String chp, String v, String tran, boolean pR){
		String bookType = "get";
		String p = null;
		bookName = chp;
		String part = v;
		if(args.length >= 2){
			bookName = args[1];
			if(bookName.equalsIgnoreCase("previous") || bookName.equalsIgnoreCase("pre")
					|| bookName.equalsIgnoreCase("prev") || bookName.equalsIgnoreCase("back")
					|| bookName.equalsIgnoreCase("before") || bookName.equalsIgnoreCase("b4")){
				Player player = (Player) sender;
				String pl = player.toString();
				bookName = plugin.getpRec().getString(pl + ".lastbook.book");
				part = plugin.getpRec().getString(pl + "lastbook.part");
				tran = plugin.getpRec().getString(pl + ".lastbook.tran");
				Book.previous(plugin, sender, playerType, tran, bookName, part, bookType, p);
				return;
			}else if(bookName.equalsIgnoreCase("next") || bookName.equalsIgnoreCase("forward")
					|| bookName.equalsIgnoreCase("for") || bookName.equalsIgnoreCase("after")
					|| bookName.equalsIgnoreCase("and") || bookName.equalsIgnoreCase("aft")){
				Player player = (Player) sender;
				String pl = player.toString();
				bookName = plugin.getpRec().getString(pl + ".lastbook.book");
				part = plugin.getpRec().getString(pl + ".lastbook.part");
				tran = plugin.getpRec().getString(pl + ".lastbook.tran");
				Book.next(plugin, sender, playerType, tran, bookName, part, bookType, p);
				return;
			}else if(bookName.equalsIgnoreCase("last") || bookName.equalsIgnoreCase("saved")
					|| bookName.equalsIgnoreCase("save") || bookName.equalsIgnoreCase("load")){
				Player player = (Player) sender;
				String pl = player.toString();
				bookName = plugin.getpRec().getString(pl + ".lastbook.book");
				part = plugin.getpRec().getString(pl + ".lastbook.part");
				tran = plugin.getpRec().getString(pl + ".lastbook.tran");
			}
			if(args.length >= 3){
				part = args[2];
				if(args.length >= 4){
					tran = args[3].toUpperCase();
					if(MainCommandExecutor.tranCheck(plugin, sender, tran) == false){
						return;
					}
					if(args.length >= 5){
						if(args[4].equalsIgnoreCase("?")){
							Book.contains(plugin, sender, tran, bookName, part);
							return;
						}
					}
				}
			}
		}
		if(pR == true){
			Player player = (Player) sender;
			String pl = player.toString();
			plugin.getpRec().set(pl + ".lastbook.book", bookName);
			plugin.getpRec().set(pl + ".lastbook.part", part);
			plugin.getpRec().set(pl + ".lastbook.tran", tran);
			plugin.savepRec();
		}
		Book.Run(plugin, sender, playerType, tran, bookName, part, bookType, p);
		return;
	}
}
