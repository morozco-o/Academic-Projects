/**
 * File name: FitnessTracker.java
 * Author: Rodrigo Orozco, 041106665
 * Course: CST8284
 * Assignment: Assignment1
 * Date: 2025-02-04
 * Professor: Leanne Seaward
 * Purpose: Program for tracking and computing fitness data of user
 * Class list: FitnessTracker, FitnessTrackerTest, FitnessTrackerTest2
 */

/**
 * Program for tracking and computing fitness data of user
 * Class list: FitnessTracker, FitnessTrackerTest, FitnessTrackerTest2
 * 
 * @author Rodrigo Orozco
 * @version 1
 * @see FitnessTrackerTest
 * @see FitnessTrackerTest2
 * @since 17
 */
public class FitnessTracker {

	/**
	 * Private Data Attributes describing user's fitness data, personal info, steps
	 * info, calories info
	 */
	private String firstName;
	private String lastName;
	private String gender;
	private double stepsTaken;
	private double caloriesBurned;
	private double activeMinutes;
	private double distanceWalked;
	private double weeklyActiveMinutes;
	private String fitnessLevel;
	private double caloriesGoal;
	private double caloriesDaily;

	/**
	 * constant assumed walking step length for male gender
	 */
	public static final double MALE_STEP_LENGTH = 0.8;
	/**
	 * constant assumed walking step length for female gender
	 */
	public static final double FEMALE_STEP_LENGTH = 0.7;

	/**
	 * basic constructor
	 */
	public FitnessTracker() {
	}

	/**
	 * Overload constructor
	 * 
	 * @param firstName      first name of user
	 * @param lastName       last name of user
	 * @param gender         gender of user
	 * @param stepsTaken     how many steps the user has taken
	 * @param caloriesBurned how many calories the user has burned
	 * @param activeMinutes  how many active minutes the user achieves
	 * @param caloriesGoal   the user's ideal calorie burned amount
	 */
	public FitnessTracker(String firstName, String lastName, String gender, double stepsTaken, double caloriesBurned,
			double activeMinutes, double caloriesGoal) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.stepsTaken = stepsTaken;
		this.caloriesBurned = caloriesBurned;
		this.activeMinutes = activeMinutes;
		this.caloriesGoal = caloriesGoal;
	}

	/**
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName first name of the user
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName last name of the user
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender gender of the user
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return stepsTaken
	 */
	public double getStepsTaken() {
		return stepsTaken;
	}

	/**
	 * @param stepsTaken amount of steps taken by user
	 */
	public void setStepsTaken(double stepsTaken) {
		this.stepsTaken = stepsTaken;
	}

	/**
	 * @return caloriesBurned
	 */
	public double getCaloriesBurned() {
		return caloriesBurned;
	}

	/**
	 * @param caloriesBurned amount of calories burned by user
	 */
	public void setCaloriesBurned(double caloriesBurned) {
		this.caloriesBurned = caloriesBurned;
	}

	/**
	 * @return activeMinutes
	 */
	public double getActiveMinutes() {
		return activeMinutes;
	}

	/**
	 * @param activeMinutes amount of active time achieved by user
	 */
	public void setActiveMinutes(double activeMinutes) {
		this.activeMinutes = activeMinutes;
	}

	/**
	 * @return distanceWalked
	 */
	public double getDistanceWalked() {
		return distanceWalked;
	}

	/**
	 * @param distanceWalked distance walked by user
	 */
	public void setDistanceWalked(double distanceWalked) {
		this.distanceWalked = distanceWalked;
	}

	/**
	 * @return weeklyActiveMinutes
	 */
	public double getWeeklyActiveMinutes() {
		return weeklyActiveMinutes;
	}

	/**
	 * @param weeklyActiveMinutes weekly average of active minutes
	 */
	public void setWeeklyActiveMinutes(double weeklyActiveMinutes) {
		this.weeklyActiveMinutes = weeklyActiveMinutes;
	}

	/**
	 * @return fitnessLevel
	 */
	public String getFitnessLevel() {
		return fitnessLevel;
	}

	/**
	 * @param fitnessLevel fitness level of user
	 */
	public void setFitnessLevel(String fitnessLevel) {
		this.fitnessLevel = fitnessLevel;
	}

	/**
	 * @return caloriesGoal
	 */
	public double getCaloriesGoal() {
		return caloriesGoal;
	}

	/**
	 * @param caloriesGoal user's ideal calorie burned amount
	 */
	public void setCaloriesGoal(double caloriesGoal) {
		this.caloriesGoal = caloriesGoal;
	}

	/**
	 * @return caloriesDaily
	 */
	public double getCaloriesDaily() {
		return caloriesDaily;
	}

	/**
	 * @param caloriesDaily calorie surplus/deficit
	 */
	public void setCaloriesDaily(double caloriesDaily) {
		this.caloriesDaily = caloriesDaily;
	}

	/**
	 * finds distance walked based on gender and stepsTaken
	 */
	public void calculateDistanceWalked() {
		if (gender.equals("male")) {
			distanceWalked = stepsTaken * MALE_STEP_LENGTH;
		} else
			distanceWalked = stepsTaken * FEMALE_STEP_LENGTH;
	}

	/**
	 * finds weeklyActiveMinutes by keeping the pace of activeMinutes for 7 days
	 */
	public void calculateWeeklyActiveMinutes() {
		weeklyActiveMinutes = activeMinutes * 7;
		// where seven represent the days in a week
	}

	/**
	 * finds activeLevel based on weeklyActiveMinutes and caloriesBurned
	 */
	public void calculateFitnessLevel() {
		if ((weeklyActiveMinutes > 150) && (caloriesBurned > 2000)) {
			fitnessLevel = "Active";
		} else if ((weeklyActiveMinutes > 75) && (caloriesBurned > 1000)) {
			fitnessLevel = "Moderatly Active";
		} else
			fitnessLevel = "Sedentary";
	}

	/**
	 * finds calorie surplus/deficit based on calorie goal and calories burned
	 */
	public void calculateCalorieDaily() {
		caloriesDaily = caloriesGoal - caloriesBurned;
	}

	/**
	 * Prints out all user data as a large string statement
	 */
	public void displayFitnessData() {
		System.out.println("User Fitness Data");
		System.out.println();
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Gender: (male/female)" + gender);
		System.out.println("Daily Steps: " + stepsTaken);
		System.out.println("Distance Walked (m): " + distanceWalked);
		System.out.println("Active Minutes: " + activeMinutes);
		System.out.println("Weekly Average of Active Minutes: " + weeklyActiveMinutes);
		System.out.println("Daily Calories Goal: " + caloriesGoal);
		System.out.println("Daily Calories burned: " + caloriesBurned);
		System.out.println("Daily Calories Deficit/Surplus: " + caloriesDaily);
		System.out.println("Fitness Level: " + fitnessLevel);
		System.out.println("Fitness Level Criteria:");
		System.out.println("Active: More than 150 active minutes per week and over 2000 calories burned.");
		System.out.println("Moderately Active: 75-150 active minutes per week or 1000-2000 calories burned.");
		System.out.println("Sedentary: Less than 75 active minutes per week and under 1000 calories burned.");
	}

}
