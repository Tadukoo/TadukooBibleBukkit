package com.gmail.lucario77777777.TBP;

public class BookList {
	public static String[] books = {
	"Genesis",
	"Exodus",
	"Leviticus",
	"Numbers",
	"Deuteronomy",
	"Joshua",
	"Judges",
	"Ruth",
	"1Samuel",
	"2Samuel",
	"1Kings",
	"2Kings",
	"1Chronicles",
	"2Chronicles",
	"Ezra",
	"Nehemiah",
	"Esther",
	"Job",
	"Psalms",
	"Proverbs",
	"Ecclesiastes",
	"SongofSongs",
	"Isaiah",
	"Jeremiah",
	"Lamentations",
	"Ezekiel",
	"Daniel",
	"Hosea",
	"Joel",
	"Amos",
	"Obadiah",
	"Jonah",
	"Micah",
	"Nahum",
	"Habbakuk",
	"Zephaniah",
	"Haggai",
	"Zechariah",
	"Malachi",
	"Matthew",
	"Mark",
	"Luke",
	"John",
	"Acts",
	"Romans",
	"1Corinthians",
	"2Corinthians",
	"Galatians",
	"Ephesians",
	"Philippians",
	"Colossians",
	"1Thessalonians",
	"2Thessalonians",
	"1Timothy",
	"2Timothy",
	"Titus",
	"Philemon",
	"Hebrews",
	"James",
	"1Peter",
	"2Peter",
	"1John",
	"2John",
	"3John",
	"Jude",
	"Revelation"};
	
	public static String getBook(int i){
		return books[i];
	}

	public static String raise(String bookName) {
		int i = 1;
		int j = 0;
		Boolean cont = true;
		while(cont == true){
			if(bookName == getBook(i)){
				j = i + 1;
				cont = false;
			}else{
				i++;
			}
		}
		String newBook = getBook(j);
		return newBook;
	}

	public static String lower(String bookName) {
		int i = 1;
		int j = 0;
		Boolean cont = true;
		while(cont == true){
			if(bookName == getBook(i)){
				j = i - 1;
				cont = false;
			}else{
				i++;
			}
		}
		String newBook = getBook(j);
		return newBook;
	}
}
