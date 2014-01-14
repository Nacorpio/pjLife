package com.nacorpio.life.api.human.physical.workout;

public class Muscle implements IMuscle {

	private String name;
	
	private float durability;
	private float endurance;
	private float strength;
	
	public Muscle(String par1) {
		this.name = par1;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	public final void setDurability(float par1) {
		this.durability = par1;
	}
	
	public final void addDurability(float par1) {
		this.durability += par1;
	}
	
	@Override
	public float getDurability() {
		return this.durability;
	}

	public final void setEndurance(float par1) {
		this.endurance = par1;
	}
	
	public final void addEndurance(float par1) {
		this.endurance += par1;
	}
	
	@Override
	public float getEndurance() {
		return this.endurance;
	}

	public final void setStrength(float par1) {
		this.strength = par1;
	}
	
	public final void addStrength(float par1) {
		this.strength += par1;
	}
	
	@Override
	public float getStrength() {
		return this.strength;
	}

}
