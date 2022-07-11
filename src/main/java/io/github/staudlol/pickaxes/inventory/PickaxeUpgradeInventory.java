package io.github.staudlol.pickaxes.inventory;

/*
 * Created by Kyle
 * Project: pickaxes
 * Date: 11/07/2022 - 00:07
 */

import io.github.staudlol.pickaxes.utility.Experience;
import io.github.staudlol.pickaxes.utility.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PickaxeUpgradeInventory implements Listener {

    public void createInventory(Player player) {
        final Inventory inventory = Bukkit.createInventory(null, 27, "Upgrade Your Pickaxe");
        player.openInventory(inventory);

        inventory.setItem(11, new ItemBuilder(new ItemStack(Material.DIAMOND))
                .setName(ChatColor.AQUA + "Efficiency")
                .setLore(ChatColor.WHITE + "Click to upgrade your Pickaxe")
                .addGlow()
                .buildItem());

        inventory.setItem(13, new ItemBuilder(new ItemStack(Material.GOLD_INGOT))
                .setName(ChatColor.YELLOW + "Fortune")
                .setLore(ChatColor.WHITE + "Click to upgrade your Pickaxe")
                .addGlow()
                .buildItem());

        inventory.setItem(15, new ItemBuilder(new ItemStack(Material.IRON_INGOT))
                .setName(ChatColor.GRAY + "Durability")
                .setLore(ChatColor.WHITE + "Click to upgrade your Pickaxe")
                .addGlow()
                .buildItem());
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        final Player player = (Player) event.getWhoClicked();

        if (event.getInventory().getName().equals("Upgrade Your Pickaxe")) {
            event.setCancelled(true);

            if (event.getCurrentItem().getType() == Material.DIAMOND) {
                if (Experience.getExp(player) >= 1) {
                    player.getInventory().getItemInHand().addEnchantment(Enchantment.DIG_SPEED, 1);
                    Experience.changeExp(player, -1);
                    player.sendMessage(ChatColor.GREEN + "Your Pickaxe has been upgraded!");
                } else {
                    player.sendMessage(ChatColor.RED + "You do not have enough experience to upgrade your Pickaxe");
                }
            }
        }

        if (event.getInventory().getName().equals("Upgrade Your Pickaxe")) {
            event.setCancelled(true);

            if (event.getCurrentItem().getType() == Material.GOLD_INGOT) {
                if (Experience.getExp(player) >= 1) {
                    player.getInventory().getItemInHand().addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 1);
                    Experience.changeExp(player, -1);
                    player.sendMessage(ChatColor.GREEN + "Your Pickaxe has been upgraded!");
                } else {
                    player.sendMessage(ChatColor.RED + "You do not have enough experience to upgrade your Pickaxe");
                }
            }
        }

        if (event.getInventory().getName().equals("Upgrade Your Pickaxe")) {
            event.setCancelled(true);

            if (event.getCurrentItem().getType() == Material.IRON_INGOT) {
                if (Experience.getExp(player) >= 1) {
                    player.getInventory().getItemInHand().addEnchantment(Enchantment.DURABILITY, 1);
                    Experience.changeExp(player, -1);
                    player.sendMessage(ChatColor.GREEN + "Your Pickaxe has been upgraded!");
                } else {
                    player.sendMessage(ChatColor.RED + "You do not have enough experience to upgrade your Pickaxe");
                }
            }
        }
    }
}
