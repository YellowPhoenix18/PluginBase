package de.yellowphoenix18.pluginbase;

import org.bukkit.plugin.java.JavaPlugin;

public class PluginBase extends JavaPlugin {
	
	public static PluginBase m;
	
	public void onEnable() {
		m = this;
	}
	
	public void onDisable() {
		
	}

}
