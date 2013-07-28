package com.gmail.lucario77777777.TBP.commands.KJV;

import com.gmail.lucario77777777.TBP.commands.MainCommandExecutor;
import com.gmail.lucario77777777.TBP.commands.KJV.Books.KJVBook;
import com.gmail.lucario77777777.TBP.commands.KJV.Exodus.KJVExodus;
import com.gmail.lucario77777777.TBP.commands.KJV.Genesis.KJVGenesis;
//import com.gmail.lucario77777777.TBP.commands.KJV.Books.KJVBook;

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
			if(args[1].equalsIgnoreCase("Genesis") || args[1].equalsIgnoreCase("Gen")){
				KJVGenesis.Run(sender, args);
				return true;
			}else if(args[1].equals("Exodus") || args[1].equalsIgnoreCase("Exo")){
				KJVExodus.Run(sender, args);
				return true;
			}else if(args[1].equalsIgnoreCase("Leviticus") || args[1].equalsIgnoreCase("Lev")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Leviticus yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Numbers") || args[1].equalsIgnoreCase("Num")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Numbers yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Deuteronomy") || args[1].equalsIgnoreCase("Deu")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Deuteronomy yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Joshua") || args[1].equalsIgnoreCase("Jos")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Joshua yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Judges") || args[1].equalsIgnoreCase("Jud")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Judges yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Ruth")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Ruth yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Ezra")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Ezra yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Nehemiah") || args[1].equalsIgnoreCase("Neh")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Nehemiah yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Esther") || args[1].equalsIgnoreCase("Est")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Esther yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Job")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Job yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Psalms") || args[1].equalsIgnoreCase("Psalm")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Psalms yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Proverbs") || args[1].equalsIgnoreCase("Pro")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Proverbs yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Ecclesiastes") || args[1].equalsIgnoreCase("Ecc")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Ecclesiastes yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Song")){
				Song.Run(sender, args);
				return true;
			}else if(args[1].equalsIgnoreCase("Isaiah") || args[1].equalsIgnoreCase("Isa")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Isaiah yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Jeremiah") || args[1].equalsIgnoreCase("Jer")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Jeremiah yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Lamentations") || args[1].equalsIgnoreCase("Lam")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Lamentations yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Ezekiel") || args[1].equalsIgnoreCase("Eze")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Ezekiel yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Daniel") || args[1].equalsIgnoreCase("Dan")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Daniel yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Hosea")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Hosea yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Joel")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Joel yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Amos")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Amos yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Obadiah")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Obadiah yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Jonah")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Jonah yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Micah")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Micah yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Nahum")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Nahum yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Habakkuk") || args[1].equalsIgnoreCase("Hab")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Habakkuk yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Zephaniah") || args[1].equalsIgnoreCase("Zep")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Zephaniah yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Haggai") || args[1].equalsIgnoreCase("Hag")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Haggai yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Zechariah") || args[1].equalsIgnoreCase("Zec")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Zechariah yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Malachi") || args[1].equalsIgnoreCase("Mal")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Malachi yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Matthew") || args[1].equalsIgnoreCase("Mat")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Matthew yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Mark")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Mark yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Luke")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Luke yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("John")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have John yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Acts")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Acts yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Romans") || args[1].equalsIgnoreCase("Rom")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Romans yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Galatians") || args[1].equalsIgnoreCase("Gal")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Galatians yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Ephesians") || args[1].equalsIgnoreCase("Eph")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Ephesians yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Philippians") || args[1].equalsIgnoreCase("Phili")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Philippians yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Colossians") || args[1].equalsIgnoreCase("Col")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Colossians yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Titus") || args[1].equalsIgnoreCase("Tit")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Titus yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Philemon") || args[1].equalsIgnoreCase("Phile")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Philemon yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Hebrews") || args[1].equalsIgnoreCase("Heb")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Hebrews yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("James") || args[1].equalsIgnoreCase("Jam")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have James yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Jude")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Jude yet.");
				return true;
			}else if(args[1].equalsIgnoreCase("Revelation") || args[1].equalsIgnoreCase("Rev")){
				sender.sendMessage(ChatColor.RED + "Sorry, we don't have Revelation yet.");
				return true;
			}else if(args[1].equals("1")){
				KJV1Books.Run(sender, args);
				return true;
			}else if(args[1].equals("2")){
				KJV2Books.Run(sender, args);
				return true;
			}else if(args[1].equals("3")){
				KJV3Books.Run(sender, args);
				return true;
			}else if(args[1].equals("?") || args[1].equalsIgnoreCase("info")){
				sender.sendMessage(ChatColor.GREEN + "KJV is the King James Version.");
				return true;
			}else if(args[1].equalsIgnoreCase("book")){
				KJVBook.Run(sender, args, playerType);
				return true;
			}else if(args[1].equalsIgnoreCase("books")){
				sender.sendMessage(ChatColor.GREEN + "Page 1 of 5");
				sender.sendMessage(ChatColor.GREEN + "The Books of the Bible are:");
				sender.sendMessage(ChatColor.GREEN + "Genesis, " + ChatColor.RED + "Exodus, Leviticus, " +
						"Numbers, Deuteronomy, Joshua, Judges, Ruth, 1 Samuel, 2 Samuel, 1 Kings, 2 Kings, " +
						"1 Chronicles, 2 Chronicles");
				sender.sendMessage(ChatColor.GREEN + "Type /bible kjv books2 for the next page.");
				return true;
			}else if(args[1].equalsIgnoreCase("books2")){
				sender.sendMessage(ChatColor.GREEN + "Page 2 of 5");
				sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
				sender.sendMessage(ChatColor.RED + "Ezra, Nehemiah, Esther, Job, Psalms, Proverbs," +
						" Ecclesiastes, Song of Songs, Isaiah, Jeremiah, Lamentations, Ezekiel, Daniel");
				sender.sendMessage(ChatColor.GREEN + "Type /bible kjv books3 for the next page.");
				return true;
			}else if(args[1].equalsIgnoreCase("books3")){
				sender.sendMessage(ChatColor.GREEN + "Page 3 of 5");
				sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
				sender.sendMessage(ChatColor.RED + "Hosea, Joel, Amos, Obadiah, Jonah, Micah," +
						" Nahum, Habakkuk, Zephaniah, Haggai, Zechariah, Malachi, Matthew, Mark, Luke, John");
				sender.sendMessage(ChatColor.GREEN + "Type /bible kjv books4 for the next page.");
				return true;
			}else if(args[1].equalsIgnoreCase("books4")){
				sender.sendMessage(ChatColor.GREEN + "Page 4 of 5");
				sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
				sender.sendMessage(ChatColor.RED + "Acts, Romans, 1 Corinthians, 2 Corinthians, Galatians," +
						" Ephesians, Philippians, Colossians, 1 Thessalonians, 2 Thessalonians, 1 Timothy");
				sender.sendMessage(ChatColor.GREEN + "Type /bible kjv books5 for the next page.");
				return true;
			}else if(args[1].equalsIgnoreCase("books5")){
				sender.sendMessage(ChatColor.GREEN + "Page 5 of 5");
				sender.sendMessage(ChatColor.GREEN + "Books of the Bible Cont.:");
				sender.sendMessage(ChatColor.RED + "2 Timothy, Titus, Philemon, Hebrews, James, 1 Peter," +
						" 2 Peter, " + ChatColor.GREEN + "1 John, 2 John, 3 John, " + ChatColor.RED + "Jude, " +
								"and Revelation.");
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "Sorry, " + args[1] + " isn't a book of the Bible.");
				return true;
			}
		}else{
			sender.sendMessage(ChatColor.RED + "An error occured.");
			return true;
		}
	}
}