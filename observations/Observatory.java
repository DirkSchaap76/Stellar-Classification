package observations;

import java.util.ArrayList;
import java.util.Scanner;

import starClasses.StarType;
import starClasses.A_Type;
import starClasses.B_Type;
import starClasses.F_Type;
import starClasses.G_Type;
import starClasses.K_Type;
import starClasses.M_Type;
import starClasses.O_Type;

public class Observatory {

	// Scanner scanner = new Scanner(System.in);

	public StarType starChecker(int obsTemp) {
		// obsTemp = scanner.nextInt();
		System.out.println("The temperature entered is: " + obsTemp);
		for (StarType s : starTypes) {
			if (obsTemp > s.getMinTemperature() & obsTemp < s.getMaxTermperature()) {
				System.out.println(s.getMinTemperature() + " - " + s.getMaxTermperature());
				System.out.println("The star is an " + s.getName() + " star.");

			}
		}
		return null;

	}

	ArrayList<StarType> starTypes = new ArrayList();

	public void starBuilder() {

		O_Type O = new O_Type();
		B_Type B = new B_Type();
		A_Type A = new A_Type();
		F_Type F = new F_Type();
		G_Type G = new G_Type();
		K_Type K = new K_Type();
		M_Type M = new M_Type();

		starTypes.add(O);
		starTypes.add(B);
		starTypes.add(A);
		starTypes.add(F);
		starTypes.add(G);
		starTypes.add(K);
		starTypes.add(M);

	}

	public void printStars() {
		for (StarType s : starTypes) {
			System.out.println(s);
		}

		for (int x = 0; x < starTypes.size(); x++) {
			System.out.println(starTypes.get(x));
		}

	}

}
