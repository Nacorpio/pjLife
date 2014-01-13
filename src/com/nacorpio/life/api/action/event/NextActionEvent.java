package com.nacorpio.life.api.action.event;

public class NextActionEvent {

	private int action = 0;
	private boolean cancelled = false;
	
	public NextActionEvent(int par1) {
		this.action = par1;
	}

	public final int getAction() {
		return this.action;
	}
	
	public final void setCancelled(boolean par1) {
		this.cancelled = par1;
	}
	
	public final boolean getCancelled() {
		return this.cancelled;
	}
	
}
