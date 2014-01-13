package com.nacorpio.life.factory;

import com.nacorpio.life.api.human.Human;
import com.nacorpio.life.api.human.family.FamilyNode;
import com.nacorpio.life.api.human.identity.Identity;

public final class HumanFactory {

	public static final Human human(FamilyNode par1, Identity par2) {
		return new Human(par1, par2);
	}
	
	public static final Human children(Human par1, Human par2, Identity par3) {
		Human var1 = human(par1.getFamilyNode(), par3);
		par1.getHumanNode().addChildren(var1);
		par1.getFamilyNode().addChildren(var1.getHumanNode());
		par2.getHumanNode().addChildren(var1);
		var1.getHumanNode().setMother(par1);
		var1.getHumanNode().setFather(par2);
		return var1;
	}
	
}
