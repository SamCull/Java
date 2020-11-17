package week5.lab1;

public class Wheel {

	


	//Variables
	private float radius;

	
	
	
	
	//Constructors
		public Wheel(float radius) {
			setRadius(radius);
	}
	
	
	//Getters & Setters
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}



	
	//toString
		@Override
	public String toString() {
		return "Wheel [radius=" + radius + "]";
	}
	
	
	
	
	
	
}
