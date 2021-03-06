package com.gmail.realtadukoo.TBP.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TBP.TB;
import com.gmail.realtadukoo.TBP.Enums.EnumHelp;

public class HelpPages {
	private static int readPage = EnumHelp.READ.getNum();
	private static int sendPage = EnumHelp.SEND.getNum();
	private static int previousPage = EnumHelp.PREVIOUS.getNum();
	private static int nextPage = EnumHelp.NEXT.getNum();
	private static int lastPage = EnumHelp.LAST.getNum();
	private static int favoritePage = EnumHelp.FAVORITE.getNum();
	private static int randomPage = EnumHelp.RANDOM.getNum();
	private static int getbookPage = EnumHelp.GETBOOK.getNum();
	private static int sendbookPage = EnumHelp.SENDBOOK.getNum();
	private static int infoPage = EnumHelp.INFO.getNum();
	private static int pluginPage = EnumHelp.PLUGIN.getNum();
	private static int booksPage = EnumHelp.BOOKS.getNum();
	private static int translationPage = EnumHelp.TRANSLATION.getNum();
	private static int permissionPage = EnumHelp.PERMISSION.getNum();
	private static int configPage = EnumHelp.CONFIG.getNum();
	private static int announcePage = EnumHelp.ANNOUNCE.getNum();
	private static int maxPages = EnumHelp.ANNOUNCE2.getNum();
	
