package me.poundcake.randuels;

import me.poundcake.randuels.commands.Info;
import me.poundcake.randuels.commands.Randuels;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class RanDuels extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("RanDuels has loaded!");
        getCommand("randuel").setExecutor(new Randuels());
        getCommand("raninfo").setExecutor(new Info());
    }


}
