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
	public void setSold(boolean sold) {
		this.sold = sold;
	}
	
	
	
	//NoString
	
	
	
}
