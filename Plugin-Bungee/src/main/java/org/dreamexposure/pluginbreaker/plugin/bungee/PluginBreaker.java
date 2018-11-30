package org.dreamexposure.pluginbreaker.plugin.bungee;

import net.md_5.bungee.api.plugin.Plugin;
import org.dreamexposure.novalib.api.NovaLibAPI;

/**
 * @author NovaFox161
 * Date Created: 11/30/2018
 * For Project: PluginBreaker
 * Author Website: https://www.novamaday.com
 * Company Website: https://www.dreamexposure.org
 * Contact: nova@dreamexposure.org
 */
public class PluginBreaker extends Plugin {
    
    @Override
    public void onEnable() {
        NovaLibAPI.getApi().hookBungeePlugin(this);
    }
    
    public void onDisable() {
    
    }
}
