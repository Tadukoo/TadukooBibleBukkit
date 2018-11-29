package com.gmail.realtadukoo.TBP;

import java.util.List;
import java.util.Random;

import com.gmail.realtadukoo.TBP.cmds.Randomize;
import com.gmail.realtadukoo.TBP.cmds.References;
import com.gmail.realtadukoo.TBP.cmds.Verse;

public class AutoAnnounce{
	int i;
	Random rand;
	
	public AutoAnnounce(){
		i = 0;
		rand = new Random();
	}
	
	public void doVerse(TB plugin, List<String> verses, boolean random){
		if(random){
			i = rand.nextInt(verses.size());
			handleReference(plugin, verses.get(i));
		}else{
			handleReference(plugin, verses.get(i));
			i++;
			if(i == verses.size()){
				i = 0;
			}
		}
	}
	
	private void handleReference(TB plugin, String ref){
		String bookName = "", chp = "", v = "";
		String tran = "KJV";
		
		if(ref.equalsIgnoreCase("random")){
			bookName = Randomize.book(tran);
			chp = Randomize.chapter(bookName);
			v = Randomize.verse(bookName, chp);
		}else{
			String[] refBroken = References.breakDownRefNoTran(ref);
			bookName = refBroken[0];
			chp = refBroken[1];
			v = refBroken[2];
		}
		
		Verse.check(plugin, null, null, bookName, chp, v, tran, "auto-announce", null, false, false);
	}
}
