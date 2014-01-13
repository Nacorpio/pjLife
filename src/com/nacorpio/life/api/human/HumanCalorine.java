package com.nacorpio.life.api.human;

import com.nacorpio.life.api.human.identity.Identity;
import com.nacorpio.life.factory.PublicBase;

public class HumanCalorine extends Human {

	public HumanCalorine() {
		super(PublicBase.get("Olson"), GENDER.FEMALE, new Identity("Calorine", "Beta", "Olson"));
	}

}
