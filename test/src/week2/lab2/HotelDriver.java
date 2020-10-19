package week2.lab2;

public class HotelDriver {

	public static void main(String[] args) {

		HotelRoom roomA = new  HotelRoom();
		
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		
		
		HotelRoom roomB = new HotelRoom(201, "Double");
		
		System.out.println("RoomNo. : " + roomA.getRoomNumber() + "\t" + "RoomType: " + roomA.getRoomType());
		
		System.out.println("RoomNo. : " + roomB.getRoomNumber() + "\t" + "RoomType: " + roomB.getRoomType());
		
		
		
		
		
		
	}

}
