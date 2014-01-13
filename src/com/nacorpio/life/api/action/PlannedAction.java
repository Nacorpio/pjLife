package com.nacorpio.life.api.action;

import com.nacorpio.life.api.action.event.ActionEvent;
import com.nacorpio.life.api.action.event.ActionStoppedEvent;

public abstract class PlannedAction extends Action {

	private int target = -1;
	private int actions = 0;
	
	public abstract void onNextAction(int par1);
	
	public abstract void onTargetReached();
	
	@Override
	public void onStopped(ActionStoppedEvent par1) {}
	
	@Override
	public void doAction(ActionEvent par1) {
		if (target != -1 && (actions != target) || target == -1) {
			this.actions++;
			this.onNextAction(this.actions);
		} else {
			this.onTargetReached();
			this.stop();
		}
	}

	public final int getTarget() {
		return this.target;
	}
	
	public final void setTarget(int par1) {
		this.target = par1;
	}
	
	public final int getActions() {
		return this.actions;
	}
	
}
