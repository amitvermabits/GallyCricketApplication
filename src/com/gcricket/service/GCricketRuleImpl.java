package com.gcricket.service;

import java.util.HashMap;

import com.gcricket.exception.GCExceptionMessages;
import com.gcricket.exception.GCricketEception;
import com.gcricket.model.Team;

public class GCricketRuleImpl implements IGCricketRule {

	// Holds runs scored map
	//MAps the input to run scored.
	static HashMap<String, Integer> runsMap = new HashMap<>();
	static int outCounter =0;

	static {
		// intitialize runs scored map.
		// hashmap is uded to simulate command pattern.
		runsMap.put("1", 1);
		runsMap.put("2", 2);
		runsMap.put("3", 3);
		runsMap.put("4", 4);
		runsMap.put("5", 5);
		runsMap.put("6", 6);
		runsMap.put("W", -2);
		runsMap.put("0", 0);
	}
    /**
     * Method to calculate runs for a given input and also adds the it to team score.
     */
	@Override
	public void calculateRun(Team team, String input) throws GCricketEception {
		try {

			if (team != null) {
				//Calculate run scored only for valid inputs.
				if (runsMap.get(input) != null){
					//increment the out counter
					incrementOutCounter(input);
					team.setRunsScored(team.getRunsScored() + runsMap.get(input) + runsMap.get(isOut()) );
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new GCricketEception(GCExceptionMessages.RUN_CALCULATION_EXCEPTION);
		}

	}
	/**
	 * Method to hold the count of number of 0 scored by batsman.
	 * @param input
	 */
	private void incrementOutCounter(String input){
		if(input != null && "0".equals(input)){
			outCounter++;
		}else{
			outCounter=0;
		}
	}
	
		
	private String isOut(){
		if(outCounter == 2){
			return "W";
		}
		return "0";
	}
}
