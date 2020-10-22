package week2.lab2;

public class Car {

	//Variables
	private String make;
	private String model;
	private double engineSize;
	private double price;
	private boolean sold;

	
	
	
	//Constructors
	public Car() {
		setMake("");
		setModel("");
		setEngineSize(0.0);
		setPrice(0.0);
	}
	
	public Car(String make, String model, double engineSize, double price) {
		setMake(make);
		setModel(model);
		setEngineSize(engineSize);
		setPrice(price);
	}
	
	
	public Car(String make, String model, double engineSize) {
		setMake(make);
		setModel(model);
		setEngineSize(engineSize);
	}



	//Getters & Setters
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isSold() {
		return sold;
	}
	public void sellCar() {
		if(sold) {
			System.out.println("This car has already been sold");
		}
		else {
			this.sold = true; //pay attention how this works
			System.out.println("This car has been sold to you");
		}
	}
	
	
	
	//NoString
		@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", engineSize=" + engineSize + ", price=" + price + ", sold="
				+ sold + "]";
		}
	
}
