package com.nacorpio.life.api.human.parts;

import com.nacorpio.life.api.human.Human;

public class Brain implements IBodyPart {

	private int quality;
	private int health;
	
	private Human human;
	
	public Brain(Human par1) {
		this.human = par1;
	}
	
	@Override
	public int getImportance() {
		return 10;
	}

	@Override
	public int getHealth() {
		return this.health;
	}

	@Override
	public int getQuality() {
		return this.quality;
	}

	@Override
	public int getStartHealth() {
		return 5;
	}

	@Override
	public Human getOwner() {
		return this.human;
	}

}
