package week4.lab2;

public class Item {

	
	//Variables
	private int ItemID;
	private static int nextItemID = 0; //"this should be a unique identifier"
	private String name;
	private String type;
	private String date;
	private char status;
	private double price;
	private static int noOfSalesItems=0;

	
	


	//Constructors	
		public Item(String name, String type, String date, double price, char status) {
		++nextItemID; //increments ItemID and puts it back as 1 extra
		setItemID(nextItemID);
		setName(name);
		setType(type);
		setManufactureDate(date);
		setPrice(price);
		setStatus(status); //"status field should be A for unavailable"
		noOfSalesItems++; //increments by 1
		}
	
	
	
	//Getters & Setters
	public int getItemID() {
		return ItemID;
	}
	public void setItemID(int itemID) {
		ItemID = itemID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setManufactureDate(String date) {
		this.date = date;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static int getNoOfSalesItems() {
		return noOfSalesItems;
	}
	
	//Misc Methods
	//"create a class method SU which sets item for 'S' when sold"
	public void statusUpdate() {
		setStatus('S');
	}
	
	
	//toString
		@Override
	public String toString() { 
			if(status == 'A') {
				
		return "Item [ItemID=" + ItemID + ", name=" + name + ", type=" + type + ", date=" + date
				+ ", status=" + status + ", price=" + price + "]";
			}
	
		else { //if item is sold, don't print out price
			return "Item [ItemID=" + ItemID + ", name=" + name + ", type=" + type + ", date=" + date
			+ ", status=" + status + "]";
	}
		}
}
