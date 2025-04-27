/**
 * subclass of Drum specific to holding radioactive isotopes
 * 
 * @author Rodrigo Orozco
 * @version 1
 * @see DrumTest
 * @see DrumPanel
 * @see ToxicDrum
 * @see Drum
 * @since 17
 */
public class ToxicDrum extends Drum {

	/**
	 * constant classification system of showcasing levels of toxicity
	 */
	private String toxicity;
	public final String CLASS_IA = "extremely hazardous";
	public final String CLASS_IB = "highly hazardous";
	public final String CLASS_II = "moderately hazardous";
	public final String CLASS_III = "slightly hazardous";

	/**
	 * Constructs a ToxicDrum with height and weight
	 */
	public ToxicDrum() {
	}

	/**
	 * Constructs a ToxicDrum with height and weight
	 * @param height
	 * @param diameter
	 */
	public ToxicDrum(float height, float diameter) {
		setHeight(height);
		setDiameter(diameter);
	}

	/**
	 * Constructs a ToxicDrum with height, weight, and contents
	 * @param height
	 * @param diameter
	 * @param contents
	 */
	public ToxicDrum(float height, float diameter, String contents) {
		setHeight(height);
		setDiameter(diameter);
		setContents(contents);
	}

	/**
	 * Constructs a ToxicDrum with height, weight, contents, and toxicity
	 * @param height
	 * @param diameter
	 * @param contents
	 * @param toxicity
	 */
	public ToxicDrum(float height, float diameter, String contents, String toxicity) {
		setHeight(height);
		setDiameter(diameter);
		setContents(contents);
		this.toxicity = toxicity;

	}

	/**
	 * @return toxicity 
	 */
	public String getToxicity() {
		return toxicity;
	}

	/**
	 * @param toxicity
	 */
	public void setToxicity(String toxicity) {
		this.toxicity = toxicity;
	}

	/**
	 * Returns a ToxicDrum's particular information
	 * @return output
	 */
	@Override
	public String toString() {
		String output = "height:" + getHeight() + " diameter:" + getDiameter() + " contents:" + getContents()
				+ " capacity:" + capacity() + " toxicity:" + getToxicity();
		return output;
	}

	/** 
	 * abstract method of returning a flammabledrum's capacity based on the
	 * volume of a cylinder, with the caveat of having 3/4 of the total capacity
	 * (pi*r^2*h)*3/4
	 * @return float	 
	 * */
	@Override
	public float capacity() {
		float height = getHeight();
		float diameter = getDiameter();

		double volume = ((diameter / 2) * (diameter / 2)) * Math.PI * height;
		volume = volume * 0.75;
		return (float) volume;
	}

}