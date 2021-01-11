package week7.lab1;

public class Circle extends Point {

	//Variables
	protected int radius;
	


	//Constructors
	public Circle(int x, int y, int r) {
		super(x, y);
		setRadius(r);
	}

	
	//Getters & Setters
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//toString
		@Override
	public String toString() {
		return "Circle [radius=" + radius + super.toString() + "]";
	}
	
}
