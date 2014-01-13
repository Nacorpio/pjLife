package com.nacorpio.life.api.dna;

public class Chromosome implements IChromosome {

	private String name;
	private int data;
	
	public Chromosome(String par1, int par2) {
		this.name = par1;
		this.data = par2;
	}
	
	@Override
	public void setName(String par1) {
		this.name = par1;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setData(int par1) {
		this.data = par1;
	}

	@Override
	public int getData() {
		return this.data;
	}

}
