import org.junit.Assert;
import org.junit.Test;

/**
 * Testing class to run JUNIT tests on FitnessTracker worker methods
 * 
 * @author Rodrigo Orozco
 * @version 1
 * @see FitnessTracker
 * @see FitnessTrackerTest
 * @since 17
 */

public class FitnessTrackerTest2 {

	private static final double EPSILON = 1E-12;

	/**
	 * Tests distanceWalked(), for the case of 2 steps taken, assuming female
	 * walking pace
	 */
	@Test
	public void testCalculateDistanceWalked() {
		FitnessTracker ftt = new FitnessTracker();
		ftt.setStepsTaken(2);
		ftt.setGender("female");
		ftt.calculateDistanceWalked();
		double distanceResult = ftt.getDistanceWalked();
		double expected = 1.4;
		Assert.assertEquals(expected, distanceResult, EPSILON);
	}

	/**
	 * testing fitnessLevel for the case of calories burned 2000 and weekly active
	 * minutes 200
	 */
	@Test
	public void testCalculateFitnessLevel() {
		FitnessTracker ftt = new FitnessTracker();
		ftt.setCaloriesBurned(2000);
		ftt.setWeeklyActiveMinutes(200);
		ftt.calculateFitnessLevel();
		String fitnessResult = ftt.getFitnessLevel();
		String expected = "Moderatly Active";
		Assert.assertEquals(expected, fitnessResult);
	}

	/**
	 * testing calorie daily for the case of a goal of 1500 and burned 2000
	 */
	@Test
	public void testCalculateCalorieDaily() {
		FitnessTracker ftt = new FitnessTracker();
		ftt.setCaloriesGoal(1500);
		ftt.setCaloriesBurned(2000);
		ftt.calculateCalorieDaily();
		double dailyResult = ftt.getCaloriesDaily();
		double expected = -500;
		Assert.assertEquals(expected, dailyResult, EPSILON);
	}

}
