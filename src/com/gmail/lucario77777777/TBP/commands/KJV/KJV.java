package com.gmail.lucario77777777.TBP.commands.KJV;

import com.gmail.lucario77777777.TBP.commands.MainCommandExecutor;
import com.gmail.lucario77777777.TBP.commands.KJV.Genesis.KJVGenesis;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodus;
import com.gmail.lucario77777777.TBP.commands.KJV.John1st.KJV1John;
import com.gmail.lucario77777777.TBP.commands.KJV.John2nd.KJV2John;
import com.gmail.lucario77777777.TBP.commands.KJV.John3rd.KJV3John;
import com.gmail.lucario77777777.TBP.commands.KJV.Leviticus.KJVLeviticus;
import com.gmail.lucario77777777.TBP.commands.KJV.Numbers.KJVNumbers;
import com.gmail.lucario77777777.TBP.commands.KJV.Books.KJVBook;
import com.gmail.lucario77777777.TBP.commands.KJV.KJVEnumBooks;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.gmail.lucario77777777.TBP.Main;

public class KJV extends MainCommandExecutor {
	public KJV(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args, String playerType)
	{
		if(args.length == 1){
			KJVGenesis.Run(sender, args);
			return true;
		}else if(args.length >=2){
			KJVEnumBooks command = KJVEnumBooks.valueOf(args[1].toUpperCase());
			if(command.fromString(args[1]) != null){
				if(command.isAvailable() == true){
					switch(command){
						case GENESIS:
							KJVGenesis.Run(sender, args);
							return true;
						case EXODUS:
							KJVExodus.Run(sender, args);
							return true;
						case LEVITICUS:
							KJVLeviticus.Run(sender, args);
							return true;
						case NUMBERS:
							KJVNumbers.Run(sender, args);
							return true;
						case DEUTERONOMY:
							//KJVDeuteronomy.Run(sender, args);
							return true;
						case JOSHUA:
							//KJVJoshua.Run(sender, args);
							return true;
						case JUDGES:
							//KJVJudges.Run(sender, args);
							return true;
						case RUTH:
							//KJVRuth.Run(sender, args);
							return true;
						case SAMUEL1:
							//KJV1Samuel.Run(sender, args);
							return true;
						case SAMUEL2:
							//KJV2Samuel.Run(sender, args);
							return true;
						case KINGS1:
							//KJV1Kings.Run(sender, args);
							return true;
						case KINGS2:
							//KJV2Kings.Run(sender, args);
							return true;
						case CHRONICLES1:
							//KJV1Chronicles.Run(sender, args);
							return true;
						case CHRONICLES2:
							//KJV1Chronicles.Run(sender, args);
							return true;
						case EZRA:
							//KJVEzra.Run(sender, args);
							return true;
						case NEHEMIAH:
							//KJVNehemiah.Run(sender, args);
							return true;
						case ESTHER:
							//KJVEsther.Run(sender, args);
							return true;
						case JOB:
							//KJVJob.Run(sender, args);
							return true;
						case PSALMS:
							//KJVPsalms.Run(sender, args);
							return true;
						case PROVERBS:
							//KJVProverbs.Run(sender, args);
							return true;
						case ECCLESIASTES:
							//KJVEcclesiastes.Run(sender, args);
							return true;
						case SONGOFSONGS:
							//KJVSongOfSongs.Run(sender, args);
							return true;
						case ISAIAH:
							//KJVIsaiah.Run(sender, args);
							return true;
						case JEREMIAH:
							//KJVJeremiah.Run(sender, args);
							return true;
						case LAMENTATIONS:
							//KJVLamentations.Run(sender, args);
							return true;
						case EZEKIEL:
							//KJVEzekiel.Run(sender, args);
							return true;
						case DANIEL:
							//KJVDaniel.Run(sender, args);
							return true;
						case HOSEA:
							//KJVHosea.Run(sender, args);
							return true;
						case JOEL:
							//KJVJoel.Run(sender, args);
							return true;
						case AMOS:
							//KJVAmos.Run(sender, args);
							return true;
						case OBADIAH:
							//KJVObadiah.Run(sender, args);
							return true;
						case JONAH:
							//KJVJonah.Run(sender, args);
							return true;
						case MICAH:
							//KJVMicah.Run(sender, args);
							return true;
						case NAHUM:
							//KJVNahum.Run(sender, args);
							return true;
						case HABAKKUK:
							//KJVHabakkuk.Run(sender, args);
							return true;
						case ZEPHANIAH:
							//KJVZephaniah.Run(sender, args);
							return true;
						case HAGGAI:
							//KJVHaggai.Run(sender, args);
							return true;
						case ZECHARIAH:
							//KJVZechariah.Run(sender, args);
							return true;
						case MALACHI:
							//KJVMalachi.Run(sender, args);
							return true;
						case MATTHEW:
							//KJVMatthew.Run(sender, args);
							return true;
						case MARK:
							//KJVMark.Run(sender, args);
							return true;
						case LUKE:
							//KJVLuke.Run(sender, args);
							return true;
						case JOHN:
							//KJVJohn.Run(sender, args);
							return true;
						case ACTS:
							//KJVActs.Run(sender, args);
							return true;
						case ROMANS:
							//KJVRomans.Run(sender, args);
							return true;
						case CORINTHIANS1:
							//KJV1Corinthians.Run(sender, args);
							return true;
						case CORINTHIANS2:
							//KJV2Corinthians.Run(sender, args);
							return true;
						case GALATIANS:
							//KJVGalatians.Run(sender, args);
							return true;
						case EPHESIANS:
							//KJVEphesians.Run(sender, args);
							return true;
						case PHILIPPIANS:
							//KJVPhilippians.Run(sender, args);
							return true;
						case COLOSSIANS:
							//KJVColossians.Run(sender, args);
							return true;
						case THESSALONIANS1:
							//KJV1Thessalonians.Run(sender, args);
							return true;
						case THESSALONIANS2:
							//KJV2Thessalonians.Run(sender, args);
							return true;
						case TIMOTHY1:
							//KJV1Timothy.Run(sender, args);
							return true;
						case TIMOTHY2:
							//KJV2Timothy.Run(sender, args);
							return true;
						case TITUS:
							//KJVTitus.Run(sender, args);
							return true;
						case PHILEMON:
							//KJVPhilemon.Run(sender, args);
							return true;
						case HEBREWS:
							//KJVHebrews.Run(sender, args);
							return true;
						case JAMES:
							//KJVJames.Run(sender, args);
							return true;
						case PETER1:
							//KJV1Peter.Run(sender, args);
							return true;
						case PETER2:
							//KJV2Peter.Run(sender, args);
							return true;
						case JOHN1:
							KJV1John.Run(sender, args);
							return true;
						case JOHN2:
							KJV2John.Run(sender, args);
							return true;
						case JOHN3:
							KJV3John.Run(sender, args);
							return true;
						case JUDE:
							//KJVJude.Run(sender, args);
							return true;
						case REVELATION:
							//KJVRevelation.Run(sender, args);
							return true;
						case FIRST:
							first(sender);
							return true;
						case SECOND:
							second(sender);
							return true;
						case THIRD:
							third(sender);
							return true;
						case INFO:
							info(sender);
							return true;
						case BOOKS:
							BooksList.list1(sender);
							return true;
						case BOOKS2:
							BooksList.list2(sender);
							return true;
						case BOOKS3:
							BooksList.list3(sender);
							return true;
						case BOOKS4:
							BooksList.list4(sender);
							return true;
						case BOOKS5:
							BooksList.list5(sender);
							return true;
						case BOOK:
							KJVBook.Run(sender, args, playerType);
							return true;
					}
				return true;
				}else if(command.isAvailable() == false){
					sender.sendMessage(ChatColor.RED + "Sorry, " + command.getBook() + "is not available yet.");
					return true;
				}
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
		return false;
	}
	
	public static void first(CommandSender sender){
		sender.sendMessage(ChatColor.YELLOW + "You must not put a space after the 1, and you must use 1, not " +
				"first.");
	}
	
	public static void second(CommandSender sender){
		sender.sendMessage(ChatColor.YELLOW + "You must not put a space after the 2, and you must use 2, not " +
				"second.");
	}
	
	public static void third(CommandSender sender){
		sender.sendMessage(ChatColor.YELLOW + "You must not put a space after the 3, and you must use 3, not " +
				"third.");
	}
	
	public static void info(CommandSender sender){
		sender.sendMessage(ChatColor.GREEN + "KJV is the King James Version.");
	}
}