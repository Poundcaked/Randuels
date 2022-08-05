package me.poundcake.randuels.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Info implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(sender instanceof Player){
            Player player = (Player) sender;

            player.sendMessage(ChatColor.YELLOW+"This plugin was made by Poundcake. https://youtube.com/Poundcakes");
            player.sendMessage(ChatColor.GREEN+"View the source code on Github! https://github.com/Poundcaked/RanDuels");
            player.sendMessage(ChatColor.RED+"This was my first plugin ever! Created on 11/6/21");

        }else{
            System.out.println("Info command was not run by player.");
        }
        return true;
    }

}
