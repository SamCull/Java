package week6.lab2;

public class CarTest{
	
	public static void main(String args[]){
		
		
		Car car1 = new Car(); //to be able to assign car1 the below values
		car1.setWheels(4);
		car1.setPass(5);
		car1.setType("Saloon");
		
		
		Car car2 = new Car();
		car2.setWheels(4);
		car2.setPass(7);
		car2.setType("People Carrier");
		
		
		Hgv h = new Hgv(3200,18,2);
		
		
		//array to call all vehicles
		RoadVehicle[] rv = new RoadVehicle[3]; 
		rv[0]=car1;
		rv[1]=car2;
		rv[2]=h;
		
		for(RoadVehicle r: rv)
			System.out.println(r);
		
		 
	}
}
