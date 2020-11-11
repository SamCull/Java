package week4.lab2;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		
		Item[] Items = new Item[3]; //store items in here 
		
		for(int x = 0; x <=2;x++) {//loops 3 times, starts at 0
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter name: ");
			String name = in.nextLine();
			
			System.out.println("Enter type: ");
			String type = in.nextLine();
			
			System.out.println("Enter date: ");
			String date = in.nextLine();
			
			System.out.println("Enter price: ");
			double price = in.nextDouble();
			
			System.out.println("Enter status (A/S): ");
			char status = in.next().charAt(0);
			
			Item i = new Item(name, type, date, price, status);
			
			if(x==1) i.statusUpdate(); //invoke status method for one item to show sold
			
			Items[x]=i; //x is from for loop, i is from above
			 
			System.out.println("No. of items created: " + Item.getNoOfSalesItems());
		
		}//end for loop
		
		for(Item i: Items)System.out.println(i); 
			
		

	}//end main

}//end class
