package org.dreamexposure.pluginbreaker.plugin.bukkit;

import org.bukkit.plugin.java.JavaPlugin;
import org.dreamexposure.novalib.api.NovaLibAPI;

/**
 * @author NovaFox161
 * Date Created: 11/30/2018
 * For Project: PluginBreaker
 * Author Website: https://www.novamaday.com
 * Company Website: https://www.dreamexposure.org
 * Contact: nova@dreamexposure.org
 */
public final class PluginBreaker extends JavaPlugin {
    
    @Override
    public void onEnable() {
        NovaLibAPI.getApi().hookBukkitPlugin(this);

    }
    
    @Override
    public void onDisable() {
    
    }
}
