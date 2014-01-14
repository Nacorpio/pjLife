package com.nacorpio.life.utils;

import com.nacorpio.life.api.human.Human;

public final class LoggingUtil {

	public static final void log(String par1) {
		System.out.println("pjLife >> " + par1);
	}
	
	public static final void log(Object par1, String par2) {
		String src = "pjLife [";
		if (par1 instanceof Human) {
			Human var = (Human) par1;
			src += var.getName();
		} else if (par1 instanceof String) {
			src += (String) par1;
		}
		src += "] >> " + par2;
		System.out.println(src);
	}
	
}
