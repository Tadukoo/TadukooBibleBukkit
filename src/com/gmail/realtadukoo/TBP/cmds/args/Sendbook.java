package com.gmail.realtadukoo.TBP.cmds.args;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.realtadukoo.TB.Bible.EnumTranslations;
import com.gmail.realtadukoo.TB.Constants.EnumBible;
import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumCmds;
import com.gmail.realtadukoo.TBP.cmds.Book;
import com.gmail.realtadukoo.TBP.cmds.handling.Args;
import com.gmail.realtadukoo.TBP.cmds.handling.Checks;

public class Sendbook {
	@SuppressWarnings("deprecation")
	public static void run(TB plugin, String playerType, CommandSender sender, String[] args, boolean permsOn){
		if(Args.argsLengthCheck(sender, args, 4, 9, "/bible sendbook <player> <book> <part> [translation] " +
				"or /bible sendbook <player> <book> <part> \"anonymous\" [translation]")){
			return;
		}
		String bookName = null;
		EnumCmds cmds = EnumCmds.SENDBOOK;
		EnumTranslations etran = EnumTranslations.fromAbbreviation(TB.config.getString("default.translation"));
		String part = plugin.getConfig().getString("default.part");
		String tran = etran.getAbbreviation();
		Player player = null;
		String pName = null;
		boolean anonymous = false, bypass = false;
		boolean bookSet = false, partSet = false, playerSet = false, tranSet = false;
		int i = 1;
		while(args.length >= i + 1 && args[i] != null){
			if(!bookSet && Args.isBook(cmds, args, i) != null){
				EnumBible book = Args.isBook(cmds, args, i);
				bookName = book.getBook();
				i = Args.getCurrentArg(cmds, args, i);
				bookSet = true;
			}else if(!tranSet && Args.tranCheck(sender, args[i]) != null){
				tran = Args.tranCheck(sender, args[i]);
				tranSet = true;
				i++;
			}else if(!anonymous && cmds.fromString(args[i]) == EnumCmds.ANONYMOUS){
				if(Checks.permCheck(playerType, plugin, sender, "Bible", "anonymous.book", permsOn)){
					anonymous = true;
				}else{
					sender.sendMessage(ChatColor.RED + "Sorry, you don't have permission to send anonymous "
							+ "books.");
					return;
				}
				i++;
			}else if(!bypass && cmds.fromString(args[i]) == EnumCmds.BYPASS){
				if(Checks.permCheck(playerType, plugin, sender, "Bible", "bypass.book", permsOn)){
					bypass = true;
				}else{
					sender.sendMessage(ChatColor.RED + "Sorry, you don't have permission to bypass book "
							+ "sending settings.");
					return;
				}
				i++;
			}else if(!playerSet){
				player = plugin.getServer().getPlayer(args[i]);
				pName = player.getName();
				playerSet = true;
				i++;
			}else{
				try{
					if(!partSet){
						int p = Integer.parseInt(args[i]);
						part = String.valueOf(p);
						i++;
						partSet = true;
					}else{
						Args.unknownArg(plugin, sender, args[i]);
						return;
					}
				}catch(NumberFormatException e){
					Args.unknownArg(plugin, sender, args[i]);
					return;
				}
			}
		}
		if(!playerSet || !bookSet || !partSet){
			sender.sendMessage(ChatColor.RED + "/bible sendbook <player> <book> <part> [translation] " +
				"or /bible sendbook <player> <book> <part> \"anonymous\" [translation]");
			return;
		}
		Book.checkAndRun(plugin, sender, playerType, bookName, part, tran, "send", pName, anonymous, bypass, permsOn);
	}
}