	public static void help(TB plugin, CommandSender sender, String title, int helpPage, int helpPageU, 
			int helpPageMinor, EnumHelp ehelp){
		String heading = plugin.getLanguage(true).getString("help.heading");
		heading = heading.replaceAll("\\{plugin\\}", "Bible");
		heading = heading.replaceAll("\\{title\\}", plugin.getLanguage(false).getString("help.titles." + title));
		heading = heading.replaceAll("\\{helpPage\\}", String.valueOf(helpPage));
		heading = heading.replaceAll("\\{maxPages\\}", String.valueOf(maxPages));
		heading = heading.replaceAll("\\{minorPage\\}", String.valueOf(helpPageMinor));
		heading = heading.replaceAll("\\{maxMinorPages\\}", String.valueOf(ehelp.getMax()));
		String line1 = "", line2 = "", line3 = "", line4 = "";
		String l1 = ehelp.getLine1(), l2 = ehelp.getLine2(), l3 = ehelp.getLine3(), l4 = ehelp.getLine4();
		String pageNext = plugin.getLanguage(true).getString("help.nextPage.generic");
		pageNext = pageNext.replaceAll("\\{nextPage\\}", String.valueOf(helpPageU));
		String pageNextspec = plugin.getLanguage(true).getString("help.nextPage.specific");
		pageNextspec = pageNextspec.replaceAll("\\{nextPage\\}", String.valueOf(helpPageU));
		if(l1 != "" && l1 != "nextPage" && l1 != "nextPageSpec"){
			line1 = plugin.getLanguage(false).getString("help.pages." + l1);
		}else if(l1 == "nextPage"){
			line1 = pageNext;
		}else if(l1 == "nextPageSpec"){
			line1 = pageNextspec;
		}
		if(l2 != "" && l2 != "nextPage" && l2 != "nextPageSpec"){
			line2 = plugin.getLanguage(false).getString("help.pages." + l2);
		}else if(l2 == "nextPage"){
			line2 = pageNext;
		}else if(l2 == "nextPageSpec"){
			line2 = pageNextspec;
		}
		if(l3 != "" && l3 != "nextPage" && l3 != "nextPageSpec"){
			line3 = plugin.getLanguage(false).getString("help.pages." + l3);
		}else if(l3 == "nextPage"){
			line3 = pageNext;
		}else if(l3 == "nextPageSpec"){
			line3 = pageNextspec;
		}
		if(l4 != "" && l4 != "nextPage" && l4 != "nextPageSpec"){
			line4 = plugin.getLanguage(false).getString("help.pages." + l4);
		}else if(l4 == "nextPage"){
			line4 = pageNext;
		}else if(l4 == "nextPageSpec"){
			line4 = pageNextspec;
		}
		if(line1.contains("\\{def")){
			line1 = line1.replaceAll("\\{defBook\\}", plugin.getConfig().getString("DefaultBook"));
			line1 = line1.replaceAll("\\{defChp\\}", plugin.getConfig().getString("DefaultChapter"));
			line1 = line1.replaceAll("\\{defV\\}", plugin.getConfig().getString("DefaultVerse"));
			line1 = line1.replaceAll("\\{defTran\\}", plugin.getConfig().getString("DefaultTranslation"));
		}
		if(line2.contains("\\{def")){
			line2 = line1.replaceAll("\\{defBook\\}", plugin.getConfig().getString("DefaultBook"));
			line2 = line1.replaceAll("\\{defChp\\}", plugin.getConfig().getString("DefaultChapter"));
			line2 = line1.replaceAll("\\{defV\\}", plugin.getConfig().getString("DefaultVerse"));
			line2 = line1.replaceAll("\\{defTran\\}", plugin.getConfig().getString("DefaultTranslation"));
		}
		if(line3.contains("\\{def")){
			line3 = line1.replaceAll("\\{defBook\\}", plugin.getConfig().getString("DefaultBook"));
			line3 = line1.replaceAll("\\{defChp\\}", plugin.getConfig().getString("DefaultChapter"));
			line3 = line1.replaceAll("\\{defV\\}", plugin.getConfig().getString("DefaultVerse"));
			line3 = line1.replaceAll("\\{defTran\\}", plugin.getConfig().getString("DefaultTranslation"));
		}
		if(line4.contains("\\{def")){
			line4 = line1.replaceAll("\\{defBook\\}", plugin.getConfig().getString("DefaultBook"));
			line4 = line1.replaceAll("\\{defChp\\}", plugin.getConfig().getString("DefaultChapter"));
			line4 = line1.replaceAll("\\{defV\\}", plugin.getConfig().getString("DefaultVerse"));
			line4 = line1.replaceAll("\\{defTran\\}", plugin.getConfig().getString("DefaultTranslation"));
		}
		String page = title + helpPageMinor;
		if(page.equalsIgnoreCase("toc1")){
			line1 = line1.replaceAll("\\{pageType\\}", String.valueOf(readPage));
			line1 = line1.replaceAll(" \\{command\\}", "");
			line2 = line2.replaceAll("\\{pageType\\}", String.valueOf(sendPage));
			line2 = line2.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("commands.send"));
			line3 = line3.replaceAll("\\{pageType\\}", String.valueOf(previousPage));
			line3 = line3.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("commands.previous"));
		}else if(page.equalsIgnoreCase("toc2")){
			line1 = line1.replaceAll("\\{pageType\\}", String.valueOf(nextPage));
			line1 = line1.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("commands.next"));
			line2 = line2.replaceAll("\\{pageType\\}", String.valueOf(lastPage));
			line2 = line2.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("commands.last"));
			line3 = line3.replaceAll("\\{pageType\\}", String.valueOf(favoritePage));
			line3 = line3.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("commands.favorite"));
		}else if(page.equalsIgnoreCase("toc3")){
			line1 = line1.replaceAll("\\{pageType\\}", String.valueOf(randomPage));
			line1 = line1.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("commands.random"));
			line2 = line2.replaceAll("\\{pageType\\}", String.valueOf(getbookPage));
			line2 = line2.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("commands.getbook"));
			line3 = line3.replaceAll("\\{pageType\\}", String.valueOf(sendbookPage));
			line3 = line3.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("commands.sendbook"));
		}else if(page.equalsIgnoreCase("toc4")){
			line1 = line1.replaceAll("\\{pageType\\}", String.valueOf(infoPage));
			line1 = line1.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("commands.info"));
			line2 = line2.replaceAll("\\{pageType\\}", String.valueOf(pluginPage));
			line2 = line2.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("commands.plugin"));
			line3 = line3.replaceAll("\\{pageType\\}", String.valueOf(booksPage));
			line3 = line3.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("commands.books"));
		}else if(page.equalsIgnoreCase("toc5")){
			line1 = line1.replaceAll("\\{pageType\\}", String.valueOf(translationPage));
			line1 = line1.replaceAll("\\{command\\}", plugin.getLanguage(false).
					getString("commands.translation"));
			line2 = line2.replaceAll("\\{pageType\\}", String.valueOf(permissionPage));
			line2 = line2.replaceAll("\\{command\\}", plugin.getLanguage(false).
					getString("commands.permission"));
			line3 = line3.replaceAll("\\{pageType\\}", String.valueOf(configPage));
			line3 = line3.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("commands.config"));
		}else if(page.equalsIgnoreCase("toc6")){
			line1 = line1.replaceAll("\\{pageType\\}", String.valueOf(announcePage));
			line1 = line1.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("commands.announce"));
		}else if(page.equalsIgnoreCase("read1") || page.equalsIgnoreCase("read2")){
			line4 = line4.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("help.titles.read"));
		}else if(page.equalsIgnoreCase("send1")){
			line4 = line4.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("help.titles.send"));
		}else if(page.equalsIgnoreCase("prev1")){
			line4 = line4.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("help.titles.prev"));
		}else if(page.equalsIgnoreCase("next1")){
			line4 = line4.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("help.titles.next"));
		}else if(page.equalsIgnoreCase("favorite1")){
			line4 = line4.replaceAll("\\{command\\}", plugin.getLanguage(false).
					getString("help.titles.favorite"));
		}else if(page.equalsIgnoreCase("rand1")){
			line4 = line4.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("help.titles.rand"));
		}else if(page.equalsIgnoreCase("getb1") || page.equalsIgnoreCase("getb2") || 
				page.equalsIgnoreCase("getb3")){
			line4 = line4.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("help.titles.getb"));
		}else if(page.equalsIgnoreCase("sendb1")){
			line4 = line4.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("help.titles.sendb"));
		}else if(page.equalsIgnoreCase("sendb2")){
			line4 = line4.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("help.titles.sendb"));
		}else if(page.equalsIgnoreCase("info1") || page.equalsIgnoreCase("info2")){
			line4 = line4.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("help.titles.info"));
		}else if(page.equalsIgnoreCase("books1")){
			line4 = line4.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("help.titles.books"));
		}else if(page.equalsIgnoreCase("config1")){
			line4 = line4.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("help.titles.config"));
		}else if(page.equalsIgnoreCase("ann1")){
			line4 = line4.replaceAll("\\{command\\}", plugin.getLanguage(false).getString("help.titles.ann"));
		}
		sender.sendMessage(ChatColor.GREEN + heading);
		sender.sendMessage(ChatColor.GREEN + line1);
		if(line2 != ""){
			sender.sendMessage(ChatColor.GREEN + line2);
			if(line3 != ""){
				sender.sendMessage(ChatColor.GREEN + line3);
				if(line4 != ""){
					sender.sendMessage(ChatColor.GREEN + line4);
				}
			}
		}
	}
}
