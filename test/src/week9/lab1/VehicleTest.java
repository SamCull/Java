package week9.lab1;

public class VehicleTest {

	public static void main(String[] args) {
		
		//fill in constructor info (e.g. car has String type,passengers and wheels)
		//Caps sens
		Car c = new Car("Saloon",4,4);
		Hgv h = new Hgv(3200,8,2);
		
		
		//array calling overridden methods
		RoadVehicle[] rv = new RoadVehicle[2];
		rv[0] = c;
		rv[1] = h;
		
		for(RoadVehicle r: rv)
			System.out.println(r);
		
		
		
		
	}

}
