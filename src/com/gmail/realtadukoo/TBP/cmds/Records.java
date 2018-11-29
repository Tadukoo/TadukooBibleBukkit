package com.gmail.realtadukoo.TBP.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.realtadukoo.TBP.TB;

public class Records {
	public static String[] getPlayerRecords(TB plugin, String playerType, String type, String pName){
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
			rec[0] = TB.getPlayerRecords().getString(ID + ".lastRead.bookName");
			rec[1] = TB.getPlayerRecords().getString(ID + ".lastRead.chp");
			rec[2] = TB.getPlayerRecords().getString(ID + ".lastRead.v");
			rec[3] = TB.getPlayerRecords().getString(ID + ".lastRead.tran");
		}else if(type == "book"){
			rec[0] = TB.getPlayerRecords().getString(ID + ".lastbook.book");
			rec[1] = TB.getPlayerRecords().getString(ID + ".lastbook.part");
			rec[2] = TB.getPlayerRecords().getString(ID + ".lastbook.tran");
		}
		return rec;
	}
	
	public static void savePlayerRecords(TB plugin, String playerType, String type, String pName, String bookName, 
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
			TB.getPlayerRecords().set(ID + ".lastRead.bookName", bookName);
			TB.getPlayerRecords().set(ID + ".lastRead.chp", chp);
			TB.getPlayerRecords().set(ID + ".lastRead.v", v);
			TB.getPlayerRecords().set(ID + ".lastRead.tran", tran);
		}else if(type == "book"){
			TB.getPlayerRecords().set(ID + ".lastbook.book", bookName);
			TB.getPlayerRecords().set(ID + ".lastbook.part", part);
			TB.getPlayerRecords().set(ID + ".lastbook.tran", tran);
		}
		TB.savePlayerRecords();
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
					String nextPage = plugin.getLanguage().getString("command.favorite.nextpage");
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
		String bookName = TB.getPlayerRecords().getString(ID + ".favorite." + num + ".book");
		String chp = TB.getPlayerRecords().getString(ID + ".favorite." + num + ".chp");
		String v = TB.getPlayerRecords().getString(ID + ".favorite." + num + ".v");
		String tran = TB.getPlayerRecords().getString(ID + ".favorite." + num + ".tran");
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
		String bookName = TB.getPlayerRecords().getString(ID + ".favorite." + num + ".book");
		String chp = TB.getPlayerRecords().getString(ID + ".favorite." + num + ".chp");
		String v = TB.getPlayerRecords().getString(ID + ".favorite." + num + ".v");
		String tran = TB.getPlayerRecords().getString(ID + ".favorite." + num + ".tran");
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
	
	public static void saveFavorite(TB plugin, String playerType, String bookName, String chp, 
			String v, String tran, String pName, CommandSender sender){
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
		TB.getPlayerRecords().set(ID + ".favorite." + num + ".book", bookName);
		TB.getPlayerRecords().set(ID + ".favorite." + num + ".chp", chp);
		TB.getPlayerRecords().set(ID + ".favorite." + num + ".v", v);
		TB.getPlayerRecords().set(ID + ".favorite." + num + ".tran", tran);
		TB.savePlayerRecords();
		bumpStatistic(plugin, "verses-favorited", sender);
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
			if(TB.getPlayerRecords().getString(ID + ".favorite." + i + ".book") == null){
				cont = false;
			}else{
				i++;
			}
		}
		return i;
	}
	
	public static void bumpStatistic(TB plugin, String statistic, CommandSender sender){
		String ID = "console";
		if(sender instanceof Player){
			ID = ((Player) sender).getUniqueId().toString();
		}
		
		if(!statistic.contains("received")){
			int currentGlobal = 0;
			if(TB.getStatistics().getString(statistic) != null){
				currentGlobal = TB.getStatistics().getInt(statistic);
			}
			if(TB.config.getBoolean("statistics.plugin")){
				TB.getStatistics().set(statistic, currentGlobal + 1);
				TB.saveStatistics();
			}
		}
		int current = 0;
		if(TB.getPlayerRecords().getString(ID + "." + statistic) != null){
			current = TB.getPlayerRecords().getInt(ID + "." + statistic);
		}
		if(TB.config.getBoolean("statistics.player.enabled")){
			TB.getPlayerRecords().set(ID + "." + statistic, current + 1);
			TB.savePlayerRecords();
		}
	}
	
	public static int[] getStatistics(TB plugin, Player player){
		int[] rec = new int[8];
		String ID = player.getUniqueId().toString();
		
		rec[0] = TB.getPlayerRecords().getInt(ID + ".verses-requested");
		rec[1] = TB.getPlayerRecords().getInt(ID + ".verses-received");
		rec[2] = TB.getPlayerRecords().getInt(ID + ".verses-sent");
		rec[3] = TB.getPlayerRecords().getInt(ID + ".verses-favorited");
		rec[4] = TB.getPlayerRecords().getInt(ID + ".verses-announced");
		rec[5] = TB.getPlayerRecords().getInt(ID + ".books-requested");
		rec[6] = TB.getPlayerRecords().getInt(ID + ".books-received");
		rec[7] = TB.getPlayerRecords().getInt(ID + ".books-sent");
		return rec;
	}
	
	public static void listStatistics(TB plugin, Player player){
		int[] rec = getStatistics(plugin, player);
		
		player.sendMessage(ChatColor.GREEN + "Verses requested: " + rec[0]);
		player.sendMessage(ChatColor.GREEN + "Verses received: " + rec[1]);
		player.sendMessage(ChatColor.GREEN + "Verses sent: " + rec[2]);
		player.sendMessage(ChatColor.GREEN + "Verses favorited: " + rec[3]);
		player.sendMessage(ChatColor.GREEN + "Verses announced: " + rec[4]);
		player.sendMessage(ChatColor.GREEN + "Books requested: " + rec[5]);
		player.sendMessage(ChatColor.GREEN + "Books received: " + rec[6]);
		player.sendMessage(ChatColor.GREEN + "Books sent: " + rec[7]);
	}
	
	public static void listOneStatistic(TB plugin, Player player, String statistic){
		String ID = player.getUniqueId().toString();
		
		player.sendMessage(ChatColor.GREEN + "" + TB.getPlayerRecords().getInt(ID + statistic));
	}
	
	public static void listTopStatistic(TB plugin, CommandSender sender, String statistic){
		// TODO: Implement
	}
}
