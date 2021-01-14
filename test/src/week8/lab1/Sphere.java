package week8.lab1;

public class Sphere extends ThreeDShape {

	//Variables
	private double radius;

	
	//Constructors
		public Sphere(String name, String colour, double radius) {
			super(name, colour);
			setRadius(radius);
		}
	
	//Overridden Methods
		@Override
		public double volume() {
			return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
		}

		@Override
		public double area() {
			return 4 * Math.PI * Math.pow(radius, 2); //formula for area of sphere
		}											  //4 PI r^2
		
		//Overridden toString
		@Override
		public String toString() {
			return super.toString() + "\nRadius " + radius;
		}


	//Getters & Setters
		public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
