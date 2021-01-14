package week9.lab1;

public class Car extends RoadVehicle{ // class Car is a subclass of RoadVehicle
	private String carType; //variable only specific to Car.java class
 
	public Car() {
	 	this("", 0, 0);
	 	}
 
	public Car(String c, int w, int p) { 
		super(w, p);
		setType(c);
	}
 
	public void setType(String t)  {
		carType = t;
	}
 
	public String getType() {
		return carType;
	}

	//Overridden Methods
		@Override
	public double calculateDuty() {
		return ImportDuty.CARTAXRATE;
	}
	//toString
		@Override
		public String toString() {
			return "Car [carType=" + carType + ", calculateDuty()=" + calculateDuty() + "]";
		}
	


	
	
	
	
}//end class