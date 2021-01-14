package week8.lab1;

public class Circle extends TwoDShape {

	//Variables
	private double radius;
	
	
	//Constructors
	public Circle(String name, String colour, double radius) {
		super(name, colour);
		setRadius(radius);
	} 

	//Getters & Setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area() { //class to find the area of a circle
		return Math.PI * Math.pow(radius, 2);  //area of circle = PI r^2
	}
	
	
	//toString
	public String toString() {
		return (super.toString() + "\nRadius = " + radius);
	}
	
}
