package animalRidePlugin.georgep.pokuit.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

import animalRidePlugin.georgep.pokuit.Enums.RideableEntity;

public class ARD_PlayerRidingMobEvent extends PlayerEvent implements Cancellable {
	
	private static final HandlerList handlers = new HandlerList();
	private Boolean cancelled = false;
	private RideableEntity re = null;
	
	public ARD_PlayerRidingMobEvent(Player who, RideableEntity re) {
		super(who);
		this.re = re;
	}
	
	public RideableEntity getRiddenAnimal() {
		return re;
	}
	
	public void setRiddenAnimal(RideableEntity re) {
		this.re = re;
	}
	
	@Override
	public boolean isCancelled() {
		return this.cancelled;
	}

	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

}
