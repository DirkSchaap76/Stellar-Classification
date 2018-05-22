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
	// int temperatureInput;

	public StarType starChecker(int obsTemp) {

		System.out.println("obsTemp is: " + obsTemp);
		// obsTemp = 10;

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

		starTypes.add(O); // kan ook
		starTypes.add(B); // is misschien duidelijker
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
