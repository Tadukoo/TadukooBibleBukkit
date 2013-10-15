package com.gmail.lucario77777777.TBP;

import java.util.logging.Level;

public class BookDefine {
	public static void run(Main plugin, String tran, String bookName){
		String page = "";
		String realPage = "";
		String nextPage = "";
		int v = 1;
		int c = 0;
		int pL = 0;
		int pageNum = 1;
		int bookNum = 1;
		int jL = 5;
		int j = 0;
		boolean cont = true;
		while(cont == true){
			if(nextPage != ""){
				page = nextPage;
				nextPage = "";
			}
			if(page.length() < 256){
				if(plugin.getBook(tran, bookName).getString("ch" + c + "v" + v) == null){
					c++;
					page = page + "Chapter " + c + "\n";
					j++;
					if(j == jL){
						j = 0;
						int chp = c;
						plugin.getLogger().log(Level.INFO, bookName + " Chapter " + chp + " finished.");
					}
					v = 1;
					if(plugin.getBook(tran, bookName).getString("ch" + c + "v" + v) == null){
						cont = false;
						plugin.getLogger().log(Level.INFO, bookName + " finished.");
						plugin.saveigBook(tran);
						plugin.getLogger().log(Level.INFO, "Saving " + tran + "config.yml...");
						return;
					}
				}
				page = page + plugin.getBook(tran, bookName).getString("ch" + c + "v" + v);
				v++;
			}
			if(page.length() == 256){
				realPage = page;
			}else if(page.length() > 256){
				pL = page.length();
				realPage = page.substring(0,256);
				nextPage = page.substring(256,pL);
			}
			if(pageNum > 50){
				bookNum++;
				pageNum = 1;
			}
			if(realPage != ""){
				plugin.getigBook(tran).set(bookName + "Book" + bookNum + "." + pageNum, realPage);
				plugin.saveigBook(tran);
				pageNum++;
				realPage = "";
				page = "";
			}
		}
	}
}
