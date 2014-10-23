package com.gmail.lucario77777777.TBP.commands.handling;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumChps;
import com.gmail.lucario77777777.TBP.Enums.EnumTrans;
import com.gmail.lucario77777777.TBP.commands.References;

public class Checks {
	public static boolean consoleCheck(TB plugin, CommandSender sender, String playerType) {
		if(playerType == "console"){
			sender.sendMessage(ChatColor.RED + plugin.getLanguage().getString("command.error.mustbeplayer"));
			return false;
		}else{
			return true;
		}
	}

	public static boolean checkForYML(TB plugin, CommandSender sender, String bookName, String tran) {
		if(plugin.getBook(bookName, tran) == null){
			if(sender != null){
				String error = plugin.getLanguage().getString("command.error.ymldoesntexist");
				error = error.replaceAll("\\{tran\\}", tran);
				error = error.replaceAll("\\{book\\}", bookName);
				sender.sendMessage(ChatColor.RED + error);
			}
			return false;
		}else{
			return true;
		}
	}
	
	public static boolean permCheck(String playerType, TB plugin, CommandSender sender, String type, 
			String perm, boolean permsOn){
		if(permsOn && playerType == "player"){
			Player player = (Player) sender;
			String donthave = plugin.getLanguage().getString("permission.donthave");
			String need = plugin.getLanguage().getString("permission.need");
			if(type == "Bible"){
				if(player.hasPermission("TadukooBible." + perm)){
					return true;
				}else{
					need = need.replaceAll("\\{perm\\}", "TadukooBible." + perm);
					sender.sendMessage(ChatColor.RED + donthave);
					sender.sendMessage(ChatColor.RED + need);
					return false;
				}
			}else if(type == "Apocrypha"){
				if(player.hasPermission("TadukooBible.apocrypha." + perm)){
					return true;
				}else{
					need = need.replaceAll("\\{perm\\}", "TadukooBible.apocrypha." + perm);
					sender.sendMessage(ChatColor.RED + donthave);
					sender.sendMessage(ChatColor.RED + need);
					return false;
				}
			}else{
				sender.sendMessage(ChatColor.RED + plugin.getLanguage().getString("command.error.generic"));
				return false;
			}
		}else{
			return true;
		}
	}
	
	public static boolean tranPerm(TB plugin, CommandSender sender, String tran){
		EnumTrans etran = EnumTrans.KJV;
		EnumTrans defaultTran = etran.getDefault();
		boolean defTran;
		String donthave = plugin.getLanguage().getString("permission.donthavetran");
		donthave = donthave.replaceAll("//{tran//}", tran);
		String need = plugin.getLanguage().getString("permission.need");
		if(etran.fromString(tran) == defaultTran){
			defTran = true;
		}else{
			defTran = false;
		}
		if(defTran){
			need = need.replaceAll("//{perm//}", "TadukooBible.translation.default");
			if(sender.hasPermission("TadukooBible.translation.default")){
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + donthave);
				sender.sendMessage(ChatColor.RED + need);
				return false;
			}
		}else{
			need = need.replaceAll("//{perm//}", "TadukooBible.translation." + tran);
			if(sender.hasPermission("TadukooBible.translation." + tran)){
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + donthave);
				sender.sendMessage(ChatColor.RED + need);
				return false;
			}
		}
	}
	
	public static String bookCheck(TB plugin, CommandSender sender, EnumBooks book, String bookName,
			String chp, String v){
		try{
			EnumChps echp = EnumChps.GENESIS;
			echp = echp.fromString(bookName, 0);
			if(Integer.parseInt(chp) > book.getChp()){
				String chpdoesntexist = plugin.getLanguage().getString("command.error.chpdoesntexist");
				chpdoesntexist = chpdoesntexist.replaceAll("\\{book\\}", bookName);
				sender.sendMessage(ChatColor.RED + chpdoesntexist);
				return null;
			}
			if(Integer.parseInt(v) > echp.getNum(Integer.parseInt(chp))){
				String vdoesntexist = plugin.getLanguage().getString("command.error.vdoesntexist");
				vdoesntexist = vdoesntexist.replaceAll("\\{book\\}", bookName);
				vdoesntexist = vdoesntexist.replaceAll("\\{chp\\}", chp);
				sender.sendMessage(ChatColor.RED + vdoesntexist);
				return null;
			}
		}catch(NumberFormatException e){
			sender.sendMessage(ChatColor.RED + plugin.getLanguage().getString("command.error.chpvmustbenums"));
			sender.sendMessage(ChatColor.RED + plugin.getLanguage().getString("help.pages.ann.usage"));
			return null;
		}
		String ref = References.makeRef(book, chp, v);
		return ref;
	}
}
