package io.github.staudlol.pickaxes.command;

/*
 * Created by Kyle
 * Project: pickaxes
 * Date: 10/07/2022 - 23:39
 */

import io.github.staudlol.pickaxes.PickaxeConstants;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class PickaxeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(PickaxeConstants.CONSOLE_NO_PERMISSION);
            return true;
        } else {
            final Player player = (Player) sender;

            if (!player.hasPermission(PickaxeConstants.PICKAXE_PERMISSION)) {
                player.sendMessage(PickaxeConstants.NO_PERMISSION);
                return true;
            } else {
                final ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
                final ItemMeta pickaxeMeta = pickaxe.getItemMeta();

                pickaxeMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&f" + player.getName() + "'s &dPickaxe"));
                pickaxeMeta.setLore(
                        Collections.singletonList(
                                ChatColor.translateAlternateColorCodes('&', "&eThis is your amazing pickaxe.")
                        )
                );

                pickaxe.setItemMeta(pickaxeMeta);

                if (player.getInventory().getItemInHand() != null) {
                    player.getInventory().setItemInHand(pickaxe);
                    player.sendMessage(PickaxeConstants.PICKAXE_RECEIVED);
                }
            }
        }
        return true;
    }
}