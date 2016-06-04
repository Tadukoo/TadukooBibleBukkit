package com.gmail.realtadukoo.TBP;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.gmail.realtadukoo.TC.listeners.CPlayerListener;

public class BPlayerListener implements Listener{
	public TB plugin;
	public BPlayerListener(TB plugin){
		this.plugin = plugin;
	}
	
	@EventHandler(priority = EventPriority.LOW)
	public void onPlayerJoin(PlayerJoinEvent event){
		if(!TB.TadukooCore){
			Player player = event.getPlayer();
			String name = player.getName();
			UUID ID = player.getUniqueId();
			plugin.setUUID(name, ID);
			plugin.savePlayerList();
		}else{
			CPlayerListener cpl = new CPlayerListener(TB.TadukooCoreClass);
			cpl.onPlayerJoin(event);
		}
	}
}
