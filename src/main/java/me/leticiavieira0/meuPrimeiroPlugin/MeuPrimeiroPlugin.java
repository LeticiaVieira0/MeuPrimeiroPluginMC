package me.leticiavieira0.meuPrimeiroPlugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MeuPrimeiroPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("---Plugin started!!---");

        getServer().getPluginManager().registerEvents(this, this);
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        System.out.println("Turning off, byeeee");
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        //Player see this
        event.setJoinMessage("Welcome to the server!!");

        //Displayed only in the admin terminal
        System.out.println("A player has joined the server");
    }

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event){
        Player player = event.getPlayer();
        player.setHealth(0);
        player.sendMessage("You left a bed an will pay for your sin, die!!");
    }
}
