/**
 * responsibilities of this class:
 * 		starting point of this program
 * 		provide a main menu / user interface
 */

package programStart;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

import observations.Observatory;

import starClasses.StarType;

public class Start {

	public static void main(String[] args) {

		// testMethod();
		menu();

	}

	public static void testMethod() {
		Observatory observatory = new Observatory();
		// observatory.printStars();
		observatory.starBuilder();
		observatory.starChecker(4500);
	}

	static void menu() {
		System.out.println("Main menu");
		System.out.println("Press 1 to enter your data.");
		System.out.println("Press 2 for: bla2");
		System.out.println("Press q to quit.");

		while (true) {
			Scanner scanner = new Scanner(System.in);
			String option = scanner.nextLine();
			switch (option) {

			case "1":
				System.out.println("Please enter a temperature:1");
				Observatory obs = new Observatory();
				obs.starBuilder();
				obs.starChecker(scanner.nextInt());
				// System.out.println("this will do stuff");
				break;
			case "2":
				System.out.println("this will do some other stuff");
				break;
			case "q":
				System.out.println("Program ended.");
				System.exit(0);

				break;
			default:
				System.out.println("Invalid choicec. Either enter 1, 2, or q.");
				break;

			}
		}

	}
}
