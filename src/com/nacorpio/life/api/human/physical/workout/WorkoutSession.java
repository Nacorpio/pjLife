package com.nacorpio.life.api.human.physical.workout;

import java.util.ArrayList;
import java.util.List;

import com.nacorpio.life.utils.TimeUtil;

public class WorkoutSession {

	private String custom_name;
	
	private long session_start;
	private long session_latest;
	private long session_end;
	
	private int workout_sec = 0;
	private int workout_s_sec = 0;
	
	private boolean started = false;
	
	private List<DynamicWorkout> finished = new ArrayList<DynamicWorkout>();
	private List<Workout> workouts = new ArrayList<Workout>();
	
	public WorkoutSession(String par1) {
		this.custom_name = par1;
	}
	
	public final void startSession() {
		if (!started) {
			this.session_start = System.nanoTime();
			this.started = true;
		}
	}
	
	public final void endSession() {
		if (started) {
			this.session_end = System.nanoTime();
			this.workout_sec = (TimeUtil.getSeconds(session_end) - TimeUtil.getSeconds(session_start));
			this.workout_s_sec = (TimeUtil.getSeconds(session_end) - TimeUtil.getSeconds(session_latest));
			this.started = false;
		}
	}
	
	public final void addWorkout(Workout par1) {
		this.workouts.add(par1);
	}
	
	public final Workout getWorkout(int par1) {
		return workouts.get(par1);
	}
	
	public final void finishWorkout(int par1, Set par2) {
		finishWorkout(getWorkout(par1), par2);
	}
	
	public final void finishWorkout(Workout par1, Set par2) {
		finished.add(new DynamicWorkout(par1, System.nanoTime() - this.session_start));
		this.session_latest = System.nanoTime();
	}
	
	public final long getSessionStart() {
		return this.session_start;
	}
	
	public final long getSessionEnd() {
		return this.session_end;
	}
	
	public final long getSessionLatest() {
		return this.session_latest;
	}
	
	public final long getDuration() {
		return (System.nanoTime() - this.session_start);
	}
	
	public final int getDurationSeconds() {
		return TimeUtil.getSeconds(getDuration());
	}
	
	public final long getLatestWorkout() {
		return (System.nanoTime() - this.session_latest);
	}
	
	public final int getLatestWorkoutSeconds() {
		return TimeUtil.getSeconds(getLatestWorkout());
	}
	
	public final String getCustomName() {
		return this.custom_name;
	}
	
	public final List<Workout> getWorkouts() {
		return this.workouts;
	}
	
}
