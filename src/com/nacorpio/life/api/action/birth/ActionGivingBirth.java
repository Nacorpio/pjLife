package com.nacorpio.life.api.action.birth;

import java.util.Random;

import com.nacorpio.life.api.action.PlannedAction;
import com.nacorpio.life.api.human.Human;
import com.nacorpio.life.api.human.identity.Identity;
import com.nacorpio.life.factory.HumanFactory;
import com.nacorpio.life.utils.LoggingUtil;

public class ActionGivingBirth extends PlannedAction {

	private String babyName = "";
	
	private Human father;	
	private Human human;
	
	private int time = 0;
	
	public ActionGivingBirth(Human par1, Human par2, String par3) {
		
		this.human = par1;
		this.father = par2;
		this.babyName = par3;
		
		// Let's randomize a time that it takes
		// for the baby to be born.
		
		int rnd = new Random().nextInt(15);
		this.time = rnd;
		this.setTarget(time);
		
		this.perform();
		
	}
	
	public final void perform(){
		this.performAction(1);
	}
	
	@Override
	public void onNextAction(int par1) {
		if (par1 == time - 5) {
			LoggingUtil.log("It's about 5 seconds until there's a new life on the earth.");
		}
	}

	@Override
	public void onTargetReached() {
		Human var = HumanFactory.children(human, father, new Identity(this.babyName, this.father.getIdentity().getMiddleName(), this.father.getIdentity().getLastName()));		
		var.performAction(new ActionBabyBorn(var));
		this.stop();
	}

}
