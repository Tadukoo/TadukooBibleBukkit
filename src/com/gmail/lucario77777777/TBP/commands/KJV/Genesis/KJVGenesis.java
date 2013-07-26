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
			}else if(args[2].equals("22")){
				KJVGenesisCh22.Run(sender, args);
				return true;
			}else if(args[2].equals("23")){
				KJVGenesisCh23.Run(sender, args);
				return true;
			}else if(args[2].equals("24")){
				KJVGenesisCh24.Run(sender, args);
				return true;
			}else if(args[2].equals("25")){
				KJVGenesisCh25.Run(sender, args);
				return true;
			}else if(args[2].equals("26")){
				KJVGenesisCh26.Run(sender, args);
				return true;
			}else if(args[2].equals("27")){
				KJVGenesisCh27.Run(sender, args);
				return true;
			}else if(args[2].equals("28")){
				KJVGenesisCh28.Run(sender, args);
				return true;
			}else if(args[2].equals("29")){
				KJVGenesisCh29.Run(sender, args);
				return true;
			}else if(args[2].equals("30")){
				KJVGenesisCh30.Run(sender, args);
				return true;
			}else if(args[2].equals("31")){
				KJVGenesisCh31.Run(sender, args);
				return true;
			}else if(args[2].equals("32")){
				KJVGenesisCh32.Run(sender, args);
				return true;
			}else if(args[2].equals("33")){
				KJVGenesisCh33.Run(sender, args);
				return true;
			}else if(args[2].equals("34")){
				KJVGenesisCh34.Run(sender, args);
				return true;
			}else if(args[2].equals("35")){
				KJVGenesisCh35.Run(sender, args);
				return true;
			}else if(args[2].equals("36")){
				KJVGenesisCh36.Run(sender, args);
				return true;
			}else if(args[2].equals("37")){
				KJVGenesisCh37.Run(sender, args);
				return true;
			}else if(args[2].equals("38")){
				KJVGenesisCh38.Run(sender, args);
				return true;
			}else if(args[2].equals("39")){
				KJVGenesisCh39.Run(sender, args);
				return true;
			}else if(args[2].equals("40")){
				KJVGenesisCh40.Run(sender, args);
				return true;
			}else if(args[2].equals("41")){
				KJVGenesisCh41.Run(sender, args);
				return true;
			}else if(args[2].equals("42")){
				KJVGenesisCh42.Run(sender, args);
				return true;
			}else if(args[2].equals("?")){
				sender.sendMessage(ChatColor.GREEN + "Genesis tells about Creation up through the time the " +
						"Israelites go to Egypt.");
				sender.sendMessage(ChatColor.GREEN + "It was written by Moses.");
				sender.sendMessage(ChatColor.GREEN + "It has 50 chapters.");
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