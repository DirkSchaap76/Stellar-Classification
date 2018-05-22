/**
 * responsibilities of this class:
 * 		starting point of this program
 * 		provide a main menu / user interface
 */

package programStart;

import java.util.ArrayList;
import java.util.Scanner;
import observations.Observatory;

import starClasses.StarType;

public class Start {

	public static void main(String[] args) {

		testMethod();

	}

	public static void testMethod() {
		Observatory observatory = new Observatory();

		observatory.printStars();

		observatory.starBuilder();
		observatory.starChecker(35423);
	}
}
