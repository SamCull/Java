package week9.lab1;

public class LibraryPOS {

	public static void main(String[] args) {

		//calling classes book, cd and LibraryItem for array
		Book b = new Book("Pearson","Java programming",200);
		CD c = new CD("Faithless","faithless 2.0", 12);
		
		LibraryItem[] items = new LibraryItem[2]; 
		items[0] = b;
		items[1] = c;
		
		
		for(LibraryItem i: items)
			System.out.println(i);
	
	
		double totalLoanPrice = 0;
		
		for(LibraryItem x: items) totalLoanPrice+=x.calculatePrice();
		System.out.println("Total price " +  totalLoanPrice);
		
		
	}

}
