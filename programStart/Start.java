/**
 * responsibilities of this class:
 * 		starting point of this program
 * 		provide a main menu / user interface
 */

package programStart;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Here will be a menu.\n");
		System.out.println("Option 1: add a new star.");
		System.out.println("Choose 2 to bla bla some more");
		System.out.println("Choose q to quit.");

		while (true) {
			String option = input.nextLine();
			switch (option) {
			case "1":
				System.out.println("New star added!");
				// do stuff: userEnterData();
				// do stuff: checkDataInStarClasses();
				// do stuff: return/show result();
				break;
			case "2":
				System.out.println("You chose 2.");
				break;
			case "q":

				System.out.println("Program ended.");
				System.exit(0);
				input.close();

				break;
			default:
				System.out.println("Invalid choice. Please try something else.");
				break;

			}
		}

	}

}
