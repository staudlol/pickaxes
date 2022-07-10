package io.github.staudlol.pickaxes.inventory;

/*
 * Created by Kyle
 * Project: pickaxes
 * Date: 11/07/2022 - 00:07
 */

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class PickaxeUpgradeInventory {

    public void createInventory(Player player) {
        final Inventory inventory = Bukkit.createInventory(null, 27, "Upgrade Your Pickaxe");
        player.openInventory(inventory);
    }
}
