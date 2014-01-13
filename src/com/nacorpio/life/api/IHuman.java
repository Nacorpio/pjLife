package com.nacorpio.life.api;

import com.nacorpio.life.api.human.family.FamilyNode;
import com.nacorpio.life.api.human.family.HumanNode;
import com.nacorpio.life.api.human.identity.Identity;

public interface IHuman extends ICreature {
	
	FamilyNode getFamilyNode();
	
	Identity getIdentity();
	
	HumanNode getHumanNode();
	
}
