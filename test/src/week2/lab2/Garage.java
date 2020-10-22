package week2.lab2;

import java.util.Scanner;

public class Garage {

	public static void main(String[] args) {
		 
		
		int choice=0;
		int carTotal=0;
		Car[] cars = new Car[10];
		
		while(choice !=4) {

		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a choice:");
		System.out.println("1.List all cars");
		System.out.println("2.Enter a car for sale");
		System.out.println("3.List all cars being sold");
		System.out.println("4.Exit");
		
		choice = in.nextInt();
		
		if(choice == 1) {
			for(Car c: cars) {
				if (c != null)
				System.out.println(c.toString() );
				}		
		}
		
		else if (choice == 2){
			if (carTotal <9) {
			Scanner incar = new Scanner(System.in);
			String make;
			String model;
			double engineSize;
			double price;
			
			System.out.println("Enter car make");
			make = incar.nextLine();
			
			System.out.println("Enter car model");
			model = incar.nextLine();
			
			System.out.println("Enter car engine size");
			engineSize = incar.nextDouble();
			
			System.out.println("Enter car price");
			price = incar.nextDouble();
			
			Car c = new Car(make,model,engineSize,price);
			
			if(carTotal> 1) {
				c.sellCar();
			}
			
			cars [carTotal] = c;
			carTotal++; //increments loop by 1 until hits 10
		}
			else {
				System.out.println("You have too many cars");
			}
		}
		
		
		else if (choice == 3){
			for (Car c: cars)
				if (c != null) {
					if (c.isSold())
						System.out.println(c.toString());
				}
		}
		
		
		else if (choice == 4){
		System.out.println("Goodbye");
		System.exit(0);
		}
		
		}//end while
		
	} //end main

}//end class
