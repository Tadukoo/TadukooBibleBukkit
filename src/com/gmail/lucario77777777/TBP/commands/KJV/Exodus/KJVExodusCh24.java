package com.gmail.lucario77777777.TBP.commands.KJV.Exodus;

import com.gmail.lucario77777777.TBP.commands.KJV.bible.Exodus.KJVBibleExodusCh24;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJVExodusCh24 extends KJVExodus {
	public KJVExodusCh24(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args.length <= 3){
			String v1 = KJVBibleExodusCh24.getV1();
			sender.sendMessage(ChatColor.GREEN + v1);
			return true;
		}else if(args.length ==4){
			if(args[3].equals("1")){
				String v1 = KJVBibleExodusCh24.getV1();
				sender.sendMessage(ChatColor.GREEN + v1);
				return true;
			}else if(args[3].equals("2")){
				String v2 = KJVBibleExodusCh24.getV2();
				sender.sendMessage(ChatColor.GREEN + v2);
				return true;
			}else if(args[3].equals("3")){
				String v3 = KJVBibleExodusCh24.getV3();
				sender.sendMessage(ChatColor.GREEN + v3);
				return true;
			}else if(args[3].equals("4")){
				String v4 = KJVBibleExodusCh24.getV4();
				sender.sendMessage(ChatColor.GREEN + v4);
				return true;
			}else if(args[3].equals("5")){
				String v5 = KJVBibleExodusCh24.getV5();
				sender.sendMessage(ChatColor.GREEN + v5);
				return true;
			}else if(args[3].equals("6")){
				String v6 = KJVBibleExodusCh24.getV6();
				sender.sendMessage(ChatColor.GREEN + v6);
				return true;
			}else if(args[3].equals("7")){
				String v7 = KJVBibleExodusCh24.getV7();
				sender.sendMessage(ChatColor.GREEN + v7);
				return true;
			}else if(args[3].equals("8")){
				String v8 = KJVBibleExodusCh24.getV8();
				sender.sendMessage(ChatColor.GREEN + v8);
				return true;
			}else if(args[3].equals("9")){
				String v9 = KJVBibleExodusCh24.getV9();
				sender.sendMessage(ChatColor.GREEN + v9);
				return true;
			}else if(args[3].equals("10")){
				String v10 = KJVBibleExodusCh24.getV10();
				sender.sendMessage(ChatColor.GREEN + v10);
				return true;
			}else if(args[3].equals("11")){
				String v11 = KJVBibleExodusCh24.getV11();
				sender.sendMessage(ChatColor.GREEN + v11);
				return true;
			}else if(args[3].equals("12")){
				String v12 = KJVBibleExodusCh24.getV12();
				sender.sendMessage(ChatColor.GREEN + v12);
				return true;
			}else if(args[3].equals("13")){
				String v13 = KJVBibleExodusCh24.getV13();
				sender.sendMessage(ChatColor.GREEN + v13);
				return true;
			}else if(args[3].equals("14")){
				String v14 = KJVBibleExodusCh24.getV14();
				sender.sendMessage(ChatColor.GREEN + v14);
				return true;
			}else if(args[3].equals("15")){
				String v15 = KJVBibleExodusCh24.getV15();
				sender.sendMessage(ChatColor.GREEN + v15);
				return true;
			}else if(args[3].equals("16")){
				String v16 = KJVBibleExodusCh24.getV16();
				sender.sendMessage(ChatColor.GREEN + v16);
				return true;
			}else if(args[3].equals("17")){
				String v17 = KJVBibleExodusCh24.getV17();
				sender.sendMessage(ChatColor.GREEN + v17);
				return true;
			}else if(args[3].equals("18")){
				String v18 = KJVBibleExodusCh24.getV18();
				sender.sendMessage(ChatColor.GREEN + v18);
				return true;
			}else if(args[3].equals("?") || args[3].equals("#")){
				String info = KJVBibleExodusCh24.getInfo();
				sender.sendMessage(ChatColor.GREEN + info);
				return true;
			}else{
				String info = KJVBibleExodusCh24.getInfo();
				sender.sendMessage(ChatColor.RED + "Sorry, " + info);
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "Too many arguments!");
			return true;
		}
	}
}