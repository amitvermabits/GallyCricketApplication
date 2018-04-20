package com.gcricket.game;

import java.util.HashMap;
import java.util.Scanner;

import com.gcricket.exception.GCExceptionMessages;
import com.gcricket.service.GCricketRuleImpl;
import com.gcricket.service.IGCricketRule;
import com.gcricket.model.Team;
/**
 * Class to simulate gully Cricket
 * @author amitv
 *
 */
public class PlayGullyCricket implements Runnable{
   
	Team team;
	int  noOfBalls;
	
	IGCricketRule cricketRule;
	/**
	 * Construction : Team and NoOfBalls are mandatory parameters to play GCricket.
	 * @param team
	 * @param noOfBalls
	 */
	public PlayGullyCricket(Team team,int noOfBalls) {
		this.team = team;
		this.noOfBalls=noOfBalls;
		//Dependency injected as only one implementation class better to use Spring DI 
		cricketRule = new GCricketRuleImpl();
	}
	
	/**
	 * Method to Call GCricket Service and calculate run.
	 */
	@Override
	public void run() {
		try {
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < noOfBalls; i++) {
				// Ask for input
				System.out.print("Enter run/Wicket[Valid input [0-6,'W']:");
				String input = sc.next();
				//Call Calculate run to handle input
				cricketRule.calculateRun(team, input);

			}
			System.out.println("Runs scored by team " + team.getName() + " is " + team.getRunsScored());
		} catch (Exception e) {
			// Can use loggers to log the exception.
			System.out.println(GCExceptionMessages.GLOBAL_EXCEPTION);
		}

	}

}
  