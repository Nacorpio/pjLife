package com.nacorpio.life.api.dna;

public class Chromosome implements IChromosome {

	private String name;
	private byte[] data;
	
	public Chromosome(String par1, byte[] par2) {
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
	public byte[] getData() {
		return this.data;
	}

	@Override
	public void setData(int par1, byte par2) {
		this.data[par1] = par2;
	}

	@Override
	public void setData(byte[] par1) {
		this.data = par1;
	}

	@Override
	public byte getData(int par1) {
		return this.data[par1];
	}

}
