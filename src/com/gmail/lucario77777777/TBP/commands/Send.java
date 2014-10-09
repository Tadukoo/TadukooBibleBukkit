package com.gmail.lucario77777777.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumCmds;
import com.gmail.lucario77777777.TBP.Enums.EnumTrans;
import com.gmail.lucario77777777.TBP.cmdhandling.Args;
import com.gmail.lucario77777777.TBP.cmdhandling.Checks;
import com.gmail.lucario77777777.TBP.cmdhandling.References;
import com.gmail.lucario77777777.TBP.cmdhandling.Sending;

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
		boolean anonymous = false;
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
				if(args.length >= i + 1 && args[i].equalsIgnoreCase("anonymous")){
					if(!Checks.permCheck(playerType, sender, "bible", "anonymous.verse", permsOn)){
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
		if(!book.isAvailable(tran)){
			sender.sendMessage(ChatColor.RED + "Sorry, that book is not yet available in " +
					"the " + tran + " translation.");
			return;
		}
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
			Sending.sendVerseToOtherPlayer(plugin, sender, player, bookName, chp, v, tran, ref, anonymous);
			sender.sendMessage(ChatColor.GREEN + "Verse sent!");
		}else{
			sender.sendMessage(ChatColor.RED + pName + " is not online!");
		}
	}
}
