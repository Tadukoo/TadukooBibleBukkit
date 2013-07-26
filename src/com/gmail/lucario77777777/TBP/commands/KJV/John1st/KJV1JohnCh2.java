package com.gmail.lucario77777777.TBP.commands.KJV.John1st;

import com.gmail.lucario77777777.TBP.commands.KJV.bible.John1st.KJVBible1JohnCh2;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJV1JohnCh2 extends KJV1John {
	public KJV1JohnCh2(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args.length <= 4){
			String v1 = KJVBible1JohnCh2.getV1();
			sender.sendMessage(ChatColor.GREEN + v1);
			return true;
		}else if(args.length ==5){
			if(args[4].equals("1")){
				String v1 = KJVBible1JohnCh2.getV1();
				sender.sendMessage(ChatColor.GREEN + v1);
				return true;
			}else if(args[4].equals("2")){
				String v2 = KJVBible1JohnCh2.getV2();
				sender.sendMessage(ChatColor.GREEN + v2);
				return true;
			}else if(args[4].equals("3")){
				String v3 = KJVBible1JohnCh2.getV3();
				sender.sendMessage(ChatColor.GREEN + v3);
				return true;
			}else if(args[4].equals("4")){
				String v4 = KJVBible1JohnCh2.getV4();
				sender.sendMessage(ChatColor.GREEN + v4);
				return true;
			}else if(args[4].equals("5")){
				String v5 = KJVBible1JohnCh2.getV5();
				sender.sendMessage(ChatColor.GREEN + v5);
				return true;
			}else if(args[4].equals("6")){
				String v6 = KJVBible1JohnCh2.getV6();
				sender.sendMessage(ChatColor.GREEN + v6);
				return true;
			}else if(args[4].equals("7")){
				String v7 = KJVBible1JohnCh2.getV7();
				sender.sendMessage(ChatColor.GREEN + v7);
				return true;
			}else if(args[4].equals("8")){
				String v8 = KJVBible1JohnCh2.getV8();
				sender.sendMessage(ChatColor.GREEN + v8);
				return true;
			}else if(args[4].equals("9")){
				String v9 = KJVBible1JohnCh2.getV9();
				sender.sendMessage(ChatColor.GREEN + v9);
				return true;
			}else if(args[4].equals("10")){
				String v10 = KJVBible1JohnCh2.getV10();
				sender.sendMessage(ChatColor.GREEN + v10);
				return true;
			}else if(args[4].equals("11")){
				String v11 = KJVBible1JohnCh2.getV11();
				sender.sendMessage(ChatColor.GREEN + v11);
				return true;
			}else if(args[4].equals("12")){
				String v12 = KJVBible1JohnCh2.getV12();
				sender.sendMessage(ChatColor.GREEN + v12);
				return true;
			}else if(args[4].equals("13")){
				String v13 = KJVBible1JohnCh2.getV13();
				sender.sendMessage(ChatColor.GREEN + v13);
				return true;
			}else if(args[4].equals("14")){
				String v14 = KJVBible1JohnCh2.getV14();
				sender.sendMessage(ChatColor.GREEN + v14);
				return true;
			}else if(args[4].equals("15")){
				String v15 = KJVBible1JohnCh2.getV15();
				sender.sendMessage(ChatColor.GREEN + v15);
				return true;
			}else if(args[4].equals("16")){
				String v16 = KJVBible1JohnCh2.getV16();
				sender.sendMessage(ChatColor.GREEN + v16);
				return true;
			}else if(args[4].equals("17")){
				String v17 = KJVBible1JohnCh2.getV17();
				sender.sendMessage(ChatColor.GREEN + v17);
				return true;
			}else if(args[4].equals("18")){
				String v18 = KJVBible1JohnCh2.getV18();
				sender.sendMessage(ChatColor.GREEN + v18);
				return true;
			}else if(args[4].equals("19")){
				String v19 = KJVBible1JohnCh2.getV19();
				sender.sendMessage(ChatColor.GREEN + v19);
				return true;
			}else if(args[4].equals("20")){
				String v20 = KJVBible1JohnCh2.getV20();
				sender.sendMessage(ChatColor.GREEN + v20);
				return true;
			}else if(args[4].equals("21")){
				String v21 = KJVBible1JohnCh2.getV21();
				sender.sendMessage(ChatColor.GREEN + v21);
				return true;
			}else if(args[4].equals("22")){
				String v22 = KJVBible1JohnCh2.getV22();
				sender.sendMessage(ChatColor.GREEN + v22);
				return true;
			}else if(args[4].equals("23")){
				String v23 = KJVBible1JohnCh2.getV23();
				sender.sendMessage(ChatColor.GREEN + v23);
				return true;
			}else if(args[4].equals("24")){
				String v24 = KJVBible1JohnCh2.getV24();
				sender.sendMessage(ChatColor.GREEN + v24);
				return true;
			}else if(args[4].equals("25")){
				String v25 = KJVBible1JohnCh2.getV25();
				sender.sendMessage(ChatColor.GREEN + v25);
				return true;
			}else if(args[4].equals("26")){
				String v26 = KJVBible1JohnCh2.getV26();
				sender.sendMessage(ChatColor.GREEN + v26);
				return true;
			}else if(args[4].equals("27")){
				String v27 = KJVBible1JohnCh2.getV27();
				sender.sendMessage(ChatColor.GREEN + v27);
				return true;
			}else if(args[4].equals("28")){
				String v28 = KJVBible1JohnCh2.getV28();
				sender.sendMessage(ChatColor.GREEN + v28);
				return true;
			}else if(args[4].equals("29")){
				String v29 = KJVBible1JohnCh2.getV29();
				sender.sendMessage(ChatColor.GREEN + v29);
				return true;
			}else if(args[4].equals("?") || args[4].equals("#")){
				String info = KJVBible1JohnCh2.getInfo();
				sender.sendMessage(ChatColor.GREEN + info);
				return true;
			}else{
				String info = KJVBible1JohnCh2.getInfo();
				sender.sendMessage(ChatColor.RED + "Sorry, " + info);
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "Too many arguments!");
			return true;
		}
	}
}