package week7.lab2;

public class Sphere extends Circle {

	public Sphere(int x, int y, double r, double h) {
		super(x,y,r);
	}
	
	public double area() {
		return 4 * Math.PI * Math.pow(getRadius(), 2);
	}
	
	public double volume() {
		return 4.0/3.0 * Math.PI * Math.pow(getRadius(), 3);
	}

	//toString
	@Override
	public String toString() {
		return super.toString() + "\nArea = " + area() + "\nVolume = " + volume();
	}
	
}
