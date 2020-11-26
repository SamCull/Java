package week6.lab2;

public class RoadVehicle extends Object{
	private int wheels;	    //How many wheels it has
	private int passengers; //How many passengers it can carry
 
	public RoadVehicle() { //CONSTRUCTORS don't get inherited to super classes
 		this(0,0);// takes int w, int p and calls them to 0 
	}
 
	public RoadVehicle(int w, int p) { 
		setWheels(w);
		setPass(p);
	}
 
	

	public void setWheels(int num) {
		wheels = num;
		}
 
	public int getWheels() {
		return wheels;
		}
 
	public void setPass(int num) {
		passengers = num;
		}
 
	public int getPass() {
		return passengers;
		}
	
	
	//toString
	@Override
	public String toString() {
		return "Wheels [wheels= " + wheels + ", passengers= " + passengers;
	}
}