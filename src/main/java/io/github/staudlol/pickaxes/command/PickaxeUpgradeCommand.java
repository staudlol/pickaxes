package io.github.staudlol.pickaxes.command;

/*
 * Created by Kyle
 * Project: pickaxes
 * Date: 11/07/2022 - 00:13
 */

import io.github.staudlol.pickaxes.PickaxeConstants;
import io.github.staudlol.pickaxes.inventory.PickaxeUpgradeInventory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PickaxeUpgradeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(PickaxeConstants.CONSOLE_NO_PERMISSION);
            return true;
        }

        new PickaxeUpgradeInventory().createInventory((Player) sender);
        sender.sendMessage(PickaxeConstants.OPENED_UPGRADE_MENU);
        return true;
    }
}
