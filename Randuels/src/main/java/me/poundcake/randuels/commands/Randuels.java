package me.poundcake.randuels.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class Randuels implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        ItemStack[] items = {new ItemStack(Material.DIAMOND_SWORD), new ItemStack(Material.DIAMOND_SHOVEL), new ItemStack(Material.DIAMOND_AXE), new ItemStack(Material.DIAMOND_HOE), new ItemStack(Material.DIAMOND_PICKAXE), new ItemStack(Material.DIAMOND), new ItemStack(Material.DIAMOND_HELMET), new ItemStack(Material.DIAMOND_CHESTPLATE), new ItemStack(Material.DIAMOND_LEGGINGS), new ItemStack(Material.DIAMOND_BOOTS), new ItemStack(Material.IRON_SWORD), new ItemStack(Material.IRON_SHOVEL), new ItemStack(Material.IRON_AXE), new ItemStack(Material.IRON_HOE), new ItemStack(Material.IRON_PICKAXE), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_HELMET), new ItemStack(Material.IRON_CHESTPLATE), new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.IRON_BOOTS), new ItemStack(Material.NETHERITE_SWORD), new ItemStack(Material.NETHERITE_SHOVEL), new ItemStack(Material.NETHERITE_AXE), new ItemStack(Material.NETHERITE_HOE), new ItemStack(Material.NETHERITE_PICKAXE), new ItemStack(Material.NETHERITE_INGOT), new ItemStack(Material.NETHERITE_HELMET), new ItemStack(Material.NETHERITE_CHESTPLATE), new ItemStack(Material.NETHERITE_LEGGINGS), new ItemStack(Material.NETHERITE_BOOTS), new ItemStack(Material.STONE_SWORD), new ItemStack(Material.STONE_SHOVEL), new ItemStack(Material.STONE_AXE), new ItemStack(Material.STONE_HOE), new ItemStack(Material.STONE_PICKAXE), new ItemStack(Material.COBBLESTONE), new ItemStack(Material.CHAINMAIL_HELMET), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.CHAINMAIL_LEGGINGS), new ItemStack(Material.CHAINMAIL_BOOTS), new ItemStack(Material.WOODEN_SWORD), new ItemStack(Material.WOODEN_SHOVEL), new ItemStack(Material.WOODEN_AXE), new ItemStack(Material.WOODEN_HOE), new ItemStack(Material.WOODEN_PICKAXE), new ItemStack(Material.OAK_LOG), new ItemStack(Material.LEATHER_HELMET), new ItemStack(Material.LEATHER_CHESTPLATE), new ItemStack(Material.LEATHER_LEGGINGS), new ItemStack(Material.LEATHER_BOOTS), new ItemStack(Material.LEATHER), new ItemStack(Material.SHIELD), new ItemStack(Material.FISHING_ROD), new ItemStack(Material.COOKED_BEEF), new ItemStack(Material.TNT), new ItemStack(Material.FLINT_AND_STEEL), new ItemStack(Material.ANVIL), new ItemStack(Material.TOTEM_OF_UNDYING), new ItemStack(Material.TRIDENT), new ItemStack(Material.BOW), new ItemStack(Material.ARROW), new ItemStack(Material.SPECTRAL_ARROW), new ItemStack(Material.FIRE_CHARGE), new ItemStack(Material.ELYTRA), new ItemStack(Material.FIREWORK_ROCKET), new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.GOLD_INGOT), new ItemStack(Material.GOLDEN_HELMET), new ItemStack(Material.GOLDEN_CHESTPLATE), new ItemStack(Material.GOLDEN_LEGGINGS), new ItemStack(Material.GOLDEN_BOOTS), new ItemStack(Material.GOLDEN_SWORD), new ItemStack(Material.GOLDEN_APPLE), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE), new ItemStack(Material.ENCHANTING_TABLE), new ItemStack(Material.CROSSBOW), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.END_CRYSTAL), new ItemStack(Material.STONE), new ItemStack(Material.EMERALD), new ItemStack(Material.COMPASS), new ItemStack(Material.SPYGLASS), new ItemStack(Material.CLOCK), new ItemStack(Material.DAYLIGHT_DETECTOR), new ItemStack(Material.COOKED_PORKCHOP), new ItemStack(Material.LAVA_BUCKET), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.NAME_TAG), new ItemStack(Material.SHEARS), new ItemStack(Material.LEAD), new ItemStack(Material.CREEPER_SPAWN_EGG), new ItemStack(Material.ICE), new ItemStack(Material.PACKED_ICE), new ItemStack(Material.BLUE_ICE), new ItemStack(Material.GLOW_BERRIES), new ItemStack(Material.GLOWSTONE), new ItemStack(Material.PUMPKIN), new ItemStack(Material.CAKE), new ItemStack(Material.APPLE), new ItemStack(Material.EGG), new ItemStack(Material.SNOWBALL), new ItemStack(Material.POWDER_SNOW_BUCKET), new ItemStack(Material.GOLDEN_CARROT), new ItemStack(Material.ENDER_PEARL), new ItemStack(Material.SLIME_BLOCK), new ItemStack(Material.HONEY_BLOCK), new ItemStack(Material.WOLF_SPAWN_EGG), new ItemStack(Material.BONE), new ItemStack(Material.TURTLE_HELMET), new ItemStack(Material.STICK), new ItemStack(Material.CARROT), new ItemStack(Material.PIG_SPAWN_EGG), new ItemStack(Material.SADDLE), new ItemStack(Material.CARROT_ON_A_STICK), new ItemStack(Material.WARPED_FUNGUS_ON_A_STICK), new ItemStack(Material.STRIDER_SPAWN_EGG)};
        ItemStack[] defaultItems = {new ItemStack(Material.STONE_AXE), new ItemStack(Material.IRON_CHESTPLATE)};
        if(sender instanceof Player){

                Player player = (Player) sender;

                if(player.hasPermission("randuels.randuel")) {

                    for (int i = 0; i < 5; i++) {
                        int idx = new Random().nextInt(items.length);
                        ItemStack randomItem = items[idx];
                        player.getInventory().addItem(randomItem);
                    }

                    player.getInventory().addItem(defaultItems);
                    player.playSound(player.getLocation(), Sound.ENTITY_CHICKEN_EGG, 2.0F, 1.0F);
                    player.sendMessage(ChatColor.DARK_PURPLE + "Received items!");

                }
                    else{
                        player.sendMessage(ChatColor.RED+"You do not have permission to do this!");
                    }

        }else{
            System.out.println("Randuels command was not run by player.");
        }
        return true;
    }

}
