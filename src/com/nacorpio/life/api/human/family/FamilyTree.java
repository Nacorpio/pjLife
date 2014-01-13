package com.nacorpio.life.api.human.family;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.nacorpio.life.factory.PublicBase;

public class FamilyTree {

	private List<FamilyNode> nodes = new ArrayList<FamilyNode>();
	
	public final FamilyNode get(int par1) {
		return nodes.get(par1);
	}
	
	public final FamilyNode get(String par1) {
		for (int i = 0; i < nodes.size(); i++) {
			if (nodes.get(i).getFamilyName().equalsIgnoreCase(par1)) {
				return nodes.get(i);
			}
		}
		return null;
	}
	
	public final void add(FamilyNode... par1) {
		nodes.addAll(Arrays.asList(par1));
	}
	
	public final FamilyNode getFirstNode() {
		return nodes.get(0);
	}
	
	public final FamilyNode getLastNode() {
		return nodes.get(nodes.size() - 1);
	}
	
	public final List<FamilyNode> getFamilies() {
		return nodes;
	}
	
	public final List<FamilyNode> getWorkers() {
		return getLevelLower(4);
	}
	
	public final List<FamilyNode> getLeaders() {
		return getLevel(10);
	}
	
	public final List<FamilyNode> getLevelGreater(int par1) {
		List<FamilyNode> results = new ArrayList<FamilyNode>();
		for (FamilyNode var: nodes) {
			if (var.getImportanceLevel() >= par1) {
				results.add(var);
			}
		}
		return results;
	}
	
	public final List<FamilyNode> getLevel(int par1) {
		List<FamilyNode> results = new ArrayList<FamilyNode>();
		for (FamilyNode var: nodes) {
			if (var.getImportanceLevel() == par1) {
				results.add(var);
			}
		}
		return results;
	}
	
	public final List<FamilyNode> getLevelLower(int par1) {
		List<FamilyNode> results = new ArrayList<FamilyNode>();
		for (FamilyNode var: nodes) {
			if (var.getImportanceLevel() <= par1) {
				results.add(var);
			}
		}
		return results;
	}
	
	public final List<FamilyNode> getNodes() {
		return nodes;
	}
	
}
