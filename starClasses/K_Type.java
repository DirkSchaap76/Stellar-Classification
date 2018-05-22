/**
 *  responsibility of this class: hold all the characteristics of O_type star
 *  
 */
package starClasses;

public class K_Type extends StarType {
	// temperatures are in degrees Kelvin
	public final int MIN_TEMPERATURE = 3700;
	public final int MAX_TEMPERATURE = 5200;

	public final String NAME = "K-Type";

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
