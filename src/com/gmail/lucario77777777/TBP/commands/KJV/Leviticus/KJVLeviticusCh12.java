package com.gmail.lucario77777777.TBP.commands.KJV.Leviticus;

import com.gmail.lucario77777777.TBP.commands.KJV.bible.Leviticus.KJVBibleLeviticusCh12;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJVLeviticusCh12 extends KJVLeviticus {
	public KJVLeviticusCh12(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args.length <= 3){
			String v1 = KJVBibleLeviticusCh12.getV1();
			sender.sendMessage(ChatColor.GREEN + v1);
			return true;
		}else if(args.length ==4){
			if(args[3].equals("1")){
				String v1 = KJVBibleLeviticusCh12.getV1();
				sender.sendMessage(ChatColor.GREEN + v1);
				return true;
			}else if(args[3].equals("2")){
				String v2 = KJVBibleLeviticusCh12.getV2();
				sender.sendMessage(ChatColor.GREEN + v2);
				return true;
			}else if(args[3].equals("3")){
				String v3 = KJVBibleLeviticusCh12.getV3();
				sender.sendMessage(ChatColor.GREEN + v3);
				return true;
			}else if(args[3].equals("4")){
				String v4 = KJVBibleLeviticusCh12.getV4();
				sender.sendMessage(ChatColor.GREEN + v4);
				return true;
			}else if(args[3].equals("5")){
				String v5 = KJVBibleLeviticusCh12.getV5();
				sender.sendMessage(ChatColor.GREEN + v5);
				return true;
			}else if(args[3].equals("6")){
				String v6 = KJVBibleLeviticusCh12.getV6();
				sender.sendMessage(ChatColor.GREEN + v6);
				return true;
			}else if(args[3].equals("7")){
				String v7 = KJVBibleLeviticusCh12.getV7();
				sender.sendMessage(ChatColor.GREEN + v7);
				return true;
			}else if(args[3].equals("8")){
				String v8 = KJVBibleLeviticusCh12.getV8();
				sender.sendMessage(ChatColor.GREEN + v8);
				return true;
			}else if(args[3].equals("?") || args[3].equals("#")){
				String info = KJVBibleLeviticusCh12.getInfo();
				sender.sendMessage(ChatColor.GREEN + info);
				return true;
			}else{
				String info = KJVBibleLeviticusCh12.getInfo();
				sender.sendMessage(ChatColor.RED + "Sorry, " + info);
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "Too many arguments!");
			return true;
		}
	}
}