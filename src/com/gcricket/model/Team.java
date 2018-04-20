package com.gcricket.model;
/**
 * Model class to represent Team.
 * @author amitv
 *
 */
public class Team {
	/**
	 * Name off the team.
	 */
	String name;
	/**
	 * Runs scored by the team.
	 */
	int runsScored;
	public Team(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getRunsScored() {
		return runsScored;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

}
