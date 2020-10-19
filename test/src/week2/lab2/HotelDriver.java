package week2.lab2;

public class HotelDriver {

	public static void main(String[] args) {
		
		HotelRoom[] rooms = new HotelRoom[3];

		HotelRoom roomA = new  HotelRoom();
		
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		
		
		HotelRoom roomB = new HotelRoom(201, "Double");
		
		
		roomA.setVacant(true);
		roomA.setRate(100);
		
		roomB.setVacant(false);
		roomB.setRate(80);
		
		HotelRoom roomC = new HotelRoom(202, "Single", false, 90);
		
		rooms[0] = roomA;
		rooms[1] = roomB;
		rooms[2] = roomC;
		
		for(HotelRoom h: rooms) { //for int x = 0; x<10; x++) x.toString
			if (h != null)
			System.out.println("Room: " + h.toString());	
		}
		
		rooms[1].isOccupied();
		System.out.println("Room: " + rooms[1].toString());
		
	} //end main
}
