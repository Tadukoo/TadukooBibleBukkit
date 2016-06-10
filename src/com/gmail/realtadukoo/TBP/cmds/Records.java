package com.gmail.realtadukoo.TBP.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.realtadukoo.TBP.TB;

public class Records {
	public static String[] getpRecs(TB plugin, String playerType, String type, String pName){
		String[] rec = new String[4];
		String ID = null;
		if(playerType.equalsIgnoreCase("player")){
			@SuppressWarnings("deprecation")
			Player player = plugin.getServer().getPlayer(pName);
			ID = player.getUniqueId().toString();
		}else{
			ID = "console";
		}
		if(type == "verse"){
			rec[0] = TB.getpRec().getString(ID + ".lastRead.bookName");
			rec[1] = TB.getpRec().getString(ID + ".lastRead.chp");
			rec[2] = TB.getpRec().getString(ID + ".lastRead.v");
			rec[3] = TB.getpRec().getString(ID + ".lastRead.tran");
		}else if(type == "book"){
			rec[0] = TB.getpRec().getString(ID + ".lastbook.book");
			rec[1] = TB.getpRec().getString(ID + ".lastbook.part");
			rec[2] = TB.getpRec().getString(ID + ".lastbook.tran");
		}
		return rec;
	}
	
	public static void savepRecs(TB plugin, String playerType, String type, String pName, String bookName, 
			String chp, String v, String tran, String part){
		if(bookName.contains(" ")){
			bookName = bookName.replaceAll(" ", "");
		}
		String ID = null;
		if(playerType.equalsIgnoreCase("player")){
			@SuppressWarnings("deprecation")
			Player player = plugin.getServer().getPlayer(pName);
			ID = player.getUniqueId().toString();
		}else{
			ID = "console";
		}
		if(type == "verse"){
			TB.getpRec().set(ID + ".lastRead.bookName", bookName);
			TB.getpRec().set(ID + ".lastRead.chp", chp);
			TB.getpRec().set(ID + ".lastRead.v", v);
			TB.getpRec().set(ID + ".lastRead.tran", tran);
		}else if(type == "book"){
			TB.getpRec().set(ID + ".lastbook.book", bookName);
			TB.getpRec().set(ID + ".lastbook.part", part);
			TB.getpRec().set(ID + ".lastbook.tran", tran);
		}
		TB.savepRec();
	}
	
	public static void listFavorites(TB plugin, CommandSender sender, String playerType, String pName, int page){
		int lim = getFavoriteNum(plugin, playerType, pName);
		int i = 5*(page - 1) + 1;
		int j = i + 5;
		while (i <= j){
			if(i < lim && i < j){
				sender.sendMessage(ChatColor.GREEN + getFavoriteRef(plugin, playerType, pName, i));
				i++;
			}else{
				if(i < lim){
					String nextPage = plugin.getLanguage(false).getString("command.favorite.nextpage");
					String next = String.valueOf(page + 1);
					nextPage = nextPage.replaceAll("\\{num\\}", next);
					sender.sendMessage(ChatColor.GREEN + nextPage);
				}
				i = j + 1;
			}
		}
		
	}
	
	public static String[] getFavorite(TB plugin, String playerType, String pName, int num){
		String ID = null;
		if(playerType.equalsIgnoreCase("player")){
			@SuppressWarnings("deprecation")
			Player player = plugin.getServer().getPlayer(pName);
			ID = player.getUniqueId().toString();
		}else{
			ID = "console";
		}
		String bookName = TB.getpRec().getString(ID + ".favorite." + num + ".book");
		String chp = TB.getpRec().getString(ID + ".favorite." + num + ".chp");
		String v = TB.getpRec().getString(ID + ".favorite." + num + ".v");
		String tran = TB.getpRec().getString(ID + ".favorite." + num + ".tran");
		String[] favorite = {bookName, chp, v, tran};
		return favorite;
	}
	
	public static String getFavoriteRef(TB plugin, String playerType, String pName, int num){
		String ID = null;
		if(playerType.equalsIgnoreCase("player")){
			@SuppressWarnings("deprecation")
			Player player = plugin.getServer().getPlayer(pName);
			ID = player.getUniqueId().toString();
		}else{
			ID = "console";
		}
		String bookName = TB.getpRec().getString(ID + ".favorite." + num + ".book");
		String chp = TB.getpRec().getString(ID + ".favorite." + num + ".chp");
		String v = TB.getpRec().getString(ID + ".favorite." + num + ".v");
		String tran = TB.getpRec().getString(ID + ".favorite." + num + ".tran");
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
	
	public static void saveFavorite(TB plugin, String playerType, String bookName, String chp, String v, 
			String tran, String pName){
		if(bookName.contains(" ")){
			bookName = bookName.replaceAll(" ", "");
		}
		String ID = null;
		if(playerType.equalsIgnoreCase("player")){
			@SuppressWarnings("deprecation")
			Player player = plugin.getServer().getPlayer(pName);
			ID = player.getUniqueId().toString();
		}else{
			ID = "console";
		}
		int num = getFavoriteNum(plugin, playerType, pName);
		TB.getpRec().set(ID + ".favorite." + num + ".book", bookName);
		TB.getpRec().set(ID + ".favorite." + num + ".chp", chp);
		TB.getpRec().set(ID + ".favorite." + num + ".v", v);
		TB.getpRec().set(ID + ".favorite." + num + ".tran", tran);
		TB.savepRec();
	}
	
	public static int getFavoriteNum(TB plugin, String playerType, String pName){
		boolean cont = true;
		int i = 1;
		String ID = null;
		if(playerType.equalsIgnoreCase("player")){
			@SuppressWarnings("deprecation")
			Player player = plugin.getServer().getPlayer(pName);
			ID = player.getUniqueId().toString();
		}else{
			ID = "console";
		}
		while(cont){
			if(TB.getpRec().getString(ID + ".favorite." + i + ".book") == null){
				cont = false;
			}else{
				i++;
			}
		}
		return i;
	}
}
