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
/bible < translation > [ book ] [ chapter # ] [ verse # ]
   * Shows the verse through the chat to the player.
   * If [ book ] is empty, it will go with Genesis.
   * [ book ] can be replaced with ? or info to see info about the translation you chose.
   * If [ chapter # ] or [ verse # ] is empty, it will go with 1.
   * [ chapter # ] can be replaced with # to see how many chapters are in that book.
   * [ chapter # ] can be replaced with ? or info to see info about the book you chose.
   * [ verse # ] can be replaced with #, ?, or info to see how many verses are in that chapter.
   * < translation > can currently only be KJV.
   
/bible list or /bible ?
   * Shows a list of available translations.
   
/bible < translation > books or /bible < translation > list
   * Lists all the books in the Bible for that translation.
   * Books in red aren't available yet.
   * Books in green are completely available.
   * Books in yellow are partially available, but incomplete.
   
/bible < translation > book [ book ] [ part # ] [ ? ]
   * Gives you part of the Bible in book form.
   * [ book ] can be any book of the Bible.
   * [ book ] will default to Genesis.
   * [ part # ] is the part of the book you want. It does not go by chapter.
   * [ part # ] will default to 1.
   * [ ? ] can be typed to see what the [ part # ] you choose would give you.
      * Feature not yet implemented (the question mark)
   * NOTE: THE BOOKS ARE NOWHERE NEAR AS COMPLETE AS THE THROUGH-CHAT COMMANDS.

Upcoming Commands
-----------------
/bible < translation > announce < book > < chapter # > < verse # >
   * Broadcasts the verse you choose.

Known Issues
------------
The book cuts off part of the verses on pages 3 and 5.

The book is completely blank for now due to changes in plugin set-up.

Translations
------------
Currently the only translation in the plugin is the King James Version (KJV), which is public domain. In the future, Tadukoo will be requesting permission
for other translations.

Download
--------
Currently you are unable to download the plugin jar file. Once this plugin is in Beta, it will be available on BukkitDev.

Currently to download and install this plugin, you must download the classes and plugin.yml file, then import them into eclipse, along with importing the
Bukkit API (Currently this plugin is built off of [1.6.2-R1.0 Recommended Build 2879] (http://dl.bukkit.org/downloads/craftbukkit/view/02342_1.6.2-R1.0/)

Do not import the bible folder into eclipse. Simply place it in your plugins/Tadukoo Bible folder.

Progress
--------
* King James Version (KJV) (9.33%)
    * Through-chat commands
       * Completed:
	      * Genesis through Numbers
		  * 1 John, 2 John, and 3 John
	   * Partially Complete:
	      * Deuteronomy (Chapters 1-10 of 34 complete)
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