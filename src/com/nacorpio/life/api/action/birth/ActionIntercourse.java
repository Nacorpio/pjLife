package com.nacorpio.life.api.action.birth;

import com.nacorpio.life.api.action.PlannedAction;
import com.nacorpio.life.api.human.Human;
import com.nacorpio.life.api.human.Human.GENDER;
import com.nacorpio.life.utils.LoggingUtil;

public class ActionIntercourse extends PlannedAction {

	private Human var1;
	private Human var2;
	
	/**
	 * @param par1 The male of the intercourse.
	 * @param par2 The female of the intercourse.
	 */
	public ActionIntercourse(Human par1, Human par2) {
		this.setDoOnce(false);
		this.setTarget(10);
		this.var1 = par1;
		this.var2 = par2;
		this.perform();
	}
	
	public final void perform() {
		if ((var1.getGender().equals(GENDER.MALE) && var2.getGender().equals(GENDER.FEMALE)) || (var1.getGender().equals(GENDER.FEMALE) && var2.getGender().equals(GENDER.MALE))) {
			this.performAction(1);
		} else if (var1.getGender().equals(GENDER.MALE) && var2.getGender().equals(GENDER.MALE)) {
			// Two males, not possible to make children.
			return;
		} else if (var1.getGender().equals(GENDER.FEMALE) && var2.getGender().equals(GENDER.FEMALE)) {
			// Two females, not possible to make children.
			return;
		}
	}
	
	@Override
	public void onNextAction(int par1) {}

	@Override
	public void onTargetReached() {
		LoggingUtil.log("\'" + var2.getIdentity().getFirstName() + "\' is now pregnant by \'" + var1.getIdentity().getFirstName() + "\'.");
		var2.performAction(new ActionPregnancy(var2, var1));
		this.stop();
	}

}
