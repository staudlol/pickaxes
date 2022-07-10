package io.github.staudlol.pickaxes;

/*
 * Created by Kyle
 * Project: pickaxes
 * Date: 10/07/2022 - 23:40
 */

import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;

@UtilityClass
public class PickaxeConstants {

    public String CONSOLE_NO_PERMISSION = ChatColor.RED + "You do not have permission to do this in your current state.";
    public String NO_PERMISSION = ChatColor.RED + "No Permission.";

    public String PICKAXE_PERMISSION = "pickaxe.spigot.command";
    public String PICKAXE_RECEIVED = ChatColor.GREEN + "You have received a pickaxe.";

    public String OPENED_UPGRADE_MENU = ChatColor.YELLOW + "You have opened the Upgrade Menu.";
}
