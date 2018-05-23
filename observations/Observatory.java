package observations;

import java.util.ArrayList;

import starClasses.StarType;
import starClasses.A_Type;
import starClasses.B_Type;
import starClasses.F_Type;
import starClasses.G_Type;
import starClasses.K_Type;
import starClasses.M_Type;
import starClasses.O_Type;

public class Observatory {

	public StarType starChecker(int obsTemp) {

		System.out.println("The temperature entered is: " + obsTemp);
		for (StarType s : starTypes) {
			if (obsTemp > s.getMinTemperature() & obsTemp < s.getMaxTermperature()) {
				System.out.println("This makes it an " + s.getName() + " type star.");
				System.out.println("And it's temperature range is between " + s.getMinTemperature()
						+ " degrees Kelvin and " + s.getMaxTermperature() + " degrees Kelvin.");

			}
		}
		return null;

	}

	ArrayList<StarType> starTypes = new ArrayList();

	public void starBuilder() {
		// creates new Star objects
		O_Type O = new O_Type(); // hottest star type
		B_Type B = new B_Type();
		A_Type A = new A_Type();
		F_Type F = new F_Type();
		G_Type G = new G_Type();
		K_Type K = new K_Type();
		M_Type M = new M_Type(); // coolest star type

		// adds the star objects to the ArrayList
		starTypes.add(O);
		starTypes.add(B);
		starTypes.add(A);
		starTypes.add(F);
		starTypes.add(G);
		starTypes.add(K);
		starTypes.add(M);

	}

	// small test method that prints out the Star object's names

	public void printStars() {
		for (StarType s : starTypes) {
			System.out.println(s);
		}

		for (int x = 0; x < starTypes.size(); x++) {
			System.out.println(starTypes.get(x));
		}

	}

}
