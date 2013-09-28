package com.gmail.lucario77777777.TBP.commands.KJV.Exodus;

import com.gmail.lucario77777777.TBP.commands.KJV.KJVExodus;
import com.gmail.lucario77777777.TBP.commands.KJV.bible.Exodus.KJVBibleExodusCh37;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJVExodusCh37 extends KJVExodus {
	public KJVExodusCh37(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args.length <= 3){
			String v1 = KJVBibleExodusCh37.getV1();
			sender.sendMessage(ChatColor.GREEN + v1);
			return true;
		}else if(args.length ==4){
			if(args[3].equals("1")){
				String v1 = KJVBibleExodusCh37.getV1();
				sender.sendMessage(ChatColor.GREEN + v1);
				return true;
			}else if(args[3].equals("2")){
				String v2 = KJVBibleExodusCh37.getV2();
				sender.sendMessage(ChatColor.GREEN + v2);
				return true;
			}else if(args[3].equals("3")){
				String v3 = KJVBibleExodusCh37.getV3();
				sender.sendMessage(ChatColor.GREEN + v3);
				return true;
			}else if(args[3].equals("4")){
				String v4 = KJVBibleExodusCh37.getV4();
				sender.sendMessage(ChatColor.GREEN + v4);
				return true;
			}else if(args[3].equals("5")){
				String v5 = KJVBibleExodusCh37.getV5();
				sender.sendMessage(ChatColor.GREEN + v5);
				return true;
			}else if(args[3].equals("6")){
				String v6 = KJVBibleExodusCh37.getV6();
				sender.sendMessage(ChatColor.GREEN + v6);
				return true;
			}else if(args[3].equals("7")){
				String v7 = KJVBibleExodusCh37.getV7();
				sender.sendMessage(ChatColor.GREEN + v7);
				return true;
			}else if(args[3].equals("8")){
				String v8 = KJVBibleExodusCh37.getV8();
				sender.sendMessage(ChatColor.GREEN + v8);
				return true;
			}else if(args[3].equals("9")){
				String v9 = KJVBibleExodusCh37.getV9();
				sender.sendMessage(ChatColor.GREEN + v9);
				return true;
			}else if(args[3].equals("10")){
				String v10 = KJVBibleExodusCh37.getV10();
				sender.sendMessage(ChatColor.GREEN + v10);
				return true;
			}else if(args[3].equals("11")){
				String v11 = KJVBibleExodusCh37.getV11();
				sender.sendMessage(ChatColor.GREEN + v11);
				return true;
			}else if(args[3].equals("12")){
				String v12 = KJVBibleExodusCh37.getV12();
				sender.sendMessage(ChatColor.GREEN + v12);
				return true;
			}else if(args[3].equals("13")){
				String v13 = KJVBibleExodusCh37.getV13();
				sender.sendMessage(ChatColor.GREEN + v13);
				return true;
			}else if(args[3].equals("14")){
				String v14 = KJVBibleExodusCh37.getV14();
				sender.sendMessage(ChatColor.GREEN + v14);
				return true;
			}else if(args[3].equals("15")){
				String v15 = KJVBibleExodusCh37.getV15();
				sender.sendMessage(ChatColor.GREEN + v15);
				return true;
			}else if(args[3].equals("16")){
				String v16 = KJVBibleExodusCh37.getV16();
				sender.sendMessage(ChatColor.GREEN + v16);
				return true;
			}else if(args[3].equals("17")){
				String v17 = KJVBibleExodusCh37.getV17();
				sender.sendMessage(ChatColor.GREEN + v17);
				return true;
			}else if(args[3].equals("18")){
				String v18 = KJVBibleExodusCh37.getV18();
				sender.sendMessage(ChatColor.GREEN + v18);
				return true;
			}else if(args[3].equals("19")){
				String v19 = KJVBibleExodusCh37.getV19();
				sender.sendMessage(ChatColor.GREEN + v19);
				return true;
			}else if(args[3].equals("20")){
				String v20 = KJVBibleExodusCh37.getV20();
				sender.sendMessage(ChatColor.GREEN + v20);
				return true;
			}else if(args[3].equals("21")){
				String v21 = KJVBibleExodusCh37.getV21();
				sender.sendMessage(ChatColor.GREEN + v21);
				return true;
			}else if(args[3].equals("22")){
				String v22 = KJVBibleExodusCh37.getV22();
				sender.sendMessage(ChatColor.GREEN + v22);
				return true;
			}else if(args[3].equals("23")){
				String v23 = KJVBibleExodusCh37.getV23();
				sender.sendMessage(ChatColor.GREEN + v23);
				return true;
			}else if(args[3].equals("24")){
				String v24 = KJVBibleExodusCh37.getV24();
				sender.sendMessage(ChatColor.GREEN + v24);
				return true;
			}else if(args[3].equals("25")){
				String v25 = KJVBibleExodusCh37.getV25();
				sender.sendMessage(ChatColor.GREEN + v25);
				return true;
			}else if(args[3].equals("26")){
				String v26 = KJVBibleExodusCh37.getV26();
				sender.sendMessage(ChatColor.GREEN + v26);
				return true;
			}else if(args[3].equals("27")){
				String v27 = KJVBibleExodusCh37.getV27();
				sender.sendMessage(ChatColor.GREEN + v27);
				return true;
			}else if(args[3].equals("28")){
				String v28 = KJVBibleExodusCh37.getV28();
				sender.sendMessage(ChatColor.GREEN + v28);
				return true;
			}else if(args[3].equals("29")){
				String v29 = KJVBibleExodusCh37.getV29();
				sender.sendMessage(ChatColor.GREEN + v29);
				return true;
			}else if(args[3].equals("?") || args[3].equals("#")){
				String info = KJVBibleExodusCh37.getInfo();
				sender.sendMessage(ChatColor.GREEN + info);
				return true;
			}else{
				String info = KJVBibleExodusCh37.getInfo();
				sender.sendMessage(ChatColor.RED + "Sorry, " + info);
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "Too many arguments!");
			return true;
		}
	}
}