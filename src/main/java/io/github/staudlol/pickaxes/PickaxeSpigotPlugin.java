package io.github.staudlol.pickaxes;

/*
 * Created by Kyle
 * Project: pickaxes
 * Date: 10/07/2022 - 23:34
 */

import io.github.staudlol.pickaxes.command.PickaxeCommand;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class PickaxeSpigotPlugin extends JavaPlugin {

    private static PickaxeSpigotPlugin instance;

    @Override
    public void onEnable() {
        instance = this;

        this.getCommand("pickaxe").setExecutor(new PickaxeCommand());
    }

    public static PickaxeSpigotPlugin getInstance() {
        return instance;
    }
}
