package com.nacorpio.life.api.human.physical.workout;

import java.util.ArrayList;
import java.util.List;

public class DynamicWorkout extends Workout {

	private long finish_time = 0;
	private List<Set> sets = new ArrayList<Set>();
	
	public DynamicWorkout(String par1, int par2, Muscle[] par3) {
		super(par1, par2, par3);
	}
	
	public DynamicWorkout(Workout par1) {
		super(par1.getName(), par1.getDifficulty(), par1.getTargetMuscles());
	}
	
	public DynamicWorkout(Workout par1, long par2) {
		this(par1);
		this.finish_time = par2;
	}
	
	public final void addSet(Set par1) {
		this.sets.add(par1);
	}
	
	/**
	 * Returns the total amount of reputations that were made during this workout.
	 * @return the total amount of reputations.
	 */
	public final int getReputations() {
		int total = 0;
		for (Set var: sets) {
			total += var.getReputations();
		}
		return total;
	}
	
	/**
	 * Returns the time it took for the person to finish the workout.
	 * @return the finish-time in nano-seconds.
	 */
	public final long getFinishTime() {
		return this.finish_time;
	}
	
	/**
	 * Returns the time it took for the person to finish the workout.
	 * @return the finish-time in seconds.
	 */
	public final int getFinishTimeSeconds() {
		return (int) (this.finish_time / 1000000000);
	}
	
	/**
	 * Returns the time it took for the person to finish the workout.
	 * @return the finish-time in minutes.
	 */
	public final int getFinishTimeMinutes() {
		if (this.getFinishTimeSeconds() >= 60) {
			return this.getFinishTimeSeconds() / 60;
		}
		return 0;
	}
	
	/**
	 * Returns all the sets that were done in this workout.
	 * @return the sets.
	 */
	public final List<Set> getSets() {
		return this.sets;
	}
	
}
