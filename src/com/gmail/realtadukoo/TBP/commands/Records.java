package com.gmail.realtadukoo.TBP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;

public class Records {
	public static String[] getpRecs(String type, String pName){
		String[] rec = new String[4];
		if(type == "verse"){
			rec[0] = TB.getpRec().getString(pName + ".lastRead.bookName");
			rec[1] = TB.getpRec().getString(pName + ".lastRead.chp");
			rec[2] = TB.getpRec().getString(pName + ".lastRead.v");
			rec[3] = TB.getpRec().getString(pName + ".lastRead.tran");
		}else if(type == "book"){
			rec[0] = TB.getpRec().getString(pName + ".lastbook.book");
			rec[1] = TB.getpRec().getString(pName + ".lastbook.part");
			rec[2] = TB.getpRec().getString(pName + ".lastbook.tran");
		}
		return rec;
	}
	
	public static void savepRecs(String type, String pName, String bookName, String chp,
			String v, String tran, String part){
		if(bookName.contains(" ")){
			bookName = bookName.replaceAll(" ", "");
		}
		if(type == "verse"){
			TB.getpRec().set(pName + ".lastRead.bookName", bookName);
			TB.getpRec().set(pName + ".lastRead.chp", chp);
			TB.getpRec().set(pName + ".lastRead.v", v);
			TB.getpRec().set(pName + ".lastRead.tran", tran);
		}else if(type == "book"){
			TB.getpRec().set(pName + ".lastbook.book", bookName);
			TB.getpRec().set(pName + ".lastbook.part", part);
			TB.getpRec().set(pName + ".lastbook.tran", tran);
		}
		TB.savepRec();
	}
	
	public static void listFavorites(TB plugin, CommandSender sender, String pName, int page){
		int lim = getFavoriteNum(pName);
		int i = 5*(page - 1) + 1;
		int j = i + 5;
		while (i != j){
			if(i < lim){
				sender.sendMessage(ChatColor.GREEN + getFavorite(pName, i));
				i++;
			}else{
				String nextPage = plugin.getLanguage().getString("command.favorite.nextpage");
				String next = String.valueOf(page + 1);
				nextPage = nextPage.replaceAll("\\{num\\}", next);
				sender.sendMessage(ChatColor.GREEN + nextPage);
				i = j;
			}
		}
		
	}
	
	public static String getFavorite(String pName, int num){
		String bookName = TB.getpRec().getString(pName + ".favorite." + num + ".book");
		String chp = TB.getpRec().getString(pName + ".favorite." + num + ".chp");
		String v = TB.getpRec().getString(pName + ".favorite." + num + ".v");
		String tran = TB.getpRec().getString(pName + ".favorite." + num + ".tran");
		if(bookName.contains("1") || bookName.contains("2") || bookName.contains("3") || 
				bookName.contains("SongofSongs")){
			bookName.replaceAll("1", "1 ");
			bookName.replaceAll("2", "2 ");
			bookName.replaceAll("3", "3 ");
			bookName.replaceAll("SongofSongs", "Song of Songs");
		}
		String favorite = bookName + " " + chp + ":" + v + " " + tran;
		return favorite;
	}
	
	public static void saveFavorite(String bookName, String chp, String v, String tran, String pName){
		if(bookName.contains(" ")){
			bookName = bookName.replaceAll(" ", "");
		}
		int num = getFavoriteNum(pName);
		TB.getpRec().set(pName + ".favorite." + num + ".book", bookName);
		TB.getpRec().set(pName + ".favorite." + num + ".chp", chp);
		TB.getpRec().set(pName + ".favorite." + num + ".v", v);
		TB.getpRec().set(pName + ".favorite." + num + ".tran", tran);
	}
	
	public static int getFavoriteNum(String pName){
		boolean cont = true;
		int i = 1;
		while(cont){
			if(TB.getpRec().getString(pName + ".favorite." + i + ".book") == null){
				cont = false;
			}else{
				i++;
			}
		}
		return i;
	}
}
