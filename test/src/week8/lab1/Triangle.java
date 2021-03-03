package week8.lab1;

public class Triangle extends TwoDShape {


	//Variables
	private double base;
	private double height;
	
	//Constructors
		public Triangle(String name, String colour, double base, double height) {
		super(name, colour);
		setBase(base);
		setHeight(height);
	}
	
	//Overridden Methods
		@Override
	public double area() {
		return 0.5 * base * height;
	}

	//Overridden toString
		@Override
	public String toString() {
			return super.toString() + "\nBase " + base;
	}	
		
		
	//Getters & Setters
	
	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//toString
	
	
	
}
