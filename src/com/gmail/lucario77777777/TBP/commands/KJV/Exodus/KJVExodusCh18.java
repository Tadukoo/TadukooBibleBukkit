package com.gmail.lucario77777777.TBP.commands.KJV.Exodus;

import com.gmail.lucario77777777.TBP.commands.KJV.KJVExodus;
import com.gmail.lucario77777777.TBP.commands.KJV.bible.Exodus.KJVBibleExodusCh18;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJVExodusCh18 extends KJVExodus {
	public KJVExodusCh18(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args.length <= 3){
			String v1 = KJVBibleExodusCh18.getV1();
			sender.sendMessage(ChatColor.GREEN + v1);
			return true;
		}else if(args.length ==4){
			if(args[3].equals("1")){
				String v1 = KJVBibleExodusCh18.getV1();
				sender.sendMessage(ChatColor.GREEN + v1);
				return true;
			}else if(args[3].equals("2")){
				String v2 = KJVBibleExodusCh18.getV2();
				sender.sendMessage(ChatColor.GREEN + v2);
				return true;
			}else if(args[3].equals("3")){
				String v3 = KJVBibleExodusCh18.getV3();
				sender.sendMessage(ChatColor.GREEN + v3);
				return true;
			}else if(args[3].equals("4")){
				String v4 = KJVBibleExodusCh18.getV4();
				sender.sendMessage(ChatColor.GREEN + v4);
				return true;
			}else if(args[3].equals("5")){
				String v5 = KJVBibleExodusCh18.getV5();
				sender.sendMessage(ChatColor.GREEN + v5);
				return true;
			}else if(args[3].equals("6")){
				String v6 = KJVBibleExodusCh18.getV6();
				sender.sendMessage(ChatColor.GREEN + v6);
				return true;
			}else if(args[3].equals("7")){
				String v7 = KJVBibleExodusCh18.getV7();
				sender.sendMessage(ChatColor.GREEN + v7);
				return true;
			}else if(args[3].equals("8")){
				String v8 = KJVBibleExodusCh18.getV8();
				sender.sendMessage(ChatColor.GREEN + v8);
				return true;
			}else if(args[3].equals("9")){
				String v9 = KJVBibleExodusCh18.getV9();
				sender.sendMessage(ChatColor.GREEN + v9);
				return true;
			}else if(args[3].equals("10")){
				String v10 = KJVBibleExodusCh18.getV10();
				sender.sendMessage(ChatColor.GREEN + v10);
				return true;
			}else if(args[3].equals("11")){
				String v11 = KJVBibleExodusCh18.getV11();
				sender.sendMessage(ChatColor.GREEN + v11);
				return true;
			}else if(args[3].equals("12")){
				String v12 = KJVBibleExodusCh18.getV12();
				sender.sendMessage(ChatColor.GREEN + v12);
				return true;
			}else if(args[3].equals("13")){
				String v13 = KJVBibleExodusCh18.getV13();
				sender.sendMessage(ChatColor.GREEN + v13);
				return true;
			}else if(args[3].equals("14")){
				String v14 = KJVBibleExodusCh18.getV14();
				sender.sendMessage(ChatColor.GREEN + v14);
				return true;
			}else if(args[3].equals("15")){
				String v15 = KJVBibleExodusCh18.getV15();
				sender.sendMessage(ChatColor.GREEN + v15);
				return true;
			}else if(args[3].equals("16")){
				String v16 = KJVBibleExodusCh18.getV16();
				sender.sendMessage(ChatColor.GREEN + v16);
				return true;
			}else if(args[3].equals("17")){
				String v17 = KJVBibleExodusCh18.getV17();
				sender.sendMessage(ChatColor.GREEN + v17);
				return true;
			}else if(args[3].equals("18")){
				String v18 = KJVBibleExodusCh18.getV18();
				sender.sendMessage(ChatColor.GREEN + v18);
				return true;
			}else if(args[3].equals("19")){
				String v19 = KJVBibleExodusCh18.getV19();
				sender.sendMessage(ChatColor.GREEN + v19);
				return true;
			}else if(args[3].equals("20")){
				String v20 = KJVBibleExodusCh18.getV20();
				sender.sendMessage(ChatColor.GREEN + v20);
				return true;
			}else if(args[3].equals("21")){
				String v21 = KJVBibleExodusCh18.getV21();
				sender.sendMessage(ChatColor.GREEN + v21);
				return true;
			}else if(args[3].equals("22")){
				String v22 = KJVBibleExodusCh18.getV22();
				sender.sendMessage(ChatColor.GREEN + v22);
				return true;
			}else if(args[3].equals("23")){
				String v23 = KJVBibleExodusCh18.getV23();
				sender.sendMessage(ChatColor.GREEN + v23);
				return true;
			}else if(args[3].equals("24")){
				String v24 = KJVBibleExodusCh18.getV24();
				sender.sendMessage(ChatColor.GREEN + v24);
				return true;
			}else if(args[3].equals("25")){
				String v25 = KJVBibleExodusCh18.getV25();
				sender.sendMessage(ChatColor.GREEN + v25);
				return true;
			}else if(args[3].equals("26")){
				String v26 = KJVBibleExodusCh18.getV26();
				sender.sendMessage(ChatColor.GREEN + v26);
				return true;
			}else if(args[3].equals("27")){
				String v27 = KJVBibleExodusCh18.getV27();
				sender.sendMessage(ChatColor.GREEN + v27);
				return true;
			}else if(args[3].equals("?") || args[3].equals("#")){
				String info = KJVBibleExodusCh18.getInfo();
				sender.sendMessage(ChatColor.GREEN + info);
				return true;
			}else{
				String info = KJVBibleExodusCh18.getInfo();
				sender.sendMessage(ChatColor.RED + "Sorry, " + info);
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "Too many arguments!");
			return true;
		}
	}
}