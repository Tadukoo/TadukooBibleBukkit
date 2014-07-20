Tadukoo Bible Project
=====================

Story
-----
The story of the Tadukoo Bible Project started on July 19, 2013. I (Tadukoo) have been a Christian, and I realized I couldn't think of any Bukkit plugins
that were Christian related. I did some research, and the closest thing was SimpleJesus, which was outdated at the time (it might still be), and it
basically just made it so you could throw a snowball that would turn into a burning cow and heal yourself and others. I then realized I couldn't
think of any Minecraft mods that were Christian related either. I looked for some, and only found one, and it wasn't complete, plus it was a bit
outdated as well. It was the Moses Mod, which added Moses' staff (which could only be gained through the creative inventory or through use of
commands). If you use this staff on the water, it would part, like how Moses parted the Red Sea. The fact that there were so little Christian mods
and plugins upset me, so I decided to add to the mix. I decided that I would start a plugin that would allow players to read the Bible through
commands on a server.

A few days into coding this plugin, I found an outdated Bukkit plugin where it would show a daily Bible verse on the server, which came from
Bible Gateway. It only allowed for one translation (I think it was NIV).

Goal
----
The goal of the Tadukoo Bible Project is to spread the Gospel through Minecraft, in the hopes that more people will read God's word and come to Him 
through a video game. Hopefully in the future, there will be new plugins and/or mods that will help as well, but this is only the beginning.

