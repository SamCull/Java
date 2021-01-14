package week8.lab1;

public class Cylinder extends ThreeDShape {

	//Variables
	private double radius; 
	private double height;

	
	//Constructors
	public Cylinder(String name, String colour, double radius, double height) {
		super(name, colour);
		setRadius(radius);
		setHeight(height);
	}
	
	//Overridden Getters & Setters
		@Override
		public double volume() {
			return Math.PI * Math.pow(radius, 2); //formula of volume of cylinder
			}									  // PI r^2 h
		
		@Override
		public double area() {
			return 2 * Math.PI * radius * height; //formula of cylinder area
		}										  // 2 PI r h
		
		//Overridden toString
		@Override
		public String toString() {
			return super.toString() + "\nRadius " + radius + "\nHeight " + height;
		}

											  
	
	//Getters & Setters
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	//toString
	
	
}
