package com.gmail.lucario77777777.TBP;

import java.util.logging.Level;

public class BookDefine {
	public static void run(Main plugin, String tran, String bookName, String cmd){
		String page = "";
		String realPage = null;
		String nextPage = null;
		int v = 1;
		int lv = 0;
		int c = 0;
		int lc = 0;
		int pageNum = 1;
		int bookNum = 1;
		int jL = plugin.getConfig().getInt("BookConfigChapterNotifications");
		int j = 0;
		boolean cont = true;
		boolean chpD = false;
		plugin.getigBook(tran).set(bookName + "1Start", "1:1");
		plugin.saveigBook(tran);
		while(cont == true){
			if(page == "" && nextPage != null){
				page = nextPage;
				nextPage = null;
				chpD = false;
			}
			if(page.length() < 256){
				if(chpD == false){
					if(plugin.getBook(tran, bookName).getString("ch" + c + "v" + v) == null){
						lc = c;
						c++;
						if(c != 1){
							nextPage = "\n";
							nextPage = nextPage + "Chapter " + c + "\n";
						}else{
							nextPage = "Chapter " + c + "\n";
						}
						chpD = true;
						j++;
						if(j == jL){
							j = 0;
							int chp = c;
							plugin.getLogger().log(Level.INFO, "Starting " + bookName + " Chapter " + chp + 
									".");
						}
						lv = v;
						v = 1;
						if(plugin.getBook(tran, bookName).getString("ch" + c + "v" + v) == null){
							cont = false;
							realPage = page;
							int sv = lv - 1;
							plugin.getigBook(tran).set(bookName + bookNum + "End", lc + ":" + sv);
							plugin.saveigBook(tran);
						}
					}else{
						if(pageNum == 50){
							String temp = " " + v + " ";
							if (page.length() + temp.length() + 
									plugin.getBook(tran, bookName).getString("ch" + c + "v" + v).length() 
									> 256){
								realPage = page;
								int sc = 0;
								if(v == 1){
									sc = lc;
								}else{
									sc = c;
								}
								int sbookNum = bookNum + 1;
								plugin.getigBook(tran).set(bookName + bookNum + "End", sc + ":" + lv);
								plugin.getigBook(tran).set(bookName + sbookNum + "Start", c + ":" + v);
								plugin.saveigBook(tran);
							}else{
								page = page + " ";
								if(v != 1){
									page = page + v + " ";
								}
								page = page + plugin.getBook(tran, bookName).getString("ch" + c + "v" + v);
								lv = v;
								v++;
							}
							temp = null;
						}else{
							page = page + " ";
							if(v != 1){
								page = page + v + " ";
							}
							page = page + plugin.getBook(tran, bookName).getString("ch" + c + "v" + v);
							lv = v;
							v++;
						}
					}
				}else{
					realPage = page;
				}
			}
			if(page.length() == 256){
				realPage = page;
			}else if(page.length() > 256){
				String[] sPage = page.split(" ");
				int sL = sPage.length;
				String tPage = "";
				String trPage = "";
				String tnPage = "";
				int k = 0;
				boolean sCont = true;
				boolean nCont = true;
				while(sCont == true){
					if(k < sL){
						tPage = tPage + sPage[k] + " ";
						k++;
					}else{
						sCont = false;
					}
					if(tPage.length() <= 256){
						trPage = tPage;
					}else{
						int tpL = tPage.length();
						int trpL = trPage.length();
						tnPage = tPage.substring(trpL, tpL);
						sCont = false;
					}
				}
				while(nCont == true){
					if(k < sL){
						tnPage = tnPage + sPage[k] + " ";
						k++;
					}else{
						nCont = false;
					}
				}
				realPage = trPage;
				nextPage = tnPage;
				trPage = "";
				tnPage = null;
			}
			if(pageNum > 50){
				bookNum++;
				pageNum = 1;
			}
			if(realPage != null){
				if(cmd.equalsIgnoreCase("write")){
					plugin.getigBook(tran).set(bookName + "Book" + bookNum + "." + pageNum, realPage);
					plugin.saveigBook(tran);
				}else if(cmd.equalsIgnoreCase("fix")){
					if(realPage != plugin.getigBook(tran).getString(bookName + "Book" + bookNum + "." + pageNum)){
						plugin.getigBook(tran).set(bookName + "Book" + bookNum + "." + pageNum, realPage);
						plugin.saveigBook(tran);
					}
				}else{
					plugin.getLogger().log(Level.SEVERE, "An error occured in creating the book config for " +
							tran + ".");
				}
				pageNum++;
				realPage = null;
				page = "";
			}
			if(cont == false){
				plugin.getLogger().log(Level.INFO, bookName + " finished.");
				plugin.getLogger().log(Level.INFO, "Saving " + tran + "bookconfig.yml...");
				plugin.saveigBook(tran);
				return;
			}
		}
	}
}
