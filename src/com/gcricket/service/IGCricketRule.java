package com.gcricket.service;

import com.gcricket.exception.GCricketEception;
import com.gcricket.model.Team;

/**
 * Interface for Gcricket rule holds method signature to simulate set of rules in Gcricket.
 * @author amitv
 *
 */
public interface IGCricketRule {
	
	void calculateRun(Team team, String input) throws GCricketEception;

	

}
