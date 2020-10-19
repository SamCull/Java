package week2.lab2;

public class HotelRoom {

	
	//Variables
	private int roomNumber;
	private String roomType;
	private boolean vacant;
	private double rate;
	
	
	
	
	//Constructors
		public HotelRoom() {
			setRoomNumber(0);
			setRoomType("");
			setVacant(vacant);
			setRate(0);
			}
		
	public HotelRoom(int roomNumber, String roomType) {
		setRoomNumber(roomNumber);
		setRoomType(roomType);
	}
	
	public HotelRoom(int roomNumber, String roomType, boolean vacant, double rate) {
		super();
		setRoomNumber(roomNumber);
		setRoomType(roomType);
		setVacant(vacant);
		setRate(rate);
	}

	

	
	
	//Getters & Setters
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public boolean getVacant() {
		return vacant;
	}

	public void setVacant(boolean vacant) {
		this.vacant = vacant;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	
	

		//toString
		@Override
	public String toString() {
		return "HotelRoom [roomNumber=" + roomNumber + ", roomType=" + roomType + ", vacant=" + vacant + ", rate="
				+ rate + "]";
	}
		
	public void isOccupied() {
		if(vacant) {
			System.out.println("The room is occupied");
			}
		else {
			setVacant(true);
			System.out.println("The room is now occupied by you");
		}
	}
		
}