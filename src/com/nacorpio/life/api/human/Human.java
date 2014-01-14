package com.nacorpio.life.api.human;

import com.nacorpio.life.api.IHuman;
import com.nacorpio.life.api.action.PlannedAction;
import com.nacorpio.life.api.dna.DNA;
import com.nacorpio.life.api.human.family.FamilyNode;
import com.nacorpio.life.api.human.family.HumanNode;
import com.nacorpio.life.api.human.identity.Identity;

public class Human extends HomoSapien implements IHuman {

	public static enum GENDER {
		MALE,
		FEMALE;
	}
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	private GENDER gender;
	
	private Identity identity;
	private FamilyNode familyNode;
	private HumanNode humanNode;
	private DNA dna;
	
	public Human(FamilyNode par1, String par2, String par3, String par4) {
		this.familyNode = par1;
		this.firstName = par2;
		this.middleName = par3;
		this.lastName = par4;
		this.identity = new Identity(firstName, middleName, lastName);
		this.humanNode = new HumanNode(this);
		this.familyNode.add(this.humanNode);
	}
	
	public Human(FamilyNode par1, Identity par2) {
		this.familyNode = par1;
		this.firstName = par2.getFirstName();
		this.middleName = par2.getMiddleName();
		this.lastName = par2.getLastName();
		this.identity = par2;
		this.humanNode = new HumanNode(this);
		this.familyNode.add(this.humanNode);
	}
	
	public Human(FamilyNode par1, GENDER par2, Identity par3) {
		this(par1, par3);
		this.gender = par2;
	}
	
	public final void performAction(PlannedAction par1) {
		par1.performAction(par1.getTarget());
	}
	
	public final GENDER getGender() {
		return this.gender;
	}
	
	public final boolean isIlluminati() {
		return this.getFamilyNode().getImportanceLevel() >= 10;
	}
	
	public final boolean isImportant() {
		return this.getFamilyNode().getImportanceLevel() >= 5;
	}
	
	public final String getFullName() {
		return firstName + " " + lastName;
	}
	
	@Override
	public Identity getIdentity() {
		return identity;
	}
	
	@Override
	public FamilyNode getFamilyNode() {
		return this.familyNode;
	}

	@Override
	public HumanNode getHumanNode() {
		return this.humanNode;
	}

	public final void inheritDNA() {
		
	}
	
	@Override
	public DNA getDNA() {
		return this.dna;
	}

}
