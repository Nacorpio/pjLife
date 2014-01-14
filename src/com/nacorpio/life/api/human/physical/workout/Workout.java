package com.nacorpio.life.api.human.physical.workout;

public class Workout {

	private String name;
	private int difficulty_level = 0;
	private Muscle[] targets = new Muscle[]{};
	
	public Workout(String par1, int par2, Muscle... par3) {
		this.name = par1;
		this.difficulty_level = par2;
		this.targets = par3;
	}
	
	public final String getName() {
		return this.name;
	}
	
	public final int getDifficulty() {
		return this.difficulty_level;
	}
	
	public final Muscle[] getTargetMuscles() {
		return this.targets;
	}
	
}
