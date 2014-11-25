package com.gmail.realtadukoo.TBP.commands.args;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumBooks;
import com.gmail.realtadukoo.TBP.Enums.EnumCmds;
import com.gmail.realtadukoo.TBP.Enums.EnumTrans;
import com.gmail.realtadukoo.TBP.commands.References;
import com.gmail.realtadukoo.TBP.commands.Sending;
import com.gmail.realtadukoo.TBP.commands.handling.Args;
import com.gmail.realtadukoo.TBP.commands.handling.Checks;

public class Send {
	public static void run(TB plugin, String playerType, CommandSender sender, String[] args, boolean permsOn){
		if(Args.argsLengthCheck(sender, args, 4, 9, "/bible send <player> <book> <chapter> " +
				"<verse> [translation] or /bible send <player> <book> <chapter:verse> " +
				"[translation] or /bible send <player> <book> <chapter> <verse> \"anonymous\" [translation]")){
			return;
		}
		String pName = args[1];
		EnumBooks book = EnumBooks.GENESIS;
		EnumCmds cmds = EnumCmds.SEND;
		EnumTrans etran = EnumTrans.KJV;
		etran = etran.getDefault();
		String bookName = null;
		String chp = null;
		String v = null;
		String tran = etran.getTran();
		int i = 2;
		EnumCmds ecmd = EnumCmds.ANONYMOUS;
		boolean anonymous = false;
		boolean bypass = false;
		if(Args.isBook(book, cmds, args, i) != null){
			book = Args.isBook(book, cmds, args, i);
			bookName = book.getBook();
			i = Args.getCurrentArg(book, cmds, args, i);
			if(args.length >= i + 1){
				if(args[i].contains(":")){
					String[] chpV = args[i].split(":");
					chp = chpV[0];
					v = chpV[1];
					i++;
				}else{
					chp = args[i];
					i++;
					if(args.length >= i + 1){
						v = args[i];
						i++;
					}else{
						sender.sendMessage(ChatColor.RED + "Not enough args!");
						sender.sendMessage(ChatColor.RED + "/bible send <player> <book> " +
								"<chapter> <verse> [translation]");
						return;
					}
				}
				if(args.length >= i + 1 && ecmd.fromString(args[i]) == EnumCmds.ANONYMOUS){
					if(!Checks.permCheck(playerType, plugin, sender, "bible", "anonymous.verse", permsOn)){
						return;
					}else{
						anonymous = true;
						i++;
					}
				}
				if(args.length >= i + 1 && Args.tranCheck(sender, args[i]) != null){
						tran = args[i];
				}
			}else{
				sender.sendMessage(ChatColor.RED + "Not enough args!");
				sender.sendMessage(ChatColor.RED + "/bible send <player> <book> " +
						"<chapter> <verse> [translation]");
				return;
			}
		}
		/*
		 * TODO: Add check for availability using EnumAvail.
		 * if(!book.isAvailable(tran)){
			sender.sendMessage(ChatColor.RED + "Sorry, that book is not yet available in " +
					"the " + tran + " translation.");
			return;
		}*/
		@SuppressWarnings("deprecation")
		Player player = plugin.getServer().getPlayer(pName);
		if(player.isOnline()){
			String ref = References.makeRef(book, chp, v);
			if(!References.checkRef(plugin, sender, bookName, tran, ref)){
				return;
			}
			if(!player.hasPermission("TadukooBible.verse.receive")){
				sender.sendMessage(ChatColor.RED + player.getName() + " does not have permission to receive " +
						"verses!");
				sender.sendMessage(ChatColor.RED + "TadukooBible.verse.receive");
				return;
			}
			Sending.sendVerseToOtherPlayer(plugin, sender, player, bookName, chp, v, tran, ref, anonymous, 
					bypass);
			sender.sendMessage(ChatColor.GREEN + "Verse sent!");
		}else{
			sender.sendMessage(ChatColor.RED + pName + " is not online!");
		}
	}
}
