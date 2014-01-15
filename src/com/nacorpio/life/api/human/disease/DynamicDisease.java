package com.nacorpio.life.api.human.disease;

import com.nacorpio.life.api.action.PlannedAction;
import com.nacorpio.life.api.human.Human;

public class DynamicDisease extends HumanDisease {

	private float damage_lvl;
	private float damage_rep;
	
	private PlannedAction action;
	
	public DynamicDisease(String par1, int par2) {
		super(par1, par2);
	}

	public DynamicDisease(HumanDisease par1, PlannedAction par2, float par3, float par4) {
		this(par1.getName(), par1.getCommonLevel());
		this.action = par2;
		this.damage_lvl = par3;
		this.damage_rep = par4;
	}
	
	public final void infect(Human par1) {
		par1.performAction(this.getAction());
	}
	
	public final PlannedAction getAction() {
		return this.action;
	}
	
	public final float getDamageLevel() {
		return this.damage_lvl;
	}
	
	public final float getDamageRepetition() {
		return this.damage_rep;
	}
	
}
