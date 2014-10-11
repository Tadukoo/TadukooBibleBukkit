package com.gmail.lucario77777777.TBP.Enums;

public enum EnumAvail {
	KJVTest("KJV", "Testament", "OldTestament"),
	KJVBook("KJV", "Book", "Isaiah-Malachi"),
	KJVChp("KJV", "Chapter", "all");
	
	private String tran;
	private String type;
	private String unavail1;
	private String unavail2;
	private String unavail3;
	private String unavail4;
	private String unavail5;
	
	private EnumAvail(String tran, String type, String unavail1){
		this.tran = tran;
		this.unavail1 = unavail1;
	}
	
	public String getTran(){
		return tran;
	}
	
	public String getType(){
		return type;
	}
	
	public String getUnavail1(){
		return unavail1;
	}
	
	public String getUnavail2(){
		return unavail2;
	}
	
	public String getUnavail3(){
		return unavail3;
	}
	
	public String getUnavail4(){
		return unavail4;
	}
	
	public String getUnavail5(){
		return unavail5;
	}
	
	public EnumAvail fromString(String tran, String type) {
		if (tran != null) {
			for (EnumAvail c : EnumAvail.values()) {
				if (tran.equalsIgnoreCase(c.getTran()) && type.equalsIgnoreCase(c.getType())) {
					return c;
				}
			}
		}
		return null;
	}
}
