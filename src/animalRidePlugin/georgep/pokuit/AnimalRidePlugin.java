package animalRidePlugin.georgep.pokuit;

import org.bukkit.plugin.java.JavaPlugin;

public class AnimalRidePlugin extends JavaPlugin {
	
	private static PetRideManager petRideManager = null;
	
	public void onEnable() {
		petRideManager = new PetRideManager(this);
	}
	
	public void onDisable() {
		
	}
	
	public static PetRideManager getManager() {
		return petRideManager;
	}
}
