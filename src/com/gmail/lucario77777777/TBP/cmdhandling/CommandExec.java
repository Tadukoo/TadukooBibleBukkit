package com.gmail.lucario77777777.TBP.cmdhandling;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandExecutor;

import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumCmds;
import com.gmail.lucario77777777.TBP.commands.Announce;
import com.gmail.lucario77777777.TBP.commands.Books;
import com.gmail.lucario77777777.TBP.commands.Config;
import com.gmail.lucario77777777.TBP.commands.Getbook;
import com.gmail.lucario77777777.TBP.commands.Help;
import com.gmail.lucario77777777.TBP.commands.Info;
import com.gmail.lucario77777777.TBP.commands.Last;
import com.gmail.lucario77777777.TBP.commands.Next;
import com.gmail.lucario77777777.TBP.commands.Plugin;
import com.gmail.lucario77777777.TBP.commands.Previous;
import com.gmail.lucario77777777.TBP.commands.RandomCmd;
import com.gmail.lucario77777777.TBP.commands.Read;
import com.gmail.lucario77777777.TBP.commands.Send;
import com.gmail.lucario77777777.TBP.commands.Sendbook;
import com.gmail.lucario77777777.TBP.commands.Translation;
import com.gmail.lucario77777777.TBP.TB;

public class CommandExec implements CommandExecutor {
	private TB plugin;
	private static boolean permsOn;
	public CommandExec(TB plugin, boolean permsOn) {
		this.plugin = plugin;
		CommandExec.permsOn = permsOn;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		/*
		 * Sets default book, chapter, verse, and translation.
		 */
		EnumBooks book = EnumBooks.GENESIS;
		
		/*
		 * Sets default command information.
		 */
		EnumCmds cmds = EnumCmds.READ;
		
		/*
		 * Determine Player Type
		 */
		final String playerType;
		if (sender instanceof Player){
			playerType = "player";
		}else if(sender instanceof ConsoleCommandSender){
			playerType = "console";
		}else if(sender instanceof BlockCommandSender){
			playerType = "block";
		}else{
			playerType = "unknown";
		}
		
		if(cmd.getName().equalsIgnoreCase("bible") && Checks.permCheck(playerType, sender, "use", permsOn)){
			if(playerType == "block" || playerType == "unknown"){
				//Don't yet know how to handle command block and unknown senders.
				sender.sendMessage(ChatColor.RED + "Unknown sender!");
				return true;
			}else{
				if(args.length >= 1){
					//Check if a book was typed, but do nothing but continue.
					if(Args.isBook(book, cmds, args, 0) != null){
						//Check if a command was typed.
					}else if(Args.isCmd(cmds, args[0]) != null){
						cmds = Args.isCmd(cmds, args[0]);
						//Check if the command is available.
						if(!cmds.isAvailable("Bible")){
							sender.sendMessage(ChatColor.RED + "Sorry, " + cmds.getCmd() + " is not " +
									"available yet.");
							return true;
						}
					}else{
						sender.sendMessage(ChatColor.RED + "Sorry, that book/command does not exist.");
						sender.sendMessage(ChatColor.RED + "For help, please type /bible help");
						return true;
					}
				}
				String cmdType = cmds.getCmd();
				String cmdPerm = cmds.getPerm();
				if(Checks.permCheck(playerType, sender, cmdPerm, permsOn)){
					if(cmdType.equalsIgnoreCase("read")){
						Read.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("send")){
						Send.run(plugin, playerType, sender, args, permsOn);
						return true;
					}else if(cmdType.equalsIgnoreCase("previous") && TB.pR){
						Previous.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("next") && TB.pR){
						Next.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("last") && TB.pR){
						Last.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("random")){
						RandomCmd.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("getbook") && Checks.consoleCheck(sender, playerType)){
						Getbook.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("sendbook")){
						Sendbook.run(plugin, playerType, sender, args, permsOn);
						return true;
					}else if(cmdType.equalsIgnoreCase("info")){
						Info.run(plugin, sender, args, playerType, permsOn);
						return true;
					}else if(cmdType.equalsIgnoreCase("help")){
						Help.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("plugin")){
						Plugin.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("books")){
						Books.run(sender, plugin, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("translation")){
						Translation.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("config")){
						Config.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("announce")){
						Announce.run(plugin, sender, args);
						return true;
					}
				}
			}
		}
		return false;
	}
}
