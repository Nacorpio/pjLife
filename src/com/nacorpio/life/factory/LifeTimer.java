package com.nacorpio.life.factory;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.nacorpio.life.api.ILiving;

public class LifeTimer implements Runnable {

	private GregorianCalendar startDate;
	private GregorianCalendar endDate;
	
	private long startTick;
	private long endTick;
	private long lifeSpan;
	
	private boolean measureLifeSpan = false;
	private boolean living = false;
	
	private ILiving life;
	
	public LifeTimer(ILiving par1) {
		this.life = par1;
	}
	
	@Override
	public void run() {
		this.startDate = new GregorianCalendar();
		this.startTick = System.currentTimeMillis();
		while (living) {
			if (measureLifeSpan) {
				lifeSpan = System.currentTimeMillis() - this.startTick;
			}
		}
		this.endTick = System.currentTimeMillis();
		this.endDate = new GregorianCalendar();
		this.lifeSpan = this.endTick - this.startTick;
	}
	
	public final long getStartTick() {
		return this.startTick;
	}
	
	public final long getEndTick() {
		return this.endTick;
	}
	
	public final long getLifeSpan() {
		return this.lifeSpan;
	}
	
	public final Calendar getStartDate() {
		return startDate;
	}
	
	public final Calendar getEndDate() {
		return this.endDate;
	}
	
	public final ILiving getLife() {
		return this.life;
	}
	
	public final boolean isLiving() {
		return this.living;
	}
	
}
