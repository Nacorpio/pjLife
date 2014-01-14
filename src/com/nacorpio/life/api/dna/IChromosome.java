package com.nacorpio.life.api.dna;

public interface IChromosome {

	void setName(String par1);
	
	String getName();
	
	void setData(int par1, byte par2);
	
	void setData(byte[] par1);
	
	byte getData(int par1);
	
	byte[] getData();
	
}
