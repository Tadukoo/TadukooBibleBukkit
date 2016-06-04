package com.gmail.realtadukoo.TBP.Enums;

public enum EnumAvail{
	GENESIS("false"),
	EXODUS("false"),
	LEVITICUS("false"),
	NUMBERS("false"),
	DEUTERONOMY("false"),
	JOSHUA("false"),
	JUDGES("false"),
	RUTH("false"),
	SAMUEl1("false"),
	SAMUEL2("false"),
	KINGS1("false"),
	KINGS2("false"),
	CHRONICLES1("false"),
	CHRONICLES2("false"),
	EZRA("false"),
	NEHEMIAH("false"),
	ESTHER("false"),
	JOB("false"),
	PSALMS("false"),
	PROVERBS("false"),
	ECCLESIASTES("false"),
	SONGOFSONGS("false"),
	ISAIAH("false"),
	JEREMIAH("false"),
	LAMENTATIONS("false"),
	EZEKIEL("false"),
	DANIEL("false"),
	HOSEA("false"),
	JOEL("false"),
	AMOS("false"),
	OBADIAH("false"),
	JONAH("false"),
	MICAH("false"),
	NAHUM("false"),
	HABBAKKUK("false"),
	ZEPHANIAH("false"),
	HAGGAI("false"),
	ZECHARIAH("false"),
	MALACHI("false"),
	MATTHEW("false"),
	MARK("false"),
	LUKE("false"),
	JOHN("false"),
	ACTS("false"),
	ROMANS("false"),
	CORINTHIANS1("false"),
	CORINTHIANS2("false"),
	GALATIANS("false"),
	EPHESIANS("false"),
	PHILIPPIANS("false"),
	COLOSSIANS("false"),
	THESSALONIANS1("false"),
	THESSALONIANS2("false"),
	TIMOTHY1("false"),
	TIMOTHY2("false"),
	TITUS("false"),
	PHILEMON("false"),
	HEBREWS("false"),
	JAMES("false"),
	PETER1("false"),
	PETER2("false"),
	JOHN1("false"),
	JOHN2("false"),
	JOHN3("false"),
	JUDE("false"),
	REVELATION("false");
	
	private String OEB; // Open English Bible availability (true, false, or partial)
	
	private EnumAvail(String OEB){
		this.OEB = OEB;
	}
	
	private int getBook(){
		return ordinal() + 1;
	}
	
	public boolean available(int book, int chapter, int verse, String tran) {
		if (book != 0 && tran != null) {
			for (EnumAvail c : EnumAvail.values()) {
				if (book == c.getBook()){
					if(tran.equalsIgnoreCase("OEB")){
						if(OEB.equalsIgnoreCase("true")){
							return true;
						}else if(OEB.equalsIgnoreCase("false")){
							return false;
						}else if(OEB.startsWith("partial")){
							//String info = OEB.substring(7);
							//String[] bits = info.split(":");
							
							// TODO: Figure out how to handle this.
						}
					}
				}
			}
		}
		return false;
	}
}