Command Usage
-------------
/bible [ book ] [ chapter # ] [ verse # ] [ translation ]
   * Shows the verse through the chat to the player.
   * Defaults:
      * [ book ] defaults to Genesis.
      * [ chapter # ] defaults to 1.
      * [ verse # ] defaults to 1.
	  * [ translation ] defaults to whatever is set in the config.yml, which is currently KJV.
   * [ chapter # ] can be replaced with #, info, or ?.
      * # will list how many chapters are in that book.
      * ? or info will show information about the book you chose.
   * [ verse # ] can be replaced with #, ?, or info.
      * This will show how many verses are in the chapter you chose.

/bible help [ page|command ]
   * Aliases: ?, commands, commandshelp, cmds, and cmdshelp.
   * Shows help for TadukooBible commands.
   * Requires permission: TadukooBible.help

/bible config < setting > [ value ]
   * Aliases: configuration, settings, set, and options.
   * Shows or changes a setting in the config.yml.
   * Requires permission: TadukooBible.config
   * < setting > can be changed to list to list all the settings.

/bible info < translation >
   * Aliases: about, abt, and information.
   * Shows information about the translation you chose.
   * Requires permission: TadukooBible.info

/bible books [ page ]
   * Aliases: bookslist, listbooks, and booklist.
   * Lists all the books in the Bible.
   * Requires permission: TadukooBible.books
   * Books in red aren't available yet.
   * Books in green are completely available.
   * Books in yellow are partially available, but incomplete.

/bible translations
   * Aliases: translist, translationslist, listtrans, tran, and trans.
   * Shows a list of available translations.
   * Requires permission: TadukooBible.translations
   
/bible getbook [ book ] [ part # ] [ translation ] [ ? ]
   * Aliases: book, bookget, bible, bibleget, and getbible.
   * Gives you part of the Bible in book form.
   * Requires permission: TadukooBible.getbook
   * Defaults:
      * [ book ] defaults to Genesis.
      * [ part # ] defaults to 1.
	  * [ translation ] defaults to whatever is set in the config.yml.
   * Note: [ part # ] is not the chapter #.
   * [ book ] can be changed to previous, pre, prev, back, before, or b4 to get the previous book (or the first part # of the previous book).
   * [ book ] can be changed to next, forward, for, after, or aft to get the next book.
   * [ book ] can be changed to last, saved, save, or load to get the book you got last time you typed the command.
   * ? will tell you what is in that book.

/bible givebook < player > [ book ] [ part # ] [ translation ]
   * Aliases: bookgive, biblegive, and givebible.
   * Gives a book to a player instead of yourself.
   * Requires permission: TadukooBible.givebook
   * Defaults:
      * [ book ] defaults to Genesis.
	  * [ part # ] defaults to 1.
	  * [ translation ] defaults to whatever is set in the config.yml.

/bible random [ book ] [ chapter # ] [ translation ]
   * Aliases: rand, randomverse, randomv, verserandom, vrandom, randverse, randv, verserand, and vrand.
   * Shows a random verse.
   * Requires permission: TadukooBible.random

/bible announce < book > < chapter # > < verse # > [ translation ]
   * Aliases: ann, broadcast, broad, shout, and yell.
   * Broadcasts the verse you choose.
   * Requires the permission: TadukooBible.announce
   * Requires TadukooBible.announceget to see announcements.

Permissions
-----------
TadukooBible.use
   * Required for use of plugin.
   * Default: true

TadukooBible.help
   * Allows use of /bible help.
   * Default: true

TadukooBible.config
   * Allows use of /bible config.
   * Default: op

TadukooBible.info
   * Allow use of /bible info.
   * Default: true

TadukooBible.books
   * Allows use of /bible books.
   * Default: true

TadukooBible.translations
   * Allows use of /bible translations.
   * Default: true

TadukooBible.getbook
   * Allows use of /bible getbook.
   * Default: true

TadukooBible.givebook
   * Allows use of /bible givebook.
   * Default: op

TadukooBible.random
   * Allows use of /bible random.
   * Default: true

TadukooBible.announce
   * Allows use of /bible announce.
   * Default: op

TadukooBible.announceget
   * Allows seeing announcements.
   * Default: true

Config.yml
----------
DefaultTranslation: KJV
* This is the translation used for commands when none is specified.

Permissions: true
* This decides whether to use permissions or not.
* Note: If you use a permissions plugin and set TadukooBible.use to false, 
* it will still disable use of the plugin even if this is false.

PlayerRecords: true
* Whether to keep records of last verse viewed, last book gotten, etc.
* Required in order to use previous/next/last for anything.

Translations
* Enable or disable translations here.
*(Note: You must still have the files for that translation or it won't work.)
* KJV: true

Upcoming Commands/Features
--------------------------
Beta 0.3
   * Add Psalms
   * Save what Bible verse was last read by each player.
   * Add /bible previous [ translation ]
   * Add /bible next [ translation ]
   * Add /bible last [ translation ]
   * Put in more details about the translations and books of the Bible.

Finish the books of the Bible

/bible config < setting > [ value ] [ config file ]
   * Allows editing the config of another file.

/bible getbook list
   * Gives you a book that lists all the available books and what's in them.

/bible previous [ translation ]
   * Aliases: pre, prev, back, before, and b4.
   * Shows you the Bible verse before the one you last read.
   * Requires permission: TadukooBible.previous

/bible next [ translation ]
   * Aliases: forward, for, after, aft, nextverse, versenext, nextv, and vnext.
   * Shows you the Bible verse after the one you last read.
   * Requires permission: TadukooBible.next

/bible last [ translation ]
   * Aliases: saved, save, load, lastverse, verselast, lastv, vlast, savedverse, savedverse, vsaved, savedv, vsave, versesave, loadverse, verseload, vload, 
   and loadv.
   * Shows you the Bible verse you last read.
   * Requires permission: TadukooBible.last

Move < book >Info, < book >Lime, < book >#, and < chapter >info to code instead of config files.

More translations.

Add a command to send verses to other players.

Add books that contain verses about specific topics (or perhaps commentaries?)

Add random option to various commands, rather than just as its own command.

Known Issues
------------
None at the moment.

Translations
------------
Currently the only translation in the plugin is the King James Version (KJV), which is public domain. In the future, I will be requesting permission
for other translations.

Download
--------
This plugin is now in Beta, so it is [on BukkitDev] (http://dev.bukkit.org/bukkit-plugins/tadukoo-bible/).

Alternately, you could download the classes, config.yml, and plugin.yml file, then import them into eclipse (or your choice of IDE),
along with importing the Bukkit API (Currently this plugin is built off of [1.7.9-R0.2 Beta Build 1938] 
(http://dl.bukkit.org/downloads/bukkit/view/02630_1.7.9-R0.2/)). Do not import the Tadukoo_Bible folder into eclipse. Simply place it in your plugins 
folder.

Progress
--------
* King James Version (KJV) (20%)
   * Completed:
      * Genesis through Deuteronomy
      * Matthew through John
      * 1 John, 2 John, and 3 John
   * Upcoming:
      * Joshua through Malachi
      * Acts through 2 Peter
      * Jude and Revelation

Version System
--------------
* Alpha
   * Alpha is the original version through the time the Pentateuch (Genesis, Exodus, Leviticus, Numbers, and Deuteronomy), 
   the Gospels (Matthew, Mark, Luke, and John), and the 3 Johns (1, 2, and 3 John) are completed.
   * During this time, the plugin will be "private". That means that only I will have the jar file myself, but it is still open source,
   so other people could technically make the jar themselves if they wanted to and knew how.
* Beta
   * Beta will be from the time Alpha is completed (which will be Beta 0.2), until the time that the official release comes.
   * During this time, the plugin's jar will be available on BukkitDev for anyone to download if they want it.
   * Also during this time, I will only update the plugin (on the BukkitDev page at least) when either 10% more is completed or a new feature
   is added or a bug is fixed.
* Official Release
   * The "official release" will be once the entire Bible is complete in the KJV translation. This will be v.1.0.
* Decimals
   * Currently the entire system is based off of just the King James Version progress.
   * Each book of the Bible is either considered 2% (or a part of 2%) of the entirety.
      * Each 2% is + 0.0.2 to the version number. (so Genesis being completed would be Alpha 0.0.2, Exodus would be Alpha 0.0.4, etc.)
      * The books which are not two percent by themselves are:
         * Judges and Ruth = 2%
         * Ezra, Nehemiah, and Esther = 2%
         * Psalms is divided into five sections:
            * Psalms 1-30 = 2%
            * Psalms 31-60 = 2%
            * Psalms 61-90 = 2%
            * Psalms 91-120 = 2%
            * Psalms 121-150 = 2%
         * Ecclesiastes and Song of Songs = 2%
         * Jeremiah and Lamentations = 2%
         * Hosea, Joel, Amos, Obadiah, Jonah, Micah, Nahum, Habakkuk, Zephaniah, Haggai, Zechariah, and Malachi = 2%
         * Titus and Philemon = 2%
         * 1 John, 2 John, and 3 John = 2%
         * Jude and Revelation = 2%
* After Official Release v.1.0
   * After the Official Release, each version will get .01 added for small updates (i.e. v.1.0), 0.1 for big updates (i.e. v.1.1), 
   and 1 for major updates (i.e. v.2.0)
   * Any new translations will probably only be added once they're completed or added in halves, fourths, fifths, or tenths.
