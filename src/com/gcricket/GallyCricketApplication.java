package com.gcricket;

/**
 * Class to represent GCricket Application,Act as client to start Gcricket.
 */
import java.util.Scanner;

import com.gcricket.exception.GCExceptionMessages;
import com.gcricket.game.PlayGullyCricket;
import com.gcricket.util.GCCricketUtil;
import com.gcricket.model.Team;

public class GallyCricketApplication {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Team Name:");
			String teamName = sc.next();
			System.out.println("Enter No of  balls:");
			int noOfBalls = GCCricketUtil.readInt();
			Team team = new Team(teamName);
			PlayGullyCricket playGullyCricket = new PlayGullyCricket(team, noOfBalls);
			Thread t = new Thread(playGullyCricket);
			t.start();
		} catch (Exception e) {
			System.out.println(GCExceptionMessages.CLIENT_EXCEPTION);
		}
	}
}
