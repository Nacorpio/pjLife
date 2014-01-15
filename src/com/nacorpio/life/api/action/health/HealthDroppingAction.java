package com.nacorpio.life.api.action.health;

import com.nacorpio.life.api.action.PlannedAction;
import com.nacorpio.life.api.human.Human;

public class HealthDroppingAction extends PlannedAction {

	private Human victim;
	
	private int drop;
	private int duration;
	
	public HealthDroppingAction(Human par1, int par2, int par3) {
		
		this.victim = par1;
		this.drop = par2;
		this.duration = par3;
		
		this.setDoOnce(true);
		this.setTarget(duration);
		
	}
	
	public final void perform() {
		this.performAction();
	}
	
	public final Human getVictim() {
		return this.victim;
	}
	
	public final int getDuration() {
		return this.duration;
	}
	
	public final int getDrop() {
		return this.drop;
	}
	
	@Override
	public void onNextAction(int par1) {
		
	}

	@Override
	public void onTargetReached() {
		
	}

}
