package com.nacorpio.life.api;

import com.nacorpio.life.api.human.FamilyOlson;
import com.nacorpio.life.api.human.HumanCalorine;
import com.nacorpio.life.api.human.HumanSteve;

public final class Tester {
	
	public static void main(String[] par1) {
		FamilyOlson family = new FamilyOlson();
		HumanSteve steve = new HumanSteve();
		HumanCalorine calorine = new HumanCalorine();
		family.setImportanceLevel(10);
		steve.getHumanNode().setPartner(calorine);
	}

}
 