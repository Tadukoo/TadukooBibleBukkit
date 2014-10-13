package com.gmail.lucario77777777.TBP.commands.handling;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumCmds;
import com.gmail.lucario77777777.TBP.Enums.EnumTrans;

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
		EnumTrans etran = EnumTrans.KJV;
		if(etran.fromString(tran) != null){
			etran = etran.fromString(tran);
			if(etran.isAvailable()){
				return etran.getTran();
			}
		}
		sender.sendMessage(ChatColor.RED + "Sorry, the " + tran + " translation is not available.");
		return null;
	}
	
	public static EnumBooks isBook(EnumBooks book, EnumCmds cmds, String[] args, int start){
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
		if(book.fromString(name) != null){
			return book.fromString(name);
		}else{
			return null;
		}
	}
	
	public static EnumCmds isCmd(EnumCmds cmds, String name){
		if(cmds.fromString(name) != null){
			return cmds.fromString(name);
		}else{
			return null;
		}
	}
	
	public static int getCurrentArg(EnumBooks book, EnumCmds cmds, String[] args, int i) {
		String name;
		if(args.length >= i + 1 && cmds.fromString(args[i]) != null){
			cmds = cmds.fromString(args[i]);
			String cmd = cmds.getCmd();
			if(cmd.equalsIgnoreCase("1") || cmd.equalsIgnoreCase("2") || cmd.equalsIgnoreCase("3")){
				if(args.length > i + 1){
					name = cmd + args[i + 1];
					if(book.fromString(name) != null){
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
						if(book.fromString(name) != null){
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
	
	public static void bookNotAvailable(CommandSender sender, EnumBooks book, String tran){
		String bookMsg = book.getBook();
		bookMsg = bookMsg.replace("1", "1 ");
		bookMsg = bookMsg.replace("2", "2 ");
		bookMsg = bookMsg.replace("3", "3 ");
		bookMsg = bookMsg.replace("SongofSongs", "Song of Songs");
		sender.sendMessage(ChatColor.RED + "Sorry, " + bookMsg + " is not available yet in the " + 
				tran.toUpperCase() + " translation.");
	}
}
