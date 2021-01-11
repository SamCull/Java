package week7.lab1;

public class MyFirstCircle {

	public static void main (String args[]) {
	
		Point myPoint = new Point (10,20);
		Circle myCircle = new Circle (15, 30, 5);
		
		//myCircle.x=6; || can override default number set
		//if variable it set to private, isnt available
		
		System.out.println("Point details: " + myPoint);
		System.out.println("Circle details: " + myCircle);
	}
	
}
