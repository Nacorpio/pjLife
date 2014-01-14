package com.nacorpio.life.api.action;

import com.nacorpio.life.api.action.event.ActionEvent;
import com.nacorpio.life.api.action.event.ActionStoppedEvent;

public abstract class Action implements Runnable, IAction {	

	private int target = 0;
	
	private long startTick;
	private long endTick;
	private long lastDuration;
	
	boolean doOnce = false;
	boolean running = false;
	boolean stop = false;
	
	/**
	 * The void that is being run every <b>x</b> seconds.<br>
	 * Using the {@link #stop()} method will stop the action.
	 * @param par1 the 
	 */
	public abstract void doAction(ActionEvent par1);
	
	@Override
	public final void onFinished(long par1) {
		int second = ((int) (par1 - startTick) / 1000000000);
		this.doAction(new ActionEvent(this));
		this.endTick = System.nanoTime();
		this.running = !doOnce;
		if (running && !stop) {
			this.performAction(target);
			return;
		} else {
			this.lastDuration = second;
			this.onStopped(new ActionStoppedEvent((int) this.lastDuration, (this.endTick - this.startTick) / 1000000000));
		}
	}
	
	@Override
	public void onStopped(ActionStoppedEvent par1) {}
	
	/**
	 * Stop the timer.
	 */
	public final void stop() {
		this.running = false;
		this.stop = true;
	}
	
	/**
	 * Perform the action within the {@link #doAction(long)} void.
	 * @return the action that is occuring.
	 */
	public final Action performAction() {
		performAction(1);
		return this;
	}
	
	/**
	 * Perform the action within the {@link #doAction(long)} void.
	 * @param par1 how many seconds between every tick.
	 * @return the action that is occuring.
	 */
	public final Action performAction(int par1) {
		this.target = par1;
		this.running = true;
		this.startTick = System.nanoTime();
		this.run();
		return this;
	}
	
	/**
	 * Returns the NanoTime the action started at.
	 * @return the start-tick.
	 */
	public final long getStartTick() {
		return this.startTick;
	}
	
	/**
	 * Returns the NanoTime the action ended at.
	 * @return the end-tick.
	 */
	public final long getEndTick() {
		return this.endTick;
	}
	
	/**
	 * Returns the amount of seconds the last action was running for.
	 * @return the last duration.
	 */
	public final long getLastDuration() {
		return this.lastDuration;
	}
	
	public final void setDoOnce(boolean par1) {
		this.doOnce = par1;
	}
	
	public final boolean getDoOnce() {
		return this.doOnce;
	}
	
	@Override
	public final void run() {
		long duration = 0; 
		while (running && !stop) {
			if (duration < target) {
				duration = (System.nanoTime() - startTick) / 1000000000;
			} else {
				break;
			}
		}	
		if (stop || !running) {
			return;
		}
		this.onFinished(System.nanoTime());
	}
	
}
