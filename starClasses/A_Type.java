/**
 *  responsibility of this class: hold all the characteristics of O_type star
 *  
 */
package starClasses;

public class A_Type extends StarType {
	// temperatures are in degrees Kelvin
	public final int MIN_TEMPERATURE = 7500; // static niet nodig
	public final int MAX_TEMPERATURE = 10_000;

	public final String NAME = "A-Type";

	public int getMinTemperature() {
		return MIN_TEMPERATURE;
	}

	public int getMaxTermperature() {
		return MAX_TEMPERATURE;
	}

	public String getName() {
		return NAME;
	}

}
