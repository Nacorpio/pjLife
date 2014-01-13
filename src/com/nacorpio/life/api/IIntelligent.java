package com.nacorpio.life.api;

import com.nacorpio.life.api.human.mental.MentalStatistics;
import com.nacorpio.life.api.human.physical.PhysicalStatistics;

public interface IIntelligent {

	public MentalStatistics getMentalStats();
	
	public PhysicalStatistics getPhysicalStats();
	
}
