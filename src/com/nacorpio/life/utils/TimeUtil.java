package com.nacorpio.life.utils;

public final class TimeUtil {

	public final static int getSeconds(long par1) {
		return (int) par1 / 1000000000;
	}
	
	public final static int getMinutes(long par1) {
		return getSeconds(par1) / 60;
	}
	
	public final static int getHours(long par1) {
		return getMinutes(par1) / 60;
	}
	
	public final static int getSecondsBetween(long par1, long par2) {
		return (int) ((par2 - par1) / 1000000000);
	}
	
	public final static int getMinutesBetween(long par1, long par2) {
		return getSecondsBetween(par1, par2) / 60;
	}
	
	public final static int getHoursBetween(long par1, long par2) {
		return getMinutesBetween(par1, par2) / 60;
	}
	
	public final static double millisecondsToHours(long par1) {
		return millisecondsToMinutes(par1) * 60;
	}
	
	public final static long hoursToMilliseconds(int par1) {
		return minutesToMilliseconds(60) * par1;
	}
	
	public final static double minutesToSeconds(int par1) {
		return par1 * 60;
	}
	
	public final static double millisecondsToMinutes(long par1) {
		return millisecondsToSeconds(par1) * par1;
	}
	
	public final static long minutesToMilliseconds(int par1) {
		return secondsToMilliseconds(60) * par1;
	}
	
	public final static double secondsToMinutes(int par1) {
		return par1 / 60;
	}
	
	public final static long millisecondsToSeconds(long par1) {
		return par1 / 1000;
	}
	
	public final static long secondsToMilliseconds(long par1) {
		return par1 * 1000;
	}
	
}
