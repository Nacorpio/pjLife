package com.nacorpio.life.api.human.physical.workout;

public class Set {

	private Workout workout;
	
	private int target_reps = 0;
	private int reputations = 0;
	
	public Set(Workout par1, int par2) {
		this.workout = par1;
		this.reputations = par2;
	}
	
	public final void setTarget(int par1) {
		this.target_reps = par1;
	}
	
	public final void finish(int par1) {
		
	}
	
	public final Workout getWorkout() {
		return this.workout;
	}
	
	public final int getReputations() {
		return this.reputations;
	}
	
}
