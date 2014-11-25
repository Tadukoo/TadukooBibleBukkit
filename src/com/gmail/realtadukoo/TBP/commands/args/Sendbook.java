package com.gmail.realtadukoo.TBP.commands.args;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumBooks;
import com.gmail.realtadukoo.TBP.Enums.EnumCmds;
import com.gmail.realtadukoo.TBP.Enums.EnumTrans;
import com.gmail.realtadukoo.TBP.commands.Book;
import com.gmail.realtadukoo.TBP.commands.handling.Args;
import com.gmail.realtadukoo.TBP.commands.handling.Checks;

public class Sendbook {
	public static void run(TB plugin, String playerType, CommandSender sender, String[] args, boolean permsOn){
		if(Args.argsLengthCheck(sender, args, 4, 8, "/bible sendbook <player> <book> <part> [translation] " +
				"or /bible sendbook <player> <book> <part> \"anonymous\" [translation]")){
			return;
		}
		@SuppressWarnings("deprecation")
		Player player = sender.getServer().getPlayer(args[1]);
		String pName = player.getName();
		EnumBooks book = EnumBooks.GENESIS;
		EnumCmds cmds = EnumCmds.SENDBOOK;
		EnumTrans etran = EnumTrans.KJV;
		etran = etran.getDefault();
		String bookName = book.getBook();
		String part = null;
		String tran = etran.getTran();
		int i = 3;
		if(Args.isBook(book, cmds, args, 2) != null){
			book = Args.isBook(book, cmds, args, 2);
			bookName = book.getBook();
			i = Args.getCurrentArg(book, cmds, args, 2);
		}
		if(args.length >= i + 1){
			part = args[i];
			i++;
		}else{
			sender.sendMessage(ChatColor.RED + "Not enough args!");
			sender.sendMessage(ChatColor.RED + "/bible sendbook <player> <book> <part> [translation]");
			return;
		}
		boolean anonymous = false;
		if(args.length >= i + 1 && cmds.fromString(args[i]) == EnumCmds.ANONYMOUS){
			if(!Checks.permCheck(playerType, plugin, sender, "bible", "anonymous.book", permsOn)){
				return;
			}else{
				anonymous = true;
				i++;
			}
		}
		if(args.length == i + 1 && Args.tranCheck(sender, args[i]) != null){
			tran = Args.tranCheck(sender, args[i]);
		}
		/*
		 * TODO: Add check for availability using EnumAvail.
		 * if(!book.isAvailable(tran)){
			return;
		}*/
		if(!player.hasPermission("TadukooBible.book.receive")){
			sender.sendMessage(ChatColor.RED + player.getName() + " does not have permission to receive " +
					"books!");
			sender.sendMessage(ChatColor.RED + "TadukooBible.book.receive");
			return;
		}
		Book.Run(plugin, sender, tran, bookName, part, "send", pName, anonymous);
	}
}
