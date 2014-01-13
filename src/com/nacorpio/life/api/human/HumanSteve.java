package com.nacorpio.life.api.human;

import com.nacorpio.life.api.human.identity.Identity;
import com.nacorpio.life.factory.PublicBase;

public class HumanSteve extends Human {

	public HumanSteve() {
		super(PublicBase.get("Olson"), GENDER.MALE, new Identity("Steve", "Beta", "Olson"));
	}

}
