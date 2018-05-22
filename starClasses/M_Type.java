/**
 *  responsibility of this class: hold all the characteristics of O_type star
 *  
 */
package starClasses;

public class M_Type extends StarType {
	// temperatures are in degrees Kelvin
	public final int MIN_TEMPERATURE = 2400;
	public final int MAX_TEMPERATURE = 3700;

	public int getMinTemperature() {
		return MIN_TEMPERATURE;
	}

	public int getMaxTermperature() {
		return MAX_TEMPERATURE;
	}

}
