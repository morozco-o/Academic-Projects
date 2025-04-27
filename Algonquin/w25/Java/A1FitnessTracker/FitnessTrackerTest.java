import java.util.Scanner;

/**
 * Prompts for input of the patient’s data, instantiate an object of the class
 * FitnessTracker, then display all the user’s details calculated metrics
 * 
 * @author Rodrigo Orozco
 * @version 1
 * @see FitnessTracker
 * @see FitnessTrackerTest2
 * @since 17
 */
public class FitnessTrackerTest {
	/**
	 * Driver class
	 * 
	 * @param args main class
	 */
	public static void main(String[] args) {
		// declarations
		Scanner input = new Scanner(System.in);
		String firstName;
		String lastName;
		String gender;
		double dailySteps;
		double caloriesBurned;
		double activeMinutes;
		double caloriesGoal;
		// prompt for input
		System.out.println("Enter first name: ");
		firstName = input.nextLine();
		System.out.println("Enter last name: ");
		lastName = input.nextLine();
		System.out.println("Enter gender (male/female): ");
		gender = input.nextLine();
		System.out.println("Enter daily steps: ");
		dailySteps = input.nextDouble();
		System.out.println("Enter calories burned: ");
		caloriesBurned = input.nextDouble();
		System.out.println("Enter active minutes: ");
		activeMinutes = input.nextDouble();
		System.out.println("Enter daily maitenance calorie goal: ");
		caloriesGoal = input.nextDouble();
		// instantiate
		FitnessTracker ftt = new FitnessTracker(firstName, lastName, gender, dailySteps, caloriesBurned, activeMinutes,
				caloriesGoal);
		// calculate other metrics
		ftt.calculateWeeklyActiveMinutes();
		ftt.calculateCalorieDaily();
		ftt.calculateDistanceWalked();
		ftt.calculateFitnessLevel();
		// display user data
		ftt.displayFitnessData();
	}
}
