package com.gmail.lucario77777777.TBP.commands;

import java.util.Random;

import com.gmail.lucario77777777.TBP.TB;
import com.gmail.lucario77777777.TBP.Enums.EnumBooks;
import com.gmail.lucario77777777.TBP.Enums.EnumChps;

public class Randomize {
	public static Random generator = new Random();
	
	public static String book(EnumBooks book, String tran){
		boolean cont = true;
		String bookName = null;
		while(cont){
			int rB = generator.nextInt(66) + 1;
			bookName = book.numtoBook(rB, "int", null, null);
			book = book.fromString(bookName);
			if(book.isAvailable(tran)){
				cont = false;
			}
		}
		return bookName;
	}
	
	public static String chapter(EnumBooks book, String bookName){
		book = book.fromString(bookName);
		int lim = book.getChp();
		int rC = generator.nextInt(lim) + 1;
		String chp = Integer.toString(rC);
		return chp;
	}
	
	public static String verse(EnumBooks book, EnumChps echp, String chp){
		echp = echp.fromString(book.getBook());
		int lim = echp.getNum(Integer.parseInt(chp));
		int rV = generator.nextInt(lim) + 1;
		String v = Integer.toString(rV);
		return v;
	}
	
	public static String part(TB plugin, EnumBooks book, String bookName, String tran){
		book = book.fromString(bookName);
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
