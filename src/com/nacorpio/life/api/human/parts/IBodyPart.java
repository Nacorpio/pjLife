package com.nacorpio.life.api.human.parts;

import com.nacorpio.life.api.human.Human;

public interface IBodyPart {

	public int getImportance();
	
	public int getStartHealth();
	
	public int getHealth();
	
	public int getQuality();
	
	public Human getOwner();
	
	
}
