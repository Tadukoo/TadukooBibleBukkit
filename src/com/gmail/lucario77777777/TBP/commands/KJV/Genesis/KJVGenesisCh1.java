package com.gmail.lucario77777777.TBP.commands.KJV.Genesis;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import com.gmail.lucario77777777.TBP.commands.KJV.bible.Genesis.KJVBibleGenesisCh1;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJVGenesisCh1 extends KJVGenesis {
	public KJVGenesisCh1(Main plugin) {
		super(plugin);
	}
	public static void Run2(CommandSender sender, String[] args){
		InputStreamReader isr = null;
		BufferedReader br = null;
		String sFile = "";
		FileInputStream fstream;
		try {
			fstream = new FileInputStream("/bible/KJVGenCh1.txt");
			try (DataInputStream dstream = new DataInputStream(fstream)) {
				String sCurrentLine;
				isr = new InputStreamReader(dstream);
				br = new BufferedReader(isr);
				while ((sCurrentLine = br.readLine()) != null){
					sFile += sCurrentLine;
				}
			}catch (IOException e){
				e.printStackTrace();
				} finally {
					try {
						if (br != null)br.close();
					} catch (IOException ex) {
						ex.printStackTrace();
					}
			}
		}catch (Exception e){
			sender.sendMessage(ChatColor.RED + "Error:" + e.getMessage());
		}
		int verse = 1;
		if(args.length <= 3){
			verse = 1;
		}else if(args.length ==4){
			verse = 1;
			try{
				verse = Integer.parseInt(args[3]);
			}catch(NumberFormatException e){
				verse = 1;
				sender.sendMessage(ChatColor.RED + "An error occured, using verse 1.");
			}
			if(verse > 31){
				verse = 1;
			}
		}
		String[] verses = sFile.split("¬");
		sender.sendMessage(ChatColor.GREEN + verses[verse]);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args.length <= 3){
			String v1 = KJVBibleGenesisCh1.getV1();
			sender.sendMessage(ChatColor.GREEN + v1);
			return true;
		}else if(args.length ==4){
			if(args[3].equals("1")){
				String v1 = KJVBibleGenesisCh1.getV1();
				sender.sendMessage(ChatColor.GREEN + v1);
				return true;
			}else if(args[3].equals("2")){
				String v2 = KJVBibleGenesisCh1.getV2();
				sender.sendMessage(ChatColor.GREEN + v2);
				return true;
			}else if(args[3].equals("3")){
				String v3 = KJVBibleGenesisCh1.getV3();
				sender.sendMessage(ChatColor.GREEN + v3);
				return true;
			}else if(args[3].equals("4")){
				String v4 = KJVBibleGenesisCh1.getV4();
				sender.sendMessage(ChatColor.GREEN + v4);
				return true;
			}else if(args[3].equals("5")){
				String v5 = KJVBibleGenesisCh1.getV5();
				sender.sendMessage(ChatColor.GREEN + v5);
				return true;
			}else if(args[3].equals("6")){
				String v6 = KJVBibleGenesisCh1.getV6();
				sender.sendMessage(ChatColor.GREEN + v6);
				return true;
			}else if(args[3].equals("7")){
				String v7 = KJVBibleGenesisCh1.getV7();
				sender.sendMessage(ChatColor.GREEN + v7);
				return true;
			}else if(args[3].equals("8")){
				String v8 = KJVBibleGenesisCh1.getV8();
				sender.sendMessage(ChatColor.GREEN + v8);
				return true;
			}else if(args[3].equals("9")){
				String v9 = KJVBibleGenesisCh1.getV9();
				sender.sendMessage(ChatColor.GREEN + v9);
				return true;
			}else if(args[3].equals("10")){
				String v10 = KJVBibleGenesisCh1.getV10();
				sender.sendMessage(ChatColor.GREEN + v10);
				return true;
			}else if(args[3].equals("11")){
				String v11 = KJVBibleGenesisCh1.getV11();
				sender.sendMessage(ChatColor.GREEN + v11);
				return true;
			}else if(args[3].equals("12")){
				String v12 = KJVBibleGenesisCh1.getV12();
				sender.sendMessage(ChatColor.GREEN + v12);
				return true;
			}else if(args[3].equals("13")){
				String v13 = KJVBibleGenesisCh1.getV13();
				sender.sendMessage(ChatColor.GREEN + v13);
				return true;
			}else if(args[3].equals("14")){
				String v14 = KJVBibleGenesisCh1.getV14();
				sender.sendMessage(ChatColor.GREEN + v14);
				return true;
			}else if(args[3].equals("15")){
				String v15 = KJVBibleGenesisCh1.getV15();
				sender.sendMessage(ChatColor.GREEN + v15);
				return true;
			}else if(args[3].equals("16")){
				String v16 = KJVBibleGenesisCh1.getV16();
				sender.sendMessage(ChatColor.GREEN + v16);
				return true;
			}else if(args[3].equals("17")){
				String v17 = KJVBibleGenesisCh1.getV17();
				sender.sendMessage(ChatColor.GREEN + v17);
				return true;
			}else if(args[3].equals("18")){
				String v18 = KJVBibleGenesisCh1.getV18();
				sender.sendMessage(ChatColor.GREEN + v18);
				return true;
			}else if(args[3].equals("19")){
				String v19 = KJVBibleGenesisCh1.getV19();
				sender.sendMessage(ChatColor.GREEN + v19);
				return true;
			}else if(args[3].equals("20")){
				String v20 = KJVBibleGenesisCh1.getV20();
				sender.sendMessage(ChatColor.GREEN + v20);
				return true;
			}else if(args[3].equals("21")){
				String v21 = KJVBibleGenesisCh1.getV21();
				sender.sendMessage(ChatColor.GREEN + v21);
				return true;
			}else if(args[3].equals("22")){
				String v22 = KJVBibleGenesisCh1.getV22();
				sender.sendMessage(ChatColor.GREEN + v22);
				return true;
			}else if(args[3].equals("23")){
				String v23 = KJVBibleGenesisCh1.getV23();
				sender.sendMessage(ChatColor.GREEN + v23);
				return true;
			}else if(args[3].equals("24")){
				String v24 = KJVBibleGenesisCh1.getV24();
				sender.sendMessage(ChatColor.GREEN + v24);
				return true;
			}else if(args[3].equals("25")){
				String v25 = KJVBibleGenesisCh1.getV25();
				sender.sendMessage(ChatColor.GREEN + v25);
				return true;
			}else if(args[3].equals("26")){
				String v26 = KJVBibleGenesisCh1.getV26();
				sender.sendMessage(ChatColor.GREEN + v26);
				return true;
			}else if(args[3].equals("27")){
				String v27 = KJVBibleGenesisCh1.getV27();
				sender.sendMessage(ChatColor.GREEN + v27);
				return true;
			}else if(args[3].equals("28")){
				String v28 = KJVBibleGenesisCh1.getV28();
				sender.sendMessage(ChatColor.GREEN + v28);
				return true;
			}else if(args[3].equals("29")){
				String v29 = KJVBibleGenesisCh1.getV29();
				sender.sendMessage(ChatColor.GREEN + v29);
				return true;
			}else if(args[3].equals("30")){
				String v30 = KJVBibleGenesisCh1.getV30();
				sender.sendMessage(ChatColor.GREEN + v30);
				return true;
			}else if(args[3].equals("31")){
				String v31 = KJVBibleGenesisCh1.getV31();
				sender.sendMessage(ChatColor.GREEN + v31);
				return true;
			}else if(args[3].equals("?") || args[3].equals("#")){
				String info = KJVBibleGenesisCh1.getInfo();
				sender.sendMessage(ChatColor.GREEN + info);
				return true;
			}else{
				String info = KJVBibleGenesisCh1.getInfo();
				sender.sendMessage(ChatColor.RED + "Sorry, " + info);
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "Too many arguments!");
			return true;
		}
	}
}