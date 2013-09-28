package com.gmail.lucario77777777.TBP.commands.KJV.Genesis;

//import java.util.logging.Logger;

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
		String verse = null;
		if(args.length <= 2){
			String chp = "1";
			String v = "1";
			String ref = "ch" + chp + "v" + v;
			verse = 
					Main.
					plugin.
					getKJVGenesisConfig().
					getString(
							ref);
			sender.sendMessage(ChatColor.GREEN + verse);
			return true;
		}else if(args.length >=3){
			if(args[2].equalsIgnoreCase("?")){
				verse = Main.plugin.getKJVGenesisConfig().getString("GenInfo");
				sender.sendMessage(ChatColor.GREEN + verse);
				return true;
			}else{
				String chp = args[2];
				String v = null;
				if(args.length == 3){
					v = "1";
				}else{
					v = args[3];
				}
				//try{
				String ref = "ch" + chp + "v" + v;
					verse = Main.plugin.getKJVGenesisConfig().getString(ref);
					sender.sendMessage(ChatColor.GREEN + verse);
				//}catch(Exception e){
					//Logger.getLogger(ChatColor.RED + "An error occurred. Error: " + e);
					//sender.sendMessage(ChatColor.RED + "An error occurred. Error: " + e);
					//sender.sendMessage(ChatColor.RED + "Please check to make sure you typed in a verse/ " +
							//"chapter number that exists.");
				//}
				
			//if( <= 50){
				
			/*if(args[2].equals("1")){
				KJVGenesisCh1.Run2(sender, args);
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
			}else if(args[2].equals("43")){
				KJVGenesisCh43.Run(sender, args);
				return true;
			}else if(args[2].equals("44")){
				KJVGenesisCh44.Run(sender, args);
				return true;
			}else if(args[2].equals("45")){
				KJVGenesisCh45.Run(sender, args);
				return true;
			}else if(args[2].equals("46")){
				KJVGenesisCh46.Run(sender, args);
				return true;
			}else if(args[2].equals("47")){
				KJVGenesisCh47.Run(sender, args);
				return true;
			}else if(args[2].equals("48")){
				KJVGenesisCh48.Run(sender, args);
				return true;
			}else if(args[2].equals("49")){
				KJVGenesisCh49.Run(sender, args);
				return true;
			}else if(args[2].equals("50")){
				KJVGenesisCh50.Run(sender, args);
				return true;*/
			
				return true;
			/*}else{
				sender.sendMessage(ChatColor.RED + "Sorry, Genesis only has 50 chapters.");
				return true;*/
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}