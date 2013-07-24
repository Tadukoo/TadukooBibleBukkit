package com.gmail.lucario77777777.TBP.commands.KJV.Genesis;

import com.gmail.lucario77777777.TBP.commands.KJV.KJV;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJVGenesis extends KJV {
	public KJVGenesis(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args.length <= 2){
			KJVGenesisCh1.Run(sender, args);
			return true;
		}else if(args.length >=3){
			if(args[2].equals("1")){
				KJVGenesisCh1.Run(sender, args);
				return true;
			}else if(args[2].equals("2")){
				KJVGenesisCh2.Run(sender, args);
				return true;
			}else if(args[2].equals("3")){
				KJVGenesisCh3.Run(sender, args);
				return true;
			}else if(args[2].equals("4")){
				KJVGenesisCh4.Run(sender, args);
				return true;
			}else if(args[2].equals("5")){
				KJVGenesisCh5.Run(sender, args);
				return true;
			}else if(args[2].equals("6")){
				KJVGenesisCh6.Run(sender, args);
				return true;
			}else if(args[2].equals("7")){
				KJVGenesisCh7.Run(sender, args);
				return true;
			}else if(args[2].equals("8")){
				KJVGenesisCh8.Run(sender, args);
				return true;
			}else if(args[2].equals("9")){
				KJVGenesisCh9.Run(sender, args);
				return true;
			}else if(args[2].equals("10")){
				KJVGenesisCh10.Run(sender, args);
				return true;
			}else if(args[2].equals("11")){
				KJVGenesisCh11.Run(sender, args);
				return true;
			}else if(args[2].equals("12")){
				KJVGenesisCh12.Run(sender, args);
				return true;
			}else if(args[2].equals("13")){
				KJVGenesisCh13.Run(sender, args);
				return true;
			}else if(args[2].equals("14")){
				KJVGenesisCh14.Run(sender, args);
				return true;
			}else if(args[2].equals("15")){
				KJVGenesisCh15.Run(sender, args);
				return true;
			}else if(args[2].equals("16")){
				KJVGenesisCh16.Run(sender, args);
				return true;
			}else if(args[2].equals("17")){
				KJVGenesisCh17.Run(sender, args);
				return true;
			}else if(args[2].equals("18")){
				KJVGenesisCh18.Run(sender, args);
				return true;
			}else if(args[2].equals("19")){
				KJVGenesisCh19.Run(sender, args);
				return true;
			}else if(args[2].equals("20")){
				KJVGenesisCh20.Run(sender, args);
				return true;
			}else if(args[2].equals("21")){
				KJVGenesisCh21.Run(sender, args);
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Genesis Chapter " + args[2] + " yet.");
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}