package com.nacorpio.life.factory;

import java.util.ArrayList;
import java.util.Arrays;

import com.nacorpio.life.api.human.family.FamilyNode;
import com.nacorpio.life.api.human.family.FamilyTree;
import com.nacorpio.life.utils.LoggingUtil;

public final class PublicBase {

	private static FamilyTree families = new FamilyTree();

	public static final void add(FamilyNode... par1) {
		families.add(par1);
		LoggingUtil.log("Added \'" + par1.length + "\' to the base.");
	}
	
	public static final FamilyNode get(String par1) {
		for (int i = 0; i < families.getFamilies().size(); i++) {
			if (families.getFamilies().get(i).getFamilyName().equalsIgnoreCase(par1)) {
				return families.getFamilies().get(i);
			}
		}
		return null;
	}
	
	public static final FamilyNode get(int par1) {
		return families.getFamilies().get(par1);
	}
	
	public static final FamilyTree getFamilyTree() {
		return families;
	}
	
}
