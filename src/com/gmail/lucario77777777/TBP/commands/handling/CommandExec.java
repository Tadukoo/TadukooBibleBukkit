package com.gmail.lucario77777777.TBP.commands.handling;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandExecutor;

import com.gmail.lucario77777777.TBP.Enums.EnumCmds;
import com.gmail.lucario77777777.TBP.commands.apocrypha.args.ApoHelp;
import com.gmail.lucario77777777.TBP.commands.args.Announce;
import com.gmail.lucario77777777.TBP.commands.args.Block;
import com.gmail.lucario77777777.TBP.commands.args.Books;
import com.gmail.lucario77777777.TBP.commands.args.Config;
import com.gmail.lucario77777777.TBP.commands.args.Favorite;
import com.gmail.lucario77777777.TBP.commands.args.Getbook;
import com.gmail.lucario77777777.TBP.commands.args.Help;
import com.gmail.lucario77777777.TBP.commands.args.Info;
import com.gmail.lucario77777777.TBP.commands.args.Last;
import com.gmail.lucario77777777.TBP.commands.args.Next;
import com.gmail.lucario77777777.TBP.commands.args.Plugin;
import com.gmail.lucario77777777.TBP.commands.args.Previous;
import com.gmail.lucario77777777.TBP.commands.args.RandomCmd;
import com.gmail.lucario77777777.TBP.commands.args.Read;
import com.gmail.lucario77777777.TBP.commands.args.Receive;
import com.gmail.lucario77777777.TBP.commands.args.Send;
import com.gmail.lucario77777777.TBP.commands.args.Sendbook;
import com.gmail.lucario77777777.TBP.commands.args.Translation;
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
		EnumCmds cmds = EnumCmds.READ;
		
		String unknownSender = plugin.getLanguage().getString("command.error.unknownsender");
		String notAvailable = plugin.getLanguage().getString("command.error.commandnotavailable");
		String doesntExist = plugin.getLanguage().getString("command.error.commanddoesntexist");
		String help = plugin.getLanguage().getString("command.error.help");
		
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
		
		if((cmd.getName().equalsIgnoreCase("bible")) && 
				Checks.permCheck(playerType, plugin, sender, "Bible", "use", permsOn)){
			String type = "Bible";
			if(playerType == "block" || playerType == "unknown"){
				//Don't yet know how to handle command block and unknown senders.
				sender.sendMessage(ChatColor.RED + unknownSender);
				return true;
			}else{
				if(args.length >= 1){
					if(Args.isCmd(cmds, args[0]) != null){
						cmds = Args.isCmd(cmds, args[0]);
						if(!cmds.isAvailable(type)){
							notAvailable = notAvailable.replaceAll("\\{cmd\\}", cmds.getCmd());
							notAvailable = notAvailable.replaceAll("\\{type\\}", type);
							sender.sendMessage(ChatColor.RED + notAvailable);
							return true;
						}
					}
				}
				String cmdType = cmds.getCmd();
				String cmdPerm = cmds.getPerm();
				if(Checks.permCheck(playerType, plugin, sender, type, cmdPerm, permsOn)){
					if(cmdType.equalsIgnoreCase("read")){
						Read.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("send")){
						Send.run(plugin, playerType, sender, args, permsOn);
						return true;
					}else if(cmdType.equalsIgnoreCase("previous")){
						Previous.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("next")){
						Next.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("last")){
						Last.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("random")){
						RandomCmd.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("favorite")){
						Favorite.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("getbook") && 
							Checks.consoleCheck(plugin, sender, playerType)){
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
					}else if(cmdType.equalsIgnoreCase("block")){
						Block.run(plugin, sender, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("receive")){
						Receive.run(plugin, sender, args);
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
		}else if(cmd.getName().equalsIgnoreCase("apocrypha") && 
				Checks.permCheck(playerType, plugin, sender, "Apocrypha", "use", permsOn)){
			String type = "Apocrypha";
			if(playerType == "block" || playerType == "unknown"){
				sender.sendMessage(ChatColor.RED + unknownSender);
				return true;
			}else{
				if(args.length >= 1){
					if(Args.isCmd(cmds, args[0]) != null){
						cmds = Args.isCmd(cmds, args[0]);
						if(!cmds.isAvailable(type)){
							notAvailable = notAvailable.replaceAll("\\{cmd\\}", cmds.getCmd());
							notAvailable = notAvailable.replaceAll("\\{type\\}", type);
							sender.sendMessage(ChatColor.RED + notAvailable);
							return true;
						}
					}else{
						help = help.replaceAll("\\{type\\}", type);
						sender.sendMessage(ChatColor.RED + doesntExist);
						sender.sendMessage(ChatColor.RED + help);
						return true;
					}
				}
				String cmdType = cmds.getCmd();
				String cmdPerm = cmds.getPerm();
				if(Checks.permCheck(playerType, plugin, sender, type, cmdPerm, permsOn)){
					if(cmdType.equalsIgnoreCase("help")){
						ApoHelp.run(plugin, sender, args);
						return true;
					}
				}
			}
		}
		return false;
	}
}
