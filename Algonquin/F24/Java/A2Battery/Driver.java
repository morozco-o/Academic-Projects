/*
 * Student Name: Rodrigo Orozco
 * Lab Professor: Nilam
 * Due Date: November 24, 2024
 * Description: 24F_CST8116 Assignment 02
 */

/*
 * This class acts as a main to prompt the user for unknown amount of batteries
 * heights and diameter, then checking tolerance levels and returning the 
 * entered data as a report, and a final count of total untolerant batteries
 */
public class Driver {

	public static void main(String[] args) {
		// declerations
		BatteryChecker batteryChecker = new BatteryChecker();
		Battery battery = new Battery();
		String isContinue = "YES";
		boolean isTolerant;
		int tolerantCount = 0;
		double diameter;
		double height;

		/*
		 * creates a while loop where continue prompting for battery specifications
		 * until entered something other than yes (case insensitive)
		 */
		while (isContinue.toUpperCase().equals("YES")) {
			// prompts for battery dimensions
			System.out.println("Enter battery dimensions (expected: " + battery.EXPECTED_DIAMETER + " for diameter, "
					+ battery.EXPECTED_HEIGHT + " for height)");
			// sets dimensions of battery
			diameter = User.inputDouble("Enter measured Diameter ");
			battery.setDiameter(diameter);
			height = User.inputDouble("Enter measured Height ");
			battery.setHeight(height);
			// prints report of battery data
			System.out.println(battery.toString());
			// checks tolerance of battery dimensions
			isTolerant = batteryChecker.checkWithinTolerance(battery);
			if (isTolerant) {
				System.out.println("The battery is within tolerance.");
			} else {
				// adds to running count of total untolerant batteries
				tolerantCount++;
				System.out.println("The battery is not within tolerance.");
			}
			System.out.println("Program by Rodrigo Orozco");
			// ask users to see if they want to add more batteries
			isContinue = User.inputString("Continue checking? (e.g.: YES) ");
		}
		System.out.println("Total out of tolerance: " + tolerantCount);
	}
}