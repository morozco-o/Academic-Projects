//Cylinder class with two attributes of radius and height
public class Cylinder {

	// Declarations
	private double radius = 0;
	private double height = 0;

	// Basic constructor
	public Cylinder() {
	}

	// Basic overload constructors assigning height and radius
	public Cylinder(double r, double h) {
		radius = r;
		height = h;
	}

	// Basic methods of get and set for each attribute
	public double getRadius() {
		return radius;
	}

	public double getHeight() {
		return height;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// Method to calculate volume of a single cylinder
	// Formula given by "Calculator.net" [1]
	public double calculateVolume() {
		return Math.PI * (Math.pow(radius, 2)) * height;
	}
}