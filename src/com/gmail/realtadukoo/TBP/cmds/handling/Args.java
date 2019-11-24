package com.gmail.realtadukoo.TBP.cmds.handling;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TB.Bible.EnumTranslations;
import com.gmail.realtadukoo.TB.Constants.EnumBible;
import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumCmds;

public class Args {	
	public static boolean argsLengthCheck(CommandSender sender, String[] args, int min, int max, String usage){
		if(args.length < min){
			sender.sendMessage(ChatColor.RED + "Not enough args!");
			sender.sendMessage(ChatColor.RED + usage);
			return true;
		}else if(args.length > max){
			sender.sendMessage(ChatColor.RED + "Too many args!");
			sender.sendMessage(ChatColor.RED + usage);
			return true;
		}
		return false;
	}
	
	public static String tranCheck(CommandSender sender, String tran) {
		if(EnumTranslations.fromAbbreviation(tran) != null){
			EnumTranslations etran = EnumTranslations.fromAbbreviation(tran);
			return etran.getAbbreviation();
			// TODO: Work on availability
			/*if(etran.isAvailable()){
				return etran.getTran();
			}*/
		}
		return null;
	}
	
	public static EnumBible isBook(EnumCmds cmds, String[] args, int start){
		String name;
		if(args.length >= start + 1 && cmds.fromString(args[start]) != null){
			cmds = cmds.fromString(args[start]);
			String cmd = cmds.getCmd();
			if(cmd.equalsIgnoreCase("1") || cmd.equalsIgnoreCase("2") || cmd.equalsIgnoreCase("3")){
				if(args.length > start + 1){
					name = cmd + args[start + 1];
				}else{
					return null;
				}
			}else if(cmd.equalsIgnoreCase("Song")){
				if(args.length > start + 1 && args[start + 1].equalsIgnoreCase("of")){
					if(args.length > start + 2 && (args[start + 2].equalsIgnoreCase("songs")|| 
							args[start + 2].equalsIgnoreCase("solomon"))){
						name = "SongofSongs";
					}else{
						return null;
					}
				}else{
					name = "SongofSongs";
				}
			}else{
				return null;
			}
		}else{
			name = args[start];
		}
		EnumBible book = EnumBible.fromBook(name);
		return book;
	}
	
	public static EnumCmds isCmd(EnumCmds cmds, String name){
		if(cmds.fromString(name) != null && !cmds.fromString(name).isSpecial()){
			return cmds.fromString(name);
		}else{
			return null;
		}
	}
	
	public static int getCurrentArg(EnumCmds cmds, String[] args, int i) {
		String name;
		if(args.length >= i + 1 && cmds.fromString(args[i]) != null){
			cmds = cmds.fromString(args[i]);
			String cmd = cmds.getCmd();
			if(cmd.equalsIgnoreCase("1") || cmd.equalsIgnoreCase("2") || cmd.equalsIgnoreCase("3")){
				if(args.length > i + 1){
					name = cmd + args[i + 1];
					if(EnumBible.fromBook(name) != null){
						i = i + 2;
						return i;
					}else{
						i++;
						return i;
					}
				}else{
					i++;
					return i;
				}
			}else if(cmd.equalsIgnoreCase("Song")){
				if(args.length > i + 1 && args[i + 1].equalsIgnoreCase("of")){
					if(args.length > i + 2 && (args[i + 2].equalsIgnoreCase("songs")|| 
							args[i + 2].equalsIgnoreCase("solomon"))){
						name = "SongofSongs";
						if(EnumBible.fromBook(name) != null){
							i = i + 3;
							return i;
						}else{
							i++;
							return i;
						}
					}else{
						i++;
						return i;
					}
				}else{
					name = "SongofSongs";
					i++;
					return i;
				}
			}else{
				i++;
				return i;
			}
		}else{
			i++;
			return i;
		}
	}
	
	public static void bookNotAvailable(CommandSender sender, EnumBible book, String tran){
		String bookMsg = book.getBook();
		bookMsg = bookMsg.replace("1", "1 ");
		bookMsg = bookMsg.replace("2", "2 ");
		bookMsg = bookMsg.replace("3", "3 ");
		bookMsg = bookMsg.replace("SongofSongs", "Song of Songs");
		sender.sendMessage(ChatColor.RED + "Sorry, " + bookMsg + " is not available yet in the " + 
				tran.toUpperCase() + " translation.");
	}
	
	public static void unknownArg(TB plugin, CommandSender sender, String arg){
		String error = plugin.getLanguage().getString("command.error.unknownarg");
		error = error.replaceAll("\\{arg\\}", arg);
		sender.sendMessage(ChatColor.RED + error);
	}
}
