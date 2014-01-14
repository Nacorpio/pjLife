package com.nacorpio.life.api.dna;

public final class ChromosomeEnums {

	// 0
	public static enum EYE_COLOR {
		
		BLUE("blue", 0),
		LIGHT_BLUE("light_blue", 1),
		GREEN("green", 2),
		LIGHT_GREEN("light_green", 3),
		BROWN("brown", 4),
		LIGHT_BROWN("light_brown", 5);
		
		String name;
		int id;
		
		EYE_COLOR(String par1, int par2) {
			name = par1;
			id = par2;
		}
		
		public static final EYE_COLOR getByName(String par1) {
			for (EYE_COLOR var: EYE_COLOR.values()) {
				if (var.name.equalsIgnoreCase(par1)) 
					return var;
			}
			return null;
		}
		
		public static final EYE_COLOR getById(int par1) {
			for (EYE_COLOR var: EYE_COLOR.values()) {
				if (var.id == par1) 
					return var;
			}
			return null;
		}
		
	}
	 
	// 1
	public static enum HAIR_COLOR {
		
		BROWN("brown", 0),
		LIGHT_BROWN("light_brown", 1),
		BLONDE("blonde", 2),
		BRIGHT_BLONDE("bright_blonde", 3),
		RED("red", 4),
		BRIGHT_RED("bright_red", 5),
		BLACK("black", 6),
		BLONDE_BROWN("blonde_brown", 7),
		BLONDE_LIGHT_BROWN("blonde_light_brown", 8),
		BRIGHT_BLONDE_BROWN("bright_blonde_brown", 9),
		BRIGHT_BLONDE_LIGHT_BROWN("bright_blonde_light_brown", 10);
		
		String name;
		int id;
		
		HAIR_COLOR(String par1, int par2) {
			name = par1;
			id = par2;
		}
		
		public static final HAIR_COLOR getByName(String par1) {
			for (HAIR_COLOR var: HAIR_COLOR.values()) {
				if (var.name.equalsIgnoreCase(par1)) 
					return var;
			}
			return null;
		}
		
		public static final HAIR_COLOR getById(int par1) {
			for (HAIR_COLOR var: HAIR_COLOR.values()) {
				if (var.id == par1) 
					return var;
			}
			return null;
		}
		
	}
	
	// 2
	public static enum HEIGHT {
		
		TALL("tall", 7.5, 10.0, 0),
		MEDIUM_TALL("medium_tall", 5.0, 7.5, 1),
		MEDIUM("medium", 2.5, 5.0, 2),
		MEDIUM_SHORT("medium_short", 2.0, 4.0, 3),
		SHORT("short", 1.0, 3.0, 4);
		
		String name;
		double l1, l2;
		int id;
		
		HEIGHT(String par1, double par2, double par3, int par4) {
			name = par1;
			l1 = par2;
			l2 = par3;
			id = par4;
		}
		
		public static final HEIGHT getByName(String par1) {
			for (HEIGHT var: HEIGHT.values()) {
				if (var.name.equalsIgnoreCase(par1))
					return var;
			}
			return null;
		}
		
		public static final HEIGHT getById(int par1) {
			for (HEIGHT var: HEIGHT.values()) {
				if (var.id == par1) 
					return var;
			}
			return null;
		}
		
	}
	
}
