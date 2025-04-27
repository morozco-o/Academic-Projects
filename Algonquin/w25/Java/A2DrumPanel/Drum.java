/**
 * File name: Drum.java
 * Author: Rodrigo Orozco, 041106665
 * Course: CST8284
 * Assignment: Assignment2
 * Date: 2025-03-017
 * Professor: Leanne Seaward
 * Purpose: Program for creating an interactive display of managing drum panels
 * of both flammable and toxic materials
 * Class List: Drum, DrumTest, DrumPanel, FlammableDrum,ToxicDrum
 */

/**
 * This class represents the abstract Drum superclass containing a general
 * height weight and contents 
 *
 * @author Rodrigo Orozco
 * @version 1
 * @see DrumTest
 * @see DrumPanel
 * @see FlammableDrum
 * @see ToxicDrum
 * @see Drum
 * @since 17
 */
public abstract class Drum {

	// Assuming measurements are inches
	private float height = 0;
	private float diameter = 0;
	private String contents = "UNKNOWN";

	/**
	 * Constructs a Drum with no information
	 */
	public Drum() {
	}

	/**
	 * Constructs a Drum with height and weight
	 *@param height height of drum
	 *@param diameter diameter of drum
	 */
	public Drum(float height, float diameter) {
		this.height = height;
		this.diameter = diameter;
	}

	/**
	 * Constructs a Drum with height, weight, and contents
	 * @param height height of drum
	 * @param diameter diameter of drum
	 * @param contents contents of drum
	 */
	public Drum(float height, float diameter, String contents) {
		this.height = height;
		this.diameter = diameter;
		this.contents = contents;
	}

	/**
	 * @return height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * @param height height of drum
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * @return diameter
	 */
	public float getDiameter() {
		return diameter;
	}

	/**
	 * @param diameter diameter of drum
	 */
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	/**
	 * @return contents
	 */
	public String getContents() {
		return contents;
	}

	/**
	 * @param contents contents of drum
	 */
	public void setContents(String contents) {
		this.contents = contents;
	}

	/** 
	 * abstract method of returning a drum's capacity based on type
	 * @return float	 
	 * */
	public abstract float capacity();

	/**
	 * Returns a drum's particular information
	 * @return output
	 */
	public String toString() {
		String output = "height:" + getHeight() + " diameter:" + getDiameter();
		return output;
	}

}