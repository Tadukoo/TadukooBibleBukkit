package com.gmail.realtadukoo.TBP.cmds.args;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.realtadukoo.TB.Constants.EnumBible;
import com.gmail.realtadukoo.TB.Constants.EnumTranslation;
import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumCmds;
import com.gmail.realtadukoo.TBP.cmds.Book;
import com.gmail.realtadukoo.TBP.cmds.Randomize;
import com.gmail.realtadukoo.TBP.cmds.handling.Args;

public class Getbook {
	public static void run(TB plugin, CommandSender sender, String playerType, String[] args, boolean permsOn){
		if(Args.argsLengthCheck(sender, args, 1, 7, "/bible getbook [book] [part] [translation] " +
				"[?] or /bible getbook list")){
			return;
		}
		String pName = sender.getName();
		EnumCmds cmds = EnumCmds.GETBOOK;
		EnumTranslation etran = EnumTranslation.fromAbbreviation(TB.config.getString("default.translation"));
		EnumBible book = EnumBible.fromBook(TB.config.getString("default.book"));
		String part = plugin.getConfig().getString("default.part");
		String bookName = book.getBook();
		String tran = etran.getAbbreviation();
		String specArg = null;
		int i = 1;
		boolean random = false, list = false, previous = false, next = false, last = false;
		boolean bookSet = false, partSet = false, tranSet = false;
		while(args.length >= i + 1 && args[i] != null){
			if(!list && args[i].equalsIgnoreCase("list")){
				list = true;
				i++;
			}else if(!random && cmds.fromString(args[i]) == EnumCmds.RANDOM){
				random = true;
				i++;
			}else if(!bookSet && Args.isBook(cmds, args, i) != null){
				book = Args.isBook(cmds, args, i);
				bookName = book.getBook();
				i = Args.getCurrentArg(cmds, args, i);
			}else if(!tranSet && Args.tranCheck(sender, args[i]) != null){
				tran = Args.tranCheck(sender, args[i]);
				tranSet = true;
				i++;
			}else if(!previous && cmds.containsCommand("previous", args[i])){
				previous = true;
				specArg = args[i];
				i++;
			}else if(!next && cmds.containsCommand("next", args[i])){
				next = true;
				specArg = args[i];
				i++;
			}else if(!last && cmds.fromString(args[i]) == EnumCmds.LAST){
				last = true;
				i++;
			}else{
				try{
					if(!partSet){
						int p = Integer.parseInt(args[i]);
						part = String.valueOf(p);
						i++;
						partSet = true;
					}else if(args[i].equalsIgnoreCase("?")){
						Book.contains(plugin, sender, bookName, part, tran);
						return;
					}else{
						Args.unknownArg(plugin, sender, args[i]);
						return;
					}
				}catch(NumberFormatException e){
					if(args[i].equalsIgnoreCase("?")){
						Book.contains(plugin, sender, bookName, part, tran);
						return;
					}else{
						Args.unknownArg(plugin, sender, args[i]);
						return;
					}
				}
			}
		}
		if(previous || next || last){
			@SuppressWarnings("deprecation")
			Player player = plugin.getServer().getPlayer(pName);
			String ID = player.getUniqueId().toString();
			bookName = TB.getPlayerRecords().getString(ID + ".lastbook.book");
			part = TB.getPlayerRecords().getString(ID + ".lastbook.part");
			if(!tranSet){
				tran = TB.getPlayerRecords().getString(ID + ".lastbook.tran");
			}
			if(previous){
				String type = "part";
				if(specArg.contains(":")){
					type = specArg.split(":")[1];
				}
				if(bookName.equalsIgnoreCase("Genesis") && part.equalsIgnoreCase("1")){
					sender.sendMessage(ChatColor.RED + "Sorry, Genesis Part 1 is the first book. You can't go "
							+ "before it!");
					return;
				}else if(type.equalsIgnoreCase("book") && bookName.equalsIgnoreCase("Genesis") && 
						part.equalsIgnoreCase("1")){
					sender.sendMessage(ChatColor.RED + "Sorry, Genesis is the first book of the Bible. You "
							+ "can't go before it!");
					return;
				}else if(!(type.equalsIgnoreCase("part") || type.equalsIgnoreCase("book"))){
					sender.sendMessage(ChatColor.RED + "Unknown previous type \"" + type + 
							"\"! Valid types are part and book.");
					return;
				}
				Book.previous(plugin, sender, playerType, bookName, part, tran, "get", pName, permsOn, type);
				return;
			}else if(next){
				String type = "part";
				if(specArg.contains(":")){
					type = specArg.split(":")[1];
				}
				if(bookName.equalsIgnoreCase("Revelation") && part.equalsIgnoreCase("6")){
					sender.sendMessage(ChatColor.RED + "Sorry, Revelation Part 6 is the last book. You can't "
							+ "go after it!");
					return;
				}else if(type.equalsIgnoreCase("book") && bookName.equalsIgnoreCase("Revelation")){
					sender.sendMessage(ChatColor.RED + "Sorry, Revelation is the last book of the Bible. You "
							+ "can't go after it!");
					return;
				}else if(!(type.equalsIgnoreCase("part") || type.equalsIgnoreCase("book"))){
					sender.sendMessage(ChatColor.RED + "Unknown next type \"" + type + 
							"\"! Valid types are part and book.");
					return;
				}
				Book.next(plugin, sender, playerType, bookName, part, tran, "get", pName, permsOn, type);
				return;
			}
		}
		if(random){
			if(!bookSet){
				bookName = Randomize.book(tran);
			}
			if(!partSet){
				part = Randomize.part(plugin, bookName, tran);
			}
		}
		if(list){
			Book.list(plugin, sender, tran);
			return;
		}
		Book.checkAndRun(plugin, sender, playerType, bookName, part, tran, "get", pName, false, false, permsOn);
	}
}
