package com.nacorpio.life.api.action;

import com.nacorpio.life.api.action.event.ActionStoppedEvent;

public interface IAction {
	
	/**
	 * Fired when the action has been finished.
	 * @param par1 the NanoTime of the finish.
	 */
	void onFinished(long par1);

	/**
	 * Fired when the action has been stopped.
	 * @param par1 the NanoTime of the stop.
	 */
	void onStopped(ActionStoppedEvent par1);
	
}
