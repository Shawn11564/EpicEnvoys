package dev.mrshawn.epicenvoys;

import org.bukkit.plugin.java.JavaPlugin;

public final class EpicEnvoys extends JavaPlugin {

	private static EpicEnvoys instance;

	@Override
	public void onEnable() {
		instance = this;
		getConfig().options().copyDefaults();
		saveDefaultConfig();

	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
	}

	public static EpicEnvoys getInstance() {
		return instance;
	}
}
