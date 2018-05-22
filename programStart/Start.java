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

		Observatory observatory = new Observatory();

		observatory.starBuilder();
		observatory.starChecker(3000);
		System.out.println(observatory);

	}

}
