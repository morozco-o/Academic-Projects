/*
 * Student Name: Rodrigo Orozco
 * Lab Professor: Nilam
 * Due Date: November 24, 2024
 * Description: 24F_CST8116 Assignment 02
 */

/*
 * This class verifies whether the attributes of a battery entered are within 
 * the allowed tolerence levels given by class Battery
 */
public class BatteryChecker {
	// EPSILON_DIAMETER as the acceptable diameter tolerance (in mm)
	public static final double EPSILON_DIAMETER =  0.1 + 10E-14;
	// EPSILON_HEIGHT as the acceptable height tolerance (in mm)
	public static final double EPSILON_HEIGHT = 0.3 + 10E-14;
	
	public boolean checkWithinTolerance(Battery battery) {
		double differenceHeight = Math.abs(battery.EXPECTED_HEIGHT - battery.getHeight());
		double differenceDiameter = Math.abs(battery.EXPECTED_DIAMETER - battery.getDiameter());
		return ((differenceHeight <= EPSILON_HEIGHT) && (differenceDiameter <= EPSILON_DIAMETER));
	}
}
