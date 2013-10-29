Tadukoo Bible Project
=====================

Story
-----
The story of the Tadukoo Bible Project started on July 19, 2013. Tadukoo has been a Christian, and he realized he couldn't think of any Bukkit plugins
that were Christian related. He did some research, and the closest thing was SimpleJesus, which was outdated at the time (it might still be), and it
basically just made it so you could throw a snowball that would turn into a burning cow and heal yourself and others. He then realized he couldn't
think of any Minecraft mods that were Christian related either. He looked for some, and only found one, and it wasn't complete, plus it was a bit
outdated as well. It was the Moses Mod, which added Moses' staff (which could only be gained through the creative inventory or through use of
commands). If you use this staff on the water, it would part, like how Moses parted the Red Sea. The fact that there were so little Christian mods
and plugins upset Tadukoo, so he decided to add to the mix. He decided that he would start a plugin that would allow players to read the Bible through
commands on a server.

A few days into coding this plugin, Tadukoo found an outdated Bukkit plugin where it would show a daily Bible verse on the server, which came from
Bible Gateway. It only allowed for one translation (Tadukoo thinks it was NIV).

Goal
----
The goal of the Tadukoo Bible Project is to spread the Gospel through a Minecraft plugin, in the hopes that more people will read God's word through
a video game. Hopefully in the future, there will be new plugins and/or mods that will help as well, but this is only the beginning.

Command Usage
-------------
/bible [ book ] [ chapter # ] [ verse # ] [ translation ]
   * Shows the verse through the chat to the player.
   * Defaults:
      * [ book ] defaults to Genesis.
      * [ chapter # ] defaults to 1.
      * [ verse # ] defaults to 1.
	  * [ translation ] defaults to whatever is set in the config.yml
   * [ chapter # ] can be replaced with #, info, or ?.
      * # will list how many chapters are in that book.
      * ? or info will show information about the book you chose.
   * [ verse # ] can be replaced with #, ?, or info.
      * This will show how many verses are in the chapter you chose.

/bible help [ page ]
   * Aliases: ?, commands, commandshelp, cmds, and cmdshelp.
   * Shows help for TadukooBible commands.
   * Requires permission: TadukooBible.help

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
   * ? will tell you what is in that book.

/bible givebook < player > [ book ] [ part # ] [ translation ]
   * Alias: bookgive, biblegive, and givebible.
   * Gives a book to a player instead of yourself.
   * Requires the permission: TadukooBible.givebook

Permissions
-----------
TadukooBible.use
   * Required for use of plugin.
   * Default: true

TadukooBible.help
   * Allows use of /bible help.
   * Default: true

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

Config.yml
----------
KJV: true
* This sets whether the KJV can be used or not.
* It can only be set to true or false.

KJVBookCheck: check
* This sets how to check the KJVbookconfig.yml file.
* Create will overwrite books even if they already exist.
* Correct will overwrite incorrect parts of books and ignore others.
* Check will simply check if each book exists and create them if they don't.
* Ignore will do nothing.

BookConfigChapterNotifications: 5
* This is how often you get notified about a certain amount of chapters being finished per book.
* 0 would work to never be notified.

DefaultTranslation: KJV
* This is the translation used for commands when none is specified.

Permissions: true
* This decides whether to use permissions or not.
* Note: If you use a permissions plugin and set TadukooBible.use to false, it will still disable use of the plugin even if this is false.

Upcoming Commands/Features
--------------------------
/bible getbook list
   * Gives you a book that lists all the available books and what's in them.

/bible getbook previous
   * Gives you the previous book.

/bible getbook next
   * Gives you the next book.

/bible announce < book > < chapter # > < verse # > [ translation ]
   * Aliases: ann, broadcast, and broad.
   * Broadcasts the verse you choose.
   * Requires the permission: TadukooBible.announce

/bible previous [ translation ]
   * Aliases: pre, prev, back, before, and b4.
   * Shows you the Bible verse before the one you last read.
   * Also requires saving what Bible verse was last read.
   * Requires permission: TadukooBible.previous

/bible next [ translation ]
   * Aliases: forward, for, after, and aft.
   * Shows you the Bible verse after the one you last read.
   * Also requires saving what Bible verse was last read.
   * Requires permission: TadukooBible.next

Changes in books:
   * Reduce the amount of messages for books.

Known Issues
------------
None currently.

Translations
------------
Currently the only translation in the plugin is the King James Version (KJV), which is public domain. In the future, Tadukoo will be requesting permission
for other translations.

Download
--------
Currently you are unable to download the plugin jar file. Once this plugin is in Beta, it will be available on BukkitDev.

Currently to download and install this plugin, you must download the classes and plugin.yml file, then import them into eclipse, along with importing the
Bukkit API (Currently this plugin is built off of [1.6.4-R1.0 Recommended Build 1848] (http://dl.bukkit.org/downloads/bukkit/view/02378_1.6.4-R1.0/)

Do not import the Tadukoo Bible folder into eclipse. Simply place it in your plugins folder.

Progress
--------
* King James Version (KJV) (12%)
    * Through-chat commands
       * Completed:
          * Genesis through Deuteronomy
          * 1 John, 2 John, and 3 John
       * Partially Complete:
	      * None at the moment.
       * Not Yet Started:
          * Joshua through 2 Peter
          * Jude and Revelation.
    * Books
       * Genesis Part 1 Started.

Version System
--------------
* Alpha
   * Alpha will be the current version until the Pentateuch (Genesis, Exodus, Leviticus, Numbers, and Deuteronomy), the Gospels (Matthew, Mark, Luke, and John),
   and the 3 Johns (1, 2, and 3 John) are completed.
* Beta
   * Beta will be from the time Alpha is completed (which will be Beta 0.2), until the time that the official release comes.
* Official Release
   * The "official release" will be once the entire Bible is complete in the KJV translation. This will be v.1.0.
* Decimals
   * Currently the entire system is based off of just the King James Version through-chat commands.
   * Each book of the Bible is either considered 2% or part of 2% of the entirety.
      * Each 1% is + 0.0.1 to the version number. (so Genesis being completed would be Alpha 0.0.2)
      * Each book is then divided by chapters, so for example Genesis is 50 chapters. Each chapter is then 2% towards the book.
         * Since Genesis counts as 2%, each chapter is then 2% of 2%, which adds 0.0.0.04 to the version number.
         * (i.e. Genesis Chapter Six being completed brings the version up to Alpha 0.0.0.24)
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