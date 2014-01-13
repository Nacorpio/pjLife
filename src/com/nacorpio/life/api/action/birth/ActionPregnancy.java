package com.nacorpio.life.api.action.birth;

import com.nacorpio.life.api.action.PlannedAction;
import com.nacorpio.life.api.human.Human;
import com.nacorpio.life.utils.LoggingUtil;

public class ActionPregnancy extends PlannedAction {

	private Human human;
	private Human father;
	
	private String babyName = "Steve Junior";
	
	public ActionPregnancy(Human par1, Human par2) {
		this.human = par1;
		this.father = par2;
		this.setTarget(60 * 1);
		this.perform();
	}
	
	public final void perform() {
		this.performAction(1);
	}
	
	public final void setName(String par1) {
		this.babyName = par1;
	}
	
	public final String getName() {
		return this.babyName;
	}
	
	public final Human getFather() {
		return this.father;
	}
	
	public final Human getHuman() {
		return this.human;
	}
	
	@Override
	public void onNextAction(int par1) {
		if (par1 == 10) {
			LoggingUtil.log("\'" + human.getIdentity().getFirstName() + "\' now only has 50 more seconds until the baby is born.");
		} else if (par1 == 25) {
			LoggingUtil.log("\'" + human.getIdentity().getFirstName() + "\' now only has 25 seconds before birth.");
		} else if (par1 == 50) {
			LoggingUtil.log("\'" + human.getIdentity().getFirstName() + "\' is now ready to born her baby... almost.");
		}
	}

	@Override
	public void onTargetReached() {
		LoggingUtil.log("\'" + human.getIdentity().getFirstName() + "\' is now giving birth... push!");
		human.performAction(new ActionGivingBirth(human, father, getName()));
		this.stop();
	}

}
