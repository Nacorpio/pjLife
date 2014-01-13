package com.nacorpio.life.api.action.event;

import com.nacorpio.life.api.action.Action;

public class ActionEvent {

	private Action action;
	
	public ActionEvent(Action par1) {
		this.action = par1;
	}
	
	public final Action getAction() {
		return this.action;
	}
	
}
	
