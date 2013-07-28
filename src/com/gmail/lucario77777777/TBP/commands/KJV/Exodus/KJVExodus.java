package com.gmail.lucario77777777.TBP.commands.KJV.Exodus;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;
import com.gmail.lucario77777777.TBP.commands.KJV.KJV;

public class KJVExodus extends KJV{
	public KJVExodus(Main plugin){
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args){
		if(args.length <= 2){
			KJVExodusCh1.Run(sender, args);
			return true;
		}else if(args.length >=3){
			if(args[2].equals("1")){
				KJVExodusCh1.Run(sender, args);
				return true;
			}else if(args[2].equals("2")){
				KJVExodusCh2.Run(sender, args);
				return true;
			}else if(args[2].equals("3")){
				KJVExodusCh3.Run(sender, args);
				return true;
			}else if(args[2].equals("4")){
				KJVExodusCh4.Run(sender, args);
				return true;
			}else if(args[2].equals("5")){
				KJVExodusCh5.Run(sender, args);
				return true;
			}else if(args[2].equals("6")){
				KJVExodusCh6.Run(sender, args);
				return true;
			}else if(args[2].equals("7")){
				KJVExodusCh7.Run(sender, args);
				return true;
			}else if(args[2].equals("8")){
				KJVExodusCh8.Run(sender, args);
				return true;
			}else if(args[2].equals("9")){
				KJVExodusCh9.Run(sender, args);
				return true;
			}else if(args[2].equals("10")){
				KJVExodusCh10.Run(sender, args);
				return true;
			}else if(args[2].equals("11")){
				KJVExodusCh11.Run(sender, args);
				return true;
			}else if(args[2].equals("12")){
				KJVExodusCh12.Run(sender, args);
				return true;
			}else if(args[2].equals("13")){
				KJVExodusCh13.Run(sender, args);
				return true;
			}else if(args[2].equals("14")){
				KJVExodusCh14.Run(sender, args);
				return true;
			}else if(args[2].equals("15")){
				KJVExodusCh15.Run(sender, args);
				return true;
			}else if(args[2].equals("16")){
				KJVExodusCh16.Run(sender, args);
				return true;
			}else if(args[2].equals("17")){
				KJVExodusCh17.Run(sender, args);
				return true;
			}else if(args[2].equals("18")){
				KJVExodusCh18.Run(sender, args);
				return true;
			}else if(args[2].equals("19")){
				KJVExodusCh19.Run(sender, args);
				return true;
			}else if(args[2].equals("20")){
				KJVExodusCh20.Run(sender, args);
				return true;
			}else if(args[2].equals("21")){
				KJVExodusCh21.Run(sender, args);
				return true;
			}else if(args[2].equals("22")){
				KJVExodusCh22.Run(sender, args);
				return true;
			}else if(args[2].equals("23")){
				KJVExodusCh23.Run(sender, args);
				return true;
			}else if(args[2].equals("24")){
				KJVExodusCh24.Run(sender, args);
				return true;
			}else if(args[2].equals("25")){
				KJVExodusCh25.Run(sender, args);
				return true;
			}else if(args[2].equals("26")){
				KJVExodusCh26.Run(sender, args);
				return true;
			}else if(args[2].equals("27")){
				KJVExodusCh27.Run(sender, args);
				return true;
			}else if(args[2].equals("28")){
				KJVExodusCh28.Run(sender, args);
				return true;
			}else if(args[2].equals("29")){
				KJVExodusCh29.Run(sender, args);
				return true;
			}else if(args[2].equals("30")){
				KJVExodusCh30.Run(sender, args);
				return true;
			}else if(args[2].equals("?")){
				sender.sendMessage(ChatColor.GREEN + "Exodus tells about the time from the Exodus of the " +
						"Israelites from Egypt up to the laws given to the Israelites by God.");
				sender.sendMessage(ChatColor.GREEN + "It was written by Moses.");
				sender.sendMessage(ChatColor.GREEN + "It has 40 chapters.");
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Exodus Chapter " + args[2] + " yet.");
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}