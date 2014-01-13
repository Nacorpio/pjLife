package com.nacorpio.life.api.action.event;

public class ActionStoppedEvent {

	private int second;
	private long nanosecond;
	
	public ActionStoppedEvent(int par1, long par2) {
		this.second = par1;
		this.nanosecond = par2;
	}

	public final int getSecond() {
		return this.second;
	}
	
	public final long getNanoSecond() {
		return this.nanosecond;
	}
	
}
