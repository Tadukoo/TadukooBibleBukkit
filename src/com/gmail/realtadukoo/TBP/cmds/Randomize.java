package com.gmail.realtadukoo.TBP.cmds;

import java.util.Random;

import com.gmail.realtadukoo.TB.Constants.EnumBible;
import com.gmail.realtadukoo.TBP.TB;

public class Randomize {
	public static Random generator = new Random();
	
	public static String book(String tran){
		boolean cont = true;
		String bookName = null;
		while(cont){
			int rB = generator.nextInt(66) + 1;
			bookName = EnumBible.fromInt(rB).getBook();
			cont = false;
			/*
			 * TODO: Add check for availability using EnumAvail.
			 * if(book.isAvailable(tran)){
				cont = false;
			}*/
		}
		return bookName;
	}
	
	public static String chapter(String bookName){
		EnumBible book = EnumBible.fromBook(bookName);
		int lim = book.getNumChapters();
		int rC = generator.nextInt(lim) + 1;
		String chp = Integer.toString(rC);
		return chp;
	}
	
	public static String verse(String bookName, String chp){
		EnumBible book = EnumBible.fromBook(bookName);
		int lim = book.getNumVersesInChp(Integer.parseInt(chp));
		int rV = generator.nextInt(lim) + 1;
		String v = Integer.toString(rV);
		return v;
	}
	
	public static String part(TB plugin, String bookName, String tran){
		EnumBible book = EnumBible.fromBook(bookName);
		bookName = book.getBook();
		boolean cont = true;
		String part = null;
		int rP;
		int i = 25;
		//The book of Psalms has 21 books.
		while(cont){
			rP = generator.nextInt(i) + 1;
			if(plugin.getigBook(bookName, tran).getString("Book" + rP + ".1") != null){
				part = Integer.toString(rP);
				cont = false;
			}else{
				i = rP - 1;
			}
		}
		return part;
	}
}
