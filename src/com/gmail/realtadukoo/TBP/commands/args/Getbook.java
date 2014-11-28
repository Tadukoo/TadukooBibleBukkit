package com.gmail.realtadukoo.TBP.commands.args;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumBooks;
import com.gmail.realtadukoo.TBP.Enums.EnumCmds;
import com.gmail.realtadukoo.TBP.Enums.EnumTrans;
import com.gmail.realtadukoo.TBP.commands.Book;
import com.gmail.realtadukoo.TBP.commands.Randomize;
import com.gmail.realtadukoo.TBP.commands.handling.Args;

public class Getbook {
	public static void run(TB plugin, CommandSender sender, String playerType, String[] args, boolean permsOn){
		if(Args.argsLengthCheck(sender, args, 1, 7, "/bible getbook [book] [part] [translation] " +
				"[?] or /bible getbook list")){
			return;
		}
		String pName = sender.getName();
		EnumBooks book = EnumBooks.GENESIS;
		EnumCmds cmds = EnumCmds.GETBOOK;
		EnumTrans etran = EnumTrans.KJV;
		book = book.getDefault();
		String part = plugin.getConfig().getString("default.part");
		etran = etran.getDefault();
		String bookName = book.getBook();
		String tran = etran.getTran();
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
			}else if(!bookSet && Args.isBook(book, cmds, args, i) != null){
				book = Args.isBook(book, cmds, args, i);
				bookName = book.getBook();
				i = Args.getCurrentArg(book, cmds, args, i);
			}else if(!tranSet && Args.tranCheck(sender, args[i]) != null){
				tran = Args.tranCheck(sender, args[i]);
				tranSet = true;
				i++;
			}else if(!previous && cmds.fromString(args[i]) == EnumCmds.PREVIOUS){
				previous = true;
				i++;
			}else if(!next && cmds.fromString(args[i]) == EnumCmds.NEXT){
				next = true;
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
			bookName = TB.getpRec().getString(ID + ".lastbook.book");
			part = TB.getpRec().getString(ID + ".lastbook.part");
			if(!tranSet){
				tran = TB.getpRec().getString(ID + ".lastbook.tran");
			}
			if(previous){
				if(bookName.equalsIgnoreCase("Genesis") && part.equalsIgnoreCase("1")){
					sender.sendMessage(ChatColor.RED + "Sorry, Genesis Part 1 is the first book. You can't go "
							+ "before it!");
					return;
				}
				Book.previous(plugin, sender, playerType, bookName, part, tran, "get", pName, permsOn);
				return;
			}else if(next){
				if(bookName.equalsIgnoreCase("Revelation") && part.equalsIgnoreCase("6")){
					sender.sendMessage(ChatColor.RED + "Sorry, Revelation Part 6 is the last book. You can't "
							+ "go after it!");
					return;
				}
				Book.next(plugin, sender, playerType, bookName, part, tran, "get", pName, permsOn);
				return;
			}
		}
		if(random){
			if(!bookSet){
				bookName = Randomize.book(book, tran);
			}
			if(!partSet){
				part = Randomize.part(plugin, book, bookName, tran);
			}
		}
		if(list){
			Book.list(plugin, sender, tran);
			return;
		}
		Book.checkAndRun(plugin, sender, playerType, bookName, part, tran, book, "get", pName, false, false, 
				permsOn);
	}
}
