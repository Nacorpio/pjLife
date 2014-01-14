package com.nacorpio.life.api.dna;

public class DNA {

	// Inheritance \\
	
	// 0 - Eye color
	// 1 - Hair color
	// 2 - Height
	// 3 - Body fat
	// 4 - Natural size
	// 5 - Body type
	// 6 - Hair amount
	// 7 - Muscle strength
	// 8 - Lower-body size
	// 9 - Upper-body size
	// 10 - Diseases
	
	private Chromosome[] chromosomes = new Chromosome[]{};
	
	public final Chromosome getChromosome(String par1) {
		for (Chromosome var: chromosomes) {
			if (var.getName().equalsIgnoreCase(par1)) {
				return var;
			}
		}
		return null;
	}
	
	public final byte getChromosomeData(int par1, int par2) {
		return getChromosome(par1).getData()[par2];
	}
	
	public final byte getChromosomeData(String par1, int par2) {
		return getChromosome(par1).getData()[par2];
	}
	
	public final void setChromosome(String par1, int par2, byte par3) {
		getChromosome(par1).setData(par2, par3);
	}
	
	public final void setChromosome(int par1, int par2, byte par3) {
		getChromosome(par1).setData(par2, par3);
	}
	
	public final void setChromosome(String par1, byte[] par2) {
		getChromosome(par1).setData(par2);
	}
	
	public final void setChromosome(int par1, byte[] par2) {
		getChromosome(par1).setData(par2);
	}
	
	public final Chromosome getChromosome(int par1) {
		return chromosomes[par1];
	}
	
	public final Chromosome[] getChromosomes() {
		return chromosomes;
	}
	
}
