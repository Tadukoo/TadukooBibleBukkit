package com.gmail.realtadukoo.TBP;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class BiblePlayerListener implements Listener{
	public TB plugin;
	public BiblePlayerListener(TB plugin){
		this.plugin = plugin;
	}
	
	@EventHandler(priority = EventPriority.LOW)
	public void onPlayerJoin(PlayerJoinEvent event){
		Player player = event.getPlayer();
		String name = player.getName();
		String id = player.getUniqueId().toString();
		plugin.getPlayerList().set(name, id);
		plugin.savePlayerList();
	}
}
