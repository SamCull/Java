package week7.lab1;

public class Point {

	//Variables
	protected int x;
	protected int y;
	
		//Constructors
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	
	//Getters & Setters
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	//toString
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
