package com.nacorpio.life.api.human.disease;

import com.nacorpio.life.api.IDisease;

public class HumanDisease implements IDisease {

	private String name;
	private int level;
	
	public HumanDisease(String par1, int par2) {
		this.name = par1;
		this.level = par2;
	}
	
	@Override
	public final String getName() {
		return this.name;
	}

	@Override
	public final int getCommonLevel() {
		return this.level;
	}

	@Override
	public final boolean isRare() {
		return this.level <= 5;
	}

	@Override
	public final boolean isCommon() {
		return this.level > 5;
	}
	
}
