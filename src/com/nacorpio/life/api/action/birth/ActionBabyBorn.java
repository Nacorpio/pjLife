package com.nacorpio.life.api.action.birth;

import com.nacorpio.life.api.action.PlannedAction;
import com.nacorpio.life.api.human.Human;
import com.nacorpio.life.utils.LoggingUtil;

public class ActionBabyBorn extends PlannedAction {

	private Human child;
	
	public ActionBabyBorn(Human par1) {
		
		this.child = par1;
		
		this.setTarget(5);
		this.performAction();
		
	}
	
	@Override
	public void onNextAction(int par1) {}

	@Override
	public void onTargetReached() {
		LoggingUtil.log("Welcome to the world, \'" + child.getFullName() + "\'!");
		this.stop();
	}

}
