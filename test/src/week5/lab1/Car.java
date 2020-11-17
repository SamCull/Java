package week5.lab1;

import java.util.Arrays;

public class Car {

	//Variables
	private String registrationNumber;
	private Wheel[] wheels = new Wheel[4]; //faster way of writing all wheels as data types

	
	
	//Constructors
		public Car(String registrationNumber) {
			setRegistrationNumber(registrationNumber);
			
			for(int i=0;i<= wheels.length-1;i++) {
				Wheel wheel = new Wheel(+1);
					wheels[i] = wheel;
			}
			 //wheel1 = 0
			 //wheel2 = 1
			 //wheel3 = 2
			 //wheel4 = 3
	}
	
		
	
	//Getters & Setters
		public String getRegistrationNumber() {
		return registrationNumber;
	}
		
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}


	//toString
	@Override
	public String toString() {
		return "Car [registrationNumber=" + registrationNumber + ", wheels=" + Arrays.toString(wheels) + "]";
	}


	
	
	
}
