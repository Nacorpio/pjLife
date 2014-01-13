package com.nacorpio.life.api;

import com.nacorpio.life.api.human.mental.MentalStatistics;
import com.nacorpio.life.api.human.physical.PhysicalStatistics;

public class Creature implements ICreature {

	private String name;
	private String order;
	private String genus;
	private String species;
	
	public Creature(String par1, String par2, String par3, String par4) {
		this.name = par1;
		this.species = par2;
		this.genus = par3;
		this.order = par4;
	}
	
	@Override
	public MentalStatistics getMentalStats() {
		return new MentalStatistics();
	}

	@Override
	public PhysicalStatistics getPhysicalStats() {
		return new PhysicalStatistics();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getSpecies() {
		return species;
	}

	@Override
	public String getOrder() {
		return order;
	}

	@Override
	public String getGenus() {
		return genus;
	}

}
