package com.gmail.lucario77777777.TBP.commands;

import com.gmail.lucario77777777.TBP.TB;

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
}
