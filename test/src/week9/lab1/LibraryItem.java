package week9.lab1;

	public abstract class LibraryItem implements LoanItem {
	

	//Variables
		private String type;
		private String ID;
	
	//Overridden Getters & Setters
		@Override
	public double calculatePrice() {
		return 0;
	}

}
