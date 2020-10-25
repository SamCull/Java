package week3.lab2;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		
		Book[] books = new Book[3];

	for(int i=0; i<3; i++) { //when input is 0 and isn't 3, repeat below
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name for Book: " + (i+1));
		String name = in.nextLine(); //Users input will be temp stored (name) here
		
		System.out.println("Enter author of Book: " + (i+1));
		String author = in.nextLine();
		
		System.out.println("Enter genre of Book: " + (i+1));
		String genre = in.nextLine();
		
		Book b = new Book(name,author,genre);
		
		System.out.println("Number of books created: " + Book.getNoOfBooks());
		 
		books[i] = b; 
		
		if(i == 1) {
			b.Borrow(); //makes second input from user 'B' (0 is first choice, 1 is second)
		}
	  }//end of Scanner for loop
	
	for(Book b: books) {
		if(b != null)
		System.out.println(b);
	}
		
	}//end main

}//end class 
