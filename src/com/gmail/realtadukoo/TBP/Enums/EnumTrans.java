package com.gmail.realtadukoo.TBP.Enums;

import com.gmail.realtadukoo.TBP.TB;

public enum EnumTrans {
	KJV("KJV", "KJB", "AV", "KJ", TB.config.getBoolean("KJV"), true),
	OEB("OEB", "OE", "OEV", TB.config.getBoolean("OEB"), false);
	
	private String tran;
	private String alias;
	private String alias2;
	private String alias3;
	private boolean available;
	private boolean complete;
	
	/*
	 * Constructor for 1 alias
	 */
	private EnumTrans(String tran, String alias, boolean available, boolean complete){
		this.tran = tran;
		this.alias = alias;
		this.available = available;
		this.complete = complete;
	}
	
	/*
	 * Constructor for 2 aliases
	 */
	private EnumTrans(String tran, String alias, String alias2, boolean available, boolean complete){
		this.tran = tran;
		this.alias = alias;
		this.alias2 = alias2;
		this.available = available;
		this.complete = complete;
	}
	
	/*
	 * Constructor for 3 aliases
	 */
	private EnumTrans(String tran, String alias, String alias2, String alias3, boolean available, 
			boolean complete){
		this.tran = tran;
		this.alias = alias;
		this.alias2 = alias2;
		this.alias3 = alias3;
		this.available = available;
		this.complete = complete;
	}
	
	public String getTran(){
		return tran;
	}
	
	public String getAlias(){
		return alias;
	}
	
	public String getAlias2(){
		return alias2;
	}
	
	public String getAlias3(){
		return alias3;
	}
	
	public boolean isAvailable(){
		return available;
	}
	
	public boolean isComplete(){
		return complete;
	}
	
	public int getNum(){
		return ordinal() + 1;
	}
	
	public EnumTrans getDefault(){
		String tran = TB.config.getString("default.translation");
		EnumTrans eTran = fromString(tran);
		return eTran;
	}
	
	public EnumTrans fromString(String tran) {
	    if (tran != null) {
	      for (EnumTrans c : EnumTrans.values()) {
	        if (tran.equalsIgnoreCase(c.getTran()) || tran.equalsIgnoreCase(c.getAlias())
	        		|| tran.equalsIgnoreCase(c.getAlias2()) || tran.equalsIgnoreCase(c.getAlias3())){
	          return c;
	        }
	      }
	    }
	    return null;
	}
	
	public String numtoTran(int num, String alter){
		if(alter == "raise"){
			num = num + 1;
		}else if(alter == "lower"){
			num = num - 1;
		}
		for (EnumTrans c : EnumTrans.values()) {
			if (num == c.getNum()){
				return c.getTran();
			}
		}
		return null;
	}
}
