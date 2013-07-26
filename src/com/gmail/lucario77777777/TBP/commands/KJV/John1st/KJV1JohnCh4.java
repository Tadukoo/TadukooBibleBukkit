package com.gmail.lucario77777777.TBP.commands.KJV.John1st;

import com.gmail.lucario77777777.TBP.commands.KJV.bible.John1st.KJVBible1JohnCh4;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJV1JohnCh4 extends KJV1John {
	public KJV1JohnCh4(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args.length <= 4){
			String v1 = KJVBible1JohnCh4.getV1();
			sender.sendMessage(ChatColor.GREEN + v1);
			return true;
		}else if(args.length ==5){
			if(args[4].equals("1")){
				String v1 = KJVBible1JohnCh4.getV1();
				sender.sendMessage(ChatColor.GREEN + v1);
				return true;
			}else if(args[4].equals("2")){
				String v2 = KJVBible1JohnCh4.getV2();
				sender.sendMessage(ChatColor.GREEN + v2);
				return true;
			}else if(args[4].equals("3")){
				String v3 = KJVBible1JohnCh4.getV3();
				sender.sendMessage(ChatColor.GREEN + v3);
				return true;
			}else if(args[4].equals("4")){
				String v4 = KJVBible1JohnCh4.getV4();
				sender.sendMessage(ChatColor.GREEN + v4);
				return true;
			}else if(args[4].equals("5")){
				String v5 = KJVBible1JohnCh4.getV5();
				sender.sendMessage(ChatColor.GREEN + v5);
				return true;
			}else if(args[4].equals("6")){
				String v6 = KJVBible1JohnCh4.getV6();
				sender.sendMessage(ChatColor.GREEN + v6);
				return true;
			}else if(args[4].equals("7")){
				String v7 = KJVBible1JohnCh4.getV7();
				sender.sendMessage(ChatColor.GREEN + v7);
				return true;
			}else if(args[4].equals("8")){
				String v8 = KJVBible1JohnCh4.getV8();
				sender.sendMessage(ChatColor.GREEN + v8);
				return true;
			}else if(args[4].equals("9")){
				String v9 = KJVBible1JohnCh4.getV9();
				sender.sendMessage(ChatColor.GREEN + v9);
				return true;
			}else if(args[4].equals("10")){
				String v10 = KJVBible1JohnCh4.getV10();
				sender.sendMessage(ChatColor.GREEN + v10);
				return true;
			}else if(args[4].equals("11")){
				String v11 = KJVBible1JohnCh4.getV11();
				sender.sendMessage(ChatColor.GREEN + v11);
				return true;
			}else if(args[4].equals("12")){
				String v12 = KJVBible1JohnCh4.getV12();
				sender.sendMessage(ChatColor.GREEN + v12);
				return true;
			}else if(args[4].equals("13")){
				String v13 = KJVBible1JohnCh4.getV13();
				sender.sendMessage(ChatColor.GREEN + v13);
				return true;
			}else if(args[4].equals("14")){
				String v14 = KJVBible1JohnCh4.getV14();
				sender.sendMessage(ChatColor.GREEN + v14);
				return true;
			}else if(args[4].equals("15")){
				String v15 = KJVBible1JohnCh4.getV15();
				sender.sendMessage(ChatColor.GREEN + v15);
				return true;
			}else if(args[4].equals("16")){
				String v16 = KJVBible1JohnCh4.getV16();
				sender.sendMessage(ChatColor.GREEN + v16);
				return true;
			}else if(args[4].equals("17")){
				String v17 = KJVBible1JohnCh4.getV17();
				sender.sendMessage(ChatColor.GREEN + v17);
				return true;
			}else if(args[4].equals("18")){
				String v18 = KJVBible1JohnCh4.getV18();
				sender.sendMessage(ChatColor.GREEN + v18);
				return true;
			}else if(args[4].equals("19")){
				String v19 = KJVBible1JohnCh4.getV19();
				sender.sendMessage(ChatColor.GREEN + v19);
				return true;
			}else if(args[4].equals("20")){
				String v20 = KJVBible1JohnCh4.getV20();
				sender.sendMessage(ChatColor.GREEN + v20);
				return true;
			}else if(args[4].equals("21")){
				String v21 = KJVBible1JohnCh4.getV21();
				sender.sendMessage(ChatColor.GREEN + v21);
				return true;
			}else if(args[4].equals("?") || args[4].equals("#")){
				String info = KJVBible1JohnCh4.getInfo();
				sender.sendMessage(ChatColor.GREEN + info);
				return true;
			}else{
				String info = KJVBible1JohnCh4.getInfo();
				sender.sendMessage(ChatColor.RED + "Sorry, " + info);
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "Too many arguments!");
			return true;
		}
	}
}