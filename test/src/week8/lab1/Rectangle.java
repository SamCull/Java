package week8.lab1;

public class Rectangle extends TwoDShape {

	//Variables
	private double length;
	private double breadth;

	
	//Constructors
	public Rectangle(String name, String colour, double length, double breadth) {
			super(name, colour);
			setLength(length);
			setBreadth(breadth);
		}
	
	//Overridden Getters & Setters
	@Override
	public double area() {
		return length * breadth;
	}

	//Overridden toString
	@Override
	public String toString() {
		return super.toString() + "\nLength + " + length + "\nBreadth + " + breadth;
	}
	


	//Getters & Setters
		public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	
	

	
	
	
}
