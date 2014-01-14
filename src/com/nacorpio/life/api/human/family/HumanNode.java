package com.nacorpio.life.api.human.family;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.nacorpio.life.api.human.Human;
import com.nacorpio.life.utils.LoggingUtil;

public class HumanNode {

	private Human human;
	
	private Human father;
	private Human mother;
	private Human partner;
	
	private List<Human> children = new ArrayList<Human>();
	
	public HumanNode(Human par1, Human par2, Human par3) {
		this.human = par1;
		this.father = par2;
		this.mother = par3;
	}
	
	public HumanNode(Human par1) {
		this.human = par1;
	}
	
	public final void setPartner(Human par1) {
		if (this.getPartner() != par1) {
			this.partner = par1;
			par1.getHumanNode().setPartner(this.human);
			LoggingUtil.log(human.getName(), "Now in a relationship with \'" + par1.getFullName() + "\'.");
		}
	}
	
	public final Human getPartner() {
		return this.partner;
	}
	
	public final Human getHuman() {
		return this.human;
	}
	
	public final void setFather(Human par1) {
		this.father = par1;
	}
	
	public final Human getFather() {
		return this.father;
	}
	
	public final void setMother(Human par1) {
		this.mother = par1;
	}
	
	public final Human getMother() {
		return this.mother;
	}
	
	public final void addChildren(Human... par1) {
		this.children.addAll(Arrays.asList(par1));
		if (this.getChildren().size() == 1) {
			LoggingUtil.log("\'" + human.getIdentity().getFirstName() + "\' is now a father!");
		} else if (this.getChildren().size() > 1){
			LoggingUtil.log("\'" + human.getIdentity().getFirstName() + "\' now has another child!");
		}
	}
	
	public final List<Human> getChildren() {
		return this.children;
	}
	
}
