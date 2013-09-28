package com.gmail.lucario77777777.TBP.commands.KJV;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh1;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh10;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh11;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh12;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh13;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh14;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh15;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh16;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh17;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh18;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh19;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh2;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh20;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh21;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh22;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh23;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh24;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh25;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh26;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh27;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh28;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh29;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh3;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh30;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh31;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh32;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh33;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh34;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh35;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh36;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh37;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh38;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh39;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh4;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh40;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh5;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh6;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh7;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh8;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodusCh9;

public class KJVExodus extends KJV{
	public KJVExodus(Main plugin){
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args, Main plugin){
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
			}else if(args[2].equals("31")){
				KJVExodusCh31.Run(sender, args);
				return true;
			}else if(args[2].equals("32")){
				KJVExodusCh32.Run(sender, args);
				return true;
			}else if(args[2].equals("33")){
				KJVExodusCh33.Run(sender, args);
				return true;
			}else if(args[2].equals("34")){
				KJVExodusCh34.Run(sender, args);
				return true;
			}else if(args[2].equals("35")){
				KJVExodusCh35.Run(sender, args);
				return true;
			}else if(args[2].equals("36")){
				KJVExodusCh36.Run(sender, args);
				return true;
			}else if(args[2].equals("37")){
				KJVExodusCh37.Run(sender, args);
				return true;
			}else if(args[2].equals("38")){
				KJVExodusCh38.Run(sender, args);
				return true;
			}else if(args[2].equals("39")){
				KJVExodusCh39.Run(sender, args);
				return true;
			}else if(args[2].equals("40")){
				KJVExodusCh40.Run(sender, args);
				return true;
			}else if(args[2].equals("?")){
				sender.sendMessage(ChatColor.GREEN + "Exodus tells about the time from the Exodus of the " +
						"Israelites from Egypt up to the laws given to the Israelites by God.");
				sender.sendMessage(ChatColor.GREEN + "It was written by Moses.");
				sender.sendMessage(ChatColor.GREEN + "It has 40 chapters.");
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, Exodus only has 40 chapters.");
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}