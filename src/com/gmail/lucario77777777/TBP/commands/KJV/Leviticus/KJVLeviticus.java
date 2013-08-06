package com.gmail.lucario77777777.TBP.commands.KJV.Leviticus;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;
import com.gmail.lucario77777777.TBP.commands.KJV.KJV;

public class KJVLeviticus extends KJV{
	public KJVLeviticus(Main plugin){
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args){
		if(args.length <= 2){
			KJVLeviticusCh1.Run(sender, args);
			return true;
		}else if(args.length >=3){
			if(args[2].equals("1")){
				KJVLeviticusCh1.Run(sender, args);
				return true;
			}else if(args[2].equals("2")){
				KJVLeviticusCh2.Run(sender, args);
				return true;
			}else if(args[2].equals("3")){
				KJVLeviticusCh3.Run(sender, args);
				return true;
			}else if(args[2].equals("4")){
				KJVLeviticusCh4.Run(sender, args);
				return true;
			}else if(args[2].equals("5")){
				KJVLeviticusCh5.Run(sender, args);
				return true;
			}else if(args[2].equals("6")){
				KJVLeviticusCh6.Run(sender, args);
				return true;
			}else if(args[2].equals("7")){
				KJVLeviticusCh7.Run(sender, args);
				return true;
			}else if(args[2].equals("8")){
				KJVLeviticusCh8.Run(sender, args);
				return true;
			}else if(args[2].equals("9")){
				KJVLeviticusCh9.Run(sender, args);
				return true;
			}else if(args[2].equals("10")){
				KJVLeviticusCh10.Run(sender, args);
				return true;
			}else if(args[2].equals("11")){
				KJVLeviticusCh11.Run(sender, args);
				return true;
			}else if(args[2].equals("12")){
				KJVLeviticusCh12.Run(sender, args);
				return true;
			}else if(args[2].equals("13")){
				KJVLeviticusCh13.Run(sender, args);
				return true;
			}else if(args[2].equals("14")){
				KJVLeviticusCh14.Run(sender, args);
				return true;
			}else if(args[2].equals("15")){
				KJVLeviticusCh15.Run(sender, args);
				return true;
			}else if(args[2].equals("16")){
				KJVLeviticusCh16.Run(sender, args);
				return true;
			}else if(args[2].equals("17")){
				KJVLeviticusCh17.Run(sender, args);
				return true;
			}else if(args[2].equals("18")){
				KJVLeviticusCh18.Run(sender, args);
				return true;
			}else if(args[2].equals("19")){
				KJVLeviticusCh19.Run(sender, args);
				return true;
			}else if(args[2].equals("20")){
				KJVLeviticusCh20.Run(sender, args);
				return true;
			}else if(args[2].equals("21")){
				KJVLeviticusCh21.Run(sender, args);
				return true;
			}else if(args[2].equals("22")){
				KJVLeviticusCh22.Run(sender, args);
				return true;
			}else if(args[2].equals("23")){
				KJVLeviticusCh23.Run(sender, args);
				return true;
			}else if(args[2].equals("24")){
				KJVLeviticusCh24.Run(sender, args);
				return true;
			}else if(args[2].equals("25")){
				KJVLeviticusCh25.Run(sender, args);
				return true;
			}else if(args[2].equals("26")){
				KJVLeviticusCh26.Run(sender, args);
				return true;
			}else if(args[2].equals("27")){
				KJVLeviticusCh27.Run(sender, args);
				return true;
			}else if(args[2].equals("?")){
				sender.sendMessage(ChatColor.GREEN + "Leviticus tells about the various laws that were given" +
						" to the Israelites by God.");
				sender.sendMessage(ChatColor.GREEN + "It was written by Moses.");
				sender.sendMessage(ChatColor.GREEN + "It has 27 chapters.");
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, Leviticus only has 27 chapters.");
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}