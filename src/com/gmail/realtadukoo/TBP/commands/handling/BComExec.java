package com.gmail.realtadukoo.TBP.commands.handling;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandExecutor;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumCmds;
import com.gmail.realtadukoo.TBP.commands.apocrypha.args.ApoHelp;
import com.gmail.realtadukoo.TBP.commands.args.*;
import com.gmail.realtadukoo.TC.commands.handling.CComExec;

public class BComExec implements CommandExecutor {
	private static TB plugin;
	private static boolean permsOn;
	public BComExec(TB plugin, boolean permsOn) {
		BComExec.plugin = plugin;
		BComExec.permsOn = permsOn;
	}
	
	public static boolean onCommand(CommandSender sender, String cmd, String[] args, String playerType) {
		EnumCmds cmds = EnumCmds.READ;
		
		String unknownSender = plugin.getLanguage(true).getString("command.error.unknownsender");
		String notAvailable = plugin.getLanguage(false).getString("command.error.commandnotavailable");
		String doesntExist = plugin.getLanguage(true).getString("command.error.commanddoesntexist");
		String help = plugin.getLanguage(true).getString("command.error.help");
		
		if((cmd.equalsIgnoreCase("bible")) && 
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
						Read.run(plugin, sender, playerType, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("send")){
						Send.run(plugin, playerType, sender, args, permsOn);
						return true;
					}else if(cmdType.equalsIgnoreCase("previous")){
						Previous.run(plugin, sender, playerType, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("next")){
						Next.run(plugin, sender, playerType, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("last")){
						Last.run(plugin, sender, playerType, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("random")){
						RandomCmd.run(plugin, sender, playerType, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("favorite")){
						Favorite.run(plugin, sender, playerType, args);
						return true;
					}else if(cmdType.equalsIgnoreCase("getbook") && 
							Checks.consoleCheck(plugin, sender, playerType)){
						Getbook.run(plugin, sender, playerType, args, permsOn);
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
					}else if(cmdType.equalsIgnoreCase("permission")){
						Permission.run(plugin, sender, args);
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
						Announce.run(plugin, sender, playerType, args);
						return true;
					}
				}
			}
		}else if(cmd.equalsIgnoreCase("apocrypha") && 
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
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
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
		
		if(cmd.getName().equalsIgnoreCase("bible")){
			onCommand(sender, "bible", args, playerType);
			return true;
		}else if(cmd.getName().equalsIgnoreCase("apocrypha")){
			onCommand(sender, "apocrypha", args, playerType);
			return true;
		}else if(cmd.getName().equalsIgnoreCase("t")){
			if(!TB.otherTPlugin && !TB.TadukooCore){
				if(args.length >= 1){
					if(args[0].equalsIgnoreCase("bible") || args[0].equalsIgnoreCase("b")){
						args = switchArgs(args);
						onCommand(sender, "bible", args, playerType);
					}else if(args[0].equalsIgnoreCase("apocrypha") || args[0].equalsIgnoreCase("a")){
						args = switchArgs(args);
						onCommand(sender, "apocrypha", args, playerType);
					}else if(args[0].equalsIgnoreCase("help")){
						if(args.length >= 2){
							if(args[1].equalsIgnoreCase("bible") || args[1].equalsIgnoreCase("b")){
								args = switchArgs(args);
								args = switchArgs(args);
								onCommand(sender, "bible", args, playerType);
							}else if(args[1].equalsIgnoreCase("apocrypha") || args[1].equalsIgnoreCase("a")){
								args = switchArgs(args);
								args = switchArgs(args);
								onCommand(sender, "apocrypha", args, playerType);
							}else{
								sender.sendMessage(ChatColor.RED + 
										plugin.getLanguage(true).getString("command.args.unknownarg"));
							}
						}else{
							sender.sendMessage(ChatColor.GREEN + 
									plugin.getLanguage(false).getString("thelp.title"));
							sender.sendMessage(ChatColor.GREEN + 
									plugin.getLanguage(false).getString("thelp.line1"));
							sender.sendMessage(ChatColor.GREEN + 
									plugin.getLanguage(false).getString("thelp.line2"));
						}
					}
				}else{
					String error = plugin.getLanguage(true).getString("command.error.notenoughargs");
					sender.sendMessage(ChatColor.RED + error);
				}
			}else if(TB.TadukooCore){
				CComExec ce = new CComExec();
				ce.onCommand(sender, cmd, commandLabel, args);
			}else if(TB.otherTPlugin && !TB.TadukooCore){
				String error = plugin.getLanguage(false).getString("command.error.trequirescore");
				sender.sendMessage(ChatColor.RED + error);
			}
			return true;
		}else{
			return false;
		}
	}
	
	public static String[] switchArgs(String[] args){
		int i = 1;
		int j = args.length;
		List<String> newArgs = new ArrayList<String>();
		while (i < j){
			newArgs.add(args[i]);
			i++;
		}
		return newArgs.toArray(args);
	}
}
