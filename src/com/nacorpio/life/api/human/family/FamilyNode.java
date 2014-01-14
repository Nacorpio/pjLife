package com.nacorpio.life.api.human.family;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.nacorpio.life.factory.PublicBase;
import com.nacorpio.life.utils.LoggingUtil;

public class FamilyNode {

	private String origin_name;
	private String family_name;
	
	private int importance_level = 1;
	
	private List<HumanNode> tree = new ArrayList<HumanNode>();
	private List<String> names = new ArrayList<String>();
	
	public FamilyNode() {}
	
	public FamilyNode(String par1) {
		this.family_name = par1;
		this.origin_name = par1;
		this.names.add(par1);
		PublicBase.add(this);
	}
	
	public final void setImportanceLevel(int par1) {
		this.importance_level = par1;
		if (par1 >= 10) {
			LoggingUtil.log("The family (" + this.getOriginName() + ") is now of importance level (" + par1 + ").");
		}
	}
	
	public final int getImportanceLevel() {
		return this.importance_level;
	}
	
	public final String getFamilyName() {
		return this.family_name;
	}
	
	public final String getOriginName() {
		return this.origin_name;
	}
	
	public final List<String> getPriorNames() {
		return this.names;
	}
	
	public final void updateName(String par1) {
		if (this.family_name != par1) {
			this.family_name = par1;
			this.names.add(par1);
		}
	}
	
	public final void add(HumanNode... par1) {
		tree.addAll(Arrays.asList(par1));
		LoggingUtil.log("Added '" + par1.length + "' nodes to the family \'" + this.getFamilyName() + "\'.");
	}
	
	public final void addParent(HumanNode... par1) {
		tree.addAll(Arrays.asList(par1));
	}
	
	public final void addChildren(HumanNode... par1) {
		tree.addAll(Arrays.asList(par1));
	}
	
	public final HumanNode getLastFamily() {
		return this.tree.get(tree.size() - 1);
	}
	
	public final HumanNode getFirstFamily() {
		return this.tree.get(0);
	}
	
	public final List<HumanNode> getFamilyValues() {
		return tree;
	}
	
}
