/**
 * Subclass of Drum specific to containing flammable materials
 * 
 * @author Rodrigo Orozco
 * @version 1
 * @see DrumTest
 * @see DrumPanel
 * @see FlammableDrum
 * @see Drum
 * @since 17
 * 
 **/
public class FlammableDrum extends Drum {

	private float flashpoint;

	/**
	 * Constructs a FlammableDrum with no information
	 */
	public FlammableDrum() {
	}

	/**
	 * Constructs a FlammableDrum with height and diameter
	 * 
	 * @param height
	 * @param diameter
	 */
	public FlammableDrum(float height, float diameter) {
		setHeight(height);
		setDiameter(diameter);
	}

	/**
	 * Constructs a FlammableDrum with height, diameter, and contents
	 * 
	 * @param height
	 * @param diameter
	 * @param contents
	 */
	public FlammableDrum(float height, float diameter, String contents) {
		setHeight(height);
		setDiameter(diameter);
		setContents(contents);
	}

	/**
	 * Constructs a FlammableDrum with height, diameter, contents, and flashpoint
	 * 
	 * @param height
	 * @param diameter
	 * @param contents
	 * @param flashpoint
	 */
	public FlammableDrum(float height, float diameter, String contents, float flashpoint) {
		setHeight(height);
		setDiameter(diameter);
		setContents(contents);
		this.flashpoint = flashpoint;
	}

	/**
	 * @return flashpoint
	 */
	public float getFlashpoint() {
		return flashpoint;
	}

	/**
	 * @param flashpoint
	 */
	public void setFlashpoint(float flashpoint) {
		this.flashpoint = flashpoint;
	}

	/**
	 * Returns a FlammableDrum's particular information
	 * 
	 * @return output
	 */
	@Override
	public String toString() {
		String output = "height:" + getHeight() + " diameter:" + getDiameter() + " contents:" + getContents()
				+ " capacity:" + capacity() + " flashpoint:" + getFlashpoint();
		return output;
	}

	/**
	 * abstract method of returning a flammabledrum's capacity based on the volume
	 * of a cylinder (pi*r^2*h)
	 * 
	 * @return float
	 */
	@Override
	public float capacity() {
		float height = getHeight();
		float diameter = getDiameter();

		double volume = ((diameter / 2) * (diameter / 2)) * Math.PI * height;
		return (float) volume;
	}

}
