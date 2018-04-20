package com.gcricket.util;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Utility class
 * @author amitv
 *
 */
public class GCCricketUtil {

	/**
	 * Method to read input as integer
	 * @param msg
	 * @return
	 */
	public static int readInt() {
		boolean error = false;
		int input = 0;
		do {
			try {
				// create object of scanner class.
				Scanner scanner = new Scanner(System.in);
				input = scanner.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				// accept integer only.
				System.out.println("Invalid Input.Please input Integer Only:");
				error = true;
			}
		} while (error);
		return (input);
	}

}
