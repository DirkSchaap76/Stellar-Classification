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
		System.out.println("Choose 1 to  bla bla");
		System.out.println("Choose 2 to bla bla some more");
		System.out.println("Choose q to quit.");
		String option = input.nextLine();

		boolean keepGoing = true;
		while (keepGoing) {
			switch (option) {
			case "1":
				System.out.println("You chose 1");
				break;
			case "2":
				System.out.println("You chose 2.");
				break;
			case "q":
				if (input.nextLine() == "q") {
					System.out.println("Program ended.");
					keepGoing = false;

				}
				break;
			default:
				System.out.println("Invalid choice. Please try something else.");
				break;

			}
		}

		input.close();

	}

}
